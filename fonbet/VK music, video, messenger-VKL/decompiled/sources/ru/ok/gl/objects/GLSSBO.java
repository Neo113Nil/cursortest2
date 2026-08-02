package ru.ok.gl.objects;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLES31;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import xsna.i5s;

/* loaded from: classes9.dex */
public class GLSSBO {
    private int bufferId;
    private int bufferSize;
    private GLComputerProgram copyBufferToTexture;
    private int bindIndex = 0;
    private String textureTypeStr = "rgba8";
    private String FLOAT_BUFFER_TO_TEXTURE = i5s.a(new StringBuilder("#version 310 es\nprecision mediump image2D;\nlayout(local_size_x = 8, local_size_y = 8) in;\nlayout(std430) buffer;\nlayout(binding = 1) readonly buffer Input0  { float elements[]; } input_data;\nlayout("), this.textureTypeStr, ", binding=0) uniform writeonly image2D outputTexture;\nuniform int width;\nuniform int height;\nuniform int channel0Index;\nuniform int channel1Index;\nuniform int channel2Index;\nuniform int channel3Index;\nuniform int channelNumber;\nvoid main() \n{\nivec2 gid = ivec2(gl_GlobalInvocationID.xy);\nif (gid.x >= width || gid.y >= height) return;\nint linear_index_in  = (gid.y * width + gid.x) * channelNumber;\nvec4 colorBytes = vec4(input_data.elements[linear_index_in + channel0Index], input_data.elements[linear_index_in + channel1Index], input_data.elements[linear_index_in + channel2Index], input_data.elements[linear_index_in + channel3Index]);\nimageStore(outputTexture, gid, colorBytes);\n}\n");

    public GLSSBO(int i) {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(37074, iArr[0]);
        this.bufferId = iArr[0];
        this.bufferSize = i;
        GLES20.glBufferData(37074, i, null, 35042);
        GLES30.glBindBufferBase(37074, 1, iArr[0]);
        GLES20.glBindBuffer(37074, 0);
        GlUtil.checkGlError("create GL_SHADER_STORAGE_BUFFER");
    }

    public void bind(int i) {
        this.bindIndex = i;
        GLES30.glBindBufferRange(37074, i, this.bufferId, 0, this.bufferSize);
    }

    public void clearZero(GLComputerProgram gLComputerProgram) {
        gLComputerProgram.useProgram();
        bind(1);
        GLES31.glDispatchCompute(getBufferSize() / 64, 1, 1);
        unbind();
    }

    public boolean copyDataTo(FloatBuffer floatBuffer) {
        if (this.bufferId == 0 || this.bufferSize == 0 || floatBuffer.capacity() != this.bufferSize / 4) {
            return false;
        }
        GLES20.glBindBuffer(37074, this.bufferId);
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(37074, 0, this.bufferSize, 1);
        if (byteBuffer == null) {
            GlUtil.checkGlError("glMapBufferRange");
            return false;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        floatBuffer.rewind();
        floatBuffer.put(byteBuffer.asFloatBuffer());
        floatBuffer.rewind();
        GLES30.glUnmapBuffer(37074);
        GLES20.glBindBuffer(37074, 0);
        GlUtil.checkGlError("copyDataTo");
        return true;
    }

    public boolean copyDataToTexture(Texture2D texture2D, int i, int[] iArr) {
        if (this.bufferId == 0 || this.bufferSize == 0 || texture2D == null || texture2D.getTextureId() == 0 || iArr.length < 4) {
            return false;
        }
        int width = texture2D.getWidth();
        int height = texture2D.getHeight();
        if (width * height * 4 * i != this.bufferSize) {
            return false;
        }
        if (this.copyBufferToTexture == null) {
            this.textureTypeStr = texture2D.getShaderFormat();
            GLComputerProgram gLComputerProgram = new GLComputerProgram(this.FLOAT_BUFFER_TO_TEXTURE);
            this.copyBufferToTexture = gLComputerProgram;
            gLComputerProgram.useProgram();
            this.copyBufferToTexture.setIntUniform("width", width);
            this.copyBufferToTexture.setIntUniform("height", height);
            this.copyBufferToTexture.setIntUniform("channelNumber", i);
            this.copyBufferToTexture.setIntUniform("channel0Index", iArr[0]);
            this.copyBufferToTexture.setIntUniform("channel1Index", iArr[1]);
            this.copyBufferToTexture.setIntUniform("channel2Index", iArr[2]);
            this.copyBufferToTexture.setIntUniform("channel3Index", iArr[3]);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, texture2D.getTextureId());
        this.copyBufferToTexture.useProgram();
        bind(1);
        GLES31.glBindImageTexture(0, texture2D.getTextureId(), 0, false, 0, 35001, texture2D.getFormat());
        GLES31.glDispatchCompute(width / 8, height / 8, 1);
        this.copyBufferToTexture.resetProgram();
        unbind();
        GlUtil.checkGlError("copyDataToTexture");
        return true;
    }

    public void copyTextureToBufferWithShader(int i, int i2, int i3) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        bind(1);
        GLES31.glDispatchCompute(i2 / 8, i3 / 8, 1);
        unbind();
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkGlError("copyTextureToBufferWithShader");
    }

    public Bitmap getBitmapFromBuffer(int i, int i2, int i3) {
        throw new RuntimeException("This method should be called only for debug");
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public int getId() {
        return this.bufferId;
    }

    public void release() {
        int i = this.bufferId;
        if (i != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i}, 0);
            this.bufferId = 0;
            this.bufferSize = 0;
        }
        GLComputerProgram gLComputerProgram = this.copyBufferToTexture;
        if (gLComputerProgram != null) {
            gLComputerProgram.release();
        }
    }

    public void unbind() {
        int i = this.bindIndex;
        if (i > 0) {
            GLES30.glBindBufferRange(37074, i, 0, 0, 0);
            this.bindIndex = 0;
        }
    }

    public boolean copyDataTo(byte[] bArr) {
        int i;
        int i2 = this.bufferId;
        if (i2 == 0 || (i = this.bufferSize) == 0 || bArr.length != i) {
            return false;
        }
        GLES20.glBindBuffer(37074, i2);
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(37074, 0, this.bufferSize, 1);
        if (byteBuffer == null) {
            GlUtil.checkGlError("glMapBufferRange");
            return false;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.get(bArr);
        GLES30.glUnmapBuffer(37074);
        GLES20.glBindBuffer(37074, 0);
        GlUtil.checkGlError("copyDataTo");
        return true;
    }

    public boolean copyDataTo(int[] iArr) {
        int i;
        int i2 = this.bufferId;
        if (i2 == 0 || (i = this.bufferSize) == 0 || iArr.length != i / 4) {
            return false;
        }
        GLES20.glBindBuffer(37074, i2);
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(37074, 0, this.bufferSize, 1);
        if (byteBuffer == null) {
            GlUtil.checkGlError("glMapBufferRange");
            return false;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.asIntBuffer().get(iArr);
        GLES30.glUnmapBuffer(37074);
        GLES20.glBindBuffer(37074, 0);
        GlUtil.checkGlError("copyDataTo");
        return true;
    }

    public boolean copyDataTo(GLSSBO glssbo) {
        if (glssbo.getBufferSize() != getBufferSize()) {
            return false;
        }
        GLES20.glBindBuffer(36662, getId());
        GLES20.glBindBuffer(36663, glssbo.getId());
        GLES30.glCopyBufferSubData(36662, 36663, 0, 0, glssbo.getBufferSize());
        GlUtil.checkGlError("copy SSBO");
        GLES20.glBindBuffer(36662, 0);
        GLES20.glBindBuffer(36663, 0);
        return true;
    }
}

package ru.ok.gl.objects;

import android.opengl.GLES20;
import xsna.lhg;

/* loaded from: classes9.dex */
public class FrameBuffer {
    private int[] fboIds;
    private int height;
    private int[] rbIds;
    private int[] texIds;
    private int width;

    public FrameBuffer(int i, int i2) {
        this(createTexture(i, i2), i, i2);
    }

    private void checkFramebufferStatus() {
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            return;
        }
        release();
        throw new RuntimeException(lhg.a(glCheckFramebufferStatus, "Framebuffer incomplete: error="));
    }

    private static int createTexture(int i, int i2) {
        int i3 = GlUtil.createTextures(1)[0];
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GlUtil.checkGlError("glTexImage2D");
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkGlError("glBindTexture");
        return i3;
    }

    private void init(int i, int i2) {
        this.width = i;
        this.height = i2;
        GLES20.glGenFramebuffers(1, this.fboIds, 0);
        GlUtil.checkGlError("glGenFramebuffers");
        GLES20.glBindFramebuffer(36160, this.fboIds[0]);
        GlUtil.checkGlError("glBindFramebuffer");
        GLES20.glGenRenderbuffers(1, this.rbIds, 0);
        GlUtil.checkGlError("glGenRenderbuffers");
        GLES20.glBindRenderbuffer(36161, this.rbIds[0]);
        GlUtil.checkGlError("glBindRenderbuffer");
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GlUtil.checkGlError("glRenderbufferStorage");
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.rbIds[0]);
        GlUtil.checkGlError("glFramebufferRenderbuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texIds[0], 0);
        GlUtil.checkGlError("glFramebufferTexture2D");
        checkFramebufferStatus();
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkGlError("glBindFramebuffer");
    }

    public void attachTexture() {
        if (this.texIds[0] == 0) {
            return;
        }
        bind();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texIds[0], 0);
        unbind();
    }

    public void bind(boolean z) {
        GLES20.glBindFramebuffer(36160, this.fboIds[0]);
        GlUtil.checkGlError("glBindFramebuffer");
        if (z) {
            GLES20.glViewport(0, 0, this.width, this.height);
        }
    }

    public void detachTexture() {
        if (this.texIds[0] == 0) {
            return;
        }
        bind();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        unbind();
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.texIds[0];
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        GLES20.glDeleteFramebuffers(1, this.fboIds, 0);
        GLES20.glDeleteTextures(1, this.texIds, 0);
        GLES20.glDeleteRenderbuffers(1, this.rbIds, 0);
    }

    public void render(GLProgram gLProgram, Runnable runnable) {
        bind(true);
        runnable.run();
        gLProgram.render();
        unbind();
    }

    public void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkGlError("glUnBindFramebuffer");
    }

    public FrameBuffer(int i, int i2, int i3) {
        this.fboIds = new int[1];
        this.texIds = new int[]{i};
        this.rbIds = new int[1];
        init(i2, i3);
    }

    public void bind() {
        bind(false);
    }
}

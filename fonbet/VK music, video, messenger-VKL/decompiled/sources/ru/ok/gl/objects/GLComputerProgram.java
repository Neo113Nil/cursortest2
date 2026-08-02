package ru.ok.gl.objects;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class GLComputerProgram {
    public static final String CLEAR_BUFFER_ZERO = "#version 310 es\nlayout(local_size_x = 64) in;\nlayout(std430) buffer;\nlayout(binding = 1) buffer Output { float elements[]; } output_data;\nvoid main() \n{\noutput_data.elements[gl_GlobalInvocationID.x] = 0.0;\n}\n";
    private static final String LOG_TAG = "GLComputerProgram";
    public static final String TEXTURE_TO_BUFFER_3CHANNELS = "#version 310 es\nlayout(local_size_x = 8, local_size_y = 8) in;\nlayout(binding = 0) uniform sampler2D u_Texture0;\nlayout(std430) buffer;\nlayout(binding = 1) buffer Output { float elements[]; } output_data;\nuniform int u_width;\nuniform int u_height;\nuniform float f_valueFactor;\nuniform float f_valueOffset;\nvoid main() \n{\nivec2 gid = ivec2(gl_GlobalInvocationID.xy);\nif (gid.x >= u_width || gid.y >= u_height) return;\nvec3 pixel = texelFetch(u_Texture0, gid, 0).xyz;\nint linear_index = 3 * (gid.y * u_width + gid.x);\nvec3 out_value = pixel * vec3(f_valueFactor) + vec3(f_valueOffset);\noutput_data.elements[linear_index + 0] = out_value.x;\noutput_data.elements[linear_index + 1] = out_value.y;\noutput_data.elements[linear_index + 2] = out_value.z;\n}\n";
    private int programId;

    public GLComputerProgram(@NonNull String str) {
        this.programId = 0;
        this.programId = GLES20.glCreateProgram();
        GlUtil.checkGlError("glCreateProgram");
        int loadShader = GlUtil.loadShader(37305, str);
        if (loadShader == 0) {
            throw new RuntimeException("Failed to load computer shader");
        }
        GLES20.glAttachShader(this.programId, loadShader);
        GlUtil.checkGlError("glAttachShader");
        GLES20.glDeleteShader(loadShader);
        GlUtil.checkGlError("glDeleteShader");
        GLES20.glLinkProgram(this.programId);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.programId, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return;
        }
        Log.e(LOG_TAG, "Could not link program: ");
        Log.e(LOG_TAG, GLES20.glGetProgramInfoLog(this.programId));
        GLES20.glDeleteProgram(this.programId);
        throw new RuntimeException("create program failed");
    }

    public void release() {
        resetProgram();
        GLES20.glDeleteProgram(this.programId);
    }

    public void resetProgram() {
        GLES20.glUseProgram(0);
    }

    public void setFloatUniform(String str, float f) {
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.programId, str), f);
        GlUtil.checkGlError("setFloatUniform");
    }

    public void setIntUniform(String str, int i) {
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.programId, str), i);
        GlUtil.checkGlError("setIntUniform " + str);
    }

    public void useProgram() {
        GLES20.glUseProgram(this.programId);
        GlUtil.checkGlError("useProgram");
    }
}

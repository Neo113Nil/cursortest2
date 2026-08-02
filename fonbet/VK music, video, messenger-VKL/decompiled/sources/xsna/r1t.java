package xsna;

import android.opengl.GLES20;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.nio.IntBuffer;
import one.video.gl.GLESUtils;

/* compiled from: GLFrameBuffer.kt */
/* loaded from: classes8.dex */
public final class r1t {
    public final int a;
    public final int b;

    public r1t(int i, int i2) {
        String str;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLESUtils.c("glGenTextures", new int[0]);
        int i3 = iArr[0];
        GLESUtils.b(3553, i3);
        GLESUtils.e(3553);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLESUtils.c("glTexImage2D", new int[0]);
        GLESUtils.b(3553, 0);
        this.a = i3;
        IntBuffer allocate = IntBuffer.allocate(1);
        GLES20.glGenFramebuffers(1, allocate);
        GLESUtils.c("glGenFramebuffers", new int[0]);
        int i4 = allocate.get(0);
        this.b = i4;
        GLESUtils.a(i4);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
        GLESUtils.c("glFramebufferTexture2D", new int[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLESUtils.a(0);
            return;
        }
        switch (glCheckFramebufferStatus) {
            case 36054:
                str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                break;
            case 36055:
                str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                break;
            case 36057:
                str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                break;
            case 36061:
                str = "GL_FRAMEBUFFER_UNSUPPORTED";
                break;
            default:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
        }
        throw new RuntimeException(pzl.b(str, ": 0x", Integer.toHexString(glCheckFramebufferStatus)));
    }

    public final void a() {
        GLES20.glDeleteFramebuffers(1, new int[]{this.b}, 0);
        GLESUtils.c("glDeleteFramebuffers", new int[0]);
        GLES20.glDeleteTextures(1, new int[]{this.a}, 0);
        GLESUtils.c("glDeleteTextures", new int[0]);
    }
}

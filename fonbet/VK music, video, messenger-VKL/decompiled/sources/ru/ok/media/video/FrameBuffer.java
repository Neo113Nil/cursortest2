package ru.ok.media.video;

import android.opengl.GLES20;
import java.nio.IntBuffer;
import xsna.lhg;
import xsna.v0u;

/* loaded from: classes9.dex */
public class FrameBuffer {
    private static final String TAG = "ru.ok.media.video.FrameBuffer";
    private int fboId;
    private final int height;
    private int rbId;
    private int texId;
    private final int width;

    public FrameBuffer(int i, int i2, boolean z) {
        this.fboId = -1;
        this.texId = -1;
        this.rbId = -1;
        GLES20.glGetError();
        this.width = i;
        this.height = i2;
        IntBuffer allocate = IntBuffer.allocate(1);
        GLES20.glGenFramebuffers(1, allocate);
        v0u.a("glGenFramebuffers");
        this.fboId = allocate.get(0);
        this.texId = createTexture(i, i2, z);
        GLES20.glBindFramebuffer(36160, this.fboId);
        v0u.a("glBindFramebuffer");
        IntBuffer allocate2 = IntBuffer.allocate(1);
        GLES20.glGenRenderbuffers(1, allocate2);
        v0u.a("glGenRenderbuffers");
        int i3 = allocate2.get(0);
        this.rbId = i3;
        GLES20.glBindRenderbuffer(36161, i3);
        v0u.a("glBindRenderbuffer");
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        v0u.a("glRenderbufferStorage");
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.rbId);
        v0u.a("glFramebufferRenderbuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texId, 0);
        v0u.a("glFramebufferTexture2D");
        checkFramebufferStatus();
        GLES20.glBindFramebuffer(36160, 0);
        v0u.a("glBindFramebuffer");
    }

    private void checkFramebufferStatus() {
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            return;
        }
        release();
        throw new RuntimeException(lhg.a(glCheckFramebufferStatus, "Framebuffer incomplete: error="));
    }

    private int createTexture(int i, int i2, boolean z) {
        IntBuffer allocate = IntBuffer.allocate(1);
        GLES20.glGenTextures(1, allocate);
        v0u.a("glGenTextures");
        int i3 = allocate.get(0);
        GLES20.glBindTexture(3553, i3);
        v0u.a("glBindTexture");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10242, z ? 33071 : 10497);
        GLES20.glTexParameteri(3553, 10243, z ? 33071 : 10497);
        v0u.a("glTexParameteri");
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        v0u.a("glTexImage2D");
        GLES20.glBindTexture(3553, 0);
        v0u.a("glBindTexture");
        return i3;
    }

    public void bind() {
        GLES20.glBindFramebuffer(36160, this.fboId);
        v0u.a("glBindFramebuffer");
    }

    public int getHeight() {
        return this.height;
    }

    public int getTexId() {
        return this.texId;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        IntBuffer allocate = IntBuffer.allocate(1);
        int i = this.fboId;
        if (i != -1) {
            allocate.put(0, i);
            GLES20.glDeleteFramebuffers(1, allocate);
            this.fboId = -1;
        }
        int i2 = this.texId;
        if (i2 != -1) {
            allocate.put(0, i2);
            GLES20.glDeleteTextures(1, allocate);
            this.texId = -1;
        }
        int i3 = this.rbId;
        if (i3 != -1) {
            allocate.put(0, i3);
            GLES20.glDeleteRenderbuffers(1, allocate);
            this.rbId = -1;
        }
    }

    public void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
        v0u.a("glBindFramebuffer");
    }
}

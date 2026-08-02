package defpackage;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$Target;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$WrapMode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class hsu0 implements Closeable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object w;
    public int x;
    public int y;

    public hsu0() {
        this.a = 2;
        int[] iArr = {0};
        this.b = iArr;
        Texture$Target texture$Target = Texture$Target.TEXTURE_2D;
        Texture$WrapMode texture$WrapMode = Texture$WrapMode.CLAMP_TO_EDGE;
        uxj uxjVar = new uxj(texture$Target, texture$WrapMode, false);
        this.c = uxjVar;
        uxj uxjVar2 = new uxj(texture$Target, texture$WrapMode, false);
        int[] iArr2 = (int[]) uxjVar2.c;
        this.w = uxjVar2;
        this.x = -1;
        this.y = -1;
        try {
            GLES20.glBindTexture(3553, iArr2[0]);
            pva1.i("Failed to bind depth texture", "glBindTexture");
            GLES20.glTexParameteri(3553, 34892, 0);
            pva1.i("Failed to set texture parameter", "glTexParameteri");
            GLES20.glTexParameteri(3553, 10241, 9728);
            pva1.i("Failed to set texture parameter", "glTexParameteri");
            GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9728);
            pva1.i("Failed to set texture parameter", "glTexParameteri");
            d(1, 1);
            GLES20.glGenFramebuffers(1, iArr, 0);
            pva1.i("Framebuffer creation failed", "glGenFramebuffers");
            GLES20.glBindFramebuffer(36160, iArr[0]);
            pva1.i("Failed to bind framebuffer", "glBindFramebuffer");
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, ((int[]) uxjVar.c)[0], 0);
            pva1.i("Failed to bind color texture to framebuffer", "glFramebufferTexture2D");
            GLES20.glFramebufferTexture2D(36160, 36096, 3553, iArr2[0], 0);
            pva1.i("Failed to bind depth texture to framebuffer", "glFramebufferTexture2D");
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                return;
            }
            throw new IllegalStateException(("Framebuffer construction not complete: code " + glCheckFramebufferStatus).toString());
        } catch (Throwable th) {
            close();
            throw th;
        }
    }

    public boolean a() {
        return this.y == -1;
    }

    public String c() {
        String gsu0Var;
        int i;
        String gsu0Var2;
        int i2;
        switch (this.a) {
            case 0:
                synchronized (((FileInputStream) this.b)) {
                    try {
                        byte[] bArr = (byte[]) this.w;
                        if (bArr == null) {
                            throw new IOException("LineReader is closed");
                        }
                        if (this.x >= this.y) {
                            int read = ((FileInputStream) this.b).read(bArr, 0, bArr.length);
                            if (read == -1) {
                                throw new EOFException();
                            }
                            this.x = 0;
                            this.y = read;
                        }
                        int i3 = this.x;
                        while (true) {
                            if (i3 != this.y) {
                                byte[] bArr2 = (byte[]) this.w;
                                if (bArr2[i3] == 10) {
                                    int i4 = this.x;
                                    if (i3 != i4) {
                                        i = i3 - 1;
                                        if (bArr2[i] == 13) {
                                            gsu0Var = new String(bArr2, i4, i - i4, ((Charset) this.c).name());
                                            this.x = i3 + 1;
                                        }
                                    }
                                    i = i3;
                                    gsu0Var = new String(bArr2, i4, i - i4, ((Charset) this.c).name());
                                    this.x = i3 + 1;
                                } else {
                                    i3++;
                                }
                            } else {
                                gsu0 gsu0Var3 = new gsu0(this, (this.y - this.x) + 80, 0);
                                while (true) {
                                    byte[] bArr3 = (byte[]) this.w;
                                    int i5 = this.x;
                                    gsu0Var3.write(bArr3, i5, this.y - i5);
                                    this.y = -1;
                                    FileInputStream fileInputStream = (FileInputStream) this.b;
                                    byte[] bArr4 = (byte[]) this.w;
                                    int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                                    if (read2 == -1) {
                                        throw new EOFException();
                                    }
                                    this.x = 0;
                                    this.y = read2;
                                    for (int i6 = 0; i6 != this.y; i6++) {
                                        byte[] bArr5 = (byte[]) this.w;
                                        if (bArr5[i6] == 10) {
                                            int i7 = this.x;
                                            if (i6 != i7) {
                                                gsu0Var3.write(bArr5, i7, i6 - i7);
                                            }
                                            this.x = i6 + 1;
                                            gsu0Var = gsu0Var3.toString();
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                return gsu0Var;
            default:
                synchronized (((FileInputStream) this.b)) {
                    try {
                        byte[] bArr6 = (byte[]) this.w;
                        if (bArr6 == null) {
                            throw new IOException("LineReader is closed");
                        }
                        if (this.x >= this.y) {
                            int read3 = ((FileInputStream) this.b).read(bArr6, 0, bArr6.length);
                            if (read3 == -1) {
                                throw new EOFException();
                            }
                            this.x = 0;
                            this.y = read3;
                        }
                        int i8 = this.x;
                        while (true) {
                            if (i8 != this.y) {
                                byte[] bArr7 = (byte[]) this.w;
                                if (bArr7[i8] == 10) {
                                    int i9 = this.x;
                                    if (i8 != i9) {
                                        i2 = i8 - 1;
                                        if (bArr7[i2] == 13) {
                                            gsu0Var2 = new String(bArr7, i9, i2 - i9, ((Charset) this.c).name());
                                            this.x = i8 + 1;
                                        }
                                    }
                                    i2 = i8;
                                    gsu0Var2 = new String(bArr7, i9, i2 - i9, ((Charset) this.c).name());
                                    this.x = i8 + 1;
                                } else {
                                    i8++;
                                }
                            } else {
                                gsu0 gsu0Var4 = new gsu0(this, (this.y - this.x) + 80, 1);
                                while (true) {
                                    byte[] bArr8 = (byte[]) this.w;
                                    int i10 = this.x;
                                    gsu0Var4.write(bArr8, i10, this.y - i10);
                                    this.y = -1;
                                    FileInputStream fileInputStream2 = (FileInputStream) this.b;
                                    byte[] bArr9 = (byte[]) this.w;
                                    int read4 = fileInputStream2.read(bArr9, 0, bArr9.length);
                                    if (read4 == -1) {
                                        throw new EOFException();
                                    }
                                    this.x = 0;
                                    this.y = read4;
                                    for (int i11 = 0; i11 != this.y; i11++) {
                                        byte[] bArr10 = (byte[]) this.w;
                                        if (bArr10[i11] == 10) {
                                            int i12 = this.x;
                                            if (i11 != i12) {
                                                gsu0Var4.write(bArr10, i12, i11 - i12);
                                            }
                                            this.x = i11 + 1;
                                            gsu0Var2 = gsu0Var4.toString();
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                return gsu0Var2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                synchronized (((FileInputStream) this.b)) {
                    try {
                        if (((byte[]) this.w) != null) {
                            this.w = null;
                            ((FileInputStream) this.b).close();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                synchronized (((FileInputStream) this.b)) {
                    try {
                        if (((byte[]) this.w) != null) {
                            this.w = null;
                            ((FileInputStream) this.b).close();
                        }
                    } finally {
                    }
                }
                return;
            default:
                int[] iArr = (int[]) this.b;
                if (iArr[0] != 0) {
                    GLES20.glDeleteFramebuffers(1, iArr, 0);
                    pva1.h("hsu0", "Failed to free framebuffer", "glDeleteFramebuffers");
                    iArr[0] = 0;
                }
                ((uxj) this.c).close();
                ((uxj) this.w).close();
                return;
        }
    }

    public void d(int i, int i2) {
        if (this.x == i && this.y == i2) {
            return;
        }
        this.x = i;
        this.y = i2;
        GLES20.glBindTexture(3553, ((int[]) ((uxj) this.c).c)[0]);
        pva1.i("Failed to bind color texture", "glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        pva1.i("Failed to specify color texture format", "glTexImage2D");
        GLES20.glBindTexture(3553, ((int[]) ((uxj) this.w).c)[0]);
        pva1.i("Failed to bind depth texture", "glBindTexture");
        GLES20.glTexImage2D(3553, 0, 36012, i, i2, 0, 6402, 5126, null);
        pva1.i("Failed to specify depth texture format", "glTexImage2D");
    }

    public hsu0(FileInputStream fileInputStream, Charset charset, int i) {
        this.a = i;
        switch (i) {
            case 1:
                if (charset != null) {
                    if (charset.equals(ow21.a)) {
                        this.b = fileInputStream;
                        this.c = charset;
                        this.w = new byte[8192];
                        return;
                    }
                    ny61.g("Unsupported encoding");
                    throw null;
                }
                throw null;
            default:
                if (charset != null) {
                    if (charset.equals(sw21.a)) {
                        this.b = fileInputStream;
                        this.c = charset;
                        this.w = new byte[8192];
                        return;
                    }
                    ny61.g("Unsupported encoding");
                    throw null;
                }
                throw null;
        }
    }
}

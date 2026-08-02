package xsna;

import android.opengl.GLES20;
import com.vk.media.filters.model.Correction;
import com.vk.media.filters.model.FilterItem;
import com.vk.media.filters.model.Hsl;
import java.nio.IntBuffer;

/* compiled from: ImplFilterDataDrawDelegate.kt */
/* loaded from: classes12.dex */
public final class tpw implements lcr {
    public e0u a;
    public e0u b;
    public kht c;
    public kht d;
    public vgv e;
    public jwj f;
    public pmb g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float[] l;
    public float[] m;
    public float[] n;

    @Override // xsna.lcr
    public final void a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        this.h = i3;
        this.i = i4;
        this.a.a(i3, i4);
        this.b.a(i3, i4);
        this.f.a(i3, i4);
        kht khtVar = this.c;
        khtVar.s = i3;
        khtVar.u = i4;
        kht khtVar2 = this.d;
        khtVar2.s = i3;
        khtVar2.u = i4;
        h0u[] h0uVarArr = (h0u[]) this.g.b;
        int length = h0uVarArr.length;
        int i5 = 0;
        while (i5 < length) {
            h0u h0uVar = h0uVarArr[i5];
            h0uVar.getClass();
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(3379, iArr, 0);
            int i6 = iArr[0];
            if (i3 > i6 || i4 > i6) {
                throw new IllegalArgumentException("GL_MAX_TEXTURE_SIZE " + iArr[0]);
            }
            GLES20.glGetIntegerv(34024, iArr, 0);
            int i7 = iArr[0];
            if (i3 > i7 || i4 > i7) {
                throw new IllegalArgumentException("GL_MAX_RENDERBUFFER_SIZE " + iArr[0]);
            }
            GLES20.glGetIntegerv(36006, iArr, 0);
            int i8 = iArr[0];
            GLES20.glGetIntegerv(36007, iArr, 0);
            int i9 = iArr[0];
            GLES20.glGetIntegerv(32873, iArr, 0);
            int i10 = iArr[0];
            h0uVar.a();
            try {
                GLES20.glGenFramebuffers(1, iArr, 0);
                int i11 = iArr[0];
                h0uVar.a = i11;
                GLES20.glBindFramebuffer(36160, i11);
                GLES20.glGenRenderbuffers(1, iArr, 0);
                int i12 = iArr[0];
                h0uVar.b = i12;
                GLES20.glBindRenderbuffer(36161, i12);
                GLES20.glRenderbufferStorage(36161, 33189, i3, i4);
                GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, h0uVar.b);
                GLES20.glGenTextures(1, iArr, 0);
                int i13 = iArr[0];
                h0uVar.c = i13;
                GLES20.glBindTexture(3553, i13);
                float[] fArr = nap.a;
                GLES20.glTexParameterf(3553, 10240, 9729);
                GLES20.glTexParameterf(3553, 10241, 9728);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                h0u[] h0uVarArr2 = h0uVarArr;
                GLES20.glTexImage2D(3553, 0, 6408, i3, i4, 0, 6408, 5121, null);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, h0uVar.c, 0);
                int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                if (glCheckFramebufferStatus != 36053) {
                    throw new RuntimeException("Failed to initialize framebuffer object " + glCheckFramebufferStatus);
                }
                GLES20.glBindFramebuffer(36160, i8);
                GLES20.glBindRenderbuffer(36161, i9);
                GLES20.glBindTexture(3553, i10);
                i5++;
                i3 = i;
                i4 = i2;
                h0uVarArr = h0uVarArr2;
            } catch (RuntimeException e) {
                h0uVar.a();
                throw e;
            }
        }
    }

    @Override // xsna.lcr
    public final void b(float[] fArr) {
        this.m = fArr;
    }

    @Override // xsna.lcr
    public final void c(float[] fArr) {
        this.l = fArr;
    }

    @Override // xsna.lcr
    public final void d(int i, int i2) {
        this.j = i;
        this.k = i2;
    }

    @Override // xsna.lcr
    public final void e(int i, ocr ocrVar, boolean z) {
        h0u h0uVar;
        h0u h0uVar2;
        float[] fArr = this.n;
        IntBuffer allocate = IntBuffer.allocate(1);
        GLES20.glGetIntegerv(36006, allocate);
        int i2 = allocate.get(0);
        if (ocrVar != null) {
            boolean z2 = ocrVar.e;
            boolean z3 = ocrVar.f;
            boolean z4 = ocrVar.c;
            FilterItem filterItem = ocrVar.a;
            if (!ocrVar.i) {
                h0u g = g();
                f(g);
                e0u e0uVar = z ? this.a : this.b;
                if (e0uVar != null) {
                    float[] fArr2 = this.n;
                    e0uVar.j = fArr2;
                    e0uVar.k = fArr2;
                    e0uVar.n(i);
                    s3q0 s3q0Var = s3q0.a;
                }
                int i3 = g.c;
                h0u h0uVar3 = null;
                if (ocrVar.g) {
                    Hsl hsl = filterItem.e;
                    boolean z5 = z3 || z4;
                    if (z5) {
                        h0uVar2 = g();
                        f(h0uVar2);
                    } else {
                        GLES20.glBindFramebuffer(36160, i2);
                        GLES20.glViewport(0, 0, this.j, this.k);
                        h0uVar2 = null;
                    }
                    if (z5) {
                        vgv vgvVar = this.e;
                        vgvVar.j = fArr;
                        vgvVar.k = fArr;
                    } else {
                        vgv vgvVar2 = this.e;
                        vgvVar2.j = this.l;
                        vgvVar2.k = this.m;
                    }
                    vgv vgvVar3 = this.e;
                    vgvVar3.q = hsl;
                    vgvVar3.n(i3);
                    i3 = h0uVar2 != null ? h0uVar2.c : 0;
                }
                if (z3) {
                    if (ocrVar.d) {
                        float f = filterItem.d.k;
                        boolean z6 = z2 || z4;
                        h0u g2 = g();
                        f(g2);
                        this.d.h(f);
                        this.d.n(i3);
                        int i4 = g2.c;
                        if (z6) {
                            h0uVar = g();
                            f(h0uVar);
                        } else {
                            GLES20.glBindFramebuffer(36160, i2);
                            GLES20.glViewport(0, 0, this.j, this.k);
                            h0uVar = null;
                        }
                        if (z6) {
                            kht khtVar = this.c;
                            khtVar.j = fArr;
                            khtVar.k = fArr;
                        } else {
                            kht khtVar2 = this.c;
                            khtVar2.j = this.l;
                            khtVar2.k = this.m;
                        }
                        this.c.h(f);
                        this.c.n(i4);
                        i3 = h0uVar != null ? h0uVar.c : 0;
                    }
                    if (z2) {
                        Correction correction = filterItem.d;
                        if (z4) {
                            h0uVar3 = g();
                            f(h0uVar3);
                        } else {
                            GLES20.glBindFramebuffer(36160, i2);
                            GLES20.glViewport(0, 0, this.j, this.k);
                        }
                        if (z4) {
                            jwj jwjVar = this.f;
                            jwjVar.j = fArr;
                            jwjVar.k = fArr;
                        } else {
                            jwj jwjVar2 = this.f;
                            jwjVar2.j = this.l;
                            jwjVar2.k = this.m;
                        }
                        jwj jwjVar3 = this.f;
                        jwjVar3.q = correction;
                        jwjVar3.n(i3);
                        i3 = h0uVar3 != null ? h0uVar3.c : 0;
                    }
                }
                if (z4) {
                    GLES20.glBindFramebuffer(36160, i2);
                    GLES20.glViewport(0, 0, this.j, this.k);
                    umv umvVar = ocrVar.b;
                    umvVar.h(filterItem.c);
                    umvVar.c(this.l);
                    umvVar.b(this.m);
                    umvVar.n(i3);
                    return;
                }
                return;
            }
        }
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glViewport(0, 0, this.j, this.k);
        e0u e0uVar2 = z ? this.a : this.b;
        if (e0uVar2 != null) {
            e0uVar2.j = this.l;
            e0uVar2.k = this.m;
            e0uVar2.n(i);
            s3q0 s3q0Var2 = s3q0.a;
        }
    }

    public final void f(h0u h0uVar) {
        GLES20.glBindFramebuffer(36160, h0uVar.a);
        GLES20.glClear(16384);
        GLES20.glViewport(0, 0, this.h, this.i);
    }

    public final h0u g() {
        pmb pmbVar = this.g;
        h0u[] h0uVarArr = (h0u[]) pmbVar.b;
        int i = pmbVar.a;
        h0u h0uVar = h0uVarArr[i];
        pmbVar.a = (i + 1) % h0uVarArr.length;
        return h0uVar;
    }

    @Override // xsna.lcr
    public final void release() {
        e0u e0uVar = this.a;
        if (e0uVar != null) {
            e0uVar.release();
        }
        this.a = null;
        e0u e0uVar2 = this.b;
        if (e0uVar2 != null) {
            e0uVar2.release();
        }
        this.b = null;
        jwj jwjVar = this.f;
        if (jwjVar != null) {
            jwjVar.release();
        }
        this.f = null;
        kht khtVar = this.c;
        if (khtVar != null) {
            khtVar.release();
        }
        this.c = null;
        kht khtVar2 = this.d;
        if (khtVar2 != null) {
            khtVar2.release();
        }
        this.d = null;
        pmb pmbVar = this.g;
        if (pmbVar != null) {
            for (h0u h0uVar : (h0u[]) pmbVar.b) {
                h0uVar.a();
            }
        }
        this.g = null;
    }
}

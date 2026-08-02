package xsna;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayDeque;
import java.util.Iterator;
import xsna.lwx;

/* compiled from: TexturePool.java */
/* loaded from: classes12.dex */
public final class ioo0 {
    public final ArrayDeque a;
    public final ArrayDeque b;
    public final int c;
    public final boolean d;

    public ioo0(boolean z, int i) {
        this.c = i;
        this.d = z;
        this.a = new ArrayDeque(i);
        this.b = new ArrayDeque(i);
    }

    public final void a(k0u k0uVar, int i, int i2) throws GlUtil.GlException {
        int i3;
        k0u k0uVar2;
        int i4;
        int i5;
        ArrayDeque arrayDeque = this.a;
        fxc0.z(arrayDeque.isEmpty());
        fxc0.z(this.b.isEmpty());
        for (int i6 = 0; i6 < this.c; i6++) {
            if (this.d) {
                GlUtil.a(i, i2);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GlUtil.d();
                i3 = iArr[0];
                GlUtil.b(3553, i3, 9729);
                i4 = i;
                i5 = i2;
                GLES20.glTexImage2D(3553, 0, 34842, i4, i5, 0, 6408, 5131, null);
                GlUtil.d();
                k0uVar2 = k0uVar;
            } else {
                GlUtil.a(i, i2);
                int[] iArr2 = new int[1];
                GLES20.glGenTextures(1, iArr2, 0);
                GlUtil.d();
                i3 = iArr2[0];
                GlUtil.b(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                GlUtil.d();
                k0uVar2 = k0uVar;
                i4 = i;
                i5 = i2;
            }
            arrayDeque.add(k0uVar2.b(i3, i4, i5));
        }
    }

    public final void b() throws GlUtil.GlException {
        Iterator<r0u> e = e();
        while (true) {
            lwx.b bVar = (lwx.b) e;
            if (!bVar.hasNext()) {
                this.a.clear();
                this.b.clear();
                return;
            }
            ((r0u) bVar.next()).a();
        }
    }

    public final void c(k0u k0uVar, int i, int i2) throws GlUtil.GlException {
        if (!((lwx.b) e()).hasNext()) {
            a(k0uVar, i, i2);
            return;
        }
        r0u r0uVar = (r0u) ((lwx.b) e()).next();
        if (r0uVar.c == i && r0uVar.d == i2) {
            return;
        }
        b();
        a(k0uVar, i, i2);
    }

    public final int d() {
        return !((lwx.b) e()).hasNext() ? this.c : this.a.size();
    }

    public final Iterator<r0u> e() {
        Iterable[] iterableArr = {this.a, this.b};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new nur(iterableArr).iterator();
    }

    public final r0u f() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        r0u r0uVar = (r0u) arrayDeque.remove();
        this.b.add(r0uVar);
        return r0uVar;
    }
}

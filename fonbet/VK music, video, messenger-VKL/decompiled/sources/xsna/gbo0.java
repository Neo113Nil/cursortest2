package xsna;

import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.LinkedHashMap;
import java.util.Objects;
import xsna.e840;
import xsna.jms0;

/* compiled from: TexIdTextureManager.java */
/* loaded from: classes12.dex */
public final class gbo0 extends goo0 {
    public yes d;
    public com.vk.movika.sdk.base.hooks.f e;
    public hfs f;
    public final k0u g;

    public gbo0(k0u k0uVar, jms0 jms0Var) {
        super(jms0Var);
        this.g = k0uVar;
    }

    @Override // xsna.o0u.b
    public final void b(final r0u r0uVar) {
        this.a.f(new jms0.b() { // from class: xsna.dbo0
            @Override // xsna.jms0.b
            public final void run() {
                com.vk.movika.sdk.base.hooks.f fVar = gbo0.this.e;
                fVar.getClass();
                int i = r0uVar.a;
                GlUtil.k();
                e840 e840Var = (e840) fVar.c;
                SparseArray<e840.d> sparseArray = e840Var.k;
                fxc0.z(y2r0.l(sparseArray, i));
                e840.d dVar = sparseArray.get(i);
                dVar.a.g(dVar.b);
                sparseArray.remove(i);
                e840Var.o();
            }
        }, true);
    }

    @Override // xsna.goo0
    public final synchronized void d() throws VideoFrameProcessingException {
        yes yesVar = this.d;
        yesVar.getClass();
        yesVar.a();
        super.d();
    }

    @Override // xsna.o0u.b
    public final void e() {
        this.d.getClass();
        final yes yesVar = this.d;
        Objects.requireNonNull(yesVar);
        this.a.f(new jms0.b() { // from class: xsna.ebo0
            @Override // xsna.jms0.b
            public final void run() {
                yes.this.e();
            }
        }, true);
    }

    @Override // xsna.goo0
    public final int g() {
        int size;
        yes yesVar = this.d;
        yesVar.getClass();
        synchronized (yesVar) {
            size = yesVar.d.size();
        }
        return size;
    }

    @Override // xsna.goo0
    public final void i(final int i, final long j) {
        final hfs hfsVar = this.f;
        hfsVar.getClass();
        this.e.getClass();
        this.a.f(new jms0.b() { // from class: xsna.fbo0
            @Override // xsna.jms0.b
            public final void run() {
                gbo0 gbo0Var = gbo0.this;
                int i2 = i;
                hfs hfsVar2 = hfsVar;
                long j2 = j;
                androidx.media3.common.a aVar = hfsVar2.a;
                r0u r0uVar = new r0u(i2, -1, aVar.u, aVar.v);
                yes yesVar = gbo0Var.d;
                yesVar.getClass();
                yesVar.c(r0uVar, j2);
                int i3 = hfsVar2.a.u;
                LinkedHashMap linkedHashMap = a7l.a;
                synchronized (a7l.class) {
                }
            }
        }, true);
    }

    @Override // xsna.goo0
    public final void m(hfs hfsVar, boolean z) {
        this.f = hfsVar;
    }

    @Override // xsna.goo0
    public final void n(com.vk.movika.sdk.base.hooks.f fVar) {
        this.e = fVar;
    }

    @Override // xsna.goo0
    public final void o(mml mmlVar) {
        this.d = new yes(this.g, mmlVar, this.a);
    }

    @Override // xsna.goo0
    public final void p() {
        this.a.f(new jms0.b() { // from class: xsna.cbo0
            @Override // xsna.jms0.b
            public final void run() {
                yes yesVar = gbo0.this.d;
                yesVar.getClass();
                yesVar.d();
                a7l.a();
            }
        }, true);
    }

    @Override // xsna.goo0
    public final void k() {
    }
}

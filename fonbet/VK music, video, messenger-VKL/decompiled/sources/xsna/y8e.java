package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: ClipsFeedSideControlsDelegator.kt */
/* loaded from: classes17.dex */
public final class y8e implements toc {
    public h3d b;
    public wmf c;
    public pih0 d;
    public izs<? super VideoFile, s3q0> e;
    public izs<? super VideoFile, s3q0> f;
    public izs<? super VideoFile, s3q0> g;
    public com.vk.im.engine.internal.storage.delegates.messages.b h;
    public izs<? super VideoFile, s3q0> i;
    public izs<? super VideoFile, s3q0> j;
    public izs<? super VideoFile, s3q0> k;
    public izs<? super VideoFile, ? extends io.reactivex.rxjava3.core.a> l;

    @Override // xsna.toc
    public final void b(izs<? super VideoFile, ? extends io.reactivex.rxjava3.core.a> izsVar) {
        this.l = izsVar;
    }

    @Override // xsna.toc
    public final void c(izs<? super VideoFile, s3q0> izsVar) {
        this.k = izsVar;
    }

    @Override // xsna.toc
    public final void d(izs<? super VideoFile, s3q0> izsVar) {
        this.j = izsVar;
    }

    @Override // xsna.toc
    public final void e(izs<? super VideoFile, s3q0> izsVar) {
        this.g = izsVar;
    }

    @Override // xsna.toc
    public final void h(izs<? super VideoFile, s3q0> izsVar) {
        this.i = izsVar;
    }

    @Override // xsna.toc
    public final void i(izs<? super VideoFile, s3q0> izsVar) {
        this.f = izsVar;
    }

    @Override // xsna.toc
    public final void j(wmf wmfVar) {
        this.c = wmfVar;
        if (wmfVar instanceof h3d) {
            this.b = (h3d) wmfVar;
        }
    }

    @Override // xsna.toc
    public final void k(h3d h3dVar) {
        this.b = h3dVar;
        if (h3dVar instanceof wmf) {
            this.c = (wmf) h3dVar;
        }
    }

    @Override // xsna.toc
    public final void m(izs<? super VideoFile, s3q0> izsVar) {
        this.e = izsVar;
    }
}

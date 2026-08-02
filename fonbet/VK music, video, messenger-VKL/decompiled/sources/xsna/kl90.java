package xsna;

import java.util.concurrent.CopyOnWriteArraySet;
import xsna.il90;

/* compiled from: ParticipantsListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class kl90 implements il90 {
    public final CopyOnWriteArraySet<il90> b = new CopyOnWriteArraySet<>();

    public static void a(gzs gzsVar) {
        i0q0.i(0L, new jl90(0, gzsVar));
    }

    @Override // xsna.il90
    public final void d(il90.a aVar) {
        a(new com.vk.movika.sdk.base.ui.l(17, this, aVar));
    }

    @Override // xsna.il90
    public final void h(il90.c cVar) {
        a(new j6(11, this, cVar));
    }

    @Override // xsna.il90
    public final void s(il90.d dVar) {
        a(new com.vk.movika.sdk.base.ui.i(22, this, dVar));
    }

    @Override // xsna.il90
    public final void t(il90.e eVar) {
        a(new com.vk.movika.sdk.base.ui.m(13, this, eVar));
    }

    @Override // xsna.il90
    public final void x(il90.b bVar) {
        a(new dp0(13, this, bVar));
    }
}

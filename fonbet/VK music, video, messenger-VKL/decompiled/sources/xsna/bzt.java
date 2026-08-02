package xsna;

import kotlin.collections.EmptyList;

/* compiled from: GifSearchRxHandler.kt */
/* loaded from: classes15.dex */
public final class bzt {
    public final czt a;
    public final syt b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final bbb0 d;
    public final b6f0 e;
    public final kld0 f;

    public bzt(czt cztVar, syt sytVar, io.reactivex.rxjava3.disposables.b bVar, bbb0 bbb0Var, b6f0 b6f0Var, kld0 kld0Var) {
        this.a = cztVar;
        this.b = sytVar;
        this.c = bVar;
        this.d = bbb0Var;
        this.e = b6f0Var;
        this.f = kld0Var;
    }

    public final void a() {
        io.reactivex.rxjava3.core.a a = this.b.a();
        asu0 asu0Var = asu0.a;
        this.c.b(a.q(asu0Var.c()).o(asu0Var.d()).subscribe());
        this.a.a = EmptyList.b;
    }
}

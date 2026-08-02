package defpackage;

import com.yandex.go.address.search.common.analytics.SuggestionsAnalytics$DefaultSuggestType;
import com.yandex.go.address.search.common.analytics.SuggestionsAnalytics$Type;
import com.yandex.go.address.search.common.presenter.b;

/* loaded from: classes12.dex */
public final class nav0 implements nxg {
    public final /* synthetic */ b a;

    public nav0(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.nxg
    public final void Wc(int i) {
        b bVar = this.a;
        com.yandex.go.route.interactor.b bVar2 = bVar.k0.a;
        bVar2.j();
        bVar2.f();
        mbv0 mbv0Var = bVar.M;
        kbv0 b = mbv0Var.b();
        b.c = Boolean.TRUE;
        b.k = SuggestionsAnalytics$DefaultSuggestType.ASK_DRIVER;
        b.j = SuggestionsAnalytics$Type.DEFAULT_SUGGEST;
        b.f = i;
        mbv0Var.g(b);
        mbv0Var.j = 0;
        ((j61) bVar.Dg()).w7();
    }
}

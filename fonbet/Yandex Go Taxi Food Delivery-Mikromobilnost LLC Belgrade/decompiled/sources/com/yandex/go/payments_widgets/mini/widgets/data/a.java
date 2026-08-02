package com.yandex.go.payments_widgets.mini.widgets.data;

import com.yandex.go.navigation.screen.c;
import defpackage.dea0;
import defpackage.hea0;
import defpackage.iea0;
import defpackage.tpr;
import defpackage.zww0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.am.m;

/* loaded from: classes8.dex */
public final class a {
    public final hea0 a;
    public final m b;
    public final c c;
    public final dea0 d;
    public final zww0 e;

    public a(hea0 hea0Var, m mVar, c cVar, dea0 dea0Var, zww0 zww0Var) {
        this.a = hea0Var;
        this.b = mVar;
        this.c = cVar;
        this.d = dea0Var;
        this.e = zww0Var;
    }

    public static final tpr a(a aVar) {
        return e.t(e.n(new n(aVar.b.f, new PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$1(aVar, null)), ((iea0) aVar.a).a, e.d(aVar.d.a), new PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2(4, null)));
    }
}

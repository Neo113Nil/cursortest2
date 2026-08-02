package com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing;

import defpackage.fiw;
import defpackage.giw;
import defpackage.iiw;
import defpackage.tls;
import defpackage.zjw;
import defpackage.zy11;
import ru.yandex.taxi.intercity.IntercityToSummaryNavigationSource;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        iiw iiwVar = ((giw) obj).a;
        iiw.P(iiwVar);
        zjw zjwVar = (zjw) iiwVar.G.get();
        zjwVar.a.a(IntercityToSummaryNavigationSource.INTERCITY_DASHBOARD_SCREEN, this.a, this.b, new IntercityDashboardRouter$startSummary$1(0, iiwVar, iiw.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0));
        iiwVar.K = new fiw(iiwVar, 0);
        return zy11.a;
    }
}

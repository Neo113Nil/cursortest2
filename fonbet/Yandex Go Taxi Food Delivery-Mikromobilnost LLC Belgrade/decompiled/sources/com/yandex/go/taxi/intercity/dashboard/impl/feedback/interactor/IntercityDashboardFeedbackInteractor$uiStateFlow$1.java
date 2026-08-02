package com.yandex.go.taxi.intercity.dashboard.impl.feedback.interactor;

import defpackage.auq;
import defpackage.ddw;
import defpackage.edw;
import defpackage.jl40;
import defpackage.pcw;
import defpackage.tcc;
import defpackage.xcw;
import defpackage.zls;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class IntercityDashboardFeedbackInteractor$uiStateFlow$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pcw pcwVar = (pcw) obj;
        String str = (String) obj2;
        ((edw) this.receiver).getClass();
        String str2 = pcwVar.a;
        String str3 = pcwVar.b;
        String str4 = pcwVar.c;
        String str5 = pcwVar.d;
        List<xcw> list = pcwVar.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (xcw xcwVar : list) {
            String str6 = xcwVar.a;
            arrayList.add(new auq(str6, xcwVar.b, xcwVar.c, jl40.l(str6, str)));
        }
        return new ddw(str2, str3, str4, str5, arrayList);
    }
}

package com.yandex.go.superapp.searchbar.impl.ui;

import com.adjust.sdk.Constants;
import com.yandex.go.dto.response.q1;
import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$SearchBarTapSource;
import defpackage.ibw0;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperappSearchbarContainerView$searchbarView$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        q1 q1Var = (q1) obj;
        SuperappMainAnalytics$SearchBarTapSource superappMainAnalytics$SearchBarTapSource = (SuperappMainAnalytics$SearchBarTapSource) obj2;
        com.yandex.go.superapp.searchbar.impl.presentation.a aVar = (com.yandex.go.superapp.searchbar.impl.presentation.a) this.receiver;
        ibw0 ibw0Var = aVar.B;
        String Ng = com.yandex.go.superapp.searchbar.impl.presentation.a.Ng(q1Var);
        String Mg = com.yandex.go.superapp.searchbar.impl.presentation.a.Mg(q1Var);
        ibw0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", Ng);
        if (Mg != null) {
            hashMap.put(Constants.DEEPLINK, Mg);
        }
        hashMap.put("tap_source", superappMainAnalytics$SearchBarTapSource.getEventValue());
        ibw0Var.a.a("SuperappMain.SearchBar.Tapped", hashMap, 1, new HashMap());
        aVar.E.a(q1Var);
        return zy11.a;
    }
}

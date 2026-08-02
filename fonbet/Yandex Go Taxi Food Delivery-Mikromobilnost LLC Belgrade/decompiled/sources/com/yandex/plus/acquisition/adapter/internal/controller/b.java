package com.yandex.plus.acquisition.adapter.internal.controller;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.acquisition.adapter.api.PlusAcquisitionSdkPaymentAnalyticsParams;
import com.yandex.plus.home.common.utils.c;
import defpackage.am2;
import defpackage.c0d0;
import defpackage.eja1;
import defpackage.g0d0;
import defpackage.gn;
import defpackage.i3y;
import defpackage.lu5;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.u42;
import defpackage.y4;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements g0d0 {
    public final com.yandex.plus.acquisition.adapter.internal.processor.a a;
    public pzt0 b;
    public final i3y c;
    public final i3y d;

    public b(Context context, am2 am2Var, PlusAcquisitionSdkPaymentAnalyticsParams plusAcquisitionSdkPaymentAnalyticsParams, Map map, u42 u42Var, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a aVar, c0d0 c0d0Var, com.yandex.plus.acquisition.adapter.internal.processor.a aVar2) {
        this.a = aVar2;
        this.c = kotlin.a.a(new lu5(14, am2Var, context));
        this.d = kotlin.a.a(new gn(am2Var, this, u42Var, plusAcquisitionSdkPaymentAnalyticsParams, aVar, c0d0Var, map, 1));
    }

    public final void a(pey peyVar, y4 y4Var) {
        pzt0 pzt0Var = this.b;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.b = c.c(g.a(this.a.e, peyVar.getLifecycle(), Lifecycle.State.STARTED), eja1.s(peyVar), new ButtonSectionController$collectButtonSectionState$1(this, y4Var, null));
        }
    }
}

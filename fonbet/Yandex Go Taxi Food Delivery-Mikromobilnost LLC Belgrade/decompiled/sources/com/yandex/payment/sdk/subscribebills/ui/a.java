package com.yandex.payment.sdk.subscribebills.ui;

import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentManager;
import com.yandex.payment.sdk.transportcards.ui.FlexDefaultTheme;
import defpackage.ds31;
import defpackage.g0c;
import defpackage.g450;
import defpackage.h450;
import defpackage.kpa1;
import defpackage.kpg0;
import defpackage.ls31;
import defpackage.lzu0;
import defpackage.mzu0;
import defpackage.ozu0;
import defpackage.pcy;
import defpackage.pzu0;
import defpackage.qoi0;
import defpackage.rwo;
import defpackage.sls;
import defpackage.tje;
import defpackage.y8f;
import defpackage.ym11;
import defpackage.ypa0;

/* loaded from: classes2.dex */
public final class a {
    public final pzu0 a;
    public final h450 b;
    public final pcy c;
    public final rwo d;

    public a(pzu0 pzu0Var, h450 h450Var, pcy pcyVar, rwo rwoVar) {
        this.a = pzu0Var;
        this.b = h450Var;
        this.c = pcyVar;
        this.d = rwoVar;
    }

    public final void a(final AppCompatActivity appCompatActivity, FrameLayout frameLayout, FragmentManager fragmentManager) {
        lzu0 lzu0Var = new lzu0(0, this, appCompatActivity);
        ym11.e(1, lzu0Var);
        this.b.a.put(String.valueOf(qoi0.a(g450.class).d()), lzu0Var);
        g0c a = qoi0.a(ozu0.class);
        SubscribeBillsNavigator$init$$inlined$viewModels$default$2 subscribeBillsNavigator$init$$inlined$viewModels$default$2 = new SubscribeBillsNavigator$init$$inlined$viewModels$default$2(appCompatActivity);
        sls slsVar = new sls() { // from class: com.yandex.payment.sdk.subscribebills.ui.SubscribeBillsNavigator$init$$inlined$viewModels$default$3
            final /* synthetic */ sls $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar2 = this.$extrasProducer;
                return (slsVar2 == null || (y8fVar = (y8f) slsVar2.invoke()) == null) ? appCompatActivity.getDefaultViewModelCreationExtras() : y8fVar;
            }
        };
        boolean d = kpa1.d(appCompatActivity);
        frameLayout.setBackgroundColor(appCompatActivity.getColor(d ? kpg0.paymentsdk_white : kpg0.paymentsdk_onyx));
        ypa0 o = ypa0.o(LayoutInflater.from(new ContextThemeWrapper(appCompatActivity, (d ? FlexDefaultTheme.LIGHT : FlexDefaultTheme.DARK).a(appCompatActivity).l())));
        ozu0 ozu0Var = (ozu0) new ls31(subscribeBillsNavigator$init$$inlined$viewModels$default$2.$this_viewModels.getViewModelStore(), this.a, (y8f) slsVar.invoke()).a(a);
        tje.N(ds31.a(ozu0Var), null, null, new SubscribeBillsViewModel$init$1(ozu0Var, appCompatActivity, frameLayout, d, this.c.a.getIsDebug(), new mzu0(o), fragmentManager, null), 3);
    }
}

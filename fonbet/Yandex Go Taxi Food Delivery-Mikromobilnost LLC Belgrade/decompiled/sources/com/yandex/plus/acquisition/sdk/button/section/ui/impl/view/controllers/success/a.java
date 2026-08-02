package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success;

import android.content.Context;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.RadioButtonView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.RadioGroupView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import defpackage.a6i0;
import defpackage.ab5;
import defpackage.b6i0;
import defpackage.c0d0;
import defpackage.c27;
import defpackage.c6i0;
import defpackage.c9f0;
import defpackage.cb5;
import defpackage.d9f0;
import defpackage.dl11;
import defpackage.e6i0;
import defpackage.el11;
import defpackage.g4b1;
import defpackage.hby;
import defpackage.j8f0;
import defpackage.mt0;
import defpackage.mvg0;
import defpackage.pzc0;
import defpackage.q6a1;
import defpackage.q6c0;
import defpackage.rh2;
import defpackage.scc;
import defpackage.tcc;
import defpackage.v17;
import defpackage.vng;
import defpackage.vzc0;
import defpackage.wn4;
import defpackage.xbg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends cb5 {
    public final e6i0 i;
    public final c6i0 j;
    public final b6i0 k;
    public final LinkedHashMap l;

    public a(ButtonSectionView buttonSectionView, v17 v17Var, c0d0 c0d0Var, PlusSdkBrandType plusSdkBrandType, e6i0 e6i0Var, c6i0 c6i0Var, b6i0 b6i0Var) {
        super(buttonSectionView, v17Var, c0d0Var, plusSdkBrandType);
        this.i = e6i0Var;
        this.j = c6i0Var;
        this.k = b6i0Var;
        this.l = new LinkedHashMap();
    }

    @Override // defpackage.cb5
    public final void g() {
        super.g();
        this.l.clear();
    }

    public final void i(vzc0 vzc0Var) {
        ButtonSectionView buttonSectionView = this.a;
        Context context = buttonSectionView.getView().getContext();
        pzc0 pzc0Var = vzc0Var.b;
        List g = scc.g(pzc0Var, vzc0Var.c);
        boolean a = c27.a(pzc0Var);
        this.i.getClass();
        RadioGroupView radioGroupView = new RadioGroupView(context, null, 0, 0, 14, null);
        radioGroupView.getGuideline().setGuidelineBegin(a ? vng.s(mvg0.acquisition_sdk_dimension_size_100, radioGroupView.getGuideline().getContext()) : 0);
        List list = g;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            pzc0 pzc0Var2 = (pzc0) obj;
            this.l.put(Integer.valueOf(i), pzc0Var2);
            pzc0 pzc0Var3 = pzc0Var;
            List list2 = list;
            TwoTariffsController$setup$radioButtonContents$1$1 twoTariffsController$setup$radioButtonContents$1$1 = new TwoTariffsController$setup$radioButtonContents$1$1(0, this, a.class, "expand", "expand()V", 0);
            b6i0 b6i0Var = this.k;
            b6i0Var.getClass();
            PlusAcquisitionSmartOffer.Texts texts = pzc0Var2.a.getTexts();
            String subscriptionName = texts.getSubscriptionName();
            PlusSdkBrandType plusSdkBrandType = b6i0Var.b;
            c9f0 c9f0Var = new c9f0(subscriptionName, plusSdkBrandType, texts.getCombinedIntroductoryText(), texts.getCombinedPriceText());
            j8f0 j8f0Var = new j8f0(new d9f0(texts.getSubscriptionName(), plusSdkBrandType, texts.getCombinedFullOfferText()), b6i0Var.a, new xbg0(3, twoTariffsController$setup$radioButtonContents$1$1));
            String discountPercent = texts.getDiscountPercent();
            if (discountPercent == null || i != 0) {
                discountPercent = null;
            }
            String pointsText = texts.getPointsText();
            if (pointsText == null || i != 0) {
                pointsText = null;
            }
            arrayList.add(new a6i0(c9f0Var, j8f0Var, new wn4(discountPercent, pointsText), c27.a(pzc0Var2) && i == 0));
            i = i2;
            pzc0Var = pzc0Var3;
            list = list2;
        }
        pzc0 pzc0Var4 = pzc0Var;
        List list3 = list;
        q6c0 q6c0Var = new q6c0(radioGroupView, this.j);
        el11 el11Var = new el11(0, this);
        Context context2 = radioGroupView.getContainer().getContext();
        q6c0Var.w = null;
        radioGroupView.getRadioButtonsContainer().removeAllViews();
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            a6i0 a6i0Var = (a6i0) next;
            c6i0 c6i0Var = (c6i0) q6c0Var.c;
            mt0 mt0Var = new mt0(q6c0Var, i3, a6i0Var, el11Var, 6);
            int i5 = i3;
            c6i0Var.getClass();
            Context context3 = context2;
            RadioButtonView radioButtonView = new RadioButtonView(context3, null, 0, 0, 14, null);
            radioButtonView.setOnTouchListener(new rh2(3, mt0Var, radioButtonView));
            q6a1.d(radioButtonView.getProductTexts(), a6i0Var.a);
            g4b1.b(radioButtonView.getBadges(), a6i0Var.c);
            radioButtonView.getGuideline().setGuidelineBegin(a6i0Var.d ? vng.s(mvg0.acquisition_sdk_dimension_size_100, radioButtonView.getGuideline().getContext()) : 0);
            if (i5 == 0) {
                q6c0Var.F(i5, radioButtonView, a6i0Var, el11Var);
            }
            radioGroupView.getRadioButtonsContainer().addView(radioButtonView.getView(), i5);
            i3 = i4;
            context2 = context3;
        }
        this.f = new dl11(buttonSectionView, radioGroupView);
        this.e = new hby();
        buttonSectionView.getContentContainer().addView(radioGroupView.getContainer());
        if (c27.a(pzc0Var4)) {
            c(vng.s(mvg0.acquisition_sdk_dimension_size_100, context));
        } else {
            c(vng.s(mvg0.acquisition_sdk_dimension_size_200, context));
        }
        b();
        buttonSectionView.getLegalsTextView().setTextAppearance(((ab5) this.h.getValue()).c);
        e();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            h(((pzc0) it2.next()).a, vzc0Var.a);
        }
    }
}

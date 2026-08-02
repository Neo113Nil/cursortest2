package com.yandex.plus.acquisition.adapter.internal.controller;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.CompositeOfferContainerView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.CompositeProductView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons.ProductIconView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons.ProductIconsLayout;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.badges.ProductTextsWithBadgesView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import defpackage.ab5;
import defpackage.c9f0;
import defpackage.cb5;
import defpackage.d9f0;
import defpackage.fxg0;
import defpackage.g4b1;
import defpackage.i9f0;
import defpackage.m270;
import defpackage.mvg;
import defpackage.mvg0;
import defpackage.ny61;
import defpackage.pzc0;
import defpackage.q6a1;
import defpackage.qzc0;
import defpackage.rkd;
import defpackage.scc;
import defpackage.szc0;
import defpackage.tkd;
import defpackage.tls;
import defpackage.tzc0;
import defpackage.uzc0;
import defpackage.v17;
import defpackage.vkd;
import defpackage.vng;
import defpackage.vzc0;
import defpackage.w511;
import defpackage.wkd;
import defpackage.wls;
import defpackage.wn4;
import defpackage.wzc0;
import defpackage.x17;
import defpackage.xzc0;
import defpackage.zm;
import defpackage.zy11;
import defpackage.zyh0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxzc0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lxzc0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.acquisition.adapter.internal.controller.ButtonSectionController$collectButtonSectionState$1", f = "ButtonSectionController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ButtonSectionController$collectButtonSectionState$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onSuccessStateReceived;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonSectionController$collectButtonSectionState$1(b bVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$onSuccessStateReceived = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ButtonSectionController$collectButtonSectionState$1 buttonSectionController$collectButtonSectionState$1 = new ButtonSectionController$collectButtonSectionState$1(this.this$0, this.$onSuccessStateReceived, continuation);
        buttonSectionController$collectButtonSectionState$1.L$0 = obj;
        return buttonSectionController$collectButtonSectionState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ButtonSectionController$collectButtonSectionState$1 buttonSectionController$collectButtonSectionState$1 = (ButtonSectionController$collectButtonSectionState$1) create((xzc0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        buttonSectionController$collectButtonSectionState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        List list;
        rkd rkdVar;
        xzc0 xzc0Var = (xzc0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        x17 x17Var = (x17) this.this$0.d.getValue();
        v17 v17Var = x17Var.b;
        ButtonSectionView buttonSectionView = x17Var.a;
        cb5 cb5Var = x17Var.m;
        if (cb5Var != null) {
            cb5Var.g();
        }
        x17Var.m = null;
        if (xzc0Var instanceof szc0) {
            szc0 szc0Var = (szc0) xzc0Var;
            buttonSectionView.getView().setVisibility(0);
            buttonSectionView.getContentContainer().setVisibility(8);
            buttonSectionView.getPurchaseButton().getView().setVisibility(8);
            buttonSectionView.getLegalsTextView().setVisibility(8);
            buttonSectionView.getProgressBar().setVisibility(0);
            String str = szc0Var.a;
            String str2 = szc0Var.b;
            zm zmVar = v17Var.a;
            List singletonList = Collections.singletonList(str2);
            zmVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Constants.KEY_PAGE, str);
            linkedHashMap.put("places", singletonList);
            linkedHashMap.put("_meta", zm.a(new HashMap()));
            zmVar.b("OfferSection.Loading", linkedHashMap);
        } else if (xzc0Var instanceof uzc0) {
            m270 m270Var = new m270(buttonSectionView, x17Var.b, x17Var.c, x17Var.l, x17Var.d, x17Var.e);
            uzc0 uzc0Var = (uzc0) xzc0Var;
            Context context = buttonSectionView.getView().getContext();
            pzc0 pzc0Var = uzc0Var.b;
            PlusAcquisitionSmartOffer plusAcquisitionSmartOffer = pzc0Var.a;
            FrameLayout contentContainer = buttonSectionView.getContentContainer();
            i9f0 i9f0Var = m270Var.j;
            i9f0Var.getClass();
            PlusAcquisitionSmartOffer.Texts texts = plusAcquisitionSmartOffer.getTexts();
            c9f0 c9f0Var = new c9f0(texts.getSubscriptionName(), i9f0Var.a, texts.getCombinedIntroductoryText(), texts.getCombinedPriceText());
            wn4 wn4Var = new wn4(texts.getDiscountPercent(), texts.getPointsText());
            m270Var.i.getClass();
            ProductTextsWithBadgesView productTextsWithBadgesView = new ProductTextsWithBadgesView(context, null, 0, 0, 14, null);
            q6a1.d(productTextsWithBadgesView.getProductTexts(), c9f0Var);
            g4b1.b(productTextsWithBadgesView.getBadges(), wn4Var);
            contentContainer.addView(productTextsWithBadgesView.getView());
            m270Var.a(pzc0Var);
            m270Var.c(vng.s(mvg0.acquisition_sdk_dimension_size_200, context));
            m270Var.b();
            buttonSectionView.getLegalsTextView().setTextAppearance(((ab5) m270Var.h.getValue()).c);
            m270Var.e();
            m270Var.h(plusAcquisitionSmartOffer, uzc0Var.a);
            m270Var.g = pzc0Var;
            x17Var.m = m270Var;
        } else if (xzc0Var instanceof vzc0) {
            com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a aVar = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a(buttonSectionView, x17Var.b, x17Var.c, x17Var.l, x17Var.f, x17Var.g, x17Var.h);
            aVar.i((vzc0) xzc0Var);
            x17Var.m = aVar;
        } else if (xzc0Var instanceof tzc0) {
            wkd wkdVar = new wkd(buttonSectionView, x17Var.b, x17Var.c, x17Var.l, x17Var.i, x17Var.j, x17Var.k);
            tzc0 tzc0Var = (tzc0) xzc0Var;
            Context context2 = buttonSectionView.getView().getContext();
            pzc0 pzc0Var2 = tzc0Var.b;
            PlusAcquisitionSmartOffer plusAcquisitionSmartOffer2 = pzc0Var2.a;
            vkd vkdVar = wkdVar.j;
            vkdVar.getClass();
            PlusSdkBrandType plusSdkBrandType = vkdVar.a;
            PlusAcquisitionSmartOffer plusAcquisitionSmartOffer3 = pzc0Var2.a;
            PlusAcquisitionSmartOffer.Texts texts2 = plusAcquisitionSmartOffer3.getTexts();
            com.yandex.plus.acquisition.sdk.pay.common.api.b compositeTariffTexts = texts2.getCompositeTariffTexts();
            com.yandex.plus.acquisition.sdk.pay.common.api.b compositeOptionTexts = texts2.getCompositeOptionTexts();
            Drawable drawable = pzc0Var2.c;
            c9f0 c9f0Var2 = new c9f0(compositeTariffTexts.a, plusSdkBrandType, compositeTariffTexts.b, compositeTariffTexts.c);
            Drawable drawable2 = pzc0Var2.d;
            c9f0 c9f0Var3 = new c9f0(compositeOptionTexts.a, plusSdkBrandType, compositeOptionTexts.b, compositeOptionTexts.c);
            d9f0 d9f0Var = new d9f0(texts2.getSubscriptionName(), plusSdkBrandType, texts2.getCombinedFullOfferText());
            List g = scc.g(drawable, drawable2);
            wkdVar.i.getClass();
            int i2 = 14;
            DefaultConstructorMarker defaultConstructorMarker = null;
            AttributeSet attributeSet = null;
            int i3 = 0;
            int i4 = 0;
            CompositeOfferContainerView compositeOfferContainerView = new CompositeOfferContainerView(context2, attributeSet, i3, i4, i2, defaultConstructorMarker);
            CompositeProductView compositeProductView = new CompositeProductView(context2, attributeSet, i3, i4, i2, defaultConstructorMarker);
            q6a1.d(compositeProductView.getProductTexts(), c9f0Var2);
            if (drawable != null) {
                compositeProductView.getProductIconView().setImageDrawable(drawable);
                compositeProductView.getProductIconView().setVisibility(0);
            } else {
                compositeProductView.getProductIconView().setVisibility(8);
            }
            View view = compositeProductView.getView();
            CompositeProductView compositeProductView2 = new CompositeProductView(context2, null, 0, 0, 14, null);
            q6a1.d(compositeProductView2.getProductTexts(), c9f0Var3);
            if (drawable2 != null) {
                compositeProductView2.getProductIconView().setImageDrawable(drawable2);
                i = 0;
                compositeProductView2.getProductIconView().setVisibility(0);
            } else {
                i = 0;
                compositeProductView2.getProductIconView().setVisibility(8);
            }
            View view2 = compositeProductView2.getView();
            compositeOfferContainerView.getCompositeProductsContainer().addView(view, i);
            compositeOfferContainerView.getCompositeProductsContainer().addView(view2, 1);
            rkd compositeOffer = compositeOfferContainerView.getCompositeOffer();
            q6a1.d(compositeOffer.getProductTexts(), d9f0Var);
            int f = scc.f(g);
            if (f >= 0) {
                while (true) {
                    Drawable drawable3 = (Drawable) g.get(i);
                    if (drawable3 != null) {
                        Context context3 = compositeOffer.getView().getContext();
                        ProductIconsLayout productIconsContainer = compositeOffer.getProductIconsContainer();
                        ProductIconView productIconView = new ProductIconView(context3, null, 0, 6, null);
                        list = g;
                        rkdVar = compositeOffer;
                        productIconView.setBackgroundDrawable(vng.t(fxg0.acquisition_sdk_bg_product_icon, context3));
                        productIconView.setImageDrawable(drawable3);
                        productIconsContainer.addView(productIconView);
                    } else {
                        list = g;
                        rkdVar = compositeOffer;
                    }
                    if (i == f) {
                        break;
                    }
                    i++;
                    g = list;
                    compositeOffer = rkdVar;
                }
            }
            wkdVar.f = new tkd(buttonSectionView, compositeOfferContainerView, plusAcquisitionSmartOffer3.isOneClickEnabled());
            buttonSectionView.getContentContainer().addView(compositeOfferContainerView.getContainer());
            buttonSectionView.getPurchaseButton().getReadMoreTextView().setText(context2.getString(wkdVar.k.a(zyh0.PlusAcquisition_ButtonSection_Composite_TextForExpand)));
            wkdVar.a(pzc0Var2);
            wkdVar.c(vng.s(mvg0.acquisition_sdk_dimension_size_200, context2));
            wkdVar.b();
            wkdVar.a.getLegalsTextView().setTextAppearance(((ab5) wkdVar.h.getValue()).c);
            wkdVar.e();
            wkdVar.h(plusAcquisitionSmartOffer2, tzc0Var.a);
            wkdVar.g = pzc0Var2;
            x17Var.m = wkdVar;
        } else {
            if (!(xzc0Var instanceof qzc0)) {
                w511.b();
                return null;
            }
            qzc0 qzc0Var = (qzc0) xzc0Var;
            buttonSectionView.getView().setVisibility(8);
            String str3 = qzc0Var.a;
            String str4 = qzc0Var.b;
            String message = qzc0Var.c.getMessage();
            zm zmVar2 = v17Var.a;
            List singletonList2 = Collections.singletonList(str4);
            if (message == null) {
                message = "no_value";
            }
            zmVar2.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(Constants.KEY_PAGE, str3);
            linkedHashMap2.put("places", singletonList2);
            linkedHashMap2.put(Constants.KEY_MESSAGE, message);
            linkedHashMap2.put("_meta", zm.a(new HashMap()));
            zmVar2.b("OfferSection.Error", linkedHashMap2);
        }
        if (xzc0Var instanceof wzc0) {
            this.$onSuccessStateReceived.invoke(((ButtonSectionView) this.this$0.c.getValue()).getView());
        }
        return zy11.a;
    }
}

package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mqg0;
import defpackage.nac;
import defpackage.oug0;
import defpackage.pav;
import defpackage.qje;
import defpackage.tje;
import defpackage.w0d;
import defpackage.xng0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0014\u0010(\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemPinView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapPin;", "pinData", "Lpav;", "imageLoader", "Lk7x0;", "iconTagUrlFormatter", "Lzy11;", "preparePinView", "(Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapPin;Lpav;Lk7x0;)V", "prepareSmallPinView", "()V", "setData", "(Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapPin;Lpav;Lk7x0;)Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemPinView;", "", "isSmall", "setMode", "(Z)V", "", "pinHeight", CA20Status.STATUS_USER_I, "getPinHeight", "()I", "smallPinSize", "getSmallPinSize", "", "pinElevation", "F", "pinPaddingLeft", "pinPaddingRight", "pinIconSize", "pinTextSize", "pinLineHeight", "pinIconColor", "pinTextColor", "smallPinStroke", "Lcom/yandex/go/design/view/GoLinearLayout;", "pinView", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/view/View;", "smallPinView", "Landroid/view/View;", "value", "forceSmall", "Z", "getForceSmall", "()Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSuggestMapItemPinView extends GoFrameLayout {
    private boolean forceSmall;
    private final float pinElevation;
    private final int pinHeight;
    private final int pinIconColor;
    private final int pinIconSize;
    private final int pinLineHeight;
    private final int pinPaddingLeft;
    private final int pinPaddingRight;
    private final int pinTextColor;
    private final float pinTextSize;
    private GoLinearLayout pinView;
    private final int smallPinSize;
    private final int smallPinStroke;
    private View smallPinView;

    public SuperappSuggestMapItemPinView(Context context) {
        super(context, null, 0, 0, 14, null);
        this.pinHeight = tje.r(oug0.superapp_suggest_map_pin_height, getContext());
        this.smallPinSize = tje.r(oug0.superapp_suggest_map_small_pin_size, getContext());
        this.pinElevation = tje.s(oug0.superapp_suggest_map_pin_elevation, getContext());
        this.pinPaddingLeft = tje.r(oug0.superapp_suggest_map_pin_padding_start, getContext());
        this.pinPaddingRight = tje.r(oug0.superapp_suggest_map_pin_padding_end, getContext());
        this.pinIconSize = tje.r(oug0.superapp_suggest_map_pin_image_size, getContext());
        this.pinTextSize = tje.s(oug0.superapp_suggest_map_pin_text_size, getContext());
        this.pinLineHeight = tje.r(oug0.superapp_suggest_map_pin_text_line_height, getContext());
        this.pinIconColor = context.getColor(mqg0.component_amber_dark);
        this.pinTextColor = context.getColor(mqg0.component_gray_600);
        this.smallPinStroke = tje.r(oug0.superapp_suggest_map_small_pin_stroke, getContext());
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    private final void preparePinView(SuperappSuggestMapItemViewProperties.SuggestMapPin pinData, pav imageLoader, k7x0 iconTagUrlFormatter) {
        GoLinearLayout goLinearLayout = new GoLinearLayout(getContext(), null, 0, 0, 14, null);
        goLinearLayout.setGravity(17);
        goLinearLayout.setOrientation(0);
        goLinearLayout.setElevation(this.pinElevation);
        goLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, this.pinHeight));
        w0d w0dVar = new w0d();
        w0dVar.h = this.pinHeight / 2.0f;
        w0dVar.a = qje.t(xng0.everFront, goLinearLayout.getContext());
        goLinearLayout.setBackground(w0dVar.a());
        goLinearLayout.setPadding(this.pinPaddingLeft, 0, this.pinPaddingRight, 0);
        this.pinView = goLinearLayout;
        String str = pinData.b;
        if (str != null) {
            GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
            int i = this.pinIconSize;
            goImageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
            goImageView.setColorFilter(this.pinIconColor);
            ((nac) imageLoader.a(goImageView)).c(((m7x0) iconTagUrlFormatter).a(str));
            GoLinearLayout goLinearLayout2 = this.pinView;
            if (goLinearLayout2 != null) {
                goLinearLayout2.addView(goImageView);
            }
        }
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setText(pinData.a);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        robotoTextView.setTextSize(this.pinTextSize);
        robotoTextView.setLineHeight(this.pinLineHeight);
        robotoTextView.setTextTypeface(3);
        robotoTextView.setTextColor(this.pinTextColor);
        GoLinearLayout goLinearLayout3 = this.pinView;
        if (goLinearLayout3 != null) {
            goLinearLayout3.addView(robotoTextView);
        }
        addView(this.pinView);
    }

    private final void prepareSmallPinView() {
        View goFrameLayout = new GoFrameLayout(getContext(), null, 0, 0, 14, null);
        int i = this.smallPinSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        goFrameLayout.setLayoutParams(layoutParams);
        goFrameLayout.setElevation(this.pinElevation);
        w0d w0dVar = new w0d();
        w0dVar.h = this.smallPinSize / 2.0f;
        w0dVar.a = goFrameLayout.getContext().getColor(mqg0.component_blue_normal);
        w0dVar.b = qje.t(xng0.everFront, goFrameLayout.getContext());
        w0dVar.i = this.smallPinStroke;
        goFrameLayout.setBackground(w0dVar.a());
        this.smallPinView = goFrameLayout;
        addView(goFrameLayout);
    }

    public final boolean getForceSmall() {
        return this.forceSmall;
    }

    public final int getPinHeight() {
        return this.pinHeight;
    }

    public final int getSmallPinSize() {
        return this.smallPinSize;
    }

    public final SuperappSuggestMapItemPinView setData(SuperappSuggestMapItemViewProperties.SuggestMapPin pinData, pav imageLoader, k7x0 iconTagUrlFormatter) {
        this.forceSmall = pinData.a.length() == 0;
        preparePinView(pinData, imageLoader, iconTagUrlFormatter);
        prepareSmallPinView();
        return this;
    }

    public final void setMode(boolean isSmall) {
        GoLinearLayout goLinearLayout = this.pinView;
        if (goLinearLayout != null) {
            goLinearLayout.setVisibility(!isSmall ? 0 : 8);
        }
        View view = this.smallPinView;
        if (view != null) {
            view.setVisibility(isSmall ? 0 : 8);
        }
        if (isSmall) {
            return;
        }
        bringToFront();
    }
}

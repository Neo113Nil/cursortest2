package com.yandex.go.beginners.presentation.services_info.views;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yandex.go.beginners.domain.model.BeginnersOnboardingModel$ServiceInfo$IconType;
import defpackage.al5;
import defpackage.bdc;
import defpackage.h8;
import defpackage.l1h0;
import defpackage.lwq0;
import defpackage.mwq0;
import defpackage.nwq0;
import defpackage.tje;
import defpackage.w511;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00060"}, d2 = {"Lcom/yandex/go/beginners/presentation/services_info/views/ServiceMainInfoItemView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Llwq0;", "Landroid/content/Context;", "context", "Lal5;", "serviceInfo", "Landroid/graphics/Typeface;", "mainInfoTypeface", "<init>", "(Landroid/content/Context;Lal5;Landroid/graphics/Typeface;)V", "", "name", "Lru/yandex/taxi/widget/RobotoTextView;", "getTextView", "(Ljava/lang/String;)Lru/yandex/taxi/widget/RobotoTextView;", "Lcom/yandex/go/beginners/domain/model/BeginnersOnboardingModel$ServiceInfo$IconType;", "iconType", "Landroidx/appcompat/widget/AppCompatImageView;", "getIcon", "(Lcom/yandex/go/beginners/domain/model/BeginnersOnboardingModel$ServiceInfo$IconType;)Landroidx/appcompat/widget/AppCompatImageView;", "", "getCurrentIcon", "(Lcom/yandex/go/beginners/domain/model/BeginnersOnboardingModel$ServiceInfo$IconType;)Ljava/lang/Integer;", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Typeface;", "Lbdc;", "initialTextColor", "Lbdc;", "Landroid/widget/TextView;", "getServiceName", "()Landroid/widget/TextView;", "serviceName", "Landroid/widget/ImageView;", "getServiceIcon", "()Landroid/widget/ImageView;", "serviceIcon", "getTextWidth", "()I", "textWidth", "getIconWidth", "iconWidth", "Companion", "mwq0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServiceMainInfoItemView extends LinearLayoutCompat implements lwq0 {
    public static final int $stable = 8;
    public static final mwq0 Companion = new mwq0();
    private static final int TEXT_PADDING = 8;
    private final bdc initialTextColor;
    private final Typeface mainInfoTypeface;

    public ServiceMainInfoItemView(Context context, al5 al5Var, Typeface typeface) {
        super(context);
        this.mainInfoTypeface = typeface;
        this.initialTextColor = new bdc(xng0.textOnControlMinor);
        setOrientation(0);
        addView(getTextView(al5Var.d));
        BeginnersOnboardingModel$ServiceInfo$IconType beginnersOnboardingModel$ServiceInfo$IconType = al5Var.a;
        if (beginnersOnboardingModel$ServiceInfo$IconType != BeginnersOnboardingModel$ServiceInfo$IconType.Undefined) {
            addView(getIcon(beginnersOnboardingModel$ServiceInfo$IconType));
        }
    }

    private final Integer getCurrentIcon(BeginnersOnboardingModel$ServiceInfo$IconType iconType) {
        switch (nwq0.a[iconType.ordinal()]) {
            case 1:
                return Integer.valueOf(l1h0.ic_pin);
            case 2:
                return Integer.valueOf(l1h0.ic_ride);
            case 3:
                return Integer.valueOf(l1h0.ic_sell);
            case 4:
                return Integer.valueOf(l1h0.ic_taste);
            case 5:
                return Integer.valueOf(l1h0.ic_delivery);
            default:
                w511.b();
            case 6:
                return null;
        }
    }

    private final AppCompatImageView getIcon(BeginnersOnboardingModel$ServiceInfo$IconType iconType) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams);
        Integer currentIcon = getCurrentIcon(iconType);
        if (currentIcon != null) {
            appCompatImageView.setImageResource(currentIcon.intValue());
        }
        appCompatImageView.setAlpha(0.0f);
        return appCompatImageView;
    }

    private final RobotoTextView getTextView(String name) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setPadding(robotoTextView.getPaddingLeft(), robotoTextView.getPaddingTop(), tje.u(8, robotoTextView.getContext()), robotoTextView.getPaddingBottom());
        robotoTextView.setTextSize(1, 56.0f);
        robotoTextView.setTextColor(this.initialTextColor);
        robotoTextView.setTypeface(this.mainInfoTypeface);
        robotoTextView.setText(name);
        return robotoTextView;
    }

    public final int getIconWidth() {
        View childAt = getChildAt(1);
        if (childAt != null) {
            return childAt.getMeasuredWidth();
        }
        return 0;
    }

    @Override // defpackage.lwq0
    public ImageView getServiceIcon() {
        View childAt = getChildAt(1);
        if (childAt instanceof ImageView) {
            return (ImageView) childAt;
        }
        return null;
    }

    @Override // defpackage.lwq0
    public TextView getServiceName() {
        View childAt = getChildAt(0);
        if (childAt instanceof TextView) {
            return (TextView) childAt;
        }
        return null;
    }

    public final int getTextWidth() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt.getMeasuredWidth();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        h8 h8Var = new h8(3, this);
        int i = 0;
        int i2 = 0;
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            view.measure(widthMeasureSpec, heightMeasureSpec);
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                i2 = measuredHeight;
            }
            i += view.getMeasuredWidth();
        }
        setMeasuredDimension(getPaddingEnd() + getPaddingStart() + i, getPaddingBottom() + getPaddingTop() + i2);
    }
}

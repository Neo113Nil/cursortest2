package com.yandex.go.beginners.presentation.services_info.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.al5;
import defpackage.h8;
import defpackage.uxq0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"8\u0006@BX\u0086.¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010'\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0017R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/yandex/go/beginners/presentation/services_info/views/CommonServicesContainer;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lal5;", "services", "finalServiceScreen", "Lzy11;", "setupServicesInfo", "(Ljava/util/List;Lal5;)V", "Landroid/graphics/Typeface;", "typeface", "setMainInfoTypeface", "(Landroid/graphics/Typeface;)V", "", "updateMainServicePosition", "()Z", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/yandex/go/beginners/presentation/services_info/views/ServicesInfoContainer;", "value", "servicesInfoContainer", "Lcom/yandex/go/beginners/presentation/services_info/views/ServicesInfoContainer;", "getServicesInfoContainer", "()Lcom/yandex/go/beginners/presentation/services_info/views/ServicesInfoContainer;", "Lcom/yandex/go/beginners/presentation/services_info/views/FinalServiceView;", "finalScreen", "Lcom/yandex/go/beginners/presentation/services_info/views/FinalServiceView;", "getFinalScreen", "()Lcom/yandex/go/beginners/presentation/services_info/views/FinalServiceView;", "hasServices", "Z", "getHasServices", "mainInfoTypeface", "Landroid/graphics/Typeface;", "Luxq0;", "servicesCoordinator", "Luxq0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommonServicesContainer extends LinearLayoutCompat {
    public static final int $stable = 8;
    private FinalServiceView finalScreen;
    private boolean hasServices;
    private Typeface mainInfoTypeface;
    private final uxq0 servicesCoordinator;
    private ServicesInfoContainer servicesInfoContainer;

    public CommonServicesContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mainInfoTypeface = Typeface.DEFAULT;
        this.servicesCoordinator = new uxq0();
    }

    public final FinalServiceView getFinalScreen() {
        FinalServiceView finalServiceView = this.finalScreen;
        if (finalServiceView != null) {
            return finalServiceView;
        }
        return null;
    }

    public final boolean getHasServices() {
        return this.hasServices;
    }

    public final ServicesInfoContainer getServicesInfoContainer() {
        ServicesInfoContainer servicesInfoContainer = this.servicesInfoContainer;
        if (servicesInfoContainer != null) {
            return servicesInfoContainer;
        }
        return null;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        h8 h8Var = new h8(3, this);
        int i = 0;
        int i2 = 0;
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                i2 = measuredHeight;
            }
            i += view.getMeasuredWidth();
            view.measure(widthMeasureSpec, heightMeasureSpec);
        }
        setMeasuredDimension(getPaddingEnd() + getPaddingStart() + i, getPaddingBottom() + getPaddingTop() + i2);
    }

    public final void setMainInfoTypeface(Typeface typeface) {
        this.mainInfoTypeface = typeface;
    }

    public final void setupServicesInfo(List<al5> services, al5 finalServiceScreen) {
        removeAllViews();
        this.servicesCoordinator.a = services.size() - 1;
        if (!services.isEmpty()) {
            this.hasServices = true;
            ServicesInfoContainer servicesInfoContainer = new ServicesInfoContainer(getContext(), services, this.mainInfoTypeface, this.servicesCoordinator);
            servicesInfoContainer.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
            this.servicesInfoContainer = servicesInfoContainer;
            addView(getServicesInfoContainer());
        }
        FinalServiceView finalServiceView = new FinalServiceView(getContext(), finalServiceScreen, this.mainInfoTypeface);
        finalServiceView.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
        this.finalScreen = finalServiceView;
        addView(getFinalScreen());
    }

    public final boolean updateMainServicePosition() {
        uxq0 uxq0Var = this.servicesCoordinator;
        int i = uxq0Var.a - 1;
        uxq0Var.a = i;
        return i > 0;
    }

    public CommonServicesContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CommonServicesContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CommonServicesContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

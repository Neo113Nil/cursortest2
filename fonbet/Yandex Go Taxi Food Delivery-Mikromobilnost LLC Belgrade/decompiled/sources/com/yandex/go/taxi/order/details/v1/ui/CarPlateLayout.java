package com.yandex.go.taxi.order.details.v1.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a6j;
import defpackage.bi;
import defpackage.cma1;
import defpackage.kyh0;
import defpackage.n4h0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.ozx;
import defpackage.p8h0;
import defpackage.u08;
import defpackage.vng;
import defpackage.w511;
import defpackage.y5j;
import defpackage.z5j;
import defpackage.zkh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/ui/CarPlateLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "renderEmptyPlate", "()V", "", "mainPart", "region", "renderPlate", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "La6j;", ClidProvider.STATE, "render", "(La6j;)V", "Landroid/view/View$OnClickListener;", "listener", "setCarPlateClickListener", "(Landroid/view/View$OnClickListener;)V", "Lozx;", "binding", "Lozx;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CarPlateLayout extends ConstraintLayout implements nwy0 {
    public static final int $stable = 8;
    private final ozx binding;

    public CarPlateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(zkh0.layout_car_plate, this);
        int i2 = p8h0.car_plate_linear_layout;
        if (((LinearLayoutCompat) cma1.O(i2, this)) != null && (O = cma1.O((i2 = p8h0.car_plate_view), this)) != null) {
            i2 = p8h0.plate_divider_view;
            CarPlateDividerView carPlateDividerView = (CarPlateDividerView) cma1.O(i2, this);
            if (carPlateDividerView != null) {
                i2 = p8h0.plate_text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView != null) {
                    i2 = p8h0.region_text;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                    if (robotoTextView2 != null) {
                        this.binding = new ozx(this, O, carPlateDividerView, robotoTextView, robotoTextView2);
                        androidx.core.view.b.p(O, new bi(getContext().getString(kyh0.open_copy_menu), 1));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void renderEmptyPlate() {
        setVisibility(8);
        ozx ozxVar = this.binding;
        ozxVar.d.setText((CharSequence) null);
        ozxVar.e.setText((CharSequence) null);
    }

    private final void renderPlate(String mainPart, String region) {
        setVisibility(0);
        ozx ozxVar = this.binding;
        RobotoTextView robotoTextView = ozxVar.d;
        RobotoTextView robotoTextView2 = ozxVar.e;
        robotoTextView.setText(mainPart);
        ozxVar.c.setVisibility(region.length() > 0 ? 0 : 8);
        robotoTextView2.setVisibility(region.length() <= 0 ? 8 : 0);
        robotoTextView2.setText(region);
        ozxVar.b.setContentDescription(mainPart + region);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setCarPlateClickListener$lambda$0(View.OnClickListener onClickListener, CarPlateLayout carPlateLayout) {
        onClickListener.onClick(carPlateLayout.binding.d);
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackground(vng.t(n4h0.car_plate_corners, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void render(a6j state) {
        if (state instanceof y5j) {
            y5j y5jVar = (y5j) state;
            renderPlate(y5jVar.a, y5jVar.b);
        } else if (state instanceof z5j) {
            renderEmptyPlate();
        } else {
            w511.b();
        }
    }

    public final void setCarPlateClickListener(View.OnClickListener listener) {
        ru.yandex.taxi.design.utils.c.z(new u08(2, listener, this), this.binding.b);
    }

    public CarPlateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CarPlateLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CarPlateLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

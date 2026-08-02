package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.e;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.nsg0;
import defpackage.q4i0;
import defpackage.tje;
import defpackage.u5p0;
import defpackage.v5p0;
import defpackage.w511;
import defpackage.w5p0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0011\u0010/\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b.\u0010*¨\u00060"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "applySingleConstraints", "()V", "applyDefaultConstraints", "constraintRes", "applyConstraints", "(I)V", "", "title", "subtitle", "price", "setContent", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "clearContent", "Lu5p0;", "layoutConfig", "setLayoutConfig", "(Lu5p0;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lw5p0;", "binding", "Lw5p0;", "Lu5p0;", "itemHeight", CA20Status.STATUS_USER_I, "singleItemHeight", "Lru/yandex/taxi/widget/RobotoTextView;", "getTitleTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "titleTextView", "getSubtitleTextView", "subtitleTextView", "getPriceTextView", "priceTextView", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final w5p0 binding;
    private final int itemHeight;
    private u5p0 layoutConfig;
    private final int singleItemHeight;

    public ScootersTariffView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.binding = w5p0.o(LayoutInflater.from(context), this);
        this.itemHeight = tje.r(nsg0.scooters_tariff_v2_default_height, getContext());
        this.singleItemHeight = tje.u(58, context);
    }

    private final void applyConstraints(int constraintRes) {
        e eVar = new e();
        eVar.q(constraintRes, getContext());
        eVar.b(this);
    }

    private final void applyDefaultConstraints() {
        applyConstraints(q4i0.scooters_tariff_view_default_item_constraints);
    }

    private final void applySingleConstraints() {
        applyConstraints(q4i0.scooters_tariff_view_single_item_constraints);
    }

    public final void clearContent() {
        this.binding.d.setText((CharSequence) null);
        this.binding.c.setText((CharSequence) null);
        this.binding.b.setText((CharSequence) null);
    }

    public final RobotoTextView getPriceTextView() {
        return this.binding.b;
    }

    public final RobotoTextView getSubtitleTextView() {
        return this.binding.c;
    }

    public final RobotoTextView getTitleTextView() {
        return this.binding.d;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int makeMeasureSpec;
        u5p0 u5p0Var = this.layoutConfig;
        if (u5p0Var == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int i = u5p0Var.a;
        int i2 = v5p0.b[u5p0Var.b.ordinal()];
        if (i2 == 1) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else if (i2 == 2) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i / 2, 1073741824);
        } else if (i2 != 3) {
            w511.b();
            return;
        }
        int i3 = v5p0.a[u5p0Var.c.ordinal()];
        if (i3 == 1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.singleItemHeight, 1073741824);
        } else {
            if (i3 != 2) {
                w511.b();
                return;
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.itemHeight, 1073741824);
        }
        super.onMeasure(widthMeasureSpec, makeMeasureSpec);
    }

    public final void setContent(CharSequence title, CharSequence subtitle, CharSequence price) {
        this.binding.d.setText(title);
        this.binding.c.setText(subtitle);
        this.binding.b.setText(price);
    }

    public final void setLayoutConfig(u5p0 layoutConfig) {
        this.layoutConfig = layoutConfig;
        if (layoutConfig == null) {
            return;
        }
        int i = v5p0.a[layoutConfig.c.ordinal()];
        if (i == 1) {
            applySingleConstraints();
        } else if (i == 2) {
            applyDefaultConstraints();
        } else {
            w511.b();
        }
    }

    public ScootersTariffView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersTariffView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersTariffView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersTariffView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}

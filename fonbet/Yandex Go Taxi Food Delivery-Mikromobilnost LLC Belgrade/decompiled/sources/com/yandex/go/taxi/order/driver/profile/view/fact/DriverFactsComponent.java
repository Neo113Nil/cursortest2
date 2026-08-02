package com.yandex.go.taxi.order.driver.profile.view.fact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/taxi/order/driver/profile/view/fact/DriverFactsComponent;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "", "Lcom/yandex/go/taxi/order/models/api/objects/Driver$ProfileFact;", "profileFacts", "setFacts", "(Ljava/util/List;)V", "Lcom/yandex/go/taxi/order/driver/profile/view/fact/DriverFactsLinearLayout;", "viewHolder", "Lcom/yandex/go/taxi/order/driver/profile/view/fact/DriverFactsLinearLayout;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DriverFactsComponent extends HorizontalScrollView {
    public static final int $stable = 8;
    private final DriverFactsLinearLayout viewHolder;

    public DriverFactsComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DriverFactsLinearLayout driverFactsLinearLayout = new DriverFactsLinearLayout(context);
        this.viewHolder = driverFactsLinearLayout;
        addView(driverFactsLinearLayout);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824) {
            this.viewHolder.setVisibleWidth(View.MeasureSpec.getSize(widthMeasureSpec));
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setFacts(List<Driver.ProfileFact> profileFacts) {
        for (Driver.ProfileFact profileFact : profileFacts) {
            if (profileFact.a.length() > 0 && profileFact.b.length() > 0) {
                this.viewHolder.addView(new DriverFactItem(getContext(), profileFact));
            }
        }
    }

    public DriverFactsComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DriverFactsComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DriverFactsComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

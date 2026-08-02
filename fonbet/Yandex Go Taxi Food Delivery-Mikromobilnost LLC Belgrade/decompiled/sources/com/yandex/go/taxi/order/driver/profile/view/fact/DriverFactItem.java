package com.yandex.go.taxi.order.driver.profile.view.fact;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import defpackage.cma1;
import defpackage.him;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.vng;
import defpackage.zkh0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/taxi/order/driver/profile/view/fact/DriverFactItem;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/order/models/api/objects/Driver$ProfileFact;", "profileFact", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/order/models/api/objects/Driver$ProfileFact;)V", "Lhim;", "binding", "Lhim;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DriverFactItem extends FrameLayout {
    public static final int $stable = 8;
    private final him binding;

    public DriverFactItem(Context context, Driver.ProfileFact profileFact) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(zkh0.driver_fact_item, (ViewGroup) this, false);
        addView(inflate);
        int i = p8h0.subtitle;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = p8h0.title;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView2 != null) {
                this.binding = new him((LinearLayout) inflate, robotoTextView, robotoTextView2);
                robotoTextView2.setText(profileFact.a);
                robotoTextView.setText(profileFact.b);
                if (profileFact.c) {
                    robotoTextView2.setCompoundDrawablesWithIntrinsicBounds(vng.t(n4h0.ic_palm_shape_left, context), (Drawable) null, vng.t(n4h0.ic_palm_shape_right, context), (Drawable) null);
                    return;
                }
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }
}

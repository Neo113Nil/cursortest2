package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.h8;
import defpackage.mvg0;
import defpackage.scc;
import defpackage.vng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/icons/ProductIconsLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "changed", "l", "t", "r", "b", "Lzy11;", "onLayout", "(ZIIII)V", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductIconsLayout extends LinearLayout {
    public /* synthetic */ ProductIconsLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        List list;
        super.onLayout(changed, l, t, r, b);
        int i = 1;
        int i2 = getLayoutDirection() == 0 ? 1 : -1;
        h8 h8Var = new h8(3, this);
        if (h8Var.hasNext()) {
            Object next = h8Var.next();
            if (h8Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (h8Var.hasNext()) {
                    arrayList.add(h8Var.next());
                }
                list = arrayList;
            } else {
                list = Collections.singletonList(next);
            }
        } else {
            list = EmptyList.a;
        }
        int f = scc.f(list);
        if (1 > f) {
            return;
        }
        while (true) {
            View view = (View) list.get(i);
            int s = vng.s(mvg0.acquisition_sdk_dimension_size_65, getContext()) * i2 * i;
            view.layout(view.getLeft() - s, view.getTop(), view.getRight() - s, view.getBottom());
            if (i == f) {
                return;
            } else {
                i++;
            }
        }
    }

    public ProductIconsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ProductIconsLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ProductIconsLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public ProductIconsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(0);
    }
}

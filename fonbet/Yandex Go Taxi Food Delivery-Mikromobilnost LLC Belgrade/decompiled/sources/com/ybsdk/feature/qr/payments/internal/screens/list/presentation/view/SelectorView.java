package com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.cma1;
import defpackage.hbv;
import defpackage.iyg0;
import defpackage.j461;
import defpackage.ny61;
import defpackage.pbh0;
import defpackage.tmq0;
import defpackage.v4b1;
import defpackage.vng;
import defpackage.znh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/list/presentation/view/SelectorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltmq0;", ClidProvider.STATE, "Lhbv;", "render", "(Ltmq0;)Lhbv;", "Lj461;", "binding", "Lj461;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectorView extends LinearLayout {
    private final j461 binding;

    public SelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(znh0.ybsdk_product_selector_view, this);
        int i2 = pbh0.productVewIcon;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = pbh0.productViewTitle;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                this.binding = new j461(this, imageView, textView);
                setOrientation(0);
                setGravity(16);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final hbv render(tmq0 state) {
        j461 j461Var = this.binding;
        setBackground(vng.t(state.d ? iyg0.ybsdk_product_selector_selected_background : iyg0.ybsdk_product_selector_not_selected_background, getContext()));
        j461Var.c.setText(state.b);
        return v4b1.k(state.c, j461Var.b, null, null, 6);
    }

    public SelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SelectorView(Context context) {
        this(context, null, 0, 6, null);
    }
}

package com.ybsdk.core.transfer.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.utils.text.d;
import defpackage.cma1;
import defpackage.mah0;
import defpackage.ny61;
import defpackage.q061;
import defpackage.sm91;
import defpackage.umh0;
import defpackage.v4b1;
import defpackage.x49;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/core/transfer/utils/CashbackView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lx49;", ClidProvider.STATE, "Lzy11;", "render", "(Lx49;)V", "Lq061;", "binding", "Lq061;", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CashbackView extends LinearLayout {
    private final q061 binding;

    public CashbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(umh0.ybsdk_cashback_view, this);
        int i2 = mah0.cashbackViewImage;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = mah0.cashbackViewLeftText;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = mah0.cashbackViewRightText;
                TextView textView2 = (TextView) cma1.O(i2, this);
                if (textView2 != null) {
                    this.binding = new q061(this, imageView, textView, textView2);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(x49 state) {
        q061 q061Var = this.binding;
        v4b1.k(state.c, q061Var.b, null, null, 6);
        q061Var.c.setText(d.a(sm91.c(q061Var), state.a));
        q061Var.d.setText(d.a(sm91.c(q061Var), state.b));
    }

    public CashbackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CashbackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CashbackView(Context context) {
        this(context, null, 0, 6, null);
    }
}

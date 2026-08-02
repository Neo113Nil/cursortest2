package com.ybsdk.widgets.common.paymentmethod;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.utils.text.d;
import defpackage.a451;
import defpackage.cb61;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.ny61;
import defpackage.poh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/widgets/common/paymentmethod/WidgetSbpView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "La451;", ClidProvider.STATE, "Lzy11;", "render", "(La451;)V", "Lcb61;", "binding", "Lcb61;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WidgetSbpView extends LinearLayout {
    private final cb61 binding;

    public WidgetSbpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_widget_sbp_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.widget_sbp_text_primary;
        AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, inflate);
        if (appCompatTextView != null) {
            i2 = fch0.widget_sbp_text_secondary;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                this.binding = new cb61((LinearLayout) inflate, appCompatTextView, textView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(a451 state) {
        cb61 cb61Var = this.binding;
        cb61Var.b.setText(d.a(getContext(), null));
        TextView textView = cb61Var.c;
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
    }

    public WidgetSbpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WidgetSbpView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public WidgetSbpView(Context context) {
        this(context, null, 0, 6, null);
    }
}

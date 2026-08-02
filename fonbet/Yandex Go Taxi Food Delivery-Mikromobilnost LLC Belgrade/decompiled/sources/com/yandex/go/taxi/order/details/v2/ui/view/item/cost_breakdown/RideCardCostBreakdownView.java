package com.yandex.go.taxi.order.details.v2.ui.view.item.cost_breakdown;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.mfk0;
import defpackage.mrg0;
import defpackage.nfk0;
import defpackage.scc;
import defpackage.tje;
import defpackage.xng0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/cost_breakdown/RideCardCostBreakdownView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "index", "Lmfk0;", "item", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/cost_breakdown/CostDetailsView;", "getCostDetailView", "(ILmfk0;)Lcom/yandex/go/taxi/order/details/v2/ui/view/item/cost_breakdown/CostDetailsView;", "", "extraMessage", "Landroid/widget/TextView;", "getExtraMessageView", "(Ljava/lang/String;)Landroid/widget/TextView;", "Lnfk0;", "uiState", "Lzy11;", "render", "(Lnfk0;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardCostBreakdownView extends GoLinearLayout {
    public static final int $stable = 8;

    public /* synthetic */ RideCardCostBreakdownView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final CostDetailsView getCostDetailView(int index, mfk0 item) {
        CostDetailsView costDetailsView = new CostDetailsView(getContext(), null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        if (index > 0) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, tje.u(10, costDetailsView.getContext()), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        costDetailsView.setLayoutParams(marginLayoutParams);
        costDetailsView.setData(item.a, item.b);
        return costDetailsView;
    }

    private final TextView getExtraMessageView(String extraMessage) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        robotoTextView.setPadding(robotoTextView.getPaddingLeft(), tje.u(8, robotoTextView.getContext()), robotoTextView.getPaddingRight(), robotoTextView.getPaddingBottom());
        robotoTextView.setTextColorAttr(xng0.textMinor);
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_caption, robotoTextView.getContext()));
        robotoTextView.setMaxLines(2);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        robotoTextView.setText(extraMessage);
        return robotoTextView;
    }

    public final void render(nfk0 uiState) {
        removeAllViews();
        Iterator it = uiState.c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                String str = uiState.d;
                String str2 = str.length() != 0 ? str : null;
                if (str2 == null) {
                    return;
                }
                addView(getExtraMessageView(str2));
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            addView(getCostDetailView(i, (mfk0) next));
            i = i2;
        }
    }

    public RideCardCostBreakdownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RideCardCostBreakdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
    }

    public RideCardCostBreakdownView(Context context) {
        this(context, null, 0, 6, null);
    }
}

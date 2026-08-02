package com.yandex.go.taxi.order.details.v2.ui.view.item.cost_breakdown;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.cma1;
import defpackage.kye;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.szx;
import defpackage.zkh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/cost_breakdown/CostDetailsView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "", "text", "", "measureTextWidth", "(Landroid/widget/TextView;Ljava/lang/String;)F", "costName", "price", "Lzy11;", "setData", "(Ljava/lang/String;Ljava/lang/String;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lszx;", "binding", "Lszx;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "Ljava/lang/StringBuilder;", "Companion", "kye", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CostDetailsView extends GoConstraintLayout {
    public static final int $stable = 8;
    private static final kye Companion = new kye();
    private static final String SINGLE_DOT = ".";
    private final szx binding;
    private final StringBuilder builder;

    public CostDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(zkh0.layout_cost_detail_view, this);
        int i2 = p8h0.cost_name_text_view;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
        if (robotoTextView != null) {
            i2 = p8h0.price_text_view;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView2 != null) {
                this.binding = new szx(this, robotoTextView, robotoTextView2);
                this.builder = new StringBuilder();
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final float measureTextWidth(TextView textView, String str) {
        return textView.getPaint().measureText(str);
    }

    public static /* synthetic */ float measureTextWidth$default(CostDetailsView costDetailsView, TextView textView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textView.getText().toString();
        }
        return costDetailsView.measureTextWidth(textView, str);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        szx szxVar = this.binding;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        float measureTextWidth$default = measureTextWidth$default(this, szxVar.b, null, 1, null);
        RobotoTextView robotoTextView = szxVar.b;
        float measuredWidth = ((getMeasuredWidth() - measureTextWidth$default) - measureTextWidth$default(this, szxVar.c, null, 1, null)) / measureTextWidth(robotoTextView, ".");
        int i = 0;
        this.builder.setLength(0);
        this.builder.append(robotoTextView.getText());
        int i2 = (int) measuredWidth;
        while (true) {
            StringBuilder sb = this.builder;
            if (i >= i2) {
                robotoTextView.setText(sb.toString());
                return;
            } else {
                sb.append(".");
                i++;
            }
        }
    }

    public final void setData(String costName, String price) {
        this.binding.b.setText(costName);
        this.binding.c.setText(price);
        setContentDescription(costName + " " + price);
    }

    public CostDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CostDetailsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CostDetailsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

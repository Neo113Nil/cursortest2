package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bpk0;
import defpackage.fpk0;
import defpackage.khz0;
import defpackage.kyh0;
import defpackage.okz0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.usg0;
import defpackage.wug0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.toggle_buttons.ToggleButtonsView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/tips_selector/TipsWishSelectorView;", "Lru/yandex/taxi/widget/toggle_buttons/ToggleButtonsView;", "Lfpk0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lzy11;", "updateShadowColor", "(I)V", "", "Lbpk0;", "elements", "updateTips", "(Ljava/util/List;)V", "bottom", "updateBottomPadding", "", "numericTipsTextSize", "F", "textTipsTextSize", "tipsShadowWidth", "Lkhz0;", "shadowDecoration", "Lkhz0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsWishSelectorView extends ToggleButtonsView<fpk0> {
    public static final int $stable = 8;
    private final float numericTipsTextSize;
    private final khz0 shadowDecoration;
    private final float textTipsTextSize;
    private final float tipsShadowWidth;

    public TipsWishSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, false, 8, null);
        this.numericTipsTextSize = getResources().getDimension(usg0.text_tips_text_size);
        this.textTipsTextSize = getResources().getDimension(usg0.numeric_tips_text_size);
        float dimension = getResources().getDimension(wug0.tips_wish_selector_shadow_width);
        this.tipsShadowWidth = dimension;
        khz0 khz0Var = new khz0((int) dimension);
        this.shadowDecoration = khz0Var;
        getRecyclerView().setContentDescription(context.getString(kyh0.tips_view_title));
        getRecyclerView().setNestedScrollingEnabled(false);
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setPadding(recyclerView.getPaddingLeft(), tje.r(wug0.tips_wish_selector_tips_top_padding, getContext()), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        getRecyclerView().addItemDecoration(khz0Var);
        getRecyclerView().setOverScrollMode(2);
    }

    public final void updateBottomPadding(int bottom) {
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), bottom);
    }

    public final void updateShadowColor(int color) {
        khz0 khz0Var = this.shadowDecoration;
        khz0Var.w = color;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{khz0Var.w, 0});
        khz0Var.b = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        gradientDrawable2.setColors(new int[]{khz0Var.w, 0});
        khz0Var.c = gradientDrawable2;
        getRecyclerView().invalidate();
    }

    public final void updateTips(List<bpk0> elements) {
        List<bpk0> list = elements;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (bpk0 bpk0Var : list) {
            arrayList.add(new fpk0(bpk0Var.a, bpk0Var.b, new okz0(bpk0Var.e != null ? this.numericTipsTextSize : this.textTipsTextSize), bpk0Var.f, bpk0Var.c, bpk0Var.d));
        }
        setModelsGroup(arrayList);
    }

    public TipsWishSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TipsWishSelectorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TipsWishSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

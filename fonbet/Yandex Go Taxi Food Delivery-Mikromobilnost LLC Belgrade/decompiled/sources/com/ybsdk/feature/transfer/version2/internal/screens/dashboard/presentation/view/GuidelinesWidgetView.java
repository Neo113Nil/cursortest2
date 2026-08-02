package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import defpackage.cch0;
import defpackage.cma1;
import defpackage.kp50;
import defpackage.la61;
import defpackage.n4u;
import defpackage.noh0;
import defpackage.ny61;
import defpackage.p4u;
import defpackage.q4u;
import defpackage.s1r;
import defpackage.tls;
import defpackage.xty0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002\u0016\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/view/GuidelinesWidgetView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/Space;", "createSpacerView", "()Landroid/widget/Space;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/view/GuidelineItemView;", "createGuidelineItemView", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/view/GuidelineItemView;", "Lkotlin/Function1;", "Ln4u;", "Lzy11;", "listener", "setOnItemClickListener", "(Ltls;)V", "Lq4u;", ClidProvider.STATE, "render", "(Lq4u;)V", "Lla61;", "binding", "Lla61;", "onItemClickListener", "Ltls;", "currentState", "Lq4u;", "Companion", "p4u", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuidelinesWidgetView extends LinearLayout {
    private static final p4u Companion = new p4u();
    private static final int GUIDELINE_ITEM_H_MARGIN = kp50.r(2);
    private final la61 binding;
    private q4u currentState;
    private tls onItemClickListener;

    public GuidelinesWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(noh0.ybsdk_transfers_dashboard_guidelines_widget, this);
        int i2 = cch0.itemsContainer;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
        if (linearLayout != null) {
            i2 = cch0.widgetTitle;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                this.binding = new la61(this, linearLayout, textView);
                setOrientation(1);
                setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final GuidelineItemView createGuidelineItemView() {
        GuidelineItemView guidelineItemView = new GuidelineItemView(getContext(), null, 0, 6, null);
        guidelineItemView.setOnClickListener(new s1r(28, this));
        ViewGroup.LayoutParams layoutParams = guidelineItemView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            return null;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int i = GUIDELINE_ITEM_H_MARGIN;
        layoutParams2.leftMargin = i;
        layoutParams2.rightMargin = i;
        guidelineItemView.setLayoutParams(layoutParams2);
        return guidelineItemView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createGuidelineItemView$lambda$6$lambda$4(GuidelinesWidgetView guidelinesWidgetView, n4u n4uVar) {
        tls tlsVar = guidelinesWidgetView.onItemClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(n4uVar);
        }
        return zy11.a;
    }

    private final Space createSpacerView() {
        Space space = new Space(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        space.setLayoutParams(layoutParams);
        return space;
    }

    public final void render(q4u state) {
        ArrayList<n4u> arrayList = state.b;
        if (state.equals(this.currentState)) {
            return;
        }
        la61 la61Var = this.binding;
        TextView textView = la61Var.c;
        LinearLayout linearLayout = la61Var.b;
        xty0.d(textView, state.a);
        linearLayout.removeAllViews();
        if (!arrayList.isEmpty()) {
            linearLayout.addView(createSpacerView());
            for (n4u n4uVar : arrayList) {
                GuidelineItemView createGuidelineItemView = createGuidelineItemView();
                createGuidelineItemView.render(n4uVar);
                linearLayout.addView(createGuidelineItemView);
            }
            linearLayout.addView(createSpacerView());
        }
        this.currentState = state;
    }

    public final void setOnItemClickListener(tls listener) {
        this.onItemClickListener = listener;
    }

    public GuidelinesWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ GuidelinesWidgetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public GuidelinesWidgetView(Context context) {
        this(context, null, 0, 6, null);
    }
}

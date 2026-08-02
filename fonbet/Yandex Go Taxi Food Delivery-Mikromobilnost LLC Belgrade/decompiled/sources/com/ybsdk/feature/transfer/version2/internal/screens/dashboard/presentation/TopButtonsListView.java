package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.jl40;
import defpackage.jo01;
import defpackage.jr31;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.s5r;
import defpackage.scc;
import defpackage.tja1;
import defpackage.tls;
import defpackage.y7z0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001d\u001a\u00020\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001f¢\u0006\u0004\b!\u0010\"R0\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b$\u0010%\"\u0004\b&\u0010\"R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'¨\u0006("}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TopButtonsListView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "syncItemsAndViews", "()V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardButtonView;", "createView", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardButtonView;", "bindViews", "view", "Ljo01;", "item", "index", "bindView", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardButtonView;Ljo01;I)V", "count", "addChildren", "(I)V", "removeLastChildren", "Lkotlin/Function1;", "listener", "setClickListener", "(Ltls;)V", "", Constants.KEY_DATA, "setData", "(Ljava/util/List;)V", "value", "items", "Ljava/util/List;", "setItems", "Ltls;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopButtonsListView extends LinearLayout {
    private List<jo01> items;
    private tls listener;

    public static final class a implements tls {
        public static final a a = new a();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof TransfersDashboardButtonView);
        }
    }

    public /* synthetic */ TopButtonsListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void addChildren(int count) {
        for (int i = 0; i < count; i++) {
            addView(createView());
        }
    }

    private final void bindView(TransfersDashboardButtonView view, jo01 item, int index) {
        view.getWrappedButton().render(item.a);
        view.getWrappedButton().setOnClickListener(new y7z0(3, this, item));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(index > 0 ? kp50.r(8) : 0);
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4$lambda$2(TopButtonsListView topButtonsListView, jo01 jo01Var, View view) {
        tls tlsVar = topButtonsListView.listener;
        if (tlsVar != null) {
            tlsVar.invoke(jo01Var);
        }
    }

    private final void bindViews() {
        int i = 0;
        s5r s5rVar = new s5r(b.g(new jr31(this, 0), a.a));
        while (s5rVar.hasNext()) {
            Object next = s5rVar.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            TransfersDashboardButtonView transfersDashboardButtonView = (TransfersDashboardButtonView) next;
            jo01 jo01Var = (jo01) kotlin.collections.a.S(i, this.items);
            if (jo01Var != null) {
                bindView(transfersDashboardButtonView, jo01Var, i);
            }
            i = i2;
        }
    }

    private final TransfersDashboardButtonView createView() {
        TransfersDashboardButtonView transfersDashboardButtonView = new TransfersDashboardButtonView(getContext(), null, 0, 6, null);
        transfersDashboardButtonView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        transfersDashboardButtonView.setImportantForAccessibility(1);
        tja1.b(transfersDashboardButtonView);
        transfersDashboardButtonView.setFocusable(true);
        return transfersDashboardButtonView;
    }

    private final void removeLastChildren(int count) {
        int childCount = getChildCount() - 1;
        int childCount2 = getChildCount() - count;
        if (childCount2 > childCount) {
            return;
        }
        while (true) {
            removeView(getChildAt(childCount));
            if (childCount == childCount2) {
                return;
            } else {
                childCount--;
            }
        }
    }

    private final void setItems(List<jo01> list) {
        if (jl40.l(this.items, list)) {
            return;
        }
        this.items = list;
        syncItemsAndViews();
    }

    private final void syncItemsAndViews() {
        int childCount = getChildCount() - this.items.size();
        if (childCount > 0) {
            removeLastChildren(childCount);
        } else if (childCount < 0) {
            addChildren(-childCount);
        }
        bindViews();
    }

    public final void setClickListener(tls listener) {
        this.listener = listener;
    }

    public final void setData(List<jo01> data) {
        setItems(data);
    }

    public TopButtonsListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TopButtonsListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TopButtonsListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.items = EmptyList.a;
    }
}

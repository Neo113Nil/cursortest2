package com.yandex.go.superapp.order.multi.old.view;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cz2;
import defpackage.gy70;
import defpackage.kc80;
import defpackage.l601;
import defpackage.nc80;
import defpackage.oc80;
import defpackage.op70;
import defpackage.pc80;
import defpackage.rr00;
import defpackage.t1w;
import defpackage.tje;
import defpackage.ttg0;
import defpackage.zl70;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0014¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020,H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0014H\u0016¢\u0006\u0004\b2\u0010\u0018J\u000f\u00103\u001a\u00020\u0014H\u0016¢\u0006\u0004\b3\u0010\u0018J\u000f\u00104\u001a\u00020\u0014H\u0016¢\u0006\u0004\b4\u0010\u0018J\u000f\u00105\u001a\u00020\u0014H\u0016¢\u0006\u0004\b5\u0010\u0018J\u0019\u00108\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0014H\u0016¢\u0006\u0004\b:\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010BR\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/yandex/go/superapp/order/multi/old/view/OrdersListViewImpl;", "Landroidx/recyclerview/widget/RecyclerView;", "Lnc80;", "Loc80;", "Landroid/app/Activity;", "context", "Lcom/yandex/go/superapp/order/multi/old/h;", "presenter", "Lgy70;", "orderItemTypeProvider", "<init>", "(Landroid/app/Activity;Lcom/yandex/go/superapp/order/multi/old/h;Lgy70;)V", "", "realHeight", "", "rate", "calculateCollapseHeight", "(IF)I", "Lt1w;", "insets", "Lzy11;", "insetsType", "(Lt1w;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "collapseRate", "getHeight", "(F)I", "setCollapseRate", "(F)V", "widthSpec", "heightSpec", "onMeasure", "(II)V", "", "Lrr00;", "orders", "updateOrders", "(Ljava/util/List;)V", "minHeight", "setMinHeight", "(I)V", "newState", "", "movedByUser", "onListStateChanged", "(IZ)V", "topItemIsCompletelyVisible", "()Z", "scrollToTop", "forceScrollToTop", "resume", "pause", "Ljava/lang/Runnable;", "refreshListener", "setPullToRefreshListener", "(Ljava/lang/Runnable;)V", "disableNestedScrolling", "Lcom/yandex/go/superapp/order/multi/old/h;", "Lzl70;", "ordersAdapter", "Lzl70;", "isHeightChangesSupported", "Z", "F", CA20Status.STATUS_USER_I, "maxHeight", "Lkc80;", "decorator", "Lkc80;", "Landroidx/recyclerview/widget/RecyclerView$g;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrdersListViewImpl extends RecyclerView implements nc80, oc80 {
    private kc80 decorator;
    private final boolean isHeightChangesSupported;
    private int maxHeight;
    private int minHeight;
    private final RecyclerView.g onScrollListener;
    private final zl70 ordersAdapter;
    private final com.yandex.go.superapp.order.multi.old.h presenter;
    private float rate;

    public OrdersListViewImpl(Activity activity, com.yandex.go.superapp.order.multi.old.h hVar, gy70 gy70Var) {
        super(activity);
        this.presenter = hVar;
        zl70 zl70Var = new zl70(gy70Var.a("multiorder", l601.a, hVar.H));
        this.ordersAdapter = zl70Var;
        this.isHeightChangesSupported = hVar.I;
        this.rate = 1.0f;
        this.onScrollListener = new pc80(this);
        setLayoutManager(new LinearLayoutManager(activity, 1, false));
        setItemAnimator(null);
        int r = tje.r(ttg0.order_list_view_padding, getContext());
        kc80 kc80Var = new kc80(r, r);
        this.decorator = kc80Var;
        addItemDecoration(kc80Var);
        setAdapter(zl70Var);
        setImportantForAccessibility(1);
    }

    private final int calculateCollapseHeight(int realHeight, float rate) {
        return Math.min((int) (realHeight - (Math.abs(realHeight - this.minHeight) * rate)), realHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateOrders$lambda$0(OrdersListViewImpl ordersListViewImpl) {
        if (ordersListViewImpl.rate == 1.0f && ordersListViewImpl.isHeightChangesSupported) {
            ordersListViewImpl.scrollToTop();
            ordersListViewImpl.setOnTouchListener(new cz2(7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateOrders$lambda$0$0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // defpackage.oc80
    public void disableNestedScrolling() {
        setNestedScrollingEnabled(false);
    }

    @Override // defpackage.oc80
    public void forceScrollToTop() {
        scrollToPosition(0);
    }

    @Override // defpackage.oc80
    public int getHeight(float collapseRate) {
        return this.isHeightChangesSupported ? calculateCollapseHeight(this.maxHeight, collapseRate) : getHeight();
    }

    @Override // defpackage.oc80
    public View getView() {
        return this;
    }

    @Override // defpackage.oc80
    public void insetsType(t1w insets) {
        int r = tje.r(ttg0.order_list_view_padding, getContext());
        removeItemDecoration(this.decorator);
        kc80 kc80Var = new kc80(r, insets.g + r);
        this.decorator = kc80Var;
        addItemDecoration(kc80Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.yandex.go.superapp.order.multi.old.h hVar = this.presenter;
        hVar.Bg(this);
        hVar.B.b();
        addOnScrollListener(this.onScrollListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        removeOnScrollListener(this.onScrollListener);
    }

    @Override // defpackage.oc80
    public void onListStateChanged(int newState, boolean movedByUser) {
        this.presenter.A.c(newState, movedByUser);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, heightSpec);
        this.maxHeight = getMeasuredHeight();
        if (this.isHeightChangesSupported) {
            setMeasuredDimension(getMeasuredWidth(), calculateCollapseHeight(getMeasuredHeight(), this.rate));
        }
    }

    @Override // defpackage.oc80
    public void pause() {
        this.presenter.pause();
    }

    @Override // defpackage.oc80
    public void resume() {
        this.presenter.resume();
    }

    @Override // defpackage.oc80
    public void scrollToTop() {
        scrollToPosition(0);
    }

    @Override // defpackage.nc80
    public void setCollapseRate(float rate) {
        int i;
        if (this.rate == rate) {
            return;
        }
        this.rate = rate;
        if (!this.isHeightChangesSupported || (i = this.maxHeight) == 0 || calculateCollapseHeight(i, rate) == getHeight()) {
            return;
        }
        requestLayout();
    }

    @Override // defpackage.nc80
    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public void setPullToRefreshListener(Runnable refreshListener) {
    }

    @Override // defpackage.oc80
    public boolean topItemIsCompletelyVisible() {
        RecyclerView.e layoutManager = getLayoutManager();
        return (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).H1() == 0;
    }

    @Override // defpackage.nc80
    public void updateOrders(List<? extends rr00> orders) {
        this.ordersAdapter.submitList(orders, new op70(10, this));
    }
}

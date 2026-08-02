package com.yandex.go.order.bundle.map.impl.ui;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.czo0;
import defpackage.gy70;
import defpackage.hbp0;
import defpackage.k601;
import defpackage.mrg0;
import defpackage.rr00;
import defpackage.tje;
import defpackage.vez0;
import defpackage.w201;
import defpackage.xu6;
import defpackage.yaf0;
import defpackage.zl70;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/order/bundle/map/impl/ui/BundledOrderListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Lgy70;", "orderItemTypeProvider", "Lcom/yandex/go/order/bundle/map/impl/ui/e;", "bundledOrderListViewModel", "Lyaf0;", MetaDataField.SCREEN_FIELD, "", "bundlerId", "", "Lw201;", "trackings", "<init>", "(Landroid/content/Context;Lgy70;Lcom/yandex/go/order/bundle/map/impl/ui/e;Lyaf0;Ljava/lang/String;Ljava/util/List;)V", "Lrr00;", "orders", "Lzy11;", "showOrders", "(Ljava/util/List;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/order/bundle/map/impl/ui/e;", "Lyaf0;", "Ljava/lang/String;", "Ljava/util/List;", "Lzl70;", "ordersAdapter", "Lzl70;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BundledOrderListView extends RecyclerView {
    private final e bundledOrderListViewModel;
    private final String bundlerId;
    private final zl70 ordersAdapter;
    private final hbp0 scopeDelegate;
    private final yaf0 screen;
    private final List<w201> trackings;

    /* JADX WARN: Multi-variable type inference failed */
    public BundledOrderListView(Context context, gy70 gy70Var, e eVar, yaf0 yaf0Var, String str, List<? extends w201> list) {
        super(context);
        this.bundledOrderListViewModel = eVar;
        this.screen = yaf0Var;
        this.bundlerId = str;
        this.trackings = list;
        this.scopeDelegate = new hbp0(new czo0(14), "BundledOrderListView", null);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        zl70 zl70Var = new zl70(gy70Var.a(vez0.D(yaf0Var), new k601(str), eVar.i));
        this.ordersAdapter = zl70Var;
        setItemAnimator(null);
        setAdapter(zl70Var);
        setClipToPadding(false);
        addItemDecoration(new xu6(tje.r(mrg0.go_design_s_space, context)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOrders(List<? extends rr00> orders) {
        this.ordersAdapter.submitList(orders, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.bundledOrderListViewModel;
        yaf0 yaf0Var = this.screen;
        String str = this.bundlerId;
        List<w201> list = this.trackings;
        eVar.getClass();
        eVar.h = list == null ? EmptyList.a : list;
        eVar.e.a();
        tje.N(eVar.e.c(), null, null, new BundledOrderListViewModel$listenOrders$1(eVar, yaf0Var, str, list, null), 3);
        this.scopeDelegate.a();
        tje.N(this.scopeDelegate.c(), null, null, new BundledOrderListView$onAttachedToWindow$1(this, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.scopeDelegate.b();
        e eVar = this.bundledOrderListViewModel;
        eVar.h = EmptyList.a;
        eVar.e.b();
        super.onDetachedFromWindow();
    }
}

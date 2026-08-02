package com.yandex.go.chargers.order.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b64;
import defpackage.bca;
import defpackage.cca;
import defpackage.cma1;
import defpackage.eca;
import defpackage.em9;
import defpackage.g0c;
import defpackage.h3x;
import defpackage.he7;
import defpackage.iws;
import defpackage.jau;
import defpackage.lgp;
import defpackage.lj1;
import defpackage.mtw;
import defpackage.ny61;
import defpackage.pba;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.thh0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tsh0;
import defpackage.uba;
import defpackage.uyj;
import defpackage.vba;
import defpackage.xba;
import defpackage.zba;
import defpackage.zxs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/chargers/order/details/ChargersOrderDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvba;", "Landroid/content/Context;", "context", "Lzba;", "chargersOrderDetailsPresenter", "<init>", "(Landroid/content/Context;Lzba;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvba;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lzba;", "Lpba;", "itemsAdapter", "Lpba;", "uba", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrderDetailsModalView extends SlideableBindingModalView<vba> {
    private final zba chargersOrderDetailsPresenter;
    private final pba itemsAdapter;

    public ChargersOrderDetailsModalView(Context context, zba zbaVar) {
        super(context);
        this.chargersOrderDetailsPresenter = zbaVar;
        int i = jau.S;
        g0c a = qoi0.a(bca.class);
        lj1 lj1Var = new lj1(context, 14);
        iws iwsVar = new iws(13);
        zxs zxsVar = new zxs(a.a(), 0, lj1Var, EmptyList.a, new he7(1, iwsVar), null);
        int i2 = h3x.S;
        g0c a2 = qoi0.a(cca.class);
        lj1 lj1Var2 = new lj1(context, 18);
        mtw mtwVar = new mtw(4);
        int i3 = 3;
        pba pbaVar = new pba(scc.g(zxsVar, new zxs(a2.a(), 0, lj1Var2, scc.g(new lgp(ItemViewHolder$Companion$itemType$3.b, ItemViewHolder$Companion$itemType$4.b, i3), new lgp(ItemViewHolder$Companion$itemType$5.b, ItemViewHolder$Companion$itemType$6.b, i3)), new he7(1, mtwVar), null)));
        this.itemsAdapter = pbaVar;
        RecyclerView recyclerView = getBinding().b;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(pbaVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vba bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tsh0.chargers_order_details_modal_view, parent, false);
        int i = thh0.items_recycler_view;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            return new vba((FrameLayout) inflate, recyclerView);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        zba zbaVar = this.chargersOrderDetailsPresenter;
        zbaVar.Bg(new uba(this));
        em9 em9Var = zbaVar.x;
        em9Var.a.a("Chargers.OrderDetails.Shown", b64.w(em9Var), 1, new HashMap());
        eca ecaVar = zbaVar.z;
        tpr t = kotlinx.coroutines.flow.e.t(new m0(ecaVar.b.a(), new e(new g(kotlinx.coroutines.flow.e.d(ecaVar.d.d), zbaVar.A)), new ChargersOrderDetailsUiStateInteractor$uiStateFlow$2(ecaVar, null)));
        ecaVar.a.getClass();
        tje.N(zbaVar.Jg(), null, null, new ChargersOrderDetailsPresenter$listenUiState$$inlined$collectIn$1(new o(kotlinx.coroutines.flow.e.F(t, uyj.a), new ChargersOrderDetailsPresenter$listenUiState$1(zbaVar, null)), null, (xba) zbaVar.Dg()), 3);
        tje.N(zbaVar.Jg(), null, null, new ChargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1(new o(new c(kotlinx.coroutines.flow.e.d(zbaVar.y.d), zbaVar), new ChargersOrderDetailsPresenter$listenOrderStatusForNavigating$2(zbaVar, null)), null, zbaVar), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chargersOrderDetailsPresenter.Cg();
    }
}

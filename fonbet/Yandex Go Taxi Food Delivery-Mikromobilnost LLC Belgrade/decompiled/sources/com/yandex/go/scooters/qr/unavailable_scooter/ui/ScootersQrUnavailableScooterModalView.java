package com.yandex.go.scooters.qr.unavailable_scooter.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ca1;
import defpackage.f0z0;
import defpackage.g0c;
import defpackage.he7;
import defpackage.ic0;
import defpackage.jqr;
import defpackage.lj1;
import defpackage.nni;
import defpackage.oqo0;
import defpackage.pqo0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.qqo0;
import defpackage.rqo0;
import defpackage.scc;
import defpackage.sqo0;
import defpackage.t130;
import defpackage.tje;
import defpackage.tqo0;
import defpackage.viy0;
import defpackage.vqo0;
import defpackage.xng0;
import defpackage.z2v0;
import defpackage.zqo0;
import defpackage.zxs;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableProgramModalView;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/scooters/qr/unavailable_scooter/ui/ScootersQrUnavailableScooterModalView;", "Lru/yandex/taxi/widget/SlideableProgramModalView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lzqo0;", "scootersQrUnavailableScooterPresenter", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/widget/utils/e;Lzqo0;)V", "Lzy11;", "setBackground", "()V", "createContentRootView", "()Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lzqo0;", "Loqo0;", "adapter", "Loqo0;", "vqo0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrUnavailableScooterModalView extends SlideableProgramModalView<RecyclerView> {
    private final oqo0 adapter;
    private final zqo0 scootersQrUnavailableScooterPresenter;

    public ScootersQrUnavailableScooterModalView(Context context, e eVar, zqo0 zqo0Var) {
        super(context);
        this.scootersQrUnavailableScooterPresenter = zqo0Var;
        ScootersQrUnavailableScooterModalView$adapter$1 scootersQrUnavailableScooterModalView$adapter$1 = new ScootersQrUnavailableScooterModalView$adapter$1(1, zqo0Var, zqo0.class, "nearestScooterItemClicked", "nearestScooterItemClicked(Lcom/yandex/go/scooters/api/domain/model/ScootersVehicleNumber;)V", 0);
        ScootersQrUnavailableScooterModalView$adapter$2 scootersQrUnavailableScooterModalView$adapter$2 = new ScootersQrUnavailableScooterModalView$adapter$2(0, zqo0Var, zqo0.class, "closeClicked", "closeClicked()V", 0);
        ScootersQrUnavailableScooterModalView$adapter$3 scootersQrUnavailableScooterModalView$adapter$3 = new ScootersQrUnavailableScooterModalView$adapter$3(0, zqo0Var, zqo0.class, "findOnMapClicked", "findOnMapClicked()V", 0);
        int i = viy0.V;
        g0c a = qoi0.a(tqo0.class);
        z2v0 z2v0Var = new z2v0(context, 7);
        f0z0 f0z0Var = new f0z0(11);
        Class a2 = a.a();
        he7 he7Var = new he7(1, f0z0Var);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, z2v0Var, emptyList, he7Var, null);
        int i2 = ca1.g0;
        g0c a3 = qoi0.a(qqo0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new lj1(context, 10), emptyList, new he7(1, new nni(5)), null);
        int i3 = c.U;
        g0c a4 = qoi0.a(sqo0.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, new lj1(context, 24), emptyList, new he7(1, new t130(29, scootersQrUnavailableScooterModalView$adapter$1, eVar)), null);
        int i4 = ca1.g0;
        g0c a5 = qoi0.a(pqo0.class);
        zxs zxsVar4 = new zxs(a5.a(), 0, new lj1(context, 9), emptyList, new he7(1, new ic0(14, scootersQrUnavailableScooterModalView$adapter$2)), null);
        int i5 = ca1.g0;
        g0c a6 = qoi0.a(rqo0.class);
        this.adapter = new oqo0(scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, new zxs(a6.a(), 0, new lj1(context, 12), emptyList, new he7(1, new ic0(20, scootersQrUnavailableScooterModalView$adapter$3)), null)));
    }

    private final void setBackground() {
        getContentRootView().setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setBackground();
    }

    @Override // ru.yandex.taxi.widget.SlideableProgramModalView
    public RecyclerView createContentRootView() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setImportantForAccessibility(2);
        recyclerView.setPadding(0, tje.u(20, recyclerView.getContext()), 0, tje.u(12, recyclerView.getContext()));
        return recyclerView;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackground();
        getContentRootView().setAdapter(this.adapter);
        zqo0 zqo0Var = this.scootersQrUnavailableScooterPresenter;
        vqo0 vqo0Var = new vqo0(this);
        zqo0Var.Bg(vqo0Var);
        tje.N(zqo0Var.Jg(), null, null, new ScootersQrUnavailableScooterPresenter$attachView$$inlined$collectIn$1(new jqr(zqo0Var.y.a(zqo0Var.z), new ScootersQrUnavailableScooterPresenter$attachView$1(2, zqo0Var, zqo0.class, "updateAnalytics", "updateAnalytics(Lcom/yandex/go/scooters/qr/unavailable_scooter/ui/ScootersQrUnavailableScooterUiState;)V", 4), 3), null, vqo0Var, zqo0Var), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersQrUnavailableScooterPresenter.Cg();
    }
}

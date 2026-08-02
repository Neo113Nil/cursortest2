package com.yandex.go.scooters.offers.v2.surge.info;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3p0;
import defpackage.a6n;
import defpackage.b3p0;
import defpackage.c3p0;
import defpackage.ca1;
import defpackage.d3p0;
import defpackage.g0c;
import defpackage.g3p0;
import defpackage.he7;
import defpackage.hlq0;
import defpackage.i3p0;
import defpackage.ic0;
import defpackage.ko4;
import defpackage.l3p0;
import defpackage.lj1;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.tje;
import defpackage.x770;
import defpackage.xng0;
import defpackage.z2p0;
import defpackage.z2v0;
import defpackage.zxs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableProgramModalView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/surge/info/ScootersSurgeInfoModalView;", "Lru/yandex/taxi/widget/SlideableProgramModalView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Ll3p0;", "scootersSurgeInfoPresenter", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/widget/utils/e;Ll3p0;)V", "Lzy11;", "setBackground", "()V", "createContentRootView", "()Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Ll3p0;", "Lg3p0;", "adapter", "Lg3p0;", "i3p0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSurgeInfoModalView extends SlideableProgramModalView<RecyclerView> {
    public static final int $stable = 8;
    private final g3p0 adapter;
    private final l3p0 scootersSurgeInfoPresenter;

    public ScootersSurgeInfoModalView(Context context, ru.yandex.taxi.widget.utils.e eVar, l3p0 l3p0Var) {
        super(context);
        this.scootersSurgeInfoPresenter = l3p0Var;
        ScootersSurgeInfoModalView$adapter$1 scootersSurgeInfoModalView$adapter$1 = new ScootersSurgeInfoModalView$adapter$1(1, l3p0Var, l3p0.class, "infoDetailsClicked", "infoDetailsClicked(Ljava/lang/String;)V", 0);
        ScootersSurgeInfoModalView$adapter$2 scootersSurgeInfoModalView$adapter$2 = new ScootersSurgeInfoModalView$adapter$2(0, l3p0Var, l3p0.class, "doneClicked", "doneClicked()V", 0);
        int i = d.V;
        g0c a = qoi0.a(b3p0.class);
        a6n a6nVar = new a6n(25, eVar, scootersSurgeInfoModalView$adapter$1);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, a6nVar);
        int i2 = ca1.g0;
        g0c a3 = qoi0.a(c3p0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new lj1(context, 28), emptyList, new he7(1, new hlq0(5)), null);
        int i3 = a.U;
        g0c a4 = qoi0.a(z2p0.class);
        int i4 = 4;
        zxs zxsVar3 = new zxs(a4.a(), 0, new lj1(context, i4), emptyList, new he7(1, new ko4(eVar, 0)), null);
        int i5 = j.T;
        g0c a5 = qoi0.a(d3p0.class);
        zxs zxsVar4 = new zxs(a5.a(), 0, new z2v0(context, i4), emptyList, new he7(1, new ko4(eVar, 1)), null);
        int i6 = ca1.g0;
        g0c a6 = qoi0.a(a3p0.class);
        this.adapter = new g3p0(scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, new zxs(a6.a(), 0, new lj1(context, 7), emptyList, new he7(1, new ic0(8, scootersSurgeInfoModalView$adapter$2)), null)));
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
        return recyclerView;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackground();
        getContentRootView().setAdapter(this.adapter);
        l3p0 l3p0Var = this.scootersSurgeInfoPresenter;
        i3p0 i3p0Var = new i3p0(this);
        l3p0Var.Bg(i3p0Var);
        tje.N(l3p0Var.Jg(), null, null, new ScootersSurgeInfoPresenter$attachView$$inlined$collectIn$1(l3p0Var.z.b, null, i3p0Var, l3p0Var), 3);
        x770 x770Var = l3p0Var.y;
        x770Var.getClass();
        x770Var.a.a("ScootersSurgeCard.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersSurgeInfoPresenter.Cg();
    }
}

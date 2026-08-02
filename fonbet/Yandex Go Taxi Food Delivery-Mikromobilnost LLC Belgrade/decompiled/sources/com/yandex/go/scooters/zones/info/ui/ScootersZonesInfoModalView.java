package com.yandex.go.scooters.zones.info.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bns;
import defpackage.ca1;
import defpackage.co40;
import defpackage.g0c;
import defpackage.he7;
import defpackage.hwo0;
import defpackage.ic0;
import defpackage.jiu;
import defpackage.k9p0;
import defpackage.l9p0;
import defpackage.lj1;
import defpackage.lki;
import defpackage.m9p0;
import defpackage.n9p0;
import defpackage.o9p0;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.r9p0;
import defpackage.rbh;
import defpackage.scc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v9p0;
import defpackage.xng0;
import defpackage.zxs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableProgramModalView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/scooters/zones/info/ui/ScootersZonesInfoModalView;", "Lru/yandex/taxi/widget/SlideableProgramModalView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lv9p0;", "scootersZonesInfoPresenter", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/widget/utils/e;Lv9p0;)V", "Lzy11;", "setBackground", "()V", "createContentRootView", "()Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lv9p0;", "Lk9p0;", "adapter", "Lk9p0;", "r9p0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersZonesInfoModalView extends SlideableProgramModalView<RecyclerView> {
    private final k9p0 adapter;
    private final v9p0 scootersZonesInfoPresenter;

    public ScootersZonesInfoModalView(Context context, ru.yandex.taxi.widget.utils.e eVar, v9p0 v9p0Var) {
        super(context);
        this.scootersZonesInfoPresenter = v9p0Var;
        ScootersZonesInfoModalView$adapter$1 scootersZonesInfoModalView$adapter$1 = new ScootersZonesInfoModalView$adapter$1(0, v9p0Var, v9p0.class, "learnMoreClicked", "learnMoreClicked()V", 0);
        ScootersZonesInfoModalView$adapter$2 scootersZonesInfoModalView$adapter$2 = new ScootersZonesInfoModalView$adapter$2(0, v9p0Var, v9p0.class, "doneClicked", "doneClicked()V", 0);
        lki lkiVar = new lki(8);
        int i = b.T;
        g0c a = qoi0.a(m9p0.class);
        int i2 = 5;
        bns bnsVar = new bns(i2, eVar);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, bnsVar);
        int i3 = ca1.g0;
        g0c a3 = qoi0.a(n9p0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new lj1(context, 17), emptyList, new he7(1, new jiu(26)), null);
        int i4 = ca1.g0;
        g0c a4 = qoi0.a(o9p0.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, new lj1(context, 21), emptyList, new he7(1, new ic0(26, scootersZonesInfoModalView$adapter$1)), null);
        int i5 = ca1.g0;
        g0c a5 = qoi0.a(l9p0.class);
        this.adapter = new k9p0(lkiVar, scc.g(zxsVar, zxsVar2, zxsVar3, new zxs(a5.a(), 0, new lj1(context, i2), emptyList, new he7(1, new ic0(6, scootersZonesInfoModalView$adapter$2)), null)));
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
        v9p0 v9p0Var = this.scootersZonesInfoPresenter;
        r9p0 r9p0Var = new r9p0(this);
        v9p0Var.Bg(r9p0Var);
        hwo0 hwo0Var = v9p0Var.y;
        rbh rbhVar = v9p0Var.z;
        tpr t = kotlinx.coroutines.flow.e.t(new e(new m0(((com.yandex.go.scooters.zones.info.domain.c) hwo0Var.w).a(rbhVar), ((pwy0) hwo0Var.c).a(), new ScootersZonesInfoUiStateInteractor$uiStateFlow$1(3, null)), hwo0Var));
        ((tt2) hwo0Var.b).getClass();
        tje.N(v9p0Var.Jg(), null, null, new ScootersZonesInfoPresenter$attachView$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(t, uyj.a), null, r9p0Var, v9p0Var), 3);
        co40 co40Var = v9p0Var.x;
        String str = rbhVar.b;
        String str2 = rbhVar.c;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put(ClidProvider.STATE, str2);
        }
        if (str != null) {
            hashMap.put("zone_id", str);
        }
        co40Var.a.a("ScootersZonesInfo.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersZonesInfoPresenter.Cg();
    }
}

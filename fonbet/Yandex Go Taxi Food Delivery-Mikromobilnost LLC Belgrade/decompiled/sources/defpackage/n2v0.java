package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import com.google.common.collect.ImmutableList;
import com.yandex.div.legacy.view.DivView;
import com.yandex.go.tips.navigation.b;
import com.yandex.go.tips.ui.selector_v1.TipsSelectorModalView;
import com.yandex.go.tips.ui.selector_v2.TipsSettingsModalView;
import com.yandex.go.tips.ui.tips_set.TipsSetModalView;
import com.yandex.messaging.internal.view.timeline.e0;
import com.yandex.messaging.ui.banners.a;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.WeakHashMap;
import ru.yandex.taxi.due_selector.impl.time.TimePickerModalView;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;

/* loaded from: classes10.dex */
public final /* synthetic */ class n2v0 implements c9e, eps0, q3l0, bx60, a5x0, t52, xv51, aee0, rmt0, nl21, m6u0, ssg, sfz0, jkz0, ugz0, llf, mlf, zbv, kds, dvu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2v0(z5x0 z5x0Var, DivView divView) {
        this.a = 9;
        this.b = z5x0Var;
    }

    @Override // defpackage.nl21
    public void B(o0k o0kVar) {
        a aVar = (a) this.b;
        aVar.F = o0kVar;
        aVar.Z();
    }

    @Override // defpackage.ssg
    public void a(Calendar calendar) {
        ((TimePickerModalView) this.b).selectedDate = calendar;
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        ((ImmutableList.a) this.b).a((tdf) obj);
    }

    @Override // defpackage.xv51
    public void b() {
        xrx0 xrx0Var = (xrx0) this.b;
        if (xrx0Var.G.d() instanceof jw51) {
            xrx0Var.H.a();
        }
    }

    @Override // defpackage.aee0
    public oeq0 c(int i) {
        oeq0 _init_$lambda$1;
        _init_$lambda$1 = TariffsRibbonView._init_$lambda$1((TariffsRibbonView) this.b, i);
        return _init_$lambda$1;
    }

    @Override // defpackage.t52
    public void d(int i, boolean z) {
        mkx0 mkx0Var = (mkx0) this.b;
        if (i == 3) {
            mkx0Var.k0 = true;
        }
        if (z && !mkx0Var.j0 && mkx0Var.k0) {
            int i2 = 4;
            if (i == 4 || i == 5) {
                mkx0Var.j0 = true;
                mkx0Var.r(new bkx0(i2));
            }
        }
    }

    @Override // defpackage.q3l0
    public o3l0 e(ou ouVar) {
        return (o3l0) this.b;
    }

    @Override // defpackage.zbv
    public rbv g(Context context, int i, int i2) {
        return new ibv(cxv.a(context, i, i2, d.a(context, (Text) this.b).toString()));
    }

    public void h(as7 as7Var) {
        czj0.b(as7Var, (wrb0) ((n2v0) this.b).b);
    }

    @Override // defpackage.dvu
    public void k(long j, m831 m831Var) {
        ((u32) this.b).e(m831Var);
    }

    @Override // defpackage.jkz0
    public void m(pkz0 pkz0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 20:
                TipsSelectorModalView.onAttachedToWindow$lambda$0((TipsSelectorModalView) obj, (jfz0) pkz0Var, true);
                break;
            case 21:
            default:
                TipsSettingsModalView.initView$lambda$3$2((TipsSettingsModalView) obj, (jfz0) pkz0Var, true);
                break;
            case 22:
                TipsSetModalView.onAttachedToWindow$lambda$0((TipsSetModalView) obj, (jfz0) pkz0Var, true);
                break;
        }
    }

    @Override // defpackage.ugz0
    public void n(String str) {
        ((b) this.b).r(new g8r0(str, 26));
    }

    @Override // defpackage.rmt0
    public void o(Editable editable) {
        ((e0) this.b).E0.setText(editable, TextView.BufferType.EDITABLE);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                ViewCompat$Api21Impl.o(view, null);
                k751 k751Var = n751Var.a;
                ((yfw0) obj).n(Math.max(k751Var.g(519).d, k751Var.g(8).d));
                break;
            default:
                androidx.core.view.insets.a aVar = (androidx.core.view.insets.a) obj;
                ArrayList arrayList = aVar.b;
                k751 k751Var2 = n751Var.a;
                u1w b = u1w.b(k751Var2.g(519), k751Var2.g(64));
                u1w b2 = u1w.b(k751Var2.h(519), k751Var2.h(64));
                if (!b.equals(aVar.c) || !b2.equals(aVar.d)) {
                    aVar.c = b;
                    aVar.d = b2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        cuf0 cuf0Var = (cuf0) arrayList.get(size);
                        cuf0Var.c = b;
                        cuf0Var.d = b2;
                        cuf0Var.c();
                    }
                    break;
                }
                break;
        }
        return n751Var;
    }

    @Override // defpackage.mlf
    public void onRefresh() {
        ((com.ybsdk.feature.transactions.impl.ui.screens.list.a) this.b).e0(true);
    }

    @Override // defpackage.eps0
    public void p(int i, long j) {
        SummaryPromotionModalWindowsModalView.setupSlider$lambda$0((SummaryPromotionModalWindowsModalView) this.b, i, j);
    }

    @Override // defpackage.llf
    public boolean q(CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        boolean onViewCreated$lambda$9$lambda$7;
        onViewCreated$lambda$9$lambda$7 = TransactionsFeedFragment.onViewCreated$lambda$9$lambda$7((TransactionsFeedFragment) this.b, customSwipeRefreshLayout, view);
        return onViewCreated$lambda$9$lambda$7;
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        TransferResultFragment.onCreate$lambda$0((TransferResultFragment) this.b, str, bundle);
    }

    public /* synthetic */ n2v0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

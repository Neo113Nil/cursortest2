package com.yandex.go.payments.shared.details.settings.limits.currencysettings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.details.settings.limits.currencysettings.b;
import defpackage.bef;
import defpackage.e6h0;
import defpackage.eef;
import defpackage.jef;
import defpackage.jst;
import defpackage.lef;
import defpackage.luh0;
import defpackage.mef;
import defpackage.oef;
import defpackage.pef;
import defpackage.rp31;
import defpackage.rx2;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u90;
import defpackage.vdf;
import defpackage.vnr0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.ToolbarModalView;

/* loaded from: classes13.dex */
public final class b extends ru.yandex.taxi.transition.b implements jef {
    public final View A;
    public final View B;
    public final View C;
    public final View D;
    public final eef E;
    public final mef c;
    public final ToolbarModalView w;
    public final ListTextComponent x;
    public final ButtonComponent y;
    public final View z;

    public b(Context context, mef mefVar) {
        this.c = mefVar;
        eef eefVar = new eef(new oef(this));
        this.E = eefVar;
        ToolbarModalView toolbarModalView = (ToolbarModalView) LayoutInflater.from(context).inflate(luh0.shared_payment_currency_settings, (ViewGroup) null);
        this.w = toolbarModalView;
        final int i = 0;
        toolbarModalView.getToolbar().setOnNavigationClickListener(new Runnable(this) { // from class: nef
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                b bVar = this.b;
                switch (i2) {
                    case 0:
                        mef mefVar2 = bVar.c;
                        mefVar2.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar2.C.a.d();
                        break;
                    case 1:
                        mef mefVar3 = bVar.c;
                        mefVar3.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar3.C.a.d();
                        break;
                    default:
                        mef mefVar4 = bVar.c;
                        mefVar4.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar4.C.a.d();
                        break;
                }
            }
        });
        toolbarModalView.setDismissOnTouchOutside(false);
        toolbarModalView.setDismissOnBackPressed(false);
        final int i2 = 1;
        toolbarModalView.setOnTouchOutsideListener(new Runnable(this) { // from class: nef
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        mef mefVar2 = bVar.c;
                        mefVar2.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar2.C.a.d();
                        break;
                    case 1:
                        mef mefVar3 = bVar.c;
                        mefVar3.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar3.C.a.d();
                        break;
                    default:
                        mef mefVar4 = bVar.c;
                        mefVar4.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar4.C.a.d();
                        break;
                }
            }
        });
        final int i3 = 2;
        toolbarModalView.setOnBackPressedListener(new Runnable(this) { // from class: nef
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        mef mefVar2 = bVar.c;
                        mefVar2.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar2.C.a.d();
                        break;
                    case 1:
                        mef mefVar3 = bVar.c;
                        mefVar3.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar3.C.a.d();
                        break;
                    default:
                        mef mefVar4 = bVar.c;
                        mefVar4.A.u(SharedPaymentAnalytics$Button.BACK);
                        mefVar4.C.a.d();
                        break;
                }
            }
        });
        int i4 = e6h0.shared_payment_currency_details;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.x = (ListTextComponent) ((View) rp31.d(toolbarModalView, i4));
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_currency_options));
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_currency_select));
        this.y = buttonComponent;
        View view = (View) rp31.d(toolbarModalView, e6h0.shared_payment_currency_select_container);
        this.B = view;
        this.D = (View) rp31.d(toolbarModalView, e6h0.shared_payment_currency_controls_blocker);
        this.z = (View) rp31.d(toolbarModalView, e6h0.shared_payment_currency_scroll_view);
        this.C = (View) rp31.d(toolbarModalView, e6h0.shared_payment_currency_scroll_indicator);
        this.A = (View) rp31.d(toolbarModalView, e6h0.shared_payment_currency_loader);
        recyclerView.setAdapter(eefVar);
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.payments.shared.details.settings.limits.currencysettings.a
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                mef mefVar2 = b.this.c;
                mefVar2.A.u(SharedPaymentAnalytics$Button.DONE);
                Iterator it = mefVar2.E.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((bef) obj).c) {
                            break;
                        }
                    }
                }
                bef befVar = (bef) obj;
                if (befVar == null) {
                    jst.e.w(new IllegalStateException("No currency selected"));
                    return;
                }
                pef pefVar = mefVar2.E;
                pefVar.f = true;
                pefVar.d = mefVar2.B.d;
                pefVar.g = true;
                ((jef) mefVar2.Dg()).Gb(mefVar2.E);
                tje.N(mefVar2.Jg(), null, null, new CurrencySettingsPresenter$onSelectClick$1(mefVar2, befVar, null), 3);
            }
        });
        view.addOnLayoutChangeListener(new u90(21, this));
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        mef mefVar = this.c;
        mefVar.Bg(this);
        vdf vdfVar = mefVar.z;
        lef lefVar = mefVar.B;
        vdfVar.getClass();
        pef pefVar = new pef(lefVar);
        pefVar.c = false;
        pefVar.g = false;
        pefVar.e = true;
        pefVar.d = lefVar.c;
        mefVar.E = pefVar;
        tje.N(mefVar.Jg(), null, null, new CurrencySettingsPresenter$attachView$1(mefVar, null), 3);
        vnr0 vnr0Var = mefVar.A;
        vnr0Var.getClass();
        List g = scc.g(SharedPaymentAnalytics$Button.BACK, SharedPaymentAnalytics$Button.DONE, SharedPaymentAnalytics$Button.CURRENCY_SELECTED);
        rx2 rx2Var = vnr0Var.i;
        List list = g;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SharedPaymentAnalytics$Button) it.next()).getAnalyticsName());
        }
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        rx2Var.a.a("MonthLimitsCurrencyCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.jef
    public final void Gb(pef pefVar) {
        lef lefVar = pefVar.a;
        this.w.getToolbar().setTitle(lefVar.a);
        this.x.setText(lefVar.b);
        String str = lefVar.c;
        ButtonComponent buttonComponent = this.y;
        buttonComponent.setText(str);
        List list = pefVar.b;
        eef eefVar = this.E;
        eefVar.a = list;
        eefVar.notifyDataSetChanged();
        buttonComponent.setEnabled(pefVar.c);
        buttonComponent.setProgressing(pefVar.g);
        buttonComponent.setText(pefVar.d);
        this.A.setVisibility(pefVar.e ? 0 : 8);
        this.D.setVisibility(pefVar.f ? 0 : 8);
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        this.c.Cg();
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.w.requestFocus();
    }
}

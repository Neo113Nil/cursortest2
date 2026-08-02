package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.details.settings.SharedPaymentSettingsViewHolder$initListeners$$inlined$safeCollectIn$1;
import com.yandex.go.payments.shared.details.settings.SharedPaymentSettingsViewHolder$initListeners$$inlined$safeCollectIn$2;
import com.yandex.go.payments.shared.details.settings.a;
import com.yandex.go.payments.shared.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.ToolbarModalView;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class nor0 extends b implements ior0 {
    public final ListItemComponent A;
    public final ListItemComponent B;
    public final View C;
    public final ButtonComponent D;
    public final View E;
    public final pzt0 F;
    public final pzt0 G;
    public final kor0 c;
    public final ToolbarModalView w;
    public final View x;
    public final View y;
    public final ListItemInputComponent z;

    public nor0(Context context, tse tseVar, kor0 kor0Var) {
        this.c = kor0Var;
        ToolbarModalView toolbarModalView = (ToolbarModalView) LayoutInflater.from(context).inflate(luh0.shared_payment_settings, (ViewGroup) null);
        this.w = toolbarModalView;
        int i = e6h0.shared_payment_settings_scroll_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.x = (View) rp31.d(toolbarModalView, i);
        this.y = (View) rp31.d(toolbarModalView, e6h0.shared_payment_settings_scroll_indicator);
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_settings_account_name));
        this.z = listItemInputComponent;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_settings_reports));
        this.A = listItemComponent;
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_settings_limits));
        this.B = listItemComponent2;
        View view = (View) rp31.d(toolbarModalView, e6h0.shared_payment_settings_save_container);
        this.C = view;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_settings_save));
        this.D = buttonComponent;
        this.E = (View) rp31.d(toolbarModalView, e6h0.shared_payment_settings_controls_blocker);
        final int i2 = 0;
        toolbarModalView.getToolbar().setOnNavigationClickListener(new Runnable(this) { // from class: lor0
            public final /* synthetic */ nor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                int i4 = 0;
                nor0 nor0Var = this.b;
                switch (i3) {
                    case 0:
                        nor0Var.c.onDismiss();
                        break;
                    case 1:
                        nor0Var.c.onDismiss();
                        break;
                    case 2:
                        nor0Var.c.onDismiss();
                        break;
                    case 3:
                        kor0 kor0Var2 = nor0Var.c;
                        kor0Var2.z.M(kor0Var2.B.b, kor0Var2.D, SharedPaymentAnalytics$Button.DELETE_ACCOUNT);
                        ((ior0) kor0Var2.Dg()).closeKeyboard();
                        vor0 vor0Var = kor0Var2.A;
                        a aVar = new a(i4, kor0Var2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        nbr0 nbr0Var = vor0Var.b.b;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(nbr0Var.j).setMessage(nbr0Var.k).setPositiveButton(nbr0Var.m, aVar).setNegativeButton(nbr0Var.l, d82Var).show();
                        break;
                    case 4:
                        kor0 kor0Var3 = nor0Var.c;
                        q6c0 q6c0Var = kor0Var3.z;
                        il ilVar = kor0Var3.B;
                        q6c0Var.M(ilVar.b, kor0Var3.D, SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
                        vor0 vor0Var2 = kor0Var3.A;
                        vor0Var2.a.c.a().c(new j3j0(ilVar, vor0Var2, vor0Var2.b.a));
                        break;
                    default:
                        kor0 kor0Var4 = nor0Var.c;
                        q6c0 q6c0Var2 = kor0Var4.z;
                        il ilVar2 = kor0Var4.B;
                        q6c0Var2.M(ilVar2.b, kor0Var4.D, SharedPaymentAnalytics$Button.LIMIT);
                        boolean z = ilVar2.b().m != null;
                        vor0 vor0Var3 = kor0Var4.A;
                        if (!z) {
                            vor0Var3.a.c.a().c(new kef(ilVar2, vor0Var3, vor0Var3.b.e));
                            break;
                        } else {
                            vor0Var3.b(ilVar2, false);
                            break;
                        }
                }
            }
        });
        toolbarModalView.setDismissOnTouchOutside(false);
        toolbarModalView.setDismissOnBackPressed(false);
        final int i3 = 1;
        toolbarModalView.setOnTouchOutsideListener(new Runnable(this) { // from class: lor0
            public final /* synthetic */ nor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                int i4 = 0;
                nor0 nor0Var = this.b;
                switch (i32) {
                    case 0:
                        nor0Var.c.onDismiss();
                        break;
                    case 1:
                        nor0Var.c.onDismiss();
                        break;
                    case 2:
                        nor0Var.c.onDismiss();
                        break;
                    case 3:
                        kor0 kor0Var2 = nor0Var.c;
                        kor0Var2.z.M(kor0Var2.B.b, kor0Var2.D, SharedPaymentAnalytics$Button.DELETE_ACCOUNT);
                        ((ior0) kor0Var2.Dg()).closeKeyboard();
                        vor0 vor0Var = kor0Var2.A;
                        a aVar = new a(i4, kor0Var2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        nbr0 nbr0Var = vor0Var.b.b;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(nbr0Var.j).setMessage(nbr0Var.k).setPositiveButton(nbr0Var.m, aVar).setNegativeButton(nbr0Var.l, d82Var).show();
                        break;
                    case 4:
                        kor0 kor0Var3 = nor0Var.c;
                        q6c0 q6c0Var = kor0Var3.z;
                        il ilVar = kor0Var3.B;
                        q6c0Var.M(ilVar.b, kor0Var3.D, SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
                        vor0 vor0Var2 = kor0Var3.A;
                        vor0Var2.a.c.a().c(new j3j0(ilVar, vor0Var2, vor0Var2.b.a));
                        break;
                    default:
                        kor0 kor0Var4 = nor0Var.c;
                        q6c0 q6c0Var2 = kor0Var4.z;
                        il ilVar2 = kor0Var4.B;
                        q6c0Var2.M(ilVar2.b, kor0Var4.D, SharedPaymentAnalytics$Button.LIMIT);
                        boolean z = ilVar2.b().m != null;
                        vor0 vor0Var3 = kor0Var4.A;
                        if (!z) {
                            vor0Var3.a.c.a().c(new kef(ilVar2, vor0Var3, vor0Var3.b.e));
                            break;
                        } else {
                            vor0Var3.b(ilVar2, false);
                            break;
                        }
                }
            }
        });
        final int i4 = 2;
        toolbarModalView.setOnBackPressedListener(new Runnable(this) { // from class: lor0
            public final /* synthetic */ nor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                int i42 = 0;
                nor0 nor0Var = this.b;
                switch (i32) {
                    case 0:
                        nor0Var.c.onDismiss();
                        break;
                    case 1:
                        nor0Var.c.onDismiss();
                        break;
                    case 2:
                        nor0Var.c.onDismiss();
                        break;
                    case 3:
                        kor0 kor0Var2 = nor0Var.c;
                        kor0Var2.z.M(kor0Var2.B.b, kor0Var2.D, SharedPaymentAnalytics$Button.DELETE_ACCOUNT);
                        ((ior0) kor0Var2.Dg()).closeKeyboard();
                        vor0 vor0Var = kor0Var2.A;
                        a aVar = new a(i42, kor0Var2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        nbr0 nbr0Var = vor0Var.b.b;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(nbr0Var.j).setMessage(nbr0Var.k).setPositiveButton(nbr0Var.m, aVar).setNegativeButton(nbr0Var.l, d82Var).show();
                        break;
                    case 4:
                        kor0 kor0Var3 = nor0Var.c;
                        q6c0 q6c0Var = kor0Var3.z;
                        il ilVar = kor0Var3.B;
                        q6c0Var.M(ilVar.b, kor0Var3.D, SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
                        vor0 vor0Var2 = kor0Var3.A;
                        vor0Var2.a.c.a().c(new j3j0(ilVar, vor0Var2, vor0Var2.b.a));
                        break;
                    default:
                        kor0 kor0Var4 = nor0Var.c;
                        q6c0 q6c0Var2 = kor0Var4.z;
                        il ilVar2 = kor0Var4.B;
                        q6c0Var2.M(ilVar2.b, kor0Var4.D, SharedPaymentAnalytics$Button.LIMIT);
                        boolean z = ilVar2.b().m != null;
                        vor0 vor0Var3 = kor0Var4.A;
                        if (!z) {
                            vor0Var3.a.c.a().c(new kef(ilVar2, vor0Var3, vor0Var3.b.e));
                            break;
                        } else {
                            vor0Var3.b(ilVar2, false);
                            break;
                        }
                }
            }
        });
        toolbarModalView.getToolbar().getNavigationIconParams().d = f1h0.ic_trash_transparent;
        toolbarModalView.getToolbar().setTrailMode(2);
        final int i5 = 3;
        toolbarModalView.getToolbar().setTrailContainerClickListener(new Runnable(this) { // from class: lor0
            public final /* synthetic */ nor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i5;
                int i42 = 0;
                nor0 nor0Var = this.b;
                switch (i32) {
                    case 0:
                        nor0Var.c.onDismiss();
                        break;
                    case 1:
                        nor0Var.c.onDismiss();
                        break;
                    case 2:
                        nor0Var.c.onDismiss();
                        break;
                    case 3:
                        kor0 kor0Var2 = nor0Var.c;
                        kor0Var2.z.M(kor0Var2.B.b, kor0Var2.D, SharedPaymentAnalytics$Button.DELETE_ACCOUNT);
                        ((ior0) kor0Var2.Dg()).closeKeyboard();
                        vor0 vor0Var = kor0Var2.A;
                        a aVar = new a(i42, kor0Var2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        nbr0 nbr0Var = vor0Var.b.b;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(nbr0Var.j).setMessage(nbr0Var.k).setPositiveButton(nbr0Var.m, aVar).setNegativeButton(nbr0Var.l, d82Var).show();
                        break;
                    case 4:
                        kor0 kor0Var3 = nor0Var.c;
                        q6c0 q6c0Var = kor0Var3.z;
                        il ilVar = kor0Var3.B;
                        q6c0Var.M(ilVar.b, kor0Var3.D, SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
                        vor0 vor0Var2 = kor0Var3.A;
                        vor0Var2.a.c.a().c(new j3j0(ilVar, vor0Var2, vor0Var2.b.a));
                        break;
                    default:
                        kor0 kor0Var4 = nor0Var.c;
                        q6c0 q6c0Var2 = kor0Var4.z;
                        il ilVar2 = kor0Var4.B;
                        q6c0Var2.M(ilVar2.b, kor0Var4.D, SharedPaymentAnalytics$Button.LIMIT);
                        boolean z = ilVar2.b().m != null;
                        vor0 vor0Var3 = kor0Var4.A;
                        if (!z) {
                            vor0Var3.a.c.a().c(new kef(ilVar2, vor0Var3, vor0Var3.b.e));
                            break;
                        } else {
                            vor0Var3.b(ilVar2, false);
                            break;
                        }
                }
            }
        });
        this.F = tje.N(tseVar, null, null, new SharedPaymentSettingsViewHolder$initListeners$$inlined$safeCollectIn$1(listItemInputComponent.textValueFlow(), null, this), 3);
        this.G = tje.N(tseVar, null, null, new SharedPaymentSettingsViewHolder$initListeners$$inlined$safeCollectIn$2(listItemInputComponent.textFocusFlow(), null, this), 3);
        buttonComponent.setDebounceClickListener(new a(i3, this));
        final int i6 = 4;
        listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: lor0
            public final /* synthetic */ nor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i6;
                int i42 = 0;
                nor0 nor0Var = this.b;
                switch (i32) {
                    case 0:
                        nor0Var.c.onDismiss();
                        break;
                    case 1:
                        nor0Var.c.onDismiss();
                        break;
                    case 2:
                        nor0Var.c.onDismiss();
                        break;
                    case 3:
                        kor0 kor0Var2 = nor0Var.c;
                        kor0Var2.z.M(kor0Var2.B.b, kor0Var2.D, SharedPaymentAnalytics$Button.DELETE_ACCOUNT);
                        ((ior0) kor0Var2.Dg()).closeKeyboard();
                        vor0 vor0Var = kor0Var2.A;
                        a aVar = new a(i42, kor0Var2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        nbr0 nbr0Var = vor0Var.b.b;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(nbr0Var.j).setMessage(nbr0Var.k).setPositiveButton(nbr0Var.m, aVar).setNegativeButton(nbr0Var.l, d82Var).show();
                        break;
                    case 4:
                        kor0 kor0Var3 = nor0Var.c;
                        q6c0 q6c0Var = kor0Var3.z;
                        il ilVar = kor0Var3.B;
                        q6c0Var.M(ilVar.b, kor0Var3.D, SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
                        vor0 vor0Var2 = kor0Var3.A;
                        vor0Var2.a.c.a().c(new j3j0(ilVar, vor0Var2, vor0Var2.b.a));
                        break;
                    default:
                        kor0 kor0Var4 = nor0Var.c;
                        q6c0 q6c0Var2 = kor0Var4.z;
                        il ilVar2 = kor0Var4.B;
                        q6c0Var2.M(ilVar2.b, kor0Var4.D, SharedPaymentAnalytics$Button.LIMIT);
                        boolean z = ilVar2.b().m != null;
                        vor0 vor0Var3 = kor0Var4.A;
                        if (!z) {
                            vor0Var3.a.c.a().c(new kef(ilVar2, vor0Var3, vor0Var3.b.e));
                            break;
                        } else {
                            vor0Var3.b(ilVar2, false);
                            break;
                        }
                }
            }
        });
        final int i7 = 5;
        listItemComponent2.setDebounceClickListener(new Runnable(this) { // from class: lor0
            public final /* synthetic */ nor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i7;
                int i42 = 0;
                nor0 nor0Var = this.b;
                switch (i32) {
                    case 0:
                        nor0Var.c.onDismiss();
                        break;
                    case 1:
                        nor0Var.c.onDismiss();
                        break;
                    case 2:
                        nor0Var.c.onDismiss();
                        break;
                    case 3:
                        kor0 kor0Var2 = nor0Var.c;
                        kor0Var2.z.M(kor0Var2.B.b, kor0Var2.D, SharedPaymentAnalytics$Button.DELETE_ACCOUNT);
                        ((ior0) kor0Var2.Dg()).closeKeyboard();
                        vor0 vor0Var = kor0Var2.A;
                        a aVar = new a(i42, kor0Var2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        nbr0 nbr0Var = vor0Var.b.b;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(nbr0Var.j).setMessage(nbr0Var.k).setPositiveButton(nbr0Var.m, aVar).setNegativeButton(nbr0Var.l, d82Var).show();
                        break;
                    case 4:
                        kor0 kor0Var3 = nor0Var.c;
                        q6c0 q6c0Var = kor0Var3.z;
                        il ilVar = kor0Var3.B;
                        q6c0Var.M(ilVar.b, kor0Var3.D, SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
                        vor0 vor0Var2 = kor0Var3.A;
                        vor0Var2.a.c.a().c(new j3j0(ilVar, vor0Var2, vor0Var2.b.a));
                        break;
                    default:
                        kor0 kor0Var4 = nor0Var.c;
                        q6c0 q6c0Var2 = kor0Var4.z;
                        il ilVar2 = kor0Var4.B;
                        q6c0Var2.M(ilVar2.b, kor0Var4.D, SharedPaymentAnalytics$Button.LIMIT);
                        boolean z = ilVar2.b().m != null;
                        vor0 vor0Var3 = kor0Var4.A;
                        if (!z) {
                            vor0Var3.a.c.a().c(new kef(ilVar2, vor0Var3, vor0Var3.b.e));
                            break;
                        } else {
                            vor0Var3.b(ilVar2, false);
                            break;
                        }
                }
            }
        });
        p6(listItemInputComponent);
        view.addOnLayoutChangeListener(new yln(27, this));
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        kor0 kor0Var = this.c;
        kor0Var.Bg(this);
        oor0 oor0Var = kor0Var.D;
        il ilVar = kor0Var.B;
        oor0Var.b = ilVar.b().b();
        oor0Var.h = ilVar.b().l.c;
        oor0Var.i = ilVar.b().l.c;
        oor0Var.j = ilVar.b().l.b;
        oor0Var.k = ilVar.b().l.a;
        oor0Var.c = false;
        oor0Var.e = false;
        oor0Var.d = kor0Var.C.g;
        oor0Var.f = true;
        kor0Var.Lg();
        q6c0 q6c0Var = kor0Var.z;
        String str = ilVar.b;
        q6c0Var.getClass();
        ListBuilder I = q6c0.I(oor0Var);
        b1 b1Var = (b1) q6c0Var.c;
        ArrayList arrayList = new ArrayList(tcc.n(I, 10));
        ListIterator listIterator = I.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        SharedAccount o = ((fga0) q6c0Var.b).o(str);
        String str2 = o != null ? o.b : null;
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (str2 != null) {
            hashMap.put(ClidProvider.STATE, str2);
        }
        b1Var.a.a("GroupAccountSettingsCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        pzt0 pzt0Var = this.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.G;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.c.Cg();
        Q2();
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.w;
    }

    @Override // defpackage.ior0
    public final void e2(oor0 oor0Var) {
        nbr0 nbr0Var = oor0Var.a;
        String str = nbr0Var.f;
        ListItemComponent listItemComponent = this.A;
        listItemComponent.setTitle(str);
        this.w.getToolbar().setTitle(nbr0Var.a);
        String str2 = nbr0Var.b;
        ListItemInputComponent listItemInputComponent = this.z;
        listItemInputComponent.setTitle(str2);
        String str3 = nbr0Var.d;
        ListItemComponent listItemComponent2 = this.B;
        listItemComponent2.setTitle(str3);
        listItemComponent2.setSubtitle(nbr0Var.e);
        listItemInputComponent.setTextWithoutNotifying(oor0Var.b);
        listItemInputComponent.setReadOnly(!oor0Var.i);
        listItemInputComponent.setAlertText(oor0Var.g);
        listItemComponent.setVisibility(oor0Var.k ? 0 : 8);
        listItemComponent2.setVisibility(oor0Var.j ? 0 : 8);
        this.C.setVisibility(oor0Var.h ? 0 : 8);
        String str4 = oor0Var.d;
        ButtonComponent buttonComponent = this.D;
        buttonComponent.setText(str4);
        buttonComponent.setProgressing(oor0Var.e);
        buttonComponent.setEnabled(oor0Var.c);
        this.E.setVisibility(oor0Var.f ? 8 : 0);
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

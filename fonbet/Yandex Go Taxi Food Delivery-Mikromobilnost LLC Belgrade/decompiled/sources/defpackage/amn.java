package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.Member;
import com.yandex.go.payments.shared.data.model.MemberDetails;
import com.yandex.go.payments.shared.members.list.editmember.EditMemberViewHolder$initListeners$$inlined$safeCollectIn$1;
import com.yandex.go.payments.shared.members.list.editmember.EditMemberViewHolder$initListeners$$inlined$safeCollectIn$2;
import com.yandex.go.payments.shared.members.list.editmember.EditMemberViewHolder$initListeners$$inlined$safeCollectIn$3;
import com.yandex.go.payments.shared.members.list.editmember.EditMemberViewHolder$initListeners$$inlined$safeCollectIn$4;
import com.yandex.go.payments.shared.members.list.editmember.EditMemberViewHolder$initListeners$$inlined$safeCollectIn$5;
import com.yandex.go.payments.shared.members.list.editmember.EditMemberViewHolder$initListeners$$inlined$safeCollectIn$6;
import com.yandex.go.payments.shared.members.list.editmember.a;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.AnalyticsContext$ElementState;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.ToolbarModalView;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class amn extends b implements uln {
    public final View A;
    public final ListItemSwitchComponent B;
    public final ListItemInputComponent C;
    public final ListItemInputComponent D;
    public final ListItemComponent E;
    public final View F;
    public final ButtonComponent G;
    public final View H;
    public final ArrayList I;
    public final wln c;
    public final ToolbarModalView w;
    public final View x;
    public final View y;
    public final ListItemInputComponent z;

    public amn(Context context, tse tseVar, wln wlnVar) {
        this.c = wlnVar;
        ToolbarModalView toolbarModalView = (ToolbarModalView) LayoutInflater.from(context).inflate(luh0.shared_payment_member_details, (ViewGroup) null);
        this.w = toolbarModalView;
        int i = e6h0.shared_payment_member_scroll_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.x = (View) rp31.d(toolbarModalView, i);
        this.y = (View) rp31.d(toolbarModalView, e6h0.shared_payment_member_scroll_indicator);
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_member_name));
        this.z = listItemInputComponent;
        this.A = (View) rp31.d(toolbarModalView, e6h0.shared_payment_member_limits_divider);
        ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_member_limit_switch));
        this.B = listItemSwitchComponent;
        ListItemInputComponent listItemInputComponent2 = (ListItemInputComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_member_limit_input));
        this.C = listItemInputComponent2;
        ListItemInputComponent listItemInputComponent3 = (ListItemInputComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_member_phone));
        this.D = listItemInputComponent3;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_member_select_contact));
        this.E = listItemComponent;
        View view = (View) rp31.d(toolbarModalView, e6h0.shared_payment_member_save_container);
        this.F = view;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_member_save));
        this.G = buttonComponent;
        this.H = (View) rp31.d(toolbarModalView, e6h0.shared_payment_member_controls_blocker);
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        toolbarModalView.getToolbar().getNavigationIconParams().d = f1h0.ic_trash_transparent;
        toolbarModalView.getToolbar().setTrailMode(2);
        listItemInputComponent2.setClearButtonSize(tje.u(40, toolbarModalView.getContext()));
        toolbarModalView.setAnalyticsContext(new e32("GroupAccountParticipantCard", AnalyticsContext$ElementState.CARD, new HashSet()));
        final int i2 = 0;
        buttonComponent.setDebounceClickListener(new a(i2, this));
        toolbarModalView.getToolbar().setOnNavigationClickListener(new Runnable(this) { // from class: xln
            public final /* synthetic */ amn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                amn amnVar = this.b;
                switch (i3) {
                    case 0:
                        amnVar.c.onDismiss();
                        break;
                    case 1:
                        wln wlnVar2 = amnVar.c;
                        wlnVar2.D.m(wlnVar2.G.b, wlnVar2.H, wlnVar2.J, SharedPaymentAnalytics$Button.DELETE);
                        ((uln) wlnVar2.Dg()).closeKeyboard();
                        vor0 vor0Var = wlnVar2.F;
                        a aVar = new a(2, wlnVar2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        kh10 kh10Var = vor0Var.b.i;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(kh10Var.o).setMessage(kh10Var.p).setPositiveButton(kh10Var.r, aVar).setNegativeButton(kh10Var.q, d82Var).setDismissListener(new yue(yVar, 3)).show();
                        break;
                    case 2:
                        amnVar.c.onDismiss();
                        break;
                    default:
                        amnVar.c.onDismiss();
                        break;
                }
            }
        });
        final int i3 = 1;
        toolbarModalView.getToolbar().setTrailContainerClickListener(new Runnable(this) { // from class: xln
            public final /* synthetic */ amn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                amn amnVar = this.b;
                switch (i32) {
                    case 0:
                        amnVar.c.onDismiss();
                        break;
                    case 1:
                        wln wlnVar2 = amnVar.c;
                        wlnVar2.D.m(wlnVar2.G.b, wlnVar2.H, wlnVar2.J, SharedPaymentAnalytics$Button.DELETE);
                        ((uln) wlnVar2.Dg()).closeKeyboard();
                        vor0 vor0Var = wlnVar2.F;
                        a aVar = new a(2, wlnVar2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        kh10 kh10Var = vor0Var.b.i;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(kh10Var.o).setMessage(kh10Var.p).setPositiveButton(kh10Var.r, aVar).setNegativeButton(kh10Var.q, d82Var).setDismissListener(new yue(yVar, 3)).show();
                        break;
                    case 2:
                        amnVar.c.onDismiss();
                        break;
                    default:
                        amnVar.c.onDismiss();
                        break;
                }
            }
        });
        final int i4 = 3;
        arrayList.add(tje.N(tseVar, null, null, new EditMemberViewHolder$initListeners$$inlined$safeCollectIn$1(listItemInputComponent.textValueFlow(), null, this), 3));
        arrayList.add(tje.N(tseVar, null, null, new EditMemberViewHolder$initListeners$$inlined$safeCollectIn$2(listItemInputComponent.textFocusFlow(), null, this), 3));
        arrayList.add(tje.N(tseVar, null, null, new EditMemberViewHolder$initListeners$$inlined$safeCollectIn$3(listItemInputComponent3.textValueFlow(), null, this), 3));
        arrayList.add(tje.N(tseVar, null, null, new EditMemberViewHolder$initListeners$$inlined$safeCollectIn$4(listItemInputComponent3.textFocusFlow(), null, this), 3));
        listItemComponent.setDebounceClickListener(new a(i3, this));
        listItemSwitchComponent.setOnClickListener(new cmi(14, this));
        arrayList.add(tje.N(tseVar, null, null, new EditMemberViewHolder$initListeners$$inlined$safeCollectIn$5(listItemInputComponent2.textValueFlow(), null, this), 3));
        arrayList.add(tje.N(tseVar, null, null, new EditMemberViewHolder$initListeners$$inlined$safeCollectIn$6(listItemInputComponent2.textFocusFlow(), null, this), 3));
        toolbarModalView.setDismissOnTouchOutside(false);
        toolbarModalView.setDismissOnBackPressed(false);
        final int i5 = 2;
        toolbarModalView.setOnTouchOutsideListener(new Runnable(this) { // from class: xln
            public final /* synthetic */ amn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i5;
                amn amnVar = this.b;
                switch (i32) {
                    case 0:
                        amnVar.c.onDismiss();
                        break;
                    case 1:
                        wln wlnVar2 = amnVar.c;
                        wlnVar2.D.m(wlnVar2.G.b, wlnVar2.H, wlnVar2.J, SharedPaymentAnalytics$Button.DELETE);
                        ((uln) wlnVar2.Dg()).closeKeyboard();
                        vor0 vor0Var = wlnVar2.F;
                        a aVar = new a(2, wlnVar2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        kh10 kh10Var = vor0Var.b.i;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(kh10Var.o).setMessage(kh10Var.p).setPositiveButton(kh10Var.r, aVar).setNegativeButton(kh10Var.q, d82Var).setDismissListener(new yue(yVar, 3)).show();
                        break;
                    case 2:
                        amnVar.c.onDismiss();
                        break;
                    default:
                        amnVar.c.onDismiss();
                        break;
                }
            }
        });
        toolbarModalView.setOnBackPressedListener(new Runnable(this) { // from class: xln
            public final /* synthetic */ amn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                amn amnVar = this.b;
                switch (i32) {
                    case 0:
                        amnVar.c.onDismiss();
                        break;
                    case 1:
                        wln wlnVar2 = amnVar.c;
                        wlnVar2.D.m(wlnVar2.G.b, wlnVar2.H, wlnVar2.J, SharedPaymentAnalytics$Button.DELETE);
                        ((uln) wlnVar2.Dg()).closeKeyboard();
                        vor0 vor0Var = wlnVar2.F;
                        a aVar = new a(2, wlnVar2);
                        d82 d82Var = pwf0.c;
                        y yVar = vor0Var.a;
                        kh10 kh10Var = vor0Var.b.i;
                        yVar.getClass();
                        new AlertDialog(yVar.a).setTitle(kh10Var.o).setMessage(kh10Var.p).setPositiveButton(kh10Var.r, aVar).setNegativeButton(kh10Var.q, d82Var).setDismissListener(new yue(yVar, 3)).show();
                        break;
                    case 2:
                        amnVar.c.onDismiss();
                        break;
                    default:
                        amnVar.c.onDismiss();
                        break;
                }
            }
        });
        p6(listItemInputComponent);
        p6(listItemInputComponent3);
        p6(listItemInputComponent2);
        view.addOnLayoutChangeListener(new yln(0, this));
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        String str;
        wln wlnVar = this.c;
        wlnVar.Bg(this);
        mum mumVar = wlnVar.y;
        Member Mg = wlnVar.Mg();
        il ilVar = wlnVar.G;
        Account b = ilVar.b();
        ief iefVar = b.m;
        kh10 kh10Var = wlnVar.x.e;
        mumVar.getClass();
        bmn bmnVar = new bmn(kh10Var);
        MemberDetails memberDetails = Mg.c;
        bmnVar.b = memberDetails.a;
        bmnVar.d = memberDetails.b;
        Long a = Mg.a();
        if (a == null || (str = String.valueOf(a.longValue())) == null) {
            str = "";
        }
        bmnVar.g = str;
        Member.Limits limits = Mg.f;
        bmnVar.m = limits != null && limits.b;
        bmnVar.n = limits != null && limits.b;
        bmnVar.k = false;
        bmnVar.o = true;
        bmnVar.j = kh10Var.k;
        bmnVar.f = b.l.b && iefVar != null;
        bmnVar.l = iefVar != null ? String.format(kh10Var.f, Arrays.copyOf(new Object[]{((xdf) mumVar.a).d(gwk0.h(iefVar), false, "$SIGN$")}, 1)) : "";
        wlnVar.J = bmnVar;
        wlnVar.Og();
        vnr0 vnr0Var = wlnVar.D;
        String str2 = ilVar.b;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = wlnVar.H;
        bmn bmnVar2 = wlnVar.J;
        vnr0Var.getClass();
        ListBuilder i = vnr0.i(bmnVar2);
        cug cugVar = vnr0Var.g;
        ArrayList arrayList = new ArrayList(tcc.n(i, 10));
        ListIterator listIterator = i.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        String k = vnr0Var.k(str2);
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        if (k != null) {
            hashMap.put(ClidProvider.STATE, k);
        }
        cugVar.a.a("GroupAccountParticipantCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        ArrayList arrayList = this.I;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        arrayList.clear();
        this.c.Cg();
        Q2();
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.w;
    }

    @Override // defpackage.uln
    public final void Uf() {
        ListItemInputComponent listItemInputComponent = this.C;
        listItemInputComponent.requestFocus();
        listItemInputComponent.placeCursorAtEnd();
        if (listItemInputComponent == null) {
            return;
        }
        listItemInputComponent.post(new xd2(listItemInputComponent, 1));
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.w.requestFocus();
    }

    @Override // defpackage.uln
    public final void rg(bmn bmnVar) {
        kh10 kh10Var = bmnVar.a;
        this.E.setTitle(kh10Var.j);
        String str = kh10Var.d;
        ListItemInputComponent listItemInputComponent = this.D;
        listItemInputComponent.setTitle(str);
        this.w.getToolbar().setTitle(kh10Var.a);
        String str2 = kh10Var.b;
        ListItemInputComponent listItemInputComponent2 = this.z;
        listItemInputComponent2.setTitle(str2);
        String str3 = kh10Var.g;
        ListItemSwitchComponent listItemSwitchComponent = this.B;
        listItemSwitchComponent.setSubtitle(str3);
        listItemInputComponent2.setTextWithoutNotifying(bmnVar.b);
        listItemInputComponent2.setAlertText(bmnVar.c);
        listItemInputComponent.setTextWithoutNotifying(bmnVar.d);
        listItemInputComponent.setAlertText(bmnVar.e);
        listItemSwitchComponent.setTitle(bmnVar.l);
        listItemSwitchComponent.setCheckedWithAnimation(bmnVar.m);
        String str4 = kh10Var.i;
        ListItemInputComponent listItemInputComponent3 = this.C;
        listItemInputComponent3.setTitle(str4);
        listItemInputComponent3.setTextWithoutNotifying(bmnVar.g);
        listItemInputComponent3.setEnabled(bmnVar.n);
        listItemInputComponent3.setAlertText(bmnVar.h);
        boolean z = bmnVar.f;
        this.A.setVisibility(z ? 0 : 8);
        listItemSwitchComponent.setVisibility(z ? 0 : 8);
        listItemInputComponent3.setVisibility(z ? 0 : 8);
        boolean z2 = bmnVar.i;
        ButtonComponent buttonComponent = this.G;
        buttonComponent.setEnabled(z2);
        buttonComponent.setText(bmnVar.j);
        if (bmnVar.k) {
            buttonComponent.startProgress();
        } else {
            buttonComponent.finishProgress();
        }
        this.H.setVisibility(bmnVar.o ? 8 : 0);
    }
}

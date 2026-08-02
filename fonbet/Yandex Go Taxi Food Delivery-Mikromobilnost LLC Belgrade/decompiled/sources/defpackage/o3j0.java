package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.data.model.SaveReportSettingsRequest;
import com.yandex.go.payments.shared.details.settings.reports.ReportSettingsViewHolder$special$$inlined$safeCollectIn$1;
import com.yandex.go.payments.shared.details.settings.reports.ReportSettingsViewHolder$special$$inlined$safeCollectIn$2;
import com.yandex.go.payments.shared.v;
import defpackage.i3j0;
import defpackage.jz21;
import defpackage.k3j0;
import defpackage.l3j0;
import defpackage.o3j0;
import defpackage.p3j0;
import defpackage.q6c0;
import defpackage.tje;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.exception.ValidationException;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.ToolbarModalView;

/* loaded from: classes13.dex */
public final class o3j0 extends b implements i3j0 {
    public final ListItemInputComponent A;
    public final View B;
    public final ButtonComponent C;
    public final View D;
    public final pzt0 E;
    public final pzt0 F;
    public final z2j0 G;
    public final l3j0 c;
    public final ToolbarModalView w;
    public final View x;
    public final View y;
    public final ListGroupHeaderComponent z;

    public o3j0(Context context, tse tseVar, l3j0 l3j0Var) {
        this.c = l3j0Var;
        ToolbarModalView toolbarModalView = (ToolbarModalView) LayoutInflater.from(context).inflate(luh0.shared_payment_report_settings, (ViewGroup) null);
        this.w = toolbarModalView;
        int i = e6h0.shared_payment_reports_settings_scroll_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.x = (View) rp31.d(toolbarModalView, i);
        this.y = (View) rp31.d(toolbarModalView, e6h0.shared_payment_reports_settings_scroll_indicator);
        this.z = (ListGroupHeaderComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_reports_settings_header));
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_reports_settings_options));
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_reports_settings_email));
        this.A = listItemInputComponent;
        View view = (View) rp31.d(toolbarModalView, e6h0.shared_payment_reports_settings_save_container);
        this.B = view;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(toolbarModalView, e6h0.shared_payment_reports_settings_save));
        this.C = buttonComponent;
        this.D = (View) rp31.d(toolbarModalView, e6h0.shared_payment_reports_settings_controls_blocker);
        z2j0 z2j0Var = new z2j0(new vfc0(14, this));
        this.G = z2j0Var;
        final int i2 = 0;
        toolbarModalView.getToolbar().setOnNavigationClickListener(new Runnable(this) { // from class: m3j0
            public final /* synthetic */ o3j0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                o3j0 o3j0Var = this.b;
                switch (i3) {
                    case 0:
                        l3j0 l3j0Var2 = o3j0Var.c;
                        l3j0Var2.z.G(l3j0Var2.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var2.B.a.d();
                        break;
                    case 1:
                        l3j0 l3j0Var3 = o3j0Var.c;
                        l3j0Var3.z.G(l3j0Var3.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var3.B.a.d();
                        break;
                    default:
                        l3j0 l3j0Var4 = o3j0Var.c;
                        l3j0Var4.z.G(l3j0Var4.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var4.B.a.d();
                        break;
                }
            }
        });
        toolbarModalView.setDismissOnTouchOutside(false);
        toolbarModalView.setDismissOnBackPressed(false);
        final int i3 = 1;
        toolbarModalView.setOnTouchOutsideListener(new Runnable(this) { // from class: m3j0
            public final /* synthetic */ o3j0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                o3j0 o3j0Var = this.b;
                switch (i32) {
                    case 0:
                        l3j0 l3j0Var2 = o3j0Var.c;
                        l3j0Var2.z.G(l3j0Var2.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var2.B.a.d();
                        break;
                    case 1:
                        l3j0 l3j0Var3 = o3j0Var.c;
                        l3j0Var3.z.G(l3j0Var3.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var3.B.a.d();
                        break;
                    default:
                        l3j0 l3j0Var4 = o3j0Var.c;
                        l3j0Var4.z.G(l3j0Var4.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var4.B.a.d();
                        break;
                }
            }
        });
        final int i4 = 2;
        toolbarModalView.setOnBackPressedListener(new Runnable(this) { // from class: m3j0
            public final /* synthetic */ o3j0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                o3j0 o3j0Var = this.b;
                switch (i32) {
                    case 0:
                        l3j0 l3j0Var2 = o3j0Var.c;
                        l3j0Var2.z.G(l3j0Var2.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var2.B.a.d();
                        break;
                    case 1:
                        l3j0 l3j0Var3 = o3j0Var.c;
                        l3j0Var3.z.G(l3j0Var3.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var3.B.a.d();
                        break;
                    default:
                        l3j0 l3j0Var4 = o3j0Var.c;
                        l3j0Var4.z.G(l3j0Var4.D, SharedPaymentAnalytics$Button.BACK);
                        l3j0Var4.B.a.d();
                        break;
                }
            }
        });
        p6(listItemInputComponent);
        this.F = tje.N(tseVar, null, null, new ReportSettingsViewHolder$special$$inlined$safeCollectIn$1(listItemInputComponent.textFocusFlow(), null, this), 3);
        this.E = tje.N(tseVar, null, null, new ReportSettingsViewHolder$special$$inlined$safeCollectIn$2(listItemInputComponent.textValueFlow(), null, this), 3);
        recyclerView.setAdapter(z2j0Var);
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.payments.shared.details.settings.reports.a
            @Override // java.lang.Runnable
            public final void run() {
                l3j0 l3j0Var2 = o3j0.this.c;
                k3j0 k3j0Var = l3j0Var2.C;
                q6c0 q6c0Var = l3j0Var2.z;
                p3j0 p3j0Var = l3j0Var2.D;
                q6c0Var.G(p3j0Var, SharedPaymentAnalytics$Button.DONE);
                if (!p3j0Var.f.isEmpty() && l3j0Var2.Lg() == null) {
                    l3j0Var2.B.a(k3j0Var.h);
                    ((i3j0) l3j0Var2.Dg()).hideKeyboard();
                    return;
                }
                v vVar = l3j0Var2.y;
                String str = p3j0Var.d;
                vVar.h.getClass();
                String[] strArr = (String[]) new Regex("@").l(3, str).toArray(new String[0]);
                if (strArr.length != 2 || strArr[0].length() <= 0 || strArr[1].length() <= 0) {
                    l3j0Var2.Mg(new ValidationException(Collections.singletonList(new jz21("email", k3j0Var.c))));
                    return;
                }
                ((i3j0) l3j0Var2.Dg()).hideKeyboard();
                p3j0Var.i = true;
                p3j0Var.g = k3j0Var.f;
                p3j0Var.h = true;
                l3j0Var2.Ng();
                tje.N(l3j0Var2.Jg(), null, null, new ReportSettingsPresenter$onSaveButtonClick$1(l3j0Var2, new SaveReportSettingsRequest(p3j0Var.d, l3j0Var2.Lg()), null), 3);
            }
        });
        view.addOnLayoutChangeListener(new yln(18, this));
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        l3j0 l3j0Var = this.c;
        l3j0Var.Bg(this);
        l3j0Var.Ng();
        q6c0 q6c0Var = l3j0Var.z;
        p3j0 p3j0Var = l3j0Var.D;
        q6c0Var.getClass();
        ListBuilder H = q6c0.H(p3j0Var);
        pj pjVar = (pj) q6c0Var.w;
        ArrayList arrayList = new ArrayList(tcc.n(H, 10));
        ListIterator listIterator = H.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                HashMap hashMap = new HashMap();
                hashMap.put("button_list", arrayList);
                pjVar.a.a("ExpenditureReportCard.Shown", hashMap, 1, new HashMap());
                return;
            }
            arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
        }
    }

    @Override // defpackage.i3j0
    public final void Jd() {
        this.A.requestFocus();
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        pzt0 pzt0Var = this.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.E;
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

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.w;
    }

    @Override // defpackage.i3j0
    public final void kd(p3j0 p3j0Var) {
        String str = p3j0Var.d;
        ListItemInputComponent listItemInputComponent = this.A;
        listItemInputComponent.setTextWithoutNotifying(str);
        listItemInputComponent.setAlertText(p3j0Var.e);
        int i = !p3j0Var.f.isEmpty() ? 0 : 8;
        ListGroupHeaderComponent listGroupHeaderComponent = this.z;
        listGroupHeaderComponent.setVisibility(i);
        List list = p3j0Var.f;
        z2j0 z2j0Var = this.G;
        z2j0Var.b = list;
        z2j0Var.notifyDataSetChanged();
        String str2 = p3j0Var.g;
        ButtonComponent buttonComponent = this.C;
        buttonComponent.setText(str2);
        buttonComponent.setProgressing(p3j0Var.h);
        buttonComponent.setEnabled(p3j0Var.j);
        this.D.setVisibility(p3j0Var.i ? 0 : 8);
        listItemInputComponent.setTitle(p3j0Var.a);
        listGroupHeaderComponent.setTitle(p3j0Var.b);
        this.w.getToolbar().setTitle(p3j0Var.c);
    }

    @Override // ru.yandex.taxi.transition.b
    public final void q4(AttachableViewHolder.TransitionType transitionType) {
        super.q4(transitionType);
        l3j0 l3j0Var = this.c;
        if (l3j0Var.D.d.length() == 0) {
            ((i3j0) l3j0Var.Dg()).Jd();
        }
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.w.requestFocus();
    }
}

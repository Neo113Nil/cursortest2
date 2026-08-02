package com.yandex.go.scooters.passes.v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.a7o0;
import defpackage.bia0;
import defpackage.cma1;
import defpackage.e230;
import defpackage.g4b1;
import defpackage.g7o0;
import defpackage.h7o0;
import defpackage.i2b1;
import defpackage.i7o0;
import defpackage.jl40;
import defpackage.k7o0;
import defpackage.kyh0;
import defpackage.n7o0;
import defpackage.ny61;
import defpackage.qco0;
import defpackage.qdb1;
import defpackage.qfh0;
import defpackage.rea0;
import defpackage.srh0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tuo0;
import defpackage.ula;
import defpackage.vj90;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/go/scooters/passes/v2/ScootersPackagesModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Li7o0;", "Landroid/content/Context;", "context", "Ln7o0;", "presenter", "Lbia0;", "paymentResourceProvider", "Lrea0;", "paymentModelsTitleInteractor", "<init>", "(Landroid/content/Context;Ln7o0;Lbia0;Lrea0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li7o0;", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ln7o0;", "Lbia0;", "Lrea0;", "", "purchasingText", "Ljava/lang/String;", "doneText", "Lcom/yandex/go/scooters/passes/v2/list/a;", "adapter", "Lcom/yandex/go/scooters/passes/v2/list/a;", "h7o0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPackagesModalView extends SlideableBindingModalView<i7o0> {
    public static final int $stable = 8;
    private final com.yandex.go.scooters.passes.v2.list.a adapter;
    private final String doneText;
    private final rea0 paymentModelsTitleInteractor;
    private final bia0 paymentResourceProvider;
    private final n7o0 presenter;
    private final String purchasingText;

    public ScootersPackagesModalView(Context context, n7o0 n7o0Var, bia0 bia0Var, rea0 rea0Var) {
        super(context);
        this.presenter = n7o0Var;
        this.paymentResourceProvider = bia0Var;
        this.paymentModelsTitleInteractor = rea0Var;
        this.purchasingText = getContext().getString(kyh0.scooters_passes_purchasing);
        this.doneText = getContext().getString(kyh0.scooters_passes_done_btn);
        this.adapter = new com.yandex.go.scooters.passes.v2.list.a(context, new ScootersPackagesModalView$adapter$1(1, n7o0Var, n7o0.class, "onItemClick", "onItemClick(Lcom/yandex/go/scooters/passes/v2/ScootersPackagesListItemModel;)V", 0));
        qdb1.b(this, new g7o0(n7o0Var, 0));
        setOnBackPressedListener(new g7o0(n7o0Var, 1));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public i7o0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(srh0.scooters_packages_modal_view, parent, false);
        int i = qfh0.button_container;
        GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
        if (goConstraintLayout != null) {
            i = qfh0.legal_terms_agreement;
            if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                i = qfh0.packages_list;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null && (O = cma1.O((i = qfh0.payment_layout_container), inflate)) != null) {
                    ula o = ula.o(O);
                    i = qfh0.purchase_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        return new i7o0((GoConstraintLayout) inflate, goConstraintLayout, recyclerView, o, buttonComponent);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return i2b1.b(this, getBinding().b, getBinding().c);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object obj;
        tpr d;
        Object obj2;
        super.onAttachedToWindow();
        getBinding().c.setAdapter(this.adapter);
        getBinding().c.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().c.addItemDecoration(new a7o0(getContext()));
        getBinding().c.setItemAnimator(null);
        g4b1.c(getBinding().b, getBinding().c);
        ru.yandex.taxi.design.utils.c.z(new ScootersPackagesModalView$onAttachedToWindow$1(0, this.presenter, n7o0.class, "openPaymentMethodsDialog", "openPaymentMethodsDialog()V", 0), getBinding().d.e);
        n7o0 n7o0Var = this.presenter;
        n7o0Var.Bg(new h7o0(this));
        com.yandex.go.scooters.passes.v2.domain.a aVar = n7o0Var.z;
        qco0 qco0Var = n7o0Var.G;
        String str = n7o0Var.E;
        tuo0 tuo0Var = aVar.c;
        if (str != null) {
            Iterator it = qco0Var.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (jl40.l(((vj90) obj2).a, str)) {
                        break;
                    }
                }
            }
            vj90 vj90Var = (vj90) obj2;
            if (vj90Var != null) {
                tuo0Var.Fg(vj90Var);
            }
        }
        vj90 vj90Var2 = (vj90) ((r0) tuo0Var.b).getValue();
        if (vj90Var2 != null) {
            List list = qco0Var.h;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (jl40.l(vj90Var2.a, ((vj90) it2.next()).a)) {
                        break;
                    }
                }
            }
        }
        Iterator it3 = qco0Var.h.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it3.next();
                if (((vj90) obj).k) {
                    break;
                }
            }
        }
        vj90 vj90Var3 = (vj90) obj;
        if (vj90Var3 != null) {
            tuo0Var.Fg(vj90Var3);
        }
        tje.N(n7o0Var.Jg(), null, null, new ScootersPackagesPresenter$listenToUiState$$inlined$collectIn$1(new o(com.yandex.go.coroutines.b.c(aVar.a(qco0Var), new ScootersPackagesPresenter$listenToUiState$1(qco0Var, n7o0Var, null)), new ScootersPackagesPresenter$listenToUiState$2(n7o0Var, null)), null, (k7o0) n7o0Var.Dg()), 3);
        tje.N(n7o0Var.Jg(), null, null, new ScootersPackagesPresenter$listenToPurchasesResults$$inlined$collectIn$1(new c(new com.yandex.go.scooters.passes.domain.b(n7o0Var.C.a.f("package"))), null, n7o0Var), 3);
        d = n7o0Var.B.d(null, true);
        tje.N(n7o0Var.Jg(), null, null, new ScootersPackagesPresenter$listenPaymentOptions$$inlined$collectIn$1(d, null, (k7o0) n7o0Var.Dg()), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}

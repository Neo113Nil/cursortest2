package com.yandex.go.scooters.passes.active;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.yandex.go.coroutines.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aki0;
import defpackage.arm0;
import defpackage.brm0;
import defpackage.bys;
import defpackage.cma1;
import defpackage.crm0;
import defpackage.do91;
import defpackage.e230;
import defpackage.f3x;
import defpackage.g4b1;
import defpackage.g8m0;
import defpackage.grm0;
import defpackage.hxj0;
import defpackage.j3x;
import defpackage.ny61;
import defpackage.o990;
import defpackage.qfh0;
import defpackage.qoi0;
import defpackage.srh0;
import defpackage.t1m0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.uqm0;
import defpackage.vqm0;
import defpackage.w130;
import defpackage.wxs;
import defpackage.xqm0;
import defpackage.zqm0;
import defpackage.zxs;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR \u0010!\u001a\f\u0012\u0006\b\u0000\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/go/scooters/passes/active/ScootersActivePassesModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lcrm0;", "Landroid/content/Context;", "context", "Lgrm0;", "scootersActivePassesPresenter", "<init>", "(Landroid/content/Context;Lgrm0;)V", "Lzy11;", "initList", "()V", "Lru/yandex/taxi/widget/RobotoTextView;", "createRobotoTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "viewGroup", "Lxqm0;", "createScootersActivePassViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxqm0;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcrm0;", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "Landroid/content/Context;", "Lgrm0;", "Lbys;", "", "adapter", "Lbys;", "", "additionRecyclerViewBottomPadding", CA20Status.STATUS_USER_I, "brm0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersActivePassesModalView extends SlideableBindingModalView<crm0> {
    public static final int $stable = 8;
    private bys adapter;
    private int additionRecyclerViewBottomPadding;
    private final Context context;
    private final grm0 scootersActivePassesPresenter;

    public ScootersActivePassesModalView(Context context, grm0 grm0Var) {
        super(context);
        this.context = context;
        this.scootersActivePassesPresenter = grm0Var;
        this.additionRecyclerViewBottomPadding = tje.u(8, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RobotoTextView createRobotoTextView() {
        return new RobotoTextView(this.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xqm0 createScootersActivePassViewBinding(LayoutInflater inflater, ViewGroup viewGroup) {
        View inflate = inflater.inflate(srh0.scooters_active_pass_view, viewGroup, false);
        int i = qfh0.progress;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) cma1.O(i, inflate);
        if (linearProgressIndicator != null) {
            i = qfh0.subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = qfh0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    return new xqm0((GoLinearLayout) inflate, linearProgressIndicator, robotoTextView, robotoTextView2);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    private final void initList() {
        RecyclerView recyclerView = getBinding().d;
        j3x j3xVar = new j3x();
        initList$lambda$0(this, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        this.adapter = bysVar;
        getBinding().d.addItemDecoration(new zqm0(tje.u(16, getContext()), tje.u(8, getContext())));
        g4b1.c(getBinding().b, getBinding().d);
    }

    private static final zy11 initList$lambda$0(ScootersActivePassesModalView scootersActivePassesModalView, j3x j3xVar) {
        ScootersActivePassesModalView$initList$1$1 scootersActivePassesModalView$initList$1$1 = new ScootersActivePassesModalView$initList$1$1(0, scootersActivePassesModalView, ScootersActivePassesModalView.class, "createRobotoTextView", "createRobotoTextView()Lru/yandex/taxi/widget/RobotoTextView;", 0);
        j3xVar.getClass();
        byte b = 0;
        aki0.b(new f3x(vqm0.class, j3xVar, scootersActivePassesModalView$initList$1$1), new t1m0(b, 29));
        j3xVar.a.add(new zxs(uqm0.class, 0, null, EmptyList.a, null, new o990(13, new f3x(uqm0.class, j3xVar, new ScootersActivePassesModalView$initList$1$3(2, scootersActivePassesModalView, ScootersActivePassesModalView.class, "createScootersActivePassViewBinding", "createScootersActivePassViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lru/yandex/taxi/scooters/preorder/databinding/ScootersActivePassViewBinding;", 0)), new arm0(b))));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initList$lambda$0$0(RobotoTextView robotoTextView, vqm0 vqm0Var) {
        robotoTextView.setTag(qoi0.a(vqm0.class));
        robotoTextView.setText(vqm0Var.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initList$lambda$0$1(xqm0 xqm0Var, uqm0 uqm0Var) {
        xqm0Var.a.setTag(qoi0.a(uqm0.class));
        xqm0Var.d.setText(uqm0Var.a);
        xqm0Var.c.setText(uqm0Var.b);
        LinearProgressIndicator linearProgressIndicator = xqm0Var.b;
        linearProgressIndicator.setMax(100);
        linearProgressIndicator.setProgress(uqm0Var.c);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersActivePassesModalView scootersActivePassesModalView, t1w t1wVar) {
        boolean z = t1wVar.f;
        zy11 zy11Var = zy11.a;
        if (z) {
            return zy11Var;
        }
        scootersActivePassesModalView.setTopSystemWindowInset(t1wVar.b);
        GoConstraintLayout goConstraintLayout = scootersActivePassesModalView.getBinding().b;
        goConstraintLayout.setPadding(goConstraintLayout.getPaddingLeft(), goConstraintLayout.getPaddingTop(), goConstraintLayout.getPaddingRight(), t1wVar.g);
        if (scootersActivePassesModalView.getBinding().b.getHeight() <= 0) {
            GoConstraintLayout goConstraintLayout2 = scootersActivePassesModalView.getBinding().b;
            OneShotPreDrawListener.add(goConstraintLayout2, new do91(12, goConstraintLayout2, scootersActivePassesModalView));
            return zy11Var;
        }
        RecyclerView recyclerView = scootersActivePassesModalView.getBinding().d;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), scootersActivePassesModalView.getBinding().b.getHeight() + scootersActivePassesModalView.additionRecyclerViewBottomPadding);
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersActivePassesModalView scootersActivePassesModalView) {
        scootersActivePassesModalView.scootersActivePassesPresenter.y.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public crm0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_active_passes_modal_view, parent, false);
        int i = qfh0.bottom_container;
        GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
        if (goConstraintLayout != null) {
            i = qfh0.close_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = qfh0.rv;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    return new crm0((GoFrameLayout) inflate, goConstraintLayout, buttonComponent, recyclerView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new g8m0(21, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initList();
        grm0 grm0Var = this.scootersActivePassesPresenter;
        brm0 brm0Var = new brm0(this);
        grm0Var.Bg(brm0Var);
        tje.N(grm0Var.Jg(), null, null, new ScootersActivePassesPresenter$attachView$$inlined$collectIn$1(b.c(grm0Var.B.a, new ScootersActivePassesPresenter$attachView$1(grm0Var, null)), null, brm0Var), 3);
        getBinding().c.setDebounceClickListener(new hxj0(27, this));
    }
}

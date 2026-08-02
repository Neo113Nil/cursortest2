package com.yandex.go.taxi.intercity.dashboard.impl.feedback.presentation.modal;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.intercity.dashboard.impl.feedback.interactor.a;
import defpackage.aub;
import defpackage.c230;
import defpackage.cma1;
import defpackage.ddw;
import defpackage.dhv;
import defpackage.i8w;
import defpackage.j8h0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k7x0;
import defpackage.kp50;
import defpackage.lds0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qcw;
import defpackage.qje;
import defpackage.r7v;
import defpackage.ra9;
import defpackage.rcw;
import defpackage.scw;
import defpackage.tje;
import defpackage.tkh0;
import defpackage.tug0;
import defpackage.u8w;
import defpackage.vcw;
import defpackage.xen;
import defpackage.xng0;
import defpackage.xuv;
import defpackage.ycw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0004*\u0001-\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B-\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b \u0010\u0011J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0014¢\u0006\u0004\b%\u0010\u0011R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/feedback/presentation/modal/IntercityDashboardFeedbackModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lscw;", "Lqcw;", "Lnwy0;", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Landroid/content/Context;", "context", "Lvcw;", "feedbackPresenter", "<init>", "(Lpav;Lk7x0;Landroid/content/Context;Lvcw;)V", "Lzy11;", "updateBottomElevation", "()V", "Lc230;", "insetsType", "()Lc230;", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "behavior", "initBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lscw;", "onAttachedToWindow", "Lddw;", "uiState", "render", "(Lddw;)V", "onDetachedFromWindow", "Lvcw;", "Lycw;", "reasonAdapter", "Lycw;", "", "controlsElevation", "F", "rcw", "scrollListener", "Lrcw;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardFeedbackModalView extends SlideableBindingModalView<scw> implements qcw {
    private final float controlsElevation;
    private final vcw feedbackPresenter;
    private final ycw reasonAdapter;
    private final rcw scrollListener;

    public IntercityDashboardFeedbackModalView(pav pavVar, k7x0 k7x0Var, Context context, vcw vcwVar) {
        super(context);
        this.feedbackPresenter = vcwVar;
        ycw ycwVar = new ycw(pavVar, k7x0Var, new xen(26, this));
        this.reasonAdapter = ycwVar;
        this.controlsElevation = tje.r(tug0.feedback_reasons_controls_elevation, context);
        rcw rcwVar = new rcw(this);
        this.scrollListener = rcwVar;
        b.q(getBinding().g, true);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        scw binding = getBinding();
        c.z(new i8w(15), binding.a);
        RecyclerView recyclerView = binding.f;
        h hVar = new h();
        hVar.g = false;
        hVar.c = 300L;
        hVar.d = 0L;
        hVar.f = 0L;
        hVar.e = 0L;
        recyclerView.setItemAnimator(hVar);
        recyclerView.addOnScrollListener(rcwVar);
        recyclerView.setAdapter(ycwVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        binding.d.setHintColor(qje.u(context.getTheme(), xng0.textMinor));
        binding.c.setDebounceClickListener(new dhv(5, this));
        binding.e.setDebounceClickListener(new r7v(6, binding, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$2(IntercityDashboardFeedbackModalView intercityDashboardFeedbackModalView) {
        u8w u8wVar = intercityDashboardFeedbackModalView.feedbackPresenter.A;
        u8wVar.getClass();
        u8wVar.a.a("Intercity.Feedback.CancelButton.Tapped", new HashMap(), 1, new HashMap());
        intercityDashboardFeedbackModalView.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$3(scw scwVar, IntercityDashboardFeedbackModalView intercityDashboardFeedbackModalView) {
        Editable text = scwVar.d.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        vcw vcwVar = intercityDashboardFeedbackModalView.feedbackPresenter;
        String str = (String) vcwVar.z.a.b.getValue();
        String str2 = str != null ? str : "";
        u8w u8wVar = vcwVar.A;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("selected_reason", str2);
        hashMap.put("comment", obj);
        u8wVar.a.a("Intercity.Feedback.DoneButton.Tapped", hashMap, 1, new HashMap());
        ((ra9) vcwVar.x.a).r(new xuv(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reasonAdapter$lambda$0(IntercityDashboardFeedbackModalView intercityDashboardFeedbackModalView, String str) {
        Object value;
        r0 r0Var = intercityDashboardFeedbackModalView.feedbackPresenter.z.a.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, !jl40.l((String) value, str) ? str : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBottomElevation() {
        scw binding = getBinding();
        int computeVerticalScrollRange = binding.f.computeVerticalScrollRange();
        RecyclerView recyclerView = binding.f;
        binding.b.setElevation(recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= computeVerticalScrollRange ? 0.0f : this.controlsElevation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public scw bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tkh0.intercity_dashboard_feedback_modal_view, parent, false);
        int i = j8h0.bottom_layout;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = j8h0.button_container;
            if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
                i = j8h0.cancel_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = j8h0.commentField;
                    ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
                    if (listItemInputComponent != null) {
                        i = j8h0.done_button;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            i = j8h0.reasons_recycler;
                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                            if (recyclerView != null) {
                                i = j8h0.title_text;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView != null) {
                                    return new scw((GoConstraintLayout) inflate, goLinearLayout, buttonComponent, listItemInputComponent, buttonComponent2, recyclerView, robotoTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        super.initBehavior(behavior);
        behavior.W = false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vcw vcwVar = this.feedbackPresenter;
        vcwVar.Bg(this);
        a aVar = vcwVar.z;
        aVar.a.a.g(vcwVar.y);
        e.H(vcwVar.Jg(), new jqr(aVar.a(), new IntercityDashboardFeedbackPresenter$attachView$1(2, this, qcw.class, "render", "render(Ljava/lang/Object;)V", 4), 3));
        u8w u8wVar = vcwVar.A;
        u8wVar.getClass();
        u8wVar.a.a("Intercity.Feedback.Card.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.feedbackPresenter.Cg();
    }

    @Override // defpackage.eyi0
    public void render(ddw uiState) {
        scw binding = getBinding();
        binding.g.setText(uiState.a);
        binding.d.setHint(uiState.b);
        binding.c.setText(uiState.c);
        binding.e.setText(uiState.d);
        ycw ycwVar = this.reasonAdapter;
        ArrayList arrayList = uiState.e;
        List list = ycwVar.y;
        ycwVar.y = kotlin.collections.a.J0(arrayList);
        kp50.f(new lds0(list, arrayList, new aub(11)), true).b(ycwVar);
        getBinding().d.setHintColor(qje.t(xng0.textMinor, getContext()));
    }
}

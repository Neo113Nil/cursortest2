package com.yandex.go.scooters.insurance.details;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aki0;
import defpackage.atn0;
import defpackage.bys;
import defpackage.cma1;
import defpackage.ctn0;
import defpackage.dr7;
import defpackage.ehn0;
import defpackage.f3x;
import defpackage.i3y;
import defpackage.j3x;
import defpackage.lbb0;
import defpackage.lg21;
import defpackage.mg21;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qfh0;
import defpackage.qgn0;
import defpackage.qu;
import defpackage.srh0;
import defpackage.tje;
import defpackage.v3n0;
import defpackage.wxs;
import defpackage.xw31;
import defpackage.ykn0;
import defpackage.zy11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.utils.URLSpanFix;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\n\u0012\u0006\b\u0000\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/go/scooters/insurance/details/ScootersInsuranceDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Latn0;", "Landroid/content/Context;", "context", "Llg21;", "uriRouter", "", "title", "", "items", "Lctn0;", "scootersInsuranceDetailsNavigator", "<init>", "(Landroid/content/Context;Llg21;Ljava/lang/CharSequence;Ljava/util/List;Lctn0;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "prepareTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "text", "Lzy11;", "bindItem", "(Lru/yandex/taxi/widget/RobotoTextView;Ljava/lang/CharSequence;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Latn0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/CharSequence;", "Ljava/util/List;", "Lctn0;", "Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "linkMovementMethod$delegate", "Li3y;", "getLinkMovementMethod", "()Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "linkMovementMethod", "Lbys;", "", "itemsAdapter", "Lbys;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersInsuranceDetailsModalView extends SlideableBindingModalView<atn0> {
    public static final int $stable = 8;
    private final List<CharSequence> items;
    private final bys itemsAdapter;

    /* renamed from: linkMovementMethod$delegate, reason: from kotlin metadata */
    private final i3y linkMovementMethod;
    private final ctn0 scootersInsuranceDetailsNavigator;
    private final CharSequence title;

    /* JADX WARN: Multi-variable type inference failed */
    public ScootersInsuranceDetailsModalView(Context context, lg21 lg21Var, CharSequence charSequence, List<? extends CharSequence> list, ctn0 ctn0Var) {
        super(context);
        this.title = charSequence;
        this.items = list;
        this.scootersInsuranceDetailsNavigator = ctn0Var;
        this.linkMovementMethod = a.b(LazyThreadSafetyMode.NONE, new ehn0(6, lg21Var));
        RecyclerView recyclerView = getBinding().b;
        j3x j3xVar = new j3x();
        itemsAdapter$lambda$0(this, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        recyclerView.setLayoutManager(linearLayoutManager == null ? new LinearLayoutManager(recyclerView.getContext(), 1, false) : linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        this.itemsAdapter = bysVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        getBinding().b.setItemAnimator(null);
    }

    private final void bindItem(RobotoTextView robotoTextView, CharSequence charSequence) {
        robotoTextView.setText(charSequence);
    }

    private final LinkMovementMethod getLinkMovementMethod() {
        return (LinkMovementMethod) this.linkMovementMethod.getValue();
    }

    private static final zy11 itemsAdapter$lambda$0(ScootersInsuranceDetailsModalView scootersInsuranceDetailsModalView, j3x j3xVar) {
        ScootersInsuranceDetailsModalView$itemsAdapter$1$1 scootersInsuranceDetailsModalView$itemsAdapter$1$1 = new ScootersInsuranceDetailsModalView$itemsAdapter$1$1(0, scootersInsuranceDetailsModalView, ScootersInsuranceDetailsModalView.class, "prepareTextView", "prepareTextView()Lru/yandex/taxi/widget/RobotoTextView;", 0);
        j3xVar.getClass();
        aki0.b(new f3x(CharSequence.class, j3xVar, scootersInsuranceDetailsModalView$itemsAdapter$1$1), new lbb0(27, scootersInsuranceDetailsModalView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 itemsAdapter$lambda$0$0(ScootersInsuranceDetailsModalView scootersInsuranceDetailsModalView, RobotoTextView robotoTextView, CharSequence charSequence) {
        scootersInsuranceDetailsModalView.bindItem(robotoTextView, charSequence);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkMovementMethod linkMovementMethod_delegate$lambda$0(lg21 lg21Var) {
        return new LinkMovementMethod(new ykn0(2, lg21Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean linkMovementMethod_delegate$lambda$0$0(lg21 lg21Var, ClickableSpan clickableSpan) {
        if (!(clickableSpan instanceof URLSpanFix)) {
            return false;
        }
        ((mg21) lg21Var).c(((URLSpanFix) clickableSpan).getURL());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersInsuranceDetailsModalView scootersInsuranceDetailsModalView) {
        ((dr7) ((qgn0) scootersInsuranceDetailsModalView.scootersInsuranceDetailsNavigator).b).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RobotoTextView prepareTextView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        xw31.E(robotoTextView, null, null, null, Integer.valueOf(tje.r(mrg0.go_design_m_space, robotoTextView.getContext())));
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_body, robotoTextView.getContext()));
        robotoTextView.setTextIsSelectable(true);
        robotoTextView.setMovementMethod(getLinkMovementMethod());
        return robotoTextView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public atn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_insurance_details_modal_view, parent, false);
        int i = qfh0.items_recycler_view;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = qfh0.ok_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = qfh0.title_text_view;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    return new atn0((GoLinearLayout) inflate, recyclerView, buttonComponent, robotoTextView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        getBinding().d.setText(this.title);
        this.itemsAdapter.submitList(this.items, null);
        getBinding().b.setVisibility(this.items.isEmpty() ? 8 : 0);
        getBinding().c.setDebounceClickListener(new v3n0(14, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBinding().c.setDebounceClickListener(null);
    }
}

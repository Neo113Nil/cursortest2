package com.yandex.go.taxi.order.comment;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.taxi.order.api.details.common.domain.feedback.a;
import com.yandex.go.taxi.order.feedback.domain.b;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.bsq;
import defpackage.c230;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.csq;
import defpackage.dm21;
import defpackage.dsq;
import defpackage.ejp;
import defpackage.eqc;
import defpackage.evu0;
import defpackage.fsq;
import defpackage.gsq;
import defpackage.hsq;
import defpackage.isq;
import defpackage.k1a;
import defpackage.ksq;
import defpackage.m950;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p8h0;
import defpackage.qdb1;
import defpackage.qpo;
import defpackage.u1n;
import defpackage.wpc;
import defpackage.xd2;
import defpackage.yrq;
import defpackage.yvf0;
import defpackage.zkh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'*B)\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010\rJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0018\u0010(\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/go/taxi/order/comment/FeedbackCommentModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lhsq;", "Landroid/content/Context;", "context", "Ldsq;", "presenter", "Lbsq;", FoldersConfig.SUPPORT_FILTER_ID, "<init>", "(Landroid/content/Context;Ldsq;Lbsq;)V", "Lzy11;", "makeInputScrollable", "()V", "exit", "Lgsq;", "uiState", "bind", "(Lgsq;)V", "Lc230;", "insetsType", "()Lc230;", "", "isArrowsPermanentlyHidden", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lhsq;", "onAttachedToWindow", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "Ldsq;", "Lbsq;", "Lyrq;", "mvpView", "Lyrq;", "zrq", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeedbackCommentModalView extends SlideableBindingModalView<hsq> {
    public static final int $stable = 8;
    private final yrq mvpView;
    private final dsq presenter;
    private final bsq support;

    public FeedbackCommentModalView(Context context, dsq dsqVar, bsq bsqVar) {
        super(context);
        this.presenter = dsqVar;
        this.support = bsqVar;
        this.mvpView = new yrq(this);
        qdb1.c(this, new ejp(2, this));
        hsq binding = getBinding();
        ListHeaderComponent listHeaderComponent = binding.d;
        ButtonComponent buttonComponent = binding.e;
        listHeaderComponent.setMinHeight(0);
        binding.d.setVerticalPadding(0);
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.c;
        animatedListItemInputComponent.setOnKeyboardClosed(new FeedbackCommentModalView$2$1(0, this, FeedbackCommentModalView.class, "exit", "exit()V", 0));
        makeInputScrollable();
        animatedListItemInputComponent.setUseClearTextButton(true);
        binding.b.setDebounceClickListener(new qpo(3, this, binding));
        if (bsqVar != null) {
            buttonComponent.setAccent(false);
            buttonComponent.setVisibility(0);
            buttonComponent.setText(bsqVar.a);
            buttonComponent.setDebounceClickListener(new qpo(4, this, bsqVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(gsq uiState) {
        hsq binding = getBinding();
        ListHeaderComponent listHeaderComponent = binding.d;
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.c;
        listHeaderComponent.setVisibility(!evu0.J(uiState.a) ? 0 : 8);
        binding.d.setTitle(uiState.a);
        String str = uiState.b;
        if (str != null) {
            animatedListItemInputComponent.setValue(str);
        }
        animatedListItemInputComponent.requestFocus();
        animatedListItemInputComponent.setSelection(animatedListItemInputComponent.getInput().length());
        animatedListItemInputComponent.showKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exit() {
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().c;
        animatedListItemInputComponent.post(new ce0(animatedListItemInputComponent, 15));
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(FeedbackCommentModalView feedbackCommentModalView, hsq hsqVar) {
        dsq dsqVar = feedbackCommentModalView.presenter;
        Editable text = hsqVar.c.getInput().getText();
        String obj = text != null ? text.toString() : null;
        u1n u1nVar = dsqVar.w;
        o2y0 o2y0Var = dsqVar.x;
        ((a) u1nVar.c).a(o2y0Var, obj);
        String str = o2y0Var.b().a;
        b bVar = (b) ((dm21) u1nVar.b);
        isq isqVar = new isq(str, bVar.b(str));
        isqVar.k = obj;
        bVar.d(str, new ksq(isqVar));
        feedbackCommentModalView.exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$1$0(FeedbackCommentModalView feedbackCommentModalView, bsq bsqVar) {
        dsq dsqVar = feedbackCommentModalView.presenter;
        String str = bsqVar.b;
        k1a k1aVar = (k1a) dsqVar.y.b;
        csq csqVar = (csq) k1aVar.x;
        if (csqVar != null) {
            k1aVar.A((m950) ((yvf0) k1aVar.J).get(), new wpc(eqc.b, 2), new fsq(k1aVar, csqVar, str, 0));
        }
        AnimatedListItemInputComponent animatedListItemInputComponent = feedbackCommentModalView.getBinding().c;
        animatedListItemInputComponent.post(new ce0(animatedListItemInputComponent, 15));
    }

    private final void makeInputScrollable() {
        KeyboardAwareRobotoEditText input = getBinding().c.getInput();
        input.setVerticalScrollBarEnabled(true);
        input.addOnAttachStateChangeListener(new FeedbackCommentModalView$makeInputScrollable$1(input));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public hsq bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.feedback_comment_view, parent, false);
        int i = p8h0.comment_done_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = p8h0.comment_view;
            AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, inflate);
            if (animatedListItemInputComponent != null) {
                i = p8h0.header;
                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                if (listHeaderComponent != null) {
                    i = p8h0.support_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent2 != null) {
                        return new hsq((LinearLayout) inflate, buttonComponent, animatedListItemInputComponent, listHeaderComponent, buttonComponent2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r3 == null) goto L15;
     */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        dsq dsqVar = this.presenter;
        yrq yrqVar = this.mvpView;
        dsqVar.Bg(yrqVar);
        u1n u1nVar = dsqVar.w;
        o2y0 o2y0Var = dsqVar.x;
        ksq b = ((b) ((dm21) u1nVar.b)).b(o2y0Var.b().a);
        String str2 = o2y0Var.b().b().b;
        if (str2 == null || evu0.J(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = b.c.f(b.i);
        }
        String f = o2y0Var.b().l.getW().getF();
        if (f != null) {
            str = evu0.J(f) ? null : f;
        }
        str = b.j;
        yrqVar.a.bind(new gsq(str2, str));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().c;
        animatedListItemInputComponent.requestFocus();
        animatedListItemInputComponent.performAccessibilityAction(1, null);
        animatedListItemInputComponent.sendAccessibilityEvent(8);
        animatedListItemInputComponent.post(new xd2(animatedListItemInputComponent, 1));
    }
}

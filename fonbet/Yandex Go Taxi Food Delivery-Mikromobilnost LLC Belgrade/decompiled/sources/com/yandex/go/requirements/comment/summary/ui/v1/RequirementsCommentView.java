package com.yandex.go.requirements.comment.summary.ui.v1;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import defpackage.c7h0;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.f580;
import defpackage.f95;
import defpackage.hvh0;
import defpackage.ii30;
import defpackage.iqj0;
import defpackage.kot0;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.rp31;
import defpackage.sej0;
import defpackage.sot0;
import defpackage.tje;
import defpackage.ud30;
import defpackage.uot0;
import defpackage.v130;
import defpackage.vot0;
import defpackage.x4e;
import defpackage.xcv0;
import defpackage.xmf0;
import defpackage.xw31;
import defpackage.yot0;
import defpackage.zot0;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v1/RequirementsCommentView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lsej0;", "Landroid/content/Context;", "context", "", "placeholder", "initialComment", "Liqj0;", "backPressedDelegate", "Lf95;", "presenter", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Liqj0;Lf95;)V", "Lzy11;", "initInputView", "(Ljava/lang/String;Ljava/lang/String;Liqj0;)V", "initDoneButton", "(Liqj0;)V", "focusInput", "()V", "Lv130;", "insetsType", "()Lv130;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lsej0;", "Lf95;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementsCommentView extends SlideableBindingModalView<sej0> {
    public static final int $stable = 8;
    private final f95 presenter;

    public RequirementsCommentView(Context context, String str, String str2, iqj0 iqj0Var, f95 f95Var) {
        super(context);
        this.presenter = f95Var;
        initDoneButton(iqj0Var);
        initInputView(str, str2, iqj0Var);
    }

    private final void focusInput() {
        ListItemInputComponent listItemInputComponent = getBinding().b;
        OneShotPreDrawListener.add(listItemInputComponent, new ii30(19, listItemInputComponent));
    }

    private final void initDoneButton(iqj0 backPressedDelegate) {
        int i = c7h0.requirement_done_button;
        WeakHashMap weakHashMap = b.a;
        ((ButtonComponent) ((View) rp31.d(this, i))).setDebounceClickListener(new xmf0(18, this, backPressedDelegate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDoneButton$lambda$0(RequirementsCommentView requirementsCommentView, iqj0 iqj0Var) {
        f95 f95Var = requirementsCommentView.presenter;
        Editable text = requirementsCommentView.getBinding().b.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        uot0 uot0Var = ((kot0) f95Var).w;
        vot0 vot0Var = uot0Var.b;
        zot0 zot0Var = uot0Var.a;
        yot0 yot0Var = zot0Var.e;
        String str = zot0Var.g;
        if (yot0Var != null && yot0Var.f) {
            if (evu0.J(obj)) {
                vot0Var.z.a().w(str);
            } else {
                vot0Var.z.a().r(str, obj);
            }
        }
        ((sot0) vot0Var.Dg()).ib(str, obj);
        vot0Var.y.e(str, obj);
        iqj0Var.a(requirementsCommentView);
    }

    private final void initInputView(String placeholder, String initialComment, iqj0 backPressedDelegate) {
        ListItemInputComponent listItemInputComponent = getBinding().b;
        listItemInputComponent.setOnKeyboardCloseListener(new ud30(26, this, listItemInputComponent, backPressedDelegate));
        if (placeholder != null && !evu0.J(placeholder)) {
            listItemInputComponent.setHint(placeholder);
        }
        if (initialComment == null) {
            initialComment = "";
        }
        listItemInputComponent.setText(initialComment);
        listItemInputComponent.disallowParentInterceptTouchEventsOnScroll();
        xw31.y(tje.u(12, listItemInputComponent.getContext()), listItemInputComponent.getInput());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initInputView$lambda$0$0(RequirementsCommentView requirementsCommentView, ListItemInputComponent listItemInputComponent, iqj0 iqj0Var) {
        f95 f95Var = requirementsCommentView.presenter;
        Editable text = listItemInputComponent.getText();
        if (text != null) {
            text.toString();
        }
        f95Var.getClass();
        iqj0Var.a(listItemInputComponent);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public sej0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(hvh0.requirement_comment_view, parent, false);
        int i = c7h0.comment_input;
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
        if (listItemInputComponent != null) {
            i = c7h0.requirement_done_button;
            if (((ButtonComponent) cma1.O(i, inflate)) != null) {
                return new sej0((LinearLayout) inflate, listItemInputComponent);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public v130 insetsType() {
        return new v130(2);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f95 f95Var = this.presenter;
        Editable text = getBinding().b.getText();
        boolean z = text == null || evu0.J(text);
        uot0 uot0Var = ((kot0) f95Var).w;
        f580 f580Var = uot0Var.b.H;
        String str = uot0Var.a.g;
        xcv0 xcv0Var = f580Var.c;
        HashMap m = nnm.m(xcv0Var, "requirement_id", str);
        xcv0Var.a.a("Summary.Requirements.CommentShown", m, 1, x4e.r(!z, m, "has_comment"));
        focusInput();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f95 f95Var = this.presenter;
        getBinding().b.getText();
        f95Var.getClass();
        f95 f95Var2 = this.presenter;
        Editable text = getBinding().b.getText();
        boolean z = text == null || evu0.J(text);
        uot0 uot0Var = ((kot0) f95Var2).w;
        uot0Var.b.H.b(uot0Var.a.g, !z);
    }
}

package com.yandex.go.captcha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.di3;
import defpackage.ei3;
import defpackage.h60;
import defpackage.ihh0;
import defpackage.ki3;
import defpackage.lsh0;
import defpackage.ny61;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/captcha/AuthChallengeExplainModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lei3;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onLoginClicked", "onCloseClicked", "Lki3;", "strings", "<init>", "(Landroid/content/Context;Lsls;Lsls;Lki3;)V", "bindViews", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lei3;", "Lsls;", "Lki3;", "Companion", "di3", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthChallengeExplainModalView extends SlideableBindingModalView<ei3> {
    public static final String CLOSE_CLICKED_TAG = "close_clicked";
    public static final di3 Companion = new di3();
    public static final String LOGIN_CLICKED_TAG = "login_clicked";
    private final sls onCloseClicked;
    private final sls onLoginClicked;
    private final ki3 strings;

    public AuthChallengeExplainModalView(Context context, sls slsVar, sls slsVar2, ki3 ki3Var) {
        super(context);
        this.onLoginClicked = slsVar;
        this.onCloseClicked = slsVar2;
        this.strings = ki3Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        bindViews();
    }

    private final void bindViews() {
        ei3 binding = getBinding();
        binding.b.setTextTypeface(3);
        ButtonComponent buttonComponent = binding.b;
        buttonComponent.setDebounceClickListener(new h60(9, this.onLoginClicked));
        binding.e.setOnCloseClickListener(new h60(10, this.onCloseClicked));
        String str = this.strings.c;
        if (str != null) {
            buttonComponent.setText(str);
        }
        String str2 = this.strings.a;
        if (str2 != null) {
            binding.d.setTitle(str2);
        }
        String str3 = this.strings.b;
        if (str3 != null) {
            binding.c.setTitle(str3);
        }
        ConstraintLayout constraintLayout = getBinding().a;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.post(new ce0(constraintLayout, 15));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ei3 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(lsh0.auth_challenge_explain_modal_view, parent, false);
        int i = ihh0.auth_challenge_explain_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = ihh0.auth_challenge_explain_subtitle;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = ihh0.auth_challenge_explain_title;
                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent2 != null) {
                    i = ihh0.auth_challenge_explain_toolbar;
                    ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                    if (toolbarComponent != null) {
                        return new ei3((ConstraintLayout) inflate, buttonComponent, listItemComponent, listItemComponent2, toolbarComponent);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}

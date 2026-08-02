package com.yandex.go.trusted_contacts.share_settings.edit;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.trusted_contacts.data.entities.network.EditContactNameConfigDto;
import defpackage.aln;
import defpackage.bxl;
import defpackage.c230;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dln;
import defpackage.ej1;
import defpackage.evu0;
import defpackage.fln;
import defpackage.glh0;
import defpackage.jl40;
import defpackage.jln;
import defpackage.lln;
import defpackage.mln;
import defpackage.ny61;
import defpackage.qu;
import defpackage.w8h0;
import defpackage.wqj;
import defpackage.wwb;
import defpackage.xd2;
import defpackage.ymj;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.utils.BaseTextWatcher;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/yandex/go/trusted_contacts/share_settings/edit/EditContactNameModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lmln;", "Landroid/content/Context;", "context", "Lfln;", "presenter", "<init>", "(Landroid/content/Context;Lfln;)V", "Lzy11;", "hideKeyboard", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lmln;", "Lc230;", "insetsType", "()Lc230;", "onAttachedToWindow", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "Lfln;", "Lru/yandex/taxi/utils/BaseTextWatcher;", "nameTextWatcher", "Lru/yandex/taxi/utils/BaseTextWatcher;", "aln", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EditContactNameModalView extends SlideableBindingModalView<mln> {
    private final BaseTextWatcher nameTextWatcher;
    private final fln presenter;

    public EditContactNameModalView(Context context, fln flnVar) {
        super(context);
        this.presenter = flnVar;
        this.nameTextWatcher = new BaseTextWatcher() { // from class: com.yandex.go.trusted_contacts.share_settings.edit.EditContactNameModalView$nameTextWatcher$1
            @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                EditContactNameModalView.access$getBinding(EditContactNameModalView.this).b.setErrorText(null);
            }
        };
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    public static final /* synthetic */ mln access$getBinding(EditContactNameModalView editContactNameModalView) {
        return editContactNameModalView.getBinding();
    }

    private final void hideKeyboard() {
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().b;
        animatedListItemInputComponent.clearInputFocus();
        animatedListItemInputComponent.post(new ce0(animatedListItemInputComponent, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(EditContactNameModalView editContactNameModalView) {
        return editContactNameModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0$0$0(AnimatedListItemInputComponent animatedListItemInputComponent, EditContactNameModalView editContactNameModalView) {
        animatedListItemInputComponent.hideKeyboard();
        editContactNameModalView.onBackPressed();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$1(EditContactNameModalView editContactNameModalView, mln mlnVar) {
        fln flnVar = editContactNameModalView.presenter;
        String obj = mlnVar.b.value().toString();
        jln jlnVar = flnVar.z;
        if (evu0.J(obj)) {
            ((ej1) jlnVar.b).r(new qu(9));
        } else if (jl40.l(flnVar.x, obj)) {
            ((dln) flnVar.Dg()).oe(new lln(obj, flnVar.y.c));
        } else {
            ((ej1) jlnVar.b).r(new wwb(obj, 26));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public mln bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(glh0.edit_contact_name_view, parent, false);
        int i = w8h0.name_input;
        AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, inflate);
        if (animatedListItemInputComponent != null) {
            i = w8h0.save;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                return new mln((FrameLayout) inflate, animatedListItemInputComponent, buttonComponent);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new bxl(24, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fln flnVar = this.presenter;
        flnVar.Bg(new aln(this));
        EditContactNameConfigDto editContactNameConfigDto = flnVar.y;
        mln access$getBinding = access$getBinding(this);
        access$getBinding.b.setInputHint(editContactNameConfigDto.a);
        access$getBinding.c.setText(editContactNameConfigDto.b);
        mln binding = getBinding();
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.b;
        animatedListItemInputComponent.setDividerFocusedBottomSpace(0);
        animatedListItemInputComponent.addTextChangedListener(this.nameTextWatcher);
        animatedListItemInputComponent.setOnKeyboardClosed(new ymj(21, animatedListItemInputComponent, this));
        binding.c.setDebounceClickListener(new wqj(16, this, binding));
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        getBinding().b.removeTextChangedListener(this.nameTextWatcher);
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().b;
        animatedListItemInputComponent.requestFocus();
        animatedListItemInputComponent.performAccessibilityAction(1, null);
        animatedListItemInputComponent.sendAccessibilityEvent(8);
        animatedListItemInputComponent.post(new xd2(animatedListItemInputComponent, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        hideKeyboard();
        super.onModalViewDisappear();
    }
}

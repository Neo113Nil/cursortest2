package com.yandex.go.trusted_contacts.ui.error;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.c230;
import defpackage.dy20;
import defpackage.ej1;
import defpackage.jl01;
import defpackage.kux0;
import defpackage.pv01;
import defpackage.qdb1;
import defpackage.r4h0;
import defpackage.t601;
import defpackage.vg11;
import defpackage.wg11;
import defpackage.wpy0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/trusted_contacts/ui/error/TrustedContactsErrorModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldy20;", "Landroid/content/Context;", "context", "Lvg11;", "navigator", "Lwg11;", "uiState", "<init>", "(Landroid/content/Context;Lvg11;Lwg11;)V", "Lru/yandex/taxi/design/ButtonComponent;", "renderScreen", "(Lwg11;)Lru/yandex/taxi/design/ButtonComponent;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldy20;", "Lc230;", "insetsType", "()Lc230;", "Lzy11;", "onAttachedToWindow", "()V", "Lvg11;", "Lwg11;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrustedContactsErrorModalView extends SlideableBindingModalView<dy20> {
    private final vg11 navigator;
    private final wg11 uiState;

    public TrustedContactsErrorModalView(Context context, vg11 vg11Var, wg11 wg11Var) {
        super(context);
        this.navigator = vg11Var;
        this.uiState = wg11Var;
        setDismissOnTouchOutside(false);
        qdb1.c(this, new kux0(28, this));
        ImageView imageView = getBinding().d;
        imageView.setImageResource(r4h0.ic_trusted_contacts_error);
        imageView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(TrustedContactsErrorModalView trustedContactsErrorModalView) {
        return trustedContactsErrorModalView.getBinding().a;
    }

    private final ButtonComponent renderScreen(wg11 uiState) {
        dy20 binding = getBinding();
        RobotoTextView robotoTextView = binding.f;
        String str = uiState.a;
        String str2 = uiState.b;
        robotoTextView.setText(str);
        robotoTextView.setVisibility(uiState.a.length() > 0 ? 0 : 8);
        RobotoTextView robotoTextView2 = binding.c;
        robotoTextView2.setText(str2);
        robotoTextView2.setVisibility(str2.length() > 0 ? 0 : 8);
        binding.b.setVisibility(8);
        ButtonComponent buttonComponent = binding.e;
        buttonComponent.setText(uiState.c);
        buttonComponent.setDebounceClickListener(new t601(9, this, uiState));
        buttonComponent.setVisibility(0);
        return buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderScreen$lambda$0$2$0(TrustedContactsErrorModalView trustedContactsErrorModalView, wg11 wg11Var) {
        ((ej1) ((wpy0) trustedContactsErrorModalView.navigator).b).r(new jl01(26, wg11Var.d));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new pv01(7, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        renderScreen(this.uiState);
        requestApplyInsets();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public dy20 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        return dy20.o(inflater, parent);
    }
}

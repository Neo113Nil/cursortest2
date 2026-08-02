package com.yandex.go.superapp.discovery.map.impl.ui.location_permission;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.superapp.discovery.map.impl.ui.location_permission.SuperAppLocationPermissionRequestModalView;
import defpackage.a60;
import defpackage.cma1;
import defpackage.i8h0;
import defpackage.ip11;
import defpackage.ktv0;
import defpackage.m0w0;
import defpackage.n0w0;
import defpackage.ny61;
import defpackage.q0w0;
import defpackage.qu;
import defpackage.s0w0;
import defpackage.skh0;
import defpackage.tje;
import defpackage.zmh;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/location_permission/SuperAppLocationPermissionRequestModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Ln0w0;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Lktv0;", "mapConfig", "Lq0w0;", "presenter", "<init>", "(Landroid/content/Context;Lip11;Lktv0;Lq0w0;)V", "Lzy11;", "setupClickListeners", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ln0w0;", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "Landroid/content/Context;", "Lip11;", "Lktv0;", "Lq0w0;", "m0w0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppLocationPermissionRequestModalView extends BindingModalView<n0w0> {
    private final Context context;
    private final ktv0 mapConfig;
    private final q0w0 presenter;
    private final ip11 typefaceDelegate;

    public SuperAppLocationPermissionRequestModalView(Context context, ip11 ip11Var, ktv0 ktv0Var, q0w0 q0w0Var) {
        super(context);
        this.context = context;
        this.typefaceDelegate = ip11Var;
        this.mapConfig = ktv0Var;
        this.presenter = q0w0Var;
    }

    private final void setupClickListeners() {
        n0w0 binding = getBinding();
        ButtonComponent buttonComponent = binding.b;
        final q0w0 q0w0Var = this.presenter;
        final int i = 0;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: l0w0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                q0w0 q0w0Var2 = q0w0Var;
                switch (i2) {
                    case 0:
                        SuperAppLocationPermissionRequestModalView.setupClickListeners$lambda$0$requestPermission(q0w0Var2);
                        break;
                    default:
                        SuperAppLocationPermissionRequestModalView.setupClickListeners$lambda$0$back(q0w0Var2);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent2 = binding.c;
        final q0w0 q0w0Var2 = this.presenter;
        final int i2 = 1;
        buttonComponent2.setDebounceClickListener(new Runnable() { // from class: l0w0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                q0w0 q0w0Var22 = q0w0Var2;
                switch (i22) {
                    case 0:
                        SuperAppLocationPermissionRequestModalView.setupClickListeners$lambda$0$requestPermission(q0w0Var22);
                        break;
                    default:
                        SuperAppLocationPermissionRequestModalView.setupClickListeners$lambda$0$back(q0w0Var22);
                        break;
                }
            }
        });
        binding.d.setTitleTypeface(((zmh) this.typefaceDelegate).d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$0$back(q0w0 q0w0Var) {
        ((s0w0) q0w0Var.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$0$requestPermission(q0w0 q0w0Var) {
        if (q0w0Var.D) {
            ((a60) q0w0Var.B).d();
        } else {
            tje.N(q0w0Var.Jg(), null, null, new SuperAppLocationPermissionRequestPresenter$requestPermission$1(q0w0Var, null), 3);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public n0w0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(skh0.super_app_location_permission_request_modal_view, parent, false);
        int i = i8h0.btn_confirm;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = i8h0.btn_go_back;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = i8h0.icon;
                if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                    i = i8h0.main_content;
                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                    if (listTitleComponent != null) {
                        return new n0w0((LinearLayout) inflate, buttonComponent, buttonComponent2, listTitleComponent);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().d.setTitle(this.mapConfig.d());
        getBinding().c.setText(this.mapConfig.c());
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        this.presenter.Bg(new m0w0());
        setupClickListeners();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}

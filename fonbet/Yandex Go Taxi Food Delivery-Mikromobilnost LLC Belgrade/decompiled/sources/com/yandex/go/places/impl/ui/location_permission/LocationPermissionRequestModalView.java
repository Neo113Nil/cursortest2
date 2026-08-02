package com.yandex.go.places.impl.ui.location_permission;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.places.impl.ui.location_permission.LocationPermissionRequestModalView;
import defpackage.a60;
import defpackage.cma1;
import defpackage.eaz;
import defpackage.faz;
import defpackage.ip11;
import defpackage.jaz;
import defpackage.laz;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.qu;
import defpackage.tje;
import defpackage.uuh0;
import defpackage.yac0;
import defpackage.zmh;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001a\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d¨\u0006 "}, d2 = {"Lcom/yandex/go/places/impl/ui/location_permission/LocationPermissionRequestModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lfaz;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Lyac0;", "mapConfig", "Ljaz;", "presenter", "<init>", "(Landroid/content/Context;Lip11;Lyac0;Ljaz;)V", "Lzy11;", "setupClickListeners", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfaz;", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "Landroid/content/Context;", "getContext$annotations", "Lip11;", "Lyac0;", "Ljaz;", "eaz", "haz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocationPermissionRequestModalView extends BindingModalView<faz> {
    public static final int $stable = 8;
    private final Context context;
    private final yac0 mapConfig;
    private final jaz presenter;
    private final ip11 typefaceDelegate;

    public LocationPermissionRequestModalView(Context context, ip11 ip11Var, yac0 yac0Var, jaz jazVar) {
        super(context);
        this.context = context;
        this.typefaceDelegate = ip11Var;
        this.mapConfig = yac0Var;
        this.presenter = jazVar;
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    private final void setupClickListeners() {
        faz binding = getBinding();
        ButtonComponent buttonComponent = binding.b;
        final jaz jazVar = this.presenter;
        final int i = 0;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: daz
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                jaz jazVar2 = jazVar;
                switch (i2) {
                    case 0:
                        LocationPermissionRequestModalView.setupClickListeners$lambda$0$requestPermission(jazVar2);
                        break;
                    default:
                        LocationPermissionRequestModalView.setupClickListeners$lambda$0$back(jazVar2);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent2 = binding.c;
        final jaz jazVar2 = this.presenter;
        final int i2 = 1;
        buttonComponent2.setDebounceClickListener(new Runnable() { // from class: daz
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                jaz jazVar22 = jazVar2;
                switch (i22) {
                    case 0:
                        LocationPermissionRequestModalView.setupClickListeners$lambda$0$requestPermission(jazVar22);
                        break;
                    default:
                        LocationPermissionRequestModalView.setupClickListeners$lambda$0$back(jazVar22);
                        break;
                }
            }
        });
        binding.d.setTitleTypeface(((zmh) this.typefaceDelegate).d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$0$back(jaz jazVar) {
        ((laz) jazVar.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$0$requestPermission(jaz jazVar) {
        if (jazVar.D) {
            ((a60) jazVar.B).d();
        } else {
            tje.N(jazVar.Jg(), null, null, new LocationPermissionRequestPresenter$requestPermission$1(jazVar, null), 3);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public faz bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.location_permission_request_modal_view, parent, false);
        int i = o6h0.btn_confirm;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = o6h0.btn_go_back;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = o6h0.icon;
                if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                    i = o6h0.main_content;
                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                    if (listTitleComponent != null) {
                        return new faz((LinearLayout) inflate, buttonComponent, buttonComponent2, listTitleComponent);
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
        getBinding().d.setTitle(this.mapConfig.g);
        getBinding().c.setText(this.mapConfig.h);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        this.presenter.Bg(new eaz());
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

package com.yandex.go.navigator.permission;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.navigator.permission.NavigatorPermissionRequestModalView;
import defpackage.a60;
import defpackage.ae50;
import defpackage.cma1;
import defpackage.ej40;
import defpackage.fuh0;
import defpackage.ip11;
import defpackage.kk5;
import defpackage.kza0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.xd50;
import defpackage.z5h0;
import defpackage.zmh;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u0017\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/navigator/permission/NavigatorPermissionRequestModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lkza0;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Lae50;", "presenter", "<init>", "(Landroid/content/Context;Lip11;Lae50;)V", "Lzy11;", "setupClickListeners", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lkza0;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/content/Context;", "getContext$annotations", "Lip11;", "Lae50;", "xd50", "yd50", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorPermissionRequestModalView extends BindingModalView<kza0> {
    public static final int $stable = 8;
    private final Context context;
    private final ae50 presenter;
    private final ip11 typefaceDelegate;

    public NavigatorPermissionRequestModalView(Context context, ip11 ip11Var, ae50 ae50Var) {
        super(context);
        this.context = context;
        this.typefaceDelegate = ip11Var;
        this.presenter = ae50Var;
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    private final void setupClickListeners() {
        kza0 binding = getBinding();
        final int i = 0;
        binding.b.setDebounceClickListener(new Runnable(this) { // from class: wd50
            public final /* synthetic */ NavigatorPermissionRequestModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                NavigatorPermissionRequestModalView navigatorPermissionRequestModalView = this.b;
                switch (i2) {
                    case 0:
                        NavigatorPermissionRequestModalView.setupClickListeners$lambda$0$0(navigatorPermissionRequestModalView);
                        break;
                    default:
                        NavigatorPermissionRequestModalView.setupClickListeners$lambda$0$1(navigatorPermissionRequestModalView);
                        break;
                }
            }
        });
        final int i2 = 1;
        binding.c.setDebounceClickListener(new Runnable(this) { // from class: wd50
            public final /* synthetic */ NavigatorPermissionRequestModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                NavigatorPermissionRequestModalView navigatorPermissionRequestModalView = this.b;
                switch (i22) {
                    case 0:
                        NavigatorPermissionRequestModalView.setupClickListeners$lambda$0$0(navigatorPermissionRequestModalView);
                        break;
                    default:
                        NavigatorPermissionRequestModalView.setupClickListeners$lambda$0$1(navigatorPermissionRequestModalView);
                        break;
                }
            }
        });
        binding.d.setTitleTypeface(((zmh) this.typefaceDelegate).d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$0$0(NavigatorPermissionRequestModalView navigatorPermissionRequestModalView) {
        ae50 ae50Var = navigatorPermissionRequestModalView.presenter;
        if (ae50Var.D) {
            ((a60) ae50Var.B).d();
        } else {
            tje.N(ae50Var.Jg(), null, null, new NavigatorPermissionRequestPresenter$requestPermission$1(ae50Var, System.currentTimeMillis(), null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$0$1(NavigatorPermissionRequestModalView navigatorPermissionRequestModalView) {
        ((kk5) navigatorPermissionRequestModalView.presenter.A.a).r(new ej40(15));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public kza0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.permission_request_layout, parent, false);
        int i = z5h0.btn_confirm;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = z5h0.btn_go_back;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = z5h0.icon;
                if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                    i = z5h0.main_content;
                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                    if (listTitleComponent != null) {
                        return new kza0((LinearLayout) inflate, buttonComponent, buttonComponent2, listTitleComponent);
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
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        this.presenter.Bg(new xd50());
        setupClickListeners();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}

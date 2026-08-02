package com.yandex.go.explorer.impl.ui.permission;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.explorer.impl.ui.permission.NoBackgroundLocationPermissionBottomSheetModalView;
import defpackage.cma1;
import defpackage.gb60;
import defpackage.hth0;
import defpackage.huo;
import defpackage.iih0;
import defpackage.jb60;
import defpackage.lb60;
import defpackage.m810;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006 "}, d2 = {"Lcom/yandex/go/explorer/impl/ui/permission/NoBackgroundLocationPermissionBottomSheetModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lhuo;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ljb60;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Ljb60;)V", "", "dp", "dpAsPx", "(I)I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lhuo;", "", "isArrowsPermanentlyHidden", "()Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpav;", "Ljb60;", "gb60", "hb60", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NoBackgroundLocationPermissionBottomSheetModalView extends SlideableBindingModalView<huo> {
    private final pav imageLoader;
    private final jb60 presenter;

    public NoBackgroundLocationPermissionBottomSheetModalView(Context context, pav pavVar, jb60 jb60Var) {
        super(context);
        this.imageLoader = pavVar;
        this.presenter = jb60Var;
    }

    private final int dpAsPx(int dp) {
        return m810.b(dp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$dismiss(jb60 jb60Var) {
        ((lb60) jb60Var.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onOpenSettingsClicked(jb60 jb60Var) {
        tje.N(jb60Var.Jg(), null, null, new NoBackgroundLocationPermissionBottomSheetPresenter$onOpenSettingsClicked$1(jb60Var, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public huo bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(hth0.explorer_no_background_location_permission_bottom_sheet, parent, false);
        int i = iih0.description;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = iih0.open_settings_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = iih0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    i = iih0.top_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        return new huo((GoLinearLayout) inflate, robotoTextView, buttonComponent, robotoTextView2, appCompatImageView);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getIsArrowHidden() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppCompatImageView appCompatImageView = getBinding().e;
        appCompatImageView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(dpAsPx(24)));
        final int i = 1;
        appCompatImageView.setClipToOutline(true);
        final int i2 = 0;
        getBottomSheetBehavior().a0 = false;
        final jb60 jb60Var = this.presenter;
        qdb1.b(this, new Runnable() { // from class: fb60
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                jb60 jb60Var2 = jb60Var;
                switch (i3) {
                    case 0:
                        NoBackgroundLocationPermissionBottomSheetModalView.onAttachedToWindow$dismiss(jb60Var2);
                        break;
                    default:
                        NoBackgroundLocationPermissionBottomSheetModalView.onAttachedToWindow$onOpenSettingsClicked(jb60Var2);
                        break;
                }
            }
        });
        jb60 jb60Var2 = this.presenter;
        gb60 gb60Var = new gb60(this);
        jb60Var2.Bg(gb60Var);
        tje.N(jb60Var2.Jg(), null, null, new NoBackgroundLocationPermissionBottomSheetPresenter$attachView$1(jb60Var2, gb60Var, null), 3);
        ButtonComponent buttonComponent = getBinding().c;
        final jb60 jb60Var3 = this.presenter;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: fb60
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                jb60 jb60Var22 = jb60Var3;
                switch (i3) {
                    case 0:
                        NoBackgroundLocationPermissionBottomSheetModalView.onAttachedToWindow$dismiss(jb60Var22);
                        break;
                    default:
                        NoBackgroundLocationPermissionBottomSheetModalView.onAttachedToWindow$onOpenSettingsClicked(jb60Var22);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}

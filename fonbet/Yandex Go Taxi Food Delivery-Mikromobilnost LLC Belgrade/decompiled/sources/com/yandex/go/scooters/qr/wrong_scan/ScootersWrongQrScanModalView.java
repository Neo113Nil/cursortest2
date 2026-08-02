package com.yandex.go.scooters.qr.wrong_scan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.fcl0;
import defpackage.g9p0;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.o7h0;
import defpackage.r7p0;
import defpackage.sls;
import defpackage.xqg0;
import defpackage.yjh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/scooters/qr/wrong_scan/ScootersWrongQrScanModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lg9p0;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onOkListener", "Lr7p0;", "lookedForVehicleNumber", "<init>", "(Landroid/content/Context;Lsls;Lr7p0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg9p0;", "onAttachedToWindow", "()V", "", "isArrowsPermanentlyHidden", "()Z", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lsls;", "Lr7p0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersWrongQrScanModalView extends SlideableBindingModalView<g9p0> {
    private final r7p0 lookedForVehicleNumber;
    private final sls onOkListener;

    public ScootersWrongQrScanModalView(Context context, sls slsVar, r7p0 r7p0Var) {
        super(context);
        this.onOkListener = slsVar;
        this.lookedForVehicleNumber = r7p0Var;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return xqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public g9p0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(yjh0.scooters_wrong_qr_scan_view, parent, false);
        int i = o7h0.pff_ok_btn;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = o7h0.subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = o7h0.title;
                if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                    return new g9p0((ConstraintLayout) inflate, buttonComponent, robotoTextView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().c.setText(c.H(this, kyh0.scooters_wrong_scooter_subtitle, this.lookedForVehicleNumber.a));
        getBinding().b.setDebounceClickListener(new fcl0(14, this.onOkListener));
    }
}

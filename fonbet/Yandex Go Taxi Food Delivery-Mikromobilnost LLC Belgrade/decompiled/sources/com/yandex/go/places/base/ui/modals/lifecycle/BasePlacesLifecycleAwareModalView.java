package com.yandex.go.places.base.ui.modals.lifecycle;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.base.ui.modals.BasePlacesModalView;
import defpackage.c2x0;
import defpackage.d75;
import defpackage.fz20;
import defpackage.g75;
import defpackage.h75;
import defpackage.idy;
import defpackage.o3v;
import defpackage.pey;
import defpackage.zo31;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\f\b\u0001\u0010\u0005*\u00020\u0003*\u00020\u00042\b\u0012\u0004\u0012\u00028\u00000\u00062\u00020\u00072\u00020\bB-\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/go/places/base/ui/modals/lifecycle/BasePlacesLifecycleAwareModalView;", "Lzo31;", "T", "Ld75;", "Lg75;", CA20Status.STATUS_CERTIFICATE_V, "Lcom/yandex/go/places/base/ui/modals/BasePlacesModalView;", "Lpey;", "Lo3v;", "Landroid/content/Context;", "context", "Lfz20;", "modalMode", "Lc2x0;", "systemBarsCoordinator", "Lh75;", "presenter", "<init>", "(Landroid/content/Context;Lfz20;Lc2x0;Lh75;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onShow", "onHide", "Lidy;", "lifecycleAwareController", "Lidy;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BasePlacesLifecycleAwareModalView<T extends zo31, V extends d75 & g75> extends BasePlacesModalView<T> implements pey, o3v {
    private final Lifecycle lifecycle;
    private final idy lifecycleAwareController;

    public BasePlacesLifecycleAwareModalView(Context context, fz20 fz20Var, c2x0 c2x0Var, h75 h75Var) {
        super(context, fz20Var, c2x0Var, h75Var);
        idy idyVar = new idy();
        idyVar.a();
        this.lifecycleAwareController = idyVar;
        this.lifecycle = idyVar.a;
    }

    @Override // defpackage.pey
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lifecycleAwareController.d();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.lifecycleAwareController.b();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.o3v
    public void onHide() {
        this.lifecycleAwareController.c();
        this.lifecycleAwareController.f();
    }

    @Override // defpackage.o3v
    public void onShow() {
        this.lifecycleAwareController.e();
        this.lifecycleAwareController.d();
    }
}

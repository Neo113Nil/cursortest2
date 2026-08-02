package com.yandex.go.places.base.ui.base_old.lifecycle;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.base.ui.base_old.BaseOrganizationDiscoveryModalView;
import defpackage.i65;
import defpackage.idy;
import defpackage.j65;
import defpackage.jxi;
import defpackage.o3v;
import defpackage.pey;
import defpackage.zo31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@jxi
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\f\b\u0001\u0010\u0005*\u00020\u0003*\u00020\u00042\b\u0012\u0004\u0012\u00028\u00000\u00062\u00020\u00072\u00020\bB?\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/places/base/ui/base_old/lifecycle/BasePlacesLifecycleAwareModalView;", "Lzo31;", "T", "", "Li65;", CA20Status.STATUS_CERTIFICATE_V, "Lcom/yandex/go/places/base/ui/base_old/BaseOrganizationDiscoveryModalView;", "Lpey;", "Lo3v;", "Landroid/content/Context;", "context", "Lj65;", "presenter", "", "manualInit", "", "customAnchoredHeight", "", "customAnchoredHeightAsScreenPercent", "<init>", "(Landroid/content/Context;Lj65;ZLjava/lang/Integer;Ljava/lang/Float;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onShow", "onHide", "Lidy;", "lifecycleAwareController", "Lidy;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BasePlacesLifecycleAwareModalView<T extends zo31, V extends i65> extends BaseOrganizationDiscoveryModalView<T> implements pey, o3v {
    private final Lifecycle lifecycle;
    private final idy lifecycleAwareController;

    public /* synthetic */ BasePlacesLifecycleAwareModalView(Context context, j65 j65Var, boolean z, Integer num, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, j65Var, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : f);
    }

    @Override // defpackage.pey
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lifecycleAwareController.d();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
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

    public BasePlacesLifecycleAwareModalView(Context context, j65 j65Var, boolean z, Integer num, Float f) {
        super(context, j65Var, z, num, f);
        idy idyVar = new idy();
        idyVar.a();
        this.lifecycleAwareController = idyVar;
        this.lifecycle = idyVar.a;
    }
}

package com.yandex.go.superapp.discovery.map.impl.ui.base;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import defpackage.idy;
import defpackage.pey;
import defpackage.zo31;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/base/SuperAppDiscoveryMapLifecycleAwareModalView;", "Lzo31;", "T", "Lpey;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onShow", "onHide", "Lidy;", "lifecycleAwareController", "Lidy;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SuperAppDiscoveryMapLifecycleAwareModalView<T extends zo31> extends SlideableBindingModalView<T> implements pey {
    private final Lifecycle lifecycle;
    private final idy lifecycleAwareController;

    public SuperAppDiscoveryMapLifecycleAwareModalView(Context context) {
        super(context);
        idy idyVar = new idy();
        idyVar.a();
        this.lifecycleAwareController = idyVar;
        this.lifecycle = idyVar.a;
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

    public void onHide() {
        this.lifecycleAwareController.c();
        this.lifecycleAwareController.f();
    }

    public void onShow() {
        this.lifecycleAwareController.e();
        this.lifecycleAwareController.d();
    }
}

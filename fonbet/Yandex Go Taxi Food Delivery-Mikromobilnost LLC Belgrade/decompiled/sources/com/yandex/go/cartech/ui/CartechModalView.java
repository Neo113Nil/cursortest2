package com.yandex.go.cartech.ui;

import androidx.fragment.app.FragmentActivity;
import com.yandex.go.fragment.router.external.ExternalFragmentModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b230;
import defpackage.e230;
import defpackage.jhh0;
import defpackage.mqg0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/cartech/ui/CartechModalView;", "Lcom/yandex/go/fragment/router/external/ExternalFragmentModalView;", "Landroidx/fragment/app/FragmentActivity;", "activity", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Le230;", "insetsType", "()Le230;", "", "duration", "Lzy11;", "animateShowBackground", "(J)V", "animateDismissBackground", "()V", "Ljava/lang/Runnable;", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartechModalView extends ExternalFragmentModalView {
    public CartechModalView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        setAnimateOnAppearing(false);
        setId(jhh0.car_tech_container);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        endAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShowBackground(long duration) {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return b230.a;
    }
}

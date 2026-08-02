package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;

/* compiled from: ScreenThermalStatusReporter.kt */
/* loaded from: classes3.dex */
public final class cdh0 implements m1q0 {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<UiTrackingScreen> a;

    public cdh0(io.reactivex.rxjava3.core.r<UiTrackingScreen> rVar) {
        this.a = rVar;
    }

    @Override // xsna.m1q0
    public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
        this.a.onNext(uiTrackingScreen2);
    }
}

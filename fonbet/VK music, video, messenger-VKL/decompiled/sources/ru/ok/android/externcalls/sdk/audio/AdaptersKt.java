package ru.ok.android.externcalls.sdk.audio;

import io.reactivex.rxjava3.core.a;
import io.reactivex.rxjava3.core.b;
import io.reactivex.rxjava3.core.d;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.internal.operators.completable.e;
import java.util.Collection;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import xsna.d9;
import xsna.e40;
import xsna.uj0;
import xsna.vj0;
import xsna.yj0;
import xsna.zj0;

/* compiled from: Adapters.kt */
/* loaded from: classes9.dex */
public final class AdaptersKt {
    public static final a changeStateCompletable(CallsAudioManager callsAudioManager, CallsAudioManager.State state) {
        return new e(new yj0(callsAudioManager, state)).o(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeStateCompletable$lambda$0(CallsAudioManager callsAudioManager, CallsAudioManager.State state, b bVar) {
        callsAudioManager.changeStateAsync(state, new AdaptersKt$changeStateCompletable$1$1(bVar), new AdaptersKt$changeStateCompletable$1$2(bVar));
    }

    public static final x<Boolean> hasBluetoothHeadsetSingle(CallsAudioManager callsAudioManager) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new e40(callsAudioManager, 1)).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasBluetoothHeadsetSingle$lambda$6(CallsAudioManager callsAudioManager, y yVar) {
        callsAudioManager.hasBluetoothHeadsetAsync(new AdaptersKt$hasBluetoothHeadsetSingle$1$1(yVar), new AdaptersKt$hasBluetoothHeadsetSingle$1$2(yVar));
    }

    public static final x<Boolean> hasWiredHeadsetSingle(CallsAudioManager callsAudioManager) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new vj0(callsAudioManager, 0)).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasWiredHeadsetSingle$lambda$5(CallsAudioManager callsAudioManager, y yVar) {
        callsAudioManager.hasWiredHeadsetAsync(new AdaptersKt$hasWiredHeadsetSingle$1$1(yVar), new AdaptersKt$hasWiredHeadsetSingle$1$2(yVar));
    }

    public static final q<Collection<CallsAudioDeviceInfo>> observeAvailableAudioDevices(CallsAudioManager callsAudioManager) {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new zj0(callsAudioManager, 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ok.android.externcalls.sdk.audio.CallsAudioManager$OnAudioDeviceListChangeListener, xsna.wj0] */
    public static final void observeAvailableAudioDevices$lambda$9(final CallsAudioManager callsAudioManager, final r rVar) {
        final ?? r0 = new CallsAudioManager.OnAudioDeviceListChangeListener() { // from class: xsna.wj0
            @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnAudioDeviceListChangeListener
            public final void onAudioDeviceListChanged(Collection collection) {
                io.reactivex.rxjava3.core.r.this.onNext(collection);
            }
        };
        callsAudioManager.addOnAudioDeviceListChangeListener(r0);
        rVar.i(new io.reactivex.rxjava3.disposables.a(new io.reactivex.rxjava3.functions.a() { // from class: xsna.xj0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                CallsAudioManager.this.removeOnAudioDeviceListChangeListener(r0);
            }
        }));
    }

    public static final a releaseAsyncCompletable(CallsAudioManager callsAudioManager) {
        return new e(new d9(callsAudioManager, 1)).o(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseAsyncCompletable$lambda$4(CallsAudioManager callsAudioManager, b bVar) {
        callsAudioManager.releaseAsync(new AdaptersKt$releaseAsyncCompletable$1$1(bVar), new AdaptersKt$releaseAsyncCompletable$1$2(bVar));
    }

    public static final a setAudioDeviceCompletable(CallsAudioManager callsAudioManager, CallsAudioDeviceInfo callsAudioDeviceInfo) {
        return new e(new uj0(callsAudioManager, callsAudioDeviceInfo)).o(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAudioDeviceCompletable$lambda$1(CallsAudioManager callsAudioManager, CallsAudioDeviceInfo callsAudioDeviceInfo, b bVar) {
        callsAudioManager.setAudioDeviceAsync(callsAudioDeviceInfo, new AdaptersKt$setAudioDeviceCompletable$1$1(bVar), new AdaptersKt$setAudioDeviceCompletable$1$2(bVar));
    }

    public static final a setAudioDeviceTypeCompletable(CallsAudioManager callsAudioManager, CallsAudioManager.AudioDeviceType audioDeviceType) {
        return new e(new com.vk.newsfeed.posting.donut_teaser.domain.interactor.a(callsAudioManager, audioDeviceType)).o(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAudioDeviceTypeCompletable$lambda$2(CallsAudioManager callsAudioManager, CallsAudioManager.AudioDeviceType audioDeviceType, b bVar) {
        callsAudioManager.setAudioDeviceTypeAsync(audioDeviceType, new AdaptersKt$setAudioDeviceTypeCompletable$1$1(bVar), new AdaptersKt$setAudioDeviceTypeCompletable$1$2(bVar));
    }

    public static final a setSpeakerEnabledCompletable(final CallsAudioManager callsAudioManager, final boolean z, final boolean z2) {
        return new e(new d() { // from class: xsna.ak0
            @Override // io.reactivex.rxjava3.core.d
            public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
                AdaptersKt.setSpeakerEnabledCompletable$lambda$3(CallsAudioManager.this, z, z2, bVar);
            }
        }).o(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public static /* synthetic */ a setSpeakerEnabledCompletable$default(CallsAudioManager callsAudioManager, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return setSpeakerEnabledCompletable(callsAudioManager, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSpeakerEnabledCompletable$lambda$3(CallsAudioManager callsAudioManager, boolean z, boolean z2, b bVar) {
        callsAudioManager.setSpeakerEnabledAsync(z, z2, new AdaptersKt$setSpeakerEnabledCompletable$1$1(bVar), new AdaptersKt$setSpeakerEnabledCompletable$1$2(bVar));
    }
}

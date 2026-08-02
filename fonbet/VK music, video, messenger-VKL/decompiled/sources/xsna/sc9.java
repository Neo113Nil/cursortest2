package xsna;

import android.content.Context;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.OKVoipEngine;
import java.util.EnumSet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;

/* compiled from: CallsAudioManagerWrapper.kt */
/* loaded from: classes7.dex */
public final class sc9 {
    public static final EnumSet<CallsAudioManager.AudioDeviceType> c = EnumSet.of(CallsAudioManager.AudioDeviceType.EARPIECE, CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
    public final a a;
    public CallsAudioManager b;

    /* compiled from: CallsAudioManagerWrapper.kt */
    public static final class a {
        public final Context a;
        public final x0 b;
        public final quz c;
        public final pd4 d;

        public a(Context context, x0 x0Var, quz quzVar, pd4 pd4Var) {
            this.a = context;
            this.b = x0Var;
            this.c = quzVar;
            this.d = pd4Var;
        }
    }

    /* compiled from: CallsAudioManagerWrapper.kt */
    public static final /* synthetic */ class b implements CallsAudioManager.OnAudioDeviceInfoChangeListener, g0t {
        public b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof CallsAudioManager.OnAudioDeviceInfoChangeListener) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, sc9.this, sc9.class, "onAudioDeviceChanged", "onAudioDeviceChanged(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceInfoChangedEvent;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnAudioDeviceInfoChangeListener
        public final void onAudioDeviceChanged(CallsAudioManager.AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent) {
            sc9.this.a.c.invoke(audioDeviceInfoChangedEvent);
        }
    }

    /* compiled from: CallsAudioManagerWrapper.kt */
    public static final class c implements CallsAudioManager.OnMuteListener {
        @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnMuteListener
        public final void onMute(boolean z) {
            OKVoipEngine.b.getClass();
            OKVoipEngine.S(new wbd(z, 1));
        }

        @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnMuteListener
        public final void onMutedForever() {
            OKVoipEngine.b.getClass();
            OKVoipEngine.S(new wbd(false, 1));
        }
    }

    /* compiled from: CallsAudioManagerWrapper.kt */
    public static final class d implements CallsAudioManager.DisabledAudioDeviceUsagePolicy {
        @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.DisabledAudioDeviceUsagePolicy
        public final boolean isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType audioDeviceType) {
            return audioDeviceType == CallsAudioManager.AudioDeviceType.BLUETOOTH;
        }
    }

    public sc9(a aVar) {
        this.a = aVar;
    }

    public final CallsAudioManager a() {
        CallsAudioManager callsAudioManager = this.b;
        if (callsAudioManager == null) {
            CallsAudioManager.Builder builder = new CallsAudioManager.Builder();
            a aVar = this.a;
            CallsAudioManager.Builder trackProximityWhenSpeakerEnabled = builder.setContext(aVar.a).setVideoTracker(new tp1(this, 4)).setLogger(new hg10(4)).setTrackProximityWhenSpeakerEnabled(false);
            VoipFeatures voipFeatures = VoipFeatures.AUDIOMANAGER_CONSEQUENT_SWITCHES;
            voipFeatures.getClass();
            CallsAudioManager.Builder awaitDeviceChangeConfirmationEnabled = trackProximityWhenSpeakerEnabled.setAwaitDeviceChangeConfirmationEnabled(com.vk.toggle.b.A.a(voipFeatures));
            VoipFeatures.VOIP_IGNORE_AUDIO_FOCUS.getClass();
            if (!r3.a(r2)) {
                awaitDeviceChangeConfirmationEnabled.setOnMuteListener(new c());
            }
            callsAudioManager = awaitDeviceChangeConfirmationEnabled.setDisabledAudioDeviceUsagePolicy(new d()).setProximityTracker((ProximityTracker) aVar.d.invoke()).build();
        }
        CallsAudioManager callsAudioManager2 = callsAudioManager;
        if (this.b == null) {
            this.b = callsAudioManager2;
            CallsAudioManager.setSpeakerEnabledAsync$default(callsAudioManager2, false, false, null, new nk(7), 6, null);
            callsAudioManager2.setOnAudioDeviceChangeListener(new b());
        }
        return callsAudioManager2;
    }
}

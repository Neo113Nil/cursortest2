package defpackage;

import android.app.Activity;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies;
import com.yandex.messaging.internal.backendconfig.a;

/* loaded from: classes15.dex */
public final class k8g implements VoiceRecordPluginDependencies {
    public final z8g a;
    public final p8g b;
    public final d8g c;
    public final h8g d;

    public /* synthetic */ k8g(z8g z8gVar, p8g p8gVar, d8g d8gVar, h8g h8gVar) {
        this.a = z8gVar;
        this.b = p8gVar;
        this.c = d8gVar;
        this.d = h8gVar;
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public Activity getActivity() {
        return this.c.a;
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public x22 getAnalytics() {
        return (x22) this.a.y.get();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public mz10 getAudioFocusManager() {
        return (mz10) this.d.O.get();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public a getBackendConfig() {
        return (a) this.b.t0.get();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public oyq getCacheManager() {
        return (oyq) this.a.U.get();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public ChatRequest getChatRequest() {
        ChatRequest chatRequest = this.d.a.b;
        q5z.i(chatRequest);
        return chatRequest;
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public o5e getConnectionStatusHolder() {
        return (o5e) this.b.A.get();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public vse getCoroutineScopes() {
        return (vse) this.a.g.get();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public lqo getExperimentConfig() {
        lqo lqoVar = this.a.a.d;
        q5z.i(lqoVar);
        return lqoVar;
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public p4t getGetChatInfoUseCase() {
        return this.b.a();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public q6v getIdentityProvider() {
        return (q6v) this.a.W.get();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public rz10 getMessagingConfiguration() {
        rz10 rz10Var = this.a.a.k;
        q5z.i(rz10Var);
        return rz10Var;
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public ipt0 getSpeechKitProvider() {
        ipt0 ipt0Var = this.a.a.c;
        q5z.i(ipt0Var);
        return ipt0Var;
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public String getUserAgent() {
        return (String) this.b.h0.get();
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies
    public xy31 getVoiceMessageQualityFeatureToggle() {
        return (xy31) this.b.I2.get();
    }
}

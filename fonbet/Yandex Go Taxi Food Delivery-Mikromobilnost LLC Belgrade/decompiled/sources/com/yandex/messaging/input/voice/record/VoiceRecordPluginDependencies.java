package com.yandex.messaging.input.voice.record;

import android.app.Activity;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.backendconfig.a;
import defpackage.ipt0;
import defpackage.lqo;
import defpackage.mz10;
import defpackage.o5e;
import defpackage.oyq;
import defpackage.p4t;
import defpackage.q6v;
import defpackage.rz10;
import defpackage.vse;
import defpackage.x22;
import defpackage.xy31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001>R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8gX¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006?À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/input/voice/record/VoiceRecordPluginDependencies;", "", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "Lvse;", "getCoroutineScopes", "()Lvse;", "coroutineScopes", "Loyq;", "getCacheManager", "()Loyq;", "cacheManager", "Lx22;", "getAnalytics", "()Lx22;", "analytics", "Lq6v;", "getIdentityProvider", "()Lq6v;", "identityProvider", "Lp4t;", "getGetChatInfoUseCase", "()Lp4t;", "getChatInfoUseCase", "Lcom/yandex/messaging/ChatRequest;", "getChatRequest", "()Lcom/yandex/messaging/ChatRequest;", "chatRequest", "Lcom/yandex/messaging/internal/backendconfig/a;", "getBackendConfig", "()Lcom/yandex/messaging/internal/backendconfig/a;", "backendConfig", "Llqo;", "getExperimentConfig", "()Llqo;", "experimentConfig", "Lxy31;", "getVoiceMessageQualityFeatureToggle", "()Lxy31;", "voiceMessageQualityFeatureToggle", "Lrz10;", "getMessagingConfiguration", "()Lrz10;", "messagingConfiguration", "Lo5e;", "getConnectionStatusHolder", "()Lo5e;", "connectionStatusHolder", "Lmz10;", "getAudioFocusManager", "()Lmz10;", "audioFocusManager", "Lipt0;", "getSpeechKitProvider", "()Lipt0;", "speechKitProvider", "", "getUserAgent", "()Ljava/lang/String;", "userAgent", "Builder", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VoiceRecordPluginDependencies {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/input/voice/record/VoiceRecordPluginDependencies$Builder;", "", "build", "Lcom/yandex/messaging/input/voice/record/VoiceRecordPluginDependencies;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        VoiceRecordPluginDependencies build();
    }

    Activity getActivity();

    x22 getAnalytics();

    mz10 getAudioFocusManager();

    a getBackendConfig();

    oyq getCacheManager();

    ChatRequest getChatRequest();

    o5e getConnectionStatusHolder();

    vse getCoroutineScopes();

    lqo getExperimentConfig();

    p4t getGetChatInfoUseCase();

    q6v getIdentityProvider();

    rz10 getMessagingConfiguration();

    ipt0 getSpeechKitProvider();

    String getUserAgent();

    xy31 getVoiceMessageQualityFeatureToggle();
}

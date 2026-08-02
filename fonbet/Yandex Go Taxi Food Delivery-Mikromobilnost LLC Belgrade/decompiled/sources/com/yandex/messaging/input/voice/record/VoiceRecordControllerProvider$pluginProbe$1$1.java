package com.yandex.messaging.input.voice.record;

import com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public /* synthetic */ class VoiceRecordControllerProvider$pluginProbe$1$1 extends FunctionReferenceImpl implements sls {
    public VoiceRecordControllerProvider$pluginProbe$1$1(Object obj) {
        super(0, obj, VoiceRecordPluginDependencies.Builder.class, "build", "build()Lcom/yandex/messaging/input/voice/record/VoiceRecordPluginDependencies;", 0);
    }

    @Override // defpackage.sls
    public final VoiceRecordPluginDependencies invoke() {
        return ((VoiceRecordPluginDependencies.Builder) this.receiver).build();
    }
}

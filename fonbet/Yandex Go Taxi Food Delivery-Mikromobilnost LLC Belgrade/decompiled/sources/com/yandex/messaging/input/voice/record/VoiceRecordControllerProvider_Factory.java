package com.yandex.messaging.input.voice.record;

import com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes15.dex */
public final class VoiceRecordControllerProvider_Factory implements v7p {
    private final xvf0 dependenciesProvider;

    private VoiceRecordControllerProvider_Factory(xvf0 xvf0Var) {
        this.dependenciesProvider = xvf0Var;
    }

    public static VoiceRecordControllerProvider_Factory create(xvf0 xvf0Var) {
        return new VoiceRecordControllerProvider_Factory(xvf0Var);
    }

    public static VoiceRecordControllerProvider newInstance(VoiceRecordPluginDependencies.Builder builder) {
        return new VoiceRecordControllerProvider(builder);
    }

    @Override // defpackage.yvf0
    public VoiceRecordControllerProvider get() {
        return newInstance((VoiceRecordPluginDependencies.Builder) this.dependenciesProvider.get());
    }
}

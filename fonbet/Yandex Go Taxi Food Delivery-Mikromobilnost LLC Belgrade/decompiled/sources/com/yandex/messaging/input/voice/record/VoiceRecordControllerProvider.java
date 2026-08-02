package com.yandex.messaging.input.voice.record;

import com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies;
import com.yandex.messaging.input.voice.record.api.VoiceRecordController;
import defpackage.ec31;
import defpackage.i3y;
import defpackage.p320;
import defpackage.q320;
import defpackage.r320;
import defpackage.scc;
import defpackage.yvf0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u001b\u0010\u000e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/input/voice/record/VoiceRecordControllerProvider;", "Lyvf0;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecordController;", "Lcom/yandex/messaging/input/voice/record/VoiceRecordPluginDependencies$Builder;", "dependencies", "<init>", "(Lcom/yandex/messaging/input/voice/record/VoiceRecordPluginDependencies$Builder;)V", "pluginProbe", "()Lcom/yandex/messaging/input/voice/record/api/VoiceRecordController;", "get", "Lcom/yandex/messaging/input/voice/record/VoiceRecordPluginDependencies$Builder;", "instance$delegate", "Li3y;", "getInstance", "instance", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoiceRecordControllerProvider implements yvf0 {
    public static final int $stable = 8;
    private final VoiceRecordPluginDependencies.Builder dependencies;

    /* renamed from: instance$delegate, reason: from kotlin metadata */
    private final i3y instance = a.a(new ec31(8, this));

    public VoiceRecordControllerProvider(VoiceRecordPluginDependencies.Builder builder) {
        this.dependencies = builder;
    }

    private final VoiceRecordController getInstance() {
        return (VoiceRecordController) this.instance.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceRecordController pluginProbe() {
        VoiceRecordController voiceRecordController;
        Iterator it = scc.g(q320.a, p320.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                voiceRecordController = null;
                break;
            }
            voiceRecordController = (VoiceRecordController) ((r320) it.next()).c(new VoiceRecordControllerProvider$pluginProbe$1$1(this.dependencies));
            if (voiceRecordController != null) {
                break;
            }
        }
        return voiceRecordController == null ? VoiceRecordController.INSTANCE.getStub() : voiceRecordController;
    }

    @Override // defpackage.yvf0
    public VoiceRecordController get() {
        return getInstance();
    }
}

package xsna;

import com.vk.log.L;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;

/* compiled from: AsrOnlineManagerStub.kt */
/* loaded from: classes11.dex */
public final class jv3 implements AsrOnlineManager {
    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public final void addAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        L.G("VoipAsrOnlineDelegateImpl", "Use managerStub!");
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public final void enableAsrOnline(boolean z) {
        L.G("VoipAsrOnlineDelegateImpl", "Use managerStub!");
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager
    public final boolean isAsrAvailable() {
        L.G("VoipAsrOnlineDelegateImpl", "Use managerStub!");
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public final void removeAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        L.G("VoipAsrOnlineDelegateImpl", "Use managerStub!");
    }
}

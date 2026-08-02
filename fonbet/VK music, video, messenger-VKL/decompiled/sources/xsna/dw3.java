package xsna;

import ru.ok.android.externcalls.sdk.asr.AsrInfo;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;

/* compiled from: AsrRecordListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class dw3 implements AsrRecordListener {
    public final gw3 a;

    public dw3(gw3 gw3Var) {
        this.a = gw3Var;
    }

    @Override // ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener
    public final void onAsrRecordStarted(AsrInfo asrInfo) {
        this.a.onAsrRecordStarted(asrInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener
    public final void onAsrRecordStopped() {
        this.a.onAsrRecordStopped();
    }
}

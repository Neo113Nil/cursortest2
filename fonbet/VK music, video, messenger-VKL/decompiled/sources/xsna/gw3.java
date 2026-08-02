package xsna;

import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.asr.AsrInfo;

/* compiled from: AsrRecordListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class gw3 implements l19 {
    public final CopyOnWriteArraySet<l19> a = new CopyOnWriteArraySet<>();

    @Override // xsna.l19
    public final void onAsrRecordStarted(AsrInfo asrInfo) {
        i0q0.i(0L, new o4(new com.vk.movika.sdk.android.defaultplayer.container.e(2, this, asrInfo), 1));
    }

    @Override // xsna.l19
    public final void onAsrRecordStopped() {
        i0q0.i(0L, new o4(new hh1(this, 3), 1));
    }
}

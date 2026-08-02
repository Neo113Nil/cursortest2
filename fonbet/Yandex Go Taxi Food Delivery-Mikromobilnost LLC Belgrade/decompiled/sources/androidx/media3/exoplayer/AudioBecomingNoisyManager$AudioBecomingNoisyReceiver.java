package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a3x0;
import defpackage.m6u;
import defpackage.we3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public final class AudioBecomingNoisyManager$AudioBecomingNoisyReceiver extends BroadcastReceiver {
    private final m6u eventHandler;
    private final we3 listener;
    final /* synthetic */ b this$0;

    public AudioBecomingNoisyManager$AudioBecomingNoisyReceiver(b bVar, m6u m6uVar, we3 we3Var) {
        this.this$0 = bVar;
        this.eventHandler = m6uVar;
        this.listener = we3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callListenerIfEnabled() {
        if (this.this$0.d) {
            this.listener.onAudioBecomingNoisy();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            ((a3x0) this.eventHandler).e(new Runnable() { // from class: androidx.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    AudioBecomingNoisyManager$AudioBecomingNoisyReceiver.this.callListenerIfEnabled();
                }
            });
        }
    }
}

package androidx.media3.common.audio;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import defpackage.tw21;

/* loaded from: classes10.dex */
class AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat implements AudioManager.OnAudioFocusChangeListener {
    private final Handler handler;
    private final AudioManager.OnAudioFocusChangeListener listener;

    public AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.listener = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        int i = tw21.a;
        this.handler = new Handler(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAudioFocusChange$0(int i) {
        this.listener.onAudioFocusChange(i);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i) {
        tw21.a0(this.handler, new Runnable() { // from class: androidx.media3.common.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat.this.lambda$onAudioFocusChange$0(i);
            }
        });
    }
}

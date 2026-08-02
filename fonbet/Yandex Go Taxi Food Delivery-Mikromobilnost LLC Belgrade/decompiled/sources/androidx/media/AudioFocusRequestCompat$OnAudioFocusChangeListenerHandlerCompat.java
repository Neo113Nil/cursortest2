package androidx.media;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes10.dex */
class AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
    private static final int FOCUS_CHANGE = 2782386;
    private final Handler mHandler;
    private final AudioManager.OnAudioFocusChangeListener mListener;

    public AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.mListener = onAudioFocusChangeListener;
        this.mHandler = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != FOCUS_CHANGE) {
            return false;
        }
        this.mListener.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        Handler handler = this.mHandler;
        handler.sendMessage(Message.obtain(handler, FOCUS_CHANGE, i, 0));
    }
}

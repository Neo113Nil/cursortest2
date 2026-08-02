package xsna;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.vk.clips.editor.templates.impl.player.a;

/* compiled from: VideoPlayerAudioFocusListener.kt */
/* loaded from: classes16.dex */
public final class b4t0 implements AudioManager.OnAudioFocusChangeListener {
    public final a.C0581a b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final p31 d = new p31(this, 22);

    public b4t0(a.C0581a c0581a) {
        this.b = c0581a;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -2 || i == -1) {
            a.C0581a c0581a = this.b;
            com.vk.clips.editor.templates.impl.player.a.this.v(new or4(c0581a, 3));
        } else if (i == 1 || i == 2) {
            this.c.postDelayed(this.d, 1500L);
        }
    }
}

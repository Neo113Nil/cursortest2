package yads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class wk implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ yk b;

    public wk(yk ykVar, Handler handler) {
        this.b = ykVar;
        this.a = handler;
    }

    public final void a(int i) {
        pk pkVar;
        yk ykVar = this.b;
        if (i == -3 || i == -2) {
            if (i != -2 && ((pkVar = ykVar.d) == null || pkVar.b != 1)) {
                ykVar.b(3);
                return;
            } else {
                ykVar.a(0);
                ykVar.b(2);
                return;
            }
        }
        if (i == -1) {
            ykVar.a(-1);
            ykVar.a();
        } else if (i == 1) {
            ykVar.b(1);
            ykVar.a(1);
        } else {
            ykVar.getClass();
            ji1.d("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.a.post(new Runnable() { // from class: xsna.zhz0
            @Override // java.lang.Runnable
            public final void run() {
                yads.wk.this.a(i);
            }
        });
    }
}

package xsna;

import android.content.Context;
import android.media.AudioManager;
import ru.ok.android.webrtc.Call;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qq4 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ qq4(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                rq4.a.getClass();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                ((AudioManager) context.getSystemService("audio")).abandonAudioFocus(rq4.q);
                break;
            default:
                Call.n();
                break;
        }
    }
}

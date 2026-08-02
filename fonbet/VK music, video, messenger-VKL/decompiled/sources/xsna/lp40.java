package xsna;

import android.content.Context;

/* compiled from: MusicNotificationClientManager.kt */
/* loaded from: classes.dex */
public final class lp40 extends op40 {
    public io.reactivex.rxjava3.disposables.c e;

    @Override // xsna.np40
    public final void a(Context context, mp40 mp40Var) {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = lyd.g().D("audio_playback_channel", new a5f(this, context, mp40Var, 2), true);
    }

    @Override // xsna.np40
    public final void i(Context context) {
        lyd.g().D("subscription_push_channel", new kp40(this, context), false);
    }
}

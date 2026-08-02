package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ShowToastOnTrackErrorPlugin.kt */
/* loaded from: classes.dex */
public final class pjj0 extends o56 implements pr4 {
    public final Context a;

    public pjj0(Context context) {
        this.a = context;
    }

    @Override // xsna.o56, xsna.kr4
    public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(new RuntimeException("Audio message. Player error", th));
        enj.q(R.string.vkim_audio_msg_player_error, 0, this.a);
    }

    @Override // xsna.pr4
    public final void u(ir4 ir4Var) {
        ir4Var.v(this);
    }
}

package yads;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import xsna.fxc0;
import xsna.qll;
import xsna.zhn0;

/* loaded from: classes10.dex */
public final class he0 implements t62 {
    public final d4 a;
    public final ov2 b;
    public final v9 c;
    public final Context d;

    public he0(Context context, v9 v9Var, ov2 ov2Var, d4 d4Var) {
        this.a = d4Var;
        this.b = ov2Var;
        this.c = v9Var;
        this.d = context.getApplicationContext();
    }

    @Override // yads.t62
    public final q62 a() {
        Context context = this.d;
        d4 d4Var = this.a;
        ov2 ov2Var = this.b;
        v9 v9Var = this.c;
        Context applicationContext = context.getApplicationContext();
        ExoPlayer.b bVar = new ExoPlayer.b(applicationContext);
        final qll qllVar = new qll(applicationContext);
        qllVar.c = true;
        fxc0.z(true ^ bVar.y);
        bVar.c = new zhn0() { // from class: xsna.y5q
            @Override // xsna.zhn0
            public final Object get() {
                return qll.this;
            }
        };
        return new sp0(bVar.a(), new lo1(applicationContext, new ko1()), new uj3(applicationContext, d4Var, ov2Var, v9Var), new p62(), new ik3());
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import yads.mn2;
import yads.pn2;

/* loaded from: classes7.dex */
public final class a681 {
    public final Context a;
    public final gp51 b;
    public final mn2 c;
    public final Handler d;
    public int e;
    public pn2 f;
    public final Handler g;

    public a681(Context context, gp51 gp51Var) {
        mn2 mn2Var = yy71.h;
        this.a = context.getApplicationContext();
        this.b = gp51Var;
        this.c = mn2Var;
        this.d = rf71.v(null);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
    }
}

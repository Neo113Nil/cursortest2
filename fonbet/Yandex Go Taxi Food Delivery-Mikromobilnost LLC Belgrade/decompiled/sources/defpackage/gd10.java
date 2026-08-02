package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.video.a;

/* loaded from: classes10.dex */
public final class gd10 {
    public final Context a;
    public boolean b;
    public xb10 c = xb10.L2;
    public mb10 d;
    public long e;
    public boolean f;
    public Handler g;
    public co31 h;
    public int i;
    public final float j;
    public boolean k;
    public long l;

    public gd10(Context context) {
        this.a = context;
        int i = mb10.K2;
        this.d = new oeh(context);
        this.j = 30.0f;
        this.l = -9223372036854775807L;
    }

    public final a a() {
        d6z.x(!this.b);
        Handler handler = this.g;
        d6z.x((handler == null && this.h == null) || !(handler == null || this.h == null));
        this.b = true;
        return new a(this);
    }
}

package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.f;

/* loaded from: classes10.dex */
public final class ono {
    public final Context a;
    public final o2x0 b;
    public final rhw0 c;
    public rhw0 d;
    public rhw0 e;
    public rhw0 f;
    public final rhw0 g;
    public final vls h;
    public Looper i;
    public final int j;
    public PriorityTaskManager k;
    public ue3 l;
    public boolean m;
    public boolean n;
    public int o;
    public final boolean p;
    public final g7q0 q;
    public final long r;
    public final long s;
    public final long t;
    public ewy u;
    public long v;
    public final long w;
    public final boolean x;
    public boolean y;
    public final String z;

    public ono(Context context, rhw0 rhw0Var, rhw0 rhw0Var2, rhw0 rhw0Var3, rhw0 rhw0Var4, rhw0 rhw0Var5, vls vlsVar) {
        context.getClass();
        this.a = context;
        this.c = rhw0Var;
        this.d = rhw0Var2;
        this.e = rhw0Var3;
        this.f = rhw0Var4;
        this.g = rhw0Var5;
        this.h = vlsVar;
        int i = tw21.a;
        Looper myLooper = Looper.myLooper();
        this.i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.l = ue3.c;
        this.o = 1;
        this.p = true;
        this.q = g7q0.c;
        this.r = 5000L;
        this.s = 15000L;
        this.t = 3000L;
        xdh xdhVar = new xdh();
        this.u = new ydh(xdhVar.a, xdhVar.b, xdhVar.c);
        this.b = y3c.a;
        this.v = 500L;
        this.w = 2000L;
        this.x = true;
        this.z = "";
        this.j = -1000;
        new hlh();
    }

    public final f a() {
        d6z.x(!this.y);
        this.y = true;
        return new f(this);
    }

    public final void b(rf10 rf10Var) {
        d6z.x(!this.y);
        rf10Var.getClass();
        this.d = new seh(3, rf10Var);
    }

    public ono(Context context, rhw0 rhw0Var, rhw0 rhw0Var2) {
        this(context, rhw0Var, rhw0Var2, new tf3(context, 5), new cih(1), new tf3(context, 2), new zgl(20));
    }

    public ono(Context context) {
        this(context, new tf3(context, 1), new tf3(context, 4));
    }
}

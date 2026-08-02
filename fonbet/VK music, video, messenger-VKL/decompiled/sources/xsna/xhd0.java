package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;

/* compiled from: ProducerFactory.java */
/* loaded from: classes.dex */
public class xhd0 {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final ut8 d;
    public final niw e;
    public final z3e0 f;
    public final DownsampleMode g;
    public final boolean h;
    public final r3q i;
    public final b320 j;
    public final yhn0<fbn> k;
    public final n220<ww8, PooledByteBuffer> l;
    public final n220<ww8, svf> m;
    public final ecl n;
    public final hta0 o;
    public final vvf p;
    public final int q;

    public xhd0(Context context, ut8 ut8Var, niw niwVar, z3e0 z3e0Var, DownsampleMode downsampleMode, boolean z, r3q r3qVar, b320 b320Var, n220 n220Var, n220 n220Var2, yhn0 yhn0Var, ecl eclVar, hta0 hta0Var, int i, vvf vvfVar) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = ut8Var;
        this.e = niwVar;
        this.f = z3e0Var;
        this.g = downsampleMode;
        this.h = z;
        this.i = r3qVar;
        this.j = b320Var;
        this.m = n220Var;
        this.l = n220Var2;
        this.k = yhn0Var;
        this.n = eclVar;
        this.o = hta0Var;
        new lyd();
        new lyd();
        this.q = i;
        this.p = vvfVar;
    }

    public final t7l a(thd0<rip> thd0Var) {
        return new t7l(this.d, this.i.f(), this.e, this.f, this.g, this.h, thd0Var, this.q, this.p);
    }

    public iwz b() {
        return new iwz(this.i.b(), this.a);
    }

    public final v9g0 c(thd0<rip> thd0Var, boolean z, gmw gmwVar) {
        return new v9g0(this.i.a(), this.j, thd0Var, z, gmwVar);
    }
}

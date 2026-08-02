package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.core.DownsampleMode;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.din0;
import xsna.dvb0;
import xsna.vkw;
import xsna.wan;

/* compiled from: ImagePipelineConfig.kt */
/* loaded from: classes.dex */
public final class tkw implements ukw {
    public final yhn0<o220> a;
    public final qc7 b;
    public final bw50 c;
    public final ecl d;
    public final Context e;
    public final DownsampleMode f;
    public final hbn g;
    public final yhn0<o220> h;
    public final sel i;
    public final igw j;
    public final din0.a k;
    public final wan l;
    public final g320 m;
    public final oi6 n;
    public final evb0 o;
    public final hsj0 p;
    public final EmptySet q;
    public final Set<w7g0> r;
    public final EmptySet s;
    public final boolean t;
    public final wan u;
    public final oiw v;
    public final vkw w;
    public final boolean x;
    public final vek y;
    public final oyj z;

    /* compiled from: ImagePipelineConfig.kt */
    public static final class a {
        public lcr0 a;
        public qar0 b;
        public final Context c;
        public fcr0 e;
        public jgw f;
        public wan g;
        public g320 h;
        public oi6 i;
        public acr0 j;
        public Set<? extends w7g0> k;
        public wan m;
        public elw n;
        public oiw o;
        public final vkw.a q;
        public final boolean r;
        public final vek s;
        public DownsampleMode d = DownsampleMode.AUTO;
        public boolean l = true;
        public final int p = -1;

        public a(Context context) {
            vkw.a aVar = new vkw.a();
            aVar.a = 2048;
            aVar.d = new cin0(Boolean.FALSE);
            aVar.e = new jw5();
            this.q = aVar;
            this.r = true;
            this.s = new vek();
            this.c = context;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tkw(a aVar) {
        oi6 oi6Var;
        if (lhs.d()) {
            lhs.a("ImagePipelineConfig()");
        }
        vkw.a aVar2 = aVar.q;
        aVar2.getClass();
        this.w = new vkw(aVar2);
        yhn0<o220> yhn0Var = aVar.a;
        if (yhn0Var == null) {
            Object systemService = aVar.c.getSystemService("activity");
            if (systemService == null) {
                throw new IllegalStateException("Required value was null.");
            }
            yhn0Var = new ubl((ActivityManager) systemService);
        }
        this.a = yhn0Var;
        this.b = new qc7();
        this.c = new bw50();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        ecl eclVar = aVar.b;
        if (eclVar == null) {
            synchronized (ecl.class) {
                try {
                    if (ecl.a == null) {
                        ecl.a = new ecl();
                    }
                    eclVar = ecl.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = eclVar;
        Context context = aVar.c;
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.e = context;
        this.f = aVar.d;
        yhn0<o220> yhn0Var2 = aVar.e;
        this.h = yhn0Var2 == null ? new del() : yhn0Var2;
        igw igwVar = aVar.f;
        this.j = igwVar == null ? l370.z() : igwVar;
        this.k = din0.a;
        wan wanVar = aVar.g;
        if (wanVar == null) {
            Context context2 = aVar.c;
            if (lhs.d()) {
                lhs.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    wanVar = new wan(new wan.b(context2));
                    lhs.b();
                } finally {
                }
            } else {
                wanVar = new wan(new wan.b(context2));
            }
        }
        this.l = wanVar;
        g320 g320Var = aVar.h;
        this.m = g320Var == null ? n370.b() : g320Var;
        int i = aVar.p;
        i = i < 0 ? 30000 : i;
        if (lhs.d()) {
            lhs.a("ImagePipelineConfig->mNetworkFetcher");
            try {
                oi6Var = aVar.i;
                oi6Var = oi6Var == null ? new xkv(i) : oi6Var;
            } finally {
            }
        } else {
            oi6Var = aVar.i;
            if (oi6Var == null) {
                oi6Var = new xkv(i);
            }
        }
        this.n = oi6Var;
        evb0 evb0Var = aVar.j;
        evb0Var = evb0Var == null ? new evb0(new dvb0(new dvb0.a())) : evb0Var;
        this.o = evb0Var;
        this.p = new hsj0();
        EmptySet emptySet = EmptySet.b;
        this.q = emptySet;
        Set set = aVar.k;
        this.r = set == null ? emptySet : set;
        this.s = emptySet;
        this.t = aVar.l;
        wan wanVar2 = aVar.m;
        this.u = wanVar2 != null ? wanVar2 : wanVar;
        this.v = aVar.o;
        this.i = new sel(evb0Var.a.c.d);
        this.x = aVar.r;
        this.y = aVar.s;
        this.z = new oyj();
        z7r z7rVar = aVar.n;
        this.g = new hbn(z7rVar == null ? new wbn(new pli(6)) : z7rVar, this);
        if (lhs.d()) {
        }
    }

    @Override // xsna.ukw
    public final Set<w7g0> a() {
        return this.r;
    }

    @Override // xsna.ukw
    public final hsj0 b() {
        return this.p;
    }

    @Override // xsna.ukw
    public final boolean c() {
        return this.x;
    }

    @Override // xsna.ukw
    public final yhn0<o220> d() {
        return this.h;
    }

    @Override // xsna.ukw
    public final evb0 e() {
        return this.o;
    }

    @Override // xsna.ukw
    public final vek f() {
        return this.y;
    }

    @Override // xsna.ukw
    public final din0.a g() {
        return this.k;
    }

    @Override // xsna.ukw
    public final Context getContext() {
        return this.e;
    }

    @Override // xsna.ukw
    public final vkw getExperiments() {
        return this.w;
    }

    @Override // xsna.ukw
    public final g320 h() {
        return this.m;
    }

    @Override // xsna.ukw
    public final oi6 i() {
        return this.n;
    }

    @Override // xsna.ukw
    public final EmptySet j() {
        return this.q;
    }

    @Override // xsna.ukw
    public final oiw k() {
        return this.v;
    }

    @Override // xsna.ukw
    public final int l() {
        return 0;
    }

    @Override // xsna.ukw
    public final hbn m() {
        return this.g;
    }

    @Override // xsna.ukw
    public final EmptySet n() {
        return this.s;
    }

    @Override // xsna.ukw
    public final igw o() {
        return this.j;
    }

    @Override // xsna.ukw
    public final bw50 p() {
        return this.c;
    }

    @Override // xsna.ukw
    public final qc7 q() {
        return this.b;
    }

    @Override // xsna.ukw
    public final yhn0<o220> r() {
        return this.a;
    }

    @Override // xsna.ukw
    public final oyj s() {
        return this.z;
    }

    @Override // xsna.ukw
    public final ecl t() {
        return this.d;
    }

    @Override // xsna.ukw
    public final boolean u() {
        return this.t;
    }

    @Override // xsna.ukw
    public final DownsampleMode v() {
        return this.f;
    }

    @Override // xsna.ukw
    public final r3q w() {
        return this.i;
    }
}

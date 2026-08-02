package xsna;

import android.os.SystemClock;
import com.vk.net.stat.metric.NetStatSource;
import okhttp3.Protocol;

/* compiled from: HttpRequestMetric.kt */
/* loaded from: classes.dex */
public final class jkv {
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public int a;
    public int b;
    public int c;
    public int d;
    public Protocol f;
    public int k;
    public String l;
    public Integer m;
    public boolean n;
    public String o;
    public Integer p;
    public Integer q;
    public String r;
    public Integer s;
    public Integer t;
    public String u;
    public Boolean v;
    public Integer w;
    public boolean x;
    public String y;
    public String z;
    public boolean e = true;
    public NetStatSource g = NetStatSource.OKHTTP;
    public String h = "";
    public String i = "";
    public String j = "";
    public String P = "";
    public final long A = SystemClock.elapsedRealtime();

    /* compiled from: HttpRequestMetric.kt */
    public static final class a implements gzs {
        public static final a b = new a();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    public final void a() {
        this.c = Math.max(0, (int) (this.A - this.D));
        this.p = Integer.valueOf(Math.max(0, (int) (this.H - this.G)));
        this.q = Integer.valueOf(Math.max(0, (int) (this.E - this.I)));
        this.t = Integer.valueOf((int) Math.max(0L, this.F - this.E));
        this.a = Math.max(0, (int) (this.J - this.I));
        this.s = Integer.valueOf(Math.max(0, (int) (this.B - this.K)));
        this.b = Math.max(0, (int) (this.M - this.I));
    }
}

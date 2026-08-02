package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: AppStartPerformanceCommonEventBuilder.kt */
/* loaded from: classes11.dex */
public final class z83 extends e56 {
    public String A;
    public String B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Integer F;
    public boolean G;
    public Integer H;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Boolean m;
    public Boolean n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public Long x;
    public String y;
    public Integer z;

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.APP_START_PERF_COMMON.h();
        Integer num = this.i;
        Integer num2 = this.j;
        Integer num3 = this.k;
        Boolean bool = this.m;
        Boolean bool2 = Boolean.TRUE;
        boolean f = epx.f(bool, bool2);
        boolean f2 = epx.f(this.n, bool2);
        Integer num4 = this.l;
        Integer num5 = this.z;
        Long l = this.x;
        int longValue = l != null ? (int) l.longValue() : -1;
        Integer num6 = this.C;
        int intValue = num6 != null ? num6.intValue() : -1;
        Integer num7 = this.D;
        int intValue2 = num7 != null ? num7.intValue() : -1;
        Integer num8 = this.E;
        int intValue3 = num8 != null ? num8.intValue() : -1;
        Integer num9 = this.F;
        int intValue4 = num9 != null ? num9.intValue() : -1;
        boolean z = this.G;
        Integer num10 = this.H;
        return new qrk0(new SchemeStat$TypeDevNullItem(h, null, this.p, num, this.s, num2, this.u, num3, this.t, Integer.valueOf(f ? 1 : 0), this.v, Integer.valueOf(f2 ? 1 : 0), this.y, Integer.valueOf(this.h ? 1 : 0), this.A, num4, this.w, num5, this.o, Integer.valueOf(longValue), this.q, Integer.valueOf(intValue), this.r, Integer.valueOf(intValue2), this.B, Integer.valueOf(intValue3), null, Integer.valueOf(intValue4), null, Integer.valueOf(z ? 1 : 0), null, Integer.valueOf(num10 != null ? num10.intValue() : 0), null, null, 1409286146, 3, null), false);
    }
}

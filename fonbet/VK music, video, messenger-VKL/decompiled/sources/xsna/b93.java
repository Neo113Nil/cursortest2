package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: AppStartPerformanceNetworkEventBuilder.kt */
/* loaded from: classes11.dex */
public final class b93 extends e56 {
    public Long i;
    public Long j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Long n;
    public Boolean o;
    public String p;

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.APP_START_PERF_NET.h();
        boolean f = epx.f(this.o, Boolean.TRUE);
        Integer num = this.k;
        Integer num2 = this.l;
        Integer num3 = this.m;
        String str = this.p;
        Long l = this.i;
        String l2 = l != null ? l.toString() : null;
        Long l3 = this.j;
        String l4 = l3 != null ? l3.toString() : null;
        Long l5 = this.n;
        return new qrk0(new SchemeStat$TypeDevNullItem(h, null, str, Integer.valueOf(f ? 1 : 0), l2, num, l4, Integer.valueOf(this.h ? 1 : 0), l5 != null ? l5.toString() : null, num2, null, num3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3070, 3, null), false);
    }
}

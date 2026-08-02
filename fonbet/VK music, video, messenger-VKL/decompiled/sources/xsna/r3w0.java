package xsna;

import com.vk.im.engine.reporters.performance.events.LogType;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: VkmLogEventBuilder.kt */
/* loaded from: classes2.dex */
public final class r3w0 extends l5m {
    public final LogType h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Boolean n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3w0(LogType logType, String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        super(null, null, 3);
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        bool = (i & 64) != 0 ? null : bool;
        num = (i & 128) != 0 ? null : num;
        num2 = (i & 256) != 0 ? null : num2;
        num3 = (i & 512) != 0 ? null : num3;
        num4 = (i & 4096) != 0 ? null : num4;
        this.h = logType;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = bool;
        this.o = num;
        this.p = num2;
        this.q = num3;
        this.r = num4;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.VKM_LOG.h();
        String h2 = this.h.h();
        String str = this.i;
        String D0 = str != null ? erm0.D0(256, str) : null;
        String str2 = this.j;
        String D02 = str2 != null ? erm0.D0(256, str2) : null;
        String str3 = this.k;
        String D03 = str3 != null ? erm0.D0(256, str3) : null;
        String str4 = this.l;
        String D04 = str4 != null ? erm0.D0(256, str4) : null;
        String str5 = this.m;
        String D05 = str5 != null ? erm0.D0(256, str5) : null;
        Boolean bool = this.n;
        this.g = new SchemeStat$TypeDevNullItem(h, null, h2, this.o, D0, bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null, D02, null, D03, null, D04, null, D05, null, null, null, null, null, null, null, null, null, null, null, null, this.p, null, this.q, null, null, null, null, null, this.r, 1442835072, 1, null);
        return super.p();
    }
}

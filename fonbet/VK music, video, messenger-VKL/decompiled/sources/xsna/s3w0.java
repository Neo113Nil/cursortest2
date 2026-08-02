package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: VkmPerformanceMetricsEventBuilder.kt */
/* loaded from: classes2.dex */
public final class s3w0 extends l5m {
    public final boolean h;
    public final String[] i;
    public final Long[] j;

    public s3w0(String str, boolean z) {
        super(null, null, 3);
        this.h = z;
        String[] strArr = new String[16];
        this.i = strArr;
        this.j = new Long[16];
        strArr[0] = str;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.VKM_PERF_METRICS.h();
        String[] strArr = this.i;
        String str = strArr[0];
        if (str == null) {
            throw new IllegalStateException("performance type is not set");
        }
        Long[] lArr = this.j;
        Long l = lArr[0];
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        Long l2 = lArr[1];
        Integer valueOf2 = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
        Long l3 = lArr[2];
        Integer valueOf3 = l3 != null ? Integer.valueOf((int) l3.longValue()) : null;
        Long l4 = lArr[3];
        Integer valueOf4 = l4 != null ? Integer.valueOf((int) l4.longValue()) : null;
        Long l5 = lArr[4];
        Integer valueOf5 = l5 != null ? Integer.valueOf((int) l5.longValue()) : null;
        Long l6 = lArr[5];
        Integer valueOf6 = l6 != null ? Integer.valueOf((int) l6.longValue()) : null;
        Long l7 = lArr[6];
        Integer valueOf7 = l7 != null ? Integer.valueOf((int) l7.longValue()) : null;
        Long l8 = lArr[7];
        Integer num = valueOf2;
        Integer valueOf8 = l8 != null ? Integer.valueOf((int) l8.longValue()) : null;
        Long l9 = lArr[8];
        Integer valueOf9 = l9 != null ? Integer.valueOf((int) l9.longValue()) : null;
        Long l10 = lArr[9];
        Integer valueOf10 = l10 != null ? Integer.valueOf((int) l10.longValue()) : null;
        Long l11 = lArr[10];
        Integer valueOf11 = l11 != null ? Integer.valueOf((int) l11.longValue()) : null;
        Long l12 = lArr[11];
        Integer num2 = valueOf3;
        Integer valueOf12 = l12 != null ? Integer.valueOf((int) l12.longValue()) : null;
        Long l13 = lArr[12];
        Integer valueOf13 = l13 != null ? Integer.valueOf((int) l13.longValue()) : null;
        Long l14 = lArr[13];
        Integer valueOf14 = l14 != null ? Integer.valueOf((int) l14.longValue()) : null;
        Long l15 = lArr[14];
        Integer valueOf15 = l15 != null ? Integer.valueOf((int) l15.longValue()) : null;
        Long l16 = lArr[15];
        return new qrk0(new SchemeStat$TypeDevNullItem(h, null, str, valueOf, strArr[1], num, strArr[2], num2, strArr[3], valueOf4, strArr[4], valueOf5, strArr[5], valueOf6, strArr[6], valueOf7, strArr[7], valueOf8, strArr[8], valueOf9, strArr[9], valueOf10, strArr[10], valueOf11, strArr[11], valueOf12, strArr[12], valueOf13, strArr[13], valueOf14, strArr[14], valueOf15, strArr[15], l16 != null ? Integer.valueOf((int) l16.longValue()) : null, 2, 0, null), this.h);
    }
}

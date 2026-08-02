package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: AppStartPerformanceTimesEventBuilder.kt */
/* loaded from: classes11.dex */
public final class c93 extends e56 {
    public Long A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Long F;
    public Long G;
    public Long H;
    public Long i;
    public Long j;
    public Long k;
    public Long l;
    public Long m;
    public Long n;
    public Long o;
    public Long p;
    public Long q;
    public Long r;
    public Long s;
    public Long t;
    public Long u;
    public Long v;
    public Long w;
    public Long x;
    public Long y;
    public Long z;

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        int i;
        String str;
        long j;
        String h = DevNullEventKey.APP_START_PERF_TIMES.h();
        Long l = this.i;
        String l2 = l != null ? l.toString() : null;
        Long l3 = this.j;
        String l4 = l3 != null ? l3.toString() : null;
        Long l5 = this.l;
        String l6 = l5 != null ? l5.toString() : null;
        Long l7 = this.o;
        String l8 = l7 != null ? l7.toString() : null;
        Long l9 = this.t;
        String l10 = l9 != null ? l9.toString() : null;
        Long l11 = this.q;
        String l12 = l11 != null ? l11.toString() : null;
        Long l13 = this.s;
        String l14 = l13 != null ? l13.toString() : null;
        Long l15 = this.u;
        String l16 = l15 != null ? l15.toString() : null;
        Long l17 = this.w;
        String l18 = l17 != null ? l17.toString() : null;
        Long l19 = this.n;
        String l20 = l19 != null ? l19.toString() : null;
        Long l21 = this.p;
        String l22 = l21 != null ? l21.toString() : null;
        Long l23 = this.v;
        String l24 = l23 != null ? l23.toString() : null;
        Long l25 = this.k;
        String l26 = l25 != null ? l25.toString() : null;
        Long l27 = this.x;
        String l28 = l27 != null ? l27.toString() : null;
        Long l29 = this.z;
        String l30 = l29 != null ? l29.toString() : null;
        Long l31 = this.A;
        String l32 = l31 != null ? l31.toString() : null;
        Integer num = this.B;
        Integer num2 = this.C;
        Integer num3 = this.D;
        Integer num4 = this.E;
        if (num4 != null) {
            i = Integer.valueOf(num4.intValue() > 0 ? 1 : 0);
        } else {
            i = 0;
        }
        Integer num5 = i;
        Long l33 = this.F;
        int longValue = l33 != null ? (int) l33.longValue() : 0;
        StringBuilder sb = new StringBuilder("{\n            \"app_first_frame_time\":\"");
        Long l34 = this.m;
        if (l34 != null) {
            str = h;
            j = l34.longValue();
        } else {
            str = h;
            j = 0;
        }
        sb.append(j);
        sb.append("\",\n            \"app_main_activity_on_resume_time\":\"");
        Long l35 = this.y;
        sb.append(l35 != null ? l35.longValue() : 0L);
        sb.append("\",\n            \"app_main_menu_loaded_time\":\"");
        Long l36 = this.r;
        sb.append(l36 != null ? l36.longValue() : 0L);
        sb.append("\",\n            \"app_main_complete_data_loading_start_time\":\"");
        Long l37 = this.G;
        sb.append(l37 != null ? l37.longValue() : 0L);
        sb.append("\",\n            \"app_main_complete_data_loading_end_time\":\"");
        Long l38 = this.H;
        sb.append(l38 != null ? l38.longValue() : 0L);
        sb.append("\"\n            }");
        return new qrk0(new SchemeStat$TypeDevNullItem(str, xqm0.h(sb.toString()), l2, Integer.valueOf(this.h ? 1 : 0), l4, num, l6, num2, l8, num3, l10, num4, l12, num5, l14, Integer.valueOf(longValue), l16, null, l18, null, l20, null, l22, null, l24, null, l26, null, l28, null, l30, null, l32, null, -1431699456, 2, null), false);
    }
}

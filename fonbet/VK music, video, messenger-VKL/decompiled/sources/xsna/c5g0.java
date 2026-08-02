package xsna;

import com.vk.core.preference.Preference;
import com.vk.toggle.features.CoreFeatures;
import java.util.concurrent.TimeUnit;
import xsna.c63;

/* compiled from: ReportCacheStatistic.kt */
/* loaded from: classes11.dex */
public final class c5g0 implements gzs<s3q0>, w8i {
    public static final long c = TimeUnit.DAYS.toMillis(1);
    public static final /* synthetic */ int d = 0;
    public final bpn0 b = new bpn0(new tb8(this, 7));

    /* compiled from: ReportCacheStatistic.kt */
    /* loaded from: classes7.dex */
    public static final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void u() {
            int i = c5g0.d;
            if (System.currentTimeMillis() - Preference.m(0L, "cache_stat", "last_time_sent_ms") < c5g0.c) {
                return;
            }
            asu0.a.getClass();
            asu0.n().execute(new d0(c5g0.this, 10));
        }
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        CoreFeatures coreFeatures = CoreFeatures.CACHE_SIZE_STAT;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            c63 c63Var = c63.a;
            bpn0 bpn0Var = this.b;
            c63.c((a) bpn0Var.getValue());
            c63.a((a) bpn0Var.getValue());
        }
        return s3q0.a;
    }
}

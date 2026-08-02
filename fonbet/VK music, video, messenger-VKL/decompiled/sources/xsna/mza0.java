package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import xsna.irt0;

/* compiled from: PlayerAnalytics.kt */
/* loaded from: classes3.dex */
public final class mza0 {
    public boolean a;
    public final qg90<Long, Integer> b;
    public int c;
    public String d;
    public Integer e;

    public mza0(int i, long j) {
        Long valueOf = Long.valueOf(j);
        Integer valueOf2 = Integer.valueOf(i);
        this.b = new qg90<>(valueOf, valueOf2);
        this.c = -1;
        if (bps0.a != null) {
            r2u0 r2u0Var = dst0.b;
            UserId userId = new UserId(valueOf.longValue());
            r2u0Var.c();
            CachedVideoViewedSegments cachedVideoViewedSegments = new CachedVideoViewedSegments(userId, valueOf2.intValue());
            bpn0 bpn0Var = irt0.d;
            irt0.b.a().e(cachedVideoViewedSegments);
        }
    }

    public final void a() {
        if (bps0.a != null) {
            r2u0 r2u0Var = dst0.b;
            qg90<Long, Integer> qg90Var = this.b;
            qg90<UserId, Integer> qg90Var2 = new qg90<>(new UserId(qg90Var.a.longValue()), qg90Var.b);
            r2u0Var.getClass();
            bpn0 bpn0Var = irt0.d;
            CachedVideoViewedSegments a = irt0.b.a().a(qg90Var2);
            if (a != null) {
                r2u0Var.b(a);
            }
        }
    }

    public final void b(String str, String str2, String str3, int i, String str4, String str5, boolean z) {
        if (bps0.a != null) {
            String str6 = this.d;
            Integer num = this.e;
            int intValue = num != null ? num.intValue() : 0;
            r2u0 r2u0Var = dst0.b;
            qg90<Long, Integer> qg90Var = this.b;
            qg90<UserId, Integer> qg90Var2 = new qg90<>(new UserId(qg90Var.a.longValue()), qg90Var.b);
            r2u0Var.getClass();
            bpn0 bpn0Var = irt0.d;
            CachedVideoViewedSegments a = irt0.b.a().a(qg90Var2);
            if (a != null) {
                a.d = str;
                a.f = str2;
                a.l = str3;
                a.g = i;
                a.h = str6;
                a.i = str4;
                a.j = str5;
                a.k = intValue;
                a.p = z;
                irt0.b.a().e(a);
            }
        }
    }
}

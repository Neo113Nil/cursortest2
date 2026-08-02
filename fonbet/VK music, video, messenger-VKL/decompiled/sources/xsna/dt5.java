package xsna;

import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Average.kt */
/* loaded from: classes3.dex */
public abstract class dt5<T extends Number> {
    public int a;

    /* compiled from: Average.kt */
    public static class a extends dt5<Long> {
        public long b;
        public long c;
        public Long d;
        public long e;
        public long f;

        public void a() {
            if (this.f == 0) {
                return;
            }
            c(SystemClock.elapsedRealtime() - this.f);
        }

        public final Long b() {
            int i = this.a;
            return Long.valueOf(i == 0 ? 0L : this.e / i);
        }

        public final void c(long j) {
            this.d = Long.valueOf(j);
            this.b = Math.min(this.b, j);
            this.c = Math.max(this.c, j);
            this.e += j;
            this.a++;
        }
    }

    /* compiled from: Average.kt */
    public static final class b extends a {
        public final ArrayList g = new ArrayList();
        public Long h;

        /* compiled from: Average.kt */
        public static final class a {
            public static Float a(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                Iterator it = arrayList.iterator();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f2 = 0.0f;
                while (it.hasNext()) {
                    f2 += ((Number) it.next()).floatValue();
                }
                float size = f2 / arrayList.size();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    float floatValue = ((Number) it2.next()).floatValue() - size;
                    f += floatValue * floatValue;
                }
                return Float.valueOf((float) Math.sqrt(f / arrayList.size()));
            }
        }

        @Override // xsna.dt5.a
        public final void a() {
            super.a();
            if (this.d != null) {
                this.g.add(Float.valueOf(r0.longValue()));
                this.h = null;
            }
        }
    }
}

package xsna;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* compiled from: ServiceActiveRepository.kt */
/* loaded from: classes5.dex */
public final class coi0 {
    public final Context a;
    public final Class<? extends Service> b;
    public final bpn0 c = new bpn0(new b());
    public final a d;

    /* compiled from: ServiceActiveRepository.kt */
    public static final class a {
        public final boolean a;
        public final long b;
        public final String c;

        public a(long j, String str, boolean z) {
            this.a = z;
            this.b = j;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c.equals(aVar.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.c.hashCode() + bh10.a(r0 * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActiveServiceData(isActive=");
            sb.append(this.a);
            sb.append(", activeForMs=");
            sb.append(this.b);
            sb.append(", serviceClassName=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ServiceActiveRepository.kt */
    public static final class b extends Lambda implements gzs<ActivityManager> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final ActivityManager invoke() {
            return (ActivityManager) coi0.this.a.getSystemService("activity");
        }
    }

    public coi0(Context context, Class<? extends Service> cls) {
        this.a = context;
        this.b = cls;
        this.d = new a(0L, cls.getSimpleName(), false);
    }
}

package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: HijackingAppsChecker.kt */
/* loaded from: classes11.dex */
public final class n6v {
    public static final long c = TimeUnit.SECONDS.toMillis(30);
    public final Context a;
    public final o6v b;

    /* compiled from: HijackingAppsChecker.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final ArrayList c;

        public a(String str, String str2, ArrayList arrayList) {
            this.a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final List<String> a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HijackingAppsUiResult(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", packageNames=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    public n6v(Context context) {
        this.a = context;
        this.b = new o6v(context);
    }
}

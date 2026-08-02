package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.collect.ImmutableList;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import xsna.dip0;
import xsna.e7g0;
import xsna.o4i0;

/* compiled from: ExoUtils.kt */
/* loaded from: classes8.dex */
public final class f7q {
    public static String a;

    /* compiled from: ExoUtils.kt */
    public static final class a {
        public final long a;
        public final long b;

        public a() {
            this(0);
        }

        public final boolean a() {
            return this.a == -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            if (a()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(X3.j.d + this.a + X3.j.e);
            long j = this.b;
            if (j != C.TIME_UNSET) {
                sb.append(" ");
                sb.append(y2r0.j0(j));
                sb.append(" ms");
            }
            return sb.toString();
        }

        public /* synthetic */ a(int i) {
            this(-1L, C.TIME_UNSET);
        }

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public static fn80 a(Context context) {
        ArrayList arrayList = new ArrayList();
        r rVar = new r(20);
        fn80 fn80Var = new fn80(context, arrayList, false);
        fn80Var.c = true;
        fn80Var.d = new v6j(rVar);
        return fn80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(cj0 cj0Var, dip0 dip0Var, long j, long j2) {
        dip0.a aVar;
        int i = 0;
        ImmutableList.b listIterator = dip0Var.a.listIterator(0);
        while (true) {
            if (!listIterator.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (dip0.a) listIterator.next();
            if (aVar.b.c == cj0Var.b && aVar.a()) {
                break;
            }
        }
        if (aVar != null) {
            pfp0 pfp0Var = aVar.b;
            for (e7g0 e7g0Var : cj0Var.c) {
                androidx.media3.common.a aVar2 = e7g0Var.b;
                int i2 = pfp0Var.a;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    }
                    if (epx.f(aVar2, pfp0Var.d[i3])) {
                        break;
                    }
                    i3++;
                }
                if (-1 != i3 && aVar.e[i3]) {
                    long S = y2r0.S(j2);
                    if (!(e7g0Var instanceof e7g0.a)) {
                        return e7g0Var instanceof e7g0.b ? ((e7g0.b) e7g0Var).j != null ? new a(0L, S) : new a(1L, S) : new a(i);
                    }
                    o4i0.a aVar3 = ((e7g0.a) e7g0Var).i;
                    long f = aVar3.f(y2r0.S(j), S);
                    return new a(f, aVar3.e(f, S));
                }
            }
        }
        return new a(i);
    }

    public static String c(Context context) {
        String str;
        String str2 = a;
        if (str2 != null) {
            return str2;
        }
        String packageName = context.getPackageName();
        try {
            str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str == null) {
            str = "?";
        }
        StringBuilder sb = new StringBuilder("OneExoPlayer/2.22.0");
        sb.append(" (Linux;Android " + Build.VERSION.RELEASE + ")");
        StringBuilder sb2 = new StringBuilder(" App:PackageName/");
        sb2.append(packageName);
        sb.append(sb2.toString());
        sb.append(" App:Version/".concat(str));
        sb.append(" AndroidXMedia3/1.9.3");
        String sb3 = sb.toString();
        a = sb3;
        return sb3;
    }
}

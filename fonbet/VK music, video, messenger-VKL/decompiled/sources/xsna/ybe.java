package xsna;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ClipsGridBlockState.kt */
/* loaded from: classes17.dex */
public interface ybe extends km50 {

    /* compiled from: ClipsGridBlockState.kt */
    public static final class a implements ybe {
        public final String b;
        public final List<zg5> c;
        public final yae d;
        public final boolean e;
        public final boolean f;
        public final fi5 g;
        public final fi5 h;
        public final fi5 i;
        public final k4b0 j;
        public final boolean k;
        public final tlo0 l;
        public final boolean m;
        public final Set<kih0> n;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, List<zg5> list, yae yaeVar, boolean z, boolean z2, fi5 fi5Var, fi5 fi5Var2, fi5 fi5Var3, k4b0 k4b0Var, boolean z3, tlo0 tlo0Var, boolean z4, Set<? extends kih0> set) {
            this.b = str;
            this.c = list;
            this.d = yaeVar;
            this.e = z;
            this.f = z2;
            this.g = fi5Var;
            this.h = fi5Var2;
            this.i = fi5Var3;
            this.j = k4b0Var;
            this.k = z3;
            this.l = tlo0Var;
            this.m = z4;
            this.n = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, ArrayList arrayList, boolean z, boolean z2, fi5 fi5Var, fi5 fi5Var2, fi5 fi5Var3, k4b0 k4b0Var, boolean z3, boolean z4, HashSet hashSet, int i) {
            String str = aVar.b;
            List<zg5> list = (i & 2) != 0 ? aVar.c : arrayList;
            yae yaeVar = aVar.d;
            boolean z5 = (i & 8) != 0 ? aVar.e : z;
            boolean z6 = (i & 16) != 0 ? aVar.f : z2;
            fi5 fi5Var4 = (i & 32) != 0 ? aVar.g : fi5Var;
            fi5 fi5Var5 = (i & 64) != 0 ? aVar.h : fi5Var2;
            fi5 fi5Var6 = (i & 128) != 0 ? aVar.i : fi5Var3;
            k4b0 k4b0Var2 = (i & 256) != 0 ? aVar.j : k4b0Var;
            boolean z7 = (i & 512) != 0 ? aVar.k : z3;
            tlo0 tlo0Var = aVar.l;
            boolean z8 = (i & 2048) != 0 ? aVar.m : z4;
            Set set = (i & 4096) != 0 ? aVar.n : hashSet;
            aVar.getClass();
            return new a(str, list, yaeVar, z5, z6, fi5Var4, fi5Var5, fi5Var6, k4b0Var2, z7, tlo0Var, z8, set);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && this.k == aVar.k && epx.f(this.l, aVar.l) && this.m == aVar.m && epx.f(this.n, aVar.n);
        }

        public final int hashCode() {
            int a = fw3.a(this.b.hashCode() * 31, 31, this.c);
            yae yaeVar = this.d;
            int b = qoy.b(qoy.b((a + (yaeVar == null ? 0 : Integer.hashCode(yaeVar.a.a))) * 31, 31, this.e), 31, this.f);
            fi5 fi5Var = this.g;
            int hashCode = (b + (fi5Var == null ? 0 : fi5Var.hashCode())) * 31;
            fi5 fi5Var2 = this.h;
            int hashCode2 = (hashCode + (fi5Var2 == null ? 0 : fi5Var2.hashCode())) * 31;
            fi5 fi5Var3 = this.i;
            int b2 = qoy.b((this.j.hashCode() + ((hashCode2 + (fi5Var3 == null ? 0 : fi5Var3.hashCode())) * 31)) * 31, 31, this.k);
            tlo0 tlo0Var = this.l;
            return this.n.hashCode() + qoy.b((b2 + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31, 31, this.m);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bound(id=");
            sb.append(this.b);
            sb.append(", clipItems=");
            sb.append(this.c);
            sb.append(", bottomButton=");
            sb.append(this.d);
            sb.append(", isBlockFocused=");
            sb.append(this.e);
            sb.append(", isFullscreenTransition=");
            sb.append(this.f);
            sb.append(", currentAutoPlay=");
            sb.append(this.g);
            sb.append(", previousAutoPlay=");
            sb.append(this.h);
            sb.append(", transitioningAutoPlay=");
            sb.append(this.i);
            sb.append(", playerState=");
            sb.append(this.j);
            sb.append(", isLoading=");
            sb.append(this.k);
            sb.append(", accessibilityDescription=");
            sb.append(this.l);
            sb.append(", needUpdateWithAnimation=");
            sb.append(this.m);
            sb.append(", errorRecords=");
            return ur.c(sb, this.n, ')');
        }
    }

    /* compiled from: ClipsGridBlockState.kt */
    public static final class b implements ybe {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2114355868;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}

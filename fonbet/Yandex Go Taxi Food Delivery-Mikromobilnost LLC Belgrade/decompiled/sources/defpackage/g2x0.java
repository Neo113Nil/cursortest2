package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class g2x0 implements e2x0 {
    public final r0 a;
    public final r0 b;

    public g2x0() {
        EmptyList emptyList = EmptyList.a;
        this.a = bvf0.c(emptyList);
        this.b = bvf0.c(emptyList);
    }

    public static void c(ArrayList arrayList, Object obj, Object obj2) {
        h2x0 h2x0Var = new h2x0(obj, obj2);
        for (int f = scc.f(arrayList); -1 < f; f--) {
            if (jl40.l(((h2x0) arrayList.get(f)).a, obj)) {
                arrayList.set(f, h2x0Var);
                return;
            }
        }
        arrayList.add(h2x0Var);
    }

    @Override // defpackage.e2x0
    public final void a(int i, Object obj, boolean z) {
        e(new a(Boolean.valueOf(z), i), obj);
    }

    @Override // defpackage.e2x0
    public final void b(Object obj) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            arrayList = new ArrayList((List) value);
            int f = scc.f(arrayList);
            while (true) {
                if (-1 >= f) {
                    break;
                }
                if (jl40.l(((h2x0) arrayList.get(f)).a, obj)) {
                    arrayList.remove(f);
                    break;
                }
                f--;
            }
        } while (!r0Var.k(value, arrayList));
    }

    public final void d(Object obj, boolean z, Boolean bool) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        f2x0 f2x0Var = new f2x0(z, bool);
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            arrayList = new ArrayList((List) value);
            c(arrayList, obj, f2x0Var);
        } while (!r0Var.k(value, arrayList));
    }

    public final void e(a aVar, Object obj) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            arrayList = new ArrayList((List) value);
            c(arrayList, obj, aVar);
        } while (!r0Var.k(value, kotlin.collections.a.x0(arrayList, new i2x0())));
    }

    /* loaded from: classes12.dex */
    public static final class a {
        public final Boolean a;
        public final int b;

        public /* synthetic */ a(int i, int i2) {
            this((Boolean) null, (i2 & 2) != 0 ? 0 : i);
        }

        public final Boolean a() {
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
            return jl40.l(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            Boolean bool = this.a;
            return Integer.hashCode(this.b) + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        public final String toString() {
            return "ForcedStatusBar(isLight=" + this.a + ", z=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this(0, 3);
        }

        public a(Boolean bool, int i) {
            this.a = bool;
            this.b = i;
        }
    }
}

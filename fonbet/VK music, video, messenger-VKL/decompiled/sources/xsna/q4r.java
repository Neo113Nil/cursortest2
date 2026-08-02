package xsna;

import java.util.Map;
import xsna.ubx;

/* compiled from: FeedState.kt */
/* loaded from: classes17.dex */
public abstract class q4r implements km50 {

    /* compiled from: FeedState.kt */
    public static final class a extends q4r {
        public final gwx b;
        public final s4r c;
        public final ea90 d;
        public final ea90 e;
        public final mtf0 f;
        public final String g;
        public final String h;
        public final ubx i;
        public final uch0 j;
        public final boolean k;
        public final wrr l;

        public a(gwx gwxVar, s4r s4rVar, ea90 ea90Var, ea90 ea90Var2, mtf0 mtf0Var, String str, String str2, ubx ubxVar, uch0 uch0Var, boolean z, wrr wrrVar) {
            this.b = gwxVar;
            this.c = s4rVar;
            this.d = ea90Var;
            this.e = ea90Var2;
            this.f = mtf0Var;
            this.g = str;
            this.h = str2;
            this.i = ubxVar;
            this.j = uch0Var;
            this.k = z;
            this.l = wrrVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v12, types: [xsna.ubx] */
        public static a a(a aVar, gwx gwxVar, ea90 ea90Var, ea90 ea90Var2, mtf0 mtf0Var, String str, String str2, ubx.a aVar2, uch0 uch0Var, wrr wrrVar, int i) {
            if ((i & 1) != 0) {
                gwxVar = aVar.b;
            }
            gwx gwxVar2 = gwxVar;
            s4r s4rVar = aVar.c;
            ea90 ea90Var3 = (i & 4) != 0 ? aVar.d : ea90Var;
            ea90 ea90Var4 = (i & 8) != 0 ? aVar.e : ea90Var2;
            mtf0 mtf0Var2 = (i & 16) != 0 ? aVar.f : mtf0Var;
            String str3 = (i & 32) != 0 ? aVar.g : str;
            String str4 = (i & 64) != 0 ? aVar.h : str2;
            ubx.a aVar3 = (i & 128) != 0 ? aVar.i : aVar2;
            uch0 uch0Var2 = (i & 256) != 0 ? aVar.j : uch0Var;
            boolean z = aVar.k;
            wrr wrrVar2 = (i & 1024) != 0 ? aVar.l : wrrVar;
            aVar.getClass();
            return new a(gwxVar2, s4rVar, ea90Var3, ea90Var4, mtf0Var2, str3, str4, aVar3, uch0Var2, z, wrrVar2);
        }

        public final Map<String, c1r> b() {
            return (Map) this.b.b.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && this.k == aVar.k && epx.f(this.l, aVar.l);
        }

        public final int hashCode() {
            int a = urd0.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g);
            String str = this.h;
            int b = qoy.b((this.j.hashCode() + ((this.i.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.k);
            wrr wrrVar = this.l;
            return b + (wrrVar != null ? wrrVar.hashCode() : 0);
        }

        public final String toString() {
            return "Content(itemsWithLookup=" + this.b + ", title=" + this.c + ", pageBackwardState=" + this.d + ", pageForwardState=" + this.e + ", reloadState=" + this.f + ", focusedItemKey=" + this.g + ", itemKeyToFocus=" + this.h + ", interactiveState=" + this.i + ", loaderState=" + this.j + ", isFullyInitialized=" + this.k + ", pendingFloatingButton=" + this.l + ')';
        }
    }

    /* compiled from: FeedState.kt */
    public static final class b extends q4r {
        public final Throwable b;
        public final mtf0 c;

        public b(Throwable th, mtf0 mtf0Var) {
            this.b = th;
            this.c = mtf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(error=" + this.b + ", reloadState=" + this.c + ')';
        }
    }

    /* compiled from: FeedState.kt */
    public static final class c extends q4r {
        public static final c b = new c();
    }

    /* compiled from: FeedState.kt */
    public static final class d extends q4r {
        public static final d b = new d();
    }
}

package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: CatalogLazyItemScope.kt */
/* loaded from: classes16.dex */
public interface a8a {
    static q630 d(a8a a8aVar, q630 q630Var, BlockId.Simple simple) {
        return a8aVar.c(q630Var, simple, 0);
    }

    q630 a(q630 q630Var);

    q630 b(q630 q630Var);

    default q630 c(q630 q630Var, BlockId.Simple simple, float f) {
        return b(q630Var);
    }

    ksr<a> f(r2a r2aVar);

    /* compiled from: CatalogLazyItemScope.kt */
    public static final class a {
        public final float a;
        public final long b;
        public final long c;
        public final Integer d;
        public final Integer e;
        public final h9x f;
        public final boolean g;

        public a(float f, long j, long j2, Integer num, Integer num2, h9x h9xVar, boolean z) {
            this.a = f;
            this.b = j;
            this.c = j2;
            this.d = num;
            this.e = num2;
            this.f = h9xVar;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && h9x.b(this.b, aVar.b) && h9x.b(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            int a = bh10.a(bh10.a(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            Integer num = this.d;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            h9x h9xVar = this.f;
            return Boolean.hashCode(this.g) + ((hashCode2 + (h9xVar != null ? Long.hashCode(h9xVar.a) : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CatalogBlockLayoutInfo(visibilityPercentage=");
            sb.append(this.a);
            sb.append(", viewportStartOffset=");
            sb.append((Object) h9x.e(this.b));
            sb.append(", viewportEndOffset=");
            sb.append((Object) h9x.e(this.c));
            sb.append(", primaryIndex=");
            sb.append(this.d);
            sb.append(", secondaryIndex=");
            sb.append(this.e);
            sb.append(", layoutOffset=");
            sb.append(this.f);
            sb.append(", isScrollInProgress=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(float f, long j, long j2, Integer num, Integer num2, h9x h9xVar, boolean z, int i) {
            this(f, j, j2, num, r10, r11, r12);
            boolean z2;
            h9x h9xVar2;
            Integer num3;
            num = (i & 8) != 0 ? null : num;
            if ((i & 16) != 0) {
                z2 = z;
                h9xVar2 = h9xVar;
                num3 = null;
            } else {
                z2 = z;
                h9xVar2 = h9xVar;
                num3 = num2;
            }
        }
    }
}

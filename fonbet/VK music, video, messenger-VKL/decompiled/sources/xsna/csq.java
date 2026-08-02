package xsna;

import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.entities.FaveEntry;
import java.util.Set;
import xsna.svh0;

/* compiled from: FaveTagEntrySearchIndex.kt */
/* loaded from: classes4.dex */
public final class csq implements svh0<a, FaveEntry> {
    public final pg50<qh50<FaveEntry>> a = new pg50<>((Object) null);

    /* compiled from: FaveTagEntrySearchIndex.kt */
    public static final class a extends svh0.a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Key(tagId="), this.a, ')');
        }
    }

    @Override // xsna.svh0
    public final Set<FaveEntry> a(a aVar) {
        qh50<FaveEntry> b = this.a.b(aVar.a);
        if (b != null) {
            return new fzi0(b);
        }
        return null;
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        if (obj instanceof FaveEntry) {
            for (FaveTag faveTag : ((FaveEntry) obj).i.e) {
                int i = faveTag.b;
                qh50 qh50Var = new qh50((Object) null);
                pg50<qh50<FaveEntry>> pg50Var = this.a;
                qh50<FaveEntry> qh50Var2 = (qh50) pg50Var.c(i, qh50Var);
                qh50Var2.e(obj);
                pg50Var.k(faveTag.b, qh50Var2);
            }
        }
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.d();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (!(obj instanceof FaveEntry)) {
            return;
        }
        pg50<qh50<FaveEntry>> pg50Var = this.a;
        Object[] objArr = pg50Var.c;
        long[] jArr = pg50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((qh50) objArr[(i << 3) + i3]).m(obj);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}

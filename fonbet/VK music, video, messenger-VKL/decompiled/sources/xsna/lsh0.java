package xsna;

import xsna.ish0;
import xsna.zno;

/* compiled from: SearchFeatureUiSideEffectDelegate.kt */
/* loaded from: classes5.dex */
public final class lsh0 {
    public final io.reactivex.rxjava3.subjects.f<b> a = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f<ish0> b = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f c = new io.reactivex.rxjava3.subjects.f();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchFeatureUiSideEffectDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ALL;
        public static final a CATALOG;

        static {
            a aVar = new a("CATALOG", 0);
            CATALOG = aVar;
            a aVar2 = new a("ALL", 1);
            ALL = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: SearchFeatureUiSideEffectDelegate.kt */
    public static final class b {
        public final long a;
        public final ish0.n b;
        public final a c;

        public b(long j, ish0.n nVar, a aVar) {
            this.a = j;
            this.b = nVar;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zno.d(this.a, bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            zno.a aVar = zno.c;
            int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
            a aVar2 = this.c;
            return hashCode + (aVar2 == null ? 0 : aVar2.hashCode());
        }

        public final String toString() {
            return "DelayEvent(delay=" + ((Object) zno.m(this.a)) + ", sideEffect=" + this.b + ", cancelKey=" + this.c + ')';
        }
    }
}

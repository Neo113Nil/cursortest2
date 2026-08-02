package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsCoauthorsSelectionListState.kt */
/* loaded from: classes16.dex */
public interface umd {

    /* compiled from: ClipsCoauthorsSelectionListState.kt */
    public static final class a implements umd {
        public static final a a = new a();
        public static final EmptyList b = EmptyList.b;

        @Override // xsna.umd
        public final List a() {
            return b;
        }

        @Override // xsna.umd
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: ClipsCoauthorsSelectionListState.kt */
    public static final class b implements umd {
        public static final b a = new b();
        public static final EmptyList b = EmptyList.b;

        @Override // xsna.umd
        public final List a() {
            return b;
        }

        @Override // xsna.umd
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: ClipsCoauthorsSelectionListState.kt */
    public static final class c implements umd {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // xsna.umd
        public final List a() {
            return this.a;
        }

        @Override // xsna.umd
        public final boolean b() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return bo.c(')', new StringBuilder("RecommendedItems(items="), this.a);
        }
    }

    /* compiled from: ClipsCoauthorsSelectionListState.kt */
    public static final class d implements umd {
        public final ArrayList a;
        public final boolean b;
        public final boolean c;

        public d(ArrayList arrayList, boolean z, boolean z2) {
            this.a = arrayList;
            this.b = z;
            this.c = z2;
        }

        @Override // xsna.umd
        public final List a() {
            return this.a;
        }

        @Override // xsna.umd
        public final boolean b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchItems(items=");
            kr.d(this.a, sb, ", hasNext=");
            sb.append(this.b);
            sb.append(", nextLoading=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    List a();

    boolean b();
}

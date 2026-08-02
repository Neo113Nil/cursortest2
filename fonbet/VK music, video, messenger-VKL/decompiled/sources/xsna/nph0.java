package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SearchDatabasePatch.kt */
/* loaded from: classes5.dex */
public interface nph0<Item> extends xl50 {

    /* compiled from: SearchDatabasePatch.kt */
    public static final class a implements nph0 {
        public final List<cph0> b;

        public a(List<cph0> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("CustomActionsChanged(customActions="), this.b);
        }
    }

    /* compiled from: SearchDatabasePatch.kt */
    public static final class b implements nph0 {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("DatabaseFetchStarted(query="), this.b, ')');
        }
    }

    /* compiled from: SearchDatabasePatch.kt */
    public static final class c implements nph0 {
        public final String b;
        public final Throwable c;

        public c(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DatabaseItemsFetchFailed(query=");
            sb.append(this.b);
            sb.append(", error=");
            return oq.c(sb, this.c, ')');
        }
    }

    /* compiled from: SearchDatabasePatch.kt */
    public static final class d<Item> implements nph0<Item> {
        public final String b;
        public final ArrayList c;
        public final boolean d;

        public d(String str, ArrayList arrayList, boolean z) {
            this.b = str;
            this.c = arrayList;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c.equals(dVar.c) && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qr.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DatabaseItemsFetched(query=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append(this.c);
            sb.append(", isLast=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: SearchDatabasePatch.kt */
    public static final class e implements nph0 {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("QueryChanged(query="), this.b, ')');
        }
    }

    /* compiled from: SearchDatabasePatch.kt */
    public static final class f<Item> implements nph0<Item> {
        public final Object b;

        public f(com.vk.search.params.impl.presentation.modal.database.mvi.model.a<? extends Item> aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b.equals(((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("SelectionChanged(selection="), this.b, ')');
        }
    }
}

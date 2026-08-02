package xsna;

import java.util.List;

/* compiled from: CityParameterState.kt */
/* loaded from: classes5.dex */
public final class cfc implements km50 {
    public final b b;
    public final a c;

    /* compiled from: CityParameterState.kt */
    public interface a extends km50 {

        /* compiled from: CityParameterState.kt */
        /* renamed from: xsna.cfc$a$a, reason: collision with other inner class name */
        public static final class C2663a implements a {
            public final List<uec> b;

            public C2663a(List<uec> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2663a) && epx.f(this.b, ((C2663a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Content(cities="), this.b);
            }
        }

        /* compiled from: CityParameterState.kt */
        public static final class b implements a {
            public static final b b = new b();
        }

        /* compiled from: CityParameterState.kt */
        public static final class c implements a {
            public static final c b = new c();
        }
    }

    /* compiled from: CityParameterState.kt */
    public static final class b implements km50 {
        public final String b;

        public b() {
            this(0);
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
            return ho8.a(new StringBuilder("QueryState(query="), this.b, ')');
        }

        public b(String str) {
            this.b = str;
        }

        public /* synthetic */ b(int i) {
            this("");
        }
    }

    public cfc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfc)) {
            return false;
        }
        cfc cfcVar = (cfc) obj;
        return epx.f(this.b, cfcVar.b) && epx.f(this.c, cfcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.b.hashCode() * 31);
    }

    public final String toString() {
        return "CityParameterState(queryState=" + this.b + ", itemsState=" + this.c + ')';
    }

    public cfc(b bVar, a aVar) {
        this.b = bVar;
        this.c = aVar;
    }

    public /* synthetic */ cfc(int i) {
        this(new b(0), a.c.b);
    }
}

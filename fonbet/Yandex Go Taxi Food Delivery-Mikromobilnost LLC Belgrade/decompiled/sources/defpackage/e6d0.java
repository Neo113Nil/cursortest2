package defpackage;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Le6d0;", "", "T", "b", "a", "f6d0", "Le6d0$a;", "Le6d0$b;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class e6d0<T> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Le6d0$a;", "Le6d0;", "", "a", "d", "b", "c", "Le6d0$a$a;", "Le6d0$a$b;", "Le6d0$a$c;", "Le6d0$a$d;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a extends e6d0 {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Le6d0$a$a;", "Le6d0$a;", "b", "a", "Le6d0$a$a$a;", "Le6d0$a$a$b;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: e6d0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0093a extends a {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le6d0$a$a$a;", "Le6d0$a$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: e6d0$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C0094a extends AbstractC0093a {
                public final f6d0 a;
                public final int b;
                public final String c;
                public final String d;

                public C0094a(f6d0 f6d0Var, int i, String str, String str2) {
                    this.a = f6d0Var;
                    this.b = i;
                    this.c = str;
                    this.d = str2;
                }

                @Override // defpackage.e6d0
                /* renamed from: a, reason: from getter */
                public final f6d0 getB() {
                    return this.a;
                }

                @Override // e6d0.a.AbstractC0093a
                /* renamed from: c, reason: from getter */
                public final int getB() {
                    return this.b;
                }

                @Override // e6d0.a.AbstractC0093a
                /* renamed from: d, reason: from getter */
                public final String getD() {
                    return this.d;
                }

                @Override // e6d0.a.AbstractC0093a
                /* renamed from: e, reason: from getter */
                public final String getC() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0094a)) {
                        return false;
                    }
                    C0094a c0094a = (C0094a) obj;
                    return this.a.equals(c0094a.a) && this.b == c0094a.b && jl40.l(this.c, c0094a.c) && jl40.l(this.d, c0094a.d);
                }

                public final int hashCode() {
                    int b = unr0.b(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
                    String str = this.d;
                    return b + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Backend(meta=");
                    sb.append(this.a);
                    sb.append(", code=");
                    sb.append(this.b);
                    sb.append(", message=");
                    sb.append(this.c);
                    sb.append(", errorBody=");
                    return b64.p(sb, this.d, ')');
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le6d0$a$a$b;", "Le6d0$a$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: e6d0$a$a$b */
            /* loaded from: classes8.dex */
            public static final /* data */ class b extends AbstractC0093a {
                public final f6d0 a;
                public final int b;
                public final String c;
                public final String d;

                public b(f6d0 f6d0Var, int i, String str, String str2) {
                    this.a = f6d0Var;
                    this.b = i;
                    this.c = str;
                    this.d = str2;
                }

                @Override // defpackage.e6d0
                /* renamed from: a, reason: from getter */
                public final f6d0 getB() {
                    return this.a;
                }

                @Override // e6d0.a.AbstractC0093a
                /* renamed from: c, reason: from getter */
                public final int getB() {
                    return this.b;
                }

                @Override // e6d0.a.AbstractC0093a
                /* renamed from: d, reason: from getter */
                public final String getD() {
                    return this.d;
                }

                @Override // e6d0.a.AbstractC0093a
                /* renamed from: e, reason: from getter */
                public final String getC() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a.equals(bVar.a) && this.b == bVar.b && jl40.l(this.c, bVar.c) && jl40.l(this.d, bVar.d);
                }

                public final int hashCode() {
                    int b = unr0.b(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
                    String str = this.d;
                    return b + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ClientOrRedirect(meta=");
                    sb.append(this.a);
                    sb.append(", code=");
                    sb.append(this.b);
                    sb.append(", message=");
                    sb.append(this.c);
                    sb.append(", errorBody=");
                    return b64.p(sb, this.d, ')');
                }
            }

            /* renamed from: c */
            public abstract int getB();

            /* renamed from: d */
            public abstract String getD();

            /* renamed from: e */
            public abstract String getC();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le6d0$a$b;", "Le6d0$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends a {
            public final f6d0 a;
            public final IOException b;

            public b(f6d0 f6d0Var, IOException iOException) {
                this.a = f6d0Var;
                this.b = iOException;
            }

            @Override // defpackage.e6d0
            /* renamed from: a, reason: from getter */
            public final f6d0 getB() {
                return this.a;
            }

            /* renamed from: c, reason: from getter */
            public final IOException getB() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b.equals(bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Network(meta=" + this.a + ", cause=" + this.b + ')';
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le6d0$a$c;", "Le6d0$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends a {
            public final f6d0 a;
            public final Throwable b;

            public c(f6d0 f6d0Var, Throwable th) {
                this.a = f6d0Var;
                this.b = th;
            }

            @Override // defpackage.e6d0
            /* renamed from: a, reason: from getter */
            public final f6d0 getB() {
                return this.a;
            }

            /* renamed from: c, reason: from getter */
            public final Throwable getB() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return jl40.l(this.a, cVar.a) && this.b.equals(cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Other(meta=");
                sb.append(this.a);
                sb.append(", cause=");
                return unr0.s(sb, this.b, ')');
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le6d0$a$d;", "Le6d0$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends a {
            public final f6d0 a;
            public final IllegalArgumentException b;

            public d(f6d0 f6d0Var, IllegalArgumentException illegalArgumentException) {
                this.a = f6d0Var;
                this.b = illegalArgumentException;
            }

            @Override // defpackage.e6d0
            /* renamed from: a, reason: from getter */
            public final f6d0 getB() {
                return this.a;
            }

            /* renamed from: c, reason: from getter */
            public final IllegalArgumentException getB() {
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
                return this.a.equals(dVar.a) && this.b.equals(dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Parse(meta=" + this.a + ", cause=" + this.b + ')';
            }
        }

        @Override // defpackage.e6d0
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object getA() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Le6d0$b;", "", "T", "Le6d0;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class b<T> extends e6d0<T> {
        public final Object a;
        public final f6d0 b;

        public b(Object obj, f6d0 f6d0Var) {
            this.a = obj;
            this.b = f6d0Var;
        }

        @Override // defpackage.e6d0
        /* renamed from: a, reason: from getter */
        public final f6d0 getB() {
            return this.b;
        }

        @Override // defpackage.e6d0
        /* renamed from: b, reason: from getter */
        public final Object getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(parsedResponse=" + this.a + ", meta=" + this.b + ')';
        }
    }

    /* renamed from: a */
    public abstract f6d0 getB();

    /* renamed from: b */
    public abstract Object getA();
}

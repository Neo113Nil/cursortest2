package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lf0k;", "", "Companion", "a", "xzj", "yzj", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f0k {
    public static final yzj Companion = new yzj();
    public static final i3y[] g = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(11)), null, null, null};
    public final Float a;
    public final Float b;
    public final Float[] c;
    public final Boolean d;
    public final a e;
    public final float f;

    public /* synthetic */ f0k(int i, Float f, Float f2, Float[] fArr, Boolean bool, a aVar, float f3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = fArr;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = aVar;
        }
        if ((i & 32) == 0) {
            this.f = 0.0f;
        } else {
            this.f = f3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final a getE() {
        return this.e;
    }

    /* renamed from: c, reason: from getter */
    public final float getF() {
        return this.f;
    }

    /* renamed from: d, reason: from getter */
    public final Float getB() {
        return this.b;
    }

    /* renamed from: e, reason: from getter */
    public final Float getA() {
        return this.a;
    }

    /* renamed from: f, reason: from getter */
    public final Float[] getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lf0k$a;", "", "Companion", "a", "zzj", "c0k", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class a {
        public static final c0k Companion = new c0k();
        public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(12)), null, null, null};
        public final List a;
        public final String b;
        public final String c;
        public final C0095a d;

        public /* synthetic */ a(int i, List list, String str, String str2, C0095a c0095a) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = c0095a;
            }
        }

        /* renamed from: a, reason: from getter */
        public final C0095a getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final List getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C0095a c0095a = this.d;
            return hashCode3 + (c0095a != null ? c0095a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder s = xvz.s("Extra(blockDirectPixelShowUrls=", this.a, ", yclid=", this.b, ", banner_id=");
            s.append(this.c);
            s.append(", advertPoiAnalyticsData=");
            s.append(this.d);
            s.append(Extension.C_BRAKE);
            return s.toString();
        }

        public a() {
            this.a = EmptyList.a;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf0k$a$a;", "", "Companion", "a0k", "b0k", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: f0k$a$a, reason: collision with other inner class name */
        public static final class C0095a {
            public static final b0k Companion = new b0k();
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;
            public final String i;
            public final String j;
            public final Boolean k;

            public /* synthetic */ C0095a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str3;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = str4;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = str5;
                }
                if ((i & 32) == 0) {
                    this.f = null;
                } else {
                    this.f = str6;
                }
                if ((i & 64) == 0) {
                    this.g = null;
                } else {
                    this.g = str7;
                }
                if ((i & 128) == 0) {
                    this.h = null;
                } else {
                    this.h = str8;
                }
                if ((i & 256) == 0) {
                    this.i = null;
                } else {
                    this.i = str9;
                }
                if ((i & 512) == 0) {
                    this.j = null;
                } else {
                    this.j = str10;
                }
                if ((i & 1024) == 0) {
                    this.k = null;
                } else {
                    this.k = bool;
                }
            }

            /* renamed from: a, reason: from getter */
            public final String getG() {
                return this.g;
            }

            /* renamed from: b, reason: from getter */
            public final String getE() {
                return this.e;
            }

            /* renamed from: c, reason: from getter */
            public final String getI() {
                return this.i;
            }

            /* renamed from: d, reason: from getter */
            public final String getC() {
                return this.c;
            }

            /* renamed from: e, reason: from getter */
            public final String getB() {
                return this.b;
            }

            /* renamed from: f, reason: from getter */
            public final String getH() {
                return this.h;
            }

            /* renamed from: g, reason: from getter */
            public final String getA() {
                return this.a;
            }

            /* renamed from: h, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            /* renamed from: i, reason: from getter */
            public final String getF() {
                return this.f;
            }

            /* renamed from: j, reason: from getter */
            public final String getD() {
                return this.d;
            }

            /* renamed from: k, reason: from getter */
            public final Boolean getK() {
                return this.k;
            }

            public C0095a() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = null;
            }
        }
    }

    public f0k() {
        this(null, 63);
    }

    public f0k(Float[] fArr, int i) {
        Float valueOf = Float.valueOf(Float.MAX_VALUE);
        Boolean bool = Boolean.TRUE;
        valueOf = (i & 1) != 0 ? null : valueOf;
        fArr = (i & 4) != 0 ? null : fArr;
        bool = (i & 8) != 0 ? null : bool;
        float f = (i & 32) != 0 ? 0.0f : 80.0f;
        this.a = valueOf;
        this.b = null;
        this.c = fArr;
        this.d = bool;
        this.e = null;
        this.f = f;
    }
}

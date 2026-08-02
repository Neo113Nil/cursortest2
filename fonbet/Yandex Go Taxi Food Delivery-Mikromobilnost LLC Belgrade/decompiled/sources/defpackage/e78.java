package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Le78;", "Lxn11;", "Companion", "a", "b", "h78", "b78", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class e78 implements xn11 {
    public static final h78 Companion = new h78();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(22))};
    public static final e78 d = new e78(0);
    public final Map b;

    public /* synthetic */ e78(int i, Map map) {
        if ((i & 1) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e78) && jl40.l(this.b, ((e78) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return nnm.j("CarPlatesFormatterExperiment(formats=", Extension.C_BRAKE, this.b);
    }

    public e78() {
        this(0);
    }

    public e78(int i) {
        this.b = kotlin.collections.b.f();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Le78$a;", "", "Companion", "c78", "d78", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class a {
        public static final d78 Companion = new d78();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(23))};
        public final String a;
        public final String b;
        public final String c;
        public final Map d;

        public /* synthetic */ a(Map map, String str, String str2, String str3, int i) {
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
                this.d = map;
            }
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
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map map = this.d;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("CarNumberFormatEntity(backgroundColor=", this.a, ", textColor=", this.b, ", format=");
            v.append(this.c);
            v.append(", fontStyles=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Le78$b;", "", "Companion", "g78", "f78", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class b {
        public static final g78 Companion = new g78();
        public final float a;
        public final String b;
        public final float c;
        public final boolean d;
        public final boolean e;

        public /* synthetic */ b(int i, float f, String str, float f2, boolean z, boolean z2) {
            if ((i & 1) == 0) {
                this.a = 0.0f;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = 0.0f;
            } else {
                this.c = f2;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && jl40.l(this.b, bVar.b) && Float.compare(this.c, bVar.c) == 0 && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.a) * 31;
            String str = this.b;
            return Boolean.hashCode(this.e) + unr0.e(g8e.c(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CarPlatesGroupStyle(letterSpacing=");
            sb.append(this.a);
            sb.append(", fontFeature=");
            sb.append(this.b);
            sb.append(", textSize=");
            sb.append(this.c);
            sb.append(", isOptional=");
            sb.append(this.d);
            sb.append(", hasTopGravity=");
            return x4e.i(sb, this.e, Extension.C_BRAKE);
        }

        public b() {
            this.a = 0.0f;
            this.b = null;
            this.c = 0.0f;
            this.d = false;
            this.e = false;
        }
    }
}

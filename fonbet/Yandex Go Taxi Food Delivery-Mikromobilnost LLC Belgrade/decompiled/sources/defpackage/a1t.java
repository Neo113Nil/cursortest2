package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"La1t;", "", "Companion", "a", "b", "x0t", "w0t", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a1t {
    public static final x0t Companion = new x0t();
    public static final a1t f = new a1t(0);
    public boolean a;
    public boolean b;
    public Double c;
    public a d;
    public b e;

    public a1t(int i) {
        a.Companion.getClass();
        b.Companion.getClass();
        this.a = false;
        this.b = false;
        this.c = null;
        this.d = a.d;
        this.e = b.d;
    }

    public a1t() {
        this(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La1t$a;", "", "Companion", "z0t", "y0t", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final z0t Companion = new z0t();
        public static final a d = new a(0);
        public final int a;
        public final int b;
        public final int c;

        public /* synthetic */ a(int i, int i2, int i3, int i4) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i4;
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
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "TrackingFrequency(forFullBattery=", ", forHalfBattery=", ", forEmptyBattery="));
        }

        public a(int i) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public a() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La1t$b;", "", "Companion", "c1t", "b1t", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final c1t Companion = new c1t();
        public static final b d = new b(0);
        public final boolean a;
        public final int b;
        public final String c;

        public /* synthetic */ b(int i, String str, boolean z, int i2) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        }

        public b(int i) {
            this.a = false;
            this.b = 0;
            this.c = null;
        }

        public b() {
            this(0);
        }
    }
}

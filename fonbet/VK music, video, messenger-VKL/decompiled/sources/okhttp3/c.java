package okhttp3;

import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.TimeUnit;
import xsna.brm0;
import xsna.drm0;
import xsna.x2r0;

/* compiled from: CacheControl.kt */
/* loaded from: classes11.dex */
public final class c {
    public static final c n;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    /* compiled from: CacheControl.kt */
    public static final class a {
        public boolean a;
        public boolean b;
        public int c = -1;
        public boolean d;

        public final c a() {
            return new c(this.a, this.b, -1, -1, false, false, false, this.c, -1, this.d, false, false, null);
        }
    }

    /* compiled from: CacheControl.kt */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static c a(k kVar) {
            int i;
            int i2;
            int i3;
            String str;
            k kVar2 = kVar;
            int size = kVar2.size();
            boolean z = true;
            boolean z2 = true;
            int i4 = 0;
            String str2 = null;
            boolean z3 = false;
            boolean z4 = false;
            int i5 = -1;
            int i6 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i7 = -1;
            int i8 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i4 < size) {
                String c = kVar2.c(i4);
                String f = kVar2.f(i4);
                if (brm0.w(c, "Cache-Control", z)) {
                    if (str2 == null) {
                        str2 = f;
                        i = 0;
                        while (i < f.length()) {
                            int length = f.length();
                            boolean z11 = z;
                            int i9 = i;
                            while (true) {
                                if (i9 >= length) {
                                    i2 = size;
                                    i9 = f.length();
                                    break;
                                }
                                i2 = size;
                                if (drm0.E("=,;", f.charAt(i9))) {
                                    break;
                                }
                                i9++;
                                size = i2;
                            }
                            String obj = drm0.p0(f.substring(i, i9)).toString();
                            if (i9 == f.length() || f.charAt(i9) == ',' || f.charAt(i9) == ';') {
                                i3 = i9 + 1;
                                str = null;
                            } else {
                                int i10 = i9 + 1;
                                byte[] bArr = x2r0.a;
                                int length2 = f.length();
                                while (true) {
                                    if (i10 < length2) {
                                        char charAt = f.charAt(i10);
                                        if (charAt != ' ' && charAt != '\t') {
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        i10 = f.length();
                                        break;
                                    }
                                }
                                if (i10 >= f.length() || f.charAt(i10) != '\"') {
                                    int length3 = f.length();
                                    int i11 = i10;
                                    while (true) {
                                        if (i11 >= length3) {
                                            i11 = f.length();
                                            break;
                                        }
                                        int i12 = length3;
                                        if (drm0.E(",;", f.charAt(i11))) {
                                            break;
                                        }
                                        i11++;
                                        length3 = i12;
                                    }
                                    int i13 = i11;
                                    str = drm0.p0(f.substring(i10, i11)).toString();
                                    i3 = i13;
                                } else {
                                    int i14 = i10 + 1;
                                    int L = drm0.L(f, '\"', i14, 4);
                                    str = f.substring(i14, L);
                                    i3 = L + 1;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                i = i3;
                                z = z11;
                                z3 = z;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                i = i3;
                                z = z11;
                                z4 = z;
                            } else {
                                if ("max-age".equalsIgnoreCase(obj)) {
                                    i5 = x2r0.x(-1, str);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i6 = x2r0.x(-1, str);
                                } else if ("private".equalsIgnoreCase(obj)) {
                                    i = i3;
                                    z = z11;
                                    z5 = z;
                                } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(obj)) {
                                    i = i3;
                                    z = z11;
                                    z6 = z;
                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                    i = i3;
                                    z = z11;
                                    z7 = z;
                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                    i7 = x2r0.x(Integer.MAX_VALUE, str);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i8 = x2r0.x(-1, str);
                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                    i = i3;
                                    z = z11;
                                    z8 = z;
                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                    i = i3;
                                    z = z11;
                                    z9 = z;
                                } else if ("immutable".equalsIgnoreCase(obj)) {
                                    i = i3;
                                    z = z11;
                                    z10 = z;
                                }
                                i = i3;
                                z = z11;
                            }
                            size = i2;
                        }
                        i4++;
                        kVar2 = kVar;
                        z = z;
                        size = size;
                    }
                } else if (!brm0.w(c, "Pragma", z)) {
                    i4++;
                    kVar2 = kVar;
                    z = z;
                    size = size;
                }
                z2 = false;
                i = 0;
                while (i < f.length()) {
                }
                i4++;
                kVar2 = kVar;
                z = z;
                size = size;
            }
            return new c(z3, z4, i5, i6, z5, z6, z7, i7, i8, z8, z9, z10, !z2 ? null : str2);
        }
    }

    static {
        a aVar = new a();
        aVar.a = true;
        n = aVar.a();
        a aVar2 = new a();
        aVar2.d = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        aVar2.c = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        aVar2.a();
    }

    public c(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        this.m = sb2;
        return sb2;
    }
}

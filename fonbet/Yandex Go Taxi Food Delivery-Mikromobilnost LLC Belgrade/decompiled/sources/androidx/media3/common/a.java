package androidx.media3.common;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import defpackage.b87;
import defpackage.d6z;
import defpackage.eh20;
import defpackage.f7s;
import defpackage.kfc;
import defpackage.kqx;
import defpackage.mf1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qir;
import defpackage.qv10;
import defpackage.tw21;
import defpackage.w820;
import defpackage.x4e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class a {
    public final int A;
    public final kfc B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public final String a;
    public final String b;
    public final ImmutableList c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final w820 l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final DrmInitData r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final float w;
    public final int x;
    public final float y;
    public final byte[] z;

    static {
        new f7s().a();
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(2);
        tw21.Q(3);
        tw21.Q(4);
        x4e.x(5, 6, 7, 8, 9);
        x4e.x(10, 11, 12, 13, 14);
        x4e.x(15, 16, 17, 18, 19);
        x4e.x(20, 21, 22, 23, 24);
        x4e.x(25, 26, 27, 28, 29);
        x4e.x(30, 31, 32, 33, 34);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f7s f7sVar) {
        boolean z;
        String str;
        this.a = f7sVar.a;
        String X = tw21.X(f7sVar.d);
        this.d = X;
        if (f7sVar.c.isEmpty() && f7sVar.b != null) {
            this.c = ImmutableList.r(new kqx(X, f7sVar.b));
            this.b = f7sVar.b;
        } else if (f7sVar.c.isEmpty() || f7sVar.b != null) {
            if (!f7sVar.c.isEmpty() || f7sVar.b != null) {
                for (int i = 0; i < f7sVar.c.size(); i++) {
                    if (!((kqx) f7sVar.c.get(i)).b.equals(f7sVar.b)) {
                    }
                }
                z = false;
                d6z.x(z);
                this.c = f7sVar.c;
                this.b = f7sVar.b;
            }
            z = true;
            d6z.x(z);
            this.c = f7sVar.c;
            this.b = f7sVar.b;
        } else {
            ImmutableList immutableList = f7sVar.c;
            this.c = immutableList;
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((kqx) immutableList.get(0)).b;
                    break;
                }
                kqx kqxVar = (kqx) it.next();
                if (TextUtils.equals(kqxVar.a, X)) {
                    str = kqxVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = f7sVar.e;
        d6z.w("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", f7sVar.g == 0 || (f7sVar.f & 32768) != 0);
        this.f = f7sVar.f;
        this.g = f7sVar.g;
        int i2 = f7sVar.h;
        this.h = i2;
        int i3 = f7sVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = f7sVar.j;
        this.l = f7sVar.k;
        this.m = f7sVar.l;
        this.n = f7sVar.m;
        this.o = f7sVar.n;
        this.p = f7sVar.o;
        List list = f7sVar.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = f7sVar.q;
        this.r = drmInitData;
        this.s = f7sVar.r;
        this.t = f7sVar.s;
        this.u = f7sVar.t;
        this.v = f7sVar.u;
        this.w = f7sVar.v;
        int i4 = f7sVar.w;
        this.x = i4 == -1 ? 0 : i4;
        float f = f7sVar.x;
        this.y = f == -1.0f ? 1.0f : f;
        this.z = f7sVar.y;
        this.A = f7sVar.z;
        this.B = f7sVar.A;
        this.C = f7sVar.B;
        this.D = f7sVar.C;
        this.E = f7sVar.D;
        this.F = f7sVar.E;
        int i5 = f7sVar.F;
        this.G = i5 == -1 ? 0 : i5;
        int i6 = f7sVar.G;
        this.H = i6 != -1 ? i6 : 0;
        this.I = f7sVar.H;
        this.J = f7sVar.I;
        this.K = f7sVar.J;
        this.L = f7sVar.K;
        int i7 = f7sVar.L;
        if (i7 != 0 || drmInitData == null) {
            this.M = i7;
        } else {
            this.M = 1;
        }
    }

    public static String c(a aVar) {
        int i;
        String str;
        String str2;
        String str3;
        DrmInitData drmInitData;
        if (aVar == null) {
            return "null";
        }
        int i2 = aVar.e;
        ImmutableList immutableList = aVar.c;
        String str4 = aVar.d;
        int i3 = aVar.E;
        int i4 = aVar.D;
        int i5 = aVar.C;
        float f = aVar.w;
        kfc kfcVar = aVar.B;
        float f2 = aVar.y;
        int i6 = aVar.v;
        int i7 = aVar.u;
        DrmInitData drmInitData2 = aVar.r;
        String str5 = aVar.k;
        int i8 = aVar.j;
        String str6 = aVar.m;
        int i9 = aVar.f;
        mf1 mf1Var = new mf1(String.valueOf(HexString.CHAR_COMMA));
        StringBuilder t = qv10.t("id=");
        t.append(aVar.a);
        t.append(", mimeType=");
        t.append(aVar.n);
        if (str6 != null) {
            t.append(", container=");
            t.append(str6);
        }
        int i10 = -1;
        if (i8 != -1) {
            t.append(", bitrate=");
            t.append(i8);
        }
        if (str5 != null) {
            t.append(", codecs=");
            t.append(str5);
        }
        if (drmInitData2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (i11 < drmInitData2.schemeDataCount) {
                UUID uuid = drmInitData2.get(i11).uuid;
                if (uuid.equals(b87.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(b87.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(b87.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(b87.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(b87.a)) {
                    linkedHashSet.add("universal");
                } else {
                    drmInitData = drmInitData2;
                    linkedHashSet.add("unknown (" + uuid + Extension.C_BRAKE);
                    i11++;
                    drmInitData2 = drmInitData;
                }
                drmInitData = drmInitData2;
                i11++;
                drmInitData2 = drmInitData;
            }
            t.append(", drm=[");
            mf1Var.e(t, linkedHashSet.iterator());
            t.append(']');
            i10 = -1;
        }
        if (i7 != i10 && i6 != i10) {
            t.append(", res=");
            t.append(i7);
            t.append(RemoteBioParameters.X);
            t.append(i6);
        }
        double d = f2;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            t.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            int i12 = tw21.a;
            t.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (kfcVar != null) {
            int i13 = kfcVar.f;
            int i14 = kfcVar.e;
            if ((i14 != -1 && i13 != -1) || kfcVar.d()) {
                t.append(", color=");
                if (kfcVar.d()) {
                    String b = kfc.b(kfcVar.a);
                    String a = kfc.a(kfcVar.b);
                    String c = kfc.c(kfcVar.c);
                    Locale locale = Locale.US;
                    str2 = oyr.q(b, "/", a, "/", c);
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i14 == -1 || i13 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i14 + "/" + i13;
                }
                t.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            t.append(", fps=");
            t.append(f);
        }
        if (i5 != -1) {
            t.append(", maxSubLayers=");
            t.append(i5);
        }
        if (i4 != -1) {
            t.append(", channels=");
            t.append(i4);
        }
        if (i3 != -1) {
            t.append(", sample_rate=");
            t.append(i3);
        }
        if (str4 != null) {
            t.append(", language=");
            t.append(str4);
        }
        if (!immutableList.isEmpty()) {
            t.append(", labels=[");
            mf1Var.e(t, u.b(immutableList, new qir(8)).iterator());
            t.append("]");
        }
        if (i2 != 0) {
            t.append(", selectionFlags=[");
            int i15 = tw21.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            mf1Var.e(t, arrayList.iterator());
            t.append("]");
        }
        if (i9 != 0) {
            t.append(", roleFlags=[");
            int i16 = tw21.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i9 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i9 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i9 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i9 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i9 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i9 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i9 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i9;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            mf1Var.e(t, arrayList2.iterator());
            t.append("]");
        } else {
            i = i9;
        }
        if ((i & 32768) != 0) {
            t.append(", auxiliaryTrackType=");
            int i17 = aVar.g;
            int i18 = tw21.a;
            if (i17 == 0) {
                str = StringUtils.UNDEFINED;
            } else if (i17 == 1) {
                str = "original";
            } else if (i17 == 2) {
                str = "depth-linear";
            } else if (i17 == 3) {
                str = "depth-inverse";
            } else {
                if (i17 != 4) {
                    ny61.r("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            t.append(str);
        }
        return t.toString();
    }

    public final f7s a() {
        f7s f7sVar = new f7s();
        f7sVar.a = this.a;
        f7sVar.b = this.b;
        f7sVar.c = this.c;
        f7sVar.d = this.d;
        f7sVar.e = this.e;
        f7sVar.f = this.f;
        f7sVar.h = this.h;
        f7sVar.i = this.i;
        f7sVar.j = this.k;
        f7sVar.k = this.l;
        f7sVar.l = this.m;
        f7sVar.m = this.n;
        f7sVar.n = this.o;
        f7sVar.o = this.p;
        f7sVar.p = this.q;
        f7sVar.q = this.r;
        f7sVar.r = this.s;
        f7sVar.s = this.t;
        f7sVar.t = this.u;
        f7sVar.u = this.v;
        f7sVar.v = this.w;
        f7sVar.w = this.x;
        f7sVar.x = this.y;
        f7sVar.y = this.z;
        f7sVar.z = this.A;
        f7sVar.A = this.B;
        f7sVar.B = this.C;
        f7sVar.C = this.D;
        f7sVar.D = this.E;
        f7sVar.E = this.F;
        f7sVar.F = this.G;
        f7sVar.G = this.H;
        f7sVar.H = this.I;
        f7sVar.I = this.J;
        f7sVar.J = this.K;
        f7sVar.K = this.L;
        f7sVar.L = this.M;
        return f7sVar;
    }

    public final boolean b(a aVar) {
        List list = this.q;
        if (list.size() != aVar.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) aVar.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final a d(a aVar) {
        String str;
        if (this == aVar) {
            return this;
        }
        int i = eh20.i(this.n);
        String str2 = aVar.a;
        ImmutableList immutableList = aVar.c;
        int i2 = aVar.K;
        int i3 = aVar.L;
        String str3 = aVar.b;
        if (str3 == null) {
            str3 = this.b;
        }
        if (immutableList.isEmpty()) {
            immutableList = this.c;
        }
        if ((i != 3 && i != 1) || (str = aVar.d) == null) {
            str = this.d;
        }
        int i4 = this.h;
        if (i4 == -1) {
            i4 = aVar.h;
        }
        int i5 = this.i;
        if (i5 == -1) {
            i5 = aVar.i;
        }
        String str4 = this.k;
        if (str4 == null) {
            String w = tw21.w(i, aVar.k);
            if (tw21.h0(w).length == 1) {
                str4 = w;
            }
        }
        w820 w820Var = aVar.l;
        w820 w820Var2 = this.l;
        if (w820Var2 != null) {
            w820Var = w820Var2.b(w820Var);
        }
        float f = this.w;
        if (f == -1.0f && i == 2) {
            f = aVar.w;
        }
        int i6 = this.e | aVar.e;
        int i7 = this.f | aVar.f;
        DrmInitData createSessionCreationData = DrmInitData.createSessionCreationData(aVar.r, this.r);
        f7s a = a();
        a.a = str2;
        a.b = str3;
        a.c = ImmutableList.l(immutableList);
        a.d = str;
        a.e = i6;
        a.f = i7;
        a.h = i4;
        a.i = i5;
        a.j = str4;
        a.k = w820Var;
        a.q = createSessionCreationData;
        a.v = f;
        a.J = i2;
        a.K = i3;
        return new a(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i2 = this.N;
        return (i2 == 0 || (i = aVar.N) == 0 || i2 == i) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.o == aVar.o && this.s == aVar.s && this.u == aVar.u && this.v == aVar.v && this.x == aVar.x && this.A == aVar.A && this.C == aVar.C && this.D == aVar.D && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.K == aVar.K && this.L == aVar.L && this.M == aVar.M && Float.compare(this.w, aVar.w) == 0 && Float.compare(this.y, aVar.y) == 0 && Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && this.c.equals(aVar.c) && Objects.equals(this.k, aVar.k) && Objects.equals(this.m, aVar.m) && Objects.equals(this.n, aVar.n) && Objects.equals(this.d, aVar.d) && Arrays.equals(this.z, aVar.z) && Objects.equals(this.l, aVar.l) && Objects.equals(this.B, aVar.B) && Objects.equals(this.r, aVar.r) && b(aVar);
    }

    public final int hashCode() {
        if (this.N == 0) {
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            w820 w820Var = this.l;
            int hashCode5 = (hashCode4 + (w820Var == null ? 0 : w820Var.hashCode())) * 961;
            String str5 = this.m;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.N = ((((((((((((((((((((((Float.floatToIntBits(this.y) + ((((Float.floatToIntBits(this.w) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31)) * 31) + this.x) * 31)) * 31) + this.A) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.K) * 31) + this.L) * 31) + this.M;
        }
        return this.N;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.m);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.n);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.k);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.j);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.v);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.w);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.B);
        sb.append("], [");
        sb.append(this.D);
        sb.append(Extension.FIX_SPACE);
        return oyr.m(this.E, "])", sb);
    }
}

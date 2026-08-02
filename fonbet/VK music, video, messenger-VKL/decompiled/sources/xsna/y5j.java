package xsna;

import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: ConstraintLayoutBaseScope.kt */
/* loaded from: classes11.dex */
public abstract class y5j {
    public final bv8 a;
    public int b;
    public final int c;
    public int d;

    /* compiled from: ConstraintLayoutBaseScope.kt */
    public static final class a {
        public final Object a;
        public final int b;
        public final spy c;

        public a(Object obj, int i, spy spyVar) {
            this.a = obj;
            this.b = i;
            this.c = spyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
        }
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    public static final class b {
        public final Object a;
        public final int b;
        public final spy c;

        public b(Object obj, int i, spy spyVar) {
            this.a = obj;
            this.b = i;
            this.c = spyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
        }
    }

    public y5j(bv8 bv8Var) {
        new ArrayList();
        this.a = bv8Var != null ? bv8Var.e() : new bv8(new char[0]);
        this.c = 1000;
        this.d = 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:187|(2:189|(10:191|(1:193)(1:203)|194|195|(1:197)|198|(1:200)|45|46|47))|204|194|195|(0)|198|(0)|45|46|47) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:117|(2:119|(12:121|(1:123)(1:134)|124|125|126|(1:128)|129|(1:131)|109|45|46|47))|135|125|126|(0)|129|(0)|109|45|46|47) */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0455 A[Catch: NumberFormatException -> 0x03d8, TryCatch #3 {NumberFormatException -> 0x03d8, blocks: (B:126:0x0447, B:128:0x0455, B:129:0x045b, B:131:0x0463), top: B:125:0x0447 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0463 A[Catch: NumberFormatException -> 0x03d8, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x03d8, blocks: (B:126:0x0447, B:128:0x0455, B:129:0x045b, B:131:0x0463), top: B:125:0x0447 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0603 A[Catch: NumberFormatException -> 0x0272, TryCatch #4 {NumberFormatException -> 0x0272, blocks: (B:195:0x05f5, B:197:0x0603, B:198:0x0609, B:200:0x0611), top: B:194:0x05f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0611 A[Catch: NumberFormatException -> 0x0272, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x0272, blocks: (B:195:0x05f5, B:197:0x0603, B:198:0x0609, B:200:0x0611), top: B:194:0x05f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ftk0 ftk0Var) {
        char c;
        bv8 bv8Var;
        Iterator<String> it;
        char c2;
        bv8 bv8Var2;
        String w;
        bv8 bv8Var3;
        String w2;
        String str;
        String str2;
        char c3;
        char c4;
        float k;
        float f;
        float f2;
        float f3;
        String str3;
        int i;
        yu8 q;
        b.d dVar;
        char c5;
        Iterator<String> it2;
        b.d dVar2;
        Iterator<String> it3;
        int i2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        String i3;
        char c6;
        char c7;
        Object obj;
        fur furVar;
        Iterator<String> it4;
        char c8;
        b.d dVar3;
        String str4;
        String str5;
        Object obj2;
        String i4;
        String str6;
        String str7;
        Float valueOf;
        Float f11;
        Float f12;
        char c9;
        String i5;
        String str8;
        String str9;
        float k2;
        float f13;
        float f14;
        float f15;
        Float valueOf2;
        Float f16;
        Float f17;
        yu8 yu8Var;
        String str10;
        wu8 wu8Var;
        float f18;
        float f19;
        float f20;
        b.d dVar4 = new b.d();
        dVar4.a = new HashMap<>();
        dVar4.b = new HashMap<>();
        dVar4.c = new HashMap<>();
        bv8 bv8Var4 = this.a;
        Iterator<String> it5 = bv8Var4.y().iterator();
        while (it5.hasNext()) {
            String next = it5.next();
            yu8 q2 = bv8Var4.q(next);
            next.getClass();
            switch (next.hashCode()) {
                case -1824489883:
                    if (next.equals("Helpers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875016085:
                    if (next.equals("Generate")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1921490263:
                    if (next.equals("Variables")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    bv8Var = bv8Var4;
                    it = it5;
                    if (q2 instanceof wu8) {
                        wu8 wu8Var2 = (wu8) q2;
                        for (int i6 = 0; i6 < wu8Var2.f.size(); i6++) {
                            yu8 p = wu8Var2.p(i6);
                            if (p instanceof wu8) {
                                wu8 wu8Var3 = (wu8) p;
                                if (wu8Var3.f.size() > 1) {
                                    String u = wu8Var3.u(0);
                                    u.getClass();
                                    switch (u.hashCode()) {
                                        case -1785507558:
                                            if (u.equals("vGuideline")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1252464839:
                                            if (u.equals("hChain")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -851656725:
                                            if (u.equals("vChain")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 965681512:
                                            if (u.equals("hGuideline")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            yu8 p2 = wu8Var3.p(1);
                                            if ((p2 instanceof bv8) && (w = (bv8Var2 = (bv8) p2).w("id")) != null) {
                                                androidx.constraintlayout.core.state.b.f(1, ftk0Var, w, bv8Var2);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            androidx.constraintlayout.core.state.b.b(0, ftk0Var, dVar4, wu8Var3);
                                            break;
                                        case 2:
                                            androidx.constraintlayout.core.state.b.b(1, ftk0Var, dVar4, wu8Var3);
                                            break;
                                        case 3:
                                            yu8 p3 = wu8Var3.p(1);
                                            if ((p3 instanceof bv8) && (w2 = (bv8Var3 = (bv8) p3).w("id")) != null) {
                                                androidx.constraintlayout.core.state.b.f(0, ftk0Var, w2, bv8Var3);
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 1:
                    bv8Var = bv8Var4;
                    it = it5;
                    if (q2 instanceof bv8) {
                        bv8 bv8Var5 = (bv8) q2;
                        Iterator<String> it6 = bv8Var5.y().iterator();
                        while (it6.hasNext()) {
                            String next2 = it6.next();
                            yu8 q3 = bv8Var5.q(next2);
                            HashMap<String, ArrayList<String>> hashMap = dVar4.c;
                            ArrayList<String> arrayList = hashMap.containsKey(next2) ? hashMap.get(next2) : null;
                            if (arrayList != null && (q3 instanceof bv8)) {
                                Iterator<String> it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    androidx.constraintlayout.core.state.b.g(ftk0Var, dVar4, it7.next(), (bv8) q3);
                                }
                            }
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 2:
                    bv8Var = bv8Var4;
                    it = it5;
                    if (q2 instanceof bv8) {
                        bv8 bv8Var6 = (bv8) q2;
                        Iterator<String> it8 = bv8Var6.y().iterator();
                        while (it8.hasNext()) {
                            String next3 = it8.next();
                            yu8 q4 = bv8Var6.q(next3);
                            if (q4 instanceof av8) {
                                dVar4.a.put(next3, Integer.valueOf(q4.k()));
                            } else if (q4 instanceof bv8) {
                                bv8 bv8Var7 = (bv8) q4;
                                if (bv8Var7.x("from") && bv8Var7.x("to")) {
                                    float a2 = dVar4.a(bv8Var7.q("from"));
                                    float a3 = dVar4.a(bv8Var7.q("to"));
                                    String w3 = bv8Var7.w("prefix");
                                    String w4 = bv8Var7.w("postfix");
                                    HashMap<String, b.InterfaceC0017b> hashMap2 = dVar4.b;
                                    if (hashMap2.containsKey(next3)) {
                                        hashMap2.get(next3);
                                    }
                                    b.a aVar = new b.a();
                                    aVar.a = false;
                                    aVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    if (w3 == null) {
                                        w3 = "";
                                    }
                                    aVar.b = w3;
                                    if (w4 == null) {
                                        w4 = "";
                                    }
                                    aVar.c = w4;
                                    aVar.e = a3;
                                    hashMap2.put(next3, aVar);
                                    HashMap<String, ArrayList<String>> hashMap3 = dVar4.c;
                                    ArrayList<String> arrayList2 = new ArrayList<>();
                                    int i7 = (int) a2;
                                    int i8 = (int) a3;
                                    int i9 = i7;
                                    while (i7 <= i8) {
                                        arrayList2.add(aVar.b + i9 + aVar.c);
                                        i9 += (int) 1.0f;
                                        i7++;
                                    }
                                    hashMap3.put(next3, arrayList2);
                                } else if (bv8Var7.x("from") && bv8Var7.x("step")) {
                                    float a4 = dVar4.a(bv8Var7.q("from"));
                                    float a5 = dVar4.a(bv8Var7.q("step"));
                                    HashMap<String, b.InterfaceC0017b> hashMap4 = dVar4.b;
                                    if (hashMap4.containsKey(next3)) {
                                        hashMap4.get(next3);
                                    }
                                    b.c cVar = new b.c();
                                    cVar.a = a5;
                                    cVar.b = a4;
                                    hashMap4.put(next3, cVar);
                                } else if (bv8Var7.x("ids")) {
                                    yu8 q5 = bv8Var7.q("ids");
                                    if (!(q5 instanceof wu8)) {
                                        throw new CLParsingException("no array found for key <ids>, found [" + q5.l() + "] : " + q5, bv8Var7);
                                    }
                                    wu8 wu8Var4 = (wu8) q5;
                                    ArrayList<String> arrayList3 = new ArrayList<>();
                                    for (int i10 = 0; i10 < wu8Var4.f.size(); i10++) {
                                        arrayList3.add(wu8Var4.u(i10));
                                    }
                                    dVar4.c.put(next3, arrayList3);
                                } else if (bv8Var7.x("tag")) {
                                    String v = bv8Var7.v("tag");
                                    HashMap<String, ArrayList<String>> hashMap5 = ftk0Var.e;
                                    dVar4.c.put(next3, hashMap5.containsKey(v) ? hashMap5.get(v) : null);
                                }
                            }
                        }
                        break;
                    } else {
                        continue;
                    }
                    break;
                default:
                    if (q2 instanceof bv8) {
                        bv8 bv8Var8 = (bv8) q2;
                        Iterator<String> it9 = bv8Var8.y().iterator();
                        while (true) {
                            str = "type";
                            if (!it9.hasNext()) {
                                str2 = null;
                            } else if (it9.next().equals("type")) {
                                str2 = bv8Var8.v("type");
                            }
                        }
                        if (str2 != null) {
                            String str11 = "hFlow";
                            switch (str2.hashCode()) {
                                case -1785507558:
                                    if (str2.equals("vGuideline")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1354837162:
                                    if (str2.equals("column")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1252464839:
                                    if (str2.equals("hChain")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -851656725:
                                    if (str2.equals("vChain")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -333143113:
                                    if (str2.equals("barrier")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 113114:
                                    if (str2.equals("row")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3181382:
                                    if (str2.equals("grid")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 98238902:
                                    if (str2.equals("hFlow")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 111168196:
                                    if (str2.equals("vFlow")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 965681512:
                                    if (str2.equals("hGuideline")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            bv8Var = bv8Var4;
                            it = it5;
                            switch (c3) {
                                case 0:
                                    androidx.constraintlayout.core.state.b.f(1, ftk0Var, next, bv8Var8);
                                    continue;
                                case 1:
                                case 5:
                                case 6:
                                    androidx.constraintlayout.core.state.a b2 = ftk0Var.b(next);
                                    Object obj3 = b2.c;
                                    if (obj3 == null || !(obj3 instanceof cgu)) {
                                        State.Helper helper = State.Helper.GRID;
                                        if (str2.charAt(0) == 'r') {
                                            helper = State.Helper.ROW;
                                        } else if (str2.charAt(0) == 'c') {
                                            helper = State.Helper.COLUMN;
                                        }
                                        cgu cguVar = new cgu(ftk0Var, helper);
                                        b2.c = cguVar;
                                        b2.c(cguVar.a());
                                    }
                                    cgu cguVar2 = (cgu) b2.c;
                                    Iterator<String> it10 = bv8Var8.y().iterator();
                                    while (it10.hasNext()) {
                                        String next4 = it10.next();
                                        next4.getClass();
                                        switch (next4.hashCode()) {
                                            case -1439500848:
                                                if (next4.equals(X3.i.n)) {
                                                    c4 = 0;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -806339567:
                                                if (next4.equals("padding")) {
                                                    c4 = 1;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -567445985:
                                                if (next4.equals("contains")) {
                                                    c4 = 2;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 3169614:
                                                if (next4.equals("hGap")) {
                                                    c4 = 3;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 3506649:
                                                if (next4.equals("rows")) {
                                                    c4 = 4;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 3586688:
                                                if (next4.equals("vGap")) {
                                                    c4 = 5;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 97513095:
                                                if (next4.equals("flags")) {
                                                    c4 = 6;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 109497044:
                                                if (next4.equals("skips")) {
                                                    c4 = 7;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 109638249:
                                                if (next4.equals("spans")) {
                                                    c4 = '\b';
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 144441793:
                                                if (next4.equals("rowWeights")) {
                                                    c4 = '\t';
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 949721053:
                                                if (next4.equals("columns")) {
                                                    c4 = '\n';
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 2033353925:
                                                if (next4.equals("columnWeights")) {
                                                    c4 = 11;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            default:
                                                c4 = 65535;
                                                break;
                                        }
                                        switch (c4) {
                                            case 0:
                                                cguVar2.s0 = bv8Var8.q(next4).k();
                                                break;
                                            case 1:
                                                yu8 q6 = bv8Var8.q(next4);
                                                if (q6 instanceof wu8) {
                                                    wu8 wu8Var5 = (wu8) q6;
                                                    if (wu8Var5.f.size() > 1) {
                                                        k = wu8Var5.getInt(0);
                                                        f3 = wu8Var5.getInt(1);
                                                        if (wu8Var5.f.size() > 2) {
                                                            f2 = wu8Var5.getInt(2);
                                                            try {
                                                                f = ((wu8) q6).getInt(3);
                                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                                cguVar2.o0 = Math.round(ftk0Var.a.b(k));
                                                                cguVar2.q0 = Math.round(ftk0Var.a.b(f3));
                                                                cguVar2.p0 = Math.round(ftk0Var.a.b(f2));
                                                                cguVar2.r0 = Math.round(ftk0Var.a.b(f));
                                                            }
                                                        } else {
                                                            f2 = k;
                                                            f = f3;
                                                        }
                                                        cguVar2.o0 = Math.round(ftk0Var.a.b(k));
                                                        cguVar2.q0 = Math.round(ftk0Var.a.b(f3));
                                                        cguVar2.p0 = Math.round(ftk0Var.a.b(f2));
                                                        cguVar2.r0 = Math.round(ftk0Var.a.b(f));
                                                    }
                                                }
                                                k = q6.k();
                                                f = k;
                                                f2 = f;
                                                f3 = f2;
                                                cguVar2.o0 = Math.round(ftk0Var.a.b(k));
                                                cguVar2.q0 = Math.round(ftk0Var.a.b(f3));
                                                cguVar2.p0 = Math.round(ftk0Var.a.b(f2));
                                                cguVar2.r0 = Math.round(ftk0Var.a.b(f));
                                            case 2:
                                                yu8 t = bv8Var8.t(next4);
                                                wu8 wu8Var6 = t instanceof wu8 ? (wu8) t : null;
                                                if (wu8Var6 != null) {
                                                    for (int i11 = 0; i11 < wu8Var6.f.size(); i11++) {
                                                        cguVar2.q(ftk0Var.b(wu8Var6.p(i11).i()));
                                                    }
                                                }
                                                break;
                                            case 3:
                                                cguVar2.v0 = ftk0Var.a.b(bv8Var8.q(next4).j());
                                                break;
                                            case 4:
                                                int k3 = bv8Var8.q(next4).k();
                                                if (k3 > 0 && cguVar2.l0 != State.Helper.COLUMN) {
                                                    cguVar2.t0 = k3;
                                                }
                                                break;
                                            case 5:
                                                cguVar2.w0 = ftk0Var.a.b(bv8Var8.q(next4).j());
                                                break;
                                            case 6:
                                                try {
                                                    q = bv8Var8.q(next4);
                                                } catch (Exception e) {
                                                    System.err.println("Error parsing grid flags " + e);
                                                    str3 = "";
                                                }
                                                if (q instanceof av8) {
                                                    i = q.k();
                                                    str3 = "";
                                                    if (str3 != null || str3.isEmpty()) {
                                                        cguVar2.B0 = i;
                                                    } else {
                                                        cguVar2.getClass();
                                                        if (!str3.isEmpty()) {
                                                            String[] split = str3.split("\\|");
                                                            cguVar2.B0 = 0;
                                                            for (String str12 : split) {
                                                                String lowerCase = str12.toLowerCase();
                                                                lowerCase.getClass();
                                                                if (lowerCase.equals("subgridbycolrow")) {
                                                                    cguVar2.B0 |= 1;
                                                                } else if (lowerCase.equals("spansrespectwidgetorder")) {
                                                                    cguVar2.B0 |= 2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    str3 = q.i();
                                                    i = 0;
                                                    if (str3 != null) {
                                                    }
                                                    cguVar2.B0 = i;
                                                }
                                            case 7:
                                                String i12 = bv8Var8.q(next4).i();
                                                if (i12 != null && i12.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                                                    cguVar2.A0 = i12;
                                                }
                                                break;
                                            case '\b':
                                                String i13 = bv8Var8.q(next4).i();
                                                if (i13 != null && i13.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                                                    cguVar2.z0 = i13;
                                                }
                                                break;
                                            case '\t':
                                                String i14 = bv8Var8.q(next4).i();
                                                if (i14 != null && i14.contains(StringUtils.COMMA)) {
                                                    cguVar2.x0 = i14;
                                                }
                                                break;
                                            case '\n':
                                                int k4 = bv8Var8.q(next4).k();
                                                if (k4 > 0 && cguVar2.l0 != State.Helper.ROW) {
                                                    cguVar2.u0 = k4;
                                                }
                                                break;
                                            case 11:
                                                String i15 = bv8Var8.q(next4).i();
                                                if (i15 != null && i15.contains(StringUtils.COMMA)) {
                                                    cguVar2.y0 = i15;
                                                }
                                                break;
                                            default:
                                                androidx.constraintlayout.core.state.b.a(ftk0Var.b(next), dVar4, ftk0Var, next4, bv8Var8);
                                                break;
                                        }
                                    }
                                    continue;
                                case 2:
                                case 3:
                                    dVar = dVar4;
                                    dra draVar = str2.charAt(0) == 'h' ? (adv) ftk0Var.e(State.Helper.HORIZONTAL_CHAIN) : (nor0) ftk0Var.e(State.Helper.VERTICAL_CHAIN);
                                    draVar.a = next;
                                    Iterator<String> it11 = bv8Var8.y().iterator();
                                    while (it11.hasNext()) {
                                        String next5 = it11.next();
                                        next5.getClass();
                                        switch (next5.hashCode()) {
                                            case -1383228885:
                                                if (next5.equals("bottom")) {
                                                    c5 = 0;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case -567445985:
                                                if (next5.equals("contains")) {
                                                    c5 = 1;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 100571:
                                                if (next5.equals(TtmlNode.END)) {
                                                    c5 = 2;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 115029:
                                                if (next5.equals("top")) {
                                                    c5 = 3;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 3317767:
                                                if (next5.equals(TtmlNode.LEFT)) {
                                                    c5 = 4;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 108511772:
                                                if (next5.equals(TtmlNode.RIGHT)) {
                                                    c5 = 5;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 109757538:
                                                if (next5.equals("start")) {
                                                    c5 = 6;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 109780401:
                                                if (next5.equals(TtmlNode.TAG_STYLE)) {
                                                    c5 = 7;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            default:
                                                c5 = 65535;
                                                break;
                                        }
                                        switch (c5) {
                                            case 0:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                                it2 = it11;
                                                dVar2 = dVar;
                                                androidx.constraintlayout.core.state.b.c(draVar, dVar2, ftk0Var, next5, bv8Var8);
                                                dVar = dVar2;
                                                it11 = it2;
                                            case 1:
                                                yu8 q7 = bv8Var8.q(next5);
                                                if (q7 instanceof wu8) {
                                                    wu8 wu8Var7 = (wu8) q7;
                                                    if (wu8Var7.f.size() >= 1) {
                                                        int i16 = 0;
                                                        while (i16 < wu8Var7.f.size()) {
                                                            yu8 p4 = wu8Var7.p(i16);
                                                            if (p4 instanceof wu8) {
                                                                wu8 wu8Var8 = (wu8) p4;
                                                                if (wu8Var8.f.size() > 0) {
                                                                    String i17 = wu8Var8.p(0).i();
                                                                    it3 = it11;
                                                                    int size = wu8Var8.f.size();
                                                                    i2 = i16;
                                                                    if (size != 2) {
                                                                        if (size == 3) {
                                                                            f10 = wu8Var8.getFloat(1);
                                                                            f5 = ftk0Var.a.b(wu8Var8.getFloat(2));
                                                                            f8 = f5;
                                                                        } else if (size == 4) {
                                                                            f10 = wu8Var8.getFloat(1);
                                                                            float b3 = ftk0Var.a.b(wu8Var8.getFloat(2));
                                                                            f5 = ftk0Var.a.b(wu8Var8.getFloat(3));
                                                                            f8 = b3;
                                                                        } else if (size != 6) {
                                                                            f5 = Float.NaN;
                                                                            f6 = Float.NaN;
                                                                            f7 = Float.NaN;
                                                                            f4 = Float.NaN;
                                                                            f8 = Float.NaN;
                                                                        } else {
                                                                            float f21 = wu8Var8.getFloat(1);
                                                                            float b4 = ftk0Var.a.b(wu8Var8.getFloat(2));
                                                                            float b5 = ftk0Var.a.b(wu8Var8.getFloat(3));
                                                                            float b6 = ftk0Var.a.b(wu8Var8.getFloat(4));
                                                                            f7 = ftk0Var.a.b(wu8Var8.getFloat(5));
                                                                            f5 = b5;
                                                                            f8 = b4;
                                                                            f4 = f21;
                                                                            f6 = b6;
                                                                        }
                                                                        f4 = f10;
                                                                        f6 = Float.NaN;
                                                                        f7 = Float.NaN;
                                                                    } else {
                                                                        f4 = wu8Var8.getFloat(1);
                                                                        f5 = Float.NaN;
                                                                        f6 = Float.NaN;
                                                                        f7 = Float.NaN;
                                                                        f8 = Float.NaN;
                                                                    }
                                                                    draVar.q(i17);
                                                                    String obj4 = i17.toString();
                                                                    if (Float.isNaN(f4)) {
                                                                        f9 = f5;
                                                                    } else {
                                                                        f9 = f5;
                                                                        draVar.o0.put(obj4, Float.valueOf(f4));
                                                                    }
                                                                    if (!Float.isNaN(f8)) {
                                                                        draVar.p0.put(obj4, Float.valueOf(f8));
                                                                    }
                                                                    if (!Float.isNaN(f9)) {
                                                                        draVar.q0.put(obj4, Float.valueOf(f9));
                                                                    }
                                                                    if (!Float.isNaN(f6)) {
                                                                        if (draVar.r0 == null) {
                                                                            draVar.r0 = new HashMap<>();
                                                                        }
                                                                        draVar.r0.put(obj4, Float.valueOf(f6));
                                                                    }
                                                                    if (!Float.isNaN(f7)) {
                                                                        if (draVar.s0 == null) {
                                                                            draVar.s0 = new HashMap<>();
                                                                        }
                                                                        draVar.s0.put(obj4, Float.valueOf(f7));
                                                                    }
                                                                } else {
                                                                    it3 = it11;
                                                                    i2 = i16;
                                                                }
                                                            } else {
                                                                it3 = it11;
                                                                i2 = i16;
                                                                draVar.q(p4.i());
                                                            }
                                                            i16 = i2 + 1;
                                                            it11 = it3;
                                                        }
                                                        it2 = it11;
                                                        dVar2 = dVar;
                                                        dVar = dVar2;
                                                        it11 = it2;
                                                    }
                                                }
                                                PrintStream printStream = System.err;
                                                StringBuilder b7 = ho8.b(next, " contains should be an array \"");
                                                b7.append(q7.i());
                                                b7.append("\"");
                                                printStream.println(b7.toString());
                                                break;
                                            case 7:
                                                yu8 q8 = bv8Var8.q(next5);
                                                if (q8 instanceof wu8) {
                                                    wu8 wu8Var9 = (wu8) q8;
                                                    if (wu8Var9.f.size() > 1) {
                                                        i3 = wu8Var9.u(0);
                                                        draVar.n0 = wu8Var9.getFloat(1);
                                                        i3.getClass();
                                                        if (!i3.equals("packed")) {
                                                            draVar.t0 = State.Chain.PACKED;
                                                        } else if (i3.equals("spread_inside")) {
                                                            draVar.t0 = State.Chain.SPREAD_INSIDE;
                                                        } else {
                                                            draVar.t0 = State.Chain.SPREAD;
                                                        }
                                                        it2 = it11;
                                                        dVar2 = dVar;
                                                        dVar = dVar2;
                                                        it11 = it2;
                                                    }
                                                }
                                                i3 = q8.i();
                                                i3.getClass();
                                                if (!i3.equals("packed")) {
                                                }
                                                it2 = it11;
                                                dVar2 = dVar;
                                                dVar = dVar2;
                                                it11 = it2;
                                            default:
                                                it2 = it11;
                                                dVar2 = dVar;
                                                dVar = dVar2;
                                                it11 = it2;
                                        }
                                    }
                                    break;
                                case 4:
                                    dVar = dVar4;
                                    boolean z = ftk0Var.b;
                                    State.Direction direction = State.Direction.END;
                                    androidx.constraintlayout.core.state.a b8 = ftk0Var.b(next);
                                    Object obj5 = b8.c;
                                    if (obj5 == null || !(obj5 instanceof d46)) {
                                        d46 d46Var = new d46(ftk0Var);
                                        d46Var.n0 = direction;
                                        b8.c = d46Var;
                                        b8.c(d46Var.a());
                                    }
                                    d46 d46Var2 = (d46) b8.c;
                                    Iterator<String> it12 = bv8Var8.y().iterator();
                                    while (it12.hasNext()) {
                                        String next6 = it12.next();
                                        next6.getClass();
                                        switch (next6.hashCode()) {
                                            case -1081309778:
                                                if (next6.equals("margin")) {
                                                    c6 = 0;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -962590849:
                                                if (next6.equals(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
                                                    c6 = 1;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -567445985:
                                                if (next6.equals("contains")) {
                                                    c6 = 2;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            default:
                                                c6 = 65535;
                                                break;
                                        }
                                        switch (c6) {
                                            case 0:
                                                yu8 t2 = bv8Var8.t(next6);
                                                float j = t2 instanceof av8 ? t2.j() : Float.NaN;
                                                if (Float.isNaN(j)) {
                                                    break;
                                                } else {
                                                    d46Var2.l(Float.valueOf(ftk0Var.a.b(j)));
                                                    break;
                                                }
                                            case 1:
                                                String v2 = bv8Var8.v(next6);
                                                v2.getClass();
                                                switch (v2.hashCode()) {
                                                    case -1383228885:
                                                        if (v2.equals("bottom")) {
                                                            c7 = 0;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 100571:
                                                        if (v2.equals(TtmlNode.END)) {
                                                            c7 = 1;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 115029:
                                                        if (v2.equals("top")) {
                                                            c7 = 2;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 3317767:
                                                        if (v2.equals(TtmlNode.LEFT)) {
                                                            c7 = 3;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 108511772:
                                                        if (v2.equals(TtmlNode.RIGHT)) {
                                                            c7 = 4;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 109757538:
                                                        if (v2.equals("start")) {
                                                            c7 = 5;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    default:
                                                        c7 = 65535;
                                                        break;
                                                }
                                                switch (c7) {
                                                    case 0:
                                                        d46Var2.n0 = State.Direction.BOTTOM;
                                                        break;
                                                    case 1:
                                                        if (z) {
                                                            d46Var2.n0 = State.Direction.RIGHT;
                                                            break;
                                                        } else {
                                                            d46Var2.n0 = State.Direction.LEFT;
                                                            break;
                                                        }
                                                    case 2:
                                                        d46Var2.n0 = State.Direction.TOP;
                                                        break;
                                                    case 3:
                                                        d46Var2.n0 = State.Direction.LEFT;
                                                        break;
                                                    case 4:
                                                        d46Var2.n0 = State.Direction.RIGHT;
                                                        break;
                                                    case 5:
                                                        if (z) {
                                                            d46Var2.n0 = State.Direction.LEFT;
                                                            break;
                                                        } else {
                                                            d46Var2.n0 = State.Direction.RIGHT;
                                                            break;
                                                        }
                                                }
                                            case 2:
                                                yu8 t3 = bv8Var8.t(next6);
                                                wu8 wu8Var10 = t3 instanceof wu8 ? (wu8) t3 : null;
                                                if (wu8Var10 != null) {
                                                    for (int i18 = 0; i18 < wu8Var10.f.size(); i18++) {
                                                        d46Var2.q(ftk0Var.b(wu8Var10.p(i18).i()));
                                                    }
                                                    break;
                                                } else {
                                                    break;
                                                }
                                        }
                                    }
                                    break;
                                case 7:
                                case '\b':
                                    Float valueOf3 = Float.valueOf(0.5f);
                                    boolean z2 = str2.charAt(0) == 'v';
                                    androidx.constraintlayout.core.state.a b9 = ftk0Var.b(next);
                                    boolean z3 = z2;
                                    Object obj6 = b9.c;
                                    if (obj6 == null || !(obj6 instanceof fur)) {
                                        if (z3) {
                                            obj = "start";
                                            furVar = new fur(ftk0Var, State.Helper.VERTICAL_FLOW);
                                        } else {
                                            obj = "start";
                                            furVar = new fur(ftk0Var, State.Helper.HORIZONTAL_FLOW);
                                        }
                                        b9.c = furVar;
                                        b9.c(furVar.a());
                                    } else {
                                        obj = "start";
                                    }
                                    fur furVar2 = (fur) b9.c;
                                    Iterator<String> it13 = bv8Var8.y().iterator();
                                    while (it13.hasNext()) {
                                        String next7 = it13.next();
                                        next7.getClass();
                                        switch (next7.hashCode()) {
                                            case -1254185091:
                                                it4 = it13;
                                                if (next7.equals("hAlign")) {
                                                    c8 = 0;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -1237307863:
                                                it4 = it13;
                                                if (next7.equals("hStyle")) {
                                                    c8 = 1;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -1198076529:
                                                it4 = it13;
                                                if (next7.equals("hFlowBias")) {
                                                    c8 = 2;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -853376977:
                                                it4 = it13;
                                                if (next7.equals("vAlign")) {
                                                    c8 = 3;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -836499749:
                                                it4 = it13;
                                                if (next7.equals("vStyle")) {
                                                    c8 = 4;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -806339567:
                                                it4 = it13;
                                                if (next7.equals("padding")) {
                                                    c8 = 5;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -732635235:
                                                it4 = it13;
                                                if (next7.equals("vFlowBias")) {
                                                    c8 = 6;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -567445985:
                                                it4 = it13;
                                                if (next7.equals("contains")) {
                                                    c8 = 7;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -488900360:
                                                it4 = it13;
                                                if (next7.equals("maxElement")) {
                                                    c8 = '\b';
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case 3169614:
                                                it4 = it13;
                                                if (next7.equals("hGap")) {
                                                    c8 = '\t';
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case 3575610:
                                                it4 = it13;
                                                if (next7.equals(str)) {
                                                    c8 = '\n';
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case 3586688:
                                                it4 = it13;
                                                if (next7.equals("vGap")) {
                                                    c8 = 11;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case 3657802:
                                                it4 = it13;
                                                if (next7.equals("wrap")) {
                                                    c8 = '\f';
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            default:
                                                it4 = it13;
                                                c8 = 65535;
                                                break;
                                        }
                                        switch (c8) {
                                            case 0:
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                String i19 = bv8Var8.q(next7).i();
                                                i19.getClass();
                                                if (i19.equals(TtmlNode.END)) {
                                                    obj2 = obj;
                                                    furVar2.z0 = 1;
                                                } else {
                                                    obj2 = obj;
                                                    if (i19.equals(obj2)) {
                                                        furVar2.z0 = 0;
                                                    } else {
                                                        furVar2.z0 = 2;
                                                    }
                                                }
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case 1:
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                yu8 q9 = bv8Var8.q(next7);
                                                if (q9 instanceof wu8) {
                                                    wu8 wu8Var11 = (wu8) q9;
                                                    if (wu8Var11.f.size() > 1) {
                                                        str6 = wu8Var11.u(0);
                                                        i4 = wu8Var11.u(1);
                                                        str7 = wu8Var11.f.size() > 2 ? wu8Var11.u(2) : "";
                                                        if (!i4.equals("")) {
                                                            furVar2.v0 = State.Chain.a(i4);
                                                        }
                                                        if (!str6.equals("")) {
                                                            furVar2.w0 = State.Chain.a(str6);
                                                        }
                                                        if (!str7.equals("")) {
                                                            furVar2.x0 = State.Chain.a(str7);
                                                        }
                                                        obj2 = obj;
                                                        obj = obj2;
                                                        it13 = it4;
                                                        str = str4;
                                                        dVar4 = dVar3;
                                                        str11 = str5;
                                                    }
                                                }
                                                i4 = q9.i();
                                                str6 = "";
                                                str7 = str6;
                                                if (!i4.equals("")) {
                                                }
                                                if (!str6.equals("")) {
                                                }
                                                if (!str7.equals("")) {
                                                }
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case 2:
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                yu8 q10 = bv8Var8.q(next7);
                                                if (q10 instanceof wu8) {
                                                    wu8 wu8Var12 = (wu8) q10;
                                                    if (wu8Var12.f.size() > 1) {
                                                        f11 = Float.valueOf(wu8Var12.getFloat(0));
                                                        valueOf = Float.valueOf(wu8Var12.getFloat(1));
                                                        f12 = wu8Var12.f.size() > 2 ? Float.valueOf(wu8Var12.getFloat(2)) : valueOf3;
                                                        furVar2.h = valueOf.floatValue();
                                                        if (f11.floatValue() != 0.5f) {
                                                            furVar2.K0 = f11.floatValue();
                                                        }
                                                        if (f12.floatValue() != 0.5f) {
                                                            furVar2.L0 = f12.floatValue();
                                                        }
                                                        obj2 = obj;
                                                        obj = obj2;
                                                        it13 = it4;
                                                        str = str4;
                                                        dVar4 = dVar3;
                                                        str11 = str5;
                                                    }
                                                }
                                                valueOf = Float.valueOf(q10.j());
                                                f11 = valueOf3;
                                                f12 = f11;
                                                furVar2.h = valueOf.floatValue();
                                                if (f11.floatValue() != 0.5f) {
                                                }
                                                if (f12.floatValue() != 0.5f) {
                                                }
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case 3:
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                String i20 = bv8Var8.q(next7).i();
                                                i20.getClass();
                                                switch (i20.hashCode()) {
                                                    case -1720785339:
                                                        if (i20.equals("baseline")) {
                                                            c9 = 0;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    case -1383228885:
                                                        if (i20.equals("bottom")) {
                                                            c9 = 1;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    case 115029:
                                                        if (i20.equals("top")) {
                                                            c9 = 2;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    default:
                                                        c9 = 65535;
                                                        break;
                                                }
                                                switch (c9) {
                                                    case 0:
                                                        furVar2.y0 = 3;
                                                        break;
                                                    case 1:
                                                        furVar2.y0 = 1;
                                                        break;
                                                    case 2:
                                                        furVar2.y0 = 0;
                                                        break;
                                                    default:
                                                        furVar2.y0 = 2;
                                                        break;
                                                }
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case 4:
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                yu8 q11 = bv8Var8.q(next7);
                                                if (q11 instanceof wu8) {
                                                    wu8 wu8Var13 = (wu8) q11;
                                                    if (wu8Var13.f.size() > 1) {
                                                        str8 = wu8Var13.u(0);
                                                        i5 = wu8Var13.u(1);
                                                        str9 = wu8Var13.f.size() > 2 ? wu8Var13.u(2) : "";
                                                        if (!i5.equals("")) {
                                                            furVar2.s0 = State.Chain.a(i5);
                                                        }
                                                        if (!str8.equals("")) {
                                                            furVar2.t0 = State.Chain.a(str8);
                                                        }
                                                        if (!str9.equals("")) {
                                                            furVar2.u0 = State.Chain.a(str9);
                                                        }
                                                        obj2 = obj;
                                                        obj = obj2;
                                                        it13 = it4;
                                                        str = str4;
                                                        dVar4 = dVar3;
                                                        str11 = str5;
                                                    }
                                                }
                                                i5 = q11.i();
                                                str8 = "";
                                                str9 = str8;
                                                if (!i5.equals("")) {
                                                }
                                                if (!str8.equals("")) {
                                                }
                                                if (!str9.equals("")) {
                                                }
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case 5:
                                                str4 = str;
                                                str5 = str11;
                                                yu8 q12 = bv8Var8.q(next7);
                                                if (q12 instanceof wu8) {
                                                    wu8 wu8Var14 = (wu8) q12;
                                                    if (wu8Var14.f.size() > 1) {
                                                        float f22 = wu8Var14.getInt(0);
                                                        f14 = wu8Var14.getInt(1);
                                                        if (wu8Var14.f.size() > 2) {
                                                            float f23 = wu8Var14.getInt(2);
                                                            try {
                                                                dVar3 = dVar4;
                                                                f15 = ((wu8) q12).getInt(3);
                                                                f13 = f23;
                                                                k2 = f22;
                                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                                dVar3 = dVar4;
                                                                f13 = f23;
                                                                k2 = f22;
                                                                f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                            }
                                                        } else {
                                                            dVar3 = dVar4;
                                                            f15 = f14;
                                                            k2 = f22;
                                                            f13 = k2;
                                                        }
                                                        furVar2.C0 = Math.round(ftk0Var.a.b(k2));
                                                        furVar2.E0 = Math.round(ftk0Var.a.b(f14));
                                                        furVar2.D0 = Math.round(ftk0Var.a.b(f13));
                                                        furVar2.F0 = Math.round(ftk0Var.a.b(f15));
                                                        obj2 = obj;
                                                        obj = obj2;
                                                        it13 = it4;
                                                        str = str4;
                                                        dVar4 = dVar3;
                                                        str11 = str5;
                                                    }
                                                }
                                                k2 = q12.k();
                                                dVar3 = dVar4;
                                                f13 = k2;
                                                f14 = f13;
                                                f15 = f14;
                                                furVar2.C0 = Math.round(ftk0Var.a.b(k2));
                                                furVar2.E0 = Math.round(ftk0Var.a.b(f14));
                                                furVar2.D0 = Math.round(ftk0Var.a.b(f13));
                                                furVar2.F0 = Math.round(ftk0Var.a.b(f15));
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case 6:
                                                str4 = str;
                                                str5 = str11;
                                                yu8 q13 = bv8Var8.q(next7);
                                                if (q13 instanceof wu8) {
                                                    wu8 wu8Var15 = (wu8) q13;
                                                    if (wu8Var15.f.size() > 1) {
                                                        Float valueOf4 = Float.valueOf(wu8Var15.getFloat(0));
                                                        valueOf2 = Float.valueOf(wu8Var15.getFloat(1));
                                                        f17 = wu8Var15.f.size() > 2 ? Float.valueOf(wu8Var15.getFloat(2)) : valueOf3;
                                                        f16 = valueOf4;
                                                        furVar2.i = valueOf2.floatValue();
                                                        if (f16.floatValue() != 0.5f) {
                                                            furVar2.I0 = f16.floatValue();
                                                        }
                                                        if (f17.floatValue() != 0.5f) {
                                                            furVar2.J0 = f17.floatValue();
                                                        }
                                                        dVar3 = dVar4;
                                                        obj2 = obj;
                                                        obj = obj2;
                                                        it13 = it4;
                                                        str = str4;
                                                        dVar4 = dVar3;
                                                        str11 = str5;
                                                    }
                                                }
                                                valueOf2 = Float.valueOf(q13.j());
                                                f16 = valueOf3;
                                                f17 = f16;
                                                furVar2.i = valueOf2.floatValue();
                                                if (f16.floatValue() != 0.5f) {
                                                }
                                                if (f17.floatValue() != 0.5f) {
                                                }
                                                dVar3 = dVar4;
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case 7:
                                                yu8 q14 = bv8Var8.q(next7);
                                                if (q14 instanceof wu8) {
                                                    wu8 wu8Var16 = (wu8) q14;
                                                    str4 = str;
                                                    yu8Var = q14;
                                                    if (wu8Var16.f.size() >= 1) {
                                                        int i21 = 0;
                                                        while (i21 < wu8Var16.f.size()) {
                                                            yu8 p5 = wu8Var16.p(i21);
                                                            int i22 = i21;
                                                            if (p5 instanceof wu8) {
                                                                wu8 wu8Var17 = (wu8) p5;
                                                                if (wu8Var17.f.size() > 0) {
                                                                    String i23 = wu8Var17.p(0).i();
                                                                    str10 = str11;
                                                                    int size2 = wu8Var17.f.size();
                                                                    wu8Var = wu8Var16;
                                                                    if (size2 == 2) {
                                                                        f18 = wu8Var17.getFloat(1);
                                                                        f19 = Float.NaN;
                                                                    } else if (size2 != 3) {
                                                                        if (size2 != 4) {
                                                                            f19 = Float.NaN;
                                                                            f18 = Float.NaN;
                                                                            f20 = Float.NaN;
                                                                        } else {
                                                                            float f24 = wu8Var17.getFloat(1);
                                                                            f19 = ftk0Var.a.b(wu8Var17.getFloat(2));
                                                                            f20 = ftk0Var.a.b(wu8Var17.getFloat(3));
                                                                            f18 = f24;
                                                                        }
                                                                        furVar2.q(i23);
                                                                        if (!Float.isNaN(f18)) {
                                                                            if (furVar2.o0 == null) {
                                                                                furVar2.o0 = new HashMap<>();
                                                                            }
                                                                            furVar2.o0.put(i23, Float.valueOf(f18));
                                                                        }
                                                                        if (!Float.isNaN(f19)) {
                                                                            if (furVar2.p0 == null) {
                                                                                furVar2.p0 = new HashMap<>();
                                                                            }
                                                                            furVar2.p0.put(i23, Float.valueOf(f19));
                                                                        }
                                                                        if (!Float.isNaN(f20)) {
                                                                            if (furVar2.q0 == null) {
                                                                                furVar2.q0 = new HashMap<>();
                                                                            }
                                                                            furVar2.q0.put(i23, Float.valueOf(f20));
                                                                        }
                                                                    } else {
                                                                        f18 = wu8Var17.getFloat(1);
                                                                        f19 = ftk0Var.a.b(wu8Var17.getFloat(2));
                                                                    }
                                                                    f20 = f19;
                                                                    furVar2.q(i23);
                                                                    if (!Float.isNaN(f18)) {
                                                                    }
                                                                    if (!Float.isNaN(f19)) {
                                                                    }
                                                                    if (!Float.isNaN(f20)) {
                                                                    }
                                                                } else {
                                                                    str10 = str11;
                                                                    wu8Var = wu8Var16;
                                                                }
                                                            } else {
                                                                str10 = str11;
                                                                wu8Var = wu8Var16;
                                                                furVar2.q(p5.i());
                                                            }
                                                            i21 = i22 + 1;
                                                            str11 = str10;
                                                            wu8Var16 = wu8Var;
                                                        }
                                                        str5 = str11;
                                                        dVar3 = dVar4;
                                                        obj2 = obj;
                                                        obj = obj2;
                                                        it13 = it4;
                                                        str = str4;
                                                        dVar4 = dVar3;
                                                        str11 = str5;
                                                    }
                                                } else {
                                                    yu8Var = q14;
                                                }
                                                PrintStream printStream2 = System.err;
                                                StringBuilder b10 = ho8.b(next, " contains should be an array \"");
                                                b10.append(yu8Var.i());
                                                b10.append("\"");
                                                printStream2.println(b10.toString());
                                                break;
                                            case '\b':
                                                furVar2.G0 = bv8Var8.q(next7).k();
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case '\t':
                                                furVar2.B0 = bv8Var8.q(next7).k();
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case '\n':
                                                if (bv8Var8.q(next7).i().equals(str11)) {
                                                    furVar2.H0 = 0;
                                                } else {
                                                    furVar2.H0 = 1;
                                                }
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case 11:
                                                furVar2.A0 = bv8Var8.q(next7).k();
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            case '\f':
                                                String i24 = bv8Var8.q(next7).i();
                                                furVar2.r0 = State.Wrap.valueMap.containsKey(i24) ? State.Wrap.valueMap.get(i24).intValue() : -1;
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                            default:
                                                androidx.constraintlayout.core.state.b.a(ftk0Var.b(next), dVar4, ftk0Var, next7, bv8Var8);
                                                dVar3 = dVar4;
                                                str4 = str;
                                                str5 = str11;
                                                obj2 = obj;
                                                obj = obj2;
                                                it13 = it4;
                                                str = str4;
                                                dVar4 = dVar3;
                                                str11 = str5;
                                        }
                                        dVar = dVar4;
                                        break;
                                    }
                                    dVar = dVar4;
                                    break;
                                case '\t':
                                    androidx.constraintlayout.core.state.b.f(0, ftk0Var, next, bv8Var8);
                                    continue;
                            }
                            dVar4 = dVar;
                            break;
                        } else {
                            bv8Var = bv8Var4;
                            it = it5;
                            androidx.constraintlayout.core.state.b.g(ftk0Var, dVar4, next, bv8Var8);
                            break;
                        }
                    } else {
                        bv8Var = bv8Var4;
                        it = it5;
                        if (q2 instanceof av8) {
                            dVar4.a.put(next, Integer.valueOf(q2.k()));
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
            }
            bv8Var4 = bv8Var;
            it5 = it;
        }
    }

    public final bv8 b(spy spyVar) {
        String obj = spyVar.a().toString();
        bv8 bv8Var = this.a;
        yu8 t = bv8Var.t(obj);
        if ((t instanceof bv8 ? (bv8) t : null) == null) {
            bv8Var.z(obj, new bv8(new char[0]));
        }
        yu8 q = bv8Var.q(obj);
        if (q instanceof bv8) {
            return (bv8) q;
        }
        StringBuilder a2 = t33.a("no object found for key <", obj, ">, found [");
        a2.append(q.l());
        a2.append("] : ");
        a2.append(q);
        throw new CLParsingException(a2.toString(), bv8Var);
    }

    public final void c(s5j s5jVar, izs izsVar) {
        izsVar.invoke(new q5j(s5jVar.b, b(s5jVar)));
    }

    public final a d(float f) {
        int i = this.d;
        this.d = i + 1;
        Integer valueOf = Integer.valueOf(i);
        tpy tpyVar = new tpy(valueOf);
        bv8 b2 = b(tpyVar);
        b2.B("type", "hGuideline");
        b2.A(f, TtmlNode.END);
        h(9);
        h(Float.hashCode(f));
        return new a(valueOf, 0, tpyVar);
    }

    public final b e(float f) {
        int i = this.d;
        this.d = i + 1;
        Integer valueOf = Integer.valueOf(i);
        tpy tpyVar = new tpy(valueOf);
        bv8 b2 = b(tpyVar);
        b2.B("type", "vGuideline");
        b2.A(f, TtmlNode.END);
        h(5);
        h(Float.hashCode(f));
        return new b(valueOf, 0, tpyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5j)) {
            return false;
        }
        return epx.f(this.a, ((y5j) obj).a);
    }

    public final b f(float f) {
        int i = this.d;
        this.d = i + 1;
        Integer valueOf = Integer.valueOf(i);
        tpy tpyVar = new tpy(valueOf);
        bv8 b2 = b(tpyVar);
        b2.B("type", "vGuideline");
        b2.A(f, "start");
        h(1);
        h(Float.hashCode(f));
        return new b(valueOf, 0, tpyVar);
    }

    public final a g(float f) {
        int i = this.d;
        this.d = i + 1;
        Integer valueOf = Integer.valueOf(i);
        tpy tpyVar = new tpy(valueOf);
        bv8 b2 = b(tpyVar);
        b2.B("type", "hGuideline");
        b2.A(f, "start");
        h(7);
        h(Float.hashCode(f));
        return new a(valueOf, 0, tpyVar);
    }

    public final void h(int i) {
        this.b = ((this.b * 1009) + i) % 1000000007;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public y5j() {
        this(null);
    }
}

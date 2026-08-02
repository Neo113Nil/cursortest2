package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import com.adjust.sdk.Constants;
import defpackage.al31;
import defpackage.ar7;
import defpackage.bh11;
import defpackage.br7;
import defpackage.cg10;
import defpackage.cjw0;
import defpackage.cl31;
import defpackage.d6z;
import defpackage.d7g0;
import defpackage.dl31;
import defpackage.dnw0;
import defpackage.dyq0;
import defpackage.el11;
import defpackage.el31;
import defpackage.enw0;
import defpackage.euy;
import defpackage.eyq0;
import defpackage.g84;
import defpackage.geb1;
import defpackage.gl7;
import defpackage.gq60;
import defpackage.gyq0;
import defpackage.i94;
import defpackage.icv;
import defpackage.is7;
import defpackage.j4n;
import defpackage.j94;
import defpackage.jx81;
import defpackage.k74;
import defpackage.kgg0;
import defpackage.ll31;
import defpackage.lm31;
import defpackage.lru0;
import defpackage.lw01;
import defpackage.lzn;
import defpackage.m74;
import defpackage.mxw0;
import defpackage.ni91;
import defpackage.ny61;
import defpackage.o84;
import defpackage.oe7;
import defpackage.p8v;
import defpackage.pgg0;
import defpackage.q64;
import defpackage.q8n;
import defpackage.qgg0;
import defpackage.qo31;
import defpackage.qp7;
import defpackage.r38;
import defpackage.rl31;
import defpackage.sgb1;
import defpackage.sl31;
import defpackage.szd;
import defpackage.t601;
import defpackage.t8n;
import defpackage.tis0;
import defpackage.tob1;
import defpackage.u84;
import defpackage.ug70;
import defpackage.ul31;
import defpackage.unr0;
import defpackage.vbj;
import defpackage.vjs0;
import defpackage.w84;
import defpackage.wi21;
import defpackage.xi21;
import defpackage.xnw0;
import defpackage.yk31;
import defpackage.yp7;
import defpackage.yy40;
import defpackage.z74;
import defpackage.zi21;
import defpackage.znw0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes10.dex */
public final class i extends androidx.camera.core.j {
    public static final cl31 F = new cl31();
    public boolean A;
    public dl31 B;
    public eyq0 C;
    public final Map D;
    public final is7 E;
    public DeferrableSurface q;
    public enw0 r;
    public a s;
    public dyq0 t;
    public gl7 u;
    public znw0 v;
    public VideoOutput$SourceState w;
    public cjw0 x;
    public Rect y;
    public int z;

    public i(el31 el31Var) {
        super(el31Var);
        this.s = a.d;
        this.t = new dyq0();
        this.u = null;
        this.w = VideoOutput$SourceState.INACTIVE;
        this.A = false;
        this.D = Collections.EMPTY_MAP;
        this.E = new is7(3, this);
    }

    public static void H(HashSet hashSet, int i, int i2, Size size, rl31 rl31Var) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) rl31Var.N3(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException unused) {
            sgb1.g(5, "VideoCapture");
        }
        try {
            hashSet.add(new Size(((Integer) rl31Var.B0(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException unused2) {
            sgb1.g(5, "VideoCapture");
        }
    }

    public static int I(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static rl31 Q(k74 k74Var, q8n q8nVar, qo31 qo31Var) {
        rl31 a = sl31.a(ll31.c(k74Var, q8nVar, qo31Var).a);
        if (a != null) {
            return ul31.a(a, qo31Var != null ? qo31Var.f().j() : null);
        }
        sgb1.g(5, "VideoCapture");
        return null;
    }

    @Override // androidx.camera.core.j
    public final lru0 A(lru0 lru0Var, lru0 lru0Var2) {
        Objects.toString(lru0Var);
        Objects.toString(lru0Var2);
        sgb1.g(3, "VideoCapture");
        List list = (List) ((el31) this.h).g(icv.z2, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(lru0Var.f())) {
            Objects.toString(lru0Var.f());
            arrayList.toString();
            sgb1.g(5, "VideoCapture");
        }
        return lru0Var;
    }

    @Override // androidx.camera.core.j
    public final void E(Rect rect) {
        this.k = rect;
        R();
    }

    public final void J(dyq0 dyq0Var, a aVar, lru0 lru0Var) {
        DeferrableSurface deferrableSurface;
        boolean z = aVar.a == -1;
        boolean z2 = aVar.b == StreamInfo$StreamState.ACTIVE;
        if (z && z2) {
            ny61.r("Unexpected stream state, stream is error but active");
            return;
        }
        dyq0Var.a.clear();
        dyq0Var.b.a.clear();
        q8n b = lru0Var.b();
        if (!z && (deferrableSurface = this.q) != null) {
            if (z2) {
                dyq0Var.c(deferrableSurface, b, -1);
            } else {
                g84 a = gyq0.a(deferrableSurface);
                if (b == null) {
                    ny61.t("Null dynamicRange");
                    return;
                } else {
                    a.f = b;
                    dyq0Var.a.add(a.a());
                }
            }
        }
        gl7 gl7Var = this.u;
        if (gl7Var != null && gl7Var.cancel(false)) {
            sgb1.g(3, "VideoCapture");
        }
        gl7 r = jx81.r(new el11(this, dyq0Var));
        this.u = r;
        ni91.a(r, new tis0(this, r, z2), geb1.f());
    }

    public final void K() {
        tob1.b();
        eyq0 eyq0Var = this.C;
        if (eyq0Var != null) {
            eyq0Var.b();
            this.C = null;
        }
        DeferrableSurface deferrableSurface = this.q;
        if (deferrableSurface != null) {
            deferrableSurface.a();
            this.q = null;
        }
        cjw0 cjw0Var = this.x;
        if (cjw0Var != null) {
            cjw0Var.A();
            this.x = null;
        }
        enw0 enw0Var = this.r;
        if (enw0Var != null) {
            enw0Var.c();
            this.r = null;
        }
        this.y = null;
        this.v = null;
        this.s = a.d;
        this.z = 0;
        this.A = false;
    }

    public final dyq0 L(el31 el31Var, lru0 lru0Var) {
        Object obj;
        br7 br7Var;
        int i;
        int i2;
        Rect rect;
        Size size;
        cjw0 cjw0Var;
        el31 el31Var2;
        i iVar = this;
        tob1.b();
        br7 e = iVar.e();
        e.getClass();
        Size f = lru0Var.f();
        bh11 bh11Var = new bh11(21, iVar);
        Range c = lru0Var.c();
        if (Objects.equals(c, lru0.a)) {
            c = lru0Var.g() == 1 ? cl31.c : cl31.b;
        }
        Range range = c;
        euy c2 = iVar.N().c().c();
        if (c2.isDone()) {
            try {
                obj = c2.get();
            } catch (InterruptedException | ExecutionException e2) {
                ny61.o(e2);
                return null;
            }
        } else {
            obj = null;
        }
        k74 k74Var = (k74) obj;
        Objects.requireNonNull(k74Var);
        int g = lru0Var.g();
        yk31 f2 = iVar.N().f(e.c(), g);
        q8n b = lru0Var.b();
        qo31 d = f2.d(f, b);
        Objects.requireNonNull((sl31) el31Var.f(el31.c));
        rl31 Q = Q(k74Var, b, d);
        iVar.z = iVar.M(e);
        Rect rect2 = iVar.k;
        if (rect2 == null) {
            rect2 = new Rect(0, 0, f.getWidth(), f.getHeight());
        }
        if (Q == null || Q.M1(rect2.width(), rect2.height())) {
            br7Var = e;
            i = g;
        } else {
            String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", lw01.h(rect2), Integer.valueOf(Q.Hc()), Integer.valueOf(Q.a8()), Q.q4(), Q.s5());
            sgb1.g(3, "VideoCapture");
            rl31 mxw0Var = (!(Q.q4().contains((Range) Integer.valueOf(rect2.width())) && Q.s5().contains((Range) Integer.valueOf(rect2.height()))) && Q.p6() && Q.s5().contains((Range) Integer.valueOf(rect2.width())) && Q.q4().contains((Range) Integer.valueOf(rect2.height()))) ? new mxw0(Q) : Q;
            int Hc = mxw0Var.Hc();
            int a8 = mxw0Var.a8();
            Range q4 = mxw0Var.q4();
            Range s5 = mxw0Var.s5();
            br7Var = e;
            int I = I(true, rect2.width(), Hc, q4);
            i = g;
            int I2 = I(false, rect2.width(), Hc, q4);
            int I3 = I(true, rect2.height(), a8, s5);
            int I4 = I(false, rect2.height(), a8, s5);
            HashSet hashSet = new HashSet();
            H(hashSet, I, I3, f, mxw0Var);
            H(hashSet, I, I4, f, mxw0Var);
            H(hashSet, I2, I3, f, mxw0Var);
            H(hashSet, I2, I4, f, mxw0Var);
            if (hashSet.isEmpty()) {
                sgb1.g(5, "VideoCapture");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                arrayList.toString();
                sgb1.g(3, "VideoCapture");
                Collections.sort(arrayList, new oe7(15, rect2));
                arrayList.toString();
                sgb1.g(3, "VideoCapture");
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect2.width() && height == rect2.height()) {
                    sgb1.g(3, "VideoCapture");
                } else {
                    d6z.y(null, width % 2 == 0 && height % 2 == 0 && width <= f.getWidth() && height <= f.getHeight());
                    Rect rect3 = new Rect(rect2);
                    if (width != rect2.width()) {
                        int max = Math.max(0, rect2.centerX() - (width / 2));
                        rect3.left = max;
                        int i3 = max + width;
                        rect3.right = i3;
                        if (i3 > f.getWidth()) {
                            int width2 = f.getWidth();
                            rect3.right = width2;
                            rect3.left = width2 - width;
                        }
                    }
                    if (height != rect2.height()) {
                        int max2 = Math.max(0, rect2.centerY() - (height / 2));
                        rect3.top = max2;
                        int i4 = max2 + height;
                        rect3.bottom = i4;
                        if (i4 > f.getHeight()) {
                            int height2 = f.getHeight();
                            rect3.bottom = height2;
                            rect3.top = height2 - height;
                        }
                    }
                    lw01.h(rect2);
                    lw01.h(rect3);
                    sgb1.g(3, "VideoCapture");
                    rect2 = rect3;
                }
            }
        }
        int i5 = iVar.z;
        xnw0 xnw0Var = iVar.s.c;
        if (xnw0Var != null) {
            xnw0Var.getClass();
            Size i6 = lw01.i(i5, lw01.g(((w84) xnw0Var).a));
            i2 = 0;
            rect = new Rect(0, 0, i6.getWidth(), i6.getHeight());
        } else {
            i2 = 0;
            rect = rect2;
        }
        iVar.y = rect;
        if (iVar.s.c == null || rect.equals(rect2)) {
            size = f;
        } else {
            float height3 = rect.height() / rect2.height();
            size = new Size((int) Math.ceil(f.getWidth() * height3), (int) Math.ceil(f.getHeight() * height3));
        }
        if (iVar.s.c != null) {
            iVar.A = true;
        }
        Rect rect4 = iVar.y;
        int i7 = iVar.z;
        br7 br7Var2 = br7Var;
        int i8 = i;
        boolean O = iVar.O(br7Var2, el31Var, i8, rect4, f, b);
        if (((SizeCannotEncodeVideoQuirk) vbj.a.b(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!O) {
                i7 = i2;
            }
            Size i9 = lw01.i(i7, lw01.g(rect4));
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(i9)) {
                int a82 = Q != null ? Q.a8() / 2 : 8;
                Rect rect5 = new Rect(rect4);
                if (rect4.width() == i9.getHeight()) {
                    rect5.left += a82;
                    rect5.right -= a82;
                } else {
                    rect5.top += a82;
                    rect5.bottom -= a82;
                }
                rect4 = rect5;
            }
        }
        iVar.y = rect4;
        if (iVar.O(br7Var2, el31Var, i8, rect4, f, b)) {
            sgb1.g(3, "VideoCapture");
            br7 e3 = iVar.e();
            Objects.requireNonNull(e3);
            cjw0Var = new cjw0(e3, new DefaultSurfaceProcessor(b));
        } else {
            cjw0Var = null;
        }
        iVar.x = cjw0Var;
        boolean z = (br7Var2.q() && iVar.x == null) ? false : true;
        Timebase w = (iVar.x == null && br7Var2.q()) ? Timebase.UPTIME : br7Var2.f().w();
        Objects.toString(br7Var2.f().w());
        Objects.toString(w);
        sgb1.g(3, "VideoCapture");
        j4n i10 = lru0Var.i();
        if (size == null) {
            ny61.t("Null resolution");
            return null;
        }
        i10.a = size;
        if (range == null) {
            ny61.t("Null expectedFrameRateRange");
            return null;
        }
        i10.y = range;
        o84 k = i10.k();
        d6z.y(null, iVar.r == null);
        enw0 enw0Var = new enw0(2, 34, k, iVar.l, br7Var2.q(), iVar.y, iVar.z, iVar.c(), br7Var2.q() && iVar.p(br7Var2));
        iVar.r = enw0Var;
        enw0Var.a(bh11Var);
        cjw0 cjw0Var2 = iVar.x;
        enw0 enw0Var2 = iVar.r;
        if (cjw0Var2 != null) {
            int i11 = enw0Var2.f;
            int i12 = enw0Var2.a;
            Rect rect6 = enw0Var2.d;
            m74 m74Var = new m74(UUID.randomUUID(), i11, i12, rect6, lw01.i(enw0Var2.i, lw01.g(rect6)), enw0Var2.i, enw0Var2.e);
            enw0 enw0Var3 = iVar.x.C(new u84(iVar.r, Collections.singletonList(m74Var))).get(m74Var);
            Objects.requireNonNull(enw0Var3);
            cg10 cg10Var = new cg10(this, enw0Var3, br7Var2, el31Var, w, z, 1);
            iVar = this;
            el31Var2 = el31Var;
            enw0Var3.a(cg10Var);
            iVar.v = enw0Var3.d(br7Var2, true);
            enw0 enw0Var4 = iVar.r;
            enw0Var4.getClass();
            tob1.b();
            enw0Var4.b();
            d6z.y("Consumer can only be linked once.", !enw0Var4.j);
            enw0Var4.j = true;
            dnw0 dnw0Var = enw0Var4.l;
            iVar.q = dnw0Var;
            ni91.g(dnw0Var.e).c(new t601(22, iVar, dnw0Var), geb1.f());
        } else {
            el31Var2 = el31Var;
            znw0 d2 = enw0Var2.d(br7Var2, true);
            iVar.v = d2;
            iVar.q = d2.m;
        }
        lm31 lm31Var = (lm31) el31Var2.f(el31.b);
        Objects.requireNonNull(lm31Var);
        lm31Var.b(iVar.v, w, z);
        iVar.R();
        iVar.q.j = MediaCodec.class;
        dyq0 e4 = dyq0.e(el31Var2, lru0Var.f());
        e4.h = i8;
        iVar.a(e4, lru0Var);
        int l = el31Var2.l();
        if (l != 0) {
            r38 r38Var = e4.b;
            r38Var.getClass();
            if (l != 0) {
                r38Var.b.w(xi21.w4, Integer.valueOf(l));
            }
        }
        eyq0 eyq0Var = iVar.C;
        if (eyq0Var != null) {
            eyq0Var.b();
        }
        eyq0 eyq0Var2 = new eyq0(new p8v(4, iVar));
        iVar.C = eyq0Var2;
        e4.f = eyq0Var2;
        if (lru0Var.d() != null) {
            e4.b(lru0Var.d());
        }
        return e4;
    }

    public final int M(br7 br7Var) {
        boolean p = p(br7Var);
        int j = j(br7Var, p);
        xnw0 xnw0Var = this.s.c;
        if (xnw0Var == null) {
            return j;
        }
        Objects.requireNonNull(xnw0Var);
        w84 w84Var = (w84) xnw0Var;
        int i = w84Var.b;
        if (p != w84Var.f) {
            i = -i;
        }
        return lw01.k(j - i);
    }

    public final lm31 N() {
        lm31 lm31Var = (lm31) ((el31) this.h).f(el31.b);
        Objects.requireNonNull(lm31Var);
        return lm31Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r5 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r5.booleanValue() != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O(br7 br7Var, el31 el31Var, int i, Rect rect, Size size, q8n q8nVar) {
        if (i == 1) {
            return false;
        }
        if (br7Var.q()) {
            Boolean bool = (Boolean) el31Var.g(el31.w, Boolean.FALSE);
            Objects.requireNonNull(bool);
        }
        if (!br7Var.q() || (!SurfaceProcessingQuirk.a(vbj.a) && !SurfaceProcessingQuirk.a(br7Var.f().q()))) {
            HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) vbj.a.b(HdrRepeatingRequestFailureQuirk.class);
            if (br7Var.q() && hdrRepeatingRequestFailureQuirk != null) {
                boolean z = q8nVar != q8n.d;
                if (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
                    if ("pa3q".equalsIgnoreCase(Build.DEVICE)) {
                    }
                }
            }
            if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
                return (br7Var.q() && p(br7Var)) || this.s.c != null;
            }
        }
        return true;
    }

    public final void P() {
        if (e() == null) {
            return;
        }
        K();
        el31 el31Var = (el31) this.h;
        lru0 lru0Var = this.i;
        lru0Var.getClass();
        dyq0 L = L(el31Var, lru0Var);
        this.t = L;
        J(L, this.s, this.i);
        Object[] objArr = {this.t.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        s();
    }

    public final void R() {
        br7 e = e();
        enw0 enw0Var = this.r;
        if (e == null || enw0Var == null) {
            return;
        }
        int M = M(e);
        this.z = M;
        tob1.g(new yp7(enw0Var, M, c(), 2));
    }

    @Override // androidx.camera.core.j
    public final xi21 h(boolean z, zi21 zi21Var) {
        F.getClass();
        el31 el31Var = cl31.a;
        szd a = zi21Var.a(el31Var.y(), 1);
        if (z) {
            a = szd.q(a, el31Var);
        }
        if (a == null) {
            return null;
        }
        return new el31(ug70.a(((al31) o(a)).a));
    }

    @Override // androidx.camera.core.j
    public final Set l(ar7 ar7Var) {
        return N().f(ar7Var, 0).b();
    }

    @Override // androidx.camera.core.j
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // androidx.camera.core.j
    public final wi21 o(szd szdVar) {
        return new al31(yy40.p(szdVar));
    }

    public final String toString() {
        return "VideoCapture:".concat(i());
    }

    @Override // androidx.camera.core.j
    public final xi21 w(ar7 ar7Var, wi21 wi21Var) {
        Object obj;
        qgg0 qgg0Var;
        k74 k74Var;
        ArrayList<kgg0> arrayList;
        LinkedHashMap linkedHashMap;
        qo31 d;
        k74 k74Var2;
        rl31 rl31Var;
        HashMap hashMap;
        Iterator it;
        Map.Entry entry;
        euy c = N().c().c();
        if (c.isDone()) {
            try {
                obj = c.get();
            } catch (InterruptedException | ExecutionException e) {
                ny61.o(e);
                return null;
            }
        } else {
            obj = null;
        }
        k74 k74Var3 = (k74) obj;
        if (k74Var3 == null) {
            ny61.g("MediaSpec can't be null");
            return null;
        }
        i94 i94Var = k74Var3.a;
        qgg0 qgg0Var2 = i94Var.a;
        el31 el31Var = (el31) wi21Var.e();
        if (el31Var.d(icv.z2)) {
            d6z.m("Custom ordered resolutions and QualitySelector can't both be set", qgg0Var2 == i94.f);
        } else {
            q8n o = el31Var.o();
            int intValue = ((Integer) el31Var.g(xi21.o4, 0)).intValue();
            Range range = (Range) el31Var.g(xi21.p4, lru0.a);
            Objects.requireNonNull(range);
            yk31 f = N().f(ar7Var, intValue);
            o.toString();
            range.toString();
            sgb1.g(3, "VideoCapture");
            ArrayList a = f.a(o);
            Objects.toString(a);
            sgb1.g(3, "VideoCapture");
            if (a.isEmpty() && intValue == 1) {
                ny61.g("No supported quality on the device for high-speed capture.");
                return null;
            }
            if (a.isEmpty()) {
                sgb1.g(5, "VideoCapture");
            } else {
                qgg0Var2.getClass();
                if (a.isEmpty()) {
                    sgb1.g(5, "QualitySelector");
                    arrayList = new ArrayList();
                    k74Var = k74Var3;
                    qgg0Var = qgg0Var2;
                } else {
                    a.toString();
                    sgb1.g(3, "QualitySelector");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = qgg0Var2.a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        kgg0 kgg0Var = (kgg0) it2.next();
                        if (kgg0Var == kgg0.f) {
                            linkedHashSet.addAll(a);
                            break;
                        }
                        if (kgg0Var == kgg0.e) {
                            ArrayList arrayList2 = new ArrayList(a);
                            Collections.reverse(arrayList2);
                            linkedHashSet.addAll(arrayList2);
                            break;
                        }
                        if (a.contains(kgg0Var)) {
                            linkedHashSet.add(kgg0Var);
                        } else {
                            Objects.toString(kgg0Var);
                            sgb1.g(5, "QualitySelector");
                        }
                    }
                    q64 q64Var = qgg0Var2.b;
                    if (!a.isEmpty() && !linkedHashSet.containsAll(a)) {
                        Objects.toString(q64Var);
                        sgb1.g(3, "QualitySelector");
                        if (q64Var != q64.c) {
                            d6z.y("Currently only support type RuleStrategy", Objects.nonNull(q64Var));
                            ArrayList arrayList3 = new ArrayList(kgg0.i);
                            kgg0 kgg0Var2 = q64Var.a;
                            qgg0Var = qgg0Var2;
                            if (kgg0Var2 == kgg0.f) {
                                kgg0Var2 = (kgg0) arrayList3.get(0);
                            } else if (kgg0Var2 == kgg0.e) {
                                kgg0Var2 = (kgg0) unr0.k(1, arrayList3);
                            }
                            int indexOf = arrayList3.indexOf(kgg0Var2);
                            kgg0 kgg0Var3 = kgg0Var2;
                            d6z.y(null, indexOf != -1);
                            ArrayList arrayList4 = new ArrayList();
                            int i = indexOf - 1;
                            while (i >= 0) {
                                int i2 = i;
                                kgg0 kgg0Var4 = (kgg0) arrayList3.get(i);
                                if (a.contains(kgg0Var4)) {
                                    arrayList4.add(kgg0Var4);
                                }
                                i = i2 - 1;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            k74Var = k74Var3;
                            for (int i3 = indexOf + 1; i3 < arrayList3.size(); i3++) {
                                kgg0 kgg0Var5 = (kgg0) arrayList3.get(i3);
                                if (a.contains(kgg0Var5)) {
                                    arrayList5.add(kgg0Var5);
                                }
                            }
                            arrayList3.toString();
                            Objects.toString(kgg0Var3);
                            arrayList4.toString();
                            arrayList5.toString();
                            sgb1.g(3, "QualitySelector");
                            int i4 = q64Var.b;
                            if (i4 != 0) {
                                if (i4 == 1) {
                                    linkedHashSet.addAll(arrayList4);
                                    linkedHashSet.addAll(arrayList5);
                                } else if (i4 == 2) {
                                    linkedHashSet.addAll(arrayList4);
                                } else if (i4 == 3) {
                                    linkedHashSet.addAll(arrayList5);
                                    linkedHashSet.addAll(arrayList4);
                                } else {
                                    if (i4 != 4) {
                                        d7g0.j(q64Var, "Unhandled fallback strategy: ");
                                        return null;
                                    }
                                    linkedHashSet.addAll(arrayList5);
                                }
                            }
                            arrayList = new ArrayList(linkedHashSet);
                        }
                    }
                    k74Var = k74Var3;
                    qgg0Var = qgg0Var2;
                    arrayList = new ArrayList(linkedHashSet);
                }
                arrayList.toString();
                qgg0Var.toString();
                sgb1.g(3, "VideoCapture");
                if (arrayList.isEmpty()) {
                    ny61.g("Unable to find selected quality");
                    return null;
                }
                Objects.requireNonNull((sl31) el31Var.f(el31.c));
                int i5 = i94Var.d;
                HashMap hashMap2 = new HashMap();
                Iterator it3 = f.a(o).iterator();
                while (it3.hasNext()) {
                    kgg0 kgg0Var6 = (kgg0) it3.next();
                    qo31 c2 = f.c(kgg0Var6, o);
                    Objects.requireNonNull(c2);
                    hashMap2.put(kgg0Var6, c2.f().j());
                }
                pgg0 pgg0Var = new pgg0(intValue == 1 ? lru0.a.equals(range) ? ar7Var.z() : ar7Var.g(range) : ar7Var.r(this.h.getInputFormat()), hashMap2);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (kgg0 kgg0Var7 : arrayList) {
                    List list = (List) pgg0Var.a.get(new z74(kgg0Var7, i5));
                    linkedHashMap2.put(kgg0Var7, list != null ? new ArrayList(list) : new ArrayList(0));
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    linkedHashMap = new LinkedHashMap();
                    Iterator it4 = linkedHashMap2.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        ArrayList arrayList6 = new ArrayList((Collection) entry2.getValue());
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            Size size = (Size) it5.next();
                            if (!hashMap2.containsValue(size) && (d = f.d(size, o)) != null) {
                                if (o.b()) {
                                    k74Var2 = k74Var;
                                    rl31Var = Q(k74Var2, o, d);
                                } else {
                                    k74Var2 = k74Var;
                                    int i6 = Integer.MIN_VALUE;
                                    rl31 rl31Var2 = null;
                                    for (lzn lznVar : ((j94) d).d) {
                                        if (t8n.a(lznVar, o)) {
                                            hashMap = hashMap2;
                                            int f2 = lznVar.f();
                                            it = it4;
                                            HashMap hashMap3 = t8n.d;
                                            entry = entry2;
                                            d6z.n(hashMap3.containsKey(Integer.valueOf(f2)));
                                            Integer num = (Integer) hashMap3.get(Integer.valueOf(f2));
                                            Objects.requireNonNull(num);
                                            int intValue2 = num.intValue();
                                            int a2 = lznVar.a();
                                            HashMap hashMap4 = t8n.c;
                                            d6z.n(hashMap4.containsKey(Integer.valueOf(a2)));
                                            Integer num2 = (Integer) hashMap4.get(Integer.valueOf(a2));
                                            Objects.requireNonNull(num2);
                                            rl31 Q = Q(k74Var2, new q8n(intValue2, num2.intValue()), d);
                                            if (Q != null) {
                                                int intValue3 = ((Integer) Q.q4().getUpper()).intValue();
                                                int intValue4 = ((Integer) Q.s5().getUpper()).intValue();
                                                Size size2 = vjs0.a;
                                                int i7 = intValue3 * intValue4;
                                                if (i7 > i6) {
                                                    rl31Var2 = Q;
                                                    i6 = i7;
                                                }
                                            }
                                        } else {
                                            hashMap = hashMap2;
                                            it = it4;
                                            entry = entry2;
                                        }
                                        it4 = it;
                                        entry2 = entry;
                                        hashMap2 = hashMap;
                                    }
                                    rl31Var = rl31Var2;
                                }
                                HashMap hashMap5 = hashMap2;
                                Iterator it6 = it4;
                                Map.Entry entry3 = entry2;
                                if (rl31Var != null && !rl31Var.M1(size.getWidth(), size.getHeight())) {
                                    it5.remove();
                                }
                                it4 = it6;
                                entry2 = entry3;
                                k74Var = k74Var2;
                                hashMap2 = hashMap5;
                            }
                        }
                        HashMap hashMap6 = hashMap2;
                        Iterator it7 = it4;
                        Map.Entry entry4 = entry2;
                        k74 k74Var4 = k74Var;
                        if (!arrayList6.isEmpty()) {
                            linkedHashMap.put((kgg0) entry4.getKey(), arrayList6);
                        }
                        it4 = it7;
                        k74Var = k74Var4;
                        hashMap2 = hashMap6;
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it8 = linkedHashMap.values().iterator();
                while (it8.hasNext()) {
                    arrayList7.addAll((List) it8.next());
                }
                arrayList7.toString();
                sgb1.g(3, "VideoCapture");
                wi21Var.d().w(icv.z2, arrayList7);
            }
        }
        return wi21Var.e();
    }

    @Override // androidx.camera.core.j
    public final void x() {
        this.a = true;
        g();
        sgb1.g(3, "VideoCapture");
        lru0 lru0Var = this.i;
        if (lru0Var == null || this.v != null) {
            return;
        }
        gq60 d = N().d();
        Object obj = a.d;
        euy c = d.c();
        if (c.isDone()) {
            try {
                obj = c.get();
            } catch (InterruptedException | ExecutionException e) {
                ny61.o(e);
                return;
            }
        }
        this.s = (a) obj;
        dyq0 L = L((el31) this.h, lru0Var);
        this.t = L;
        J(L, this.s, lru0Var);
        Object[] objArr = {this.t.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        G(Collections.unmodifiableList(arrayList));
        r();
        N().d().b(geb1.f(), this.E);
        dl31 dl31Var = this.B;
        if (dl31Var != null) {
            dl31Var.b();
        }
        qp7 f = f();
        dl31 dl31Var2 = new dl31();
        dl31Var2.b = false;
        dl31Var2.a = f;
        this.B = dl31Var2;
        N().g().b(geb1.f(), this.B);
        VideoOutput$SourceState videoOutput$SourceState = VideoOutput$SourceState.ACTIVE_NON_STREAMING;
        if (videoOutput$SourceState != this.w) {
            this.w = videoOutput$SourceState;
            N().e(videoOutput$SourceState);
        }
    }

    @Override // androidx.camera.core.j
    public final void y() {
        sgb1.g(3, "VideoCapture");
        d6z.y("VideoCapture can only be detached on the main thread.", tob1.d());
        if (this.B != null) {
            N().g().a(this.B);
            this.B.b();
            this.B = null;
        }
        VideoOutput$SourceState videoOutput$SourceState = VideoOutput$SourceState.INACTIVE;
        if (videoOutput$SourceState != this.w) {
            this.w = videoOutput$SourceState;
            N().e(videoOutput$SourceState);
        }
        N().d().a(this.E);
        gl7 gl7Var = this.u;
        if (gl7Var != null && gl7Var.cancel(false)) {
            sgb1.g(3, "VideoCapture");
        }
        K();
    }

    @Override // androidx.camera.core.j
    public final o84 z(szd szdVar) {
        this.t.b.c(szdVar);
        Object[] objArr = {this.t.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        lru0 lru0Var = this.i;
        Objects.requireNonNull(lru0Var);
        j4n i = lru0Var.i();
        i.z = szdVar;
        return i.k();
    }
}

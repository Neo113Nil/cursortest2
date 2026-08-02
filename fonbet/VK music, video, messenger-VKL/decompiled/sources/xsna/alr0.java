package xsna;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import xsna.er9;

/* compiled from: Vector.kt */
/* loaded from: classes11.dex */
public final class alr0 extends gir0 {
    public final nju b;
    public String c;
    public boolean d;
    public final nho e;
    public gzs<s3q0> f;
    public final wh50 g;
    public oe7 h;
    public final wh50 i;
    public long j;
    public float k;
    public float l;
    public final b m;

    /* compiled from: Vector.kt */
    public static final class a extends Lambda implements izs<gir0, s3q0> {
        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(gir0 gir0Var) {
            alr0 alr0Var = alr0.this;
            alr0Var.d = true;
            alr0Var.f.invoke();
            return s3q0.a;
        }
    }

    /* compiled from: Vector.kt */
    public static final class b extends Lambda implements izs<oio, s3q0> {
        public b() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(oio oioVar) {
            oio oioVar2 = oioVar;
            alr0 alr0Var = alr0.this;
            nju njuVar = alr0Var.b;
            float f = alr0Var.k;
            float f2 = alr0Var.l;
            er9.b a0 = oioVar2.a0();
            long d = a0.d();
            a0.a().e();
            try {
                a0.a.i(0L, f, f2);
                njuVar.a(oioVar2);
                nq.b(a0, d);
                return s3q0.a;
            } catch (Throwable th) {
                nq.b(a0, d);
                throw th;
            }
        }
    }

    /* compiled from: Vector.kt */
    public static final class c extends Lambda implements gzs<s3q0> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    public alr0(nju njuVar) {
        this.b = njuVar;
        njuVar.i = new a();
        this.c = "";
        this.d = true;
        this.e = new nho();
        this.f = c.i;
        this.g = androidx.compose.runtime.k.b(null);
        this.i = androidx.compose.runtime.k.b(new mxj0(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new b();
    }

    @Override // xsna.gir0
    public final void a(oio oioVar) {
        e(oioVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r4 != (r9 == null ? r9.a() : 0)) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(oio oioVar, float f, d6g d6gVar) {
        int i;
        boolean z;
        nho nhoVar;
        oe7 oe7Var;
        aa2 aa2Var;
        d52 b2;
        ColorFilter porterDuffColorFilter;
        aa2 aa2Var2;
        int i2;
        int i3;
        d6g d6gVar2 = d6gVar;
        nju njuVar = this.b;
        boolean z2 = njuVar.d;
        wh50 wh50Var = this.g;
        if (z2 && njuVar.e != 16) {
            d6g d6gVar3 = (d6g) ((zak0) wh50Var).getValue();
            EmptyList emptyList = jlr0.a;
            if (!(d6gVar3 instanceof oe7) ? d6gVar3 == null : !((i3 = ((oe7) d6gVar3).c) != 5 && i3 != 3)) {
                if (!(d6gVar2 instanceof oe7) ? d6gVar2 == null : !((i2 = ((oe7) d6gVar2).c) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.d;
                    nhoVar = this.e;
                    if (!z && mxj0.b(this.j, oioVar.d())) {
                        aa2 aa2Var3 = nhoVar.a;
                    }
                    if (i != 1) {
                        long j = njuVar.e;
                        EmptyList emptyList2 = jlr0.a;
                        if (l5g.e(j) != 1.0f) {
                            j = l5g.c(14, j, 1.0f);
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                        }
                        oe7Var = new oe7(j, 5, porterDuffColorFilter);
                    } else {
                        oe7Var = null;
                    }
                    this.h = oe7Var;
                    float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32));
                    wh50 wh50Var2 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((mxj0) ((zak0) wh50Var2).getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((mxj0) ((zak0) wh50Var2).getValue()).a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (oioVar.d() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)))) & 4294967295L);
                    LayoutDirection layoutDirection = oioVar.getLayoutDirection();
                    nhoVar.c = oioVar;
                    aa2Var = nhoVar.a;
                    d52 d52Var = nhoVar.b;
                    if (aa2Var != null) {
                        Bitmap bitmap = aa2Var.a;
                        if (d52Var != null && ((int) (ceil >> 32)) <= bitmap.getWidth() && ((int) (ceil & 4294967295L)) <= bitmap.getHeight() && nhoVar.e == i) {
                            b2 = d52Var;
                            nhoVar.d = ceil;
                            er9 er9Var = nhoVar.f;
                            long w = pli.w(ceil);
                            er9.a aVar = er9Var.b;
                            azl azlVar = aVar.a;
                            LayoutDirection layoutDirection2 = aVar.b;
                            yq9 yq9Var = aVar.c;
                            long j2 = aVar.d;
                            aVar.a = oioVar;
                            aVar.b = layoutDirection;
                            aVar.c = b2;
                            aVar.d = w;
                            b2.e();
                            oio.P(er9Var, l5g.b, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 62);
                            this.m.invoke(er9Var);
                            b2.a();
                            er9.a aVar2 = er9Var.b;
                            aVar2.a = azlVar;
                            aVar2.b = layoutDirection2;
                            aVar2.c = yq9Var;
                            aVar2.d = j2;
                            aa2Var.b();
                            this.d = false;
                            this.j = oioVar.d();
                            if (d6gVar2 == null) {
                                d6gVar2 = ((d6g) ((zak0) wh50Var).getValue()) != null ? (d6g) ((zak0) wh50Var).getValue() : this.h;
                            }
                            d6g d6gVar4 = d6gVar2;
                            aa2Var2 = nhoVar.a;
                            if (aa2Var2 == null) {
                                uzw.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                            }
                            oio.B0(oioVar, aa2Var2, 0L, nhoVar.d, 0L, 0L, f, null, d6gVar4, 0, 0, 858);
                        }
                    }
                    aa2Var = q6x.n((int) (ceil >> 32), (int) (ceil & 4294967295L), i);
                    b2 = rte0.b(aa2Var);
                    nhoVar.a = aa2Var;
                    nhoVar.b = b2;
                    nhoVar.e = i;
                    nhoVar.d = ceil;
                    er9 er9Var2 = nhoVar.f;
                    long w2 = pli.w(ceil);
                    er9.a aVar3 = er9Var2.b;
                    azl azlVar2 = aVar3.a;
                    LayoutDirection layoutDirection22 = aVar3.b;
                    yq9 yq9Var2 = aVar3.c;
                    long j22 = aVar3.d;
                    aVar3.a = oioVar;
                    aVar3.b = layoutDirection;
                    aVar3.c = b2;
                    aVar3.d = w2;
                    b2.e();
                    oio.P(er9Var2, l5g.b, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 62);
                    this.m.invoke(er9Var2);
                    b2.a();
                    er9.a aVar22 = er9Var2.b;
                    aVar22.a = azlVar2;
                    aVar22.b = layoutDirection22;
                    aVar22.c = yq9Var2;
                    aVar22.d = j22;
                    aa2Var.b();
                    this.d = false;
                    this.j = oioVar.d();
                    if (d6gVar2 == null) {
                    }
                    d6g d6gVar42 = d6gVar2;
                    aa2Var2 = nhoVar.a;
                    if (aa2Var2 == null) {
                    }
                    oio.B0(oioVar, aa2Var2, 0L, nhoVar.d, 0L, 0L, f, null, d6gVar42, 0, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        nhoVar = this.e;
        if (!z) {
            aa2 aa2Var32 = nhoVar.a;
        }
        if (i != 1) {
        }
        this.h = oe7Var;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() >> 32));
        wh50 wh50Var22 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((mxj0) ((zak0) wh50Var22).getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((mxj0) ((zak0) wh50Var22).getValue()).a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (oioVar.d() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)))) & 4294967295L);
        LayoutDirection layoutDirection3 = oioVar.getLayoutDirection();
        nhoVar.c = oioVar;
        aa2Var = nhoVar.a;
        d52 d52Var2 = nhoVar.b;
        if (aa2Var != null) {
        }
        aa2Var = q6x.n((int) (ceil2 >> 32), (int) (ceil2 & 4294967295L), i);
        b2 = rte0.b(aa2Var);
        nhoVar.a = aa2Var;
        nhoVar.b = b2;
        nhoVar.e = i;
        nhoVar.d = ceil2;
        er9 er9Var22 = nhoVar.f;
        long w22 = pli.w(ceil2);
        er9.a aVar32 = er9Var22.b;
        azl azlVar22 = aVar32.a;
        LayoutDirection layoutDirection222 = aVar32.b;
        yq9 yq9Var22 = aVar32.c;
        long j222 = aVar32.d;
        aVar32.a = oioVar;
        aVar32.b = layoutDirection3;
        aVar32.c = b2;
        aVar32.d = w22;
        b2.e();
        oio.P(er9Var22, l5g.b, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 62);
        this.m.invoke(er9Var22);
        b2.a();
        er9.a aVar222 = er9Var22.b;
        aVar222.a = azlVar22;
        aVar222.b = layoutDirection222;
        aVar222.c = yq9Var22;
        aVar222.d = j222;
        aa2Var.b();
        this.d = false;
        this.j = oioVar.d();
        if (d6gVar2 == null) {
        }
        d6g d6gVar422 = d6gVar2;
        aa2Var2 = nhoVar.a;
        if (aa2Var2 == null) {
        }
        oio.B0(oioVar, aa2Var2, 0L, nhoVar.d, 0L, 0L, f, null, d6gVar422, 0, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        wh50 wh50Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((mxj0) ((zak0) wh50Var).getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((mxj0) ((zak0) wh50Var).getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}

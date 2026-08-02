package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.tasks.Task;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$VerificationType;
import core.divkit.view.DivViewLayout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes11.dex */
public final class o501 implements s501, afu0, ak51, ww01, h43, k43, f35, i67, al7, hn8, h3v0, av41, eul, d5p, g8p, pdr, fss, mht, kgj {
    public static final o501 b = new o501(0);
    public static final o501 c = new o501(1);
    public static final yf41 w = new yf41();
    public static final o501 x = new o501(3);
    public static final o501 y = new o501(4);
    public static final /* synthetic */ o501 z = new o501(5);
    public final /* synthetic */ int a;

    public /* synthetic */ o501(int i) {
        this.a = i;
    }

    public static u2h D(Uri uri, String str, String str2, String str3, Map map, Bitmap bitmap, int i) {
        Long m;
        Bitmap bitmap2 = (i & 64) != 0 ? null : bitmap;
        String str4 = (String) map.get("collapse_id");
        Object obj = map.get("expiration_interval");
        return new u2h(null, str, str2, uri, bitmap2, str3, str4, TimeUnit.SECONDS.toMillis(obj instanceof Number ? ((Number) obj).longValue() : (!(obj instanceof String) || (m = bvu0.m(10, (String) obj)) == null) ? 0L : m.longValue()));
    }

    public static String E(PaymentMethod$Type paymentMethod$Type) {
        String code;
        return (paymentMethod$Type == null || (code = paymentMethod$Type.getCode()) == null) ? "unknown" : code;
    }

    public static final CardType y(m831 m831Var) {
        int i = v32.e;
        if (!(m831Var instanceof k831)) {
            return null;
        }
        k831 k831Var = (k831) m831Var;
        String str = k831Var.d;
        if (str != null) {
            CardType.Companion.getClass();
            return mp8.b(str);
        }
        String str2 = k831Var.c;
        if (str2 == null) {
            return null;
        }
        CardType.Companion.getClass();
        return mp8.a(str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r1.equals("3ds") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$VerificationType.Standard23ds;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r1.equals("standard2_3ds") != false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PaymentMethodsAnalytics$VerificationType z(String str) {
        int i = v32.e;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -2034884136:
                    break;
                case 52226:
                    break;
                case 98915:
                    if (lowerCase.equals("cvv")) {
                        return PaymentMethodsAnalytics$VerificationType.Cvv;
                    }
                    break;
                case 1498683220:
                    if (lowerCase.equals("random_amount")) {
                        return PaymentMethodsAnalytics$VerificationType.RandomAmount;
                    }
                    break;
            }
        }
        return PaymentMethodsAnalytics$VerificationType.Standard23ds;
    }

    @Override // defpackage.d5p
    public void A() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.d5p
    public g001 B(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void C(yyn yynVar) {
        yynVar.a(dra1.class, x0a1.a);
        yynVar.a(c2b1.class, sda1.a);
        yynVar.a(jra1.class, b1a1.a);
        yynVar.a(jsa1.class, n1a1.a);
        yynVar.a(ora1.class, i1a1.a);
        yynVar.a(tra1.class, v1a1.a);
        yynVar.a(ika1.class, rw91.a);
        yynVar.a(bka1.class, jw91.a);
        yynVar.a(uoa1.class, jz91.a);
        yynVar.a(c1b1.class, aca1.a);
        yynVar.a(uja1.class, cw91.a);
        yynVar.a(nja1.class, wv91.a);
        yynVar.a(nua1.class, x4a1.a);
        yynVar.a(q5b1.class, ly91.a);
        yynVar.a(yna1.class, xy91.a);
        yynVar.a(fna1.class, gy91.a);
        yynVar.a(dva1.class, d5a1.a);
        yynVar.a(k0b1.class, iba1.a);
        yynVar.a(q0b1.class, oba1.a);
        yynVar.a(e0b1.class, bba1.a);
        yynVar.a(dta1.class, r3a1.a);
        yynVar.a(m5b1.class, qs91.a);
        yynVar.a(ita1.class, x3a1.a);
        yynVar.a(kva1.class, l5a1.a);
        yynVar.a(cwa1.class, d6a1.a);
        yynVar.a(xva1.class, w5a1.a);
        yynVar.a(qva1.class, s5a1.a);
        yynVar.a(exa1.class, n7a1.a);
        yynVar.a(kxa1.class, v7a1.a);
        yynVar.a(cya1.class, h8a1.a);
        yynVar.a(pxa1.class, b8a1.a);
        yynVar.a(ysa1.class, b3a1.a);
        yynVar.a(gya1.class, m8a1.a);
        yynVar.a(mya1.class, r8a1.a);
        yynVar.a(rya1.class, x8a1.a);
        yynVar.a(wya1.class, c9a1.a);
        yynVar.a(a0b1.class, paa1.a);
        yynVar.a(vza1.class, waa1.a);
        yynVar.a(zwa1.class, k6a1.a);
        yynVar.a(qpa1.class, m0a1.a);
        yynVar.a(nwa1.class, z6a1.a);
        yynVar.a(iwa1.class, r6a1.a);
        yynVar.a(twa1.class, f7a1.a);
        yynVar.a(v0b1.class, tba1.a);
        yynVar.a(w2b1.class, oea1.a);
        yynVar.a(yga1.class, qt91.a);
        yynVar.a(nga1.class, gt91.a);
        yynVar.a(gga1.class, bt91.a);
        yynVar.a(uga1.class, lt91.a);
        yynVar.a(jha1.class, cu91.a);
        yynVar.a(dha1.class, wt91.a);
        yynVar.a(qha1.class, iu91.a);
        yynVar.a(wha1.class, nu91.a);
        yynVar.a(cia1.class, tu91.a);
        yynVar.a(hia1.class, yu91.a);
        yynVar.a(mia1.class, cv91.a);
        yynVar.a(rm91.class, ur91.a);
        yynVar.a(an91.class, es91.a);
        yynVar.a(xm91.class, yr91.a);
        yynVar.a(epa1.class, a0a1.a);
        yynVar.a(nka1.class, hx91.a);
        yynVar.a(th91.class, kn91.a);
        yynVar.a(ph91.class, on91.a);
        yynVar.a(fla1.class, tx91.a);
        yynVar.a(ai91.class, sn91.a);
        yynVar.a(vh91.class, wn91.a);
        yynVar.a(sj91.class, so91.a);
        yynVar.a(kj91.class, yo91.a);
        yynVar.a(li91.class, ao91.a);
        yynVar.a(fi91.class, fo91.a);
        yynVar.a(bk91.class, dp91.a);
        yynVar.a(vj91.class, ip91.a);
        yynVar.a(lk91.class, lp91.a);
        yynVar.a(hk91.class, qp91.a);
        yynVar.a(mm91.class, jr91.a);
        yynVar.a(hm91.class, pr91.a);
        yynVar.a(sk91.class, tp91.a);
        yynVar.a(pk91.class, aq91.a);
        yynVar.a(bl91.class, fq91.a);
        yynVar.a(xk91.class, kq91.a);
        yynVar.a(r4b1.class, rca1.a);
        yynVar.a(m3b1.class, mx91.a);
        yynVar.a(e4b1.class, u2a1.a);
        yynVar.a(y3b1.class, o2a1.a);
        yynVar.a(r3b1.class, ry91.a);
        yynVar.a(m4b1.class, lca1.a);
        yynVar.a(i4b1.class, eca1.a);
        yynVar.a(u4b1.class, yca1.a);
        yynVar.a(u3b1.class, oz91.a);
        yynVar.a(g5b1.class, afa1.a);
        yynVar.a(c5b1.class, gfa1.a);
        yynVar.a(y4b1.class, uea1.a);
        yynVar.a(g1b1.class, eda1.a);
        yynVar.a(apa1.class, uz91.a);
        yynVar.a(wpa1.class, r0a1.a);
        yynVar.a(wfa1.class, vs91.a);
        yynVar.a(doa1.class, cz91.a);
        yynVar.a(kpa1.class, f0a1.a);
        yynVar.a(kla1.class, ay91.a);
        yynVar.a(ssa1.class, h2a1.a);
        yynVar.a(nsa1.class, a2a1.a);
        yynVar.a(jh91.class, gn91.a);
        yynVar.a(i2b1.class, yda1.a);
        yynVar.a(s2b1.class, hea1.a);
        yynVar.a(n2b1.class, dea1.a);
        yynVar.a(qfa1.class, js91.a);
        yynVar.a(hja1.class, sv91.a);
        yynVar.a(aja1.class, lv91.a);
        yynVar.a(tia1.class, iv91.a);
        yynVar.a(nta1.class, d4a1.a);
        yynVar.a(yta1.class, q4a1.a);
        yynVar.a(sta1.class, k4a1.a);
        yynVar.a(vi91.class, ko91.a);
        yynVar.a(ri91.class, no91.a);
        yynVar.a(bza1.class, j9a1.a);
        yynVar.a(qza1.class, kaa1.a);
        yynVar.a(gza1.class, p9a1.a);
        yynVar.a(lza1.class, x9a1.a);
        yynVar.a(sl91.class, qq91.a);
        yynVar.a(nl91.class, xq91.a);
        yynVar.a(p1b1.class, oda1.a);
        yynVar.a(k1b1.class, ida1.a);
    }

    @Override // defpackage.i67
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.h43, defpackage.k43
    public float b() {
        return 0.0f;
    }

    @Override // defpackage.eul
    public cul c(DivViewLayout divViewLayout) {
        return new cul(divViewLayout);
    }

    @Override // defpackage.ak51
    public void cleanup() {
    }

    @Override // defpackage.pdr
    public rdr d(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float d = ry01.d(f4, f6, f2, f3, f, true);
        float f8 = d / f4;
        float f9 = d / f6;
        return new rdr(f8, f9, d, f5 * f8, d, f7 * f9);
    }

    @Override // defpackage.f35
    public rkx e() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.g8p
    public i8p f(float f, float f2, float f3) {
        return new i8p(sy01.e(f2, f3, f, 255, 0), sy01.e(f2, f3, f, 0, 255), false);
    }

    @Override // defpackage.h3v0
    public Task g(Object obj) {
        return udq0.p(Boolean.TRUE);
    }

    @Override // defpackage.av41
    public String getUserAgent() {
        return null;
    }

    @Override // defpackage.pdr
    public boolean h(rdr rdrVar) {
        return rdrVar.d > rdrVar.f;
    }

    @Override // defpackage.hn8
    public boolean i() {
        return false;
    }

    @Override // defpackage.f35
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.ak51
    public void j(String str, String str2) {
    }

    @Override // defpackage.i67
    public Object k(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.f35
    public float l() {
        return 0.0f;
    }

    @Override // defpackage.k43
    public void m(fwi fwiVar, int i, int[] iArr, int[] iArr2) {
        lr20.c(i, iArr, iArr2, false);
    }

    @Override // defpackage.hn8
    public Object n(Continuation continuation) {
        return new Result.Failure(new UnsupportedOperationException("scanner is not available"));
    }

    @Override // defpackage.fss
    public void o(int i) {
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        rvj0 rvj0Var = kvj0Var.z;
        if (rvj0Var != null) {
            rvj0Var.close();
        }
    }

    @Override // defpackage.ak51
    public void p(pw91 pw91Var) {
    }

    @Override // defpackage.fss
    public void q(int i) {
    }

    @Override // defpackage.pdr
    public void r(RectF rectF, float f, rdr rdrVar) {
        rectF.bottom -= Math.abs(rdrVar.f - rdrVar.d) * f;
    }

    @Override // defpackage.f35
    public boolean s(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.f35
    public boolean t(float f) {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "Arrangement#SpaceAround";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.h43
    public void u(fwi fwiVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            lr20.c(i, iArr, iArr2, false);
        } else {
            lr20.c(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.fss
    public void v(int i) {
    }

    @Override // defpackage.d5p
    public void w(f7q0 f7q0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.f35
    public float x() {
        return 1.0f;
    }

    public /* synthetic */ o501(int i, int i2, int i3) {
        this.a = i3;
    }
}

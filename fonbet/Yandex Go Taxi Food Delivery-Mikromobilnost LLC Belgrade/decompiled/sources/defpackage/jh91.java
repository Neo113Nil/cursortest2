package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes11.dex */
public abstract class jh91 {
    public static final void a(f530 f530Var, p6o p6oVar, sls slsVar, tls tlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        f530 f530Var3;
        p6o p6oVar2 = p6oVar;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-58719571);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(p6oVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 f530Var4 = i4 != 0 ? c530Var : f530Var2;
            f530 k = f530Var4.k(ljs0.c);
            so5 so5Var = x4c.H;
            sic a = qic.a(lr20.c, so5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            int i5 = i3;
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 f530Var5 = f530Var4;
            crb1.c(null, wwg.S(-1253512824, true, new us4(5, slsVar), btsVar), null, wwg.S(-1974432246, true, new loj(14, p6oVar2), btsVar), null, null, null, btsVar, 3120, HProv.PP_NK_SYNC);
            x2y x2yVar = new x2y(1.0f, true);
            sic a2 = qic.a(lr20.e, so5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, x2yVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            p6oVar2 = p6oVar;
            o4b1.b(vfc.k(p6oVar.b, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 392, 56);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            jeb1.f(p6oVar2.c, null, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 0, 0, 16254);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            jeb1.f(p6oVar2.d, null, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 0, 0, 16254);
            btsVar.t(true);
            f530 k2 = an91.k(c530Var, 8.0f);
            boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (b || Q == o430Var) {
                Q = new jg0(15);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, k2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, z910Var);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            boolean z = ((i5 & 7168) == 2048) | ((i5 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                tlsVar2 = tlsVar;
                Q2 = new ymj(24, tlsVar2, p6oVar2);
                btsVar.o0(Q2);
            } else {
                tlsVar2 = tlsVar;
            }
            ohb1.b(null, false, null, (sls) Q2, wwg.S(1453261977, true, new ota(27, p6oVar2), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
            f530Var3 = f530Var5;
        } else {
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p91(f530Var3, p6oVar2, slsVar, tlsVar2, i, i2, 5);
        }
    }

    public static final void b(r611 r611Var, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(538945359);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(r611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(1133604706);
            d(r611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(1133659266);
            c(r611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(r611Var, f530Var, z, i, 10);
        }
    }

    public static final void c(r611 r611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        String str;
        bts btsVar = (bts) fidVar;
        btsVar.g0(844584568);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(r611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            final long n = tje.n(AppColor$Palette.Text, btsVar);
            boolean k = btsVar.k(r611Var.a) | btsVar.k(fwiVar) | btsVar.d(n);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                SpannableStringBuilder spannableStringBuilder = r611Var.a;
                CustomImageSpan[] customImageSpanArr = (CustomImageSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CustomImageSpan.class);
                if (customImageSpanArr.length == 0) {
                    Q = new Pair(new kk2(spannableStringBuilder.toString()), kotlin.collections.b.f());
                } else {
                    hk2 hk2Var = new hk2(0);
                    int length = customImageSpanArr.length;
                    int i4 = 0;
                    while (true) {
                        str = "image_span_";
                        if (i4 >= length) {
                            break;
                        }
                        CustomImageSpan customImageSpan = customImageSpanArr[i4];
                        int i5 = length;
                        int spanStart = spannableStringBuilder.getSpanStart(customImageSpan);
                        int spanEnd = spannableStringBuilder.getSpanEnd(customImageSpan);
                        if (spanStart > i3) {
                            hk2Var.d(spannableStringBuilder.subSequence(i3, spanStart).toString());
                        }
                        n6b1.a(hk2Var, "image_span_" + spanStart, "[icon]");
                        i4++;
                        i3 = spanEnd;
                        length = i5;
                    }
                    if (i3 < spannableStringBuilder.length()) {
                        hk2Var.d(spannableStringBuilder.subSequence(i3, spannableStringBuilder.length()).toString());
                    }
                    kk2 i6 = hk2Var.i();
                    int d = gw00.d(customImageSpanArr.length);
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    int length2 = customImageSpanArr.length;
                    int i7 = 0;
                    while (i7 < length2) {
                        CustomImageSpan customImageSpan2 = customImageSpanArr[i7];
                        CustomImageSpan[] customImageSpanArr2 = customImageSpanArr;
                        String i8 = oyr.i(spannableStringBuilder.getSpanStart(customImageSpan2), str);
                        final Drawable drawable = customImageSpan2.getDrawable();
                        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                        final int f0 = fwiVar.f0(16.0f);
                        Pair pair = new Pair(i8, new oxv(new r3c0(7, uh6.E(16), uh6.E(16)), new a(-2062682163, new zls() { // from class: pra0
                            @Override // defpackage.zls
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    Drawable drawable2 = drawable;
                                    int i9 = f0;
                                    o4b1.c(new u92(ffx.d0(drawable2, i9, i9, 4)), null, ljs0.m(c530.a, 16.0f), null, null, 0.0f, new c36(n, 5), 0, btsVar2, 432, 184);
                                } else {
                                    btsVar2.Y();
                                }
                                return zy11.a;
                            }
                        }, true)));
                        linkedHashMap.put(pair.c(), pair.f());
                        i7++;
                        customImageSpanArr = customImageSpanArr2;
                        spannableStringBuilder = spannableStringBuilder2;
                        fwiVar = fwiVar;
                        length2 = length2;
                        str = str;
                        n = n;
                    }
                    Q = new Pair(i6, linkedHashMap);
                }
                btsVar.o0(Q);
            }
            Pair pair2 = (Pair) Q;
            kk2 kk2Var = (kk2) pair2.getFirst();
            Map map = (Map) pair2.getSecond();
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean e = btsVar.e(r611Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new u290(28, r611Var);
                btsVar.o0(Q2);
            }
            f530 a = fnq0.a(c, (tls) Q2);
            gad.a.getClass();
            ydb1.a(a, gad.b, wwg.S(-573606713, true, new y740(9, kk2Var, map), btsVar), null, null, null, SlotSize.L, false, btsVar, 1573296, 184);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ora0(r611Var, f530Var, i, 0);
        }
    }

    public static final void d(r611 r611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-301955945);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(r611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            String str = r611Var.d;
            String str2 = r611Var.c;
            boolean k = btsVar.k(str) | btsVar.k(str2);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                String d0 = evu0.d0(str2, " · ", "");
                String str3 = r611Var.d;
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (d0.length() <= 0) {
                    d0 = null;
                }
                Q = kotlin.collections.a.X(j73.A(new String[]{str3, d0}), Extension.FIX_SPACE, null, null, null, 62);
                btsVar.o0(Q);
            }
            String str4 = (String) Q;
            String str5 = r611Var.b;
            boolean k2 = btsVar.k(str4);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new my30(str4, 17);
                btsVar.o0(Q2);
            }
            f530 a = fnq0.a(f530Var, (tls) Q2);
            SlotSize slotSize = SlotSize.XS;
            float size = slotSize.getSize();
            float size2 = slotSize.getSize();
            uo5 uo5Var = x4c.x;
            y7m y7mVar = new y7m(0.0f);
            gad.a.getClass();
            a5l0.d(str5, a, size, size2, uo5Var, 0.0f, null, y7mVar, gad.c, wwg.S(-1956122969, true, new sc20(28, r611Var), btsVar), btsVar, 918577152, 96);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ora0(r611Var, f530Var, i, 1);
        }
    }

    public static final Context e(int i, Context context) {
        return i == 0 ? context : new ContextThemeWrapper(context, i);
    }
}

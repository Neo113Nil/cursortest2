package defpackage;

import android.text.SpannableStringBuilder;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.j;
import defpackage.a6n;
import defpackage.gxm;
import defpackage.n8e;
import defpackage.p8e;
import defpackage.q83;
import defpackage.tyu0;
import defpackage.wf11;
import defpackage.wp2;
import defpackage.x910;
import defpackage.y6i0;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class n8p {
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(CharSequence charSequence, wp2 wp2Var, f530 f530Var, wp2 wp2Var2, sjy0 sjy0Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        wp2 wp2Var3;
        int i3;
        sjy0 sjy0Var2;
        wp2 wp2Var4;
        sjy0 sjy0Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1365794431);
        int i4 = (i & 6) == 0 ? ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= btsVar.k(wp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar.k(f530Var2) ? 256 : 128;
        } else {
            f530Var2 = f530Var;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            wp2Var3 = wp2Var2;
            i4 |= btsVar.k(wp2Var3) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                sjy0Var2 = sjy0Var;
                i4 |= btsVar.k(sjy0Var2) ? 16384 : 8192;
                if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
                    final wp2 wp2Var5 = i5 != 0 ? tp2.a : wp2Var3;
                    final sjy0 sjy0Var4 = i3 != 0 ? null : sjy0Var2;
                    long n = tje.n(wp2Var, btsVar);
                    fwi fwiVar = (fwi) btsVar.m(j.h);
                    boolean z = (i4 & 14) == 4 || ((i4 & 8) != 0 && btsVar.k(charSequence));
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (z || Q == o430Var) {
                        int length = charSequence.length();
                        for (int i6 = 0; i6 < length; i6++) {
                            char charAt = charSequence.charAt(i6);
                            char c = '\n';
                            if (charAt == '\n' || charAt == '\r' || charAt == 8232 || charAt == 8233 || charAt == ' ') {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                int i7 = 0;
                                while (i7 < spannableStringBuilder.length()) {
                                    char charAt2 = spannableStringBuilder.charAt(i7);
                                    if (charAt2 != c) {
                                        if (charAt2 != '\r' && charAt2 != 8232 && charAt2 != 8233) {
                                            if (charAt2 != ' ') {
                                                i7++;
                                                c = '\n';
                                            }
                                        }
                                    }
                                    spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) " ");
                                    i7++;
                                    c = '\n';
                                }
                                Q = spannableStringBuilder;
                                btsVar.o0(Q);
                            }
                        }
                        Q = charSequence;
                        btsVar.o0(Q);
                    }
                    final CharSequence charSequence2 = (CharSequence) Q;
                    float f0 = fwiVar.f0(32.0f);
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = new wf11(0);
                        btsVar.o0(Q2);
                    }
                    final wf11 wf11Var = (wf11) Q2;
                    f530 m = ymb1.m(f530Var2);
                    boolean e = btsVar.e(wf11Var) | btsVar.d(n) | btsVar.b(f0);
                    Object Q3 = btsVar.Q();
                    if (e || Q3 == o430Var) {
                        Q3 = new m8p(wf11Var, n, f0);
                        btsVar.o0(Q3);
                    }
                    f530 i8 = bb1.i(m, (tls) Q3);
                    boolean e2 = btsVar.e(charSequence2) | ((i4 & 7168) == 2048) | btsVar.e(wf11Var) | ((i4 & HProv.ALG_CLASS_ALL) == 16384);
                    Object Q4 = btsVar.Q();
                    if (e2 || Q4 == o430Var) {
                        Q4 = new wls() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.items.a
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                tyu0 tyu0Var = (tyu0) obj;
                                n8e n8eVar = (n8e) obj2;
                                int j = n8e.j(n8eVar.a);
                                long j2 = n8eVar.a;
                                long a = p8e.a(0, Integer.MAX_VALUE, j, n8e.h(j2));
                                FadingLineSlot fadingLineSlot = FadingLineSlot.Measure;
                                CharSequence charSequence3 = charSequence2;
                                wp2 wp2Var6 = wp2Var5;
                                boolean z2 = ((x910) kotlin.collections.a.P(tyu0Var.h0(fadingLineSlot, new androidx.compose.runtime.internal.a(1598826976, new a6n(8, charSequence3, wp2Var6), true)))).l0(a).a > n8e.i(j2);
                                wf11.this.a = z2;
                                x910 x910Var = (x910) kotlin.collections.a.P(tyu0Var.h0(FadingLineSlot.Content, new androidx.compose.runtime.internal.a(-549871679, new gxm(7, charSequence3, wp2Var6, sjy0Var4), true)));
                                if (!z2) {
                                    a = j2;
                                }
                                o l0 = x910Var.l0(a);
                                return tyu0Var.w(y6i0.d(l0.a, n8e.k(j2), n8e.i(j2)), l0.b, b.f(), new q83(l0, 3));
                            }
                        };
                        btsVar.o0(Q4);
                    }
                    e.a(i8, (wls) Q4, btsVar, 0, 0);
                    wp2Var4 = wp2Var5;
                    sjy0Var3 = sjy0Var4;
                } else {
                    btsVar.Y();
                    wp2Var4 = wp2Var3;
                    sjy0Var3 = sjy0Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new xg0(charSequence, wp2Var, f530Var, wp2Var4, sjy0Var3, i, i2, 8);
                    return;
                }
                return;
            }
            sjy0Var2 = sjy0Var;
            if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        wp2Var3 = wp2Var2;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        sjy0Var2 = sjy0Var;
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }
}

package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOrderStatus;
import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import java.util.ArrayList;
import kotlin.Pair;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class mib1 {
    public static final void a(final String str, final f530 f530Var, final long j, long j2, long j3, long j4, int i, boolean z, final int i2, tls tlsVar, final ety0 ety0Var, fid fidVar, final int i3) {
        bts btsVar;
        final long j5;
        final long j6;
        final long j7;
        final int i4;
        final boolean z2;
        final tls tlsVar2;
        long j8;
        tls tlsVar3;
        int i5;
        boolean z3;
        long j9;
        long j10;
        boolean z4;
        int i6;
        tls tlsVar4;
        int i7;
        int i8;
        Character w0;
        Character w02;
        Character w03;
        Character w04;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2098005767);
        int i9 = i3 | (btsVar2.k(str) ? 4 : 2) | (btsVar2.d(j) ? 256 : 128) | 920349696;
        int i10 = (btsVar2.k(ety0Var) ? 131072 : 65536) | 28086;
        if (btsVar2.V(i9 & 1, ((306783379 & i9) == 306783378 && (74899 & i10) == 74898) ? false : true)) {
            btsVar2.a0();
            int i11 = i3 & 1;
            o430 o430Var = did.a;
            int i12 = 6;
            if (i11 == 0 || btsVar2.C()) {
                j8 = sty0.c;
                Object Q = btsVar2.Q();
                if (Q == o430Var) {
                    Q = new wk6(i12);
                    btsVar2.o0(Q);
                }
                tlsVar3 = (tls) Q;
                i5 = 2;
                z3 = 6;
                j9 = j8;
                j10 = j9;
                z4 = true;
            } else {
                btsVar2.Y();
                j8 = j2;
                j9 = j3;
                j10 = j4;
                z4 = z;
                tlsVar3 = tlsVar;
                z3 = 6;
                i5 = i;
            }
            btsVar2.u();
            int i13 = i9 & 14;
            boolean z5 = i13 == 4;
            Object Q2 = btsVar2.Q();
            if (z5 || Q2 == o430Var) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                StringBuilder sb = new StringBuilder();
                i6 = i10;
                int i14 = 0;
                int i15 = -1;
                int i16 = -1;
                while (i14 < str.length()) {
                    tls tlsVar5 = tlsVar3;
                    if (str.charAt(i14) == '*' && (w03 = gvu0.w0(i14 + 1, str)) != null && w03.charValue() == '*' && ((w04 = gvu0.w0(i14 - 1, str)) == null || w04.charValue() != '\\')) {
                        if (i16 == -1) {
                            i16 = sb.length();
                        } else {
                            arrayList.add(new Pair(Integer.valueOf(i16), Integer.valueOf(sb.length())));
                            i16 = -1;
                        }
                        i14 += 2;
                    } else if (str.charAt(i14) != '*' || ((w02 = gvu0.w0(i14 - 1, str)) != null && w02.charValue() == '\\')) {
                        if (str.charAt(i14) != '\\' || (w0 = gvu0.w0((i8 = i14 + 1), str)) == null) {
                            i7 = i15;
                        } else {
                            i7 = i15;
                            if (w0.charValue() == '*') {
                                sb.append(str.charAt(i8));
                                i14 += 2;
                                tlsVar3 = tlsVar5;
                                i15 = i7;
                            }
                        }
                        sb.append(str.charAt(i14));
                        i14++;
                        tlsVar3 = tlsVar5;
                        i15 = i7;
                    } else {
                        if (i15 == -1) {
                            i15 = sb.length();
                        } else {
                            arrayList2.add(new Pair(Integer.valueOf(i15), Integer.valueOf(sb.length())));
                            i15 = -1;
                        }
                        i14++;
                    }
                    tlsVar3 = tlsVar5;
                }
                tlsVar4 = tlsVar3;
                mx80 mx80Var = new mx80(sb.toString(), arrayList, arrayList2);
                btsVar2.o0(mx80Var);
                Q2 = mx80Var;
            } else {
                i6 = i10;
                tlsVar4 = tlsVar3;
            }
            mx80 mx80Var2 = (mx80) Q2;
            boolean z6 = i13 == 4;
            Object Q3 = btsVar2.Q();
            if (z6 || Q3 == o430Var) {
                hk2 hk2Var = new hk2(0);
                hk2Var.d(mx80Var2.a);
                for (Pair pair : mx80Var2.b) {
                    hk2Var.a(new bmt0(0L, 0L, lzr.G, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65531), ((Number) pair.c()).intValue(), ((Number) pair.f()).intValue());
                }
                for (Pair pair2 : mx80Var2.c) {
                    hk2Var.a(new bmt0(0L, 0L, (lzr) null, new hzr(1), (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65527), ((Number) pair2.c()).intValue(), ((Number) pair2.f()).intValue());
                }
                Q3 = hk2Var.i();
                btsVar2.o0(Q3);
            }
            long j11 = j8;
            long j12 = j9;
            j7 = j10;
            tls tlsVar6 = tlsVar4;
            btsVar = btsVar2;
            wqy0.c((kk2) Q3, f530Var, j, j11, null, j7, j12, i5, z4, i2, 0, null, tlsVar6, ety0Var, btsVar, (i9 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND) | 920349696, 1576374 | ((i6 << 6) & 29360128), 49152);
            j5 = j11;
            j6 = j12;
            i4 = i5;
            z2 = z4;
            tlsVar2 = tlsVar6;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            j5 = j2;
            j6 = j3;
            j7 = j4;
            i4 = i;
            z2 = z;
            tlsVar2 = tlsVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(str, f530Var, j, j5, j6, j7, i4, z2, i2, tlsVar2, ety0Var, i3) { // from class: uw00
                public final /* synthetic */ boolean A;
                public final /* synthetic */ int B;
                public final /* synthetic */ tls C;
                public final /* synthetic */ ety0 D;
                public final /* synthetic */ String a;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long w;
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;
                public final /* synthetic */ int z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(49);
                    mib1.a(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static void b(ndf ndfVar) {
        ndfVar.n = false;
        CharSequence charSequence = ndfVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                ndfVar.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = ndfVar.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if (!(obj instanceof mrx)) {
                    spannable.removeSpan(obj);
                }
            }
        }
        c(ndfVar);
    }

    public static void c(ndf ndfVar) {
        ndfVar.k = -3.4028235E38f;
        ndfVar.j = Integer.MIN_VALUE;
        CharSequence charSequence = ndfVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                ndfVar.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = ndfVar.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float d(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static final ChargersAnalytics$ChargersOrderStatus e(ChargersActiveOrderStatus chargersActiveOrderStatus) {
        switch (bda.a[chargersActiveOrderStatus.ordinal()]) {
            case 1:
                return ChargersAnalytics$ChargersOrderStatus.Created;
            case 2:
                return ChargersAnalytics$ChargersOrderStatus.Reservation;
            case 3:
                return ChargersAnalytics$ChargersOrderStatus.Execution;
            case 4:
                return ChargersAnalytics$ChargersOrderStatus.Leasing;
            case 5:
                return ChargersAnalytics$ChargersOrderStatus.Canceled;
            case 6:
                return ChargersAnalytics$ChargersOrderStatus.Finished;
            default:
                w511.b();
                return null;
        }
    }
}

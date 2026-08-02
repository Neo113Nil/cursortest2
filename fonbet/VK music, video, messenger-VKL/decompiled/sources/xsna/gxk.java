package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import xsna.q630;

/* compiled from: DateInput.kt */
/* loaded from: classes11.dex */
public final class gxk {
    public static final u890 a;
    public static final float b = 16;

    /* compiled from: DateInput.kt */
    public static final class a implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-752164549, intValue, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:93)");
                }
                String str = this.b;
                boolean J = aVar2.J(str);
                String str2 = this.c;
                boolean J2 = J | aVar2.J(str2);
                Object x = aVar2.x();
                if (J2 || x == a.C0011a.a) {
                    x = new b1a(9, this.b, str2);
                    aVar2.R(x);
                }
                cjo0.c(str, egi0.b(q630.a.a, false, (izs) x), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262140);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DateInput.kt */
    public static final class b implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1179434278, intValue, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:98)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new wq3(20);
                    aVar2.R(x);
                }
                cjo0.c(this.b, egi0.a(q630.a.a, (izs) x), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262140);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    static {
        float f = 24;
        a = s200.n(f, 10, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
    }

    public static final void a(final Long l, final izs<? super Long, s3q0> izsVar, final wz8 wz8Var, final k9x k9xVar, final nyk nykVar, final eai0 eai0Var, final vxk vxkVar, final rwr rwrVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-432341251);
        int i2 = i | (M.J(l) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(wz8Var) ? 256 : 128) | (M.y(k9xVar) ? 2048 : 1024) | (M.J(nykVar) ? 16384 : 8192) | (M.J(eai0Var) ? 131072 : 65536) | (M.J(vxkVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(rwrVar) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-432341251, i2, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:67)");
            }
            boolean J = M.J(wz8Var.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = wz8Var.c(wz8Var.a);
                M.R(x);
            }
            bxk bxkVar = (bxk) x;
            String b2 = e7b0.b(R.string.m3c_date_input_invalid_for_pattern, M);
            String b3 = e7b0.b(R.string.m3c_date_input_invalid_year_range, M);
            String b4 = e7b0.b(R.string.m3c_date_input_invalid_not_allowed, M);
            boolean J2 = M.J(bxkVar) | ((i2 & 57344) == 16384);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                kxk kxkVar = new kxk(k9xVar, eai0Var, bxkVar, nykVar, b2, b3, b4, "");
                M.R(kxkVar);
                x2 = kxkVar;
            }
            kxk kxkVar2 = (kxk) x2;
            String upperCase = bxkVar.a.toUpperCase(Locale.ROOT);
            String b5 = e7b0.b(R.string.m3c_date_input_label, M);
            q630 C = s200.C(txj0.f(q630.a.a, 1.0f), a);
            kxkVar2.i = l;
            int i3 = i2 << 3;
            b(C, l, izsVar, wz8Var, kai.c(-752164549, new a(b5, upperCase), M), kai.c(-1179434278, new b(upperCase), M), 0, kxkVar2, bxkVar, wz8Var.a, vxkVar, rwrVar, M, (i3 & 112) | 1794054 | (i3 & 896) | (i3 & 7168), (i2 >> 18) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(l, izsVar, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, rwrVar, i) { // from class: xsna.cxk
                public final /* synthetic */ Long b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ wz8 d;
                public final /* synthetic */ k9x e;
                public final /* synthetic */ nyk f;
                public final /* synthetic */ eai0 g;
                public final /* synthetic */ vxk h;
                public final /* synthetic */ rwr i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    gxk.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final q630 q630Var, Long l, final izs izsVar, final wz8 wz8Var, final jai jaiVar, final jai jaiVar2, final int i, final kxk kxkVar, final bxk bxkVar, final Locale locale, vxk vxkVar, final rwr rwrVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        Long l2;
        vxk vxkVar2;
        androidx.compose.runtime.a aVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        wh50 wh50Var;
        final bxk bxkVar2;
        int i10;
        int i11;
        Object jxkVar;
        final wz8 wz8Var2 = wz8Var;
        final Locale locale2 = locale;
        androidx.compose.runtime.a M = aVar.M(1456309913);
        if ((i2 & 6) == 0) {
            i4 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.J(l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.y(wz8Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.y(jaiVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= M.y(jaiVar2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= M.o(i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= M.J(kxkVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= M.J(bxkVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= M.y(locale2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (M.J(vxkVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.J(rwrVar) ? 32 : 16;
        }
        int i12 = i5;
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i12 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1456309913, i4, i12, "androidx.compose.material3.DateInputTextField (DateInput.kt:128)");
            }
            Object[] objArr = new Object[0];
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                i6 = i12;
                x = new af0(10);
                M.R(x);
            } else {
                i6 = i12;
            }
            int i13 = i4;
            final wh50 C = crx0.C(objArr, tho0.d, (gzs) x, M, 384);
            Object[] objArr2 = {(tho0) C.getValue()};
            int i14 = i13 & 29360128;
            int i15 = i13 & 234881024;
            boolean J = (i14 == 8388608) | M.J(C) | M.y(wz8Var2) | (i15 == 67108864) | M.y(locale2);
            int i16 = i13 & 3670016;
            boolean z = J | (i16 == 1048576);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                i7 = i14;
                i8 = i13;
                i9 = i15;
                x2 = new gzs() { // from class: xsna.dxk
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final Object invoke() {
                        String str;
                        wh50 wh50Var2 = C;
                        if (((tho0) wh50Var2.getValue()).a.c.length() > 0) {
                            String str2 = ((tho0) wh50Var2.getValue()).a.c;
                            String str3 = bxkVar.c;
                            wz8 wz8Var3 = wz8Var2;
                            Locale locale3 = locale2;
                            str = kxk.this.a(wz8Var3.j(str2, str3, locale3), i, locale3);
                        } else {
                            str = "";
                        }
                        return androidx.compose.runtime.k.b(str);
                    }
                };
                wh50Var = C;
                M.R(x2);
            } else {
                i7 = i14;
                i8 = i13;
                wh50Var = C;
                i9 = i15;
            }
            final wh50 wh50Var2 = (wh50) crx0.A(objArr2, (gzs) x2, M, 0);
            boolean N = drm0.N((CharSequence) wh50Var2.getValue());
            float f = b;
            if (!N) {
                u890 a2 = qfo0.a();
                f -= a2.d + a2.b;
            }
            float f2 = f;
            tho0 tho0Var = (tho0) wh50Var.getValue();
            boolean J2 = M.J(wh50Var) | (i9 == 67108864) | M.J(wh50Var2) | ((i8 & 896) == 256) | M.y(wz8Var2) | M.y(locale2) | (i7 == 8388608) | (i16 == 1048576);
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                bxkVar2 = bxkVar;
                i10 = i8;
                i11 = 32;
                final wh50 wh50Var3 = wh50Var;
                x3 = new izs() { // from class: xsna.exk
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        tho0 tho0Var2 = (tho0) obj;
                        String str = tho0Var2.a.c;
                        int length = str.length();
                        String str2 = bxk.this.c;
                        if (length <= str2.length()) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= str.length()) {
                                    wh50Var3.setValue(tho0Var2);
                                    String obj2 = drm0.p0(str).toString();
                                    int length2 = obj2.length();
                                    wh50 wh50Var4 = wh50Var2;
                                    izs izsVar2 = izsVar;
                                    Long l3 = null;
                                    if (length2 != 0 && obj2.length() >= str2.length()) {
                                        wz8 wz8Var3 = wz8Var2;
                                        Locale locale3 = locale2;
                                        rz8 j = wz8Var3.j(obj2, str2, locale3);
                                        wh50Var4.setValue(kxkVar.a(j, i, locale3));
                                        if (((CharSequence) wh50Var4.getValue()).length() == 0 && j != null) {
                                            l3 = Long.valueOf(j.e);
                                        }
                                        izsVar2.invoke(l3);
                                    } else {
                                        wh50Var4.setValue("");
                                        izsVar2.invoke(null);
                                    }
                                } else {
                                    if (!Character.isDigit(str.charAt(i17))) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                        }
                        return s3q0.a;
                    }
                };
                wz8Var2 = wz8Var2;
                locale2 = locale2;
                wh50Var = wh50Var3;
                M.R(x3);
            } else {
                bxkVar2 = bxkVar;
                i10 = i8;
                i11 = 32;
            }
            izs izsVar2 = (izs) x3;
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7);
            boolean J3 = M.J(wh50Var2);
            Object x4 = M.x();
            if (J3 || x4 == c0012a) {
                x4 = new dm3(2, wh50Var2);
                M.R(x4);
            }
            q630 b2 = egi0.b(H, false, (izs) x4);
            q630 q630Var2 = q630.a.a;
            if (rwrVar != null) {
                q630Var2 = jvi.d(q630Var2, rwrVar);
            }
            vxkVar2 = vxkVar;
            h190.a(tho0Var, izsVar2, b2.g(q630Var2), false, null, jaiVar, jaiVar2, kai.c(-357881838, new hxk(wh50Var2), M), !drm0.N((CharSequence) wh50Var2.getValue()), new q1l(bxkVar2), new rgy(3, 7, 113), null, true, 0, 0, null, vxkVar2.y, M, (i10 << 6) & 33030144);
            aVar2 = M;
            s3q0 s3q0Var = s3q0.a;
            boolean z2 = (i6 & 112) == i11;
            Object x5 = aVar2.x();
            if (z2 || x5 == c0012a) {
                x5 = new ixk(rwrVar, null);
                aVar2.R(x5);
            }
            bap.g(s3q0Var, (wzs) x5, aVar2, 6);
            boolean y = ((i10 & 112) == i11) | aVar2.y(wz8Var2) | (i9 == 67108864) | aVar2.y(locale2) | aVar2.J(wh50Var);
            Object x6 = aVar2.x();
            if (y || x6 == c0012a) {
                l2 = l;
                jxkVar = new jxk(l2, wz8Var2, bxkVar2, locale, wh50Var, null);
                aVar2.R(jxkVar);
            } else {
                jxkVar = x6;
                l2 = l;
            }
            bap.g(l2, (wzs) jxkVar, aVar2, (i10 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            l2 = l;
            vxkVar2 = vxkVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final Long l3 = l2;
            final vxk vxkVar3 = vxkVar2;
            s.d = new wzs() { // from class: xsna.fxk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    int I2 = ne7.I(i3);
                    gxk.b(q630.this, l3, izsVar, wz8Var, jaiVar, jaiVar2, i, kxkVar, bxkVar, locale, vxkVar3, rwrVar, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }
}

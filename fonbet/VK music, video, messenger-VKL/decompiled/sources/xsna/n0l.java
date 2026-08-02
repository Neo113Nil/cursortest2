package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import xsna.cri;
import xsna.dt1;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class n0l {
    public static final n0l a = new n0l();

    public final void a(final Long l, final Long l2, final int i, final nyk nykVar, final q630 q630Var, final long j, final String str, final String str2, final jai jaiVar, jai jaiVar2, final jai jaiVar3, final Locale locale, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        final jai jaiVar4;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1381313200);
        if ((i2 & 6) == 0) {
            i4 = (M.J(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.J(l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & 4096) == 0 ? M.J(nykVar) : M.y(nykVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i6 = i4;
        if ((196608 & i2) == 0) {
            i6 |= M.p(j) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= M.J(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= M.J(str2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= M.y(jaiVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= M.y(jaiVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i7 = i6;
        if ((i3 & 6) == 0) {
            i5 = i3 | (M.y(jaiVar3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.y(locale) ? 32 : 16;
        }
        int i8 = i5;
        if (M.t(i7 & 1, ((306783379 & i7) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1381313200, i7, i8, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:468)");
            }
            String b = nykVar.b(l, locale, false);
            String b2 = nykVar.b(l2, locale, false);
            String b3 = nykVar.b(l, locale, true);
            String str3 = "";
            if (b3 == null) {
                M.K(620891895);
                if (i == 0) {
                    M.K(297125251);
                    b3 = e7b0.b(R.string.m3c_date_picker_no_selection_description, M);
                    M.j();
                } else {
                    if (i == 1) {
                        M.K(297128222);
                        b3 = e7b0.b(R.string.m3c_date_input_no_input_description, M);
                        M.j();
                    } else {
                        M.K(621113326);
                        M.j();
                        b3 = "";
                    }
                }
                M.j();
            } else {
                M.K(297117483);
                M.j();
            }
            String str4 = b3;
            String b4 = nykVar.b(l2, locale, true);
            if (b4 == null) {
                M.K(621382935);
                if (i == 0) {
                    M.K(297141091);
                    str3 = e7b0.b(R.string.m3c_date_picker_no_selection_description, M);
                    M.j();
                } else {
                    if (i == 1) {
                        M.K(297144062);
                        str3 = e7b0.b(R.string.m3c_date_input_no_input_description, M);
                        M.j();
                    } else {
                        M.K(621604366);
                        M.j();
                    }
                }
                M.j();
            } else {
                M.K(297133385);
                M.j();
                str3 = b4;
            }
            String b5 = pzl.b(str, ": ", str4);
            String b6 = pzl.b(str2, ": ", str3);
            boolean J = M.J(b5) | M.J(b6);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new i0l(b5, b6, 0);
                M.R(x);
            }
            q630 a2 = egi0.a(q630Var, (izs) x);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(4), dt1.a.l, M, 54);
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            k9q0.w(M, c, cri.a.d);
            if (b != null) {
                M.K(-177386503);
                cjo0.c(b, null, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, M, (i7 >> 9) & 896, 0, 262138);
                aVar2 = M;
                aVar2.j();
            } else {
                aVar2 = M;
                aVar2.K(-177297192);
                jaiVar.invoke(aVar2, Integer.valueOf((i7 >> 24) & 14));
                aVar2.j();
            }
            jaiVar3.invoke(aVar2, Integer.valueOf(i8 & 14));
            if (b2 != null) {
                aVar2.K(-177171301);
                cjo0.c(b2, null, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, (i7 >> 9) & 896, 0, 262138);
                aVar2.j();
                jaiVar4 = jaiVar2;
            } else {
                aVar2.K(-177083974);
                jaiVar4 = jaiVar2;
                jaiVar4.invoke(aVar2, Integer.valueOf((i7 >> 27) & 14));
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar4 = jaiVar2;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.j0l
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    int I2 = ne7.I(i3);
                    n0l.this.a(l, l2, i, nykVar, q630Var, j, str, str2, jaiVar, jaiVar4, jaiVar3, locale, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(final Long l, final Long l2, final int i, final nyk nykVar, final q630 q630Var, final long j, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(1655228151);
        int i3 = i2 | (M.J(l) ? 4 : 2) | (M.J(l2) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.J(nykVar) ? 2048 : 1024) | (M.p(j) ? 131072 : 65536);
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1655228151, i3, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
            }
            String b = e7b0.b(R.string.m3c_date_range_picker_start_headline, M);
            String b2 = e7b0.b(R.string.m3c_date_range_picker_end_headline, M);
            a(l, l2, i, nykVar, q630Var, j, b, b2, kai.c(850203865, new k0l(b, j), M), kai.c(282231642, new l0l(b2, j), M), kai.c(-320655704, new m0l(j), M), uz8.a(M), M, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | 24576 | (i3 & 458752), 390);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(l, l2, i, nykVar, q630Var, j, i2) { // from class: xsna.h0l
                public final /* synthetic */ Long c;
                public final /* synthetic */ Long d;
                public final /* synthetic */ int e;
                public final /* synthetic */ nyk f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ long h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1597441);
                    n0l.this.b(this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(final int i, final int i2, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(694693107);
        int i3 = i2 | (M.o(i) ? 4 : 2) | (M.p(j) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(694693107, i3, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:371)");
            }
            if (i == 0) {
                M.K(1880154051);
                cjo0.c(e7b0.b(R.string.m3c_date_range_picker_title, M), q630Var, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, M, i3 & 1008, 0, 262136);
                aVar2 = M;
                aVar2.j();
            } else {
                aVar2 = M;
                if (i == 1) {
                    aVar2.K(1880161282);
                    cjo0.c(e7b0.b(R.string.m3c_date_range_input_title, aVar2), q630Var, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, i3 & 1008, 0, 262136);
                    aVar2.j();
                } else {
                    aVar2.K(-1844364305);
                    aVar2.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, q630Var, j, i2) { // from class: xsna.g0l
                public final /* synthetic */ int c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3121);
                    n0l.this.c(this.c, I, this.e, (androidx.compose.runtime.a) obj, this.d);
                    return s3q0.a;
                }
            };
        }
    }
}

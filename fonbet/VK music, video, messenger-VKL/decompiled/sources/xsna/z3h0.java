package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.WeakHashMap;
import xsna.q630;
import xsna.tra0;
import xsna.yqx0;

/* compiled from: Scaffold.kt */
/* loaded from: classes11.dex */
public final class z3h0 {
    public static final float a = 16;

    public static final void a(q630 q630Var, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, final jai jaiVar, int i, long j, long j2, zpx0 zpx0Var, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i2) {
        final q630 q630Var2;
        final wzs wzsVar4;
        final wzs wzsVar5;
        final wzs wzsVar6;
        final int i3;
        final long j3;
        final long j4;
        final zpx0 zpx0Var2;
        wzs wzsVar7;
        int i4;
        wzs wzsVar8;
        wzs wzsVar9;
        zpx0 zpx0Var3;
        int i5;
        long j5;
        q630 q630Var3;
        long j6;
        androidx.compose.runtime.a M = aVar.M(-1211482744);
        int i6 = i2 | 38473142;
        if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                jai jaiVar3 = oki.a;
                jai jaiVar4 = oki.b;
                jai jaiVar5 = oki.c;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
                }
                t7g t7gVar = (t7g) M.r(u7g.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j7 = t7gVar.n;
                long a2 = u7g.a(0, j7, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(757124140, 6, -1, "androidx.compose.material3.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:301)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2011811170, 6, -1, "androidx.compose.material3.internal.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:25)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-282936756, 6, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:184)");
                }
                WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                te2 te2Var = yqx0.a.c(M).g;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1324817724, 6, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:148)");
                }
                te2 te2Var2 = yqx0.a.c(M).b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                o3q0 o3q0Var = new o3q0(te2Var, te2Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                wzsVar7 = jaiVar3;
                i4 = 2;
                wzsVar8 = jaiVar4;
                wzsVar9 = jaiVar5;
                zpx0Var3 = o3q0Var;
                i5 = i6 & (-267911169);
                j5 = a2;
                q630Var3 = q630.a.a;
                j6 = j7;
            } else {
                M.h();
                q630Var3 = q630Var;
                wzsVar7 = wzsVar;
                wzsVar8 = wzsVar2;
                wzsVar9 = wzsVar3;
                i4 = i;
                j6 = j;
                zpx0Var3 = zpx0Var;
                i5 = i6 & (-267911169);
                j5 = j2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1211482744, i5, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
            }
            boolean J = M.J(zpx0Var3);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new hi50(zpx0Var3);
                M.R(x);
            }
            hi50 hi50Var = (hi50) x;
            boolean J2 = M.J(hi50Var) | M.J(zpx0Var3);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new z5a(25, hi50Var, zpx0Var3);
                M.R(x2);
            }
            long j8 = j5;
            zpx0 zpx0Var4 = zpx0Var3;
            xjn0.a(tci.m(q630Var3, (izs) x2), null, j6, j8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(848889571, new r3h0(i4, wzsVar7, jaiVar2, wzsVar9, jaiVar, hi50Var, wzsVar8), M), M, 12582912, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            zpx0Var2 = zpx0Var4;
            j3 = j6;
            j4 = j8;
            q630Var2 = q630Var3;
            i3 = i4;
            wzsVar4 = wzsVar7;
            wzsVar6 = wzsVar9;
            wzsVar5 = wzsVar8;
        } else {
            M.h();
            q630Var2 = q630Var;
            wzsVar4 = wzsVar;
            wzsVar5 = wzsVar2;
            wzsVar6 = wzsVar3;
            i3 = i;
            j3 = j;
            j4 = j2;
            zpx0Var2 = zpx0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(wzsVar4, wzsVar5, wzsVar6, jaiVar, i3, j3, j4, zpx0Var2, jaiVar2, i2) { // from class: xsna.i3h0
                public final /* synthetic */ wzs c;
                public final /* synthetic */ wzs d;
                public final /* synthetic */ wzs e;
                public final /* synthetic */ jai f;
                public final /* synthetic */ int g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ zpx0 j;
                public final /* synthetic */ jai k;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z3h0.a(q630.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (androidx.compose.runtime.a) obj, ne7.I(805330945));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final int i, final wzs wzsVar, final jai jaiVar, final wzs wzsVar2, final jai jaiVar2, final zpx0 zpx0Var, final wzs wzsVar3, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-280287501);
        int i5 = i2 | (M.o(i) ? 4 : 2) | (M.y(wzsVar) ? 32 : 16) | (M.y(jaiVar) ? 256 : 128) | (M.y(wzsVar2) ? 2048 : 1024) | (M.y(jaiVar2) ? 16384 : 8192) | (M.J(zpx0Var) ? 131072 : 65536) | (M.y(wzsVar3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i5 & 1, (599187 & i5) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-280287501, i5, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:137)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new u3h0();
                M.R(x);
            }
            final u3h0 u3h0Var = (u3h0) x;
            boolean z = (i5 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new jai(605195056, new y3h0(wzsVar), true);
                M.R(x2);
            }
            final wzs wzsVar4 = (wzs) x2;
            boolean z2 = (i5 & 7168) == 2048;
            Object x3 = M.x();
            if (z2 || x3 == obj) {
                x3 = new jai(418899191, new x3h0(wzsVar2), true);
                M.R(x3);
            }
            final wzs wzsVar5 = (wzs) x3;
            boolean z3 = (57344 & i5) == 16384;
            Object x4 = M.x();
            if (z3 || x4 == obj) {
                x4 = new jai(338600263, new w3h0(jaiVar2), true);
                M.R(x4);
            }
            final wzs wzsVar6 = (wzs) x4;
            boolean z4 = (i5 & 896) == 256;
            Object x5 = M.x();
            if (z4 || x5 == obj) {
                x5 = new jai(-1776388365, new s3h0(jaiVar, u3h0Var), true);
                M.R(x5);
            }
            final wzs wzsVar7 = (wzs) x5;
            boolean z5 = (3670016 & i5) == 1048576;
            Object x6 = M.x();
            if (z5 || x6 == obj) {
                x6 = new jai(-1731662488, new t3h0(wzsVar3), true);
                M.R(x6);
            }
            final wzs wzsVar8 = (wzs) x6;
            boolean J = ((458752 & i5) == 131072) | M.J(wzsVar4) | M.J(wzsVar5) | M.J(wzsVar6) | ((i5 & 14) == 4) | M.J(wzsVar8) | M.J(wzsVar7);
            Object x7 = M.x();
            if (J || x7 == obj) {
                i3 = 1;
                i4 = 0;
                Object obj2 = new wzs() { // from class: xsna.k3h0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        int r0;
                        int r02;
                        int i6;
                        ehq ehqVar;
                        Integer num;
                        int i7;
                        int intValue;
                        final ztm0 ztm0Var = (ztm0) obj3;
                        o6j o6jVar = (o6j) obj4;
                        float f = z3h0.a;
                        final int i8 = o6j.i(o6jVar.a);
                        final int h = o6j.h(o6jVar.a);
                        long b = o6j.b(0, o6jVar.a, 0, 0, 0, 10);
                        LayoutDirection layoutDirection = ztm0Var.getLayoutDirection();
                        final zpx0 zpx0Var2 = zpx0.this;
                        int d = zpx0Var2.d(ztm0Var, layoutDirection);
                        int b2 = zpx0Var2.b(ztm0Var, ztm0Var.getLayoutDirection());
                        int a2 = zpx0Var2.a(ztm0Var);
                        final tra0 N = ((zo10) j5g.Y(ztm0Var.t1(b4h0.TopBar, wzsVar4))).N(b);
                        int i9 = (-d) - b2;
                        int i10 = -a2;
                        final tra0 N2 = ((zo10) j5g.Y(ztm0Var.t1(b4h0.Snackbar, wzsVar5))).N(s6j.i(i9, i10, b));
                        final tra0 N3 = ((zo10) j5g.Y(ztm0Var.t1(b4h0.Fab, wzsVar6))).N(s6j.i(i9, i10, b));
                        int i11 = N3.b;
                        int i12 = i;
                        if (i11 == 0 && N3.c == 0) {
                            ehqVar = null;
                        } else {
                            int i13 = N3.c;
                            if (i12 == 0) {
                                if (ztm0Var.getLayoutDirection() == LayoutDirection.Ltr) {
                                    r0 = ztm0Var.r0(f);
                                    i6 = r0 + d;
                                } else {
                                    r02 = ztm0Var.r0(f);
                                    i6 = ((i8 - r02) - i11) - b2;
                                }
                            } else if (i12 != 2 && i12 != 3) {
                                i6 = (((i8 - i11) + d) - b2) / 2;
                            } else if (ztm0Var.getLayoutDirection() == LayoutDirection.Ltr) {
                                r02 = ztm0Var.r0(f);
                                i6 = ((i8 - r02) - i11) - b2;
                            } else {
                                r0 = ztm0Var.r0(f);
                                i6 = r0 + d;
                            }
                            ehqVar = new ehq(i6, i13);
                        }
                        final tra0 N4 = ((zo10) j5g.Y(ztm0Var.t1(b4h0.BottomBar, wzsVar8))).N(b);
                        boolean z6 = N4.b == 0 && N4.c == 0;
                        if (ehqVar != null) {
                            int i14 = ehqVar.b;
                            num = Integer.valueOf((z6 || i12 == 3) ? ztm0Var.r0(f) + i14 + zpx0Var2.a(ztm0Var) : ztm0Var.r0(f) + N4.c + i14);
                        } else {
                            num = null;
                        }
                        int i15 = N2.c;
                        if (i15 != 0) {
                            if (num != null) {
                                intValue = num.intValue();
                            } else {
                                Integer valueOf = Integer.valueOf(N4.c);
                                if (z6) {
                                    valueOf = null;
                                }
                                intValue = valueOf != null ? valueOf.intValue() : zpx0Var2.a(ztm0Var);
                            }
                            i7 = intValue + i15;
                        } else {
                            i7 = 0;
                        }
                        r4x r4xVar = new r4x(zpx0Var2, ztm0Var);
                        final ehq ehqVar2 = ehqVar;
                        final Integer num2 = num;
                        ((zak0) u3h0Var.a).setValue(new u890(s200.s(r4xVar, ztm0Var.getLayoutDirection()), (N.b == 0 && N.c == 0) ? r4xVar.d() : ztm0Var.j1(N.c), s200.r(r4xVar, ztm0Var.getLayoutDirection()), z6 ? r4xVar.b() : ztm0Var.j1(N4.c)));
                        final tra0 N5 = ((zo10) j5g.Y(ztm0Var.t1(b4h0.MainContent, wzsVar7))).N(b);
                        final int i16 = i7;
                        return ztm0Var.Q(i8, h, jgp.b, new izs() { // from class: xsna.o3h0
                            @Override // xsna.izs
                            public final Object invoke(Object obj5) {
                                tra0.a aVar2 = (tra0.a) obj5;
                                aVar2.q(tra0.this, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                aVar2.q(N, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                tra0 tra0Var = N2;
                                int i17 = i8 - tra0Var.b;
                                ztm0 ztm0Var2 = ztm0Var;
                                LayoutDirection layoutDirection2 = ztm0Var2.getLayoutDirection();
                                zpx0 zpx0Var3 = zpx0Var2;
                                int d2 = ((zpx0Var3.d(ztm0Var2, layoutDirection2) + i17) - zpx0Var3.b(ztm0Var2, ztm0Var2.getLayoutDirection())) / 2;
                                int i18 = h;
                                aVar2.q(tra0Var, d2, i18 - i16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                tra0 tra0Var2 = N4;
                                aVar2.q(tra0Var2, 0, i18 - tra0Var2.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                ehq ehqVar3 = ehqVar2;
                                if (ehqVar3 != null) {
                                    aVar2.q(N3, ehqVar3.a, i18 - num2.intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(obj2);
                x7 = obj2;
            } else {
                i3 = 1;
                i4 = 0;
            }
            xtm0.a(null, (wzs) x7, M, i4, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, wzsVar, jaiVar, wzsVar2, jaiVar2, zpx0Var, wzsVar3, i2) { // from class: xsna.m3h0
                public final /* synthetic */ int b;
                public final /* synthetic */ wzs c;
                public final /* synthetic */ jai d;
                public final /* synthetic */ wzs e;
                public final /* synthetic */ jai f;
                public final /* synthetic */ zpx0 g;
                public final /* synthetic */ wzs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(1);
                    z3h0.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
        }
    }
}

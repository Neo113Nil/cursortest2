package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Pair;
import xsna.efu;
import xsna.q630;
import xsna.zra0;

/* compiled from: RecomThemesChooserList.kt */
/* loaded from: classes4.dex */
public final class maf0 {
    public static final void a(final SnapshotStateList snapshotStateList, final String str, final q630 q630Var, int i, int i2, final dsy dsyVar, final izs izsVar, final String str2, final String str3, final String str4, final Pair pair, final boolean z, androidx.compose.runtime.a aVar, final int i3) {
        final int i4;
        final int i5;
        int i6;
        final int i7;
        int i8;
        androidx.compose.runtime.a M = aVar.M(774704239);
        int i9 = i3 | (M.J(snapshotStateList) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 27648 | (M.J(dsyVar) ? 131072 : 65536) | (M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(str2) ? 8388608 : 4194304) | (M.J(str3) ? 67108864 : 33554432) | (M.J(str4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i10 = (M.J(pair) ? 4 : 2) | (M.l(z) ? 32 : 16);
        if (M.t(i9 & 1, ((i9 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true)) {
            M.V();
            if ((i3 & 1) == 0 || M.i()) {
                i6 = 3;
                i7 = 5;
            } else {
                M.h();
                i6 = i;
                i7 = i2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(774704239, i9, i10, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserList (RecomThemesChooserList.kt:40)");
            }
            q630 g = txj0.d(q630.a.a, 1.0f).g(q630Var);
            efu.b bVar = new efu.b(i6);
            float f = 24;
            float f2 = 8;
            u890 u890Var = new u890(f, f2, f, f2);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            boolean z2 = ((29360128 & i9) == 8388608) | ((i10 & 14) == 4) | ((234881024 & i9) == 67108864) | ((i9 & 112) == 32) | ((1879048192 & i9) == 536870912) | ((i10 & 112) == 32) | ((i9 & 14) == 4) | ((3670016 & i9) == 1048576);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                final int i11 = i6;
                izs izsVar2 = new izs() { // from class: xsna.haf0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        rry rryVar = (rry) obj;
                        final int i12 = i11;
                        jk40 jk40Var = new jk40(i12, 1);
                        final String str5 = str2;
                        final Pair pair2 = pair;
                        final String str6 = str3;
                        rry.j(rryVar, jk40Var, new jai(839788579, new yzs() { // from class: xsna.jaf0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(839788579, intValue, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserList.<anonymous>.<anonymous>.<anonymous> (RecomThemesChooserList.kt:50)");
                                    }
                                    vaf0.a(null, str5, pair2, str6, aVar2, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, true), 5);
                        c6b c6bVar = new c6b(i12, 1);
                        final String str7 = str;
                        final String str8 = str4;
                        rry.j(rryVar, c6bVar, new jai(-2073855718, new yzs() { // from class: xsna.kaf0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-2073855718, intValue, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserList.<anonymous>.<anonymous>.<anonymous> (RecomThemesChooserList.kt:57)");
                                    }
                                    vl20 a = zra0.a.a(str7, null, str8, null, aVar2, 196608, 26);
                                    Object x2 = aVar2.x();
                                    if (x2 == a.C0011a.a) {
                                        x2 = new b4r(28);
                                        aVar2.R(x2);
                                    }
                                    ldv0.d(s200.E(egi0.b(q630.a.a, false, (izs) x2), 32, 12), null, a, null, null, null, false, aVar2, 1572864, 58);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, true), 5);
                        if (z) {
                            rry.d(rryVar, i7 * i12, null, new jai(-1961593883, new zzs() { // from class: xsna.laf0
                                @Override // xsna.zzs
                                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    int intValue = ((Integer) obj3).intValue();
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if ((intValue2 & 48) == 0) {
                                        intValue2 |= aVar2.o(intValue) ? 32 : 16;
                                    }
                                    if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1961593883, intValue2, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserList.<anonymous>.<anonymous>.<anonymous> (RecomThemesChooserList.kt:72)");
                                        }
                                        odx.a(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue > i12 - 1 ? 8 : 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, aVar2, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar2.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 14);
                        } else {
                            final SnapshotStateList snapshotStateList2 = snapshotStateList;
                            int size = snapshotStateList2.size();
                            bl30 bl30Var = new bl30(snapshotStateList2, 14);
                            final izs izsVar3 = izsVar;
                            rry.d(rryVar, size, bl30Var, new jai(-257704658, new zzs() { // from class: xsna.gaf0
                                @Override // xsna.zzs
                                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    int intValue = ((Integer) obj3).intValue();
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if ((intValue2 & 48) == 0) {
                                        intValue2 |= aVar2.o(intValue) ? 32 : 16;
                                    }
                                    if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-257704658, intValue2, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserList.<anonymous>.<anonymous>.<anonymous> (RecomThemesChooserList.kt:78)");
                                        }
                                        faf0 faf0Var = (faf0) SnapshotStateList.this.get(intValue);
                                        String str9 = faf0Var.b;
                                        boolean z3 = faf0Var.c;
                                        String valueOf = String.valueOf(intValue);
                                        q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue > i12 - 1 ? 8 : 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                        izs izsVar4 = izsVar3;
                                        boolean J = aVar2.J(izsVar4) | aVar2.J(faf0Var);
                                        Object x2 = aVar2.x();
                                        if (J || x2 == a.C0011a.a) {
                                            x2 = new h57(22, izsVar4, faf0Var);
                                            aVar2.R(x2);
                                        }
                                        idx.a(str9, (izs) x2, H, valueOf, z3, kai.c(1138498527, new qw6(faf0Var, 14), aVar2), aVar2, 196608);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar2.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 12);
                        }
                        return s3q0.a;
                    }
                };
                i8 = i11;
                M.R(izsVar2);
                x = izsVar2;
            } else {
                i8 = i6;
            }
            uqy.b(bVar, g, dsyVar, u890Var, null, cVar, null, false, null, (izs) x, M, ((i9 >> 9) & 896) | 1575936, 0, 944);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i4 = i8;
            i5 = i7;
        } else {
            M.h();
            i4 = i;
            i5 = i2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, q630Var, i4, i5, dsyVar, izsVar, str2, str3, str4, pair, z, i3) { // from class: xsna.iaf0
                public final /* synthetic */ String c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ dsy g;
                public final /* synthetic */ izs h;
                public final /* synthetic */ String i;
                public final /* synthetic */ String j;
                public final /* synthetic */ String k;
                public final /* synthetic */ Pair l;
                public final /* synthetic */ boolean m;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    maf0.a(SnapshotStateList.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (androidx.compose.runtime.a) obj, ne7.I(1));
                    return s3q0.a;
                }
            };
        }
    }
}

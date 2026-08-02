package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Pair;
import org.chromium.net.NetError;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: RecomThemesChooserScene.kt */
/* loaded from: classes4.dex */
public final class saf0 {
    public static final void a(final String str, boolean z, final izs<? super dyq0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(-859503199);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-859503199, i2, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.NextButton (RecomThemesChooserScene.kt:155)");
            }
            q630 E = s200.E(txj0.f(q630.a.a, 1.0f), 16, 12);
            boolean z3 = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new zy2(z2, 2);
                M.R(x);
            }
            q630 b = egi0.b(E, false, (izs) x);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z4 = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new th2(izsVar, 11);
                M.R(x2);
            }
            aVar2 = M;
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, b, null, false, false, null, null, null, str, null, null, null, null, z, null, null, null, aVar2, X2.b.f, ((i2 << 6) & 896) | ((i2 << 18) & 29360128), 0, 4059104);
            z2 = z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, str, izsVar, z2) { // from class: xsna.qaf0
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;

                {
                    this.b = str;
                    this.c = z2;
                    this.d = izsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    saf0.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final izs izsVar, q630 q630Var, SnapshotStateList snapshotStateList, String str2, final String str3, final boolean z, boolean z2, final boolean z3, boolean z4, boolean z5, String str4, String str5, String str6, String str7, String str8, final String str9, final Pair pair, lg90 lg90Var, String str10, Object obj, dsy dsyVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        SnapshotStateList snapshotStateList2;
        int i4;
        String str11;
        int i5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        final q630 q630Var2;
        final boolean z7;
        final boolean z8;
        final String str12;
        final String str13;
        final String str14;
        final lg90 lg90Var2;
        final String str15;
        final Object obj2;
        final dsy dsyVar2;
        final SnapshotStateList snapshotStateList3;
        final String str16;
        final boolean z9;
        androidx.compose.runtime.a aVar2;
        final String str17;
        final String str18;
        androidx.compose.runtime.f s;
        final SnapshotStateList snapshotStateList4;
        final boolean z10;
        final String str19;
        final String str20;
        final String str21;
        final String str22;
        final String str23;
        dsy dsyVar3;
        q630 q630Var3;
        int i29;
        final boolean z11;
        Object obj3;
        final String str24;
        final lg90 lg90Var3;
        final String str25;
        final boolean z12;
        androidx.compose.runtime.a M = aVar.M(268081514);
        int i30 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        int i31 = i30 | 384;
        int i32 = i3 & 8;
        if (i32 != 0) {
            i31 = i30 | 3456;
        } else if ((i & 3072) == 0) {
            snapshotStateList2 = snapshotStateList;
            i31 |= M.J(snapshotStateList2) ? 2048 : 1024;
            i4 = i3 & 16;
            if (i4 == 0) {
                i5 = i31 | 24576;
                str11 = str2;
            } else {
                str11 = str2;
                i5 = i31 | (M.J(str11) ? 16384 : 8192);
            }
            int i33 = 65536;
            int i34 = i5 | (!M.J(str3) ? 131072 : 65536);
            if ((i & 1572864) == 0) {
                i34 |= M.l(z) ? 1048576 : 524288;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i7 = i34 | 12582912;
                z6 = z2;
            } else {
                z6 = z2;
                i7 = i34 | (M.l(z6) ? 8388608 : 4194304);
            }
            if ((i & 100663296) == 0) {
                i7 |= M.l(z3) ? 67108864 : 33554432;
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i9 = i7 | 805306368;
            } else {
                i9 = i7 | (M.l(z4) ? 536870912 : 268435456);
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
                i12 = i2 | 6;
                i11 = i10;
            } else {
                i11 = i10;
                i12 = i2 | (M.l(z5) ? 4 : 2);
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
                i15 = i12 | 48;
                i14 = i13;
            } else {
                i14 = i13;
                i15 = i12 | (M.J(str4) ? 32 : 16);
            }
            int i35 = i15;
            i16 = i3 & 4096;
            if (i16 == 0) {
                i17 = i35 | 384;
            } else {
                i17 = i35 | (M.J(str5) ? 256 : 128);
            }
            i18 = i3 & 8192;
            if (i18 == 0) {
                i19 = i17 | 3072;
            } else {
                i19 = i17 | (M.J(str6) ? 2048 : 1024);
            }
            i20 = i3 & 16384;
            if (i20 == 0) {
                i21 = i19 | 24576;
            } else {
                i21 = i19 | (M.J(str7) ? 16384 : 8192);
            }
            i22 = i3 & 32768;
            if (i22 == 0) {
                i33 = 196608;
            } else if (M.J(str8)) {
                i33 = 131072;
            }
            int i36 = i21 | i33 | (!M.J(str9) ? 1048576 : 524288);
            if ((i2 & 12582912) == 0) {
                i36 |= M.J(pair) ? 8388608 : 4194304;
            }
            i23 = i3 & SQLiteDatabase.OPEN_PRIVATECACHE;
            if (i23 == 0) {
                i24 = i36 | 100663296;
            } else {
                i24 = i36 | ((i2 & 134217728) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 67108864 : 33554432);
            }
            i25 = i3 & 524288;
            if (i25 == 0) {
                i26 = i24 | 805306368;
            } else {
                i26 = i24 | (M.J(str10) ? 536870912 : 268435456);
            }
            i27 = i26;
            int i37 = i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            i28 = (i37 == 0 ? 6 : M.y(obj) ? 4 : 2) | 16;
            if (M.t(i9 & 1, ((i9 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i28 & 19) == 18) ? false : true)) {
                M.h();
                q630Var2 = q630Var;
                z7 = z4;
                z8 = z5;
                str12 = str4;
                str13 = str5;
                str14 = str8;
                lg90Var2 = lg90Var;
                str15 = str10;
                obj2 = obj;
                dsyVar2 = dsyVar;
                snapshotStateList3 = snapshotStateList2;
                str16 = str11;
                z9 = z6;
                aVar2 = M;
                str17 = str6;
                str18 = str7;
            } else {
                M.V();
                int i38 = i & 1;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                q630.a aVar3 = q630.a.a;
                if (i38 == 0 || M.i()) {
                    if (i32 != 0) {
                        Object x = M.x();
                        if (x == c0012a) {
                            x = new SnapshotStateList();
                            M.R(x);
                        }
                        snapshotStateList2 = (SnapshotStateList) x;
                    }
                    if (i4 != 0) {
                        str11 = null;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    boolean z13 = i8 != 0 ? false : z4;
                    boolean z14 = i11 != 0 ? false : z5;
                    String str26 = i14 != 0 ? null : str4;
                    String str27 = i16 != 0 ? null : str5;
                    String str28 = i18 != 0 ? null : str6;
                    String str29 = i20 != 0 ? null : str7;
                    String str30 = i22 != 0 ? null : str8;
                    lg90 lg90Var4 = i23 != 0 ? null : lg90Var;
                    String str31 = i25 != 0 ? null : str10;
                    Object obj4 = i37 != 0 ? null : obj;
                    dsy a = gsy.a(0, 3, M);
                    int i39 = i28 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    snapshotStateList4 = snapshotStateList2;
                    z10 = z13;
                    str19 = str26;
                    str20 = str30;
                    str21 = str27;
                    str22 = str28;
                    str23 = str29;
                    dsyVar3 = a;
                    q630Var3 = aVar3;
                    i29 = i39;
                    z11 = z14;
                    obj3 = obj4;
                    str24 = str31;
                    lg90Var3 = lg90Var4;
                    str25 = str11;
                    z12 = z6;
                } else {
                    M.h();
                    i29 = i28 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    q630Var3 = q630Var;
                    z10 = z4;
                    z11 = z5;
                    str19 = str4;
                    str21 = str5;
                    str22 = str6;
                    str23 = str7;
                    str20 = str8;
                    lg90Var3 = lg90Var;
                    str24 = str10;
                    obj3 = obj;
                    snapshotStateList4 = snapshotStateList2;
                    dsyVar3 = dsyVar;
                    str25 = str11;
                    z12 = z6;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(268081514, i9, i27, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserScene (RecomThemesChooserScene.kt:67)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getHeader().a;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    l5g l5gVar = new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    M.R(l5gVar);
                    x2 = l5gVar;
                }
                long j2 = ((l5g) x2).a;
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = bbk0.b(new jjj(dsyVar3, 1));
                    M.R(x3);
                }
                final mtk0 mtk0Var = (mtk0) x3;
                if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                    j = j2;
                }
                final mtk0 b = lwj0.b(j, jq2.d(300, 0, luo.d, 2), "UserInterestChooserScene2.topBarColor", M, 384, 8);
                if (obj3 != null) {
                    M.K(2073672838);
                    boolean J = M.J(dsyVar3);
                    Object x4 = M.x();
                    if (J || x4 == c0012a) {
                        x4 = new raf0(dsyVar3, null);
                        M.R(x4);
                    }
                    bap.g(obj3, (wzs) x4, M, i29 & 14);
                } else {
                    M.K(2070171512);
                }
                M.j();
                q630 g = txj0.d(aVar3, 1.0f).g(q630Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j3 = ylu0Var2.getBackground().g;
                final dsy dsyVar4 = dsyVar3;
                boolean z15 = z12;
                Object obj5 = obj3;
                phv0.b(g, null, null, null, null, 0, j3, 0L, kai.c(713326534, new yzs() { // from class: xsna.naf0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj7;
                        int intValue = ((Integer) obj8).intValue();
                        if (aVar4.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(713326534, intValue, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserScene.<anonymous> (RecomThemesChooserScene.kt:87)");
                            }
                            q630 d = txj0.d(q630.a.a, 1.0f);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var3 = (ylu0) aVar4.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j4 = ylu0Var3.getBackground().g;
                            final boolean z16 = z12;
                            final String str32 = str22;
                            final String str33 = str23;
                            final izs izsVar2 = izsVar;
                            final String str34 = str3;
                            final lg90 lg90Var5 = lg90Var3;
                            final String str35 = str24;
                            final boolean z17 = z11;
                            final String str36 = str21;
                            final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                            final String str37 = str;
                            final dsy dsyVar5 = dsyVar4;
                            final String str38 = str20;
                            final String str39 = str9;
                            final String str40 = str25;
                            final Pair pair2 = pair;
                            final boolean z18 = z;
                            final boolean z19 = z3;
                            final String str41 = str19;
                            final boolean z20 = z10;
                            final mtk0 mtk0Var2 = mtk0Var;
                            final mtk0 mtk0Var3 = b;
                            uov0.a(d, null, j4, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-282120051, new wzs() { // from class: xsna.paf0
                                /* JADX WARN: Code restructure failed: missing block: B:41:0x0190, code lost:
                                
                                    if (r5 == r4) goto L51;
                                 */
                                @Override // xsna.wzs
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj9, Object obj10) {
                                    izs izsVar3;
                                    a.C0011a.C0012a c0012a2;
                                    izs izsVar4;
                                    String str42;
                                    String str43;
                                    String str44;
                                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj9;
                                    int intValue2 = ((Integer) obj10).intValue();
                                    if (aVar5.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-282120051, intValue2, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserScene.<anonymous>.<anonymous> (RecomThemesChooserScene.kt:91)");
                                        }
                                        q630.a aVar6 = q630.a.a;
                                        q630 d2 = txj0.d(aVar6, 1.0f);
                                        dt1.a.getClass();
                                        cp10 d3 = ja8.d(dt1.a.b, false);
                                        int hashCode = Long.hashCode(n34.n(aVar5));
                                        sy90 D = aVar5.D();
                                        q630 c = qri.c(aVar5, d2);
                                        cri.h7.getClass();
                                        LayoutNode.a aVar7 = cri.a.b;
                                        String str45 = null;
                                        if (aVar5.N() == null) {
                                            n34.r();
                                            throw null;
                                        }
                                        aVar5.H();
                                        if (aVar5.L()) {
                                            aVar5.I(aVar7);
                                        } else {
                                            aVar5.f();
                                        }
                                        cri.a.c cVar = cri.a.f;
                                        k9q0.w(aVar5, d3, cVar);
                                        cri.a.e eVar = cri.a.e;
                                        k9q0.w(aVar5, D, eVar);
                                        Integer valueOf = Integer.valueOf(hashCode);
                                        cri.a.b bVar = cri.a.g;
                                        k9q0.w(aVar5, valueOf, bVar);
                                        cri.a.C2678a c2678a = cri.a.h;
                                        k9q0.t(aVar5, c2678a);
                                        cri.a.d dVar = cri.a.d;
                                        k9q0.w(aVar5, c, dVar);
                                        q630 d4 = txj0.d(aVar6, 1.0f);
                                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar5, 48);
                                        int hashCode2 = Long.hashCode(n34.n(aVar5));
                                        sy90 D2 = aVar5.D();
                                        q630 c2 = qri.c(aVar5, d4);
                                        if (aVar5.N() == null) {
                                            n34.r();
                                            throw null;
                                        }
                                        aVar5.H();
                                        if (aVar5.L()) {
                                            aVar5.I(aVar7);
                                        } else {
                                            aVar5.f();
                                        }
                                        k9q0.w(aVar5, a2, cVar);
                                        k9q0.w(aVar5, D2, eVar);
                                        ur.d(hashCode2, aVar5, bVar, aVar5, c2678a);
                                        k9q0.w(aVar5, c2, dVar);
                                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                            szw.a("invalid weight; must be greater than zero");
                                        }
                                        xpy xpyVar = new xpy(1.0f, true);
                                        izs izsVar5 = izsVar2;
                                        boolean J2 = aVar5.J(izsVar5);
                                        Object x5 = aVar5.x();
                                        a.C0011a.C0012a c0012a3 = a.C0011a.a;
                                        if (J2 || x5 == c0012a3) {
                                            x5 = new owo(izsVar5, 2);
                                            aVar5.R(x5);
                                        }
                                        maf0.a(snapshotStateList5, str37, xpyVar, 0, 0, dsyVar5, (izs) x5, str38, str39, str40, pair2, z18, aVar5, 0);
                                        if (!z19 || (str44 = str41) == null) {
                                            izsVar3 = izsVar5;
                                            aVar5.K(-1100996815);
                                        } else {
                                            aVar5.K(-1096116578);
                                            izsVar3 = izsVar5;
                                            saf0.a(str44, z20, izsVar3, aVar5, 0);
                                        }
                                        aVar5.j();
                                        aVar5.G();
                                        String str46 = str34;
                                        if (str46 != null && !((Boolean) mtk0Var2.getValue()).booleanValue()) {
                                            str45 = str46;
                                        }
                                        if (str45 == null) {
                                            str45 = "";
                                        }
                                        String str47 = str45;
                                        long j5 = ((l5g) mtk0Var3.getValue()).a;
                                        ty6 ty6Var = dt1.a.c;
                                        ra8 ra8Var = ra8.a;
                                        q630 f = txj0.f(ra8Var.b(aVar6, ty6Var), 1.0f);
                                        l5g l5gVar2 = new l5g(j5);
                                        boolean J3 = aVar5.J(izsVar3);
                                        Object x6 = aVar5.x();
                                        if (J3) {
                                            c0012a2 = c0012a3;
                                        } else {
                                            c0012a2 = c0012a3;
                                        }
                                        x6 = new nyg(izsVar3, 4);
                                        aVar5.R(x6);
                                        a.C0011a.C0012a c0012a4 = c0012a2;
                                        izs izsVar6 = izsVar3;
                                        muv0.e(str47, f, l5gVar2, lg90Var5, str35, (gzs) x6, false, null, false, null, aVar5, 4096, 0, 1984);
                                        if (z17) {
                                            aVar5.K(1180975224);
                                            izsVar4 = izsVar6;
                                            saf0.c(0, aVar5, str36, izsVar4, ahn.E(ra8Var.b(s200.E(aVar6, 4, 12), dt1.a.d), "skipBtnThemesTestTag"));
                                        } else {
                                            izsVar4 = izsVar6;
                                            aVar5.K(1175238395);
                                        }
                                        aVar5.j();
                                        aVar5.G();
                                        if (!z16 || (str42 = str32) == null || (str43 = str33) == null) {
                                            aVar5.K(608630613);
                                        } else {
                                            aVar5.K(614885049);
                                            boolean J4 = aVar5.J(izsVar4);
                                            Object x7 = aVar5.x();
                                            if (J4 || x7 == c0012a4) {
                                                x7 = new m87(izsVar4, 6);
                                                aVar5.R(x7);
                                            }
                                            taf0.a(0, aVar5, str42, str43, (gzs) x7, null);
                                        }
                                        aVar5.j();
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar5.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar4), aVar4, 1572870, 58);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 805306368, 382);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z9 = z15;
                q630Var2 = q630Var3;
                obj2 = obj5;
                aVar2 = M;
                str17 = str22;
                str18 = str23;
                lg90Var2 = lg90Var3;
                str15 = str24;
                z8 = z11;
                str13 = str21;
                snapshotStateList3 = snapshotStateList4;
                dsyVar2 = dsyVar4;
                str14 = str20;
                str16 = str25;
                str12 = str19;
                z7 = z10;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.oaf0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int I = ne7.I(i | 1);
                        int I2 = ne7.I(i2);
                        saf0.b(str, izsVar, q630Var2, snapshotStateList3, str16, str3, z, z9, z3, z7, z8, str12, str13, str17, str18, str14, str9, pair, lg90Var2, str15, obj2, dsyVar2, (androidx.compose.runtime.a) obj6, I, I2, i3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        snapshotStateList2 = snapshotStateList;
        i4 = i3 & 16;
        if (i4 == 0) {
        }
        int i332 = 65536;
        int i342 = i5 | (!M.J(str3) ? 131072 : 65536);
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        int i352 = i15;
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        i18 = i3 & 8192;
        if (i18 == 0) {
        }
        i20 = i3 & 16384;
        if (i20 == 0) {
        }
        i22 = i3 & 32768;
        if (i22 == 0) {
        }
        int i362 = i21 | i332 | (!M.J(str9) ? 1048576 : 524288);
        if ((i2 & 12582912) == 0) {
        }
        i23 = i3 & SQLiteDatabase.OPEN_PRIVATECACHE;
        if (i23 == 0) {
        }
        i25 = i3 & 524288;
        if (i25 == 0) {
        }
        i27 = i26;
        int i372 = i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        i28 = (i372 == 0 ? 6 : M.y(obj) ? 4 : 2) | 16;
        if (M.t(i9 & 1, ((i9 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i28 & 19) == 18) ? false : true)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-264667724);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-264667724, i2, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.SkipButton (RecomThemesChooserScene.kt:178)");
            }
            ButtonSize buttonSize = ButtonSize.Medium;
            String str2 = str == null ? "" : str;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new w2(izsVar, 7);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, q630Var, null, false, false, null, null, null, str2, null, null, null, null, true, null, null, null, aVar2, ((i2 << 6) & 57344) | X2.b.f, 12582912, 0, 4059104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new i87(i, str, izsVar, q630Var);
        }
    }
}

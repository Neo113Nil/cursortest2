package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.ImageSizeKey;
import com.vk.games.model.GamesCatalogScreenTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.jdt;
import xsna.q630;
import xsna.udt;

/* compiled from: GamesCatalogContentScreen.kt */
/* loaded from: classes17.dex */
public final class kat {

    /* compiled from: GamesCatalogContentScreen.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamesCatalogScreenTab.values().length];
            try {
                iArr[GamesCatalogScreenTab.CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamesCatalogScreenTab.CATEGORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final jdt.e eVar, final izs izsVar, final GamesCatalogScreenTab gamesCatalogScreenTab, final GamesCatalogScreenTab gamesCatalogScreenTab2, final rha rhaVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(892297161);
        int i3 = 4;
        int i4 = i | (M.J(eVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.o(gamesCatalogScreenTab.ordinal()) ? 256 : 128) | (M.J(rhaVar) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(892297161, i4, -1, "com.vk.games.presentation.catalog.screen.GamesCatalogContentScreen (GamesCatalogContentScreen.kt:41)");
            }
            jdt.d dVar = eVar.a;
            if (dVar.e && dVar.d == null) {
                i2 = i4;
                z = true;
            } else {
                i2 = i4;
                z = false;
            }
            int i5 = i2 & 112;
            boolean z2 = i5 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new com.vk.movika.sdk.base.ui.z(i3, gamesCatalogScreenTab2, izsVar);
                M.R(x);
            }
            int i6 = i2;
            final xvy z3 = crx0.z(z, (gzs) x, 0, M, 0, 60);
            float f = vbh0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-847205740, 0, -1, "com.vk.games.presentation.utils.isHighResolution (ScreenHelper.kt:59)");
            }
            Configuration configuration = (Configuration) M.r(AndroidCompositionLocals_androidKt.a);
            boolean o = M.o(configuration.smallestScreenWidthDp);
            Object x2 = M.x();
            if (o || x2 == c0012a) {
                x2 = Boolean.valueOf(configuration.smallestScreenWidthDp >= 411);
                M.R(x2);
            }
            final boolean booleanValue = ((Boolean) x2).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final float c = vbh0.c(M);
            boolean n = M.n(c);
            Object x3 = M.x();
            if (n || x3 == c0012a) {
                x3 = new pco(0.5625f * c);
                M.R(x3);
            }
            final float f2 = ((pco) x3).b;
            boolean n2 = M.n(c);
            Object x4 = M.x();
            if (n2 || x4 == c0012a) {
                x4 = new pco(0.5f * f2);
                M.R(x4);
            }
            final float f3 = ((pco) x4).b;
            List list = eVar.b.a;
            boolean z4 = i5 == 32;
            Object x5 = M.x();
            if (z4 || x5 == c0012a) {
                x5 = new jh9(izsVar, 2);
                M.R(x5);
            }
            vbh0.a(0, M, list, (izs) x5, z3, gamesCatalogScreenTab == gamesCatalogScreenTab2);
            q630 d = txj0.d(q630Var, 1.0f);
            u890 n3 = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7);
            boolean l = ((57344 & i6) == 16384) | ((i6 & 14) == 4) | (i5 == 32) | M.l(booleanValue) | M.n(c) | M.n(f2) | M.n(f3) | M.J(z3) | ((i6 & 896) == 256);
            Object x6 = M.x();
            if (l || x6 == c0012a) {
                aVar2 = M;
                izs izsVar2 = new izs() { // from class: xsna.hat
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        final xdt d2;
                        String sb;
                        nvy nvyVar = (nvy) obj;
                        jdt.e eVar2 = jdt.e.this;
                        Iterator it = eVar2.b.a.iterator();
                        final int i7 = 0;
                        while (true) {
                            boolean hasNext = it.hasNext();
                            final izs izsVar3 = izsVar;
                            GamesCatalogScreenTab gamesCatalogScreenTab3 = gamesCatalogScreenTab2;
                            if (!hasNext) {
                                ybt.a(nvyVar, eVar2.a.d, new com.vk.voip.a(12, gamesCatalogScreenTab3, izsVar3));
                                return s3q0.a;
                            }
                            Object next = it.next();
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                e43.t();
                                throw null;
                            }
                            dct dctVar = (dct) next;
                            xsx0 xsx0Var = dctVar instanceof xsx0 ? (xsx0) dctVar : null;
                            final rha rhaVar2 = rhaVar;
                            if (xsx0Var != null && (d2 = xsx0Var.d()) != null) {
                                if (rhaVar2.a) {
                                    sb = d2.e;
                                } else {
                                    StringBuilder a2 = vq.a("header_", i7, '_');
                                    a2.append(d2.c);
                                    a2.append('_');
                                    a2.append(d2.d ? '1' : ImageSizeKey.SIZE_KEY_UNDEFINED);
                                    sb = a2.toString();
                                }
                                nvy.g(nvyVar, sb, null, new jai(2093883603, new yzs() { // from class: xsna.jat
                                    @Override // xsna.yzs
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        ksy ksyVar = (ksy) obj2;
                                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        if ((intValue & 6) == 0) {
                                            intValue |= aVar3.J(ksyVar) ? 4 : 2;
                                        }
                                        if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(2093883603, intValue, -1, "com.vk.games.presentation.catalog.screen.GamesCatalogContentScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamesCatalogContentScreen.kt:76)");
                                            }
                                            float f4 = i7 == 0 ? 0 : kqu0.r;
                                            rha rhaVar3 = rhaVar2;
                                            boolean z5 = rhaVar3.d;
                                            q630.a aVar4 = q630.a.a;
                                            xdt xdtVar = d2;
                                            izs izsVar4 = izsVar3;
                                            if (z5) {
                                                aVar3.K(-1218428712);
                                                get.a(xdtVar, rhaVar3, izsVar4, ksy.c(ksyVar, s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 7), aVar3, 0);
                                                aVar3.j();
                                            } else {
                                                aVar3.K(-1217955652);
                                                cet.a(xdtVar, rhaVar3, izsVar4, ksy.c(ksyVar, s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 7), aVar3, 0);
                                                aVar3.j();
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar3.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, true), 2);
                            }
                            final int i9 = i7;
                            final yj00 yj00Var = new yj00(booleanValue, new b7t(c, f2, f3), z3, i9, rhaVar2, gamesCatalogScreenTab3);
                            boolean z5 = rhaVar2.a;
                            final boolean z6 = gamesCatalogScreenTab == gamesCatalogScreenTab3;
                            float f4 = kqu0.r;
                            q630.a aVar3 = q630.a.a;
                            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            boolean z7 = dctVar instanceof udt.d;
                            if (z7 || (dctVar instanceof udt.g) || (dctVar instanceof udt.a)) {
                                final q630 H2 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                if (z7) {
                                    String e = ((udt) dctVar).e(i9, z5);
                                    final udt.d dVar2 = (udt.d) dctVar;
                                    final boolean z8 = z6;
                                    nvy.g(nvyVar, e, null, new jai(-642387636, new yzs() { // from class: xsna.fk00
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            ksy ksyVar = (ksy) obj2;
                                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                                            int intValue = ((Integer) obj4).intValue();
                                            if ((intValue & 6) == 0) {
                                                intValue |= aVar4.J(ksyVar) ? 4 : 2;
                                            }
                                            if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-642387636, intValue, -1, "com.vk.games.presentation.components.addBannerSections.<anonymous> (MapCatalogItemsToView.kt:247)");
                                                }
                                                yj00 yj00Var2 = yj00.this;
                                                zdv.a(izsVar3, (udt.d) dVar2, yj00Var2.b, yj00Var2.c, yj00Var2.e, yj00Var2.a, z8, ksy.c(ksyVar, yj00Var2.d != 0 ? s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13) : H2, 7), aVar4, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar4.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 2);
                                } else if (dctVar instanceof udt.g) {
                                    nvy.g(nvyVar, ((udt) dctVar).e(i9, z5), null, new jai(-1700378493, new eh00(yj00Var, (udt.g) dctVar, izsVar3, H2), true), 2);
                                } else if (dctVar instanceof udt.a) {
                                    String e2 = ((udt) dctVar).e(i9, z5);
                                    final udt.a aVar4 = (udt.a) dctVar;
                                    nvy.g(nvyVar, e2, null, new jai(-2108402108, new yzs() { // from class: xsna.gk00
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            ksy ksyVar = (ksy) obj2;
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                                            int intValue = ((Integer) obj4).intValue();
                                            if ((intValue & 6) == 0) {
                                                intValue |= aVar5.J(ksyVar) ? 4 : 2;
                                            }
                                            if (aVar5.t(intValue & 1, (intValue & 19) != 18)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-2108402108, intValue, -1, "com.vk.games.presentation.components.addBannerSections.<anonymous> (MapCatalogItemsToView.kt:292)");
                                                }
                                                boolean z9 = yj00.this.e.d;
                                                dct dctVar2 = aVar4;
                                                izs izsVar4 = izsVar3;
                                                q630 q630Var2 = H2;
                                                if (z9) {
                                                    aVar5.K(-1805400691);
                                                    f6t.a(((udt.a) dctVar2).b, izsVar4, ksy.c(ksyVar, q630Var2, 7), aVar5, 0);
                                                    aVar5.j();
                                                } else {
                                                    aVar5.K(-1805282767);
                                                    e6t.a(((udt.a) dctVar2).b, izsVar4, ksy.c(ksyVar, q630Var2, 7), aVar5, 0);
                                                    aVar5.j();
                                                }
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 2);
                                }
                            } else {
                                boolean z9 = dctVar instanceof udt.h.b;
                                if (z9 || (dctVar instanceof udt.h.d) || (dctVar instanceof udt.h.a)) {
                                    final boolean z10 = z6;
                                    if (z9) {
                                        String e3 = ((udt) dctVar).e(i9, z5);
                                        final udt.h.b bVar = (udt.h.b) dctVar;
                                        nvy.g(nvyVar, e3, null, new jai(74077857, new yzs() { // from class: xsna.ik00
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                ksy ksyVar = (ksy) obj2;
                                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                                                int intValue = ((Integer) obj4).intValue();
                                                if ((intValue & 6) == 0) {
                                                    intValue |= aVar5.J(ksyVar) ? 4 : 2;
                                                }
                                                if (aVar5.t(intValue & 1, (intValue & 19) != 18)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(74077857, intValue, -1, "com.vk.games.presentation.components.addGamesWithBadgesSections.<anonymous> (MapCatalogItemsToView.kt:319)");
                                                    }
                                                    udt.h.b bVar2 = (udt.h.b) bVar;
                                                    yj00 yj00Var2 = yj00Var;
                                                    qgt.a(bVar2, izsVar3, z10, yj00Var2.c, yj00Var2.e, ksy.c(ksyVar, q630.a.a, 7), i9, aVar5, 0, 0);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar5.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true), 2);
                                    } else if (dctVar instanceof udt.h.d) {
                                        final udt.h.d dVar3 = (udt.h.d) dctVar;
                                        nvy.g(nvyVar, ((udt) dctVar).e(i9, z5), null, new jai(-1028444854, new yzs() { // from class: xsna.jk00
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                ksy ksyVar = (ksy) obj2;
                                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                                                int intValue = ((Integer) obj4).intValue();
                                                if ((intValue & 6) == 0) {
                                                    intValue |= aVar5.J(ksyVar) ? 4 : 2;
                                                }
                                                if (aVar5.t(intValue & 1, (intValue & 19) != 18)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-1028444854, intValue, -1, "com.vk.games.presentation.components.addGamesWithBadgesSections.<anonymous> (MapCatalogItemsToView.kt:336)");
                                                    }
                                                    udt.h.d dVar4 = (udt.h.d) dVar3;
                                                    yj00 yj00Var2 = yj00Var;
                                                    qgt.a(dVar4, izsVar3, z10, yj00Var2.c, yj00Var2.e, ksy.c(ksyVar, q630.a.a, 7), i9, aVar5, 0, 0);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar5.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true), 2);
                                    } else if (dctVar instanceof udt.h.a) {
                                        final udt.h.a aVar5 = (udt.h.a) dctVar;
                                        nvy.g(nvyVar, ((udt) dctVar).e(i9, z5), null, new jai(-2065561431, new yzs() { // from class: xsna.ak00
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                                                int intValue = ((Integer) obj4).intValue();
                                                if (aVar6.t(intValue & 1, (intValue & 17) != 16)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-2065561431, intValue, -1, "com.vk.games.presentation.components.addGamesWithBadgesSections.<anonymous> (MapCatalogItemsToView.kt:353)");
                                                    }
                                                    udt.h hVar = (udt.h) aVar5;
                                                    yj00 yj00Var2 = yj00Var;
                                                    qgt.a(hVar, izsVar3, z10, yj00Var2.c, yj00Var2.e, null, i9, aVar6, 0, 32);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar6.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true), 2);
                                    }
                                } else if (dctVar instanceof udt.e) {
                                    final udt.e eVar3 = (udt.e) dctVar;
                                    nvy.g(nvyVar, ((udt) dctVar).e(i9, z5), null, new jai(-949436644, new yzs() { // from class: xsna.zj00
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            ksy ksyVar = (ksy) obj2;
                                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                                            int intValue = ((Integer) obj4).intValue();
                                            if ((intValue & 6) == 0) {
                                                intValue |= aVar6.J(ksyVar) ? 4 : 2;
                                            }
                                            if (aVar6.t(intValue & 1, (intValue & 19) != 18)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-949436644, intValue, -1, "com.vk.games.presentation.components.MapCatalogItemsToView.<anonymous> (MapCatalogItemsToView.kt:61)");
                                                }
                                                udt.e eVar4 = (udt.e) eVar3;
                                                yj00 yj00Var2 = yj00Var;
                                                bgt.a(eVar4, izsVar3, new eev(yj00Var2.a, yj00Var2.e, yj00Var2.c), z6, ksy.c(ksyVar, q630.a.a, 7), i9, aVar6, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar6.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 2);
                                } else if (dctVar instanceof udt.h.e) {
                                    final udt.h.e eVar4 = (udt.h.e) dctVar;
                                    nvy.g(nvyVar, eVar4.e(i9, z5), null, new jai(-990468427, new yzs() { // from class: xsna.ck00
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            ksy ksyVar = (ksy) obj2;
                                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                                            int intValue = ((Integer) obj4).intValue();
                                            if ((intValue & 6) == 0) {
                                                intValue |= aVar6.J(ksyVar) ? 4 : 2;
                                            }
                                            if (aVar6.t(intValue & 1, (intValue & 19) != 18)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-990468427, intValue, -1, "com.vk.games.presentation.components.parseGamesVerticalHalfCards.<anonymous> (MapCatalogItemsToView.kt:219)");
                                                }
                                                yj00 yj00Var2 = yj00Var;
                                                tft.b(udt.h.e.this, yj00Var2.e, yj00Var2.c, izsVar3, ksy.c(ksyVar, q630.a.a, 7), i9, aVar6, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar6.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 2);
                                } else if (dctVar instanceof udt.h.f) {
                                    final udt.h.f fVar = (udt.h.f) dctVar;
                                    nvy.g(nvyVar, fVar.e(i9, z5), null, new jai(74836209, new yzs() { // from class: xsna.hk00
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            ksy ksyVar = (ksy) obj2;
                                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                                            int intValue = ((Integer) obj4).intValue();
                                            if ((intValue & 6) == 0) {
                                                intValue |= aVar6.J(ksyVar) ? 4 : 2;
                                            }
                                            if (aVar6.t(intValue & 1, (intValue & 19) != 18)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(74836209, intValue, -1, "com.vk.games.presentation.components.parseGamesVerticalList.<anonymous> (MapCatalogItemsToView.kt:171)");
                                                }
                                                yj00 yj00Var2 = yj00.this;
                                                kgt.b(fVar, yj00Var2.e, izsVar3, yj00Var2.c, ksy.c(ksyVar, q630.a.a, 7), i9, aVar6, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar6.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 2);
                                } else if (dctVar instanceof udt.h.c) {
                                    final udt.h.c cVar = (udt.h.c) dctVar;
                                    nvy.g(nvyVar, cVar.e(i9, z5), null, new jai(842851863, new yzs() { // from class: xsna.bk00
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            ksy ksyVar = (ksy) obj2;
                                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                                            int intValue = ((Integer) obj4).intValue();
                                            if ((intValue & 6) == 0) {
                                                intValue |= aVar6.J(ksyVar) ? 4 : 2;
                                            }
                                            if (aVar6.t(intValue & 1, (intValue & 19) != 18)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(842851863, intValue, -1, "com.vk.games.presentation.components.parseGamesAchievementsBlock.<anonymous> (MapCatalogItemsToView.kt:196)");
                                                }
                                                yj00 yj00Var2 = yj00.this;
                                                v8t.h(cVar, yj00Var2.e, izsVar3, yj00Var2.c, ksy.c(ksyVar, q630.a.a, 7), aVar6, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar6.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 2);
                                } else if (dctVar instanceof udt.b) {
                                    ArrayList arrayList = ((udt.b) dctVar).c;
                                    nvyVar.e(arrayList.size(), new kk00(new dk00(z5), arrayList), new lk00(arrayList, 0), new jai(2039820996, new mk00(arrayList, izsVar3, yj00Var), true));
                                } else if (dctVar instanceof udt.f) {
                                    List<r7t> list2 = ((udt.f) dctVar).c;
                                    nvyVar.e(list2.size(), new nk00(new ek00(z5), list2, 0), new rg5(list2, 1), new jai(2039820996, new ok00(list2, izsVar3, yj00Var), true));
                                } else if (dctVar instanceof udt.c) {
                                    nvy.g(nvyVar, ((udt) dctVar).e(i9, z5), null, new jai(-1771807070, new hjl((udt.c) dctVar, yj00Var, H, izsVar3, 1), true), 2);
                                }
                            }
                            i7 = i8;
                        }
                    }
                };
                aVar2.R(izsVar2);
                x6 = izsVar2;
            } else {
                aVar2 = M;
            }
            M = aVar2;
            lqy.a(d, z3, n3, null, null, null, false, null, (izs) x6, M, 384, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iat(eVar, izsVar, gamesCatalogScreenTab, gamesCatalogScreenTab2, rhaVar, q630Var, i);
        }
    }
}

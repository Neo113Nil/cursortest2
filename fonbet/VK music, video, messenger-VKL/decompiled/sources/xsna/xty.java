package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.dt1;
import xsna.q630;

/* compiled from: LazyLayoutPager.kt */
/* loaded from: classes11.dex */
public final class xty {
    /* JADX WARN: Code restructure failed: missing block: B:200:0x039b, code lost:
    
        if (r9.J(r59) != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0451, code lost:
    
        if (r7 == r5) goto L290;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, mc90 mc90Var, final s890 s890Var, final Orientation orientation, h4o0 h4o0Var, final boolean z, final e490 e490Var, int i, final float f, final aa90 aa90Var, d160 d160Var, final izs izsVar, final dt1.b bVar, final dt1.c cVar, final x9k0 x9k0Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        h4o0 h4o0Var2;
        int i6;
        androidx.compose.runtime.a aVar2;
        d160 d160Var2;
        mc90 mc90Var2;
        boolean z2;
        rcy rcyVar;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean J;
        Object x;
        Orientation orientation2;
        Object obj;
        int i7;
        int i8;
        boolean z6;
        yvj yvjVar;
        int i9;
        mc90 mc90Var3;
        rcy rcyVar2;
        boolean l;
        Object obj2;
        boolean z7;
        Object x2;
        boolean J2;
        Object x3;
        wa90 wa90Var;
        rcy rcyVar3;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-572816025);
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.J(q630Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.J(mc90Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.J(s890Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.l(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.o(orientation.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= M.J(h4o0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= M.J(e490Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= M.o(i) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= M.n(f) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i10 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (M.J(aa90Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.y(d160Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= M.J(bVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= M.J(cVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= M.J(x9k0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i11 = i5;
        if (M.t(i10 & 1, ((i10 & 306783379) == 306783378 && (599187 & i11) == 599186) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-572816025, i10, i11, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:106)");
            }
            if (i < 0) {
                xzw.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i);
            }
            int i12 = i10 & 112;
            boolean z8 = i12 == 32;
            Object x4 = M.x();
            Object obj3 = a.C0011a.a;
            if (z8 || x4 == obj3) {
                x4 = new ecm(mc90Var, 18);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            int i13 = i10 >> 3;
            int i14 = i13 & 14;
            int i15 = i11 >> 15;
            int i16 = i14 | (i15 & 112) | (i11 & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1052364153, i16, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:268)");
            }
            wh50 c = androidx.compose.runtime.k.c(jaiVar, M, (i16 >> 3) & 14);
            wh50 c2 = androidx.compose.runtime.k.c(izsVar, M, (i16 >> 6) & 14);
            boolean J3 = ((((i16 & 14) ^ 6) > 4 && M.J(mc90Var)) || (i16 & 6) == 4) | M.J(c) | M.J(c2) | M.J(gzsVar);
            Object x5 = M.x();
            if (J3 || x5 == obj3) {
                hg10 hg10Var = hg10.g;
                z2 = true;
                bv3 bv3Var = new bv3(c, c2, gzsVar, 1);
                jbk0<m9x> jbk0Var = bbk0.a;
                x5 = new wty(new f1m(new com.vk.movika.sdk.base.ui.r0(13, new f1m(bv3Var, hg10Var), mc90Var), hg10Var), mtk0.class, "value", "getValue()Ljava/lang/Object;", 0);
                M.R(x5);
            } else {
                z2 = true;
            }
            rcy rcyVar4 = (rcy) x5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x6 = M.x();
            if (x6 == obj3) {
                x6 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x6);
            }
            yvj yvjVar2 = (yvj) x6;
            boolean z9 = i12 == 32 ? z2 : false;
            Object x7 = M.x();
            if (z9 || x7 == obj3) {
                x7 = new m1i(mc90Var, 23);
                M.R(x7);
            }
            gzs gzsVar2 = (gzs) x7;
            int i17 = i10 >> 9;
            int i18 = (i10 & 65520) | (i17 & 458752) | (i17 & 3670016) | ((i11 << 21) & 29360128);
            int i19 = i11 << 15;
            int i20 = i18 | (i19 & 234881024) | (i19 & 1879048192);
            int i21 = i15 & 14;
            if (androidx.compose.runtime.b.d()) {
                rcyVar = rcyVar4;
                androidx.compose.runtime.b.f(-1294131537, i20, i21, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:61)");
            } else {
                rcyVar = rcyVar4;
            }
            boolean z10 = ((((i20 & 112) ^ 48) > 32 && M.J(mc90Var)) || (i20 & 48) == 32) | ((((i20 & 896) ^ 384) > 256 && M.J(s890Var)) || (i20 & 384) == 256) | ((((i20 & 7168) ^ 3072) > 2048 && M.l(false)) || (i20 & 3072) == 2048) | ((((i20 & 57344) ^ 24576) > 16384 && M.o(orientation.ordinal())) || (i20 & 24576) == 16384) | ((((i20 & 234881024) ^ 100663296) > 67108864 && M.J(bVar)) || (i20 & 100663296) == 67108864) | ((((i20 & 1879048192) ^ 805306368) > 536870912 && M.J(cVar)) || (i20 & 805306368) == 536870912) | ((((i20 & 3670016) ^ 1572864) > 1048576 && M.n(f)) || (i20 & 1572864) == 1048576) | ((((i20 & 29360128) ^ 12582912) > 8388608 && M.J(aa90Var)) || (i20 & 12582912) == 8388608);
            if ((i21 ^ 6) <= 4) {
            }
            if ((i15 & 6) != 4) {
                z3 = false;
                boolean J4 = z10 | z3 | M.J(gzsVar2);
                if (((i20 & 458752) ^ 196608) <= 131072) {
                    i6 = i;
                    if (M.o(i6)) {
                        z4 = J4;
                        z5 = true;
                        J = z4 | z5 | M.J(yvjVar2);
                        x = M.x();
                        if (!J || x == obj3) {
                            orientation2 = orientation;
                            aVar2 = M;
                            obj = obj3;
                            i7 = i12;
                            i8 = -1;
                            z6 = true;
                            yvjVar = yvjVar2;
                            i9 = i14;
                            rcy rcyVar5 = rcyVar;
                            sb90 sb90Var = new sb90(mc90Var, orientation2, s890Var, f, aa90Var, rcyVar5, gzsVar2, cVar, bVar, i6, x9k0Var, yvjVar);
                            mc90Var3 = mc90Var;
                            rcyVar2 = rcyVar5;
                            aVar2.R(sb90Var);
                            x = sb90Var;
                        } else {
                            orientation2 = orientation;
                            yvjVar = yvjVar2;
                            mc90Var3 = mc90Var;
                            aVar2 = M;
                            obj = obj3;
                            i7 = i12;
                            i9 = i14;
                            rcyVar2 = rcyVar;
                            i8 = -1;
                            z6 = true;
                        }
                        oty otyVar = (oty) x;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        Orientation orientation3 = Orientation.Vertical;
                        boolean z11 = orientation2 != orientation3 ? z6 : false;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-786344289, i9, i8, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
                        }
                        l = ((((i9 ^ 6) > 4 || !aVar2.J(mc90Var3)) && (i13 & 6) != 4) ? false : z6) | aVar2.l(z11);
                        Object x8 = aVar2.x();
                        if (l) {
                            obj2 = obj;
                        } else {
                            obj2 = obj;
                        }
                        x8 = new muy(mc90Var3, z11);
                        aVar2.R(x8);
                        luy luyVar = (luy) x8;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        int i22 = i7;
                        z7 = ((i10 & 458752) != 131072 ? z6 : false) | (i22 != 32 ? z6 : false);
                        x2 = aVar2.x();
                        if (!z7 || x2 == obj2) {
                            h4o0Var2 = h4o0Var;
                            x2 = new wc90(h4o0Var2, mc90Var3);
                            aVar2.R(x2);
                        } else {
                            h4o0Var2 = h4o0Var;
                        }
                        wc90 wc90Var = (wc90) x2;
                        fd8 fd8Var = (fd8) aVar2.r(gd8.a);
                        LayoutDirection layoutDirection = (LayoutDirection) aVar2.r(uvi.n);
                        int i23 = i9;
                        aVar2.K(-853904960);
                        J2 = (i22 != 32 ? z6 : false) | aVar2.J(fd8Var) | aVar2.o(layoutDirection.ordinal());
                        x3 = aVar2.x();
                        if (!J2 || x3 == obj2) {
                            x3 = new wa90(mc90Var3, fd8Var, layoutDirection);
                            aVar2.R(x3);
                        }
                        wa90 wa90Var2 = (wa90) x3;
                        aVar2.j();
                        q630.a aVar3 = q630.a.a;
                        if (z) {
                            wa90Var = wa90Var2;
                            rcyVar3 = rcyVar2;
                            aVar2.K(-853054661);
                            aVar2.j();
                            q630Var2 = aVar3;
                        } else {
                            aVar2.K(-853484445);
                            int i24 = i23 | ((i10 >> 21) & 112);
                            if (androidx.compose.runtime.b.d()) {
                                wa90Var = wa90Var2;
                                rcyVar3 = rcyVar2;
                                androidx.compose.runtime.b.f(373558254, i24, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
                            } else {
                                wa90Var = wa90Var2;
                                rcyVar3 = rcyVar2;
                            }
                            boolean z12 = (((((i24 & 14) ^ 6) <= 4 || !aVar2.J(mc90Var3)) && (i24 & 6) != 4) ? false : z6) | (((((i24 & 112) ^ 48) <= 32 || !aVar2.o(i6)) && (i24 & 48) != 32) ? false : z6);
                            Object x9 = aVar2.x();
                            if (z12 || x9 == obj2) {
                                x9 = new va90(mc90Var3, i6);
                                aVar2.R(x9);
                            }
                            va90 va90Var = (va90) x9;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var2 = q6x.y(va90Var, mc90Var3.v, orientation2);
                            aVar2.j();
                        }
                        Orientation orientation4 = orientation2;
                        q630 o = gcd0.o(q630Var.g(mc90Var3.y).g(mc90Var3.w), rcyVar3, luyVar, orientation4, z, (i13 & 7168) | ((i10 >> 6) & 57344) | ((i10 << 6) & 458752));
                        q630 g = !z ? o.g(egi0.b(aVar3, false, new ckh(orientation4 != orientation3 ? z6 : false, mc90Var3, yvjVar))) : o.g(aVar3);
                        mc90 mc90Var4 = mc90Var3;
                        mc90Var2 = mc90Var4;
                        d160Var2 = d160Var;
                        nty.a(rcyVar3, n34.t(sdi.t(g.g(q630Var2), mc90Var4, orientation4, e490Var, z, wc90Var, mc90Var4.p, wa90Var).g(skn0.b(aVar3, mc90Var2, new vty(mc90Var2))), d160Var2, null), mc90Var2.t, otyVar, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    i6 = i;
                }
                z4 = J4;
                if ((i20 & 196608) != 131072) {
                    z5 = false;
                    J = z4 | z5 | M.J(yvjVar2);
                    x = M.x();
                    if (J) {
                    }
                    orientation2 = orientation;
                    aVar2 = M;
                    obj = obj3;
                    i7 = i12;
                    i8 = -1;
                    z6 = true;
                    yvjVar = yvjVar2;
                    i9 = i14;
                    rcy rcyVar52 = rcyVar;
                    sb90 sb90Var2 = new sb90(mc90Var, orientation2, s890Var, f, aa90Var, rcyVar52, gzsVar2, cVar, bVar, i6, x9k0Var, yvjVar);
                    mc90Var3 = mc90Var;
                    rcyVar2 = rcyVar52;
                    aVar2.R(sb90Var2);
                    x = sb90Var2;
                    oty otyVar2 = (oty) x;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    Orientation orientation32 = Orientation.Vertical;
                    if (orientation2 != orientation32) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    l = ((((i9 ^ 6) > 4 || !aVar2.J(mc90Var3)) && (i13 & 6) != 4) ? false : z6) | aVar2.l(z11);
                    Object x82 = aVar2.x();
                    if (l) {
                    }
                    x82 = new muy(mc90Var3, z11);
                    aVar2.R(x82);
                    luy luyVar2 = (luy) x82;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    int i222 = i7;
                    if (i222 != 32) {
                    }
                    z7 = ((i10 & 458752) != 131072 ? z6 : false) | (i222 != 32 ? z6 : false);
                    x2 = aVar2.x();
                    if (z7) {
                    }
                    h4o0Var2 = h4o0Var;
                    x2 = new wc90(h4o0Var2, mc90Var3);
                    aVar2.R(x2);
                    wc90 wc90Var2 = (wc90) x2;
                    fd8 fd8Var2 = (fd8) aVar2.r(gd8.a);
                    LayoutDirection layoutDirection2 = (LayoutDirection) aVar2.r(uvi.n);
                    int i232 = i9;
                    aVar2.K(-853904960);
                    J2 = (i222 != 32 ? z6 : false) | aVar2.J(fd8Var2) | aVar2.o(layoutDirection2.ordinal());
                    x3 = aVar2.x();
                    if (!J2) {
                    }
                    x3 = new wa90(mc90Var3, fd8Var2, layoutDirection2);
                    aVar2.R(x3);
                    wa90 wa90Var22 = (wa90) x3;
                    aVar2.j();
                    q630.a aVar32 = q630.a.a;
                    if (z) {
                    }
                    Orientation orientation42 = orientation2;
                    q630 o2 = gcd0.o(q630Var.g(mc90Var3.y).g(mc90Var3.w), rcyVar3, luyVar2, orientation42, z, (i13 & 7168) | ((i10 >> 6) & 57344) | ((i10 << 6) & 458752));
                    if (!z) {
                    }
                    mc90 mc90Var42 = mc90Var3;
                    mc90Var2 = mc90Var42;
                    d160Var2 = d160Var;
                    nty.a(rcyVar3, n34.t(sdi.t(g.g(q630Var2), mc90Var42, orientation42, e490Var, z, wc90Var2, mc90Var42.p, wa90Var).g(skn0.b(aVar32, mc90Var2, new vty(mc90Var2))), d160Var2, null), mc90Var2.t, otyVar2, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                }
                z5 = true;
                J = z4 | z5 | M.J(yvjVar2);
                x = M.x();
                if (J) {
                }
                orientation2 = orientation;
                aVar2 = M;
                obj = obj3;
                i7 = i12;
                i8 = -1;
                z6 = true;
                yvjVar = yvjVar2;
                i9 = i14;
                rcy rcyVar522 = rcyVar;
                sb90 sb90Var22 = new sb90(mc90Var, orientation2, s890Var, f, aa90Var, rcyVar522, gzsVar2, cVar, bVar, i6, x9k0Var, yvjVar);
                mc90Var3 = mc90Var;
                rcyVar2 = rcyVar522;
                aVar2.R(sb90Var22);
                x = sb90Var22;
                oty otyVar22 = (oty) x;
                if (androidx.compose.runtime.b.d()) {
                }
                Orientation orientation322 = Orientation.Vertical;
                if (orientation2 != orientation322) {
                }
                if (androidx.compose.runtime.b.d()) {
                }
                l = ((((i9 ^ 6) > 4 || !aVar2.J(mc90Var3)) && (i13 & 6) != 4) ? false : z6) | aVar2.l(z11);
                Object x822 = aVar2.x();
                if (l) {
                }
                x822 = new muy(mc90Var3, z11);
                aVar2.R(x822);
                luy luyVar22 = (luy) x822;
                if (androidx.compose.runtime.b.d()) {
                }
                int i2222 = i7;
                if (i2222 != 32) {
                }
                z7 = ((i10 & 458752) != 131072 ? z6 : false) | (i2222 != 32 ? z6 : false);
                x2 = aVar2.x();
                if (z7) {
                }
                h4o0Var2 = h4o0Var;
                x2 = new wc90(h4o0Var2, mc90Var3);
                aVar2.R(x2);
                wc90 wc90Var22 = (wc90) x2;
                fd8 fd8Var22 = (fd8) aVar2.r(gd8.a);
                LayoutDirection layoutDirection22 = (LayoutDirection) aVar2.r(uvi.n);
                int i2322 = i9;
                aVar2.K(-853904960);
                J2 = (i2222 != 32 ? z6 : false) | aVar2.J(fd8Var22) | aVar2.o(layoutDirection22.ordinal());
                x3 = aVar2.x();
                if (!J2) {
                }
                x3 = new wa90(mc90Var3, fd8Var22, layoutDirection22);
                aVar2.R(x3);
                wa90 wa90Var222 = (wa90) x3;
                aVar2.j();
                q630.a aVar322 = q630.a.a;
                if (z) {
                }
                Orientation orientation422 = orientation2;
                q630 o22 = gcd0.o(q630Var.g(mc90Var3.y).g(mc90Var3.w), rcyVar3, luyVar22, orientation422, z, (i13 & 7168) | ((i10 >> 6) & 57344) | ((i10 << 6) & 458752));
                if (!z) {
                }
                mc90 mc90Var422 = mc90Var3;
                mc90Var2 = mc90Var422;
                d160Var2 = d160Var;
                nty.a(rcyVar3, n34.t(sdi.t(g.g(q630Var2), mc90Var422, orientation422, e490Var, z, wc90Var22, mc90Var422.p, wa90Var).g(skn0.b(aVar322, mc90Var2, new vty(mc90Var2))), d160Var2, null), mc90Var2.t, otyVar22, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                }
            }
            z3 = true;
            boolean J42 = z10 | z3 | M.J(gzsVar2);
            if (((i20 & 458752) ^ 196608) <= 131072) {
            }
            z4 = J42;
            if ((i20 & 196608) != 131072) {
            }
            z5 = true;
            J = z4 | z5 | M.J(yvjVar2);
            x = M.x();
            if (J) {
            }
            orientation2 = orientation;
            aVar2 = M;
            obj = obj3;
            i7 = i12;
            i8 = -1;
            z6 = true;
            yvjVar = yvjVar2;
            i9 = i14;
            rcy rcyVar5222 = rcyVar;
            sb90 sb90Var222 = new sb90(mc90Var, orientation2, s890Var, f, aa90Var, rcyVar5222, gzsVar2, cVar, bVar, i6, x9k0Var, yvjVar);
            mc90Var3 = mc90Var;
            rcyVar2 = rcyVar5222;
            aVar2.R(sb90Var222);
            x = sb90Var222;
            oty otyVar222 = (oty) x;
            if (androidx.compose.runtime.b.d()) {
            }
            Orientation orientation3222 = Orientation.Vertical;
            if (orientation2 != orientation3222) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            l = ((((i9 ^ 6) > 4 || !aVar2.J(mc90Var3)) && (i13 & 6) != 4) ? false : z6) | aVar2.l(z11);
            Object x8222 = aVar2.x();
            if (l) {
            }
            x8222 = new muy(mc90Var3, z11);
            aVar2.R(x8222);
            luy luyVar222 = (luy) x8222;
            if (androidx.compose.runtime.b.d()) {
            }
            int i22222 = i7;
            if (i22222 != 32) {
            }
            z7 = ((i10 & 458752) != 131072 ? z6 : false) | (i22222 != 32 ? z6 : false);
            x2 = aVar2.x();
            if (z7) {
            }
            h4o0Var2 = h4o0Var;
            x2 = new wc90(h4o0Var2, mc90Var3);
            aVar2.R(x2);
            wc90 wc90Var222 = (wc90) x2;
            fd8 fd8Var222 = (fd8) aVar2.r(gd8.a);
            LayoutDirection layoutDirection222 = (LayoutDirection) aVar2.r(uvi.n);
            int i23222 = i9;
            aVar2.K(-853904960);
            J2 = (i22222 != 32 ? z6 : false) | aVar2.J(fd8Var222) | aVar2.o(layoutDirection222.ordinal());
            x3 = aVar2.x();
            if (!J2) {
            }
            x3 = new wa90(mc90Var3, fd8Var222, layoutDirection222);
            aVar2.R(x3);
            wa90 wa90Var2222 = (wa90) x3;
            aVar2.j();
            q630.a aVar3222 = q630.a.a;
            if (z) {
            }
            Orientation orientation4222 = orientation2;
            q630 o222 = gcd0.o(q630Var.g(mc90Var3.y).g(mc90Var3.w), rcyVar3, luyVar222, orientation4222, z, (i13 & 7168) | ((i10 >> 6) & 57344) | ((i10 << 6) & 458752));
            if (!z) {
            }
            mc90 mc90Var4222 = mc90Var3;
            mc90Var2 = mc90Var4222;
            d160Var2 = d160Var;
            nty.a(rcyVar3, n34.t(sdi.t(g.g(q630Var2), mc90Var4222, orientation4222, e490Var, z, wc90Var222, mc90Var4222.p, wa90Var).g(skn0.b(aVar3222, mc90Var2, new vty(mc90Var2))), d160Var2, null), mc90Var2.t, otyVar222, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            h4o0Var2 = h4o0Var;
            i6 = i;
            aVar2 = M;
            d160Var2 = d160Var;
            mc90Var2 = mc90Var;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final mc90 mc90Var5 = mc90Var2;
            final d160 d160Var3 = d160Var2;
            final int i25 = i6;
            final h4o0 h4o0Var3 = h4o0Var2;
            s.d = new wzs() { // from class: xsna.uty
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ne7.I(i2 | 1);
                    int I2 = ne7.I(i3);
                    xty.a(q630.this, mc90Var5, s890Var, orientation, h4o0Var3, z, e490Var, i25, f, aa90Var, d160Var3, izsVar, bVar, cVar, x9k0Var, jaiVar, (androidx.compose.runtime.a) obj4, I, I2);
                    return s3q0.a;
                }
            };
        }
    }
}

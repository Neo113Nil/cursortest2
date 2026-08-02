package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.k;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.q630;
import xsna.xrh;

/* compiled from: CommunityTopBarContent.kt */
/* loaded from: classes5.dex */
public final class g4i {
    /* JADX WARN: Code restructure failed: missing block: B:350:0x04b2, code lost:
    
        if (r7.l(r0) == false) goto L221;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(List list, h4i h4iVar, final y89 y89Var, q630 q630Var, final boolean z, final gzs gzsVar, final izs izsVar, izs izsVar2, final izs izsVar3, androidx.compose.runtime.a aVar, final int i) {
        List list2;
        h4i h4iVar2;
        izs izsVar4;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        Object obj;
        mtk0 mtk0Var;
        mtk0 mtk0Var2;
        int i2;
        androidx.compose.runtime.a aVar3;
        CommunityProfileViewState.Data.d dVar;
        a.C0011a.C0012a c0012a;
        int i3;
        int i4;
        TopBar$Middle topBar$Middle;
        boolean d;
        boolean z2;
        int i5;
        int i6;
        Object x;
        Object x2;
        TopBar$Before.e a;
        androidx.compose.runtime.a aVar4;
        com.vk.core.compose.component.topbar.a a2;
        androidx.compose.runtime.a aVar5;
        Object obj2;
        Object obj3;
        d.b bVar;
        int i7;
        d.b bVar2;
        int i8;
        lg90 a3;
        int i9;
        androidx.compose.runtime.a aVar6;
        int i10;
        int i11;
        mtk0 mtk0Var3;
        int i12;
        gzs gzsVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object f4iVar;
        wh50 wh50Var;
        nek0 nek0Var;
        int i13;
        gzs gzsVar3;
        int i14;
        gzs gzsVar4;
        boolean l;
        Object x3;
        tho0 tho0Var;
        boolean J;
        Object x4;
        tho0 tho0Var2;
        int i15;
        Object x5;
        boolean J2;
        Object x6;
        int i16;
        Object x7;
        mtk0<Float> mtk0Var4 = h4iVar.b;
        mtk0<Boolean> mtk0Var5 = h4iVar.c;
        androidx.compose.runtime.a M = aVar.M(1018501267);
        int i17 = i | (M.J(list) ? 4 : 2) | (M.J(h4iVar) ? 32 : 16) | (M.y(y89Var) ? 256 : 128) | 3072 | (M.l(z) ? 16384 : 8192) | (M.y(gzsVar) ? 131072 : 65536) | (M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar2) ? 8388608 : 4194304) | (M.y(izsVar3) ? 67108864 : 33554432);
        if (M.t(i17 & 1, (i17 & 38347923) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1018501267, i17, -1, "com.vk.profile.community.impl.ui.profile.widget.topbar.CommunityTopBarContent (CommunityTopBarContent.kt:68)");
            }
            CommunityProfileViewState.Data.d dVar2 = CommunityProfileViewState.Data.d.b.a;
            if (!list.contains(dVar2)) {
                dVar2 = CommunityProfileViewState.Data.d.c.a;
                if (!list.contains(dVar2)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (obj instanceof CommunityProfileViewState.Data.d.C1627d) {
                                break;
                            }
                        }
                    }
                    if (!(obj instanceof CommunityProfileViewState.Data.d.C1627d)) {
                        obj = null;
                    }
                    dVar2 = (CommunityProfileViewState.Data.d.C1627d) obj;
                }
            }
            CommunityProfileViewState.Data.d dVar3 = dVar2;
            boolean J3 = M.J(mtk0Var4);
            Object x8 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J3 || x8 == c0012a2) {
                x8 = bbk0.b(new drg(h4iVar, 4));
                M.R(x8);
            }
            mtk0 mtk0Var6 = (mtk0) x8;
            if (dVar3 == null) {
                M.K(-1771965597);
                Object x9 = M.x();
                if (x9 == c0012a2) {
                    x9 = new d4i();
                    M.R(x9);
                }
                mtk0Var = (d4i) x9;
                M.j();
            } else {
                M.K(-1771815092);
                boolean J4 = M.J(mtk0Var4) | M.J(h4iVar.e) | M.J(mtk0Var5);
                Object x10 = M.x();
                if (J4 || x10 == c0012a2) {
                    x10 = bbk0.b(new in0(h4iVar, 29));
                    M.R(x10);
                }
                mtk0Var = (mtk0) x10;
                M.j();
            }
            mtk0 mtk0Var7 = mtk0Var;
            boolean booleanValue = dVar3 != null ? ((Boolean) mtk0Var6.getValue()).booleanValue() : true;
            if (list.contains(CommunityProfileViewState.Data.d.h.a)) {
                M.K(-1771231920);
                boolean J5 = M.J(mtk0Var6);
                Object x11 = M.x();
                if (J5 || x11 == c0012a2) {
                    x11 = new z3i(mtk0Var6, 0);
                    M.R(x11);
                }
                gzs gzsVar5 = (gzs) x11;
                int i18 = ((i17 >> 3) & 14) | (i17 & 896);
                if (androidx.compose.runtime.b.d()) {
                    mtk0Var3 = mtk0Var6;
                    i12 = i17;
                    gzsVar2 = gzsVar5;
                    androidx.compose.runtime.b.f(1571697260, i18, -1, "com.vk.profile.community.impl.ui.profile.widget.topbar.resolveSearch (CommunityTopBarContent.kt:160)");
                } else {
                    mtk0Var3 = mtk0Var6;
                    i12 = i17;
                    gzsVar2 = gzsVar5;
                }
                M.K(-1427413755);
                Object x12 = M.x();
                if (x12 == c0012a2) {
                    x12 = or.a("", 0L, 6, M);
                }
                wh50 wh50Var2 = (wh50) x12;
                String N = d370.N(h4iVar.f.getValue().intValue(), 0, M);
                nek0 nek0Var2 = (nek0) M.r(uvi.q);
                vvr vvrVar = (vvr) M.r(uvi.i);
                tho0 tho0Var3 = (tho0) wh50Var2.getValue();
                int i19 = (i18 & 896) ^ 384;
                boolean z6 = (i19 > 256 && M.J(y89Var)) || (i18 & 384) == 256;
                Object x13 = M.x();
                if (z6 || x13 == c0012a2) {
                    x13 = new e4i(y89Var, wh50Var2, null);
                    M.R(x13);
                }
                bap.g(tho0Var3, (wzs) x13, M, 0);
                Boolean value = mtk0Var5.getValue();
                int i20 = (i18 & 14) ^ 6;
                boolean J6 = ((i20 > 4 && M.J(h4iVar)) || (i18 & 6) == 4) | M.J(nek0Var2) | M.y(vvrVar);
                if (i19 <= 256 || !M.J(y89Var)) {
                    z3 = J6;
                    if ((i18 & 384) != 256) {
                        z4 = false;
                        z5 = z3 | z4;
                        Object x14 = M.x();
                        if (!z5 || x14 == c0012a2) {
                            wh50Var = wh50Var2;
                            nek0Var = nek0Var2;
                            i13 = i18;
                            mtk0Var2 = mtk0Var3;
                            i2 = i12;
                            gzsVar3 = gzsVar2;
                            i14 = -1;
                            h4iVar2 = h4iVar;
                            f4iVar = new f4i(h4iVar2, nek0Var, vvrVar, y89Var, wh50Var, null);
                            M.R(f4iVar);
                        } else {
                            i13 = i18;
                            f4iVar = x14;
                            mtk0Var2 = mtk0Var3;
                            i2 = i12;
                            gzsVar3 = gzsVar2;
                            i14 = -1;
                            h4iVar2 = h4iVar;
                            wh50Var = wh50Var2;
                            nek0Var = nek0Var2;
                        }
                        bap.g(value, (wzs) f4iVar, M, 0);
                        if (h4iVar2.a) {
                            M.K(-1728927888);
                            boolean z7 = (i19 > 256 && M.J(y89Var)) || (i13 & 384) == 256;
                            Object x15 = M.x();
                            if (z7 || x15 == c0012a2) {
                                x15 = new defpackage.k(y89Var, 26);
                                M.R(x15);
                            }
                            gzsVar4 = (gzs) x15;
                            M.j();
                        } else {
                            M.K(-1728717120);
                            M.j();
                            gzsVar4 = null;
                        }
                        l = M.l(h4iVar2.d.getValue().booleanValue()) | M.J(mtk0Var5);
                        x3 = M.x();
                        if (!l || x3 == c0012a2) {
                            x3 = bbk0.b(new com.vk.movika.sdk.android.defaultplayer.interactive.a(h4iVar2, 28));
                            M.R(x3);
                        }
                        mtk0 mtk0Var8 = (mtk0) x3;
                        tho0Var = (tho0) wh50Var.getValue();
                        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                        J = M.J(gzsVar3);
                        x4 = M.x();
                        if (!J || x4 == c0012a2) {
                            tho0Var2 = tho0Var;
                            i15 = 0;
                            x4 = new c4i(0, gzsVar3);
                            M.R(x4);
                        } else {
                            tho0Var2 = tho0Var;
                            i15 = 0;
                        }
                        com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2);
                        boolean booleanValue2 = ((Boolean) mtk0Var8.getValue()).booleanValue();
                        x5 = M.x();
                        if (x5 == c0012a2) {
                            x5 = new w3i(i15, wh50Var);
                            M.R(x5);
                        }
                        izs izsVar5 = (izs) x5;
                        J2 = M.J(nek0Var);
                        x6 = M.x();
                        if (!J2 || x6 == c0012a2) {
                            x6 = new trf(nek0Var, 8);
                            M.R(x6);
                        }
                        gzs gzsVar6 = (gzs) x6;
                        i16 = (((i20 > 4 || !M.J(h4iVar2)) && (i13 & 6) != 4) ? i15 : 1) | (((i19 > 256 || !M.J(y89Var)) && (i13 & 384) != 256) ? i15 : 1);
                        x7 = M.x();
                        if (i16 == 0 || x7 == c0012a2) {
                            x7 = new com.vk.libvideo.b(11, h4iVar2, y89Var);
                            M.R(x7);
                        }
                        izs izsVar6 = (izs) x7;
                        gzs gzsVar7 = gzsVar4;
                        i4 = i15;
                        c0012a = c0012a2;
                        i3 = i14;
                        dVar = dVar3;
                        topBar$Middle = TopBar$Middle.b.a.a(N, tho0Var2, izsVar5, null, null, gzsVar7, null, gzsVar6, a4, false, izsVar6, booleanValue2, M, 384, 384, 600);
                        aVar3 = M;
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar3.j();
                    }
                } else {
                    z3 = J6;
                }
                z4 = true;
                z5 = z3 | z4;
                Object x142 = M.x();
                if (z5) {
                }
                wh50Var = wh50Var2;
                nek0Var = nek0Var2;
                i13 = i18;
                mtk0Var2 = mtk0Var3;
                i2 = i12;
                gzsVar3 = gzsVar2;
                i14 = -1;
                h4iVar2 = h4iVar;
                f4iVar = new f4i(h4iVar2, nek0Var, vvrVar, y89Var, wh50Var, null);
                M.R(f4iVar);
                bap.g(value, (wzs) f4iVar, M, 0);
                if (h4iVar2.a) {
                }
                l = M.l(h4iVar2.d.getValue().booleanValue()) | M.J(mtk0Var5);
                x3 = M.x();
                if (!l) {
                }
                x3 = bbk0.b(new com.vk.movika.sdk.android.defaultplayer.interactive.a(h4iVar2, 28));
                M.R(x3);
                mtk0 mtk0Var82 = (mtk0) x3;
                tho0Var = (tho0) wh50Var.getValue();
                SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.Merge;
                J = M.J(gzsVar3);
                x4 = M.x();
                if (J) {
                }
                tho0Var2 = tho0Var;
                i15 = 0;
                x4 = new c4i(0, gzsVar3);
                M.R(x4);
                com.vk.core.compose.component.semantics.a a42 = com.vk.core.compose.component.semantics.b.a(mode2, (izs) x4, 2);
                boolean booleanValue22 = ((Boolean) mtk0Var82.getValue()).booleanValue();
                x5 = M.x();
                if (x5 == c0012a2) {
                }
                izs izsVar52 = (izs) x5;
                J2 = M.J(nek0Var);
                x6 = M.x();
                if (!J2) {
                }
                x6 = new trf(nek0Var, 8);
                M.R(x6);
                gzs gzsVar62 = (gzs) x6;
                i16 = (((i20 > 4 || !M.J(h4iVar2)) && (i13 & 6) != 4) ? i15 : 1) | (((i19 > 256 || !M.J(y89Var)) && (i13 & 384) != 256) ? i15 : 1);
                x7 = M.x();
                if (i16 == 0) {
                }
                x7 = new com.vk.libvideo.b(11, h4iVar2, y89Var);
                M.R(x7);
                izs izsVar62 = (izs) x7;
                gzs gzsVar72 = gzsVar4;
                i4 = i15;
                c0012a = c0012a2;
                i3 = i14;
                dVar = dVar3;
                topBar$Middle = TopBar$Middle.b.a.a(N, tho0Var2, izsVar52, null, null, gzsVar72, null, gzsVar62, a42, false, izsVar62, booleanValue22, M, 384, 384, 600);
                aVar3 = M;
                aVar3.j();
                if (androidx.compose.runtime.b.d()) {
                }
                aVar3.j();
            } else {
                h4iVar2 = h4iVar;
                mtk0Var2 = mtk0Var6;
                i2 = i17;
                aVar3 = M;
                dVar = dVar3;
                c0012a = c0012a2;
                i3 = -1;
                i4 = 0;
                aVar3.K(-1771041084);
                aVar3.j();
                topBar$Middle = TopBar$Middle.a.c;
            }
            q630.a aVar7 = q630.a.a;
            q630 E = ahn.E(txj0.f(aVar7, 1.0f), "community_top_bar_container");
            int i21 = i2 >> 3;
            int i22 = i21 & 112;
            int i23 = ((i2 >> 15) & 14) | i22 | ((i2 >> 18) & 896) | (i21 & 7168);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-253057199, i23, i3, "com.vk.profile.community.impl.ui.profile.widget.topbar.resolveBefore (CommunityTopBarContent.kt:138)");
            }
            if (!((Boolean) gzsVar.invoke()).booleanValue() || z) {
                aVar3.K(1625176337);
                Context context = (Context) aVar3.r(AndroidCompositionLocals_androidKt.b);
                HashSet hashSet = iah0.a;
                d = fnj.d(context);
                aVar3.j();
            } else {
                aVar3.K(-1159193132);
                aVar3.j();
                d = true;
            }
            if (d) {
                aVar3.K(-1159107995);
                aVar3.j();
                aVar4 = aVar3;
                a = null;
            } else {
                aVar3.K(-1159076065);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1616143740, i4, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                }
                lg90 b = or.b(aVar3, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar3, i4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N2 = d370.N(R.string.accessibility_back, i4, aVar3);
                int i24 = ((((i23 & 112) ^ 48) <= 32 || !aVar3.J(y89Var)) && (i23 & 48) != 32) ? i4 : 1;
                if (((i23 & 7168) ^ 3072) > 2048) {
                    z2 = z;
                } else {
                    z2 = z;
                }
                if ((i23 & 3072) != 2048) {
                    i5 = i4;
                    i6 = i24 | i5;
                    x = aVar3.x();
                    if (i6 == 0 || x == c0012a) {
                        x = new b4i(y89Var, z2, i4);
                        aVar3.R(x);
                    }
                    gzs gzsVar8 = (gzs) x;
                    x2 = aVar3.x();
                    if (x2 == c0012a) {
                        x2 = new p60(19);
                        aVar3.R(x2);
                    }
                    androidx.compose.runtime.a aVar8 = aVar3;
                    a = TopBar$Before.e.a.a(b, N2, gzsVar8, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar8, 1572872, 24);
                    aVar4 = aVar8;
                    izsVar3.invoke(a.d());
                    aVar4.j();
                }
                i5 = 1;
                i6 = i24 | i5;
                x = aVar3.x();
                if (i6 == 0) {
                }
                x = new b4i(y89Var, z2, i4);
                aVar3.R(x);
                gzs gzsVar82 = (gzs) x;
                x2 = aVar3.x();
                if (x2 == c0012a) {
                }
                androidx.compose.runtime.a aVar82 = aVar3;
                a = TopBar$Before.e.a.a(b, N2, gzsVar82, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar82, 1572872, 24);
                aVar4 = aVar82;
                izsVar3.invoke(a.d());
                aVar4.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (!booleanValue || mtk0Var5.getValue().booleanValue()) {
                list2 = list;
                androidx.compose.runtime.a aVar9 = aVar4;
                izsVar4 = izsVar2;
                aVar9.K(-1770568303);
                if (dVar == null) {
                    aVar9.K(-1770537862);
                    aVar9.j();
                    aVar5 = aVar9;
                    a2 = null;
                } else {
                    aVar9.K(-1770537861);
                    boolean booleanValue3 = ((Boolean) mtk0Var7.getValue()).booleanValue();
                    Object x16 = aVar9.x();
                    if (x16 == c0012a) {
                        x16 = new wh1(11);
                        aVar9.R(x16);
                    }
                    a2 = d.a.a(new nwm0(dVar, booleanValue3, y89Var, com.vk.core.compose.component.semantics.b.a(null, (izs) x16, 3)), null, null, null, aVar9, 24576, 14);
                    aVar5 = aVar9;
                    aVar5.j();
                }
                aVar5.j();
            } else {
                aVar4.K(-1770707338);
                boolean booleanValue4 = ((Boolean) mtk0Var2.getValue()).booleanValue();
                int i25 = (i2 & 14) | i22 | ((i2 >> 12) & 7168) | ((i2 >> 6) & 57344);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-892354401, i25, -1, "com.vk.profile.community.impl.ui.profile.widget.topbar.resolveAfterActions (CommunityTopBarContent.kt:224)");
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (obj2 instanceof CommunityProfileViewState.Data.d.g) {
                            break;
                        }
                    }
                }
                if (!(obj2 instanceof CommunityProfileViewState.Data.d.g)) {
                    obj2 = null;
                }
                CommunityProfileViewState.Data.d.g gVar = (CommunityProfileViewState.Data.d.g) obj2;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it3.next();
                        if (obj3 instanceof CommunityProfileViewState.Data.d.e) {
                            break;
                        }
                    }
                }
                if (!(obj3 instanceof CommunityProfileViewState.Data.d.e)) {
                    obj3 = null;
                }
                CommunityProfileViewState.Data.d.e eVar = (CommunityProfileViewState.Data.d.e) obj3;
                if (booleanValue4) {
                    list2 = list;
                } else {
                    list2 = list;
                    if (list2.contains(CommunityProfileViewState.Data.d.a.a)) {
                        aVar4.K(1718153727);
                        if (androidx.compose.runtime.b.d()) {
                            i11 = 0;
                            androidx.compose.runtime.b.f(-2089848644, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddSquareOutline28> (VkSdkIcons.kt:66)");
                        } else {
                            i11 = 0;
                        }
                        lg90 b2 = or.b(aVar4, 1165150113, R.drawable.vk_icon_add_square_outline_28, aVar4, i11);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N3 = d370.N(R.string.join_group_short, i11, aVar4);
                        boolean z8 = (((i25 & 112) ^ 48) > 32 && aVar4.J(y89Var)) || (i25 & 48) == 32;
                        Object x17 = aVar4.x();
                        if (z8 || x17 == c0012a) {
                            x17 = new dof(y89Var, 10);
                            aVar4.R(x17);
                        }
                        gzs gzsVar9 = (gzs) x17;
                        Object x18 = aVar4.x();
                        if (x18 == c0012a) {
                            x18 = new g8(15);
                            aVar4.R(x18);
                        }
                        bVar = d.b.a.C0757a.a(b2, N3, gzsVar9, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x18, 3), aVar4, 12582920, 88);
                        aVar4.j();
                        izsVar.invoke(bVar == null ? bVar.d() : null);
                        if (list2.contains(CommunityProfileViewState.Data.d.f.a)) {
                            aVar6 = aVar4;
                            izsVar4 = izsVar2;
                            aVar6.K(1721019119);
                            aVar6.j();
                            a2 = null;
                        } else {
                            aVar4.K(1720383092);
                            if (androidx.compose.runtime.b.d()) {
                                i10 = 0;
                                androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
                            } else {
                                i10 = 0;
                            }
                            lg90 a5 = pg90.a(R.drawable.vk_icon_more_vertical_28, i10, aVar4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            String N4 = d370.N(R.string.accessibility_actions, i10, aVar4);
                            boolean z9 = (((i25 & 112) ^ 48) > 32 && aVar4.J(y89Var)) || (i25 & 48) == 32;
                            Object x19 = aVar4.x();
                            if (z9 || x19 == c0012a) {
                                x19 = new sje(y89Var, 11);
                                aVar4.R(x19);
                            }
                            gzs gzsVar10 = (gzs) x19;
                            Object x20 = aVar4.x();
                            if (x20 == c0012a) {
                                x20 = new mo1(22);
                                aVar4.R(x20);
                            }
                            androidx.compose.runtime.a aVar10 = aVar4;
                            d.c.C0760d a6 = d.c.C0760d.a.a(a5, N4, gzsVar10, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x20, 3), aVar10, 1572872, 24);
                            izsVar4 = izsVar2;
                            izsVar4.invoke(a6.d());
                            a2 = d.a.a(a6, bVar, null, null, aVar10, 24576, 12);
                            aVar6 = aVar10;
                            aVar6.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar6.j();
                        aVar5 = aVar6;
                    }
                }
                if (gVar != null) {
                    aVar4.K(1440913520);
                    if (gVar.a) {
                        aVar4.K(1718684385);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            i9 = 0;
                            androidx.compose.runtime.b.f(1931638786, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-NotificationCheckOutline28> (VkIcons.kt:8178)");
                        } else {
                            i9 = 0;
                        }
                        a3 = or.b(aVar4, 1479427734, R.drawable.vk_icon_notification_check_outline_28, aVar4, i9);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar4.j();
                        i8 = 0;
                    } else {
                        aVar4.K(1718755561);
                        if (androidx.compose.runtime.b.d()) {
                            i8 = 0;
                            androidx.compose.runtime.b.f(-585300996, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Notifications28> (VkSdkIcons.kt:2750)");
                        } else {
                            i8 = 0;
                        }
                        a3 = pg90.a(R.drawable.vk_icon_notifications_28, i8, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar4.j();
                    }
                    String N5 = d370.N(R.string.community_status_button_notifications, i8, aVar4);
                    boolean z10 = (((i25 & 112) ^ 48) > 32 && aVar4.J(y89Var)) || (i25 & 48) == 32;
                    Object x21 = aVar4.x();
                    if (z10 || x21 == c0012a) {
                        x21 = new ncg(y89Var, 8);
                        aVar4.R(x21);
                    }
                    gzs gzsVar11 = (gzs) x21;
                    boolean J7 = aVar4.J(gVar);
                    Object x22 = aVar4.x();
                    if (J7 || x22 == c0012a) {
                        x22 = new qu(gVar, 27);
                        aVar4.R(x22);
                    }
                    bVar = d.b.a.C0757a.a(a3, N5, gzsVar11, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x22, 3), aVar4, 12582920, 88);
                    aVar4.j();
                } else if (eVar != null) {
                    xrh.d.g gVar2 = eVar.a;
                    aVar4.K(1440935832);
                    if (gVar2 != null) {
                        aVar4.K(1719358542);
                        String b3 = gVar2.b();
                        int i26 = (i25 & 112) ^ 48;
                        boolean z11 = (i26 > 32 && aVar4.J(y89Var)) || (i25 & 48) == 32;
                        Object x23 = aVar4.x();
                        if (z11 || x23 == c0012a) {
                            x23 = new ocg(y89Var, 6);
                            aVar4.R(x23);
                        }
                        gzs gzsVar12 = (gzs) x23;
                        boolean z12 = (i26 > 32 && aVar4.J(y89Var)) || (i25 & 48) == 32;
                        Object x24 = aVar4.x();
                        if (z12 || x24 == c0012a) {
                            x24 = new x3i(y89Var, 0);
                            aVar4.R(x24);
                        }
                        bVar2 = new kuh(b3, gzsVar12, (gzs) x24);
                        aVar4.j();
                    } else {
                        aVar4.K(1719827944);
                        if (androidx.compose.runtime.b.d()) {
                            i7 = 0;
                            androidx.compose.runtime.b.f(2048237034, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SettingsOutline28> (VkSdkIcons.kt:3322)");
                        } else {
                            i7 = 0;
                        }
                        lg90 b4 = or.b(aVar4, 429284277, R.drawable.vk_icon_settings_outline_28, aVar4, i7);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N6 = d370.N(R.string.edit_group, i7, aVar4);
                        boolean z13 = (((i25 & 112) ^ 48) > 32 && aVar4.J(y89Var)) || (i25 & 48) == 32;
                        Object x25 = aVar4.x();
                        if (z13 || x25 == c0012a) {
                            x25 = new y3i(y89Var, 0);
                            aVar4.R(x25);
                        }
                        gzs gzsVar13 = (gzs) x25;
                        Object x26 = aVar4.x();
                        if (x26 == c0012a) {
                            x26 = new n82(14);
                            aVar4.R(x26);
                        }
                        d.b a7 = d.b.a.C0757a.a(b4, N6, gzsVar13, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x26, 3), aVar4, 12582920, 88);
                        aVar4.j();
                        bVar2 = a7;
                    }
                    aVar4.j();
                    bVar = bVar2;
                } else {
                    aVar4.K(1720240894);
                    aVar4.j();
                    bVar = null;
                }
                izsVar.invoke(bVar == null ? bVar.d() : null);
                if (list2.contains(CommunityProfileViewState.Data.d.f.a)) {
                }
                if (androidx.compose.runtime.b.d()) {
                }
                aVar6.j();
                aVar5 = aVar6;
            }
            androidx.compose.runtime.a aVar11 = aVar5;
            muv0.h(topBar$Middle, E, k.a.C0761a.a, null, null, a, a2, null, false, 0L, h4iVar2.b, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar11, 384, 0, 7064);
            aVar2 = aVar11;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar7;
        } else {
            list2 = list;
            h4iVar2 = h4iVar;
            izsVar4 = izsVar2;
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final h4i h4iVar3 = h4iVar2;
            final List list3 = list2;
            final izs izsVar7 = izsVar4;
            s.d = new wzs(list3, h4iVar3, y89Var, q630Var2, z, gzsVar, izsVar, izsVar7, izsVar3, i) { // from class: xsna.a4i
                public final /* synthetic */ List b;
                public final /* synthetic */ h4i c;
                public final /* synthetic */ y89 d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ izs h;
                public final /* synthetic */ izs i;
                public final /* synthetic */ izs j;

                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ne7.I(1);
                    g4i.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj4, I);
                    return s3q0.a;
                }
            };
        }
    }
}

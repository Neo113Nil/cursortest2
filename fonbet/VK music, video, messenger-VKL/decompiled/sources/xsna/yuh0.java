package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$PlayingState;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$SubTitleParams;
import com.vk.music.ui.search.history.b;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import xsna.avh0;
import xsna.cri;
import xsna.dt1;
import xsna.muh0;
import xsna.phw;
import xsna.q630;

/* compiled from: SearchHistoryItemCell.kt */
/* loaded from: classes3.dex */
public final class yuh0 {
    /* JADX WARN: Code restructure failed: missing block: B:253:0x012f, code lost:
    
        if (r5 != null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06cc  */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46, types: [xsna.lg90] */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [com.vk.core.compose.component.cell.content.Cell$Middle$d$a] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [com.vk.core.compose.component.cell.content.x] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final pn0 pn0Var, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final gzs gzsVar4, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        String Ab;
        q630.a aVar2;
        int i2;
        int i3;
        SemanticsConfiguration.Mode mode;
        int i4;
        Cell$Left a;
        int i5;
        int i6;
        SearchHistoryItemViewParams$SubTitleParams searchHistoryItemViewParams$SubTitleParams;
        String str;
        SemanticsConfiguration.Mode mode2;
        ?? r6;
        int i7;
        int i8;
        ?? r4;
        String str2;
        int i9;
        ?? r62;
        nuh0 nuh0Var;
        com.vk.core.compose.component.cell.content.o quh0Var;
        com.vk.core.compose.component.cell.content.o oVar;
        com.vk.core.compose.component.cell.content.o a2;
        androidx.compose.runtime.a M = aVar.M(1346124799);
        int i10 = 16;
        int i11 = i | (M.J(pn0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.y(gzsVar3) ? 2048 : 1024) | (M.y(gzsVar4) ? 16384 : 8192) | 196608;
        if (M.t(i11 & 1, (74899 & i11) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1346124799, i11, -1, "com.vk.music.ui.search.history.SearchHistoryItemCell (SearchHistoryItemCell.kt:36)");
            }
            wh50 wh50Var = (wh50) pn0Var.a;
            vtu vtuVar = (vtu) M.r(uvi.l);
            float d = r490.d(R.dimen.search_history_item_height, M);
            boolean z = (i11 & 896) == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ge0(i10, vtuVar, gzsVar2);
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            q630 e = ojc.e(238, null, (gzs) x, gzsVar, txj0.h(aVar3, d));
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new cd10(15);
                M.R(x2);
            }
            q630 b = egi0.b(e, false, (izs) x2);
            zak0 zak0Var = (zak0) wh50Var;
            avh0 avh0Var = ((zuh0) zak0Var.getValue()).a;
            final wh50 wh50Var2 = (wh50) pn0Var.b;
            bpn0 bpn0Var = muh0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(534063820, 0, -1, "com.vk.music.ui.search.history.cellLeft (SearchHistoryCellLeft.kt:43)");
            }
            final float d2 = r490.d(R.dimen.search_history_thumb_size, M);
            int r0 = ((azl) M.r(uvi.h)).r0(d2);
            final String contentDescription = avh0Var.getContentDescription();
            boolean J = M.J(avh0Var);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                List<Thumb> b2 = avh0Var.b();
                if (b2 != null) {
                    Iterator it = b2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Ab = null;
                            break;
                        } else {
                            Ab = ((Thumb) it.next()).Ab(r0, false);
                            if (Ab != null) {
                                break;
                            }
                        }
                    }
                }
                Thumb a3 = avh0Var.a();
                if (a3 != null) {
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    Ab = a3.Ab(r0, false);
                    x3 = Ab;
                    M.R(x3);
                } else {
                    x3 = null;
                    M.R(x3);
                }
            }
            final String str3 = (String) x3;
            if (avh0Var instanceof avh0.b) {
                M.K(2134244316);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2081153608, 0, -1, "com.vk.music.ui.search.history.emptyImage (SearchHistoryCellLeft.kt:197)");
                }
                a = Cell$Left.Main.a.C0731a.a(kai.c(-1667547054, new zzs() { // from class: xsna.luh0
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        q630 q630Var3 = (q630) obj2;
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if ((intValue & 48) == 0) {
                            intValue |= aVar4.J(q630Var3) ? 32 : 16;
                        }
                        if (aVar4.t(intValue & 1, (intValue & 145) != 144)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1667547054, intValue, -1, "com.vk.music.ui.search.history.emptyImage.<anonymous> (SearchHistoryCellLeft.kt:199)");
                            }
                            String str4 = contentDescription;
                            boolean J2 = aVar4.J(str4);
                            Object x4 = aVar4.x();
                            if (J2 || x4 == a.C0011a.a) {
                                x4 = new l9n(str4, 4);
                                aVar4.R(x4);
                            }
                            f9t.e(txj0.q(egi0.b(q630Var3, false, (izs) x4), d2), aVar4, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                aVar2 = aVar3;
                i4 = 0;
                i2 = i11;
                i3 = -1;
                mode = null;
            } else if (avh0Var instanceof avh0.a) {
                M.K(2134249062);
                if (androidx.compose.runtime.b.d()) {
                    i5 = -1;
                    androidx.compose.runtime.b.f(-1555140219, 0, -1, "com.vk.music.ui.search.history.avatarImage (SearchHistoryCellLeft.kt:158)");
                } else {
                    i5 = -1;
                }
                if (str3 == null) {
                    M.K(630155040);
                    a = Cell$Left.Main.a.C0731a.a(kai.c(-1374383980, new zzs() { // from class: xsna.iuh0
                        @Override // xsna.zzs
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            q630 q630Var3 = (q630) obj2;
                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if ((intValue & 48) == 0) {
                                intValue |= aVar4.J(q630Var3) ? 32 : 16;
                            }
                            if (aVar4.t(intValue & 1, (intValue & 145) != 144)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1374383980, intValue, -1, "com.vk.music.ui.search.history.avatarImage.<anonymous> (SearchHistoryCellLeft.kt:161)");
                                }
                                String str4 = contentDescription;
                                boolean J2 = aVar4.J(str4);
                                Object x4 = aVar4.x();
                                if (J2 || x4 == a.C0011a.a) {
                                    x4 = new xj2(str4, 3);
                                    aVar4.R(x4);
                                }
                                q630 q = txj0.q(egi0.b(q630Var3, false, (izs) x4), d2);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                iyk0 iyk0Var = rrv0.a;
                                ylu0 ylu0Var = (ylu0) aVar4.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j = ylu0Var.getBackground().z;
                                uog0 uog0Var = vog0.a;
                                q630 m = hr80.m(q, j, uog0Var);
                                float f = (float) 0.5d;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar4.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                y18 a4 = aqw.a(f, ylu0Var2.getImage().a);
                                f9t.e(r18.b(a4.a, a4.b, m, uog0Var), aVar4, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar4.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M);
                    M.j();
                    aVar2 = aVar3;
                    i6 = i5;
                    i2 = i11;
                    mode = null;
                } else {
                    M.K(630969503);
                    i6 = i5;
                    i2 = i11;
                    aVar2 = aVar3;
                    phw a4 = phw.a.a(fwu0.l(null, str3, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                    boolean J2 = M.J(contentDescription);
                    Object x4 = M.x();
                    if (J2 || x4 == c0012a) {
                        x4 = new yl1(contentDescription, 1);
                        M.R(x4);
                    }
                    mode = null;
                    a = com.vk.core.compose.component.cell.content.e.b(a4, d2, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 100663296, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    M = M;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                i3 = i6;
                i4 = 0;
            } else {
                aVar2 = aVar3;
                i2 = i11;
                i3 = -1;
                mode = null;
                if (!(avh0Var instanceof avh0.c)) {
                    throw alb0.c(2134243151, M);
                }
                M.K(2134255235);
                final float f = ((avh0.c) avh0Var).d;
                if (androidx.compose.runtime.b.d()) {
                    i4 = 0;
                    androidx.compose.runtime.b.f(-541826525, 0, -1, "com.vk.music.ui.search.history.pictureImage (SearchHistoryCellLeft.kt:89)");
                } else {
                    i4 = 0;
                }
                if (str3 == null) {
                    M.K(-1066633896);
                    a = Cell$Left.Main.a.C0731a.a(kai.c(237724594, new zzs() { // from class: xsna.juh0
                        @Override // xsna.zzs
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            q630 q630Var3 = (q630) obj2;
                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if ((intValue & 48) == 0) {
                                intValue |= aVar4.J(q630Var3) ? 32 : 16;
                            }
                            if (aVar4.t(intValue & 1, (intValue & 145) != 144)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(237724594, intValue, -1, "com.vk.music.ui.search.history.pictureImage.<anonymous> (SearchHistoryCellLeft.kt:92)");
                                }
                                String str4 = contentDescription;
                                boolean J3 = aVar4.J(str4);
                                Object x5 = aVar4.x();
                                if (J3 || x5 == a.C0011a.a) {
                                    x5 = new b9t(str4, 2);
                                    aVar4.R(x5);
                                }
                                q630 d3 = sua.d(f, txj0.q(egi0.b(q630Var3, false, (izs) x5), d2), false);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                iyk0 iyk0Var = rrv0.a;
                                ylu0 ylu0Var = (ylu0) aVar4.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630 m = hr80.m(d3, ylu0Var.getBackground().z, vog0.b(r490.d(R.dimen.search_history_rounded_image_corner, aVar4)));
                                float f2 = (float) 0.5d;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar4.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                y18 a5 = aqw.a(f2, ylu0Var2.getImage().a);
                                f9t.e(r18.b(a5.a, a5.b, m, vog0.b(r490.d(R.dimen.search_history_rounded_image_corner, aVar4))), aVar4, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar4.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M);
                    M.j();
                } else {
                    M.K(-1065585445);
                    a = Cell$Left.Main.a.C0731a.a(kai.c(1161498505, new zzs() { // from class: xsna.kuh0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.zzs
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            q630 q630Var3 = (q630) obj2;
                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if ((intValue & 48) == 0) {
                                intValue |= aVar4.J(q630Var3) ? 32 : 16;
                            }
                            if (aVar4.t(intValue & 1, (intValue & 145) != 144)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1161498505, intValue, -1, "com.vk.music.ui.search.history.pictureImage.<anonymous> (SearchHistoryCellLeft.kt:115)");
                                }
                                q630 d3 = rte0.d(sua.d(f, txj0.q(q630Var3, d2), false), vog0.b(r490.d(R.dimen.search_history_rounded_image_corner, aVar4)));
                                float f2 = (float) 0.5d;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                y18 a5 = aqw.a(f2, ylu0Var.getImage().a);
                                q630 b3 = r18.b(a5.a, a5.b, d3, vog0.b(r490.d(R.dimen.search_history_rounded_image_corner, aVar4)));
                                dt1.a.getClass();
                                cp10 d4 = ja8.d(dt1.a.f, false);
                                int hashCode = Long.hashCode(n34.n(aVar4));
                                sy90 D = aVar4.D();
                                q630 c = qri.c(aVar4, b3);
                                cri.h7.getClass();
                                LayoutNode.a aVar5 = cri.a.b;
                                if (aVar4.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar4.H();
                                if (aVar4.L()) {
                                    aVar4.I(aVar5);
                                } else {
                                    aVar4.f();
                                }
                                k9q0.w(aVar4, d4, cri.a.f);
                                k9q0.w(aVar4, D, cri.a.e);
                                k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar4, cri.a.h);
                                k9q0.w(aVar4, c, cri.a.d);
                                lg90 l = fwu0.l(null, str3, null, null, aVar4, 0, 61);
                                q630.a aVar6 = q630.a.a;
                                q630 d5 = txj0.d(aVar6, 1.0f);
                                Object x5 = aVar4.x();
                                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                if (x5 == c0012a2) {
                                    x5 = new ow60(12);
                                    aVar4.R(x5);
                                }
                                r0v0.a(l, d5, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), contentDescription, aVar4, 56, 60);
                                wh50 wh50Var3 = wh50Var2;
                                if (muh0.a.$EnumSwitchMapping$0[((SearchHistoryItemViewParams$PlayingState) wh50Var3.getValue()).ordinal()] == 1) {
                                    aVar4.K(137711955);
                                    aVar4.j();
                                } else {
                                    aVar4.K(-25852421);
                                    q630 d6 = txj0.d(aVar6, 1.0f);
                                    Object x6 = aVar4.x();
                                    if (x6 == c0012a2) {
                                        x6 = new juz(27);
                                        aVar4.R(x6);
                                    }
                                    n6b0.a((s5b0) muh0.a.getValue(), wh50Var3.getValue() == SearchHistoryItemViewParams$PlayingState.ACTIVE, egi0.b(d6, false, (izs) x6), aVar4, 0);
                                    aVar4.j();
                                }
                                aVar4.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar4.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M);
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-963444887, i4, i3, "com.vk.music.ui.search.history.cellMiddle (SearchHistoryCellMiddle.kt:25)");
            }
            bvh0 bvh0Var = ((zuh0) zak0Var.getValue()).c;
            SearchHistoryItemViewParams$SubTitleParams searchHistoryItemViewParams$SubTitleParams2 = ((zuh0) zak0Var.getValue()).d;
            String str4 = bvh0Var.a;
            String str5 = str4 == null ? "" : str4;
            if (epx.f(bvh0Var.b, Boolean.TRUE)) {
                M.K(1280201463);
                String N = d370.N(R.string.music_talkback_explicit, i4, M);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1109353856, i4, i3, "com.vk.core.compose.icons.generated.VkIcons.<get-ErrorCircle16> (VkIcons.kt:2380)");
                }
                lg90 a5 = pg90.a(R.drawable.vk_icon_error_circle_16, i4, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i4, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().l;
                searchHistoryItemViewParams$SubTitleParams = searchHistoryItemViewParams$SubTitleParams2;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                mode2 = null;
                com.vk.core.compose.component.cell.content.x a6 = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(a5, j, N, null, M, 24584, 8);
                M.j();
                r6 = a6;
            } else {
                searchHistoryItemViewParams$SubTitleParams = searchHistoryItemViewParams$SubTitleParams2;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                mode2 = mode;
                M.K(1280517725);
                M.j();
                r6 = mode2;
            }
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new f1s(28);
                M.R(x5);
            }
            SemanticsConfiguration.Mode mode3 = mode2;
            androidx.compose.runtime.a aVar4 = M;
            Cell$Left cell$Left = a;
            SearchHistoryItemViewParams$SubTitleParams searchHistoryItemViewParams$SubTitleParams3 = searchHistoryItemViewParams$SubTitleParams;
            com.vk.core.compose.component.cell.content.h1 a7 = Cell$Middle.d.b.a(str5, null, r6, 1, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x5, 3), null, aVar4, 12610560, 66);
            androidx.compose.runtime.a aVar5 = aVar4;
            String str6 = searchHistoryItemViewParams$SubTitleParams3.a;
            String str7 = str6 != null ? str6 : "";
            if (androidx.compose.runtime.b.d()) {
                i7 = -1;
                i8 = 0;
                androidx.compose.runtime.b.f(-1551827118, 0, -1, "com.vk.music.ui.search.history.resolveIcon (SearchHistoryCellMiddle.kt:80)");
            } else {
                i7 = -1;
                i8 = 0;
            }
            SearchHistoryItemViewParams$SubTitleParams.IconType iconType = searchHistoryItemViewParams$SubTitleParams3.b;
            if ((iconType == null ? i7 : com.vk.music.ui.search.history.a.$EnumSwitchMapping$0[iconType.ordinal()]) == 1) {
                aVar5.K(-952202311);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(211860606, i8, i7, "com.vk.core.compose.icons.generated.VkIcons.<get-Video12> (VkIcons.kt:11454)");
                }
                lg90 a8 = pg90.a(R.drawable.vk_icon_video_12, i8, aVar5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                r4 = a8;
            } else {
                aVar5.K(546523147);
                aVar5.j();
                r4 = mode3;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (r4 == 0) {
                aVar5.K(1280891212);
                aVar5.j();
                r62 = mode3;
                str2 = str;
                i9 = 1040687336;
            } else {
                aVar5.K(1280891213);
                str2 = str;
                if (androidx.compose.runtime.b.d()) {
                    i9 = 1040687336;
                    androidx.compose.runtime.b.f(1040687336, i8, i7, str2);
                } else {
                    i9 = 1040687336;
                }
                ylu0 ylu0Var2 = (ylu0) aVar5.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                com.vk.core.compose.component.cell.content.x a9 = com.vk.core.compose.component.cell.content.h.a(r4, ylu0Var2.getIcon().n, aVar5, 24584, 12);
                aVar5 = aVar5;
                aVar5.j();
                r62 = a9;
            }
            Object x6 = aVar5.x();
            if (x6 == c0012a) {
                x6 = new jz30(12);
                aVar5.R(x6);
            }
            int i12 = i7;
            nuh0 nuh0Var2 = new nuh0(a7, Cell$Middle.c.b.b(str7, 1, r62, null, com.vk.core.compose.component.semantics.b.a(mode3, (izs) x6, 3), aVar5, 12583344, 80));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i13 = (i2 >> 6) & 1008;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2011833322, i13, i12, "com.vk.music.ui.search.history.cellRight (SearchHistoryCellRight.kt:48)");
            }
            SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams = ((zuh0) zak0Var.getValue()).f;
            SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams2 = ((zuh0) zak0Var.getValue()).e;
            gzs gzsVar5 = searchHistoryItemViewParams$ActionIconParams.b ? gzsVar4 : null;
            gzs gzsVar6 = searchHistoryItemViewParams$ActionIconParams2.b ? gzsVar3 : null;
            float d3 = r490.d(R.dimen.search_history_icons_size, aVar5);
            long b3 = byc0.b(d3, d3);
            SearchHistoryItemViewParams$ActionIconParams.IconType iconType2 = searchHistoryItemViewParams$ActionIconParams.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(i9, 0, i12, str2);
            }
            ylu0 ylu0Var3 = (ylu0) aVar5.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var3.getIcon().l;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-119707300, 0, i12, "com.vk.music.ui.search.history.toCellRight (SearchHistoryCellRight.kt:81)");
            }
            switch (b.a.$EnumSwitchMapping$0[iconType2.ordinal()]) {
                case 1:
                    nuh0Var = nuh0Var2;
                    aVar5.K(925411764);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-70757580, 0, -1, "com.vk.music.ui.search.history.moreIconCell (SearchHistoryCellRight.kt:129)");
                    }
                    String N2 = d370.N(R.string.music_talkback_more, 0, aVar5);
                    Object x7 = aVar5.x();
                    if (x7 == c0012a) {
                        x7 = ir.h(aVar5);
                    }
                    sg50 sg50Var = (sg50) x7;
                    boolean p = aVar5.p(b3);
                    Object x8 = aVar5.x();
                    if (p || x8 == c0012a) {
                        x8 = qer0.a(b3 != 9205357640488583168L ? Math.max(uco.c(b3), uco.b(b3)) : uco.c(9205357640488583168L), 4, 0L, false);
                        aVar5.R(x8);
                    }
                    quh0Var = new quh0(zak0Var, b3, gzsVar5, sg50Var, (guw) x8, N2, j2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar5.j();
                    oVar = quh0Var;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar6 = aVar5;
                    wiu0.b(b, false, cell$Left, nuh0Var, oVar, null, null, aVar6, 0, 98);
                    M = aVar6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var2 = aVar2;
                    break;
                case 2:
                    nuh0Var = nuh0Var2;
                    aVar5.K(925418516);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1815413276, 0, -1, "com.vk.music.ui.search.history.moreWithPreActionCell (SearchHistoryCellRight.kt:180)");
                    }
                    Object x9 = aVar5.x();
                    if (x9 == c0012a) {
                        x9 = ir.h(aVar5);
                    }
                    sg50 sg50Var2 = (sg50) x9;
                    Object x10 = aVar5.x();
                    if (x10 == c0012a) {
                        x10 = ir.h(aVar5);
                    }
                    sg50 sg50Var3 = (sg50) x10;
                    boolean p2 = aVar5.p(b3);
                    Object x11 = aVar5.x();
                    if (p2 || x11 == c0012a) {
                        mlg0 a10 = qer0.a(b3 != 9205357640488583168L ? Math.max(uco.c(b3), uco.b(b3)) : uco.c(9205357640488583168L), 4, 0L, false);
                        aVar5.R(a10);
                        x11 = a10;
                    }
                    guw guwVar = (guw) x11;
                    boolean p3 = aVar5.p(b3);
                    Object x12 = aVar5.x();
                    if (p3 || x12 == c0012a) {
                        x12 = qer0.a(b3 != 9205357640488583168L ? Math.max(uco.c(b3), uco.b(b3)) : uco.c(9205357640488583168L), 4, 0L, false);
                        aVar5.R(x12);
                    }
                    quh0Var = new com.vk.music.ui.search.history.c(zak0Var, b3, gzsVar6, sg50Var2, guwVar, gzsVar5, sg50Var3, (guw) x12, j2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar5.j();
                    oVar = quh0Var;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    androidx.compose.runtime.a aVar62 = aVar5;
                    wiu0.b(b, false, cell$Left, nuh0Var, oVar, null, null, aVar62, 0, 98);
                    M = aVar62;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var2 = aVar2;
                    break;
                case 3:
                    nuh0Var = nuh0Var2;
                    aVar5.K(925427118);
                    a2 = o.b.a.a(null, null, j2, false, aVar5, 196608, 23);
                    aVar5.j();
                    oVar = a2;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    androidx.compose.runtime.a aVar622 = aVar5;
                    wiu0.b(b, false, cell$Left, nuh0Var, oVar, null, null, aVar622, 0, 98);
                    M = aVar622;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var2 = aVar2;
                    break;
                case 4:
                    nuh0Var = nuh0Var2;
                    aVar5.K(925430285);
                    qzu0.a.getClass();
                    androidx.compose.runtime.a aVar7 = aVar5;
                    a2 = com.vk.music.ui.search.history.b.b(qzu0.a(aVar5), b3, j2, R.string.music_radio_talkback_follow, gzsVar5, aVar7);
                    aVar5 = aVar7;
                    aVar5.j();
                    oVar = a2;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    androidx.compose.runtime.a aVar6222 = aVar5;
                    wiu0.b(b, false, cell$Left, nuh0Var, oVar, null, null, aVar6222, 0, 98);
                    M = aVar6222;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var2 = aVar2;
                    break;
                case 5:
                    aVar5.K(925439416);
                    qzu0.a.getClass();
                    androidx.compose.runtime.a aVar8 = aVar5;
                    nuh0Var = nuh0Var2;
                    a2 = com.vk.music.ui.search.history.b.b(qzu0.u(aVar5), b3, j2, R.string.music_radio_talkback_unfollow, gzsVar5, aVar8);
                    aVar5 = aVar8;
                    aVar5.j();
                    oVar = a2;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    androidx.compose.runtime.a aVar62222 = aVar5;
                    wiu0.b(b, false, cell$Left, nuh0Var, oVar, null, null, aVar62222, 0, 98);
                    M = aVar62222;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var2 = aVar2;
                    break;
                case 6:
                    aVar5.K(-1375863231);
                    aVar5.j();
                    nuh0Var = nuh0Var2;
                    oVar = null;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    androidx.compose.runtime.a aVar622222 = aVar5;
                    wiu0.b(b, false, cell$Left, nuh0Var, oVar, null, null, aVar622222, 0, 98);
                    M = aVar622222;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var2 = aVar2;
                    break;
                default:
                    throw alb0.c(925411043, aVar5);
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gzsVar, gzsVar2, gzsVar3, gzsVar4, q630Var2, i) { // from class: xsna.xuh0
                public final /* synthetic */ gzs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    yuh0.a(pn0.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}

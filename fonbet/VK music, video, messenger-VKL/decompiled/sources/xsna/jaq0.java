package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.gna;
import xsna.q630;
import xsna.q8z;
import xsna.skp;
import xsna.tlo0;
import xsna.us2;

/* compiled from: UploadCellItem.kt */
/* loaded from: classes17.dex */
public final class jaq0 {
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0342, code lost:
    
        if (r3 == r0) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0660  */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.vk.core.compose.component.cell.content.o] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final hze hzeVar, final izs izsVar, final izs izsVar2, q630 q630Var, final wzs wzsVar, final izs izsVar3, izs izsVar4, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        skp skpVar;
        int i2;
        Cell$Left cell$Left;
        Context context;
        StringBuilder sb;
        int i3;
        String str;
        SemanticsConfiguration.Mode mode;
        char c;
        a.C0011a.C0012a c0012a;
        int i4;
        int i5;
        String str2;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        Object obj;
        int i6;
        Object obj2;
        Cell$Left d;
        final izs izsVar5 = izsVar4;
        androidx.compose.runtime.a M = aVar.M(-1099990500);
        int i7 = i | (M.J(hzeVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | 3072 | (M.y(wzsVar) ? 16384 : 8192) | (M.y(izsVar3) ? 131072 : 65536) | (M.y(izsVar5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i7 & 1, (599187 & i7) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1099990500, i7, -1, "com.vk.clips.upload.ui.impl.compose.views.CellContent (UploadCellItem.kt:120)");
            }
            Context context2 = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            int i8 = i7 & 112;
            boolean z = i8 == 32;
            int i9 = i7 & 14;
            boolean z2 = z | (i9 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a2) {
                x2 = new ew3(22, izsVar, hzeVar);
                M.R(x2);
            }
            q630.a aVar2 = q630.a.a;
            q630 b = ojc.b(aVar2, sg50Var, null, false, null, (gzs) x2, 28);
            boolean z3 = hzeVar.f;
            skp skpVar2 = hzeVar.e;
            gna gnaVar = hzeVar.b;
            if (!z3) {
                b = b.g(o19.a(aVar2, 0.64f));
            }
            q630 E = ahn.E(b, hzeVar.i);
            if (gnaVar instanceof gna.d) {
                skpVar = skpVar2;
                i2 = -1;
                M.K(784710954);
                M.j();
                cell$Left = null;
            } else {
                M.K(784339915);
                if (gnaVar instanceof gna.b) {
                    M.K(-528885632);
                    d = d((lg90) ((gna.b) gnaVar).a.invoke(M, 0), M, 8);
                    M.j();
                } else if (gnaVar instanceof gna.c) {
                    M.K(-528882835);
                    d = d(pg90.a(((gna.c) gnaVar).a, 0, M), M, 8);
                    M.j();
                } else {
                    if (gnaVar instanceof gna.a) {
                        M.K(-528879680);
                        jai jaiVar = ((gna.a) gnaVar).a;
                        if (androidx.compose.runtime.b.d()) {
                            skpVar = skpVar2;
                            i2 = -1;
                            androidx.compose.runtime.b.f(138243218, 0, -1, "com.vk.clips.upload.ui.impl.compose.views.wrapCustom (UploadCellItem.kt:221)");
                        } else {
                            skpVar = skpVar2;
                            i2 = -1;
                        }
                        haq0 haq0Var = new haq0(jaiVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        d = haq0Var;
                    } else {
                        skpVar = skpVar2;
                        i2 = -1;
                        M.K(-528877742);
                        d = d(ugp.g, M, ugp.h);
                        M.j();
                    }
                    M.j();
                    cell$Left = d;
                }
                skpVar = skpVar2;
                i2 = -1;
                M.j();
                cell$Left = d;
            }
            int i10 = i2;
            skp skpVar3 = skpVar;
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(hzeVar.c.a(context2).toString(), null, null, 0, null, null, M, 12607488, 110);
            androidx.compose.runtime.a aVar3 = M;
            tlo0 tlo0Var = hzeVar.d;
            if (tlo0Var == null) {
                aVar3.K(785002880);
                aVar3.j();
                context = context2;
                i3 = i7;
                i4 = 1040687336;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                c0012a = c0012a2;
                i5 = 3;
                mode = null;
                h1Var = null;
            } else {
                aVar3.K(785002881);
                int i11 = ((i7 << 6) & 896) | ((i7 >> 3) & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-847459875, i11, i10, "com.vk.clips.upload.ui.impl.compose.views.subtitleContent (UploadCellItem.kt:250)");
                }
                us2.b b2 = xga0.b(1634854887, aVar3);
                StringBuilder sb2 = b2.b;
                b2.g(tlo0Var.a(context2).toString());
                cna cnaVar = hzeVar.h;
                if (cnaVar == null) {
                    aVar3.K(-1514647821);
                    aVar3.j();
                    context = context2;
                    i3 = i7;
                    str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    c0012a = c0012a2;
                    mode = null;
                    c = 256;
                } else {
                    aVar3.K(-1514647820);
                    aVar3.K(1198068112);
                    CharSequence a2 = tlo0.b.a(cnaVar.a, context2);
                    b2.g(" ");
                    int length = sb2.length();
                    context = context2;
                    if (androidx.compose.runtime.b.d()) {
                        sb = sb2;
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        sb = sb2;
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar3.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int m = b2.m(new hik0(ylu0Var.getText().f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        b2.f(a2);
                        b2.k(m);
                        int length2 = sb.length();
                        String str3 = cnaVar.b;
                        i3 = i7;
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        mode = null;
                        tjo0 tjo0Var = new tjo0(new hik0(ylu0Var2.getText().f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, (hik0) null, 14);
                        c = 256;
                        boolean J = ((((i11 & 7168) ^ 3072) > 2048 && aVar3.J(wzsVar)) || (i11 & 3072) == 2048) | ((((i11 & 896) ^ 384) > 256 && aVar3.J(hzeVar)) || (i11 & 384) == 256) | aVar3.J(cnaVar);
                        Object x3 = aVar3.x();
                        if (J) {
                            c0012a = c0012a2;
                        } else {
                            c0012a = c0012a2;
                        }
                        x3 = new daq0(wzsVar, hzeVar, cnaVar, 0);
                        aVar3.R(x3);
                        b2.b(new q8z.b(str3, tjo0Var, (i9z) x3), length, length2);
                        aVar3.j();
                        aVar3.j();
                    } catch (Throwable th) {
                        b2.k(m);
                        throw th;
                    }
                }
                us2 n = b2.n();
                aVar3.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Object x4 = aVar3.x();
                if (x4 == c0012a) {
                    x4 = new eyp0(1);
                    aVar3.R(x4);
                }
                com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 3);
                String str4 = str;
                i4 = 1040687336;
                i5 = 3;
                str2 = str4;
                com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.c.b.a(n, null, 3, 2, null, null, a3, null, aVar3, 805309824, 434);
                aVar3 = aVar3;
                aVar3.j();
                h1Var = a4;
            }
            Object x5 = aVar3.x();
            if (x5 == c0012a) {
                x5 = new n0m0(7);
                aVar3.R(x5);
            }
            com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(a, h1Var, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, i5), aVar3, 196608, 12);
            if (epx.f(skpVar3, skp.a.a)) {
                aVar3.K(785676325);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(i4, 0, -1, str2);
                }
                ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var3.getIcon().l;
                Object x6 = aVar3.x();
                if (x6 == c0012a) {
                    x6 = new p6e0(10);
                    aVar3.R(x6);
                }
                com.vk.core.compose.component.semantics.a a6 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x6, i5);
                boolean z4 = (i8 == 32) | (i9 == 4);
                Object x7 = aVar3.x();
                if (z4 || x7 == c0012a) {
                    x7 = new cy0(29, izsVar, hzeVar);
                    aVar3.R(x7);
                }
                androidx.compose.runtime.a aVar4 = aVar3;
                Object a7 = o.b.a.a((gzs) x7, a6, j, false, aVar4, 196608, 18);
                aVar3 = aVar4;
                aVar3.j();
                obj2 = a7;
            } else if (epx.f(skpVar3, skp.e.a)) {
                aVar3.K(786021417);
                if (androidx.compose.runtime.b.d()) {
                    i6 = 0;
                    androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                } else {
                    i6 = 0;
                }
                lg90 b3 = or.b(aVar3, 1833859693, R.drawable.vk_icon_cancel_24, aVar3, i6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(i4, i6, -1, str2);
                }
                ylu0 ylu0Var4 = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var4.getIcon().l;
                float f = 24;
                long b4 = byc0.b(f, f);
                String N = d370.N(R.string.clips_publish_remove_attachment_a11y, 0, aVar3);
                Object x8 = aVar3.x();
                if (x8 == c0012a) {
                    x8 = new nc90(20);
                    aVar3.R(x8);
                }
                com.vk.core.compose.component.semantics.a a8 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x8, i5);
                boolean z5 = ((i3 & 896) == 256) | (i9 == 4);
                Object x9 = aVar3.x();
                if (z5 || x9 == c0012a) {
                    x9 = new com.vk.movika.tools.controls.seekbar.f(23, izsVar2, hzeVar);
                    aVar3.R(x9);
                }
                androidx.compose.runtime.a aVar5 = aVar3;
                Object a9 = com.vk.core.compose.component.cell.content.p.a(b3, j2, b4, N, (gzs) x9, a8, aVar5, 1573256, 0);
                aVar3 = aVar5;
                aVar3.j();
                obj2 = a9;
            } else {
                int i12 = i3;
                if (skpVar3 instanceof skp.f) {
                    aVar3.K(-528816866);
                    boolean z6 = ((skp.f) skpVar3).a;
                    boolean z7 = ((458752 & i12) == 131072) | (i9 == 4);
                    Object x10 = aVar3.x();
                    if (z7 || x10 == c0012a) {
                        x10 = new j4(27, izsVar3, hzeVar);
                        aVar3.R(x10);
                    }
                    gzs gzsVar = (gzs) x10;
                    Object x11 = aVar3.x();
                    if (x11 == c0012a) {
                        x11 = new ha40(19);
                        aVar3.R(x11);
                    }
                    Object a10 = com.vk.core.compose.component.cell.content.n.a(z6, gzsVar, false, com.vk.core.compose.component.semantics.b.a(mode, (izs) x11, i5), aVar3, 24576, 4);
                    aVar3.j();
                    obj2 = a10;
                } else {
                    if (skpVar3 instanceof skp.c) {
                        aVar3.K(786896423);
                        skp.c cVar = (skp.c) skpVar3;
                        cVar.getClass();
                        lg90 a11 = pg90.a(R.drawable.vk_icon_info_circle_outline_20, 0, aVar3);
                        CharSequence a12 = tlo0.b.a(cVar.a, context);
                        Object obj3 = a12 != null ? a12.toString() : mode;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(i4, 0, -1, str2);
                        }
                        ylu0 ylu0Var5 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j3 = ylu0Var5.getIcon().l;
                        boolean z8 = ((3670016 & i12) == 1048576) | (i9 == 4);
                        Object x12 = aVar3.x();
                        if (z8 || x12 == c0012a) {
                            izsVar5 = izsVar4;
                            x12 = new k4(17, izsVar5, hzeVar);
                            aVar3.R(x12);
                        } else {
                            izsVar5 = izsVar4;
                        }
                        androidx.compose.runtime.a aVar6 = aVar3;
                        Object a13 = com.vk.core.compose.component.cell.content.p.a(a11, j3, 0L, obj3, (gzs) x12, null, aVar6, 1572872, 36);
                        aVar3 = aVar6;
                        aVar3.j();
                        obj = a13;
                    } else {
                        izsVar5 = izsVar4;
                        if (skpVar3 instanceof skp.b) {
                            aVar3.K(-528793010);
                            jai jaiVar2 = ((skp.b) skpVar3).a;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-123887413, 0, -1, "com.vk.clips.upload.ui.impl.compose.views.wrapCustomAction (UploadCellItem.kt:233)");
                            }
                            Object iaq0Var = new iaq0(jaiVar2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar3.j();
                            obj = iaq0Var;
                        } else {
                            if (!epx.f(skpVar3, skp.d.a)) {
                                throw alb0.c(-528846002, aVar3);
                            }
                            aVar3.K(787368769);
                            aVar3.j();
                            obj = mode;
                        }
                    }
                    androidx.compose.runtime.a aVar7 = aVar3;
                    wiu0.b(E, false, cell$Left, a5, obj, null, null, aVar7, 0, 98);
                    M = aVar7;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var2 = aVar2;
                }
            }
            izsVar5 = izsVar4;
            obj = obj2;
            androidx.compose.runtime.a aVar72 = aVar3;
            wiu0.b(E, false, cell$Left, a5, obj, null, null, aVar72, 0, 98);
            M = aVar72;
            if (androidx.compose.runtime.b.d()) {
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(izsVar, izsVar2, q630Var2, wzsVar, izsVar3, izsVar5, i) { // from class: xsna.gaq0
                public final /* synthetic */ izs c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ wzs f;
                public final /* synthetic */ izs g;
                public final /* synthetic */ izs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ne7.I(1);
                    jaq0.a(hze.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj4, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, final List list, final izs izsVar) {
        androidx.compose.runtime.a M = aVar.M(-1304830994);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1304830994, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.SuggestionButtons (UploadCellItem.kt:287)");
            }
            jnv0.a(false, SubnavigationBarAppearance.Neutral, null, false, false, kai.c(-1529119909, new yzs() { // from class: xsna.caq0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    lg90 a;
                    lum0 lum0Var = (lum0) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? aVar2.J(lum0Var) : aVar2.y(lum0Var) ? 4 : 2;
                    }
                    int i3 = 0;
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1529119909, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.SuggestionButtons.<anonymous> (UploadCellItem.kt:293)");
                        }
                        for (yoa yoaVar : list) {
                            int i4 = intValue;
                            SubnavigationButtonSize subnavigationButtonSize = SubnavigationButtonSize.Small;
                            SubnavigationButtonMode subnavigationButtonMode = SubnavigationButtonMode.Secondary;
                            SubnavigationButtonAppearance subnavigationButtonAppearance = SubnavigationButtonAppearance.Neutral;
                            String obj4 = yoaVar.b.a((Context) aVar2.r(AndroidCompositionLocals_androidKt.b)).toString();
                            Integer num = yoaVar.c;
                            if (num == null) {
                                aVar2.K(-2109369021);
                                aVar2.j();
                                a = null;
                            } else {
                                aVar2.K(-2109369020);
                                a = pg90.a(num.intValue(), i3, aVar2);
                                aVar2.j();
                            }
                            Object obj5 = izsVar;
                            boolean J = aVar2.J(obj5) | aVar2.J(yoaVar);
                            Object x = aVar2.x();
                            if (J || x == a.C0011a.a) {
                                x = new fy0(25, obj5, yoaVar);
                                aVar2.R(x);
                            }
                            lum0Var.a(subnavigationButtonSize, subnavigationButtonMode, false, (gzs) x, null, subnavigationButtonAppearance, obj4, a, null, null, false, aVar2, android.R.style.TextAppearance.DeviceDefault.SearchResult.Subtitle, (i4 << 3) & 112, 1808);
                            i3 = i3;
                            intValue = i4;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 199734, 20);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e7c(list, izsVar, i, 8);
        }
    }

    public static final void c(final hze hzeVar, final izs izsVar, final izs izsVar2, final q630 q630Var, final wzs wzsVar, final wzs wzsVar2, final izs izsVar3, final izs izsVar4, final izs izsVar5, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        CharSequence a;
        tlo0 tlo0Var = hzeVar.j;
        androidx.compose.runtime.a M = aVar.M(1461975058);
        int i2 = i | (M.J(hzeVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024) | (M.y(wzsVar) ? 16384 : 8192) | (M.y(wzsVar2) ? 131072 : 65536) | (M.y(izsVar3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar4) ? 8388608 : 4194304) | (M.y(izsVar5) ? 67108864 : 33554432);
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1461975058, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.UploadCellItem (UploadCellItem.kt:77)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean J = M.J(tlo0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = (tlo0Var == null || (a = tlo0Var.a(context)) == null) ? null : a.toString();
                M.R(x);
            }
            String str = (String) x;
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z = ((i2 & 234881024) == 67108864) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new yk(14, izsVar5, hzeVar);
                M.R(x2);
            }
            q6p0.a(str, (gzs) x2, kai.c(2065106909, new wzs() { // from class: xsna.eaq0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2065106909, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.UploadCellItem.<anonymous>.<anonymous> (UploadCellItem.kt:87)");
                        }
                        jaq0.a(hze.this, izsVar, izsVar2, null, wzsVar, izsVar3, izsVar4, aVar4, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384);
            aVar2 = M;
            mm2.b(r9g.a, !hzeVar.g.isEmpty(), txj0.f(q630.a.a, 1.0f), null, null, null, kai.c(1613409668, new zt7(3, hzeVar, wzsVar2), M), aVar2, 1573254, 28);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(izsVar, izsVar2, q630Var, wzsVar, wzsVar2, izsVar3, izsVar4, izsVar5, i) { // from class: xsna.faq0
                public final /* synthetic */ izs c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ wzs f;
                public final /* synthetic */ wzs g;
                public final /* synthetic */ izs h;
                public final /* synthetic */ izs i;
                public final /* synthetic */ izs j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    jaq0.c(hze.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final com.vk.core.compose.component.cell.content.x d(lg90 lg90Var, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1127656871, i, -1, "com.vk.clips.upload.ui.impl.compose.views.wrapIcon (UploadCellItem.kt:210)");
        }
        Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        com.vk.core.compose.component.cell.content.x a = com.vk.core.compose.component.cell.content.f.a(lg90Var, size, ylu0Var.getIcon().a, null, null, aVar, 196664, 24);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}

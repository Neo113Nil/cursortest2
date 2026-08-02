package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.c;
import com.vk.core.view.components.tabs.d;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.msn0;
import xsna.osn0;
import xsna.psn0;
import xsna.q630;
import xsna.ssn0;
import xsna.ty6;

/* compiled from: TabsScreenContent.kt */
/* loaded from: classes18.dex */
public final class jzn0 {
    public static final void a(final jj jjVar, final int i, final int i2, final boolean z, final izs<? super Integer, s3q0> izsVar, final boolean z2, final boolean z3, final boolean z4, androidx.compose.runtime.a aVar, final int i3) {
        jj jjVar2;
        int i4;
        androidx.compose.runtime.a aVar2;
        int i5;
        boolean z5;
        int i6;
        psn0.a aVar3;
        osn0.a aVar4;
        ssn0.a aVar5;
        char c;
        msn0 msn0Var;
        msn0 a;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        boolean z6 = z;
        izs<? super Integer, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-1143703237);
        if ((i3 & 6) == 0) {
            jjVar2 = jjVar;
            i4 = (M.J(jjVar2) ? 4 : 2) | i3;
        } else {
            jjVar2 = jjVar;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i9) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.o(i10) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.l(z6) ? 2048 : 1024;
        }
        int i11 = 16384;
        if ((i3 & 24576) == 0) {
            i4 |= M.y(izsVar2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= M.l(z2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= M.l(z4) ? 8388608 : 4194304;
        }
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1143703237, i4, -1, "com.vk.design.demo.presentation.screens.AccentTabs (TabsScreenContent.kt:786)");
            }
            int i12 = 0;
            while (i12 < i9) {
                if (i10 != i12 || z6) {
                    i5 = i4;
                    z5 = false;
                } else {
                    i5 = i4;
                    z5 = true;
                }
                boolean o = ((i5 & 57344) == i11) | M.o(i12);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (o || x == c0012a) {
                    x = new vif(i12, 1, izsVar2);
                    M.R(x);
                }
                gzs<s3q0> gzsVar = (gzs) x;
                if (androidx.compose.runtime.b.d()) {
                    i6 = i12;
                    androidx.compose.runtime.b.f(1591975853, 54, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                } else {
                    i6 = i12;
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new psn0.a("Tab");
                    M.R(x2);
                }
                psn0.a aVar6 = (psn0.a) x2;
                ((zak0) aVar6.b).setValue("Tab");
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (z2) {
                    M.K(-705098455);
                    if (androidx.compose.runtime.b.d()) {
                        aVar3 = aVar6;
                        i8 = 0;
                        androidx.compose.runtime.b.f(-438459630, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UserOutline24> (VkSdkIcons.kt:3584)");
                    } else {
                        aVar3 = aVar6;
                        i8 = 0;
                    }
                    lg90 b = or.b(M, -1155115631, R.drawable.vk_icon_user_outline_24, M, i8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2110682063, 56, -1, "com.vk.core.compose.component.tabs.TabItem.Left.Icon.Companion.invoke (VkTabItem.kt:126)");
                    }
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new osn0.a(b);
                        M.R(x3);
                    }
                    osn0.a aVar7 = (osn0.a) x3;
                    ((zak0) aVar7.b).setValue(b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    aVar4 = aVar7;
                } else {
                    aVar3 = aVar6;
                    M.K(-383180718);
                    M.j();
                    aVar4 = null;
                }
                if (z2) {
                    M.K(-705095535);
                    if (androidx.compose.runtime.b.d()) {
                        i7 = 0;
                        androidx.compose.runtime.b.f(-1318834222, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-NotificationOutline24> (VkSdkIcons.kt:2736)");
                    } else {
                        i7 = 0;
                    }
                    lg90 b2 = or.b(M, 970698953, R.drawable.vk_icon_notification_outline_24, M, i7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-519653748, 56, -1, "com.vk.core.compose.component.tabs.TabItem.Right.Icon.Companion.invoke (VkTabItem.kt:232)");
                    }
                    Object x4 = M.x();
                    if (x4 == c0012a) {
                        x4 = new ssn0.a(b2);
                        M.R(x4);
                    }
                    aVar5 = (ssn0.a) x4;
                    ((zak0) aVar5.b).setValue(b2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(-383082510);
                    M.j();
                    aVar5 = null;
                }
                if (z3) {
                    M.K(-383036226);
                    if (androidx.compose.runtime.b.d()) {
                        c = 65535;
                        androidx.compose.runtime.b.f(-448149998, 6, -1, "com.vk.core.compose.component.tabs.TabItem.Indicator.Badge.Companion.invoke (VkTabItem.kt:256)");
                    } else {
                        c = 65535;
                    }
                    Object x5 = M.x();
                    if (x5 == c0012a) {
                        x5 = new msn0.a();
                        M.R(x5);
                    }
                    a = (msn0.a) x5;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    c = 65535;
                    if (z4) {
                        M.K(-382956711);
                        a = msn0.b.a.a(M);
                        M.j();
                    } else {
                        M.K(-382890061);
                        M.j();
                        msn0Var = null;
                        androidx.compose.runtime.a aVar8 = M;
                        jjVar2.c(z5, gzsVar, null, aVar3, aVar4, aVar5, msn0Var, aVar8, (i5 << 21) & 29360128, 4);
                        jjVar2 = jjVar;
                        z6 = z;
                        izsVar2 = izsVar;
                        i4 = i5;
                        i11 = 16384;
                        i12 = i6 + 1;
                        M = aVar8;
                        i9 = i;
                        i10 = i2;
                    }
                }
                msn0Var = a;
                androidx.compose.runtime.a aVar82 = M;
                jjVar2.c(z5, gzsVar, null, aVar3, aVar4, aVar5, msn0Var, aVar82, (i5 << 21) & 29360128, 4);
                jjVar2 = jjVar;
                z6 = z;
                izsVar2 = izsVar;
                i4 = i5;
                i11 = 16384;
                i12 = i6 + 1;
                M = aVar82;
                i9 = i;
                i10 = i2;
            }
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ezn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzn0.a(jj.this, i, i2, z, izsVar, z2, z3, z4, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [xsna.q630] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, xsna.wh50] */
    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        Ref$ObjectRef ref$ObjectRef;
        cri.a.e eVar;
        boolean z;
        q630 q630Var2;
        boolean z2;
        boolean z3;
        q630.a aVar2;
        wh50 wh50Var;
        jai jaiVar;
        androidx.compose.runtime.a M = aVar.M(-915949051);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-915949051, i, -1, "com.vk.design.demo.presentation.screens.AccentTabsContent (TabsScreenContent.kt:422)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            qpv0 qpv0Var = null;
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var4 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            final wh50 wh50Var5 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            final wh50 wh50Var6 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x6);
            }
            final wh50 wh50Var7 = (wh50) x6;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x7);
            }
            ref$ObjectRef2.element = (wh50) x7;
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x8);
            }
            wh50 wh50Var8 = (wh50) x8;
            djn0.a(true, false, M, 438, 0);
            float f2 = 8;
            q630.a aVar4 = q630.a.a;
            rzo0.a(54, 0, M, "VkAccentTabRow:", s200.D(aVar4, f2));
            q630 f3 = txj0.f(aVar4, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f3);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = androidx.compose.runtime.i.a(0);
                M.R(x9);
            }
            rg50 rg50Var = (rg50) x9;
            boolean booleanValue = ((Boolean) ((wh50) ref$ObjectRef2.element).getValue()).booleanValue();
            e.a aVar5 = androidx.compose.ui.graphics.e.a;
            if (booleanValue) {
                z = true;
                ref$ObjectRef = ref$ObjectRef2;
                eVar = eVar2;
                q630Var2 = r18.a(1, l5g.e, aVar4, aVar5);
            } else {
                ref$ObjectRef = ref$ObjectRef2;
                eVar = eVar2;
                z = true;
                q630Var2 = aVar4;
            }
            Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
            cri.a.e eVar3 = eVar;
            u6u0.e(rg50Var.getIntValue(), kai.c(1173692392, new joh0(wh50Var5, wh50Var6, wh50Var7, rg50Var, 1), M), q630Var2, 0L, ((Boolean) wh50Var2.getValue()).booleanValue() ^ z, null, M, 48, 40);
            M.G();
            rzo0.a(54, 0, M, "VkAccentScrollableTabRow:", s200.D(aVar4, f2));
            q630 f4 = txj0.f(aVar4, 1.0f);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, f4);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar3);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            Object x10 = M.x();
            if (x10 == c0012a) {
                z2 = false;
                x10 = androidx.compose.runtime.i.a(0);
                M.R(x10);
            } else {
                z2 = false;
            }
            final rg50 rg50Var2 = (rg50) x10;
            if (((Boolean) ((wh50) ref$ObjectRef3.element).getValue()).booleanValue()) {
                z3 = true;
                aVar2 = r18.a(1, l5g.e, aVar4, aVar5);
            } else {
                z3 = true;
                aVar2 = aVar4;
            }
            boolean z4 = !((Boolean) wh50Var2.getValue()).booleanValue();
            boolean z5 = z3;
            int intValue = rg50Var2.getIntValue();
            if (((Boolean) wh50Var3.getValue()).booleanValue()) {
                M.K(-225534401);
                wh50Var = wh50Var8;
                jaiVar = kai.c(-696691085, new ce1(1, rg50Var2, wh50Var), M);
                M.j();
            } else {
                wh50Var = wh50Var8;
                M.K(-224962297);
                M.j();
                jaiVar = null;
            }
            if (((Boolean) wh50Var4.getValue()).booleanValue()) {
                M.K(-224903303);
                qpv0Var = g(M);
                M.j();
            } else {
                M.K(-224848217);
                M.j();
            }
            final wh50 wh50Var9 = wh50Var;
            jai jaiVar2 = jaiVar;
            boolean z6 = z2;
            u6u0.c(intValue, kai.c(1817203302, new yzs() { // from class: xsna.gzn0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    jj jjVar = (jj) obj;
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= aVar6.J(jjVar) ? 4 : 2;
                    }
                    if (aVar6.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1817203302, intValue2, -1, "com.vk.design.demo.presentation.screens.AccentTabsContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:471)");
                        }
                        rg50 rg50Var3 = rg50Var2;
                        int intValue3 = rg50Var3.getIntValue();
                        wh50 wh50Var10 = wh50Var9;
                        boolean booleanValue2 = ((Boolean) wh50Var10.getValue()).booleanValue();
                        boolean booleanValue3 = ((Boolean) wh50.this.getValue()).booleanValue();
                        boolean booleanValue4 = ((Boolean) wh50Var6.getValue()).booleanValue();
                        boolean booleanValue5 = ((Boolean) wh50Var7.getValue()).booleanValue();
                        Object x11 = aVar6.x();
                        if (x11 == a.C0011a.a) {
                            x11 = new sh3(29, wh50Var10, rg50Var3);
                            aVar6.R(x11);
                        }
                        jzn0.a(jjVar, 10, intValue3, booleanValue2, (izs) x11, booleanValue3, booleanValue4, booleanValue5, aVar6, (intValue2 & 14) | 24624);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar6.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 0L, z4, null, jaiVar2, qpv0Var, ((Boolean) wh50Var.getValue()).booleanValue(), M, 48, 40);
            M = M;
            M.G();
            djn0.a(z6, z5, M, 438, z6 ? 1 : 0);
            c(((Boolean) wh50Var2.getValue()).booleanValue(), ((Boolean) wh50Var3.getValue()).booleanValue(), ((Boolean) wh50Var4.getValue()).booleanValue(), ((Boolean) wh50Var5.getValue()).booleanValue(), ((Boolean) wh50Var6.getValue()).booleanValue(), ((Boolean) wh50Var7.getValue()).booleanValue(), ((Boolean) ((wh50) ref$ObjectRef3.element).getValue()).booleanValue(), M, 0);
            k(wh50Var2, wh50Var3, wh50Var4, wh50Var5, wh50Var6, wh50Var7, (wh50) ref$ObjectRef3.element, M, 224694);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e9k(q630Var, i, 1);
        }
    }

    public static final void c(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(589355291);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.l(z3) ? 256 : 128) | (M.l(z4) ? 2048 : 1024) | (M.l(z5) ? 16384 : 8192) | (M.l(z6) ? 131072 : 65536) | (M.l(z7) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(589355291, i2, -1, "com.vk.design.demo.presentation.screens.AccentViewTabsContent (TabsScreenContent.kt:537)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new wyn0(0);
                M.R(x);
            }
            izs izsVar = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new y510(28);
                M.R(x2);
            }
            int i3 = (i2 & 14) | 905969712;
            int i4 = i2 << 3;
            l(z, "VkAccentTabLayout", z2, z3, z4, z5, z6, z7, izsVar, (izs) x2, M, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, z, z2, z3, z4, z5, z6, z7) { // from class: xsna.xyn0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;

                {
                    this.b = z;
                    this.c = z2;
                    this.d = z3;
                    this.e = z4;
                    this.f = z5;
                    this.g = z6;
                    this.h = z7;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    jzn0.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        cri.a.e eVar;
        cri.a.C2678a c2678a;
        boolean z;
        q630 q630Var2;
        boolean z2;
        wh50 wh50Var;
        jai jaiVar;
        androidx.compose.runtime.a M = aVar.M(1105174696);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1105174696, i, -1, "com.vk.design.demo.presentation.screens.DefaultContent (TabsScreenContent.kt:153)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            qpv0 qpv0Var = null;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var4 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            final wh50 wh50Var5 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            final wh50 wh50Var6 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x6);
            }
            final wh50 wh50Var7 = (wh50) x6;
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x7);
            }
            wh50 wh50Var8 = (wh50) x7;
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x8);
            }
            wh50 wh50Var9 = (wh50) x8;
            djn0.a(true, false, M, 438, 0);
            float f2 = 8;
            q630 q630Var3 = q630.a.a;
            rzo0.a(54, 0, M, "VkDefaultTabRow:", s200.D(q630Var3, f2));
            q630 f3 = txj0.f(q630Var3, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar, M, c2678a2);
            k9q0.w(M, c2, dVar);
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = androidx.compose.runtime.i.a(0);
                M.R(x9);
            }
            final rg50 rg50Var = (rg50) x9;
            boolean booleanValue = ((Boolean) wh50Var8.getValue()).booleanValue();
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            if (booleanValue) {
                z = true;
                eVar = eVar2;
                c2678a = c2678a2;
                q630Var2 = r18.a(1, l5g.e, q630Var3, aVar3);
            } else {
                eVar = eVar2;
                c2678a = c2678a2;
                z = true;
                q630Var2 = q630Var3;
            }
            boolean booleanValue2 = ((Boolean) wh50Var2.getValue()).booleanValue() ^ z;
            cri.a.e eVar3 = eVar;
            cri.a.C2678a c2678a3 = c2678a;
            vpu0.c(rg50Var.getIntValue(), kai.c(1732798427, new yzs() { // from class: xsna.fzn0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    col colVar = (col) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(colVar) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1732798427, intValue, -1, "com.vk.design.demo.presentation.screens.DefaultContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:177)");
                        }
                        rg50 rg50Var2 = rg50Var;
                        int intValue2 = rg50Var2.getIntValue();
                        Object x10 = aVar4.x();
                        if (x10 == a.C0011a.a) {
                            x10 = new j6l0(rg50Var2, 8);
                            aVar4.R(x10);
                        }
                        jzn0.e(colVar, 4, intValue2, false, (izs) x10, ((Boolean) wh50.this.getValue()).booleanValue(), ((Boolean) wh50Var6.getValue()).booleanValue(), ((Boolean) wh50Var7.getValue()).booleanValue(), aVar4, (intValue & 14) | 27696);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), q630Var2, 0L, booleanValue2, null, M, 48, 104);
            M.G();
            rzo0.a(54, 0, M, "VkDefaultScrollableTabRow:", s200.D(q630Var3, f2));
            q630 f4 = txj0.f(q630Var3, 1.0f);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, f4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar3);
            ur.d(hashCode3, M, bVar, M, c2678a3);
            k9q0.w(M, c3, dVar);
            Object x10 = M.x();
            if (x10 == c0012a) {
                z2 = false;
                x10 = androidx.compose.runtime.i.a(0);
                M.R(x10);
            } else {
                z2 = false;
            }
            final rg50 rg50Var2 = (rg50) x10;
            if (((Boolean) wh50Var8.getValue()).booleanValue()) {
                q630Var3 = r18.a(1, l5g.e, q630Var3, aVar3);
            }
            q630 q630Var4 = q630Var3;
            boolean z3 = !((Boolean) wh50Var2.getValue()).booleanValue();
            int intValue = rg50Var2.getIntValue();
            if (((Boolean) wh50Var3.getValue()).booleanValue()) {
                M.K(-764314019);
                wh50Var = wh50Var9;
                jaiVar = kai.c(-15241515, new ive(1, rg50Var2, wh50Var), M);
                M.j();
            } else {
                wh50Var = wh50Var9;
                M.K(-763740954);
                M.j();
                jaiVar = null;
            }
            if (((Boolean) wh50Var4.getValue()).booleanValue()) {
                M.K(-763681991);
                qpv0Var = g(M);
                M.j();
            } else {
                M.K(-763627866);
                M.j();
            }
            qpv0 qpv0Var2 = qpv0Var;
            boolean booleanValue3 = ((Boolean) wh50Var.getValue()).booleanValue();
            final wh50 wh50Var10 = wh50Var;
            jai c4 = kai.c(-1185098467, new yzs() { // from class: xsna.hzn0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    col colVar = (col) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= aVar4.J(colVar) ? 4 : 2;
                    }
                    if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1185098467, intValue2, -1, "com.vk.design.demo.presentation.screens.DefaultContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:202)");
                        }
                        rg50 rg50Var3 = rg50Var2;
                        int intValue3 = rg50Var3.getIntValue();
                        wh50 wh50Var11 = wh50Var10;
                        boolean booleanValue4 = ((Boolean) wh50Var11.getValue()).booleanValue();
                        boolean booleanValue5 = ((Boolean) wh50.this.getValue()).booleanValue();
                        boolean booleanValue6 = ((Boolean) wh50Var6.getValue()).booleanValue();
                        boolean booleanValue7 = ((Boolean) wh50Var7.getValue()).booleanValue();
                        Object x11 = aVar4.x();
                        if (x11 == a.C0011a.a) {
                            x11 = new h9i0(3, wh50Var11, rg50Var3);
                            aVar4.R(x11);
                        }
                        jzn0.e(colVar, 10, intValue3, booleanValue4, (izs) x11, booleanValue5, booleanValue6, booleanValue7, aVar4, (intValue2 & 14) | 24624);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M);
            boolean z4 = z2;
            vpu0.b(intValue, c4, q630Var4, 0L, z3, null, jaiVar, qpv0Var2, booleanValue3, M, 48, 104);
            M = M;
            M.G();
            djn0.a(z4, true, M, 438, z4 ? 1 : 0);
            f(((Boolean) wh50Var2.getValue()).booleanValue(), ((Boolean) wh50Var3.getValue()).booleanValue(), ((Boolean) wh50Var4.getValue()).booleanValue(), ((Boolean) wh50Var5.getValue()).booleanValue(), ((Boolean) wh50Var6.getValue()).booleanValue(), ((Boolean) wh50Var7.getValue()).booleanValue(), ((Boolean) wh50Var8.getValue()).booleanValue(), M, 0);
            k(wh50Var2, wh50Var3, wh50Var4, wh50Var5, wh50Var6, wh50Var7, wh50Var8, M, 1797558);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yde(q630Var, i, 7);
        }
    }

    public static final void e(final col colVar, final int i, final int i2, final boolean z, final izs<? super Integer, s3q0> izsVar, final boolean z2, final boolean z3, final boolean z4, androidx.compose.runtime.a aVar, final int i3) {
        col colVar2;
        int i4;
        androidx.compose.runtime.a aVar2;
        int i5;
        boolean z5;
        int i6;
        psn0.a aVar3;
        osn0.a aVar4;
        ssn0.a aVar5;
        char c;
        msn0 msn0Var;
        msn0 a;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        boolean z6 = z;
        Object obj = izsVar;
        androidx.compose.runtime.a M = aVar.M(-267092297);
        if ((i3 & 6) == 0) {
            colVar2 = colVar;
            i4 = (M.J(colVar2) ? 4 : 2) | i3;
        } else {
            colVar2 = colVar;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i9) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.o(i10) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.l(z6) ? 2048 : 1024;
        }
        int i11 = 16384;
        if ((i3 & 24576) == 0) {
            i4 |= M.y(obj) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= M.l(z2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= M.l(z4) ? 8388608 : 4194304;
        }
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-267092297, i4, -1, "com.vk.design.demo.presentation.screens.DefaultTabs (TabsScreenContent.kt:730)");
            }
            int i12 = 0;
            while (i12 < i9) {
                if (i10 != i12 || z6) {
                    i5 = i4;
                    z5 = false;
                } else {
                    i5 = i4;
                    z5 = true;
                }
                boolean o = ((i5 & 57344) == i11) | M.o(i12);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (o || x == c0012a) {
                    x = new mor(obj, i12, 2);
                    M.R(x);
                }
                gzs<s3q0> gzsVar = (gzs) x;
                if (androidx.compose.runtime.b.d()) {
                    i6 = i12;
                    androidx.compose.runtime.b.f(1591975853, 54, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                } else {
                    i6 = i12;
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new psn0.a("Tab");
                    M.R(x2);
                }
                psn0.a aVar6 = (psn0.a) x2;
                ((zak0) aVar6.b).setValue("Tab");
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (z2) {
                    M.K(439930821);
                    if (androidx.compose.runtime.b.d()) {
                        aVar3 = aVar6;
                        i8 = 0;
                        androidx.compose.runtime.b.f(-438459630, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UserOutline24> (VkSdkIcons.kt:3584)");
                    } else {
                        aVar3 = aVar6;
                        i8 = 0;
                    }
                    lg90 b = or.b(M, -1155115631, R.drawable.vk_icon_user_outline_24, M, i8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2110682063, 56, -1, "com.vk.core.compose.component.tabs.TabItem.Left.Icon.Companion.invoke (VkTabItem.kt:126)");
                    }
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new osn0.a(b);
                        M.R(x3);
                    }
                    osn0.a aVar7 = (osn0.a) x3;
                    ((zak0) aVar7.b).setValue(b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    aVar4 = aVar7;
                } else {
                    aVar3 = aVar6;
                    M.K(752988470);
                    M.j();
                    aVar4 = null;
                }
                if (z2) {
                    M.K(439933741);
                    if (androidx.compose.runtime.b.d()) {
                        i7 = 0;
                        androidx.compose.runtime.b.f(-1318834222, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-NotificationOutline24> (VkSdkIcons.kt:2736)");
                    } else {
                        i7 = 0;
                    }
                    lg90 b2 = or.b(M, 970698953, R.drawable.vk_icon_notification_outline_24, M, i7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-519653748, 56, -1, "com.vk.core.compose.component.tabs.TabItem.Right.Icon.Companion.invoke (VkTabItem.kt:232)");
                    }
                    Object x4 = M.x();
                    if (x4 == c0012a) {
                        x4 = new ssn0.a(b2);
                        M.R(x4);
                    }
                    aVar5 = (ssn0.a) x4;
                    ((zak0) aVar5.b).setValue(b2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(753086678);
                    M.j();
                    aVar5 = null;
                }
                if (z3) {
                    M.K(753132962);
                    if (androidx.compose.runtime.b.d()) {
                        c = 65535;
                        androidx.compose.runtime.b.f(-448149998, 6, -1, "com.vk.core.compose.component.tabs.TabItem.Indicator.Badge.Companion.invoke (VkTabItem.kt:256)");
                    } else {
                        c = 65535;
                    }
                    Object x5 = M.x();
                    if (x5 == c0012a) {
                        x5 = new msn0.a();
                        M.R(x5);
                    }
                    a = (msn0.a) x5;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    c = 65535;
                    if (z4) {
                        M.K(753212477);
                        a = msn0.b.a.a(M);
                        M.j();
                    } else {
                        M.K(753279127);
                        M.j();
                        msn0Var = null;
                        androidx.compose.runtime.a aVar8 = M;
                        colVar2.c(z5, gzsVar, null, aVar3, aVar4, aVar5, msn0Var, aVar8, (i5 << 21) & 29360128, 4);
                        colVar2 = colVar;
                        z6 = z;
                        obj = izsVar;
                        i4 = i5;
                        i11 = 16384;
                        i12 = i6 + 1;
                        M = aVar8;
                        i9 = i;
                        i10 = i2;
                    }
                }
                msn0Var = a;
                androidx.compose.runtime.a aVar82 = M;
                colVar2.c(z5, gzsVar, null, aVar3, aVar4, aVar5, msn0Var, aVar82, (i5 << 21) & 29360128, 4);
                colVar2 = colVar;
                z6 = z;
                obj = izsVar;
                i4 = i5;
                i11 = 16384;
                i12 = i6 + 1;
                M = aVar82;
                i9 = i;
                i10 = i2;
            }
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vyn0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    jzn0.e(col.this, i, i2, z, izsVar, z2, z3, z4, (androidx.compose.runtime.a) obj2, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(813111094);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.l(z3) ? 256 : 128) | (M.l(z4) ? 2048 : 1024) | (M.l(z5) ? 16384 : 8192) | (M.l(z6) ? 131072 : 65536) | (M.l(z7) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(813111094, i2, -1, "com.vk.design.demo.presentation.screens.DefaultViewTabsContent (TabsScreenContent.kt:268)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new qyn0(0);
                M.R(x);
            }
            int i3 = (i2 & 14) | 100663344;
            int i4 = i2 << 3;
            l(z, "VkDefaultTabLayout", z2, z3, z4, z5, z6, z7, (izs) x, null, M, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, z, z2, z3, z4, z5, z6, z7) { // from class: xsna.ryn0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;

                {
                    this.b = z;
                    this.c = z2;
                    this.d = z3;
                    this.e = z4;
                    this.f = z5;
                    this.g = z6;
                    this.h = z7;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    jzn0.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final qpv0 g(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1469450514, 0, -1, "com.vk.design.demo.presentation.screens.FixedIcon (TabsScreenContent.kt:807)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
        }
        lg90 b = or.b(aVar, -1058716730, R.drawable.vk_icon_add_24, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = new tj2(26);
            aVar.R(x);
        }
        gzs gzsVar = (gzs) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1459421177, 440, -1, "com.vk.core.compose.component.tabs.VkTabsFixedIcon.Companion.invoke (VkTabsFixedIcon.kt:76)");
        }
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = new qpv0(gzsVar, b);
            aVar.R(x2);
        }
        qpv0 qpv0Var = (qpv0) x2;
        ((zak0) qpv0Var.a).setValue(b);
        ((zak0) qpv0Var.b).setValue(gzsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return qpv0Var;
    }

    public static final void h(final k1i0 k1i0Var, final int i, final int i2, final boolean z, final izs<? super Integer, s3q0> izsVar, final boolean z2, final boolean z3, final boolean z4, androidx.compose.runtime.a aVar, final int i3) {
        k1i0 k1i0Var2;
        int i4;
        androidx.compose.runtime.a aVar2;
        int i5;
        boolean z5;
        int i6;
        psn0.a aVar3;
        osn0.a aVar4;
        ssn0.a aVar5;
        char c;
        msn0 msn0Var;
        msn0 a;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        boolean z6 = z;
        izs<? super Integer, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(751585617);
        if ((i3 & 6) == 0) {
            k1i0Var2 = k1i0Var;
            i4 = (M.J(k1i0Var2) ? 4 : 2) | i3;
        } else {
            k1i0Var2 = k1i0Var;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i9) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.o(i10) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.l(z6) ? 2048 : 1024;
        }
        int i11 = 16384;
        if ((i3 & 24576) == 0) {
            i4 |= M.y(izsVar2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= M.l(z2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= M.l(z4) ? 8388608 : 4194304;
        }
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(751585617, i4, -1, "com.vk.design.demo.presentation.screens.SecondaryTabs (TabsScreenContent.kt:758)");
            }
            int i12 = 0;
            while (i12 < i9) {
                if (i10 != i12 || z6) {
                    i5 = i4;
                    z5 = false;
                } else {
                    i5 = i4;
                    z5 = true;
                }
                boolean o = ((i5 & 57344) == i11) | M.o(i12);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (o || x == c0012a) {
                    x = new uc70(i12, 1, izsVar2);
                    M.R(x);
                }
                gzs<s3q0> gzsVar = (gzs) x;
                if (androidx.compose.runtime.b.d()) {
                    i6 = i12;
                    androidx.compose.runtime.b.f(1591975853, 54, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                } else {
                    i6 = i12;
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new psn0.a("Tab");
                    M.R(x2);
                }
                psn0.a aVar6 = (psn0.a) x2;
                ((zak0) aVar6.b).setValue("Tab");
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (z2) {
                    M.K(2020455455);
                    if (androidx.compose.runtime.b.d()) {
                        aVar3 = aVar6;
                        i8 = 0;
                        androidx.compose.runtime.b.f(-438459630, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UserOutline24> (VkSdkIcons.kt:3584)");
                    } else {
                        aVar3 = aVar6;
                        i8 = 0;
                    }
                    lg90 b = or.b(M, -1155115631, R.drawable.vk_icon_user_outline_24, M, i8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2110682063, 56, -1, "com.vk.core.compose.component.tabs.TabItem.Left.Icon.Companion.invoke (VkTabItem.kt:126)");
                    }
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new osn0.a(b);
                        M.R(x3);
                    }
                    osn0.a aVar7 = (osn0.a) x3;
                    ((zak0) aVar7.b).setValue(b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    aVar4 = aVar7;
                } else {
                    aVar3 = aVar6;
                    M.K(-1790355428);
                    M.j();
                    aVar4 = null;
                }
                if (z2) {
                    M.K(2020458375);
                    if (androidx.compose.runtime.b.d()) {
                        i7 = 0;
                        androidx.compose.runtime.b.f(-1318834222, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-NotificationOutline24> (VkSdkIcons.kt:2736)");
                    } else {
                        i7 = 0;
                    }
                    lg90 b2 = or.b(M, 970698953, R.drawable.vk_icon_notification_outline_24, M, i7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-519653748, 56, -1, "com.vk.core.compose.component.tabs.TabItem.Right.Icon.Companion.invoke (VkTabItem.kt:232)");
                    }
                    Object x4 = M.x();
                    if (x4 == c0012a) {
                        x4 = new ssn0.a(b2);
                        M.R(x4);
                    }
                    aVar5 = (ssn0.a) x4;
                    ((zak0) aVar5.b).setValue(b2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(-1790257220);
                    M.j();
                    aVar5 = null;
                }
                if (z3) {
                    M.K(-1790210936);
                    if (androidx.compose.runtime.b.d()) {
                        c = 65535;
                        androidx.compose.runtime.b.f(-448149998, 6, -1, "com.vk.core.compose.component.tabs.TabItem.Indicator.Badge.Companion.invoke (VkTabItem.kt:256)");
                    } else {
                        c = 65535;
                    }
                    Object x5 = M.x();
                    if (x5 == c0012a) {
                        x5 = new msn0.a();
                        M.R(x5);
                    }
                    a = (msn0.a) x5;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    c = 65535;
                    if (z4) {
                        M.K(-1790131421);
                        a = msn0.b.a.a(M);
                        M.j();
                    } else {
                        M.K(-1790064771);
                        M.j();
                        msn0Var = null;
                        androidx.compose.runtime.a aVar8 = M;
                        k1i0Var2.c(z5, gzsVar, null, aVar3, aVar4, aVar5, msn0Var, aVar8, (i5 << 21) & 29360128, 4);
                        k1i0Var2 = k1i0Var;
                        z6 = z;
                        izsVar2 = izsVar;
                        i4 = i5;
                        i11 = 16384;
                        i12 = i6 + 1;
                        M = aVar8;
                        i9 = i;
                        i10 = i2;
                    }
                }
                msn0Var = a;
                androidx.compose.runtime.a aVar82 = M;
                k1i0Var2.c(z5, gzsVar, null, aVar3, aVar4, aVar5, msn0Var, aVar82, (i5 << 21) & 29360128, 4);
                k1i0Var2 = k1i0Var;
                z6 = z;
                izsVar2 = izsVar;
                i4 = i5;
                i11 = 16384;
                i12 = i6 + 1;
                M = aVar82;
                i9 = i;
                i10 = i2;
            }
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dzn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzn0.h(k1i0.this, i, i2, z, izsVar, z2, z3, z4, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, xsna.wh50] */
    public static final void i(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        Ref$ObjectRef ref$ObjectRef;
        q630 q630Var2;
        boolean z;
        boolean z2;
        wh50 wh50Var;
        jai jaiVar;
        androidx.compose.runtime.a M = aVar.M(1634314935);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1634314935, i, -1, "com.vk.design.demo.presentation.screens.SecondaryTabsContent (TabsScreenContent.kt:288)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            qpv0 qpv0Var = null;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var4 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            final wh50 wh50Var5 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            final wh50 wh50Var6 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x6);
            }
            final wh50 wh50Var7 = (wh50) x6;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x7);
            }
            ref$ObjectRef2.element = (wh50) x7;
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x8);
            }
            wh50 wh50Var8 = (wh50) x8;
            djn0.a(true, false, M, 438, 0);
            float f2 = 8;
            q630 q630Var3 = q630.a.a;
            rzo0.a(54, 0, M, "VkSecondaryTabRow:", s200.D(q630Var3, f2));
            q630 f3 = txj0.f(q630Var3, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = androidx.compose.runtime.i.a(0);
                M.R(x9);
            }
            final rg50 rg50Var = (rg50) x9;
            boolean booleanValue = ((Boolean) ((wh50) ref$ObjectRef2.element).getValue()).booleanValue();
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            if (booleanValue) {
                ref$ObjectRef = ref$ObjectRef2;
                q630Var2 = r18.a(1, l5g.e, q630Var3, aVar3);
            } else {
                ref$ObjectRef = ref$ObjectRef2;
                q630Var2 = q630Var3;
            }
            ziv0.d(rg50Var.getIntValue(), kai.c(-15698486, new yzs() { // from class: xsna.izn0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    k1i0 k1i0Var = (k1i0) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(k1i0Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-15698486, intValue, -1, "com.vk.design.demo.presentation.screens.SecondaryTabsContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:312)");
                        }
                        rg50 rg50Var2 = rg50Var;
                        int intValue2 = rg50Var2.getIntValue();
                        boolean booleanValue2 = ((Boolean) wh50.this.getValue()).booleanValue();
                        boolean booleanValue3 = ((Boolean) wh50Var6.getValue()).booleanValue();
                        boolean booleanValue4 = ((Boolean) wh50Var7.getValue()).booleanValue();
                        Object x10 = aVar4.x();
                        if (x10 == a.C0011a.a) {
                            x10 = new rzl0(rg50Var2, 6);
                            aVar4.R(x10);
                        }
                        jzn0.h(k1i0Var, 4, intValue2, false, (izs) x10, booleanValue2, booleanValue3, booleanValue4, aVar4, (intValue & 14) | 27696);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), q630Var2, 0L, !((Boolean) wh50Var2.getValue()).booleanValue(), null, M, 48, 40);
            M.G();
            rzo0.a(54, 0, M, "VkSecondaryScrollableTabRow:", s200.D(q630Var3, f2));
            q630 f4 = txj0.f(q630Var3, 1.0f);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, f4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            Object x10 = M.x();
            if (x10 == c0012a) {
                z = false;
                x10 = androidx.compose.runtime.i.a(0);
                M.R(x10);
            } else {
                z = false;
            }
            final rg50 rg50Var2 = (rg50) x10;
            Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
            if (((Boolean) ((wh50) ref$ObjectRef3.element).getValue()).booleanValue()) {
                z2 = true;
                q630Var3 = r18.a(1, l5g.e, q630Var3, aVar3);
            } else {
                z2 = true;
            }
            q630 q630Var4 = q630Var3;
            boolean z3 = !((Boolean) wh50Var2.getValue()).booleanValue();
            int intValue = rg50Var2.getIntValue();
            if (((Boolean) wh50Var3.getValue()).booleanValue()) {
                M.K(-398981908);
                wh50Var = wh50Var8;
                jaiVar = kai.c(-1275442025, new com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.a(2, rg50Var2, wh50Var), M);
                M.j();
            } else {
                wh50Var = wh50Var8;
                M.K(-398406921);
                M.j();
                jaiVar = null;
            }
            if (((Boolean) wh50Var4.getValue()).booleanValue()) {
                M.K(-398347927);
                qpv0Var = g(M);
                M.j();
            } else {
                M.K(-398292841);
                M.j();
            }
            final wh50 wh50Var9 = wh50Var;
            boolean z4 = z;
            ziv0.b(intValue, kai.c(1620720012, new yzs() { // from class: xsna.pyn0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    k1i0 k1i0Var = (k1i0) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= aVar4.J(k1i0Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1620720012, intValue2, -1, "com.vk.design.demo.presentation.screens.SecondaryTabsContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:336)");
                        }
                        rg50 rg50Var3 = rg50Var2;
                        int intValue3 = rg50Var3.getIntValue();
                        wh50 wh50Var10 = wh50Var9;
                        boolean booleanValue2 = ((Boolean) wh50Var10.getValue()).booleanValue();
                        boolean booleanValue3 = ((Boolean) wh50.this.getValue()).booleanValue();
                        boolean booleanValue4 = ((Boolean) wh50Var6.getValue()).booleanValue();
                        boolean booleanValue5 = ((Boolean) wh50Var7.getValue()).booleanValue();
                        Object x11 = aVar4.x();
                        if (x11 == a.C0011a.a) {
                            x11 = new uyn0(0, wh50Var10, rg50Var3);
                            aVar4.R(x11);
                        }
                        jzn0.h(k1i0Var, 10, intValue3, booleanValue2, (izs) x11, booleanValue3, booleanValue4, booleanValue5, aVar4, (intValue2 & 14) | 24624);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), q630Var4, 0L, z3, null, jaiVar, qpv0Var, ((Boolean) wh50Var.getValue()).booleanValue(), M, 48, 40);
            M = M;
            M.G();
            djn0.a(z4, z2, M, 438, z4 ? 1 : 0);
            j(((Boolean) wh50Var2.getValue()).booleanValue(), ((Boolean) wh50Var3.getValue()).booleanValue(), ((Boolean) wh50Var4.getValue()).booleanValue(), ((Boolean) wh50Var5.getValue()).booleanValue(), ((Boolean) wh50Var6.getValue()).booleanValue(), ((Boolean) wh50Var7.getValue()).booleanValue(), ((Boolean) ((wh50) ref$ObjectRef3.element).getValue()).booleanValue(), M, 0);
            k(wh50Var2, wh50Var3, wh50Var4, wh50Var5, wh50Var6, wh50Var7, (wh50) ref$ObjectRef3.element, M, 224694);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ohe0(q630Var, i, 1);
        }
    }

    public static final void j(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(383008553);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.l(z3) ? 256 : 128) | (M.l(z4) ? 2048 : 1024) | (M.l(z5) ? 16384 : 8192) | (M.l(z6) ? 131072 : 65536) | (M.l(z7) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(383008553, i2, -1, "com.vk.design.demo.presentation.screens.SecondaryViewTabsContent (TabsScreenContent.kt:402)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ow60(17);
                M.R(x);
            }
            int i3 = (i2 & 14) | 100663344;
            int i4 = i2 << 3;
            l(z, "VkSecondaryTabLayout", z2, z3, z4, z5, z6, z7, (izs) x, null, M, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, z, z2, z3, z4, z5, z6, z7) { // from class: xsna.tyn0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;

                {
                    this.b = z;
                    this.c = z2;
                    this.d = z3;
                    this.e = z4;
                    this.f = z5;
                    this.g = z6;
                    this.h = z7;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    jzn0.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void k(final wh50<Boolean> wh50Var, final wh50<Boolean> wh50Var2, final wh50<Boolean> wh50Var3, final wh50<Boolean> wh50Var4, final wh50<Boolean> wh50Var5, final wh50<Boolean> wh50Var6, final wh50<Boolean> wh50Var7, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1713017087);
        if ((i & 1572864) == 0) {
            i2 = i | (M.J(wh50Var7) ? 1048576 : 524288);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1713017087, i2, -1, "com.vk.design.demo.presentation.screens.Settings (TabsScreenContent.kt:818)");
            }
            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean booleanValue = wh50Var.getValue().booleanValue();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new g9c(2, wh50Var);
                M.R(x);
            }
            eku0.d("Disabled", (gzs) x, H, booleanValue, null, false, false, M, 390, 112);
            boolean booleanValue2 = wh50Var2.getValue().booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new jni(3, wh50Var2);
                M.R(x2);
            }
            eku0.d("Fixed Tab", (gzs) x2, null, booleanValue2, null, false, false, M, 6, 116);
            boolean booleanValue3 = wh50Var3.getValue().booleanValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new kni(2, wh50Var3);
                M.R(x3);
            }
            eku0.d("Fixed Icon", (gzs) x3, null, booleanValue3, null, false, false, M, 6, 116);
            boolean booleanValue4 = wh50Var4.getValue().booleanValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new lni(1, wh50Var4);
                M.R(x4);
            }
            eku0.d("Show left & right icons", (gzs) x4, null, booleanValue4, null, false, false, M, 6, 116);
            boolean booleanValue5 = wh50Var5.getValue().booleanValue();
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new mni(3, wh50Var5);
                M.R(x5);
            }
            eku0.d("Show badge", (gzs) x5, null, booleanValue5, null, false, false, M, 6, 116);
            boolean booleanValue6 = wh50Var6.getValue().booleanValue();
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new pn20(1, wh50Var6);
                M.R(x6);
            }
            eku0.d("Show counter", (gzs) x6, null, booleanValue6, null, false, false, M, 6, 116);
            boolean booleanValue7 = wh50Var7.getValue().booleanValue();
            boolean z = (3670016 & i2) == 1048576;
            Object x7 = M.x();
            if (z || x7 == c0012a) {
                x7 = new s1k(2, wh50Var7);
                M.R(x7);
            }
            eku0.d("Show border", (gzs) x7, null, booleanValue7, null, false, false, M, 6, 116);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.syn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzn0.k(wh50.this, wh50Var2, wh50Var3, wh50Var4, wh50Var5, wh50Var6, wh50Var7, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(final boolean z, final String str, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final izs<? super Context, VkTabs> izsVar, izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar3;
        androidx.compose.runtime.a aVar2;
        final izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar4;
        izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar5;
        boolean z8;
        a.l lVar;
        cri.a.C2678a c2678a;
        int i3;
        float f;
        int i4;
        final izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar6;
        xpy xpyVar;
        int i5;
        int i6;
        boolean z9;
        izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar7;
        xpy xpyVar2;
        boolean z10;
        final izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar8;
        boolean z11;
        androidx.compose.runtime.a aVar3;
        izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar9;
        androidx.compose.runtime.a M = aVar.M(-1746443926);
        int i7 = (M.l(z) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i7 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= M.l(z4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i7 |= M.l(z5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i7 |= M.l(z6) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i7 |= M.l(z7) ? 8388608 : 4194304;
        }
        int i8 = i2 & 512;
        if (i8 != 0) {
            i7 |= 805306368;
            izsVar3 = izsVar2;
        } else {
            izsVar3 = izsVar2;
            if ((i & 805306368) == 0) {
                i7 |= M.y(izsVar3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
        }
        if (M.t(i7 & 1, (i7 & 306783379) != 306783378)) {
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i8 != 0) {
                Object x = M.x();
                if (x == c0012a) {
                    x = new d230(16);
                    M.R(x);
                }
                izsVar5 = (izs) x;
            } else {
                izsVar5 = izsVar3;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1746443926, i7, -1, "com.vk.design.demo.presentation.screens.ViewTabsContent (TabsScreenContent.kt:573)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z4, M);
            }
            wh50 wh50Var = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z5, M);
            }
            wh50 wh50Var2 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z6, M);
            }
            wh50 wh50Var3 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z7, M);
            }
            wh50 wh50Var4 = (wh50) x5;
            int i9 = i7;
            boolean z12 = (((Boolean) wh50Var.getValue()).booleanValue() == z4 && ((Boolean) wh50Var2.getValue()).booleanValue() == z5 && ((Boolean) wh50Var3.getValue()).booleanValue() == z6 && ((Boolean) wh50Var4.getValue()).booleanValue() == z7) ? false : true;
            boolean z13 = z12;
            if (z12) {
                wh50Var.setValue(Boolean.valueOf(z4));
                wh50Var2.setValue(Boolean.valueOf(z5));
                wh50Var3.setValue(Boolean.valueOf(z6));
                wh50Var4.setValue(Boolean.valueOf(z7));
            }
            String concat = str.concat(StringUtils.PROCESS_POSTFIX_DELIMITER);
            float f2 = 8;
            q630.a aVar4 = q630.a.a;
            rzo0.a(48, 0, M, concat, s200.D(aVar4, f2));
            q630 f3 = txj0.f(aVar4, 1.0f);
            a.l lVar2 = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar10 = izsVar5;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar2, bVar, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f3);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar3 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i10 = i9 & 1879048192;
            int i11 = i9 & 57344;
            int i12 = i9 & 458752;
            int i13 = i9 & 3670016;
            boolean z14 = (i11 == 16384) | (i10 == 536870912) | (i12 == 131072) | (i13 == 1048576);
            Object x6 = M.x();
            if (z14 || x6 == c0012a) {
                z8 = z13;
                lVar = lVar2;
                c2678a = c2678a2;
                i3 = i10;
                f = f2;
                i4 = i12;
                izsVar6 = izsVar10;
                xpyVar = xpyVar3;
                x6 = new izs() { // from class: xsna.yyn0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkTabs vkTabs = (VkTabs) izs.this.invoke((Context) obj);
                        vkTabs.setTabLayoutMode(VkTabs.TabLayoutMode.FIXED);
                        jzn0.m(vkTabs, izsVar6, 4, z4, z5, z6);
                        return vkTabs;
                    }
                };
                M.R(x6);
            } else {
                z8 = z13;
                lVar = lVar2;
                c2678a = c2678a2;
                i3 = i10;
                f = f2;
                i4 = i12;
                izsVar6 = izsVar10;
                xpyVar = xpyVar3;
            }
            izs izsVar11 = (izs) x6;
            int i14 = i9 & 14;
            int i15 = i9 & 29360128;
            boolean l = (i14 == 4) | M.l(z8) | (i3 == 536870912) | (i11 == 16384) | (i4 == 131072) | (i13 == 1048576) | (i15 == 8388608);
            Object x7 = M.x();
            if (l || x7 == c0012a) {
                i5 = i14;
                i6 = i15;
                final izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar12 = izsVar6;
                final boolean z15 = z8;
                izs izsVar13 = new izs() { // from class: xsna.zyn0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkTabs vkTabs = (VkTabs) obj;
                        vkTabs.setEnabled(!z);
                        if (z15) {
                            jzn0.m(vkTabs, izsVar12, 4, z4, z5, z6);
                            if (z7) {
                                bwt0.Y(vkTabs, 1, R.attr.vk_ui_accent_red, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } else {
                                bwt0.Y(vkTabs, 0, R.attr.vk_ui_transparent, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                        }
                        return s3q0.a;
                    }
                };
                z9 = z15;
                izsVar7 = izsVar12;
                M.R(izsVar13);
                x7 = izsVar13;
            } else {
                i5 = i14;
                i6 = i15;
                z9 = z8;
                izsVar7 = izsVar6;
            }
            ae2.a(0, 0, M, izsVar11, (izs) x7, xpyVar);
            M.G();
            rzo0.a(48, 0, M, str.concat(", scrollable:"), s200.D(aVar4, f));
            q630 f4 = txj0.f(aVar4, 1.0f);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x8 = M.x();
            if (x8 == c0012a) {
                int i16 = com.vk.core.view.components.tabs.d.G;
                nxv0 a3 = d.a.a(context);
                VkTabs.c cVar2 = new VkTabs.c(a3);
                a3.Y4("Fixed", null);
                a3.setOnClickListener(new q01(cVar2, 13));
                x8 = androidx.compose.runtime.k.b(cVar2);
                M.R(x8);
            }
            final wh50 wh50Var5 = (wh50) x8;
            Object x9 = M.x();
            if (x9 == c0012a) {
                Drawable drawable = context.getDrawable(R.drawable.vk_icon_add_outline_24);
                x9 = androidx.compose.runtime.k.b(drawable != null ? new wmr(drawable, null, new daz(23)) : null);
                M.R(x9);
            }
            final wh50 wh50Var6 = (wh50) x9;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar4 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z16 = (i3 == 536870912) | (i11 == 16384) | (i4 == 131072) | (i13 == 1048576);
            Object x10 = M.x();
            if (z16 || x10 == c0012a) {
                xpyVar2 = xpyVar4;
                z10 = false;
                izsVar8 = izsVar7;
                z11 = true;
                izs izsVar14 = new izs() { // from class: xsna.azn0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkTabs vkTabs = (VkTabs) izs.this.invoke((Context) obj);
                        vkTabs.setTabLayoutMode(VkTabs.TabLayoutMode.SCROLLABLE);
                        jzn0.m(vkTabs, izsVar8, 10, z4, z5, z6);
                        return vkTabs;
                    }
                };
                M.R(izsVar14);
                x10 = izsVar14;
            } else {
                xpyVar2 = xpyVar4;
                z10 = false;
                izsVar8 = izsVar7;
                z11 = true;
            }
            izs izsVar15 = (izs) x10;
            boolean l2 = ((i9 & 7168) == 2048 ? z11 : z10) | (i5 == 4 ? z11 : z10) | ((i9 & 896) == 256 ? z11 : z10) | M.l(z9) | (i3 == 536870912 ? z11 : z10) | (i11 == 16384 ? z11 : z10) | (i4 == 131072 ? z11 : z10) | (i13 == 1048576 ? z11 : z10);
            if (i6 != 8388608) {
                z11 = z10;
            }
            boolean z17 = l2 | z11;
            Object x11 = M.x();
            if (z17 || x11 == c0012a) {
                final izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar16 = izsVar8;
                final boolean z18 = z9;
                aVar3 = M;
                x11 = new izs() { // from class: xsna.bzn0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkTabs vkTabs = (VkTabs) obj;
                        vkTabs.setEnabled(!z);
                        VkTabs.c cVar3 = (VkTabs.c) wh50Var5.getValue();
                        if (!z2) {
                            cVar3 = null;
                        }
                        vkTabs.setFixedTab(cVar3);
                        vkTabs.setFixedIcon(z3 ? (wmr) wh50Var6.getValue() : null);
                        if (z18) {
                            jzn0.m(vkTabs, izsVar16, 10, z4, z5, z6);
                            if (z7) {
                                bwt0.Y(vkTabs, 1, R.attr.vk_ui_accent_red, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } else {
                                bwt0.Y(vkTabs, 0, R.attr.vk_ui_transparent, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                        }
                        return s3q0.a;
                    }
                };
                izsVar9 = izsVar16;
                aVar3.R(x11);
            } else {
                izsVar9 = izsVar8;
                aVar3 = M;
            }
            aVar2 = aVar3;
            ae2.a(0, 0, aVar2, izsVar15, (izs) x11, xpyVar2);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            izsVar4 = izsVar9;
        } else {
            aVar2 = M;
            aVar2.h();
            izsVar4 = izsVar3;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.czn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzn0.l(z, str, z2, z3, z4, z5, z6, z7, izsVar, izsVar4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void m(VkTabs vkTabs, izs<? super com.vk.core.view.components.tabs.d, s3q0> izsVar, int i, boolean z, boolean z2, boolean z3) {
        vkTabs.setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, vkTabs.getContext())));
        vkTabs.h(true);
        for (int i2 = 0; i2 < i; i2++) {
            VkTabs.c g = vkTabs.g();
            com.vk.core.view.components.tabs.d dVar = g.a;
            dVar.setOnClickListener(new ofd0(2, vkTabs, g));
            dVar.Y4("Tab", null);
            izsVar.invoke(dVar);
            vkTabs.b(g, true);
            if (z) {
                Drawable drawable = vkTabs.getContext().getDrawable(R.drawable.vk_icon_user_outline_24);
                if (drawable != null) {
                    dVar.T4(drawable, true, hbh0.b(24, dVar.getContext()));
                }
                Drawable drawable2 = vkTabs.getContext().getDrawable(R.drawable.vk_icon_notification_outline_24);
                if (drawable2 != null) {
                    int b = hbh0.b(24, dVar.getContext());
                    ImageView imageView = dVar.w;
                    if (b == Integer.MIN_VALUE) {
                        b = e3m.a(R.dimen.ds_tab_icon_size, dVar.getContext());
                    }
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = b;
                    layoutParams.height = b;
                    imageView.setLayoutParams(layoutParams);
                    imageView.setImageDrawable(drawable2);
                    imageView.setVisibility(0);
                    dVar.setRightIconColorful(true);
                }
            }
            if (z2) {
                dVar.setIndicator(c.a.a);
            } else if (z3) {
                dVar.setIndicator(new c.b(123));
            }
        }
    }
}

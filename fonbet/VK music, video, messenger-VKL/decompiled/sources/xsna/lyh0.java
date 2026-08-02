package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlh0;

/* compiled from: SearchScreenContent.kt */
/* loaded from: classes18.dex */
public final class lyh0 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0456  */
    @Override // xsna.yah0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        Object obj;
        Pair pair;
        cri.a.e eVar;
        int i3;
        int i4;
        Map map;
        Map map2;
        gzs gzsVar3;
        int i5;
        cri.a.c cVar;
        gzs gzsVar4;
        Object x;
        Object x2;
        androidx.compose.runtime.a M = aVar.M(-202832055);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        int i6 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i6 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 8211) != 8210)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-202832055, i2, -1, "com.vk.design.demo.presentation.screens.SearchScreenContent.Content (SearchScreenContent.kt:48)");
            }
            q630 f = txj0.f(aVar3, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a, cVar2);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            myh0.a(gzsVar, gzsVar2, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            Object x3 = M.x();
            Object obj2 = a.C0011a.a;
            if (x3 == obj2) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var = (wh50) x3;
            Object x4 = M.x();
            if (x4 == obj2) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            wh50 wh50Var2 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == obj2) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            wh50 wh50Var3 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == obj2) {
                x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x6);
            }
            wh50 wh50Var4 = (wh50) x6;
            Object x7 = M.x();
            if (x7 == obj2) {
                x7 = androidx.compose.runtime.k.b("none");
                M.R(x7);
            }
            wh50 wh50Var5 = (wh50) x7;
            Object x8 = M.x();
            if (x8 == obj2) {
                x8 = androidx.compose.runtime.k.b("none");
                M.R(x8);
            }
            wh50 wh50Var6 = (wh50) x8;
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Pair pair2 = new Pair("none", null);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                obj = "none";
                pair = pair2;
                eVar = eVar2;
                i3 = -1;
                i4 = 0;
                androidx.compose.runtime.b.f(21357602, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-List24> (VkIcons.kt:6532)");
            } else {
                obj = "none";
                pair = pair2;
                eVar = eVar2;
                i3 = -1;
                i4 = 0;
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_list_24, i4, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i7 = i3;
            int i8 = i4;
            cri.a.e eVar3 = eVar;
            Object obj3 = obj;
            Pair pair3 = pair;
            Pair pair4 = new Pair("list", lmc.e(a2, 0L, null, null, null, M, 30));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(49016044, i8, i7, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CalendarOutline24> (VkSdkIcons.kt:180)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_calendar_outline_24, i8, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Pair pair5 = new Pair("calendar", lmc.e(a3, 0L, null, null, null, M, 30));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-287174724, i8, i7, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CompassOutline28> (VkSdkIcons.kt:566)");
            }
            lg90 b = or.b(M, 352828580, R.drawable.vk_icon_compass_outline_28, M, i8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Map k = pn00.k(pair3, pair4, pair5, new Pair("compass", lmc.e(b, 0L, null, null, null, M, 30)));
            Pair pair6 = new Pair(obj3, null);
            boolean y = M.y(context);
            Object x9 = M.x();
            if (y || x9 == obj2) {
                x9 = new vex(context, 27);
                M.R(x9);
            }
            Pair pair7 = new Pair("microphone", vlh0.a(3072, 5, M, null, null, (gzs) x9));
            boolean y2 = M.y(context);
            Object x10 = M.x();
            if (y2 || x10 == obj2) {
                x10 = new q010(context, 28);
                M.R(x10);
            }
            Map k2 = pn00.k(pair6, pair7, new Pair("marusia", ulh0.a((gzs) x10, M, 5)));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1143362065, 3072, i7, "com.vk.core.compose.component.search.Search.Left.Back.Companion.invoke (Search.kt:28)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-480213854, 6, i7, "com.vk.core.compose.component.search.remember (LeftBackImpl.kt:44)");
            }
            Object x11 = M.x();
            if (x11 == obj2) {
                x11 = new ozy(0);
                M.R(x11);
            }
            ozy ozyVar = (ozy) x11;
            ((zak0) ozyVar.a).setValue(null);
            ((zak0) ozyVar.c).setValue(null);
            ((zak0) ozyVar.b).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean y3 = M.y(context);
            Object x12 = M.x();
            if (y3 || x12 == obj2) {
                x12 = new ywn(context, 3);
                M.R(x12);
            }
            gzs gzsVar5 = (gzs) x12;
            djn0.a(true, false, M, 438, 0);
            f9t.e(txj0.h(aVar3, 100), M, 0);
            Object x13 = M.x();
            if (x13 == obj2) {
                x13 = or.a("", 0L, 6, M);
            }
            wh50 wh50Var7 = (wh50) x13;
            q630 D2 = s200.D(aVar3, kqu0.b);
            String N = d370.N(R.string.vk_search_hint, 0, M);
            tho0 tho0Var = (tho0) wh50Var7.getValue();
            if (!((Boolean) wh50Var2.getValue()).booleanValue()) {
                ozyVar = null;
            }
            tlh0.b bVar2 = (tlh0.b) k2.get((String) wh50Var5.getValue());
            tlh0 tlh0Var = (tlh0) k.get((String) wh50Var6.getValue());
            boolean booleanValue = ((Boolean) wh50Var3.getValue()).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                map = k2;
                map2 = k;
                androidx.compose.runtime.b.f(682577447, 0, i7, "com.vk.design.demo.presentation.screens.getRightByState (SearchScreenContent.kt:164)");
            } else {
                map = k2;
                map2 = k;
            }
            fkg0 l = mnh0.l(null, M, 15);
            if (tlh0Var == null && booleanValue) {
                M.K(-1173063187);
                M.j();
                tlh0Var = l;
            } else if (tlh0Var == null || booleanValue) {
                if (tlh0Var == null || !booleanValue) {
                    gzsVar3 = gzsVar5;
                    i5 = 6;
                    M.K(-2005021098);
                    M.j();
                    tlh0Var = null;
                } else {
                    M.K(-1173059507);
                    if (androidx.compose.runtime.b.d()) {
                        gzsVar3 = gzsVar5;
                        androidx.compose.runtime.b.f(-1666303620, 384, i7, "com.vk.core.compose.component.search.Search.Right.Pair.Companion.invoke (Search.kt:90)");
                    } else {
                        gzsVar3 = gzsVar5;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        i5 = 6;
                        androidx.compose.runtime.b.f(477722601, 6, i7, "com.vk.core.compose.component.search.remember (RightPairImpl.kt:31)");
                    } else {
                        i5 = 6;
                    }
                    Object x14 = M.x();
                    if (x14 == obj2) {
                        x14 = new nkg0(tlh0Var, l);
                        M.R(x14);
                    }
                    nkg0 nkg0Var = (nkg0) x14;
                    ((zak0) nkg0Var.a).setValue(tlh0Var);
                    ((zak0) nkg0Var.b).setValue(l);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    tlh0Var = nkg0Var;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (((Boolean) wh50Var.getValue()).booleanValue()) {
                    cVar = cVar2;
                    gzsVar4 = null;
                } else {
                    cVar = cVar2;
                    gzsVar4 = gzsVar3;
                }
                boolean booleanValue2 = ((Boolean) wh50Var4.getValue()).booleanValue();
                x = M.x();
                if (x == obj2) {
                    x = new j5b0(wh50Var7, 7);
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                x2 = M.x();
                if (x2 == obj2) {
                    x2 = new b2k(3, wh50Var7);
                    M.R(x2);
                }
                int i9 = i5;
                fiv0.a(N, tho0Var, izsVar2, D2, ozyVar, bVar2, tlh0Var, null, (gzs) x2, null, gzsVar4, false, null, false, booleanValue2, M, 100663680, 0, 14976);
                q630 f2 = txj0.f(aVar3, 1.0f);
                cp10 d = ja8.d(dt1.a.i, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c2 = qri.c(M, f2);
                if (M.N() != null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cVar);
                k9q0.w(M, D3, eVar3);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                q630 f3 = txj0.f(aVar3, 1.0f);
                androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.o, M, 48);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
                q630 c3 = qri.c(M, f3);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, a4, cVar);
                k9q0.w(M, D4, eVar3);
                ur.d(hashCode3, M, bVar, M, c2678a);
                k9q0.w(M, c3, dVar);
                androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.k, M, i9);
                int hashCode4 = Long.hashCode(n34.n(M));
                sy90 D5 = M.D();
                q630 c4 = qri.c(M, aVar3);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, a5, cVar);
                k9q0.w(M, D5, eVar3);
                ur.d(hashCode4, M, bVar, M, c2678a);
                k9q0.w(M, c4, dVar);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                String str = (String) wh50Var5.getValue();
                Object x15 = M.x();
                if (x15 == obj2) {
                    x15 = new tc8(2, wh50Var5);
                    M.R(x15);
                }
                y9i0.a("Voice", map, str, (izs) x15, xpyVar, M, 3078, 0);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                xpy xpyVar2 = new xpy(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                String str2 = (String) wh50Var6.getValue();
                Object x16 = M.x();
                if (x16 == obj2) {
                    x16 = new uc8(3, wh50Var6);
                    M.R(x16);
                }
                y9i0.a("Extra", map2, str2, (izs) x16, xpyVar2, M, 3078, 0);
                M.G();
                boolean booleanValue3 = ((Boolean) wh50Var.getValue()).booleanValue();
                Object x17 = M.x();
                if (x17 == obj2) {
                    x17 = new o26(3, wh50Var);
                    M.R(x17);
                }
                eku0.d("Read only", (gzs) x17, null, booleanValue3, null, false, false, M, 54, 116);
                boolean booleanValue4 = ((Boolean) wh50Var2.getValue()).booleanValue();
                Object x18 = M.x();
                if (x18 == obj2) {
                    x18 = new loj(2, wh50Var2);
                    M.R(x18);
                }
                eku0.d("Back", (gzs) x18, null, booleanValue4, null, false, false, M, 54, 116);
                boolean booleanValue5 = ((Boolean) wh50Var3.getValue()).booleanValue();
                Object x19 = M.x();
                if (x19 == obj2) {
                    x19 = new p8s(3, wh50Var3);
                    M.R(x19);
                }
                eku0.d("Filter Button", (gzs) x19, null, booleanValue5, null, false, false, M, 54, 116);
                boolean booleanValue6 = ((Boolean) wh50Var4.getValue()).booleanValue();
                Object x20 = M.x();
                if (x20 == obj2) {
                    x20 = new f030(2, wh50Var4);
                    M.R(x20);
                }
                eku0.d("Loading", (gzs) x20, null, booleanValue6, null, false, false, M, 54, 116);
                aVar2 = M;
                aVar2.G();
                aVar2.G();
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(-1173061556);
                M.j();
            }
            gzsVar3 = gzsVar5;
            i5 = 6;
            if (androidx.compose.runtime.b.d()) {
            }
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
            }
            boolean booleanValue22 = ((Boolean) wh50Var4.getValue()).booleanValue();
            x = M.x();
            if (x == obj2) {
            }
            izs izsVar22 = (izs) x;
            x2 = M.x();
            if (x2 == obj2) {
            }
            int i92 = i5;
            fiv0.a(N, tho0Var, izsVar22, D2, ozyVar, bVar2, tlh0Var, null, (gzs) x2, null, gzsVar4, false, null, false, booleanValue22, M, 100663680, 0, 14976);
            q630 f22 = txj0.f(aVar3, 1.0f);
            cp10 d2 = ja8.d(dt1.a.i, false);
            int hashCode22 = Long.hashCode(n34.n(M));
            sy90 D32 = M.D();
            q630 c22 = qri.c(M, f22);
            if (M.N() != null) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new g030(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}

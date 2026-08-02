package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.ecomm.orders.impl.common.ui.model.SpanType;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.us2;

/* compiled from: OrdersInfoRow.kt */
/* loaded from: classes18.dex */
public final class ey80 {

    /* compiled from: OrdersInfoRow.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpanType.Text.Color.values().length];
            try {
                iArr[SpanType.Text.Color.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpanType.Text.Color.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final Map map, final wzs wzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        boolean z;
        char c;
        hik0 hik0Var;
        a.C0011a.C0012a c0012a;
        q630.a aVar2;
        Iterator it;
        String str2;
        int i2;
        int i3;
        String str3;
        String str4;
        char c2;
        a.C0011a.C0012a c0012a2;
        Object x;
        String str5;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-807099874);
        int i6 = (M.J(str) ? 4 : 2) | i | (M.J(map) ? 32 : 16) | (M.y(wzsVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i6 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-807099874, i6, -1, "com.vk.ecomm.orders.impl.common.ui.compose.OrderInfoRow (OrdersInfoRow.kt:43)");
            }
            if (!map.isEmpty()) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    if (((com.vk.ecomm.orders.impl.common.ui.model.a) ((Map.Entry) it2.next()).getValue()).d instanceof SpanType.a) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            q630 E = s200.E(q630Var, kqu0.b, kqu0.r);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, bVar, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, E);
            cri.h7.getClass();
            int i7 = i6;
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c3, dVar);
            q630.a aVar4 = q630.a.a;
            q630 E2 = ahn.E(aVar4, "order_info_row_title");
            int i8 = i7 & 14;
            boolean z2 = i8 == 4;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (z2 || x2 == c0012a3) {
                x2 = new mev(str, 2);
                M.R(x2);
            }
            q630 v = txj0.v(egi0.b(E2, false, (izs) x2), ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 360 ? 170 : VersionConstants.PRODUCT_MAJOR_VERSION);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().r;
            if (androidx.compose.runtime.b.d()) {
                c = 65535;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                c = 65535;
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar5 = aVar4;
            a.C0011a.C0012a c0012a4 = c0012a3;
            int i9 = i7;
            String str6 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
            String str7 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
            yqv0.c(str, v, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.Y, M, i8 | 100663296, 48, 5880);
            if (z) {
                M.K(1935854841);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                boolean z3 = true;
                q630 E3 = ahn.E(new xpy(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), "order_info_row_value");
                androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c4 = qri.c(M, E3);
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
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar2, M, c2678a);
                k9q0.w(M, c4, dVar);
                M.K(1100375255);
                Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    com.vk.ecomm.orders.impl.common.ui.model.a aVar6 = (com.vk.ecomm.orders.impl.common.ui.model.a) ((Map.Entry) it3.next()).getValue();
                    String h = f870.h(aVar6.a, M);
                    SpanType spanType = aVar6.d;
                    if (spanType instanceof SpanType.a) {
                        M.K(67200129);
                        plg0 plg0Var = new plg0(0);
                        int i10 = i9;
                        boolean J = M.J(aVar6) | ((i10 & 896) == 256 ? z3 : false);
                        Object x3 = M.x();
                        if (J) {
                            c0012a2 = c0012a4;
                        } else {
                            c0012a2 = c0012a4;
                            if (x3 != c0012a2) {
                                q630 c5 = ojc.c(aVar5, false, null, plg0Var, (gzs) x3, 11);
                                x = M.x();
                                if (x == c0012a2) {
                                    x = new byo(15);
                                    M.R(x);
                                }
                                q630 b = egi0.b(c5, false, (izs) x);
                                if (androidx.compose.runtime.b.d()) {
                                    str5 = str7;
                                    i4 = 1040687336;
                                    i5 = -1;
                                } else {
                                    str5 = str7;
                                    i4 = 1040687336;
                                    i5 = -1;
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, str5);
                                }
                                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j2 = ylu0Var2.getText().f;
                                String str8 = str5;
                                String str9 = str6;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-473561179, 0, i5, str9);
                                }
                                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar2 = aVar5;
                                c0012a = c0012a2;
                                androidx.compose.runtime.a aVar7 = M;
                                i9 = i10;
                                yqv0.c(h, b, j2, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var2.Y, aVar7, 0, 0, 8184);
                                M = aVar7;
                                M.j();
                                it = it3;
                                str2 = str9;
                                i2 = i5;
                                i3 = i4;
                                str3 = str8;
                            }
                        }
                        x3 = new pw(21, wzsVar, aVar6);
                        M.R(x3);
                        q630 c52 = ojc.c(aVar5, false, null, plg0Var, (gzs) x3, 11);
                        x = M.x();
                        if (x == c0012a2) {
                        }
                        q630 b2 = egi0.b(c52, false, (izs) x);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        ylu0 ylu0Var22 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        long j22 = ylu0Var22.getText().f;
                        String str82 = str5;
                        String str92 = str6;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        wuv0 wuv0Var22 = (wuv0) M.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        aVar2 = aVar5;
                        c0012a = c0012a2;
                        androidx.compose.runtime.a aVar72 = M;
                        i9 = i10;
                        yqv0.c(h, b2, j22, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var22.Y, aVar72, 0, 0, 8184);
                        M = aVar72;
                        M.j();
                        it = it3;
                        str2 = str92;
                        i2 = i5;
                        i3 = i4;
                        str3 = str82;
                    } else {
                        c0012a = c0012a4;
                        String str10 = str6;
                        String str11 = str7;
                        if (!(spanType instanceof SpanType.Text)) {
                            throw alb0.c(-1106212670, M);
                        }
                        M.K(68028077);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, str11);
                        }
                        ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j3 = ylu0Var3.getText().m;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, str10);
                        }
                        wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var3.Y;
                        aVar2 = aVar5;
                        androidx.compose.runtime.a aVar8 = M;
                        it = it3;
                        str2 = str10;
                        i2 = -1;
                        i3 = 1040687336;
                        str3 = str11;
                        yqv0.c(h, null, j3, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar8, 0, 0, 8186);
                        M = aVar8;
                        M.j();
                    }
                    String str12 = aVar6.e;
                    if (str12 == null) {
                        M.K(68366286);
                        M.j();
                        str4 = str2;
                    } else {
                        M.K(68366287);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(i3, 0, i2, str3);
                        }
                        ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j4 = ylu0Var4.getText().m;
                        if (androidx.compose.runtime.b.d()) {
                            str4 = str2;
                            c2 = 1957;
                            androidx.compose.runtime.b.f(-473561179, 0, i2, str4);
                        } else {
                            str4 = str2;
                            c2 = 1957;
                        }
                        wuv0 wuv0Var4 = (wuv0) M.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar9 = M;
                        yqv0.c(str12, null, j4, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var4.Y, aVar9, 0, 0, 8186);
                        M = aVar9;
                        s3q0 s3q0Var = s3q0.a;
                        M.j();
                    }
                    str7 = str3;
                    str6 = str4;
                    aVar5 = aVar2;
                    c0012a4 = c0012a;
                    z3 = true;
                    it3 = it;
                }
                M.j();
                M.G();
                M.j();
            } else {
                float f = Float.MAX_VALUE;
                M.K(1937662978);
                q630 E4 = ahn.E(aVar5, "order_info_row_value");
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                if (1.0f <= Float.MAX_VALUE) {
                    f = 1.0f;
                }
                q630 f2 = txj0.f(E4.g(new xpy(f, true)), 1.0f);
                int i11 = (i9 >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-984097689, i11, -1, "com.vk.ecomm.orders.impl.common.ui.compose.buildTextValuesAnnotatedString (OrdersInfoRow.kt:134)");
                }
                M.K(-825069773);
                us2.b bVar3 = new us2.b();
                M.K(-825068721);
                Iterator it4 = map.entrySet().iterator();
                while (it4.hasNext()) {
                    com.vk.ecomm.orders.impl.common.ui.model.a aVar10 = (com.vk.ecomm.orders.impl.common.ui.model.a) ((Map.Entry) it4.next()).getValue();
                    String h2 = f870.h(aVar10.a, M);
                    SpanType spanType2 = aVar10.d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1389131158, 0, -1, "com.vk.ecomm.orders.impl.common.ui.compose.getSpanStyle (OrdersInfoRow.kt:147)");
                    }
                    if (spanType2 instanceof SpanType.a) {
                        M.K(-779782459);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, str7);
                        }
                        ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        hik0Var = new hik0(ylu0Var5.getText().f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                        M.j();
                    } else {
                        if (!(spanType2 instanceof SpanType.Text)) {
                            throw alb0.c(-779783505, M);
                        }
                        M.K(1596628335);
                        int i12 = a.$EnumSwitchMapping$0[((SpanType.Text) spanType2).a.ordinal()];
                        if (i12 == 1) {
                            M.K(-779778008);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, str7);
                            }
                            ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            hik0Var = new hik0(ylu0Var6.getText().m, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                            M.j();
                        } else {
                            if (i12 != 2) {
                                throw alb0.c(-779779853, M);
                            }
                            M.K(-779774934);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, str7);
                            }
                            ylu0 ylu0Var7 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            hik0Var = new hik0(ylu0Var7.getText().p, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                            M.j();
                        }
                        M.j();
                    }
                    hik0 hik0Var2 = hik0Var;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int m = bVar3.m(hik0Var2);
                    try {
                        bVar3.g(h2);
                        s3q0 s3q0Var2 = s3q0.a;
                        bVar3.k(m);
                        String str13 = aVar10.e;
                        if (str13 != null) {
                            bVar3.g(str13);
                        }
                    } catch (Throwable th) {
                        bVar3.k(m);
                        throw th;
                    }
                }
                M.j();
                us2 n = bVar3.n();
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, str7);
                }
                ylu0 ylu0Var8 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j5 = ylu0Var8.getText().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, str6);
                }
                wuv0 wuv0Var5 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.d(n, f2, j5, 0, null, 0, false, 0, null, null, wuv0Var5.Y, M, 0, 0, 8184);
                M = M;
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dy80
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ey80.a(str, map, wzsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

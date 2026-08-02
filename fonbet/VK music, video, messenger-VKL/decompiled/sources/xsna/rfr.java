package xsna;

import androidx.compose.runtime.a;
import com.ironsource.Z3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;
import com.vkontakte.android.R;
import java.util.List;
import org.chromium.net.NetError;
import xsna.g8s;
import xsna.h8s;
import xsna.k8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: FiltersBottomSheet.kt */
/* loaded from: classes18.dex */
public final class rfr {

    /* compiled from: FiltersBottomSheet.kt */
    public static final class a implements k8s.a {
        public final /* synthetic */ wh50<Integer> a;
        public final /* synthetic */ ogr b;
        public final /* synthetic */ wh50<tho0> c;

        public a(wh50<Integer> wh50Var, ogr ogrVar, wh50<tho0> wh50Var2) {
            this.a = wh50Var;
            this.b = ogrVar;
            this.c = wh50Var2;
        }

        @Override // xsna.k8s.a
        public final void a(k8s.a aVar, androidx.compose.runtime.a aVar2, int i) {
            androidx.compose.runtime.a M = aVar2.M(1682698353);
            int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1682698353, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.PriceField.<anonymous>.<anonymous>.<no name provided>.Content (FiltersBottomSheet.kt:185)");
                }
                wh50<tho0> wh50Var = this.c;
                tho0 value = wh50Var.getValue();
                String N = d370.N(R.string.storefront_services_hint_price_from, 0, M);
                rgy rgyVar = new rgy(3, 0, 123);
                wh50<Integer> wh50Var2 = this.a;
                boolean J = M.J(wh50Var2);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new ij8(15, wh50Var2, wh50Var);
                    M.R(x);
                }
                vyu0.a(aVar, g8s.b.a.a(s2x.a.C3649a.b(value, (izs) x, N, 0L, 0L, rgyVar, null, null, null, null, false, null, M, 12582912, 196608, 32632), null, false, null, M, 24576, 14), null, h8s.a.a(kq01.g(this.b.b, M), false, null, null, null, M, 196608, 30), null, null, M, i2 & 14, 26);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new x7d(this, aVar, i, 4);
            }
        }
    }

    /* compiled from: FiltersBottomSheet.kt */
    public static final class b implements k8s.a {
        public final /* synthetic */ wh50<Integer> a;
        public final /* synthetic */ wh50<tho0> b;

        public b(wh50<Integer> wh50Var, wh50<tho0> wh50Var2) {
            this.a = wh50Var;
            this.b = wh50Var2;
        }

        @Override // xsna.k8s.a
        public final void a(k8s.a aVar, androidx.compose.runtime.a aVar2, int i) {
            androidx.compose.runtime.a M = aVar2.M(1005901722);
            int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1005901722, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.PriceField.<anonymous>.<anonymous>.<no name provided>.Content (FiltersBottomSheet.kt:203)");
                }
                wh50<tho0> wh50Var = this.b;
                tho0 value = wh50Var.getValue();
                String N = d370.N(R.string.storefront_services_hint_price_to, 0, M);
                rgy rgyVar = new rgy(3, 0, 123);
                wh50<Integer> wh50Var2 = this.a;
                boolean J = M.J(wh50Var2);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new j20(14, wh50Var2, wh50Var);
                    M.R(x);
                }
                vyu0.a(aVar, g8s.b.a.a(s2x.a.C3649a.b(value, (izs) x, N, 0L, 0L, rgyVar, null, null, null, null, false, null, M, 12582912, 196608, 32632), null, false, null, M, 24576, 14), null, h8s.a.a("", false, null, null, null, M, 196614, 30), null, null, M, i2 & 14, 26);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new e5l(this, aVar, i, 2);
            }
        }
    }

    public static final void a(ogr ogrVar, fdj0 fdj0Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        fdj0 fdj0Var2;
        int i3;
        fdj0 fdj0Var3;
        androidx.compose.runtime.a M = aVar.M(-1408270585);
        if ((i & 6) == 0) {
            i2 = (M.J(ogrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                fdj0 G = nr2.G(6, 2, M, null);
                i3 = i2 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                fdj0Var3 = G;
            } else {
                M.h();
                i3 = i2 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                fdj0Var3 = fdj0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1408270585, i3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.FiltersBottomSheet (FiltersBottomSheet.kt:58)");
            }
            Mode mode = Mode.DynamicHeight;
            boolean z = (i3 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new os7(izsVar, 4);
                M.R(x);
            }
            aVar2 = M;
            a030.b(mode, (gzs) x, null, fdj0Var3, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, new z2(4), false, null, null, false, null, null, kai.c(-1258185755, new en7(1, izsVar, ogrVar), M), aVar2, 6, 100663296, 260084);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            fdj0Var2 = fdj0Var3;
        } else {
            aVar2 = M;
            aVar2.h();
            fdj0Var2 = fdj0Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new c3(i, 2, ogrVar, fdj0Var2, izsVar);
        }
    }

    public static final void b(ogr ogrVar, wh50<Integer> wh50Var, wh50<Integer> wh50Var2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1445626842);
        int i2 = i | (M.J(ogrVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1445626842, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.PriceField (FiltersBottomSheet.kt:176)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                Integer num = ogrVar.c;
                String num2 = num != null ? num.toString() : null;
                if (num2 == null) {
                    num2 = "";
                }
                x = androidx.compose.runtime.k.b(new tho0(num2, 0L, 6));
                M.R(x);
            }
            wh50 wh50Var3 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                Integer num3 = ogrVar.d;
                String num4 = num3 != null ? num3.toString() : null;
                x2 = androidx.compose.runtime.k.b(new tho0(num4 != null ? num4 : "", 0L, 6));
                M.R(x2);
            }
            wh50 wh50Var4 = (wh50) x2;
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                com.vk.voip.ui.push.c cVar = new com.vk.voip.ui.push.c(wh50Var, ogrVar, wh50Var3, wh50Var2, wh50Var4);
                M.R(cVar);
                x3 = cVar;
            }
            vyu0.c(6, M, (izs) x3, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i87(i, 1, ogrVar, wh50Var, wh50Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final String str, final List list, final yzs yzsVar, final Object obj, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-384778514);
        final int i2 = i | (M.J(str) ? 4 : 2) | (M.J(list) ? 32 : 16) | (M.y(yzsVar) ? 256 : 128) | (M.J(obj) ? 2048 : 1024) | 196608;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-384778514, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.SelectSlot (FiltersBottomSheet.kt:142)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            String str2 = (String) yzsVar.invoke(obj, M, Integer.valueOf(((i2 >> 9) & 14) | ((i2 >> 3) & 112)));
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new nfr(0, wh50Var);
                M.R(x2);
            }
            u2x a2 = g8s.b.a.a(s2x.b.a.b(str2, booleanValue, (izs) x2, null, null, 0L, 0L, null, kai.c(-925958925, new yzs() { // from class: xsna.ofr
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    int i3 = 16;
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-925958925, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.SelectSlot.<anonymous> (FiltersBottomSheet.kt:153)");
                        }
                        for (Object obj5 : list) {
                            String str3 = (String) yzsVar.invoke(obj5, aVar2, Integer.valueOf((i2 >> 9) & 8));
                            q630 f = txj0.f(q630.a.a, 1.0f);
                            izs izsVar2 = izsVar;
                            boolean J = aVar2.J(izsVar2) | aVar2.y(obj5);
                            Object x3 = aVar2.x();
                            if (J || x3 == a.C0011a.a) {
                                x3 = new cv3(izsVar2, obj5, wh50Var, 3);
                                aVar2.R(x3);
                            }
                            androidx.compose.runtime.a aVar3 = aVar2;
                            yqv0.c(str3, s200.D(ojc.c(f, false, null, null, (gzs) x3, 15), i3), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar3, 0, 0, 16380);
                            i3 = i3;
                            aVar2 = aVar3;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, Z3.l), null, false, null, M, 24576, 14);
            M = M;
            hly a3 = h8s.a.a(str, false, null, null, null, M, (i2 & 14) | 196608, 30);
            q630Var2 = q630.a.a;
            nvu0.a(a2, q630Var2, a3, null, null, M, 48, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(str, list, yzsVar, obj, izsVar, q630Var3, i) { // from class: xsna.pfr
                public final /* synthetic */ String b;
                public final /* synthetic */ List c;
                public final /* synthetic */ yzs d;
                public final /* synthetic */ Object e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(24577);
                    rfr.c(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final Integer d(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Character.isDigit(str.charAt(i))) {
                str = str.substring(0, i);
                break;
            }
            i++;
        }
        return arm0.m(10, str);
    }
}

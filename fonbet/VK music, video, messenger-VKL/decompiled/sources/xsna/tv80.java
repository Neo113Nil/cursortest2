package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.ty6;

/* compiled from: OrderListProductsPreview.kt */
/* loaded from: classes18.dex */
public final class tv80 {
    public static final float a = 88;

    public static final void a(OrdersListItem.Order.a aVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        ImageSize Cb;
        androidx.compose.runtime.a M = aVar2.M(-725556234);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-725556234, i2, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderProductImage (OrderListProductsPreview.kt:91)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            float f = a;
            int I0 = (int) azlVar.I0(f);
            Image image = aVar.d;
            lg90 l = fwu0.l(null, (image == null || (Cb = image.Cb(I0, true, false)) == null) ? null : Cb.d.d, null, null, M, 0, 61);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phw a2 = phw.a.a(l, new rek0(ylu0Var.getBackground().x), null, null, null, M, 196616, 28);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new e810(aVar, 12);
                M.R(x);
            }
            gdv0.c(a2, f, s200.E(ojc.c(egi0.b(q630Var, false, (izs) x), false, null, null, gzsVar, 15), kqu0.s, kqu0.r), PictureRadius.Large, null, null, null, M, 3120, 112);
            aVar3 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new bqg(i, 3, aVar, gzsVar, q630Var);
        }
    }

    public static final void b(final int i, final List list, final boolean z, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1505824851);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1505824851, i3, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderProductsPreview (OrderListProductsPreview.kt:45)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            u890 m = s200.m(kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new izs() { // from class: xsna.lv80
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        nvy nvyVar = (nvy) obj;
                        List list2 = list;
                        wow wowVar = new wow(list2);
                        kl60 kl60Var = new kl60(2);
                        sux suxVar = new sux(9);
                        int size = list2.size();
                        qv80 qv80Var = new qv80(kl60Var, wowVar);
                        rv80 rv80Var = new rv80(suxVar, wowVar);
                        final izs izsVar2 = izsVar;
                        nvyVar.e(size, qv80Var, rv80Var, new jai(802480018, new sv80(wowVar, izsVar2), true));
                        if (z) {
                            final int i4 = i;
                            nvy.g(nvyVar, null, null, new jai(-1953400273, new yzs() { // from class: xsna.nv80
                                @Override // xsna.yzs
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1953400273, intValue, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderProductsPreview.<anonymous>.<anonymous>.<anonymous> (OrderListProductsPreview.kt:74)");
                                        }
                                        izs izsVar3 = izs.this;
                                        boolean J = aVar3.J(izsVar3);
                                        int i5 = i4;
                                        boolean o = J | aVar3.o(i5);
                                        Object x2 = aVar3.x();
                                        if (o || x2 == a.C0011a.a) {
                                            x2 = new hjw(i5, 1, izsVar3);
                                            aVar3.R(x2);
                                        }
                                        tv80.c(48, aVar3, (gzs) x2, ahn.E(q630.a.a, "order_product_show_more"));
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar3.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 3);
                        }
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            aVar2 = M;
            lqy.b(q630Var, null, m, null, bVar, null, false, null, (izs) x, aVar2, ((i3 >> 12) & 14) | 196608, 474);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mv80
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tv80.b(i, list, z, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-260917841);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-260917841, i2, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderProductsShowMore (OrderListProductsPreview.kt:124)");
            }
            String N = d370.N(R.string.ecomm_orders_all_products_description, 0, M);
            q630 c = ojc.c(q630Var, false, null, new plg0(0), gzsVar, 11);
            gzsVar2 = gzsVar;
            boolean J = M.J(N);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new ov80(N, 0);
                M.R(x);
            }
            q630 a2 = egi0.a(c, (izs) x);
            float f = kqu0.t;
            q630 E = s200.E(a2, 19, f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f), dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1820128868, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronRightCircle28> (VkSdkIcons.kt:506)");
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_chevron_right_circle_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar4 = q630.a.a;
            pzu0.b(a4, null, txj0.q(aVar4, 28), wlb0.h(M).getIcon().a, M, 440, 0);
            float f2 = 4;
            aVar2 = M;
            yqv0.c(d370.N(R.string.ecomm_orders_all_products, 0, M), s200.G(aVar4, f2, (float) 1.5d, f2, (float) 2.5d), wlb0.h(M).getText().a, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).h0, aVar2, 48, 0, 8184);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rig(gzsVar2, q630Var, i, 4);
        }
    }
}

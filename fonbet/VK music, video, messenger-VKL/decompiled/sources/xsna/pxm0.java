package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.q630;

/* compiled from: SubscriptionButtonCell.kt */
/* loaded from: classes18.dex */
public final class pxm0 implements com.vk.core.compose.component.cell.content.o {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public pxm0() {
        throw null;
    }

    public pxm0(Boolean bool, boolean z, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar) {
        this.a = androidx.compose.runtime.k.b(bool);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = androidx.compose.runtime.k.b(aVar);
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, final q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1727429334);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1727429334, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.SubscriptionButtonCell.Content (SubscriptionButtonCell.kt:42)");
            }
            Boolean bool = (Boolean) ((zak0) this.a).getValue();
            Boolean bool2 = (Boolean) ((zak0) this.b).getValue();
            bool2.getClass();
            Pair pair = new Pair(bool, bool2);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new awm0(1);
                M.R(x);
            }
            xh2.a(pair, null, (izs) x, null, "SubscriptionStatusContentAnim", null, kai.c(-1361902263, new zzs() { // from class: xsna.oxm0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    lg90 b;
                    int i3;
                    int i4;
                    Pair pair2 = (Pair) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1361902263, intValue, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.SubscriptionButtonCell.Content.<anonymous> (SubscriptionButtonCell.kt:56)");
                    }
                    Boolean bool3 = (Boolean) pair2.d();
                    boolean booleanValue = ((Boolean) pair2.g()).booleanValue();
                    if (bool3 == null && booleanValue) {
                        aVar2.K(1176953426);
                        ck70.b(q630.a.a, 28, aVar2, 6);
                    } else {
                        aVar2.K(2125908577);
                        pxm0 pxm0Var = this;
                        q630 b2 = com.vk.core.compose.component.semantics.b.b(q630.this, (SemanticsConfiguration) ((zak0) pxm0Var.d).getValue());
                        gzs gzsVar = (gzs) ((zak0) pxm0Var.c).getValue();
                        if (booleanValue) {
                            aVar2.K(2126093957);
                            qzu0.a.getClass();
                            b = qzu0.w(aVar2);
                            aVar2.j();
                        } else {
                            aVar2.K(2126183268);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-2089848644, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddSquareOutline28> (VkSdkIcons.kt:66)");
                            }
                            b = or.b(aVar2, 1165150113, R.drawable.vk_icon_add_square_outline_28, aVar2, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar2.j();
                        }
                        float f = 28;
                        if (booleanValue) {
                            i3 = 2126505017;
                            i4 = R.string.community_market_accessibility_unsubscribe;
                        } else {
                            i3 = 2126374011;
                            i4 = R.string.community_market_accessibility_subscribe;
                        }
                        String a = zq.a(aVar2, i3, i4, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        nzu0.c(gzsVar, b, a, b2, f, ylu0Var.getIcon().a, false, null, false, null, null, aVar2, 24640, 1984);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 1597824, 42);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d8t(i, 1, this, spg0Var, q630Var);
        }
    }
}

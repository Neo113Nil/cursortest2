package xsna;

import androidx.compose.runtime.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jv90 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jv90(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (aVar.t(intValue & 1, (intValue & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-504762153, intValue, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.GenderSegment.<anonymous> (PeopleSearchFiltersBottomSheet.kt:253)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.O, aVar, 0, 0, 8186);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                i9b0 i9b0Var = (i9b0) this.c;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar2.J(q630Var) ? 32 : 16;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-770090806, intValue2, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistMenuHeader.<anonymous> (PlaylistMenuContentView.kt:228)");
                    }
                    q630 q = txj0.q(q630Var, 64);
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new q520(13);
                        aVar2.R(x);
                    }
                    xab0.a(i9b0Var.a, egi0.b(q, false, (izs) x), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                bqd0 bqd0Var = (bqd0) this.c;
                com.vk.ecomm.product_list.presentation.q qVar = (com.vk.ecomm.product_list.presentation.q) obj2;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= aVar3.J(qVar) ? 32 : 16;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1392593990, intValue3, -1, "com.vk.ecomm.product_list.presentation.ProductListMviComposeComponent.<anonymous> (ProductListMviComposeComponent.kt:65)");
                    }
                    boolean J = aVar3.J(bqd0Var);
                    Object x2 = aVar3.x();
                    if (J || x2 == a.C0011a.a) {
                        x2 = new d410(bqd0Var, 26);
                        aVar3.R(x2);
                    }
                    com.vk.ecomm.product_list.presentation.g.e(qVar, (izs) x2, aVar3, (intValue3 >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}

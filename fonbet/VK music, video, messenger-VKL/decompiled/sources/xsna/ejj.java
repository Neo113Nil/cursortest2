package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import xsna.pkj;
import xsna.q630;
import xsna.uum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ejj implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ejj(Object obj, izs izsVar, int i, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
        this.e = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        uum0 uum0Var;
        switch (this.b) {
            case 0:
                dsy dsyVar = (dsy) this.d;
                pkj pkjVar = (pkj) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2105026298, intValue, -1, "com.vk.ecomm.contentproducts.view.ProductsInPost.<anonymous>.<anonymous>.<anonymous> (ContentProductsBottomSheetContent.kt:155)");
                }
                izs izsVar = this.c;
                boolean J = aVar.J(izsVar);
                Object x = aVar.x();
                if (J || x == a.C0011a.a) {
                    x = new opd(izsVar, 2);
                    aVar.R(x);
                }
                ojj.g(dsyVar, (izs) x, aVar, 0);
                pkj.a aVar2 = (pkj.a) pkjVar;
                ojj.e(aVar2.c, aVar2.d, aVar2.f, dsyVar, null, izsVar, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                Map map = (Map) this.d;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                int i3 = 16;
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1852973170, intValue2, -1, "com.vk.design.demo.presentation.components.SelectSlot.<anonymous> (SelectSlot.kt:38)");
                    }
                    for (Object obj4 : map.keySet()) {
                        String valueOf = String.valueOf(obj4);
                        q630 f = txj0.f(q630.a.a, 1.0f);
                        izs izsVar2 = this.c;
                        boolean J2 = aVar3.J(izsVar2) | aVar3.y(obj4);
                        Object x2 = aVar3.x();
                        if (J2 || x2 == a.C0011a.a) {
                            x2 = new tbb(izsVar2, obj4, wh50Var, 6);
                            aVar3.R(x2);
                        }
                        androidx.compose.runtime.a aVar4 = aVar3;
                        yqv0.c(valueOf, s200.D(ojc.c(f, false, null, null, (gzs) x2, 15), i3), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar4, 0, 0, 16380);
                        aVar3 = aVar4;
                        jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 0, 15);
                        i3 = i3;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                List list = (List) this.d;
                yzs yzsVar = (yzs) this.e;
                lum0 lum0Var = (lum0) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= (intValue3 & 8) == 0 ? aVar5.J(lum0Var) : aVar5.y(lum0Var) ? 4 : 2;
                }
                int i4 = 0;
                if (aVar5.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    int i5 = -1;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1786811322, intValue3, -1, "com.vk.clips.design.compose.description.TrendingHashtagsList.<anonymous> (TrendingHashtagsList.kt:36)");
                    }
                    int i6 = 0;
                    for (Object obj5 : list) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            e43.t();
                            throw null;
                        }
                        String str = (String) obj5;
                        int i8 = intValue3;
                        SubnavigationButtonSize subnavigationButtonSize = SubnavigationButtonSize.Small;
                        int i9 = i6;
                        SubnavigationButtonMode subnavigationButtonMode = SubnavigationButtonMode.Secondary;
                        Object obj6 = a.C0011a.a;
                        if (i9 != 0 || yzsVar == null) {
                            aVar5.K(-314910555);
                            if (androidx.compose.runtime.b.d()) {
                                i = 0;
                                androidx.compose.runtime.b.f(-935654142, 0, i5, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Flash12> (VkSdkIcons.kt:904)");
                            } else {
                                i = 0;
                            }
                            lg90 b = or.b(aVar5, 265374120, R.drawable.vk_icon_flash_12, aVar5, i);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(840877089, 24632, i5, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.Icon.Companion.invoke (SubnavigationButton.kt:56)");
                            }
                            Object x3 = aVar5.x();
                            if (x3 == obj6) {
                                i2 = 0;
                                x3 = new uum0.b(b, false);
                                aVar5.R(x3);
                            } else {
                                i2 = 0;
                            }
                            uum0Var = (uum0.b) x3;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar5.j();
                        } else {
                            aVar5.K(-315266404);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-935654142, i4, i5, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Flash12> (VkSdkIcons.kt:904)");
                            }
                            lg90 b2 = or.b(aVar5, 265374120, R.drawable.vk_icon_flash_12, aVar5, i4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            jai c = kai.c(-366448666, new b86(yzsVar, 1), aVar5);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(640428157, 221240, i5, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.IconWithContent.Companion.invoke (SubnavigationButton.kt:110)");
                            }
                            Object x4 = aVar5.x();
                            if (x4 == obj6) {
                                x4 = new uum0.c(b2, false, c);
                                aVar5.R(x4);
                            }
                            uum0Var = (uum0.c) x4;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar5.j();
                            i2 = 0;
                        }
                        uum0 uum0Var2 = uum0Var;
                        q630 E = ahn.E(q630.a.a, "TRENDING_BADGE_CLICKABLE");
                        Object obj7 = this.c;
                        boolean J3 = aVar5.J(obj7) | aVar5.J(str);
                        Object x5 = aVar5.x();
                        if (J3 || x5 == obj6) {
                            x5 = new fk(21, obj7, str);
                            aVar5.R(x5);
                        }
                        lum0Var.a(subnavigationButtonSize, subnavigationButtonMode, false, (gzs) x5, E, null, str, null, uum0Var2, null, false, aVar5, 25014, (i8 << 3) & 112, 1696);
                        i6 = i7;
                        intValue3 = i8;
                        i5 = -1;
                        i4 = i2;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ejj(List list, yzs yzsVar, izs izsVar) {
        this.b = 2;
        this.d = list;
        this.e = yzsVar;
        this.c = izsVar;
    }
}

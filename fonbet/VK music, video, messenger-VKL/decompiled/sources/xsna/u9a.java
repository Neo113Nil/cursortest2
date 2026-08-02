package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a;
import java.util.List;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class u9a implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u9a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return z9a.r((z9a) obj4, (List) obj, (List) obj2, false, (List) obj3, null, null, 48);
            case 1:
                axq axqVar = (axq) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1853490786, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:107)");
                    }
                    axqVar.j("Один аватар, текст без анимация", aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                o1z o1zVar = (o1z) obj4;
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 != ((Integer) obj3).intValue() - 1 || !o1zVar.b) && (w820.a(o1zVar.a.getRecyclerView(), intValue3) instanceof b2c0)) {
                    intValue2 = (intValue2 & (-5)) | 1;
                }
                return Integer.valueOf(intValue2);
            case 3:
                izs izsVar = (izs) obj4;
                com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a aVar3 = (com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar4.J(aVar3) ? 4 : 2;
                }
                if (aVar4.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(336727692, intValue4, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListContentByState.<anonymous>.<anonymous> (OrderListContentByState.kt:40)");
                    }
                    if (aVar3 instanceof a.d) {
                        aVar4.K(-1588837028);
                        cw80.e((a.d) aVar3, izsVar, txj0.d(aVar, 1.0f), aVar4, 384);
                        aVar4.j();
                    } else if (aVar3 instanceof a.b) {
                        aVar4.K(-1588541877);
                        imy imyVar = ((a.b) aVar3).b;
                        aVar4.K(-1588508800);
                        boolean J = aVar4.J(izsVar);
                        Object x = aVar4.x();
                        if (J || x == a.C0011a.a) {
                            x = new gc0(izsVar, 7);
                            aVar4.R(x);
                        }
                        cy80.a(imyVar, (gzs) x, null, aVar4, 0);
                        aVar4.j();
                        s3q0 s3q0Var = s3q0.a;
                        aVar4.j();
                    } else if (aVar3 instanceof a.c) {
                        aVar4.K(-1588234977);
                        fy80.a(0, 1, aVar4, null);
                        aVar4.j();
                    } else {
                        if (!(aVar3 instanceof a.C1000a)) {
                            throw alb0.c(1472766394, aVar4);
                        }
                        aVar4.K(-1588133855);
                        by80.a(null, aVar4, 0);
                        aVar4.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                lg90 lg90Var = (lg90) obj4;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= aVar5.J(spg0Var) ? 4 : 2;
                }
                if (aVar5.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-33838258, intValue5, -1, "com.vk.profile.design.compose.onboarding.VkHintBannerInternal.<anonymous> (VkHintBanner.kt:67)");
                    }
                    q630 q = txj0.q(aVar, 40);
                    dt1.a.getClass();
                    nyu0.b(64, aVar5, spg0Var.a(q, dt1.a.k), lg90Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }
}

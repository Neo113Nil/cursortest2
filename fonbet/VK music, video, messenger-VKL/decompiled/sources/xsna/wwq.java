package xsna;

import com.vk.superapp.bridges.SuperappPurchasesBridge$PurchaseResult;
import xsna.cfx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wwq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wwq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mhn0 mhn0Var;
        switch (this.b) {
            case 0:
                axq axqVar = (axq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-318094116, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:114)");
                    }
                    axqVar.j("Проверка запуска анимации", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1308177257, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:71)");
                    }
                    v0rVar.n("VkFeedInlineCommentInput", aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                jai jaiVar = (jai) this.c;
                anx anxVar = (anx) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(anxVar) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(113366908, intValue3, -1, "com.vk.core.compose.component.VkDefaultTabRow.<anonymous>.<anonymous> (VkDefaultTabRow.kt:156)");
                    }
                    jaiVar.invoke(vpu0.e(intValue3 & 14, aVar3), aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.c;
                dq20 dq20Var = (dq20) obj;
                nge0 nge0Var = (nge0) obj2;
                int i = cfx0.a.$EnumSwitchMapping$0[((SuperappPurchasesBridge$PurchaseResult) obj3).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        mhn0Var = i != 3 ? i != 4 ? new mhn0(SuperappPurchasesBridge$PurchaseResult.ERROR, null) : new mhn0(SuperappPurchasesBridge$PurchaseResult.UNAVAILABLE, null) : new mhn0(SuperappPurchasesBridge$PurchaseResult.CANCEL, null);
                    } else {
                        mhn0Var = new mhn0(SuperappPurchasesBridge$PurchaseResult.ERROR, nge0Var != null ? nge0Var.k : null);
                    }
                } else if (nge0Var == null || nge0Var.h != 1 || ((dq20Var == null || dq20Var.getId() != 1) && nge0Var.j != 1)) {
                    mhn0Var = new mhn0(SuperappPurchasesBridge$PurchaseResult.ERROR, nge0Var != null ? nge0Var.k : null);
                } else {
                    mhn0Var = new mhn0(SuperappPurchasesBridge$PurchaseResult.SUCCESS, nge0Var.k);
                }
                yVar.onSuccess(mhn0Var);
                break;
        }
        return s3q0.a;
    }
}

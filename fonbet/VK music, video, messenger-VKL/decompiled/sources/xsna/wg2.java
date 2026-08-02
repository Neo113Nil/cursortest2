package xsna;

import com.vk.core.compose.component.skeleton.SkeletonType;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg2 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wg2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                lg90 lg90Var = (lg90) this.c;
                ((Integer) obj).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(-372388161);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-372388161, intValue, -1, "com.vk.music.stickyplayer.presentation.components.AnimatedButton.<anonymous> (AnimatedButton.kt:85)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 1:
                wcj wcjVar = (wcj) this.c;
                String str = (String) obj2;
                String str2 = (String) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                JSONObject jSONObject = (JSONObject) wcjVar.c;
                jSONObject.put("result", booleanValue);
                if (booleanValue) {
                    jSONObject.put("client_wallet_id", str);
                    jSONObject.put("client_device_id", str2);
                    break;
                }
                break;
            case 2:
                w8d0 w8d0Var = (w8d0) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(323904407, intValue2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl.Content.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockServicesListContentImpl.kt:112)");
                    }
                    w8d0Var.d0(null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                mtk0 mtk0Var = (mtk0) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1382115271, intValue3, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ReviewFriendsComposeContentView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReviewFriendsComposeContentView.kt:80)");
                    }
                    uss.a(((Number) mtk0Var.getValue()).intValue(), 48, aVar3, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                q630 q630Var = (q630) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2078215303, intValue4, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingCardsSkeleton.<anonymous> (SlidingCardsSkeleton.kt:19)");
                    }
                    akv0.a(SkeletonType.Block, rte0.d(txj0.h(txj0.d(q630Var, 1.0f), 72), vog0.b(kqu0.f)), aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }
}

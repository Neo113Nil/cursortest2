package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.stories.model.StoryEntry;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kjj implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kjj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                mm50 mm50Var = (mm50) this.c;
                pkj pkjVar = (pkj) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= aVar.J(pkjVar) ? 32 : 16;
                }
                if (aVar.t(intValue & 1, (intValue & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-620558121, intValue, -1, "com.vk.ecomm.contentproducts.view.ContentProductsBottomSheetContent.<anonymous> (ContentProductsBottomSheetContent.kt:96)");
                    }
                    boolean y = aVar.y(mm50Var);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new jm0(mm50Var, 22);
                        aVar.R(x);
                    }
                    ojj.f(pkjVar, (izs) x, aVar, (intValue >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                us2 us2Var = (us2) this.c;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1189603270, intValue2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsTab.<anonymous> (InviteFriendsTabs.kt:130)");
                    }
                    q630 E = s200.E(q630.a.a, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.d(us2Var, E, 0L, 0, null, 2, false, 1, null, null, wuv0Var.M, aVar2, 100663296, 6, 6908);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((Boolean) obj2).getClass();
                ((jzl0) this.c).m((StoryEntry) obj, false);
                break;
        }
        return s3q0.a;
    }
}

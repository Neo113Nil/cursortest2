package xsna;

import android.graphics.Bitmap;
import com.vk.dto.user.UserProfile;
import com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment;
import com.vk.log.L;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import xsna.io9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class ce9 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ce9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                io9.c cVar = ((ee9) obj3).d.T;
                if (cVar != null) {
                    cVar.c(bitmap, bArr);
                    break;
                }
                break;
            default:
                FriendRequestsTabFragment friendRequestsTabFragment = (FriendRequestsTabFragment) obj3;
                UserProfile userProfile = (UserProfile) obj2;
                int i2 = FriendRequestsTabFragment.X0;
                L.i((Throwable) obj);
                ((NewsFeedBridgeComponent) j6i.b(m7m.f(friendRequestsTabFragment), NewsFeedBridgeComponent.class)).Ad().s0(friendRequestsTabFragment.kn(), userProfile.c, null, userProfile.J);
                break;
        }
    }
}

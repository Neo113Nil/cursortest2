package xsna;

import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wyb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wyb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                xyb xybVar = (xyb) obj;
                xybVar.s = null;
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    azbVar.b();
                    break;
                }
                break;
            case 1:
                ((esh) obj).d.b(null);
                break;
            case 2:
                int i2 = FriendRequestsTabFragment.X0;
                xo9.y((RequestUserProfile) obj, false);
                break;
            default:
                ((rw30) obj).t = null;
                break;
        }
    }
}

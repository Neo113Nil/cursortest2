package xsna;

import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.data.VKList;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment;
import com.vkontakte.android.data.FriendsUtils;
import xsna.kkl0;
import xsna.lwq0;
import xsna.w920;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class n1r implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((dxh) obj2).invoke(obj);
                break;
            case 1:
                FriendRequestsTabFragment friendRequestsTabFragment = (FriendRequestsTabFragment) obj2;
                VKList vKList = (VKList) obj;
                int i2 = FriendRequestsTabFragment.X0;
                friendRequestsTabFragment.zo(vKList);
                Math.max(0, vKList.i());
                FriendsUtils.c(friendRequestsTabFragment.U0, friendRequestsTabFragment.T0 ? FriendsUtils.Request.SUGGEST : friendRequestsTabFragment.S0 ? FriendsUtils.Request.OUT : FriendsUtils.Request.IN);
                friendRequestsTabFragment.V0.b(rsg0.y0(new drs(), null, null, 3).subscribe(new ujs(friendRequestsTabFragment), new vjs()));
                break;
            case 2:
                ((wq3) obj2).invoke(obj);
                break;
            case 3:
                int i3 = MasksWrap.e0;
                ((dxh) obj2).invoke(obj);
                break;
            case 4:
                ((w920.c) obj2).invoke(obj);
                break;
            case 5:
                ((l330) obj2).invoke(obj);
                break;
            case 6:
                ((dxh) obj2).invoke(obj);
                break;
            case 7:
                ((dxh) obj2).invoke(obj);
                break;
            case 8:
                ((u3u) obj2).invoke(obj);
                break;
            case 9:
                int i4 = NewsfeedFilteredSourcesFragment.a0;
                ((m360) obj2).invoke(obj);
                break;
            case 10:
                ((yl0) obj2).invoke(obj);
                break;
            case 11:
                ((l8k) obj2).invoke(obj);
                break;
            case 12:
                ((m360) obj2).invoke(obj);
                break;
            case 13:
                ((yl0) obj2).invoke(obj);
                break;
            case 14:
                ((el30) obj2).invoke(obj);
                break;
            case 15:
                ((m360) obj2).invoke(obj);
                break;
            case 16:
                pgc0 pgc0Var = (pgc0) obj2;
                Long l = (Long) obj;
                if (l.longValue() <= 0) {
                    pgc0Var.h0();
                    break;
                } else {
                    pgc0Var.b.a(pgc0Var.g().a.g(l.longValue(), pgc0Var.c).o(asu0.a.d()).subscribe(new uec0(), new jsb0(new juz(15), 2)));
                    break;
                }
            case 17:
                ((av70) obj2).invoke(obj);
                break;
            case 18:
                ((r9e) obj2).invoke(obj);
                break;
            case 19:
                ((yhu) obj2).invoke(obj);
                break;
            case 20:
                ((av70) obj2).invoke(obj);
                break;
            case 21:
                ((yl0) obj2).invoke(obj);
                break;
            case 22:
                ((m360) obj2).invoke(obj);
                break;
            case 23:
                ((gpl0) obj2).e((kkl0.e) obj);
                break;
            case 24:
                ((av70) obj2).invoke(obj);
                break;
            case 25:
                ((a7) obj2).invoke(obj);
                break;
            case 26:
                ((m360) obj2).invoke(obj);
                break;
            case 27:
                ((m360) obj2).invoke(obj);
                break;
            case 28:
                ((m360) obj2).invoke(obj);
                break;
            default:
                ((zvq0) obj2).a(lwq0.c.e.b);
                break;
        }
    }
}

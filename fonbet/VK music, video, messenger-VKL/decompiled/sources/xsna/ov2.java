package xsna;

import com.vk.channels.api.Channel;
import com.vk.channels.impl.list.g;
import com.vk.core.tabs.SkeletonTabLayout;
import com.vk.dto.common.im.Image;
import com.vk.dto.menu.MenuResponse;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.home.HomeFragment2;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.ArrayList;
import xsna.jip;
import xsna.l8j;
import xsna.zs9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ov2 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ov2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((nv2) obj2).invoke(obj);
                break;
            case 1:
                ((zt4) obj2).invoke(obj);
                break;
            case 2:
                ((zt4) obj2).invoke(obj);
                break;
            case 3:
                ((zt4) obj2).invoke(obj);
                break;
            case 4:
                ((zs9.b) obj2).invoke(obj);
                break;
            case 5:
                ((zt4) obj2).invoke(obj);
                break;
            case 6:
                com.vk.im.channelcreation.impl.b bVar = (com.vk.im.channelcreation.impl.b) obj2;
                Channel channel = (Channel) obj;
                int a = iah0.a(72);
                Image Bb = channel.c.Bb(a, a);
                String str = Bb != null ? Bb.d : null;
                if (str == null) {
                    str = "";
                }
                bVar.q(new ku1(8, channel, str));
                break;
            case 7:
                com.vk.channels.impl.list.b bVar2 = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar2.s().b(th, new fc(5));
                bVar2.n(new g.b(th));
                break;
            case 8:
                ((zt4) obj2).invoke(obj);
                break;
            case 9:
                ((nv2) obj2).invoke(obj);
                break;
            case 10:
                ((zt4) obj2).invoke(obj);
                break;
            case 11:
                ((weg) obj2).invoke(obj);
                break;
            case 12:
                ((izs) obj2).invoke(obj);
                break;
            case 13:
                ((zt4) obj2).invoke(obj);
                break;
            case 14:
                ((l8j.c) obj2).invoke(obj);
                break;
            case 15:
                ((ugm) obj2).invoke(obj);
                break;
            case 16:
                ((jip.a) obj2).invoke(obj);
                break;
            case 17:
                ((jy5) obj2).invoke(obj);
                break;
            case 18:
                ((ugm) obj2).invoke(obj);
                break;
            case 19:
                ((nv2) obj2).invoke(obj);
                break;
            case 20:
                int i2 = FriendsImportFragment.a0;
                ((kps) obj2).invoke(obj);
                break;
            case 21:
                ((gxs) obj2).invoke(obj);
                break;
            case 22:
                int i3 = vnt.n1;
                ((ugm) obj2).invoke(obj);
                break;
            case 23:
                ((ugm) obj2).invoke(obj);
                break;
            case 24:
                HomeFragment2 homeFragment2 = (HomeFragment2) obj2;
                int i4 = HomeFragment2.x0;
                if (!(obj instanceof ns60)) {
                    if (obj instanceof eij0) {
                        homeFragment2.qo(((eij0) obj).a);
                        break;
                    }
                } else {
                    homeFragment2.go().setItems(new ArrayList(homeFragment2.io() ? fo50.y() : fo50.B()));
                    SkeletonTabLayout skeletonTabLayout = homeFragment2.T;
                    if (skeletonTabLayout != null) {
                        homeFragment2.eo(skeletonTabLayout, 0);
                        break;
                    }
                }
                break;
            case 25:
                ((ugm) obj2).invoke(obj);
                break;
            case 26:
                ((ch3) obj2).invoke(obj);
                break;
            case 27:
                ((nv2) obj2).invoke(obj);
                break;
            case 28:
                ((nv2) obj2).invoke(obj);
                break;
            default:
                MenuListView menuListView = (MenuListView) obj2;
                T t = ((it80) obj).a;
                if (t != 0) {
                    MenuResponse menuResponse = (MenuResponse) t;
                    if (!menuResponse.equals(menuListView.z)) {
                        menuListView.z = menuResponse;
                        menuListView.e(false);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    s3q0 s3q0Var2 = s3q0.a;
                    break;
                }
                break;
        }
    }
}

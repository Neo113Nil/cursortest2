package xsna;

import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.dto.common.data.VkAppsList;
import com.vk.folders.impl.configure.a;
import com.vk.folders.impl.configure.e;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vkontakte.android.ui.widget.MenuListView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ir0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ir0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.observable.p) obj2).invoke(obj);
                break;
            case 1:
                ((com.vk.movika.sdk.base.observable.p) obj2).invoke(obj);
                break;
            case 2:
                ((com.vk.movika.sdk.base.observable.p) obj2).invoke(obj);
                break;
            case 3:
                ChatFragment.d dVar = ChatFragment.w1;
                ((qb) obj2).invoke(obj);
                break;
            case 4:
                ((s8) obj2).invoke(obj);
                break;
            case 5:
                ((com.vk.movika.sdk.base.observable.p) obj2).invoke(obj);
                break;
            case 6:
                ((l5) obj2).invoke(obj);
                break;
            case 7:
                ((qb) obj2).invoke(obj);
                break;
            case 8:
                int i2 = CommunityAddressesFragment.E0;
                ((sy4) obj2).invoke(obj);
                break;
            case 9:
                ((com.vk.movika.sdk.base.observable.p) obj2).invoke(obj);
                break;
            case 10:
                ((igh) obj2).invoke(obj);
                break;
            case 11:
                ((igh) obj2).invoke(obj);
                break;
            case 12:
                ((he3) obj2).invoke(obj);
                break;
            case 13:
                ((igh) obj2).invoke(obj);
                break;
            case 14:
                int i3 = FiltersRecyclerView.j;
                ((qb) obj2).invoke(obj);
                break;
            case 15:
                com.vk.folders.impl.configure.d dVar2 = (com.vk.folders.impl.configure.d) obj2;
                a1s a1sVar = (a1s) obj;
                if (!(a1sVar instanceof b580)) {
                    dVar2.getClass();
                    break;
                } else {
                    com.vk.folders.impl.configure.a aVar = dVar2.h;
                    if ((aVar instanceof a.b) && ((a.b) aVar).a == ((b580) a1sVar).b) {
                        dVar2.m(e.b.a);
                        break;
                    }
                }
                break;
            case 16:
                ((igh) obj2).invoke(obj);
                break;
            case 17:
                ((igh) obj2).invoke(obj);
                break;
            case 18:
                ((xsq) obj2).invoke(obj);
                break;
            case 19:
                ((lfa) obj2).invoke(obj);
                break;
            case 20:
                ((lfa) obj2).invoke(obj);
                break;
            case 21:
                ((igh) obj2).invoke(obj);
                break;
            case 22:
                ((ow4) obj2).invoke(obj);
                break;
            case 23:
                ((kdn) obj2).invoke(obj);
                break;
            case 24:
                MenuListView menuListView = (MenuListView) obj2;
                menuListView.y = (VkAppsList) obj;
                menuListView.d.post(new g0(menuListView, 14));
                break;
            case 25:
                ((igh) obj2).invoke(obj);
                break;
            case 26:
                ((irt) obj2).invoke(obj);
                break;
            case 27:
                ((uv20) obj2).invoke(obj);
                break;
            case 28:
                ((d1s) obj2).invoke(obj);
                break;
            default:
                ((uv20) obj2).invoke(obj);
                break;
        }
    }
}

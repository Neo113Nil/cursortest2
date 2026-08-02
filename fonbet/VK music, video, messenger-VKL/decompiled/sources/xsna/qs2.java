package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.MenuListView;
import xsna.otb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qs2 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qs2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((x4) obj2).invoke(obj);
                break;
            case 1:
                bpn0 bpn0Var = AppsPickerFragment.V;
                ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
                break;
            case 2:
                ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
                break;
            case 3:
                ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
                break;
            case 4:
                int i2 = BaseDebugTogglesFragment.X;
                ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
                break;
            case 5:
                ((rsb) obj2).invoke(obj);
                break;
            case 6:
                ((otb.m) obj2).invoke(obj);
                break;
            case 7:
                ((x4) obj2).invoke(obj);
                break;
            case 8:
                ((xld) obj2).invoke(obj);
                break;
            case 9:
                ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
                break;
            case 10:
                int i3 = CommunitiesManageNotificationsFragment.Z;
                ((x4) obj2).invoke(obj);
                break;
            case 11:
                ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
                break;
            case 12:
                ((sd1) obj2).invoke(obj);
                break;
            case 13:
                ((l9n) obj2).invoke(obj);
                break;
            case 14:
                ((l2i) obj2).invoke(obj);
                break;
            case 15:
                ((hn0) obj2).invoke(obj);
                break;
            case 16:
                ((l2i) obj2).invoke(obj);
                break;
            case 17:
                ((hn0) obj2).invoke(obj);
                break;
            case 18:
                ((gzn) obj2).invoke(obj);
                break;
            case 19:
                ((l2i) obj2).invoke(obj);
                break;
            case 20:
                ((l2i) obj2).invoke(obj);
                break;
            case 21:
                ((hn0) obj2).invoke(obj);
                break;
            case 22:
                ((gzn) obj2).invoke(obj);
                break;
            case 23:
                Photo photo = (Photo) obj2;
                ysg0.b.a(new bf1(photo.d, photo.Eb(ImageSize.h).d.d));
                cvk.u(R.string.album_cover_changed, false);
                break;
            case 24:
                MenuListView menuListView = (MenuListView) obj2;
                menuListView.m = (String) obj;
                menuListView.d.post(new g0(menuListView, 14));
                break;
            case 25:
                ((com.vk.music.playlist.d) obj2).invoke(obj);
                break;
            case 26:
                ((px30) obj2).invoke(obj);
                break;
            case 27:
                ((px30) obj2).invoke(obj);
                break;
            case 28:
                ((n99) obj2).invoke(obj);
                break;
            default:
                ((hn0) obj2).invoke(obj);
                break;
        }
    }
}

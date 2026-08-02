package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.f;
import com.vkontakte.android.fragments.videos.AddedVideosFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class up0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ up0(int i, Object obj, Object obj2) {
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
                AddedVideosFragment addedVideosFragment = (AddedVideosFragment) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                int i2 = AddedVideosFragment.n1;
                ArrayList arrayList = new ArrayList();
                for (UsersUserFullDto usersUserFullDto : (List) obj) {
                    addedVideosFragment.l1.getClass();
                    arrayList.add(j2r0.a(usersUserFullDto));
                }
                FragmentActivity activity = addedVideosFragment.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new vp0(addedVideosFragment, arrayList, videoFile));
                    break;
                }
                break;
            default:
                ((com.vk.ecomm.orders.impl.orderlist.presentation.mvi.h) obj3).e(new d.f(((f.a) obj2).b));
                break;
        }
    }
}

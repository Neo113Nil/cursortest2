package xsna;

import android.location.Location;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.libvideo.ui.VideoHideView;
import com.vk.log.L;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.List;
import xsna.pmw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wql0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wql0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                StoriesContainer storiesContainer = (StoriesContainer) obj;
                if (storiesContainer.Qb() && !storiesContainer.g.isEmpty() && !(storiesContainer instanceof LiveFinishedStoriesContainer) && !fsk.A(storiesContainer)) {
                    r1 = true;
                }
                break;
            case 1:
                break;
            case 2:
                qg8 qg8Var = (qg8) obj;
                int i = StreamInfoFragment.S;
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                List list = (List) obj;
                break;
            case 7:
                Location location = (Location) obj;
                if (!epx.f(location, new Location("NO_LOCATION"))) {
                }
                break;
            case 8:
                VKApplication.a aVar = VKApplication.c;
                break;
            case 9:
                int i2 = VideoHideView.A;
                cvk.u(h03.a((Throwable) obj) ? R.string.video_common_network_error : R.string.err_internal, false);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                qgi0.u((tgi0) obj);
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                List list2 = (List) obj;
                break;
            case 16:
                L.i((Throwable) obj);
                break;
            default:
                L.e("VoipChatInfoLoader", "Attempt to load chat info for " + ((pmw0.a) obj));
                break;
        }
        return s3q0.a;
    }
}

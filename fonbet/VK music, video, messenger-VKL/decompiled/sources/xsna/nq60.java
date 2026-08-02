package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vkontakte.android.fragments.videos.UploadedVideosFragment;
import java.util.ArrayList;
import java.util.List;
import xsna.dv70;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nq60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nq60(int i, Object obj, Object obj2) {
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
                rq60 rq60Var = (rq60) obj3;
                Post post = (Post) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 104) {
                        UserProfile userProfile = new UserProfile();
                        Owner owner = post.o;
                        userProfile.c = owner.b;
                        userProfile.e = owner.c;
                        userProfile.h = owner.e;
                        rq60Var.c(new yo60.f.C4120f(fkq0.e(post.m), userProfile));
                        break;
                    } else {
                        j03.a.getClass();
                        j03.k(vKApiExecutionException);
                        break;
                    }
                }
                break;
            case 1:
                el50 el50Var = (el50) obj3;
                OfflinePodcastEpisodesMviState.SortType sortType = (OfflinePodcastEpisodesMviState.SortType) obj2;
                List list = (List) obj;
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    el50Var.D(el50Var, new r770(1, list, sortType));
                    break;
                } else {
                    el50Var.W().c(dv70.a.a);
                    break;
                }
                break;
            default:
                UploadedVideosFragment uploadedVideosFragment = (UploadedVideosFragment) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                int i2 = UploadedVideosFragment.n1;
                ArrayList arrayList = new ArrayList();
                for (UsersUserFullDto usersUserFullDto : (List) obj) {
                    uploadedVideosFragment.l1.getClass();
                    arrayList.add(j2r0.a(usersUserFullDto));
                }
                FragmentActivity activity = uploadedVideosFragment.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new edq0(uploadedVideosFragment, arrayList, videoFile));
                    break;
                }
                break;
        }
    }
}

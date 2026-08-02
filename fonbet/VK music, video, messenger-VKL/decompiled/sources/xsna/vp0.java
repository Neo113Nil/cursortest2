package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.fragments.videos.AddedVideosFragment;
import java.util.ArrayList;

/* compiled from: AddedVideosFragment.java */
/* loaded from: classes7.dex */
public final class vp0 implements Runnable {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ VideoFile c;
    public final /* synthetic */ AddedVideosFragment d;

    public vp0(AddedVideosFragment addedVideosFragment, ArrayList arrayList, VideoFile videoFile) {
        this.d = addedVideosFragment;
        this.b = arrayList;
        this.c = videoFile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        VideoFile videoFile = this.c;
        if (size > 0) {
            videoFile.N8(((UserProfile) arrayList.get(0)).e);
            videoFile.F9(((UserProfile) arrayList.get(0)).h);
        }
        int i = AddedVideosFragment.n1;
        this.d.Oo(videoFile);
    }
}

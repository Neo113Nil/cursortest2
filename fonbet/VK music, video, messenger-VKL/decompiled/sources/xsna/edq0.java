package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.fragments.videos.UploadedVideosFragment;
import java.util.ArrayList;

/* compiled from: UploadedVideosFragment.java */
/* loaded from: classes7.dex */
public final class edq0 implements Runnable {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ VideoFile c;
    public final /* synthetic */ UploadedVideosFragment d;

    public edq0(UploadedVideosFragment uploadedVideosFragment, ArrayList arrayList, VideoFile videoFile) {
        this.d = uploadedVideosFragment;
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
        int i = UploadedVideosFragment.n1;
        this.d.Oo(videoFile);
    }
}

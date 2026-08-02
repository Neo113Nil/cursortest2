package xsna;

import android.app.Activity;
import com.vk.media.MediaUtils;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: AttachUtils.kt */
/* loaded from: classes15.dex */
public final class r34 {
    public static boolean a(Activity activity, List list, long j, long j2) {
        MediaUtils.f c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) it.next();
            if ((mediaStoreEntry instanceof MediaStoreVideoEntry) && (c = MediaUtils.a.c(activity, ((MediaStoreVideoEntry) mediaStoreEntry).k, false)) != null) {
                int i = c.f;
                if (j2 > 0 && i > j2) {
                    long j3 = 60000;
                    long j4 = j2 / j3;
                    if (j4 <= 1 || j2 % j3 != 0) {
                        int i2 = (int) (j2 / 1000);
                        cvk.w(activity.getResources().getQuantityString(R.plurals.picker_trim_video_length_multi_seconds, i2, Integer.valueOf(i2)), false);
                    } else {
                        int i3 = (int) j4;
                        cvk.w(activity.getResources().getQuantityString(R.plurals.picker_trim_video_length_multi_minutes, i3, Integer.valueOf(i3)), false);
                    }
                    nf9.j(StoryPublishEvent.NEED_TO_CUT_VIDEO, null, null, null, null, 62);
                    return false;
                }
                if (j > 0 && i < j) {
                    cvk.w(activity.getResources().getString(R.string.picker_trim_video_min_length_multi_seconds, Float.valueOf(j / 1000)), false);
                    return false;
                }
            }
        }
        return true;
    }
}

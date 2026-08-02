package xsna;

import com.vk.core.util.measure.ScaleType;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: VideoFeedUtils.kt */
/* loaded from: classes4.dex */
public final class tks0 {
    public static ScaleType a(NewsEntry newsEntry, boolean z) {
        ArrayList arrayList;
        ArrayList<EntryAttachment> arrayList2;
        if (z && newsEntry != null) {
            Post R = di60.R(newsEntry);
            if (R == null || (arrayList2 = R.z) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(c5g.u(arrayList2, 10));
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EntryAttachment) it.next()).b);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                float v = fdi.v((Attachment) arrayList.get(0));
                int size = arrayList.size();
                for (int i = 1; i < size; i++) {
                    if (fdi.v((Attachment) arrayList.get(i)) == v) {
                    }
                }
            }
            return ScaleType.FIT_CENTER;
        }
        return ScaleType.CENTER_CROP;
    }
}

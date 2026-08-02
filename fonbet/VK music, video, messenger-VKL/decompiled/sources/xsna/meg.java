package xsna;

import android.content.res.Resources;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.PlayableItem;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.timeline.TimelineException;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommentsDateFormatter.kt */
/* loaded from: classes16.dex */
public final class meg {
    public final Object a;
    public Object b;
    public final Object c;

    public meg(lwo0 lwo0Var) {
        this.a = lwo0Var;
        this.c = new ArrayList();
    }

    public void a(PlayableItem playableItem) {
        if (playableItem instanceof VideoItem) {
            c((VideoItem) playableItem);
            return;
        }
        if (!(playableItem instanceof AudioItem)) {
            throw new NoWhenBranchMatchedException();
        }
        AudioItem audioItem = (AudioItem) playableItem;
        long j = audioItem.c;
        if (j >= 0 && audioItem.d > j) {
            ((ArrayList) this.c).add(new AudioFragmentItem((AudioItem) playableItem, 0L));
        } else {
            throw new TimelineException("Invalid item: " + playableItem);
        }
    }

    public lwo0 b() {
        lwo0 lwo0Var = (lwo0) this.a;
        ArrayList arrayList = (ArrayList) lwo0Var.b;
        VideoItem videoItem = (VideoItem) this.b;
        if (videoItem == null) {
            throw new TimelineException("Video must be added");
        }
        long W0 = (long) ((videoItem.W0() - videoItem.O0()) / videoItem.z());
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((VideoFragment) it.next()).d();
        }
        long j2 = j;
        arrayList.add(new VideoFragment(videoItem, j2, W0 + j));
        ArrayList arrayList2 = (ArrayList) lwo0Var.c;
        ArrayList arrayList3 = (ArrayList) this.c;
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            AudioFragmentItem audioFragmentItem = (AudioFragmentItem) it2.next();
            arrayList4.add(new AudioFragmentItem(audioFragmentItem.b, audioFragmentItem.c + j2));
        }
        arrayList2.addAll(arrayList4);
        return lwo0Var;
    }

    public void c(VideoItem videoItem) {
        if (videoItem.O0() >= 0 && videoItem.W0() > videoItem.O0()) {
            this.b = videoItem;
        } else {
            throw new TimelineException("Invalid item: " + videoItem);
        }
    }

    public meg(Resources resources) {
        this.a = resources;
        jg0 jg0Var = new jg0(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, jg0Var);
        this.c = msy.a(lazyThreadSafetyMode, new nm0(7));
    }
}

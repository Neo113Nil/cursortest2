package xsna;

import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.VideoRelatedErrorItem;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.q7n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7n implements xa80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j7n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.xa80
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                ((v6n) ((DiscoverSimilarFeedFragment) obj).W.getValue()).a(q7n.d.a.b);
                return;
            default:
                com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.a aVar = (com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.a) obj;
                VideoRelatedErrorItem videoRelatedErrorItem = aVar.d;
                VideoRelatedErrorItem.ChunkType chunkType = videoRelatedErrorItem != null ? videoRelatedErrorItem.b : null;
                int i2 = chunkType == null ? -1 : a.C1986a.$EnumSwitchMapping$0[chunkType.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        aVar.b.invoke();
                        return;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.c.invoke();
                        return;
                    }
                }
                return;
        }
    }
}

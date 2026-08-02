package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gcc0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gcc0(int i, PostingAttachLocationFragment postingAttachLocationFragment) {
        this.c = i;
        this.d = postingAttachLocationFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                PostingAttachLocationFragment postingAttachLocationFragment = (PostingAttachLocationFragment) obj2;
                VkPaginationList vkPaginationList = (VkPaginationList) obj;
                if (this.c == 0) {
                    return new VkPaginationList(j5g.u0(vkPaginationList.b, Collections.singletonList(postingAttachLocationFragment.H0)), vkPaginationList.c, vkPaginationList.d, vkPaginationList.e);
                }
                int i2 = PostingAttachLocationFragment.I0;
                return vkPaginationList;
            default:
                VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
                ArrayList b = com.vk.video.ui.discovery.minimizable.related_videos.d.b(videoListWithTotalCount.b);
                ((ogs0) obj2).invoke(new rbt0(this.c, 50, videoListWithTotalCount.c, 48, b));
                return s3q0.a;
        }
    }

    public /* synthetic */ gcc0(ogs0 ogs0Var, com.vk.video.ui.discovery.minimizable.related_videos.d dVar, int i) {
        this.d = ogs0Var;
        this.c = i;
    }
}

package xsna;

import com.vk.api.comments.CommentsOrder;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VideoPostViewPresenter.kt */
/* loaded from: classes4.dex */
public final class v5t0 extends com.vk.newsfeed.impl.presenters.b {
    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // com.vk.newsfeed.impl.presenters.b
    public final void V2(Videos videos) {
        VideoAttachment Nb = videos.Nb();
        VideoFile videoFile = Nb != null ? Nb.k : null;
        if (videoFile != null) {
            this.b.ua(videoFile.c0());
        }
        super.V2(videos);
    }

    @Override // com.vk.newsfeed.impl.presenters.b
    public final void p3(int i, boolean z) {
        if (i >= 0 && g0() > 1) {
            this.G.d(i);
            return;
        }
        this.B = g0();
        yfg yfgVar = this.F;
        s2(yfgVar.c, yfgVar.d, this.l);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.core.fragments.FragmentImpl, xsna.d9c0] */
    @Override // com.vk.newsfeed.impl.presenters.b
    public final void s2(String str, List<CommentsOrder.Item> list, NewsEntry newsEntry) {
        if (this.x || newsEntry == null) {
            return;
        }
        yfg yfgVar = this.F;
        yfgVar.d = list;
        yfgVar.c = str;
        s1c0 M0 = this.b.M0();
        ti40 ti40Var = new ti40(this.M, 2);
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(ti40Var);
        if (w < 0) {
            if (g0() > 1) {
                listDataSet.s(e0(newsEntry, str, list, M0, 248));
            }
        } else {
            if (g0() <= 1) {
                listDataSet.A(w);
                return;
            }
            u1c0 c = listDataSet.c(w);
            if (c != null) {
                yfgVar.a = g0();
                yfgVar.b = this.B;
                yfgVar.c = str;
                yfgVar.d = list;
                c.g = yfgVar;
            }
            listDataSet.d(w);
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.b
    public final void b(NewsEntry newsEntry, ArrayList<u1c0> arrayList, s1c0 s1c0Var) {
    }
}

package xsna;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.comments.api.model.MarketItemCommentsArgs;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.c9x0;
import xsna.iq80;

/* compiled from: NewsEntryCommentsOpenerDelegate.kt */
/* loaded from: classes4.dex */
public final class ga60 {
    public final Context a;
    public String b = null;
    public final neg c;
    public final NewsfeedRouter d;

    /* compiled from: NewsEntryCommentsOpenerDelegate.kt */
    public static final class a implements jcs0, w8i {
        public final Context b;
        public final NewsEntry c;
        public final String d;
        public final Object e = msy.a(LazyThreadSafetyMode.NONE, new cfl(this, 29));

        public a(Context context, NewsEntry newsEntry, String str) {
            this.b = context;
            this.c = newsEntry;
            this.d = str;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.jcs0
        public final void a(VideoFile videoFile) {
            NewsfeedRouter newsfeedRouter = (NewsfeedRouter) this.e.getValue();
            iq80.a aVar = iq80.a.a;
            NewsEntry newsEntry = this.c;
            NewsfeedRouter.s(newsfeedRouter, this.b, newsEntry, videoFile, aVar, this.d, newsEntry.Cb().b, new NewsfeedRouter.b(true, true), 32);
        }
    }

    public ga60(Context context, neg negVar, NewsfeedRouter newsfeedRouter) {
        this.a = context;
        this.c = negVar;
        this.d = newsfeedRouter;
    }

    public final void a(NewsEntry newsEntry, VideoFile videoFile) {
        if (g620.f().d(videoFile)) {
            fxc0.B().Y().k(this.a, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : new ReplyInfo(0, null), (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : new a(this.a, newsEntry, this.b), (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            return;
        }
        String str = newsEntry.Cb().b;
        NewsfeedRouter.s(this.d, this.a, newsEntry, videoFile, iq80.a.a, this.b, str, null, 288);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(NewsEntry newsEntry) {
        VideoAttachment videoAttachment;
        VideoFile videoFile;
        VideoAttachment Nb;
        VideoFile videoFile2;
        if (newsEntry instanceof Videos) {
            Videos videos = (Videos) newsEntry;
            ArrayList<EntryAttachment> arrayList = videos.o;
            if (arrayList != null && arrayList.size() == 1 && (Nb = videos.Nb()) != null && (videoFile2 = Nb.k) != null) {
                a(videos, videoFile2);
                return true;
            }
        } else {
            if (newsEntry instanceof FaveEntry) {
                FaveEntry faveEntry = (FaveEntry) newsEntry;
                gmq gmqVar = faveEntry.i.f;
                if (gmqVar instanceof VideoAttachment) {
                    a(faveEntry, ((VideoAttachment) gmqVar).k);
                    return true;
                }
                if (gmqVar instanceof Post) {
                    NewsEntry newsEntry2 = (NewsEntry) gmqVar;
                    if (newsEntry2 instanceof Post) {
                        Post post = (Post) newsEntry2;
                        if (post.hc()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(post.m);
                            sb.append('_');
                            sb.append(post.n);
                            String sb2 = sb.toString();
                            Integer num = post.u;
                            NewsfeedRouter.w(this.d, this.a, sb2, num != null ? num.toString() : null, c9x0.c.b, null, 32);
                            return true;
                        }
                    }
                }
            } else {
                if (newsEntry instanceof Post) {
                    Post post2 = (Post) newsEntry;
                    if (post2.lc()) {
                        Attachment Ib = post2.Ib();
                        MarketAttachment marketAttachment = Ib instanceof MarketAttachment ? (MarketAttachment) Ib : null;
                        Good good = marketAttachment != null ? marketAttachment.f : null;
                        if (post2.z.size() != 1 || good == null) {
                            com.vk.metrics.eventtracking.b.a.a(new UnsupportedOperationException("Can't open comment for post-market because it does not satisfy the contract: " + post2));
                            return false;
                        }
                        UserId userId = good.c;
                        long j = good.b;
                        String str = good.f0;
                        if (str == null) {
                            str = "";
                        }
                        this.c.a(new MarketItemCommentsArgs(userId, j, str, good.B, false), this.a);
                        return true;
                    }
                }
                if (newsEntry instanceof ShitAttachment) {
                    ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
                    if (shitAttachment.Gb() && (videoAttachment = shitAttachment.I) != null && (videoFile = videoAttachment.k) != null) {
                        a(shitAttachment, videoFile);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

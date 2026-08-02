package xsna;

import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.attaches.AttachWall;
import java.util.Iterator;

/* compiled from: ImAttachDonutHelper.kt */
/* loaded from: classes2.dex */
public final class pwv {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r0 != null ? r0.c : null) != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Attach attach, UserId userId) {
        if (!(attach instanceof AttachWall)) {
            if (!(attach instanceof AttachArticle)) {
                if (attach instanceof AttachPodcastEpisode) {
                    AttachPodcastEpisode attachPodcastEpisode = (AttachPodcastEpisode) attach;
                    if (!epx.f(attachPodcastEpisode.f, userId) || !attachPodcastEpisode.e()) {
                    }
                }
            }
            AttachArticle attachArticle = (AttachArticle) attach;
            if (epx.f(attachArticle.d, userId)) {
                if (!"paid".equals(attachArticle.f)) {
                    ArticleDonut articleDonut = attachArticle.r;
                    return (articleDonut != null ? articleDonut.c : null) != null;
                }
            }
        }
        AttachWall attachWall = (AttachWall) attach;
        if (epx.f(attachWall.d, userId)) {
            PostDonut postDonut = attachWall.s;
        }
        Iterator<T> it = attachWall.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (a((Attach) next, userId)) {
                r1 = next;
                break;
            }
        }
        return ((Attach) r1) != null;
    }
}

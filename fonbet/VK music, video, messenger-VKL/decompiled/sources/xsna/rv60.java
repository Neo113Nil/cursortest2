package xsna;

import android.os.Parcelable;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NewsfeedPostExt.kt */
/* loaded from: classes4.dex */
public final class rv60 {
    public static final boolean a(Post post) {
        return post.l.zb(128L) && !post.hc() && o25.a().b();
    }

    public static final boolean b(Post post) {
        return (post.l.zb(128L) ? post.dc() : false) && o25.a().b();
    }

    public static final int c(Post post, boolean z) {
        NewsfeedCoowners newsfeedCoowners = post.f0;
        Integer num = newsfeedCoowners != null ? newsfeedCoowners.e : null;
        return (newsfeedCoowners == null || !newsfeedCoowners.c || num == null || !z) ? post.n : num.intValue();
    }

    public static final UserId d(Post post, boolean z) {
        NewsfeedCoowners newsfeedCoowners = post.f0;
        UserId userId = newsfeedCoowners != null ? newsfeedCoowners.d : null;
        return (newsfeedCoowners == null || !newsfeedCoowners.c || userId == null || !z) ? post.m : userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UserId e(NewsEntry newsEntry) {
        SourcePhoto sourcePhoto;
        Owner d;
        HeaderTitle headerTitle;
        UserId userId;
        l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
        Owner s = l490Var != null ? l490Var.s() : null;
        wsx0 wsx0Var = newsEntry instanceof wsx0 ? (wsx0) newsEntry : null;
        EntryHeader header = wsx0Var != null ? wsx0Var.getHeader() : null;
        if (s != null && (userId = s.b) != null) {
            return userId;
        }
        UserId d2 = (header == null || (headerTitle = header.c) == null) ? null : headerTitle.d();
        if (d2 != null) {
            return d2;
        }
        if (header == null || (sourcePhoto = header.b) == null || (d = sourcePhoto.d()) == null) {
            return null;
        }
        return d.b;
    }

    public static final boolean f(NewsEntry newsEntry) {
        NewsfeedCoowners newsfeedCoowners;
        List<NewsfeedCoowners.CoownerStatus> list;
        List<CoOwnerItem> list2;
        if (newsEntry instanceof FaveEntry) {
            FaveEntry faveEntry = (FaveEntry) newsEntry;
            if (di60.k(faveEntry) != null) {
                VideoAttachment k = di60.k(faveEntry);
                Parcelable parcelable = k != null ? k.k : null;
                ClipVideoFile clipVideoFile = parcelable instanceof ClipVideoFile ? (ClipVideoFile) parcelable : null;
                if (clipVideoFile == null || (list2 = clipVideoFile.N1) == null) {
                    return false;
                }
                return !list2.isEmpty();
            }
        }
        Post R = di60.R(newsEntry);
        return (R == null || (newsfeedCoowners = R.f0) == null || (list = newsfeedCoowners.f) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    public static final boolean g(NewsEntry newsEntry) {
        NewsfeedCoowners newsfeedCoowners;
        List<NewsfeedCoowners.CoownerStatus> list;
        Post R = di60.R(newsEntry);
        if (R == null || (newsfeedCoowners = R.f0) == null || (list = newsfeedCoowners.f) == null) {
            return false;
        }
        ArrayList<NewsfeedCoowners.CoownerStatus> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!epx.f(((NewsfeedCoowners.CoownerStatus) obj).b.b, k9q0.o(newsEntry))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (NewsfeedCoowners.CoownerStatus coownerStatus : arrayList) {
            if (!epx.f(coownerStatus.c, "pending") && !epx.f(coownerStatus.c, "declined")) {
                return false;
            }
        }
        return true;
    }

    public static final boolean h(UserId userId, NewsEntry newsEntry) {
        Post R;
        NewsfeedCoowners newsfeedCoowners;
        UserId userId2;
        if (userId == null || (R = di60.R(newsEntry)) == null || (newsfeedCoowners = R.f0) == null || (userId2 = newsfeedCoowners.d) == null || !newsfeedCoowners.c) {
            return false;
        }
        if (userId2.equals(userId)) {
            return true;
        }
        if (!fkq0.b(userId2)) {
            return false;
        }
        t6g0 t6g0Var = t6g0.b;
        return t6g0.b().g0(userId2) || t6g0.b().m(userId2);
    }
}

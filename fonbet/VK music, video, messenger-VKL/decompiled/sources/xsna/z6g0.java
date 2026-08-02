package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* compiled from: RepostOriginalHeaderHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class z6g0 implements gn60<Post, wm60> {
    public static List b(Post post) {
        Owner owner = post.o;
        VerifyInfo verifyInfo = owner.f;
        boolean z = verifyInfo != null ? verifyInfo.b : false;
        boolean Db = verifyInfo != null ? verifyInfo.Db() : false;
        VerifyInfo verifyInfo2 = owner.f;
        return Collections.singletonList(new a7g0(post, owner.e, null, owner.c, di60.D(post), z, Db, verifyInfo2 != null ? verifyInfo2.c : false, Integer.valueOf(post.r)));
    }

    public final List a(Post post) {
        Owner owner = post.o;
        if (!post.sc()) {
            return b(post);
        }
        Attachment Ib = post.Ib();
        VideoAttachment videoAttachment = Ib instanceof VideoAttachment ? (VideoAttachment) Ib : null;
        VideoFile videoFile = videoAttachment != null ? videoAttachment.k : null;
        if (!(videoFile instanceof MusicVideoFile)) {
            return b(post);
        }
        MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
        VerifyInfo verifyInfo = owner.f;
        boolean z = verifyInfo != null ? verifyInfo.b : false;
        boolean Db = verifyInfo != null ? verifyInfo.Db() : false;
        VerifyInfo verifyInfo2 = owner.f;
        boolean z2 = verifyInfo2 != null ? verifyInfo2.c : false;
        List<Artist> list = musicVideoFile.B1;
        Artist artist = list != null ? (Artist) j5g.a0(list) : null;
        Image image = artist != null ? artist.f : null;
        List<Artist> list2 = musicVideoFile.B1;
        Artist artist2 = list2 != null ? (Artist) j5g.a0(list2) : null;
        return Collections.singletonList(new a7g0(post, null, image, artist2 != null ? artist2.c : null, di60.D(post), z, Db, z2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((Post) pair);
    }
}

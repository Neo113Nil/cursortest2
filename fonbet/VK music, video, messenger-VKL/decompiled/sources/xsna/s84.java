package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.imageloader.ImageScreenSize;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PostAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* compiled from: AttachmentsImpl.kt */
/* loaded from: classes5.dex */
public final class s84 implements a84, w8i {
    public final bpn0 b = new bpn0(new zy(this, 5));

    public static AttachmentInfo.b j(int i, Attachment attachment, UserId userId, long j, String str) {
        AttachmentInfo.b bVar = new AttachmentInfo.b(i);
        bVar.b = userId.b;
        bVar.c = j;
        bVar.e.putParcelable("attachments", attachment);
        if (!TextUtils.isEmpty(str)) {
            bVar.d = str;
        }
        return bVar;
    }

    @Override // xsna.a84
    public final AttachmentInfo a(PhotoAlbum photoAlbum) {
        String t = sua.t(photoAlbum);
        Image image = photoAlbum.y;
        if (image == null) {
            image = Image.d;
        }
        Photo photo = new Photo(image);
        photo.d = photoAlbum.b;
        photo.e = photoAlbum.c;
        photo.L = photoAlbum.s;
        photo.u = photoAlbum.g;
        Bundle bundle = new Bundle();
        bundle.putParcelable("attachments", new AlbumAttachment(photo, photoAlbum.z, photoAlbum.h, photoAlbum.x));
        bundle.putString("link", t);
        return new AttachmentInfo(1, 0L, 0L, null, bundle);
    }

    @Override // xsna.a84
    public final AttachmentInfo b(PromoPost promoPost) {
        Post post = promoPost.n;
        PostAttachment postAttachment = new PostAttachment(promoPost);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(promoPost);
        UserId userId = post.m;
        int i = post.n;
        AttachmentInfo.b j = j(32, postAttachment, userId, i, null);
        Owner owner = post.o;
        String str = owner.c;
        Bundle bundle = j.e;
        bundle.putString("authorName", str);
        bundle.putString("authorPhotoUrl", owner.e);
        bundle.putString("trackCode", post.L.b);
        bundle.putParcelable("post", post);
        bundle.putParcelableArrayList("stats", arrayList);
        Owner owner2 = post.Q;
        if (owner2 != null) {
            j.c("link", ((LinksGeneratorComponent) this.b.getValue()).N7().a(owner2, i));
        }
        return j.a();
    }

    @Override // xsna.a84
    public final AttachmentInfo c(Article article) {
        AttachmentInfo.b j = j(3, new ArticleAttachment(article), article.c, article.b, article.d);
        String f = article.f(iah0.a(100));
        Bundle bundle = j.e;
        bundle.putString("thumbUrl", f);
        bundle.putString("link", article.i);
        Owner owner = article.h;
        bundle.putString("authorName", owner != null ? owner.c : null);
        bundle.putString("authorPhotoUrl", owner != null ? owner.e : null);
        return j.a();
    }

    @Override // xsna.a84
    public final AttachmentInfo d(String str, Post post) {
        AttachmentInfo.b j;
        UserId userId = post.m;
        Owner owner = post.o;
        int i = post.n;
        if (post.hc()) {
            Integer num = post.u;
            int intValue = num != null ? num.intValue() : 0;
            j = j(33, new PostAttachment(userId, intValue, post.s, false, owner.b, EmptyList.b), userId, intValue, null);
            Bundle bundle = j.e;
            bundle.putInt("postId", i);
            bundle.putInt("parent_comment_id", 0);
        } else {
            j = j(31, new PostAttachment(post), post.m, i, str);
            Owner owner2 = post.Q;
            if (owner2 != null) {
                j.c("link", ((LinksGeneratorComponent) this.b.getValue()).N7().a(owner2, i));
                Bundle bundle2 = j.e;
                bundle2.putString("authorName", owner.c);
                bundle2.putString("authorPhotoUrl", owner.e);
                bundle2.putString("trackCode", post.L.b);
                j.b("post", post);
                return j.a();
            }
        }
        Bundle bundle22 = j.e;
        bundle22.putString("authorName", owner.c);
        bundle22.putString("authorPhotoUrl", owner.e);
        bundle22.putString("trackCode", post.L.b);
        j.b("post", post);
        return j.a();
    }

    @Override // xsna.a84
    public final AttachmentInfo e(Poll poll) {
        AttachmentInfo.b j = j(21, new PollAttachment(poll), poll.c, poll.b, null);
        j.e.putBoolean("is_board", poll.j);
        return j.a();
    }

    @Override // xsna.a84
    public final AttachmentInfo f(VideoFile videoFile, String str) {
        String str2;
        String a;
        String str3;
        VideoAttachment videoAttachment = new VideoAttachment(videoFile);
        ImageSize Cb = videoFile.getImage().Cb(ImageScreenSize.MID.h(), true, false);
        int i = g620.f().c(videoFile) ? 7 : 30;
        if (str == null) {
            if (o25.b(o25.a())) {
                Uri.Builder appendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("web.vk.me").appendPath("video");
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(videoFile.I0());
                sb2.append('_');
                sb2.append(videoFile.o0());
                sb.append(sb2.toString());
                String C1 = videoFile.C1();
                if (C1 == null || drm0.N(C1)) {
                    str3 = "";
                } else {
                    str3 = BundleUtil.UNDERLINE_TAG + videoFile + ".accessKey";
                }
                sb.append(str3);
                a = appendPath.appendPath(sb.toString()).appendQueryParameter("sferum", "true").build().toString();
            } else {
                a = fss0.a(videoFile);
            }
            str2 = a;
        } else {
            str2 = str;
        }
        AttachmentInfo.b j = j(i, videoAttachment, videoFile.I0(), videoFile.o0(), videoFile.C1());
        Bundle bundle = j.e;
        bundle.putString("thumbUrl", Cb != null ? Cb.d.d : null);
        bundle.putString("title", videoFile.getTitle());
        bundle.putInt("duration", videoFile.getDuration());
        bundle.putInt("views", videoFile.L8());
        bundle.putInt("date_seconds", videoFile.b0());
        bundle.putString("trackCode", videoFile.r());
        bundle.putString("link", str2);
        if (str != null) {
            bundle.putInt("type_link", 3);
        }
        return j.a();
    }

    @Override // xsna.a84
    public final AttachmentInfo g(Photo photo, String str) {
        String str2 = photo.Eb(ImageSize.i).d.d;
        String str3 = photo.Eb(ImageSize.g).d.d;
        AttachmentInfo.b j = j(18, new PhotoAttachment(photo), photo.e, photo.c, photo.v);
        Bundle bundle = j.e;
        bundle.putString("photo_url", str2);
        bundle.putString("thumbUrl", str3);
        if (!TextUtils.isEmpty(str)) {
            j.c("trackCode", str);
        }
        return j.a();
    }

    @Override // xsna.a84
    public final AttachmentInfo h(Good good, String str) {
        AttachmentInfo.b j = j(12, new MarketAttachment(good), good.c, good.b, null);
        Image image = good.n;
        Bundle bundle = j.e;
        bundle.putParcelable("thumb", image);
        bundle.putString("title", good.d);
        bundle.putString("cost", good.h.e);
        bundle.putString("link", str);
        return j.a();
    }

    @Override // xsna.a84
    public final AttachmentInfo i(String str, boolean z) {
        int i = z ? 4 : 5;
        Bundle bundle = new Bundle();
        bundle.putParcelable("attachments", new LinkAttachment(str));
        bundle.putString("link", str);
        bundle.putInt("type_link", i);
        return new AttachmentInfo(11, 0L, 0L, null, bundle);
    }
}

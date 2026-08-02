package xsna;

import com.vk.dto.articles.Article;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.sharing.api.dto.AttachmentInfo;

/* compiled from: Attachments.kt */
/* loaded from: classes5.dex */
public interface a84 {
    AttachmentInfo a(PhotoAlbum photoAlbum);

    AttachmentInfo b(PromoPost promoPost);

    AttachmentInfo c(Article article);

    AttachmentInfo d(String str, Post post);

    AttachmentInfo e(Poll poll);

    AttachmentInfo f(VideoFile videoFile, String str);

    AttachmentInfo g(Photo photo, String str);

    AttachmentInfo h(Good good, String str);

    AttachmentInfo i(String str, boolean z);
}

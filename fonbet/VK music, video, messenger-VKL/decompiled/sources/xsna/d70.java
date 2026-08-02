package xsna;

import com.vk.dto.articles.Article;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.sharing.api.dto.ActionsInfo;

/* compiled from: Actions.kt */
/* loaded from: classes5.dex */
public interface d70 {
    ActionsInfo a(PhotoAlbum photoAlbum);

    ActionsInfo b(PromoPost promoPost);

    ActionsInfo c(Article article);

    ActionsInfo d(String str);

    ActionsInfo e(Photo photo, boolean z);

    ActionsInfo f(Post post);

    ActionsInfo g(VideoFile videoFile, boolean z);

    ActionsInfo h();

    ActionsInfo i(Good good);

    ActionsInfo j();
}

package xsna;

import com.vk.common.links.LinksParserData;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.attachments.PodcastAttachment;

/* compiled from: PostViewContract.kt */
/* loaded from: classes3.dex */
public interface d9c0 extends bfg<c9c0>, ai5 {
    CharSequence Hf(CharSequence charSequence, PodcastAttachment podcastAttachment, LinksParserData linksParserData, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    s1c0 M0();

    void S8();

    void V4();

    default boolean Yc(NewsEntry newsEntry) {
        return false;
    }

    void a1();

    void c4();

    void finish();

    void invalidateOptionsMenu();

    void pa();

    void setTitle(int i);

    void ym(boolean z);

    default void Ae() {
    }

    default void R1() {
    }

    default void le() {
    }

    default void E3(long j) {
    }

    default void Il(boolean z) {
    }

    default void Mj(Post post) {
    }

    default void P6(VideoFile videoFile) {
    }

    default void S2(NewsEntry newsEntry) {
    }

    default void a7(VideoFile videoFile) {
    }

    default void hk(int i) {
    }

    default void rd(boolean z) {
    }

    default void Db(Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
    }
}

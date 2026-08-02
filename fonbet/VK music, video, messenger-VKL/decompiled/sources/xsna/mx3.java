package xsna;

import com.vk.dto.newsfeed.entries.Digest;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: AsyncBlockDigestPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class mx3 extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final /* bridge */ /* synthetic */ String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (!(newsEntry instanceof Digest)) {
            return null;
        }
        Digest digest = (Digest) newsEntry;
        String str2 = digest.o;
        ak60 ak60Var = new ak60("newsfeed.getBreakingNewsBlockContent");
        ak60Var.K("track_code", str2);
        ak60Var.K("fields", "photo_base,sex,verified,trending,video_files,emoji_status,image_status,can_write_private_message,can_message,has_unseen_stories,is_government_organization,is_verified,social_button_type");
        ak60Var.n = true;
        return rsg0.y0(ak60Var, null, null, 3).U(new lp0(new com.vk.movika.sdk.base.hooks.p(digest, 7), 1));
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}

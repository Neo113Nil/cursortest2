package xsna;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: GetNewsEntryInteractor.kt */
/* loaded from: classes4.dex */
public final class att {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new hy2(13));

    public final io.reactivex.rxjava3.core.x<NewsEntry> a(Bundle bundle) {
        Long e = bo8.e(bundle, "entry_key");
        if (e != null) {
            long longValue = e.longValue();
            Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
            return NewsfeedData.a.f(longValue).n(b(bundle));
        }
        NewsEntry newsEntry = (NewsEntry) bundle.getParcelable("entry");
        if (newsEntry == null) {
            newsEntry = null;
        } else if (newsEntry instanceof Post) {
            Serializer.c<Post> cVar2 = Post.CREATOR;
            newsEntry = Post.a.b((Post) newsEntry);
        } else if (newsEntry instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) newsEntry;
            Serializer.c<Post> cVar3 = Post.CREATOR;
            NewsEntry Eb = PromoPost.Eb(promoPost, Post.a.b(promoPost.n));
            Eb.c = newsEntry.c;
            Eb.g = newsEntry.g;
            Eb.h = newsEntry.h;
            newsEntry = Eb;
        }
        return newsEntry != null ? io.reactivex.rxjava3.core.x.k(newsEntry) : b(bundle);
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.core.x<NewsEntry> b(Bundle bundle) {
        io.reactivex.rxjava3.core.x<List<Post>> m;
        String str;
        String string = bundle.getString("entry_content_id");
        String string2 = bundle.getString("access_key");
        String a = (string2 == null || drm0.N(string2)) ? string : v1v.a('_', string, string2);
        if (a == null || drm0.N(a)) {
            return sn.b("contentId is null or blank");
        }
        if (bundle.getBoolean("load_as_videos", false)) {
            if (string == null) {
                return sn.b("contentId is null or blank");
            }
            int H = drm0.H(string);
            while (true) {
                if (-1 >= H) {
                    str = "";
                    break;
                }
                if (string.charAt(H) == '_') {
                    str = string.substring(0, H + 1);
                    break;
                }
                H--;
            }
            String w0 = erm0.w0(1, str);
            m = rsg0.w0(new gns0(new UserId(Long.parseLong(w0)), Integer.parseInt(erm0.v0(w0.length() + 1, string)), string2)).l(new ux0(new d4r(3), 29));
        } else if (bundle.getBoolean("load_as_photos", false)) {
            m = rsg0.w0(yfb.x(zga0.l((zga0) this.a.getValue(), Collections.singletonList(a), 6))).l(new ai3(new vfk(this, 11), 24));
        } else {
            iuc0 iuc0Var = iuc0.b;
            m = iuc0.g0().m(Collections.singletonList(a));
        }
        asu0.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.r(m.q(asu0.r()), new sf3(12));
    }
}

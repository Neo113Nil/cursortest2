package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.d0o;

/* compiled from: DonutImageTeaserTransformer.kt */
/* loaded from: classes4.dex */
public final class c0o implements gn60<Pair<? extends Post, ? extends r1o>, wm60> {
    public final a2o b;
    public final bpn0 c = new bpn0(new d1(13));

    public c0o(a2o a2oVar) {
        this.b = a2oVar;
    }

    public final List<ol60> a(int i, Pair<Post, r1o> pair, wm60 wm60Var) {
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        DonutPriceTemplate donutPriceTemplate;
        PhotoAttachment photoAttachment;
        ArticleAttachment articleAttachment;
        d0o.a c2693a;
        d0o.a aVar;
        Article article;
        Post d = pair.d();
        r1o g = pair.g();
        PostDonut postDonut = d.R;
        ArrayList<EntryAttachment> arrayList = d.z;
        if (postDonut == null || (paywall = postDonut.g) == null || (snippet = paywall.d) == null) {
            return EmptyList.b;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            donutPriceTemplate = null;
            if (!it.hasNext()) {
                photoAttachment = null;
                break;
            }
            Attachment attachment = ((EntryAttachment) it.next()).b;
            photoAttachment = attachment instanceof PhotoAttachment ? (PhotoAttachment) attachment : null;
            if (photoAttachment != null) {
                break;
            }
        }
        Iterator<T> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                articleAttachment = null;
                break;
            }
            Attachment attachment2 = ((EntryAttachment) it2.next()).b;
            articleAttachment = attachment2 instanceof ArticleAttachment ? (ArticleAttachment) attachment2 : null;
            if (articleAttachment != null) {
                break;
            }
        }
        Photo photo = (articleAttachment == null || (article = articleAttachment.f) == null) ? null : article.l;
        LinkButton linkButton = snippet.e;
        String str = linkButton != null ? linkButton.b : null;
        if (photoAttachment != null) {
            Photo photo2 = photoAttachment.l;
            Image image = photo2.y;
            String str2 = photo2.P;
            float E0 = photoAttachment.E0();
            Float valueOf = Float.valueOf(E0);
            if (E0 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                valueOf = null;
            }
            if (valueOf == null) {
                float E02 = photo2.y.E0();
                valueOf = Float.valueOf(E02);
                if (E02 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    valueOf = null;
                }
            }
            aVar = new d0o.a.b(image, str2, valueOf);
        } else {
            if (articleAttachment == null || photo == null) {
                PostDonut postDonut2 = d.R;
                String str3 = postDonut2 != null ? postDonut2.j : null;
                if (str3 == null) {
                    str3 = "";
                }
                c2693a = new d0o.a.C2693a(str3);
            } else {
                Image image2 = photo.y;
                float u = fdi.u(articleAttachment);
                Float valueOf2 = Float.valueOf(u);
                if (u <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    valueOf2 = null;
                }
                if (valueOf2 == null) {
                    float E03 = image2.E0();
                    valueOf2 = Float.valueOf(E03);
                    if (E03 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        valueOf2 = null;
                    }
                }
                c2693a = new d0o.a.b(image2, null, valueOf2);
            }
            aVar = c2693a;
        }
        String str4 = snippet.c;
        if (((Boolean) this.c.getValue()).booleanValue() && str != null) {
            donutPriceTemplate = this.b.parse(str);
        }
        return Collections.singletonList(new d0o(aVar, str4, str, donutPriceTemplate, g));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}

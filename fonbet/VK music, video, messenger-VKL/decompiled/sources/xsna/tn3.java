package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* compiled from: ArticleDonutAttachmentTransformer.kt */
/* loaded from: classes4.dex */
public final class tn3 implements gn60<Pair<? extends NewsEntry, ? extends ArticleAttachment>, wm60> {
    public final a2o b;
    public final bpn0 c = new bpn0(new tj2(1));

    public tn3(a2o a2oVar) {
        this.b = a2oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (xsna.fkq0.b(r2.b) == true) goto L23;
     */
    @Override // xsna.gn60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List x(Pair pair, bp5 bp5Var) {
        String str;
        boolean z;
        ArticleDonut.Placeholder placeholder;
        ArticleDonut.Placeholder placeholder2;
        LinkButton linkButton;
        NewsEntry newsEntry = (NewsEntry) pair.d();
        ArticleAttachment articleAttachment = (ArticleAttachment) pair.g();
        Float s = di60.s(newsEntry);
        DonutPriceTemplate donutPriceTemplate = null;
        if (s != null) {
            str = "H," + s.floatValue() + ":1";
        } else {
            str = null;
        }
        Article article = articleAttachment.f;
        ArticleDonut articleDonut = article.q;
        Owner owner = article.h;
        String str2 = (articleDonut == null || (placeholder2 = articleDonut.c) == null || (linkButton = placeholder2.d) == null) ? null : linkButton.b;
        String str3 = article.f;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        new egi();
        String i = egi.i(owner);
        if (owner != null) {
            z = true;
        }
        z = false;
        Photo photo = article.l;
        ArticleDonut articleDonut2 = article.q;
        String str5 = (articleDonut2 == null || (placeholder = articleDonut2.c) == null) ? null : placeholder.b;
        if (((Boolean) this.c.getValue()).booleanValue() && str2 != null) {
            donutPriceTemplate = this.b.parse(str2);
        }
        return Collections.singletonList(new w6d0(str4, i, z, photo, str, str5, str2, donutPriceTemplate, mnh0.G(bp5Var)));
    }
}

package xsna;

import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.Triple;
import xsna.y6d0;

/* compiled from: ArticlePlaceholderAttachmentTransformer.kt */
/* loaded from: classes4.dex */
public final class hp3 implements gn60<ArticleAttachment, wm60> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Type inference failed for: r6v1, types: [xsna.y6d0$a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [xsna.y6d0$b] */
    /* JADX WARN: Type inference failed for: r8v8, types: [xsna.y6d0$b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(ArticleAttachment articleAttachment, bp5 bp5Var) {
        Integer num;
        String str;
        Object obj;
        new egi();
        Article article = articleAttachment.f;
        String i = egi.i(article.h);
        String str2 = article.f;
        if (str2 == null || !myc0.f(str2)) {
            num = null;
            str = null;
        } else {
            str = str2;
            num = null;
        }
        Owner owner = article.h;
        boolean z = owner != null && fkq0.b(owner.b);
        if (!article.Q8()) {
            if (article.j()) {
                obj = new y6d0.a(R.drawable.vk_icon_delete_outline_56, Integer.valueOf(R.string.article_deleted));
            } else if (article.i()) {
                obj = new y6d0.a(R.drawable.vk_icon_do_not_disturb_outline_56, Integer.valueOf(R.string.article_banned));
            } else if (!article.e()) {
                obj = new y6d0.a(R.drawable.vk_icon_article_outline_56, num);
            }
            if (article.Q8()) {
                num = new y6d0.b(new Triple(num, Integer.valueOf(R.string.article_protected_group), i));
            }
            return Collections.singletonList(new y6d0(str, i, z, obj, num, !article.j() || article.i(), mnh0.G(bp5Var)));
        }
        obj = num;
        if (article.Q8()) {
        }
        return Collections.singletonList(new y6d0(str, i, z, obj, num, !article.j() || article.i(), mnh0.G(bp5Var)));
    }
}

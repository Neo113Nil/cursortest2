package xsna;

import android.content.Context;
import com.vk.dto.articles.Article;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: CommonArticleBridge.kt */
/* loaded from: classes7.dex */
public final class fhg implements gq3 {
    public static final fhg a = new fhg();

    @Override // xsna.gq3
    public final void a(Article article) {
        if (article.Q8()) {
            cvk.u(R.string.article_protected, false);
        } else if (article.i()) {
            cvk.u(R.string.article_banned, false);
        } else if (article.j()) {
            cvk.u(R.string.article_deleted, false);
        }
    }

    @Override // xsna.gq3
    public final void b(Context context, Article article) {
        bu00.s(context, article, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }
}

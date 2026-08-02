package xsna;

import com.vk.articles.api.preload.QueryParameters;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ArticleAuthorPageHelper.kt */
/* loaded from: classes15.dex */
public final class xm3 {

    /* compiled from: ArticleAuthorPageHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArticleAuthorPageSortType.values().length];
            try {
                iArr[ArticleAuthorPageSortType.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArticleAuthorPageSortType.VIEWS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(QueryParameters queryParameters, ArticleAuthorPageSortType articleAuthorPageSortType) {
        String str;
        int i = a.$EnumSwitchMapping$0[articleAuthorPageSortType.ordinal()];
        if (i == 1) {
            str = "author_page_date";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "author_page_views";
        }
        queryParameters.b.put("context", str);
    }
}

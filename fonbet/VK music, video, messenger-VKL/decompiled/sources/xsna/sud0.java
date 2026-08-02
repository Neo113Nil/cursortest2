package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.articles.Article;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.iq3;
import xsna.ngv0;
import xsna.tlo0;
import xsna.tud0;

/* compiled from: ProfileContentArticleAdapter.kt */
/* loaded from: classes5.dex */
public final class sud0 extends zoj0<Article, b> {
    public final tud0.a e;

    /* compiled from: ProfileContentArticleAdapter.kt */
    public static final class a extends m.e<Article> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(Article article, Article article2) {
            Article article3 = article;
            Article article4 = article2;
            return article3.equals(article4) && epx.f(article3.f, article4.f) && epx.f(article3.l, article4.l) && article3.t == article4.t;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(Article article, Article article2) {
            return article.equals(article2);
        }
    }

    /* compiled from: ProfileContentArticleAdapter.kt */
    public static final class b extends vif0<Article> {
        public final VkRichCell n;
        public final izs<Article, s3q0> o;

        public b(VkRichCell vkRichCell, tud0.a aVar) {
            super(vkRichCell);
            this.n = vkRichCell;
            this.o = aVar;
            bwt0.i0(vkRichCell, new r820(this, 17));
        }

        @Override // xsna.vif0
        public final void i6(Article article) {
            String h6;
            Article article2 = article;
            iq3.a aVar = new iq3.a();
            VkRichCell vkRichCell = this.n;
            vkRichCell.setLeftMainViewController(aVar);
            vkRichCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new iq3.b(article2.f(cn70.b(76))), new Size(cn70.b(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), cn70.b(76)))));
            String str = article2.f;
            if (str != null) {
                tlo0.h d = oq.d(tlo0.Companion, str);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                vgv0 vgv0Var = new vgv0(d, (ngv0.a) null, (ngv0) null, 2, 6);
                long j = article2.e;
                int b = an10.b(article2.t / 60.0f);
                StringBuilder sb = new StringBuilder(pvo0.i(true, (int) j, false, false));
                sb.append(" · ");
                if (b <= 0) {
                    h6 = h6(R.string.community_profile_article_reading_time_minutes, 1);
                } else if (b >= 60) {
                    int i = b % 60;
                    int i2 = b / 60;
                    if (i > 30) {
                        i2++;
                    }
                    h6 = a6(R.plurals.community_profile_article_reading_time_hours, i2, Integer.valueOf(i2));
                } else {
                    h6 = h6(R.string.community_profile_article_reading_time_minutes, Integer.valueOf(b));
                }
                sb.append(h6);
                vkRichCell.setMiddle(ahn.v(vgv0Var, null, new qgv0(new tlo0.h(sb), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
            }
        }
    }

    public sud0(tud0.a aVar) {
        super(new com.vk.lists.a(new a()));
        this.e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VkRichCell vkRichCell = new VkRichCell(viewGroup.getContext(), null, 6, 0);
        vkRichCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new b(vkRichCell, this.e);
    }
}

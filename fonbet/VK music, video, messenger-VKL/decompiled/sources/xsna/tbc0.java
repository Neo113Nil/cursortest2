package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;

/* compiled from: PostingArticleCompactHolder.kt */
/* loaded from: classes4.dex */
public final class tbc0 extends m56<ArticleAttachment> implements View.OnClickListener, blc0 {
    public final VKImageView D;
    public final TextView E;
    public final TextView F;
    public final View G;
    public final StringBuilder H;
    public x64 I;

    public tbc0(ViewGroup viewGroup) {
        super(R.layout.attach_compact_article, viewGroup);
        this.D = (VKImageView) this.itemView.findViewById(R.id.icon_article);
        this.E = (TextView) this.itemView.findViewById(R.id.title_article);
        this.F = (TextView) this.itemView.findViewById(R.id.article_from);
        this.G = hvt0.b(this.itemView, R.id.close, this);
        this.H = new StringBuilder();
        bwt0.h0(this, this.itemView);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.G, z);
    }

    @Override // xsna.m56
    public final void T6(ArticleAttachment articleAttachment) {
        String string;
        ArticleAttachment articleAttachment2 = articleAttachment;
        Article article = articleAttachment2.f;
        String h9 = articleAttachment2.h9();
        VKImageView vKImageView = this.D;
        if (h9 == null || h9.length() == 0) {
            bwt0.p0(vKImageView, false);
        } else {
            bwt0.p0(vKImageView, true);
            vKImageView.load(h9);
        }
        this.E.setText(article.f);
        Owner owner = article.h;
        if (owner == null) {
            string = "";
        } else {
            String str = owner.h;
            if (str == null || str.length() == 0) {
                string = this.itemView.getContext().getString(R.string.article_author, owner.c);
            } else {
                StringBuilder sb = this.H;
                sb.setLength(0);
                sb.append(owner.h);
                String str2 = owner.n;
                StringBuilder sb2 = (str2 == null || str2.length() == 0) ? null : sb;
                if (sb2 != null) {
                    sb2.append(' ');
                    String str3 = owner.n;
                    sb2.append(str3 != null ? Character.valueOf(erm0.x0(str3)) : null);
                    sb2.append(JwtParser.SEPARATOR_CHAR);
                }
                string = this.itemView.getContext().getString(R.string.article_author_from, sb);
            }
        }
        this.F.setText(string);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.I = x64Var;
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var;
        if (epx.f(view, this.G)) {
            x64 x64Var2 = this.I;
            if (x64Var2 != null) {
                x64Var2.c(this.C);
                return;
            }
            return;
        }
        if (!epx.f(view, this.itemView) || (x64Var = this.I) == null) {
            return;
        }
        x64Var.a(this.C);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}

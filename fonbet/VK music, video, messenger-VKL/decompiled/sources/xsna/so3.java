package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.articles.Article;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: ArticlePickerAdapter.kt */
/* loaded from: classes5.dex */
public final class so3 extends zoj0<Article, a> {
    public final com.vk.posting.presentation.articlepicker.d e;

    /* compiled from: ArticlePickerAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final to3 l;
        public final TextView m;
        public final TextView n;
        public final VKImageView o;
        public final TextView p;
        public Article q;

        public a(com.vk.posting.presentation.articlepicker.d dVar, View view) {
            super(view);
            this.l = dVar;
            bwt0.i0(view, new tl0(this, 5));
            this.m = (TextView) view.findViewById(R.id.title_article);
            this.n = (TextView) view.findViewById(R.id.subtitle_article);
            VKImageView vKImageView = (VKImageView) view.findViewById(R.id.image_article);
            vKImageView.setPlaceholderImage(R.drawable.rounded_list_selector);
            this.o = vKImageView;
            this.p = (TextView) view.findViewById(R.id.date_and_views);
        }
    }

    public so3(com.vk.posting.presentation.articlepicker.d dVar) {
        this.e = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String i2;
        a aVar = (a) e0Var;
        Article article = (Article) this.c.c(i);
        VKImageView vKImageView = aVar.o;
        aVar.q = article;
        TextView textView = aVar.m;
        String str = article.f;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = aVar.n;
        String str2 = article.g;
        textView2.setText(str2 != null ? str2 : "");
        TextView textView3 = aVar.p;
        StringBuilder sb = new StringBuilder();
        sb.append(pvo0.l((int) article.e));
        sb.append(" · ");
        int i3 = article.m;
        if (i3 == 0) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            i2 = context.getResources().getString(R.string.no_views).toLowerCase(Locale.ROOT);
        } else {
            i2 = uqm0.i(i3, R.plurals.article_view_count, R.string.article_view_count_formatted, true);
        }
        sb.append(i2);
        textView3.setText(sb.toString());
        String f = article.f(cn70.b(100));
        vKImageView.load(f);
        bwt0.p0(vKImageView, f != null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.e, tf3.b(viewGroup, R.layout.holder_artilce_picker, viewGroup, false));
    }
}

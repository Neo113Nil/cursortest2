package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.views.LoadMoreCommentsView;

/* compiled from: ShowMoreCommentsHolder.kt */
/* loaded from: classes4.dex */
public final class pij0 extends qi6<NewsEntry> implements View.OnClickListener {
    public final LoadMoreCommentsView C;
    public a D;

    /* compiled from: ShowMoreCommentsHolder.kt */
    public static final class a {
        public boolean a;
        public final gzs<s3q0> b;

        public a() {
            throw null;
        }

        public a(gzs gzsVar) {
            this.a = false;
            this.b = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(isLoading=");
            sb.append(this.a);
            sb.append(", onClickListener=");
            return uf3.d(sb, this.b, ')');
        }
    }

    public pij0(ViewGroup viewGroup) {
        super(R.layout.load_more_comments, viewGroup);
        LoadMoreCommentsView loadMoreCommentsView = (LoadMoreCommentsView) this.itemView.findViewById(R.id.load_more_comments);
        this.C = loadMoreCommentsView;
        loadMoreCommentsView.setOnClickListener(this);
        loadMoreCommentsView.setText(v6(R.string.comments_show_more));
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        a aVar = this.D;
        LoadMoreCommentsView loadMoreCommentsView = this.C;
        if (aVar == null || !aVar.a) {
            loadMoreCommentsView.a(false);
        } else {
            loadMoreCommentsView.a(true);
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.D = obj instanceof a ? (a) obj : null;
        super.a6(u1c0Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gzs<s3q0> gzsVar;
        if (jjc.b()) {
            return;
        }
        a aVar = this.D;
        if (aVar == null || !aVar.a) {
            if (aVar != null) {
                aVar.a = true;
            }
            this.C.a(true);
            a aVar2 = this.D;
            if (aVar2 == null || (gzsVar = aVar2.b) == null) {
                return;
            }
            gzsVar.invoke();
        }
    }
}

package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.views.LoadMoreCommentsView;

/* compiled from: ShowMoreHolder.kt */
/* loaded from: classes4.dex */
public final class rij0 extends aa implements View.OnClickListener {
    public final afg o;
    public final LoadMoreCommentsView p;
    public boolean q;

    public rij0(ViewGroup viewGroup, afg afgVar) {
        super(viewGroup, R.layout.load_more_comments, 0);
        this.o = afgVar;
        View view = this.itemView;
        this.p = (LoadMoreCommentsView) view;
        view.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(iag iagVar) {
        boolean z = this.q;
        LoadMoreCommentsView loadMoreCommentsView = this.p;
        if (z) {
            loadMoreCommentsView.a(true);
        } else {
            loadMoreCommentsView.setText(g6(R.string.comments_show_more));
            loadMoreCommentsView.a(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        this.q = true;
        this.p.a(true);
        this.o.p0();
    }

    @Override // xsna.aa
    public final void q6(cbg cbgVar) {
        this.q = Boolean.TRUE.equals(cbgVar.d);
        super.q6(cbgVar);
    }
}

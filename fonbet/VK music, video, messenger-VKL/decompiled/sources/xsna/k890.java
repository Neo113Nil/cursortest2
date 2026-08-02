package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: PaddingHolder.kt */
/* loaded from: classes4.dex */
public final class k890 extends qi6<NewsEntry> {
    public final View C;
    public int D;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k890(ViewGroup viewGroup) {
        super(r0);
        View view = new View(viewGroup.getContext());
        view.setId(R.id.content_stub);
        this.C = this.itemView.findViewById(R.id.content_stub);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        this.C.setMinimumHeight(this.D);
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.D = u1c0Var instanceof p890 ? ((p890) u1c0Var).q : 0;
        super.a6(u1c0Var);
    }
}

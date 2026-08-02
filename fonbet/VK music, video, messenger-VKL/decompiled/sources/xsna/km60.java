package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;

/* compiled from: NewsfeedItemClickListener.kt */
@ozl
/* loaded from: classes4.dex */
public final class km60 implements s980 {
    public final /* synthetic */ fa60 b = new fa60();
    public final ac20 c;

    public km60(ac20 ac20Var) {
        this.c = ac20Var;
    }

    @Override // xsna.s980
    @ozl
    public final boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return this.b.E8(attachment, newsEntry);
    }

    @Override // xsna.s980
    @ozl
    public final void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        this.b.Hh(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.s980
    @ozl
    public final void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        this.b.Mg(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.s980
    public final void U5(NewsEntry newsEntry, boolean z, int i) {
        if ((z && jjc.b()) || newsEntry == null) {
            return;
        }
        this.c.sa(new NewsfeedExternalAction.Navigation.b.a(i, newsEntry));
    }

    @Override // xsna.s980
    public final void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
        this.c.sa(new NewsfeedExternalAction.d.a(newsEntry, newsEntry2, i, i2));
    }

    @Override // xsna.s980
    public final void r8(NewsEntry newsEntry) {
        if (newsEntry != null) {
            this.c.sa(new NewsfeedExternalAction.Navigation.b.C1436b(newsEntry));
        }
    }

    @Override // xsna.hi60
    public final void sa(NewsfeedExternalAction newsfeedExternalAction) {
        this.c.sa(newsfeedExternalAction);
    }

    @Override // xsna.s980
    @ozl
    public final boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return this.b.u9(view, u1c0Var, newsEntry, attachment);
    }
}

package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.apps.BuildInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import xsna.ol60;

/* compiled from: BaseUiDtoHolder.kt */
/* loaded from: classes4.dex */
public abstract class rp6<T extends ol60, N extends NewsEntry> extends qi6<N> {
    public T C;
    public hi60 D;

    public rp6(View view, ViewGroup viewGroup) {
        super(view);
        this.D = t980.a;
    }

    @Override // xsna.qi6
    public final void E6(N n) {
        T t = this.C;
        if (t != null) {
            R6(t);
        } else {
            U6(n);
        }
    }

    @Override // xsna.qi6
    public final void F6(N n, Object obj) {
        T t = this.C;
        if (t == null) {
            W6(n, obj);
        } else {
            T6(t, obj);
        }
    }

    @Override // xsna.qi6
    public final void M6(hi60 hi60Var) {
        this.D = hi60Var;
    }

    public abstract void R6(T t);

    public void T6(T t, Object obj) {
        R6(t);
    }

    public void U6(N n) {
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        if (ol60Var != null) {
            V5(ol60Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T extends com.vk.feed.core.models.news.NewsEntry, com.vk.feed.core.models.news.NewsEntry] */
    @Override // xsna.qi6
    public final void V5(ol60 ol60Var) {
        if (ol60Var instanceof z1c0) {
            u1c0 u1c0Var = ((z1c0) ol60Var).h;
            this.p = u1c0Var.a;
            a6(u1c0Var);
            this.C = Y6(ol60Var);
            return;
        }
        T Y6 = Y6(ol60Var);
        this.C = Y6;
        if (Y6 != null) {
            R6(Y6);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T extends com.vk.feed.core.models.news.NewsEntry, com.vk.feed.core.models.news.NewsEntry] */
    @Override // xsna.qi6
    public final void W5(ol60 ol60Var, Object obj) {
        if (ol60Var instanceof z1c0) {
            u1c0 u1c0Var = ((z1c0) ol60Var).h;
            this.p = u1c0Var.a;
            b6(u1c0Var, obj);
            this.C = Y6(ol60Var);
            return;
        }
        T Y6 = Y6(ol60Var);
        this.C = Y6;
        if (Y6 != null) {
            T6(Y6, obj);
        }
    }

    public void W6(N n, Object obj) {
        ol60 ol60Var;
        u1c0 J0 = J0();
        if (J0 == null || (ol60Var = J0.h) == null) {
            return;
        }
        W5(ol60Var, obj);
    }

    public final void X6(NewsfeedExternalAction.Navigation navigation) {
        this.D.sa(navigation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T Y6(ol60 ol60Var) {
        T t;
        return (!(ol60Var instanceof z1c0) || (t = (T) ((z1c0) ol60Var).h.h) == null) ? ol60Var : t;
    }

    @Override // xsna.qi6
    public void a6(u1c0 u1c0Var) {
        this.C = null;
        super.a6(u1c0Var);
    }

    @Override // xsna.qi6
    public void b6(u1c0 u1c0Var, Object obj) {
        this.C = null;
        super.b6(u1c0Var, obj);
    }

    @Override // xsna.qi6
    public final void g6(u1c0 u1c0Var) {
        T t = this.C;
        ea60 ea60Var = t != null ? t.f : null;
        if (ea60Var == null) {
            super.g6(u1c0Var);
            return;
        }
        View view = this.itemView;
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            bwt0.Q(view, R.id.feed_ui_test_news_entry, ea60Var);
        }
    }

    @Override // xsna.qi6
    public final hi60 i6() {
        return this.D;
    }

    public rp6(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.D = t980.a;
    }
}

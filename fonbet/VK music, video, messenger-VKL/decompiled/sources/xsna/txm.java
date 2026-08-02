package xsna;

import androidx.recyclerview.widget.m;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;

/* compiled from: StoryStatisticsViewersAdapter.kt */
/* loaded from: classes6.dex */
public final class txm extends m.e<s3u0> {
    public final t3u0 a = new t3u0();
    public final xem0 b = new xem0();
    public final w3u0 c = new w3u0();

    @Override // androidx.recyclerview.widget.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean areContentsTheSame(s3u0 s3u0Var, s3u0 s3u0Var2) {
        if ((s3u0Var instanceof u3u0) && (s3u0Var2 instanceof u3u0)) {
            this.a.getClass();
            return false;
        }
        if ((s3u0Var instanceof zem0) && (s3u0Var2 instanceof zem0)) {
            this.b.getClass();
            return ((zem0) s3u0Var).equals((zem0) s3u0Var2);
        }
        if (!(s3u0Var instanceof StoryUserViewer) || !(s3u0Var2 instanceof StoryUserViewer)) {
            return false;
        }
        this.c.getClass();
        return w3u0.a((StoryUserViewer) s3u0Var, (StoryUserViewer) s3u0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean areItemsTheSame(s3u0 s3u0Var, s3u0 s3u0Var2) {
        if ((s3u0Var instanceof u3u0) && (s3u0Var2 instanceof u3u0)) {
            this.a.getClass();
            return t3u0.a((u3u0) s3u0Var, (u3u0) s3u0Var2);
        }
        if ((s3u0Var instanceof zem0) && (s3u0Var2 instanceof zem0)) {
            this.b.getClass();
            return true;
        }
        if (!(s3u0Var instanceof StoryUserViewer) || !(s3u0Var2 instanceof StoryUserViewer)) {
            return false;
        }
        this.c.getClass();
        return epx.f(((StoryUserViewer) s3u0Var).c, ((StoryUserViewer) s3u0Var2).c);
    }

    @Override // androidx.recyclerview.widget.m.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object getChangePayload(s3u0 s3u0Var, s3u0 s3u0Var2) {
        if ((s3u0Var instanceof u3u0) && (s3u0Var2 instanceof u3u0)) {
            return this.a.getChangePayload(s3u0Var, s3u0Var2);
        }
        if ((s3u0Var instanceof zem0) && (s3u0Var2 instanceof zem0)) {
            this.b.getClass();
            return xem0.a((zem0) s3u0Var, (zem0) s3u0Var2);
        }
        if (!(s3u0Var instanceof StoryUserViewer) || !(s3u0Var2 instanceof StoryUserViewer)) {
            return null;
        }
        this.c.getClass();
        return w3u0.b((StoryUserViewer) s3u0Var, (StoryUserViewer) s3u0Var2);
    }
}

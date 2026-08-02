package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: FloatingButtonHelper.kt */
/* loaded from: classes16.dex */
public final class bsr {
    public final lh3 a;
    public final ViewGroup b;
    public final com.vk.movika.tools.controls.seekbar.v c;
    public final jzc d;
    public final ClipFeedListFragment.h e;
    public final long f;
    public final long g;
    public final j60 h;
    public View i;
    public final fre j;

    public bsr() {
        throw null;
    }

    public bsr(lh3 lh3Var, ViewGroup viewGroup, com.vk.movika.tools.controls.seekbar.v vVar, jzc jzcVar, ClipFeedListFragment.h hVar, j60 j60Var) {
        this.a = lh3Var;
        this.b = viewGroup;
        this.c = vVar;
        this.d = jzcVar;
        this.e = hVar;
        this.f = 300L;
        this.g = 300L;
        this.h = j60Var;
        this.j = new fre(this, 23);
    }

    public final void a() {
        View view = this.i;
        if (view != null) {
            this.d.a();
            this.b.removeView(view);
            this.i = null;
        }
    }
}

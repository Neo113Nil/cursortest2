package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.transition.ClipsWrapperTransitionState;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.b6f;

/* compiled from: ClipsWrapperSwipeClosableLayoutDelegate.kt */
/* loaded from: classes17.dex */
public final class ztf implements b6f.a {
    public final ouf a;
    public final orf b;
    public final prf c;
    public final qrf d;

    public ztf(ouf oufVar, orf orfVar, prf prfVar, qrf qrfVar) {
        this.a = oufVar;
        this.b = orfVar;
        this.c = prfVar;
        this.d = qrfVar;
    }

    @Override // xsna.b6f.a
    public final List<View> a() {
        z8e e = e();
        if (e == null) {
            return EmptyList.b;
        }
        return j5g.u0(e.w2(), (Collection) this.c.invoke());
    }

    @Override // xsna.b6f.a
    public final List<View> b() {
        z8e e = e();
        return e == null ? EmptyList.b : e.N0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    @Override // xsna.b6f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z;
        q8e Bo;
        ClipsWrapperTransitionState clipsWrapperTransitionState = this.a.g;
        clipsWrapperTransitionState.getClass();
        if (clipsWrapperTransitionState != ClipsWrapperTransitionState.SHOW_RUNNING && clipsWrapperTransitionState != ClipsWrapperTransitionState.HIDE_RUNNING) {
            ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.b.invoke();
            if (clipFeedListFragment != null && (Bo = clipFeedListFragment.Bo()) != null) {
                RecyclerView.Adapter adapter = Bo.getAdapter();
                if ((adapter != null ? adapter.getItemCount() : 0) > 0 && !Bo.canScrollVertically(-1)) {
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    @Override // xsna.b6f.a
    public final void close() {
        this.d.invoke();
    }

    @Override // xsna.b6f.a
    public final List<View> d() {
        z8e e = e();
        return e == null ? EmptyList.b : e.q1();
    }

    public final z8e e() {
        ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.b.invoke();
        q8e Bo = clipFeedListFragment != null ? clipFeedListFragment.Bo() : null;
        Object findViewHolderForLayoutPosition = Bo != null ? Bo.findViewHolderForLayoutPosition(0) : null;
        if (findViewHolderForLayoutPosition instanceof z8e) {
            return (z8e) findViewHolderForLayoutPosition;
        }
        return null;
    }
}

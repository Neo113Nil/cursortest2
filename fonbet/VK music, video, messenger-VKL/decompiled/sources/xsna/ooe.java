package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: ClipsOwnerSwipeFragment.kt */
/* loaded from: classes17.dex */
public final class ooe implements RecyclerView.q {
    public final /* synthetic */ ClipsOwnerSwipeFragment b;
    public final /* synthetic */ RecyclerView c;

    public ooe(ClipsOwnerSwipeFragment clipsOwnerSwipeFragment, RecyclerView recyclerView) {
        this.b = clipsOwnerSwipeFragment;
        this.c = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = this.b;
        bqx0 bqx0Var = clipsOwnerSwipeFragment.g0;
        if (bqx0Var != null) {
            iut0.c(view, bqx0Var);
            if (((Boolean) clipsOwnerSwipeFragment.j0.getValue()).booleanValue()) {
                int childAdapterPosition = this.c.getChildAdapterPosition(view);
                Integer valueOf = Integer.valueOf(childAdapterPosition);
                if (childAdapterPosition == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    yoe yoeVar = clipsOwnerSwipeFragment.c0;
                    z1h0 F0 = yoeVar != null ? yoeVar.F0(intValue) : null;
                    FragmentImpl fragmentImpl = F0 instanceof FragmentImpl ? (FragmentImpl) F0 : null;
                    if (fragmentImpl != null && (fragmentImpl instanceof owd0)) {
                        h4x i = bqx0Var.a.i(519);
                        Rect rect = new Rect(i.a, i.b, i.c, i.d);
                        fragmentImpl.Wn(rect, rect);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
    }
}

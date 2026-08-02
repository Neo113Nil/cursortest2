package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.NoSuchElementException;

/* compiled from: TabsAdapter.kt */
/* loaded from: classes2.dex */
public final class dyn0 extends androidx.recyclerview.widget.x<sxb, b> {

    /* compiled from: TabsAdapter.kt */
    public static final class a extends m.e<sxb> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(sxb sxbVar, sxb sxbVar2) {
            return sxbVar.equals(sxbVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(sxb sxbVar, sxb sxbVar2) {
            return sxbVar.equals(sxbVar2);
        }
    }

    /* compiled from: TabsAdapter.kt */
    public static final class b extends RecyclerView.e0 {
    }

    public dyn0() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return getCurrentList().get(i).a.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        for (sxb sxbVar : getCurrentList()) {
            if (sxbVar.a.hashCode() == i) {
                View view = sxbVar.b;
                if (view == null) {
                    view = sxbVar.a.F0(viewGroup, null);
                    sxbVar.b = view;
                }
                ViewParent parent = view.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view);
                }
                return new b(view);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

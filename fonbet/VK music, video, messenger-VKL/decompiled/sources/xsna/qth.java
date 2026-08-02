package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import xsna.cbh;

/* compiled from: CommunityProfileScrollViewDelegate.kt */
/* loaded from: classes5.dex */
public abstract class qth {
    public final RecyclerView a;
    public final zth b;
    public final euh c;
    public final auh d;
    public final aq0 e;
    public CommunityProfileViewState.Data.c f;
    public final Handler g;
    public Integer h;

    public qth(RecyclerView recyclerView, zth zthVar, euh euhVar, auh auhVar, aq0 aq0Var) {
        this.a = recyclerView;
        this.b = zthVar;
        this.c = euhVar;
        this.d = auhVar;
        this.e = aq0Var;
        b(0);
        this.g = new Handler(Looper.getMainLooper());
    }

    public abstract boolean a();

    public final void b(int i) {
        CommunityProfileViewState.Data.c cVar;
        zth zthVar;
        CommunityStaticCover communityStaticCover;
        if (Boolean.TRUE.booleanValue() && (cVar = this.f) != null) {
            float floatValue = c(cVar, i).floatValue();
            boolean z = true;
            if (a() && (communityStaticCover = (zthVar = this.b).a) != null) {
                communityStaticCover.setTransformFraction(floatValue);
                RecyclerView.e0 findViewHolderForAdapterPosition = zthVar.b.findViewHolderForAdapterPosition(0);
                if (findViewHolderForAdapterPosition instanceof cbh.b) {
                    cbh.b bVar = (cbh.b) findViewHolderForAdapterPosition;
                    ViewGroup viewGroup = bVar.o;
                    if (!Float.isNaN(floatValue)) {
                        float f = 1 - floatValue;
                        viewGroup.setAlpha(f);
                        bVar.s.setAlpha(f);
                        bVar.t.setAlpha(f);
                        if (f < 0.5f) {
                            f = 0.5f;
                        }
                        if (!Float.isNaN(f)) {
                            viewGroup.setScaleX(f);
                            viewGroup.setScaleY(f);
                        }
                    }
                }
            }
            this.c.h(floatValue);
            if (!(cVar instanceof CommunityProfileViewState.Data.c.AbstractC1625c.a) && !(cVar instanceof CommunityProfileViewState.Data.c.AbstractC1625c.b) && !(cVar instanceof CommunityProfileViewState.Data.c.AbstractC1625c.d)) {
                z = false;
            }
            this.d.a(floatValue, z);
        }
    }

    public abstract Float c(CommunityProfileViewState.Data.c cVar, int i);
}

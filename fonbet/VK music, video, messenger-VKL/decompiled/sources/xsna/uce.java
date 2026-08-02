package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ClipsGridDraftListAdapter.kt */
/* loaded from: classes17.dex */
public final class uce extends gd {
    public final ClipsGridDraftsListFragment.b f;
    public final ClipsGridDraftsListFragment.c g;

    /* compiled from: ClipsGridDraftListAdapter.kt */
    public static final class a extends m.e<nmv> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(nmv nmvVar, nmv nmvVar2) {
            nmv nmvVar3 = nmvVar;
            nmv nmvVar4 = nmvVar2;
            if ((nmvVar3 instanceof tce) && (nmvVar4 instanceof tce)) {
                return nmvVar3.equals(nmvVar4);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(nmv nmvVar, nmv nmvVar2) {
            nmv nmvVar3 = nmvVar;
            nmv nmvVar4 = nmvVar2;
            if ((nmvVar3 instanceof tce) && (nmvVar4 instanceof tce)) {
                return epx.f(((tce) nmvVar3).a, ((tce) nmvVar4).a);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(nmv nmvVar, nmv nmvVar2) {
            return nmvVar2;
        }
    }

    public uce(ClipsGridDraftsListFragment.b bVar, ClipsGridDraftsListFragment.c cVar) {
        super(new a());
        this.f = bVar;
        this.g = cVar;
    }

    @Override // xsna.mmv
    public final boolean N(int i) {
        return i >= 0 && i < getItemCount();
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof vce) {
            Object c = this.c.c(i);
            tce tceVar = c instanceof tce ? (tce) c : null;
            if (tceVar == null) {
                return;
            }
            vce vceVar = (vce) e0Var;
            vceVar.n = tceVar;
            View view = vceVar.itemView;
            dee deeVar = view instanceof dee ? (dee) view : null;
            if (deeVar != null) {
                String str = tceVar.c;
                if (str == null) {
                    str = "";
                }
                deeVar.b(new Image((List<ImageSize>) Collections.singletonList(new ImageSize(str, 1, 1, null, (char) 0, false, 56, null))), null, false, null, pvo0.j(tceVar.d * 1000, false, false), tceVar.f != null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new vce(viewGroup, this.f, this.g);
    }

    @Override // xsna.mmv
    public final int v(int i) {
        return 1;
    }
}

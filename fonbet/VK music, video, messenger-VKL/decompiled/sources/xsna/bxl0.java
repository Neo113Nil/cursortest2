package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: StoryArchiveAdapter.kt */
/* loaded from: classes6.dex */
public final class bxl0 extends gf6<zif0> {
    public final exl0 e;
    public final com.vk.movika.tools.controls.seekbar.p f;
    public Set<? extends StoryEntry> g;

    public bxl0(ListDataSet listDataSet, exl0 exl0Var, com.vk.movika.tools.controls.seekbar.p pVar) {
        super((hg6) listDataSet, true);
        this.e = exl0Var;
        this.f = pVar;
        this.g = EmptySet.b;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        if (i == R.layout.item_story_archive) {
            return new kxl0(view, this.e, this.f);
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported viewType in StoryArchiveAdapter = "));
    }

    @Override // xsna.gf6, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: L0 */
    public final void onBindViewHolder(hf6<zif0> hf6Var, int i) {
        super.onBindViewHolder(hf6Var, i);
        O0(hf6Var, i);
    }

    public final void O0(hf6<zif0> hf6Var, int i) {
        if (hf6Var.getItemViewType() == R.layout.item_story_archive) {
            kxl0 kxl0Var = (kxl0) hf6Var;
            boolean contains = this.g.contains(((lxl0) this.c.c(i)).a);
            boolean z = !this.g.isEmpty();
            kxl0Var.u = z;
            MaterialCheckBox materialCheckBox = kxl0Var.t;
            materialCheckBox.setChecked(contains);
            bwt0.p0(materialCheckBox, z);
        }
    }

    public final int P0(int i) {
        int itemCount = getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            zif0 zif0Var = (zif0) this.c.c(i2);
            if ((zif0Var instanceof lxl0) && ((lxl0) zif0Var).a.c == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        hf6<zif0> hf6Var = (hf6) e0Var;
        if (list.isEmpty()) {
            super.onBindViewHolder(hf6Var, i);
        } else {
            O0(hf6Var, i);
        }
    }
}

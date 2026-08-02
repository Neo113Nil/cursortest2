package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.communities.GroupsSuggestionsFragment;
import com.vk.dto.group.GroupSuggestion;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;

/* compiled from: GroupsSuggestionsAdapter.kt */
/* loaded from: classes17.dex */
public final class jru extends zoj0<GroupSuggestion, vif0<?>> implements c.i {
    public final String e;
    public final ProfileFragmentProviderComponent f;
    public GroupsSuggestionsFragment.c g;

    public jru(ListDataSet<GroupSuggestion> listDataSet, String str, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        super(listDataSet);
        this.e = str;
        this.f = profileFragmentProviderComponent;
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return getItemCount() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        pru pruVar;
        vif0 vif0Var = (vif0) e0Var;
        GroupSuggestion groupSuggestion = (GroupSuggestion) this.c.c(i);
        if (groupSuggestion != null && (vif0Var instanceof qmu)) {
            ((qmu) vif0Var).V5(groupSuggestion);
            GroupsSuggestionsFragment.c cVar = this.g;
            if (cVar == null || (pruVar = GroupsSuggestionsFragment.this.V) == null) {
                return;
            }
            apu.a(fkq0.c(pruVar.e) ? "show_group_suggestion" : "view_recommended_group", groupSuggestion, pruVar.c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new qmu(viewGroup, this.e, this.f);
    }
}

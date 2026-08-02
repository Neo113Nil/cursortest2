package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: VkMixCategoryAdapter.kt */
/* loaded from: classes3.dex */
public final class e4v0 extends RecyclerView.Adapter<c1j0> {
    public final LinkedHashMap<String, MixCategory> c;
    public final boolean d;
    public final z77 e;
    public LinkedHashMap f;

    public e4v0(LinkedHashMap linkedHashMap, boolean z, z77 z77Var) {
        this.c = linkedHashMap;
        this.d = z;
        this.e = z77Var;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(on00.e(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Object key = entry.getKey();
            MixCategory mixCategory = (MixCategory) entry.getValue();
            List<MixOption> list = ((MixCategory) entry.getValue()).e;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(MixOption.a((MixOption) it.next(), 31));
            }
            linkedHashMap3.put(key, MixCategory.a(mixCategory, arrayList));
        }
        this.f = linkedHashMap3;
        x0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c1j0 c1j0Var, int i) {
        c1j0Var.V5((MixCategory) j5g.O0(this.f.values()).get(i), new a3j0("", false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final c1j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c1j0(tf3.b(viewGroup, R.layout.item_vk_mix_settings_category, viewGroup, false), new o0r(this, 2));
    }

    public final void x0() {
        LinkedHashMap linkedHashMap = this.f;
        boolean z = false;
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((MixCategory) ((Map.Entry) it.next()).getValue()).d().isEmpty()) {
                    z = true;
                    break;
                }
            }
        }
        this.e.invoke(Boolean.valueOf(!epx.f(this.c, this.f)), Boolean.valueOf(z));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c1j0 c1j0Var, int i, List list) {
        c1j0 c1j0Var2 = c1j0Var;
        MixCategory mixCategory = (MixCategory) j5g.O0(this.f.values()).get(i);
        Object a0 = j5g.a0(list);
        a3j0 a3j0Var = a0 instanceof a3j0 ? (a3j0) a0 : null;
        if (a3j0Var == null) {
            a3j0Var = new a3j0("", false, false);
        }
        c1j0Var2.V5(mixCategory, a3j0Var);
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class gib {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public bqb c;
    public boolean d;
    public boolean e;

    public final boolean a(MaterialCheckable materialCheckable) {
        int id = materialCheckable.getId();
        Integer valueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        MaterialCheckable materialCheckable2 = (MaterialCheckable) this.a.get(Integer.valueOf(d()));
        if (materialCheckable2 != null) {
            f(materialCheckable2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    public final void b() {
        boolean isEmpty = this.b.isEmpty();
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            f((MaterialCheckable) it.next(), false);
        }
        if (isEmpty) {
            return;
        }
        e();
    }

    public final ArrayList c(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MaterialCheckable) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int d() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void e() {
        dqb dqbVar;
        dqb dqbVar2;
        bqb bqbVar = this.c;
        if (bqbVar != null) {
            new HashSet(this.b);
            ChipGroup chipGroup = bqbVar.a;
            dqbVar = chipGroup.onCheckedStateChangeListener;
            if (dqbVar != null) {
                dqbVar2 = chipGroup.onCheckedStateChangeListener;
                chipGroup.checkableGroup.c(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((yfa) dqbVar2).a;
                if (chipGroup2.checkableGroup.d) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean f(MaterialCheckable materialCheckable, boolean z) {
        int id = materialCheckable.getId();
        Integer valueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (!hashSet.contains(valueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return remove;
    }
}

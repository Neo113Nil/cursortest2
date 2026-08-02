package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import xsna.cm10;

/* compiled from: CheckableGroup.java */
/* loaded from: classes13.dex */
public final class r1c<T extends cm10<T>> {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public ChipGroup.a c;
    public boolean d;
    public boolean e;

    public final boolean a(@NonNull cm10<T> cm10Var) {
        int id = cm10Var.getId();
        Integer valueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        cm10<T> cm10Var2 = (cm10) this.a.get(Integer.valueOf(c()));
        if (cm10Var2 != null) {
            e(cm10Var2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!cm10Var.isChecked()) {
            cm10Var.setChecked(true);
        }
        return add;
    }

    @NonNull
    public final ArrayList b(@NonNull ChipGroup chipGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < chipGroup.getChildCount(); i++) {
            View childAt = chipGroup.getChildAt(i);
            if ((childAt instanceof cm10) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        ChipGroup.a aVar = this.c;
        if (aVar != null) {
            new HashSet(this.b);
            ChipGroup chipGroup = ChipGroup.this;
            ChipGroup.e eVar = chipGroup.h;
            if (eVar != null) {
                chipGroup.i.b(chipGroup);
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.i.d) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(@NonNull cm10<T> cm10Var, boolean z) {
        int id = cm10Var.getId();
        Integer valueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (!hashSet.contains(valueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            cm10Var.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (cm10Var.isChecked()) {
            cm10Var.setChecked(false);
        }
        return remove;
    }
}

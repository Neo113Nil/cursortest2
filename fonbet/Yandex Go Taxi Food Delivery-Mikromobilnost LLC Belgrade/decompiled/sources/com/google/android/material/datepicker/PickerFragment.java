package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import defpackage.o070;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
abstract class PickerFragment<S> extends Fragment {
    protected final LinkedHashSet<o070> onSelectionChangedListeners = new LinkedHashSet<>();

    public boolean addOnSelectionChangedListener(o070 o070Var) {
        return this.onSelectionChangedListeners.add(o070Var);
    }

    public void clearOnSelectionChangedListeners() {
        this.onSelectionChangedListeners.clear();
    }

    public abstract DateSelector<S> getDateSelector();

    public boolean removeOnSelectionChangedListener(o070 o070Var) {
        return this.onSelectionChangedListeners.remove(o070Var);
    }
}

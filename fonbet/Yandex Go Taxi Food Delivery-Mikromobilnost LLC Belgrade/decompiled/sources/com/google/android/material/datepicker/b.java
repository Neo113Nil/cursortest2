package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class b implements c {
    @Override // com.google.android.material.datepicker.c
    public final boolean a(long j, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && !dateValidator.isValid(j)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.material.datepicker.c
    public final int getId() {
        return 2;
    }
}

package com.google.android.material.datepicker;

import defpackage.o070;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class k extends o070 {
    public final /* synthetic */ MaterialTextInputPicker a;

    public k(MaterialTextInputPicker materialTextInputPicker) {
        this.a = materialTextInputPicker;
    }

    @Override // defpackage.o070
    public final void a() {
        Iterator<o070> it = this.a.onSelectionChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // defpackage.o070
    public final void b(Object obj) {
        Iterator<o070> it = this.a.onSelectionChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().b(obj);
        }
    }
}

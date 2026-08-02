package com.yandex.go.payments.cards.pci_dss.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.yandex.go.payments.cards.ui.d;
import defpackage.dye;
import defpackage.gyc;
import defpackage.tls;

/* loaded from: classes13.dex */
public final class c {
    public final EditText a;
    public final gyc b;
    public final d c;
    public final CvnInputPciDssViewHolder$AfterTextChangedWatcherAdapter d;
    public int e;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.go.payments.cards.pci_dss.ui.CvnInputPciDssViewHolder$AfterTextChangedWatcherAdapter] */
    public c(EditText editText, gyc gycVar, d dVar) {
        this.a = editText;
        this.b = gycVar;
        this.c = dVar;
        final dye dyeVar = new dye(14, this);
        this.d = new TextWatcher(dyeVar) { // from class: com.yandex.go.payments.cards.pci_dss.ui.CvnInputPciDssViewHolder$AfterTextChangedWatcherAdapter
            private final tls afterTextChanged;

            {
                this.afterTextChanged = dyeVar;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                this.afterTextChanged.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
        this.e = 3;
    }
}

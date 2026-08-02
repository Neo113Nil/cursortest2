package xsna;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PeopleSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class pv90 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ nv90 b;

    public pv90(nv90 nv90Var) {
        this.b = nv90Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.setAgeTo(i > 0 ? i + 13 : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

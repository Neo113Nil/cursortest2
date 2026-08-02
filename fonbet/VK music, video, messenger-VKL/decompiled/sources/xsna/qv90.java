package xsna;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PeopleSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class qv90 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ nv90 b;
    public final /* synthetic */ wfv0 c;

    public qv90(nv90 nv90Var, wfv0 wfv0Var) {
        this.b = nv90Var;
        this.c = wfv0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.setRelationship(this.c.getItem(i));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

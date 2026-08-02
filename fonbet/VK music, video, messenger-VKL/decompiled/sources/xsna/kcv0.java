package xsna;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: VkPeopleSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class kcv0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ lcv0 b;
    public final /* synthetic */ wfv0 c;

    public kcv0(lcv0 lcv0Var, wfv0 wfv0Var) {
        this.b = lcv0Var;
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

package xsna;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: VkPeopleSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class jcv0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ lcv0 b;

    public jcv0(lcv0 lcv0Var) {
        this.b = lcv0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.setAgeTo(i > 0 ? i + 13 : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

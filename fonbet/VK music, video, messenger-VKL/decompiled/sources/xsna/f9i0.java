package xsna;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: SelectLanguageTranslateOldVc.kt */
/* loaded from: classes6.dex */
public final class f9i0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ izs<Integer, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public f9i0(izs<? super Integer, s3q0> izsVar) {
        this.b = izsVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.invoke(Integer.valueOf(i));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

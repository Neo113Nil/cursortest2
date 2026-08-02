package xsna;

import android.view.View;
import android.widget.AdapterView;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import xsna.k8p;

/* compiled from: EducationParameterView.kt */
/* loaded from: classes5.dex */
public final class m8p implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ k8p b;

    public m8p(k8p k8pVar) {
        this.b = k8pVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        k8p.b bVar;
        k8p k8pVar = this.b;
        if (k8pVar.k || (bVar = (k8p.b) rl3.S(i, k8pVar.i)) == null) {
            return;
        }
        k8pVar.a.invoke(new a.m(bVar.a));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

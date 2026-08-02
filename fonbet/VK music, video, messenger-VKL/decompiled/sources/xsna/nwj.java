package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.editor.filters.correction.entity.CorrectionType;

/* compiled from: CorrectionsAdapter.kt */
/* loaded from: classes18.dex */
public final class nwj extends zoj0<lwj, RecyclerView.e0> {
    public final com.vk.movika.sdk.base.logic.interactor.e e;
    public final ha f;

    public nwj(com.vk.movika.sdk.base.logic.interactor.e eVar, ha haVar) {
        this.e = eVar;
        this.f = haVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof mwj) {
            mwj mwjVar = (mwj) e0Var;
            lwj lwjVar = (lwj) this.c.c(i);
            kwj kwjVar = mwjVar.m;
            Context context = mwjVar.itemView.getContext();
            CorrectionType correctionType = lwjVar.a;
            kwjVar.setContentDescription(context.getString(correctionType.m()));
            kwjVar.setIcon(correctionType.j());
            kwjVar.setValue(lwjVar.b);
            kwjVar.setShowValue(lwjVar.c);
            kwjVar.setFromCenterMode(correctionType.l() == CorrectionType.IntensityMode.FromCenter);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new mwj(viewGroup, this.e);
    }
}

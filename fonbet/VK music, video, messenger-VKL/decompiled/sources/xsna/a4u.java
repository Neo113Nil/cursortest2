package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GoodCommentsAdapter.kt */
/* loaded from: classes18.dex */
public final class a4u extends zoj0<iag, vif0<iag>> {
    public final eeg e;
    public final zfg f;
    public gzs<s3q0> g = new nm0(17);

    public a4u(eeg eegVar, zfg zfgVar) {
        this.e = eegVar;
        this.f = zfgVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vif0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f.b(viewGroup, this.e, this.g);
    }
}

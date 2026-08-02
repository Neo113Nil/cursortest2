package xsna;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterExt.kt */
/* loaded from: classes17.dex */
public final class pj0 implements qgh0 {
    public final /* synthetic */ wx3 a;

    public pj0(wx3 wx3Var) {
        this.a = wx3Var;
    }

    @Override // xsna.qgh0
    @SuppressLint({"NotifyDataSetChanged"})
    public final void a(RecyclerView recyclerView) {
        this.a.notifyDataSetChanged();
    }
}

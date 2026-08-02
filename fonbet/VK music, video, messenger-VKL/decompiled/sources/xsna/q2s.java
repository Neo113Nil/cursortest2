package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q2s implements RecyclerView.l.a {
    public final /* synthetic */ r2s a;

    public /* synthetic */ q2s(r2s r2sVar) {
        this.a = r2sVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l.a
    public final void a() {
        r2s r2sVar = this.a;
        List<? extends hfz> list = r2sVar.l;
        if (list != null) {
            a0s a0sVar = r2sVar.g;
            if (a0sVar == null) {
                a0sVar = null;
            }
            a0sVar.setItems(list);
            a0s a0sVar2 = r2sVar.g;
            if (a0sVar2 == null) {
                a0sVar2 = null;
            }
            a0sVar2.notifyDataSetChanged();
            r2sVar.l = null;
        }
    }
}

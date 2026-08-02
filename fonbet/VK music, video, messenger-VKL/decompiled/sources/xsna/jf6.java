package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import xsna.yrn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jf6 implements yrn.a {
    public final /* synthetic */ gzs b;

    public /* synthetic */ jf6(gzs gzsVar) {
        this.b = gzsVar;
    }

    @Override // xsna.yrn.a
    public final boolean Z(RecyclerView.e0 e0Var) {
        int i;
        List list = (List) this.b.invoke();
        if (list == null) {
            return false;
        }
        int bindingAdapterPosition = e0Var.getBindingAdapterPosition();
        return (bindingAdapterPosition >= 0 && bindingAdapterPosition < list.size() && ((z8l) list.get(bindingAdapterPosition)).d()) || ((i = bindingAdapterPosition + 1) >= 0 && i < list.size() && ((z8l) list.get(i)).c());
    }
}

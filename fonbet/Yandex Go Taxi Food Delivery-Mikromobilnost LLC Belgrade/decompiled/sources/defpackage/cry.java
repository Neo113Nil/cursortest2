package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public class cry extends q6 {
    public cry(m70... m70VarArr) {
        super(new s70(m70VarArr));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    public cry() {
    }
}

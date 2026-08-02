package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class mvd extends RecyclerView.g {
    public final hzk a;
    public final LinkedHashSet b;

    public mvd(hzk hzkVar) {
        this.a = hzkVar;
        this.b = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        String str;
        String str2;
        hzk hzkVar = this.a;
        if (i != 0) {
            if (i == 1 && hzkVar != null && (str2 = (String) ((a6q0) hzkVar.b).invoke()) != null) {
                ((mas) hzkVar.a).g(str2);
            }
        } else if (hzkVar != null && (str = (String) ((a6q0) hzkVar.b).invoke()) != null) {
            ((mas) hzkVar.a).t(str);
        }
        Iterator it = a.J0(this.b).iterator();
        while (it.hasNext()) {
            ((RecyclerView.g) it.next()).onScrollStateChanged(recyclerView, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Iterator it = a.J0(this.b).iterator();
        while (it.hasNext()) {
            ((RecyclerView.g) it.next()).onScrolled(recyclerView, i, i2);
        }
    }

    public mvd() {
        this(null);
    }
}

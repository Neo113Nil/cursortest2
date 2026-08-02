package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: CompositeDetachListener.kt */
/* loaded from: classes18.dex */
public final class usi implements UsableRecyclerView.i {
    public final ArrayList<UsableRecyclerView.i> a = new ArrayList<>();

    @Override // me.grishka.appkit.views.UsableRecyclerView.i
    public final void detach() {
        Iterator<UsableRecyclerView.i> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().detach();
        }
    }
}

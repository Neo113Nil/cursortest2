package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: CompositeOnSizeChangeListener.kt */
/* loaded from: classes18.dex */
public final class eui implements UsableRecyclerView.t {
    public final ArrayList<UsableRecyclerView.t> a = new ArrayList<>();

    @Override // me.grishka.appkit.views.UsableRecyclerView.t
    public final void a(int i, int i2, int i3, int i4) {
        Iterator<UsableRecyclerView.t> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(i, i2, i3, i4);
        }
    }
}

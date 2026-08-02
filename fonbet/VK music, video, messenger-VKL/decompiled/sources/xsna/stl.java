package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DelegateListUpdateCallback.kt */
/* loaded from: classes18.dex */
public final class stl implements ggz {
    public final ArrayList b = new ArrayList();

    /* compiled from: DelegateListUpdateCallback.kt */
    public interface a extends ggz {
    }

    @Override // xsna.ggz
    public final void onChanged(int i, int i2, Object obj) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onChanged(i, i2, obj);
        }
    }

    @Override // xsna.ggz
    public final void onInserted(int i, int i2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onInserted(i, i2);
        }
    }

    @Override // xsna.ggz
    public final void onMoved(int i, int i2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onMoved(i, i2);
        }
    }

    @Override // xsna.ggz
    public final void onRemoved(int i, int i2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onRemoved(i, i2);
        }
    }
}

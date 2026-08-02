package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes12.dex */
public final class ng50 implements sc50 {
    public final Set a;

    public ng50(Set set) {
        this.a = set;
    }

    @Override // defpackage.sc50
    public final void a(NavigationLayer navigationLayer) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sc50) it.next()).a(navigationLayer);
        }
    }

    @Override // defpackage.sc50
    public final void attach() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sc50) it.next()).attach();
        }
    }

    @Override // defpackage.sc50
    public final void b(NavigationLayer navigationLayer) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sc50) it.next()).b(navigationLayer);
        }
    }

    @Override // defpackage.sc50
    public final void detach() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sc50) it.next()).detach();
        }
    }
}

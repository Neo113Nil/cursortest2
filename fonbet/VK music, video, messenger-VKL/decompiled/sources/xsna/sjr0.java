package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: InspectableValue.kt */
/* loaded from: classes11.dex */
public final class sjr0 implements uki0<rjr0> {
    public final ArrayList a = new ArrayList();

    public final void c(String str, Object obj) {
        this.a.add(new rjr0(str, obj));
    }

    @Override // xsna.uki0
    public final Iterator<rjr0> iterator() {
        return this.a.iterator();
    }
}

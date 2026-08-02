package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class the implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ the(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                Collection collection = (Collection) this.c;
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    g5g.y(((fld) it.next()).a(), arrayList);
                }
                return arrayList;
            default:
                ((gd0) this.c).invoke();
                return s3q0.a;
        }
    }
}

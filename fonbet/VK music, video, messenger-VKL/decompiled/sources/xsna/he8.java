package xsna;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.me8;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class he8 extends FunctionReferenceImpl implements izs<me8.a, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(me8.a aVar) {
        boolean z;
        me8.a aVar2 = aVar;
        if (!((ke8) this.receiver).b) {
            Collection<dfw0> collection = aVar2.b;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (epx.f(((dfw0) it.next()).b, aVar2.d)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}

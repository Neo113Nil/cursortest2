package xsna;

import androidx.datastore.core.DataStoreImpl;
import xsna.eyx;

/* compiled from: SimpleActor.kt */
/* loaded from: classes.dex */
public final class yoj0<T> {
    public final yvj a;
    public final DataStoreImpl.g b;
    public final nm8 c = w0b.a(Integer.MAX_VALUE, null, null, 6);
    public final s04 d = new s04();

    public yoj0(yvj yvjVar, DataStoreImpl.e eVar, wzs wzsVar, DataStoreImpl.g gVar) {
        this.a = yvjVar;
        this.b = gVar;
        eyx eyxVar = (eyx) yvjVar.getCoroutineContext().get(eyx.a.b);
        if (eyxVar != null) {
            eyxVar.E(new woj0(eVar, this, wzsVar));
        }
    }
}

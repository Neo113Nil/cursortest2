package xsna;

import com.vk.libvideo.donut.model.Donut;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import xsna.pyn;

/* compiled from: DonutViewStateMapper.kt */
/* loaded from: classes14.dex */
public final class o5o {
    public final List<qyn> a;

    /* JADX WARN: Multi-variable type inference failed */
    public o5o(List<? extends qyn> list) {
        this.a = list;
    }

    public final pyn a(boolean z, Donut donut, lyn lynVar, boolean z2) {
        Object obj;
        if ((donut == null && lynVar == null) || z || z2) {
            return pyn.a.a;
        }
        Iterator<T> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((qyn) obj).a(donut)) {
                break;
            }
        }
        qyn qynVar = (qyn) obj;
        if (qynVar == null) {
            return pyn.a.a;
        }
        Triple<Integer, Integer, ezn> b = qynVar.b(donut);
        return new pyn.b(b.d().intValue(), b.g(), b.h());
    }
}

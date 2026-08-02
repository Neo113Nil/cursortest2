package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class a550 extends yr31 {
    public static final z450 c = new z450(0);
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.yr31
    public final void V() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((qs31) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(Extension.FIX_SPACE);
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

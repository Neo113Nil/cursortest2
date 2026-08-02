package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class djc implements pq41 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.pq41
    public final void a(String str, String str2, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((pq41) it.next()).a(str, str2, z);
        }
    }
}

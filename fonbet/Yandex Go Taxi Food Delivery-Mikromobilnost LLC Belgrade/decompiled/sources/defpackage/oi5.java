package defpackage;

import android.os.RemoteException;
import java.util.Iterator;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.b;

/* loaded from: classes4.dex */
public final class oi5 {
    public final /* synthetic */ b a;

    public oi5(b bVar) {
        this.a = bVar;
    }

    public final void a() {
        if (this.a.o()) {
            synchronized (this.a.g) {
                Iterator it = this.a.g.iterator();
                while (it.hasNext()) {
                    try {
                        this.a.B((Region) it.next());
                    } catch (RemoteException unused) {
                    }
                }
                this.a.g.clear();
            }
            synchronized (this.a.h) {
                Iterator it2 = this.a.h.iterator();
                while (it2.hasNext()) {
                    try {
                        this.a.z((Region) it2.next());
                    } catch (RemoteException unused2) {
                    }
                }
                this.a.h.clear();
            }
        }
    }
}

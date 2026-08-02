package xsna;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DefaultExecutionTracker.java */
/* loaded from: classes12.dex */
public final class pel {
    public final HashSet a = new HashSet();

    public final void a(RemoteException remoteException) {
        HashSet hashSet;
        synchronized (this.a) {
            hashSet = new HashSet(this.a);
            this.a.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((lzi0) it.next()).l(remoteException);
        }
    }
}

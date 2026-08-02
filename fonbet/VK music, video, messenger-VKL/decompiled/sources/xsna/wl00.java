package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import xsna.wl00.b;

/* compiled from: MapObjectManager.java */
/* loaded from: classes13.dex */
public abstract class wl00<O, C extends b> {
    public final s9u b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* compiled from: MapObjectManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            io00 io00Var = (io00) wl00.this;
            s9u s9uVar = io00Var.b;
            if (s9uVar != null) {
                dnv dnvVar = s9uVar.a;
                try {
                    dnvVar.i1(new j501(io00Var));
                    try {
                        dnvVar.y1(new t601(io00Var));
                        s9uVar.j(io00Var);
                        try {
                            dnvVar.A(new i101(io00Var));
                            try {
                                dnvVar.p(new ca01(io00Var));
                            } catch (RemoteException e) {
                                throw new RuntimeRemoteException(e);
                            }
                        } catch (RemoteException e2) {
                            throw new RuntimeRemoteException(e2);
                        }
                    } catch (RemoteException e3) {
                        throw new RuntimeRemoteException(e3);
                    }
                } catch (RemoteException e4) {
                    throw new RuntimeRemoteException(e4);
                }
            }
        }
    }

    /* compiled from: MapObjectManager.java */
    public class b {
        public final HashSet a = new HashSet();
        public final /* synthetic */ wl00 b;

        public b(io00 io00Var) {
            this.b = io00Var;
        }

        public final void a() {
            HashSet hashSet = this.a;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                wl00 wl00Var = this.b;
                ((io00) wl00Var).getClass();
                eo00 eo00Var = (eo00) next;
                eo00Var.getClass();
                try {
                    eo00Var.a.zzn();
                    wl00Var.d.remove(next);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            hashSet.clear();
        }
    }

    public wl00(@NonNull s9u s9uVar) {
        this.b = s9uVar;
        new Handler(Looper.getMainLooper()).post(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(O o) {
        b bVar = (b) this.d.get(o);
        if (bVar == null) {
            return false;
        }
        wl00 wl00Var = bVar.b;
        if (!bVar.a.remove(o)) {
            return false;
        }
        wl00Var.d.remove(o);
        eo00 eo00Var = (eo00) o;
        eo00Var.getClass();
        try {
            eo00Var.a.zzn();
            return true;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

package defpackage;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Looper;
import android.util.SparseArray;
import androidx.room.util.a;
import com.yandex.messaging.core.db.AppDatabaseRoom;
import com.yandex.messaging.core.db.AppDatabaseRoom_Impl;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.ikw0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public final class ikw0 implements Closeable {
    public boolean A;
    public final hkw0 a;
    public final ddf b;
    public final ikw0 c;
    public boolean y;
    public boolean z;
    public final HashMap w = new HashMap();
    public final HashSet x = new HashSet();
    public final SparseArray B = new SparseArray();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.yandex.messaging.sqlite.SupportSQLiteDatabaseTransaction$1] */
    public ikw0(hkw0 hkw0Var, ddf ddfVar, ikw0 ikw0Var) {
        this.a = hkw0Var;
        this.b = ddfVar;
        this.c = ikw0Var;
        if (ikw0Var != null) {
            z83.i();
        }
        hkw0Var.Y(new SQLiteTransactionListener() { // from class: com.yandex.messaging.sqlite.SupportSQLiteDatabaseTransaction$1
            @Override // android.database.sqlite.SQLiteTransactionListener
            public void onBegin() {
            }

            @Override // android.database.sqlite.SQLiteTransactionListener
            public void onCommit() {
                ikw0.this.y = true;
            }

            @Override // android.database.sqlite.SQLiteTransactionListener
            public void onRollback() {
            }
        });
    }

    public final void a(vx60 vx60Var) {
        ikw0 ikw0Var = this.c;
        if (ikw0Var != null) {
            ikw0Var.a(vx60Var);
        } else {
            this.x.add(vx60Var);
        }
    }

    public final void c(w2c0 w2c0Var, Object obj) {
        ikw0 ikw0Var = this.c;
        if (ikw0Var != null) {
            ikw0Var.c(w2c0Var, obj);
            return;
        }
        HashMap hashMap = this.w;
        if (hashMap.containsKey(w2c0Var)) {
            obj = (ServerMessageRef) obj;
        }
        hashMap.put(w2c0Var, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        z83.i();
        if (this.A) {
            return;
        }
        this.A = true;
        this.a.t();
        if (this.c != null) {
            z83.i();
        }
        this.a.A();
        z83.i();
        boolean A = this.a.A();
        ddf ddfVar = this.b;
        boolean z2 = this.y;
        Object obj = ddfVar.b;
        z83.i();
        AppDatabaseRoom appDatabaseRoom = (AppDatabaseRoom) ddfVar.b;
        appDatabaseRoom.p = this.c;
        if (!appDatabaseRoom.u && z2 && !A) {
            ((AppDatabaseRoom) ddfVar.b).r.incrementAndGet();
            zq60 zq60Var = ((AppDatabaseRoom) ddfVar.b).o;
            zq60Var.getClass();
            zq60Var.b++;
            int size = zq60Var.a.size();
            int i = 0;
            boolean z3 = false;
            while (true) {
                int i2 = i;
                while (i2 < size && zq60Var.a.get(i2) == null) {
                    i2++;
                }
                if (i2 < size) {
                    z = true;
                } else {
                    if (!z3) {
                        zq60.a(zq60Var);
                        z3 = true;
                    }
                    z = false;
                }
                if (!z) {
                    break;
                }
                ArrayList arrayList = zq60Var.a;
                while (i < size && arrayList.get(i) == null) {
                    i++;
                }
                if (i >= size) {
                    if (!z3) {
                        zq60.a(zq60Var);
                    }
                    ny61.p();
                    return;
                }
                ((zs2) arrayList.get(i)).b(this.B);
                i++;
            }
        }
        if (this.y && !A) {
            for (Map.Entry entry : this.w.entrySet()) {
                w2c0 w2c0Var = (w2c0) entry.getKey();
                ServerMessageRef serverMessageRef = (ServerMessageRef) entry.getValue();
                z83.g(null, w2c0Var.f, Looper.myLooper());
                sq60 sq60Var = w2c0Var.h;
                sq60Var.rewind();
                while (sq60Var.hasNext()) {
                    ((v2c0) sq60Var.next()).a.a(serverMessageRef);
                }
            }
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                ((vx60) it.next()).a();
            }
        }
        if (this.c == null || this.z) {
            return;
        }
        z83.i();
    }

    public final void d(int i, Object obj) {
        ikw0 ikw0Var = this.c;
        if (ikw0Var != null) {
            ikw0Var.d(i, obj);
            return;
        }
        SparseArray sparseArray = this.B;
        if (sparseArray.get(i) != null) {
            z83.i();
        } else {
            sparseArray.put(i, obj);
        }
    }

    public final void s() {
        boolean z;
        long j;
        z83.i();
        z83.i();
        this.z = true;
        if (this.c == null) {
            ddf ddfVar = this.b;
            Object obj = ddfVar.b;
            z83.i();
            if (!((AppDatabaseRoom) ddfVar.b).u) {
                zq60 zq60Var = ((AppDatabaseRoom) ddfVar.b).o;
                zq60Var.getClass();
                zq60Var.b++;
                int size = zq60Var.a.size();
                int i = 0;
                boolean z2 = false;
                while (true) {
                    int i2 = i;
                    while (i2 < size && zq60Var.a.get(i2) == null) {
                        i2++;
                    }
                    if (i2 < size) {
                        z = true;
                    } else {
                        if (!z2) {
                            zq60.a(zq60Var);
                            z2 = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        wrw g = ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) ddfVar.b)).g();
                        dt2 dt2Var = (dt2) ((AppDatabaseRoom) ddfVar.b).n.getValue();
                        synchronized (dt2Var) {
                            j = dt2Var.a;
                        }
                        ((Number) a.b(g.a, false, true, new hcb(j, 29))).intValue();
                        z83.i();
                        break;
                    }
                    ArrayList arrayList = zq60Var.a;
                    while (i < size && arrayList.get(i) == null) {
                        i++;
                    }
                    if (i >= size) {
                        if (!z2) {
                            zq60.a(zq60Var);
                        }
                        ny61.p();
                        return;
                    } else {
                        ((zs2) arrayList.get(i)).c();
                        i++;
                    }
                }
            }
        }
        this.a.s();
    }
}

package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class h790 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h790(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                Cursor h = u370.h(((t790) this.d).a, (dmg0) this.c, false);
                try {
                    int b = dmk.b(h, "package_id");
                    int b2 = dmk.b(h, "package_name");
                    int b3 = dmk.b(h, "sha_hash");
                    int b4 = dmk.b(h, "package_invalidate_time");
                    ArrayList arrayList = new ArrayList(h.getCount());
                    while (h.moveToNext()) {
                        arrayList.add(new e790(h.isNull(b2) ? null : h.getString(b2), h.getLong(b), h.isNull(b3) ? null : h.getString(b3), h.isNull(b4) ? null : Long.valueOf(h.getLong(b4))));
                    }
                    return arrayList;
                } finally {
                    h.close();
                }
            default:
                kje0 kje0Var = (kje0) this.d;
                RoomDatabase roomDatabase = kje0Var.a;
                roomDatabase.c();
                try {
                    lje0 lje0Var = kje0Var.b;
                    ArrayList arrayList2 = (ArrayList) this.c;
                    zin0 a = lje0Var.a();
                    try {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            lje0Var.i(a, it.next());
                            a.executeInsert();
                        }
                        lje0Var.d(a);
                        roomDatabase.w();
                        return s3q0.a;
                    } catch (Throwable th) {
                        lje0Var.d(a);
                        throw th;
                    }
                } finally {
                    roomDatabase.q();
                }
        }
    }

    public void finalize() {
        switch (this.b) {
            case 0:
                ((dmg0) this.c).n();
                break;
            default:
                super.finalize();
                break;
        }
    }
}

package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class i790 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i790(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                RoomDatabase roomDatabase = ((t790) this.d).a;
                dmg0 dmg0Var = (dmg0) this.c;
                Cursor h = u370.h(roomDatabase, dmg0Var, false);
                try {
                    ArrayList arrayList = new ArrayList(h.getCount());
                    while (h.moveToNext()) {
                        arrayList.add(h.isNull(0) ? null : h.getString(0));
                    }
                    return arrayList;
                } finally {
                    h.close();
                    dmg0Var.n();
                }
            default:
                kje0 kje0Var = (kje0) this.d;
                RoomDatabase roomDatabase2 = kje0Var.a;
                roomDatabase2.c();
                try {
                    mje0 mje0Var = kje0Var.c;
                    List list = (List) this.c;
                    zin0 a = mje0Var.a();
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            mje0Var.i(a, it.next());
                            a.executeUpdateDelete();
                        }
                        mje0Var.d(a);
                        roomDatabase2.w();
                        return s3q0.a;
                    } catch (Throwable th) {
                        mje0Var.d(a);
                        throw th;
                    }
                } finally {
                    roomDatabase2.q();
                }
        }
    }
}

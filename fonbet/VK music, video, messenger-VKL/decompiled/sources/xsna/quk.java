package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vkontakte.android.audio.player.SavedTrack;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import xsna.kuk;

/* compiled from: DataProvider.java */
/* loaded from: classes7.dex */
public abstract class quk<T extends kuk<?>> {
    public final ConcurrentHashMap<Long, T> a = new ConcurrentHashMap<>();
    public boolean b;

    public abstract SavedTrack a();

    public abstract SQLiteDatabase b();

    public final ArrayList<T> c(Cursor cursor) {
        T a;
        ArrayList<T> arrayList = new ArrayList<>(cursor.getCount());
        if (cursor.moveToFirst()) {
            do {
                long j = cursor.getLong(0);
                ConcurrentHashMap<Long, T> concurrentHashMap = this.a;
                if (concurrentHashMap != null) {
                    a = concurrentHashMap != null ? concurrentHashMap.get(Long.valueOf(j)) : null;
                    if (a == null) {
                        synchronized (this) {
                            try {
                                ConcurrentHashMap<Long, T> concurrentHashMap2 = this.a;
                                T t = concurrentHashMap2 != null ? concurrentHashMap2.get(Long.valueOf(j)) : null;
                                if (t == null) {
                                    SavedTrack a2 = a();
                                    a2.b(cursor);
                                    d(a2);
                                    a = a2;
                                } else {
                                    a = t;
                                }
                            } finally {
                            }
                        }
                    }
                } else {
                    a = a();
                    a.b(cursor);
                }
                arrayList.add(a);
            } while (cursor.moveToNext());
        }
        return arrayList;
    }

    public final void d(T t) {
        ConcurrentHashMap<Long, T> concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(Long.valueOf(t.c), t);
        }
    }
}

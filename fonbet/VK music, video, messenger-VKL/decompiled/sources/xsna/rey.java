package xsna;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;

/* compiled from: KeyValueStorageManager.kt */
/* loaded from: classes2.dex */
public final class rey implements mey, mtx0 {
    public final e0w b;
    public final HashMap<String, Object> c = new HashMap<>();
    public final ReentrantLock d = new ReentrantLock(true);

    public rey(e0w e0wVar) {
        this.b = e0wVar;
    }

    @Override // xsna.mtx0
    public final void Q() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.c.clear();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(ArrayList arrayList) {
        this.b.h(new x2y(new tx(17, arrayList, this), 1));
    }

    public final byte[] b(String str) {
        return (byte[]) d(str, "value_blob", new oey(0));
    }

    public final Boolean c(String str) {
        return (Boolean) d(str, "value_simple", new f6w(3));
    }

    public final <T> T d(String str, String str2, izs<? super Cursor, ? extends T> izsVar) {
        Throwable th;
        HashMap<String, Object> hashMap = this.c;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (hashMap.containsKey(str)) {
                try {
                    T t = (T) hashMap.get(str);
                    reentrantLock.unlock();
                    return t;
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            return (T) this.b.h(new x2y(new okc(this, "SELECT " + str2 + " FROM key_value WHERE key = ?", str, izsVar, 1), 1));
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // xsna.mey
    public final void delete(String str) {
        this.b.h(new x2y(new kg(14, this, str), 1));
    }

    public final Integer e(String str) {
        return (Integer) d(str, "value_simple", new jr3(22));
    }

    public final ArrayList f(String str) {
        String string = getString(str);
        if (string == null) {
            return null;
        }
        return f370.J(new JSONArray(string));
    }

    public final long g(String str) {
        Long l = (Long) d(str, "value_simple", new jt(29));
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // xsna.mey
    public final boolean getBoolean(String str, boolean z) {
        Boolean bool = (Boolean) d(str, "value_simple", new zos(6));
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // xsna.mey
    public final int getInt(String str, int i) {
        Integer num = (Integer) d(str, "value_simple", new oqu(4));
        return num != null ? num.intValue() : i;
    }

    @Override // xsna.mey
    public final String getString(String str) {
        return (String) d(str, "value_simple", new pey(0));
    }

    public final Long h(String str) {
        return (Long) d(str, "value_simple", new qey(0));
    }

    public final void i(String str, List<Integer> list) {
        k(kvf.a(list).toString(), str);
    }

    public final void j(String str, long j) {
        k(Long.valueOf(j), str);
    }

    public final void k(Object obj, String str) {
        this.b.h(new x2y(new yb3(obj, this, str, 5), 1));
    }

    @Override // xsna.mey
    public final void putBoolean(String str, boolean z) {
        k(Boolean.valueOf(z), str);
    }

    @Override // xsna.mey
    public final void putInt(String str, int i) {
        k(Integer.valueOf(i), str);
    }

    @Override // xsna.mey
    public final void putString(String str, String str2) {
        k(str2, str);
    }
}

package xsna;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.vk.log.L;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import xsna.usi0;

/* compiled from: NonEncryptedStorage.kt */
/* loaded from: classes11.dex */
public final class x570 {
    public final f25 a;
    public final mxi0 b;
    public final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public final bpn0 d = new bpn0(new jhg(this, 4));

    public x570(f25 f25Var, mxi0 mxi0Var) {
        this.a = f25Var;
        this.b = mxi0Var;
    }

    public final List<usi0.a> a() {
        String str;
        String string;
        this.c.readLock().lock();
        try {
            str = null;
            string = ((SharedPreferences) this.d.getValue()).getString("authorized", null);
        } finally {
            try {
                return r0;
            } finally {
            }
        }
        if (string != null) {
            if (string.length() != 0) {
                str = string;
            }
            if (str != null) {
                List<usi0.a> list = usi0.a.C3827a.a(new JSONArray(str));
                return list;
            }
        }
        return EmptyList.b;
    }

    public final void b(List<? extends usi0.a> list) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.c;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            c("replace_all", list);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final void c(String str, List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((usi0.a) it.next()).d());
            }
            ((SharedPreferences) this.d.getValue()).edit().putString("authorized", jSONArray.toString()).commit();
        } catch (Throwable th) {
            L.j(th, "NE_".concat(str));
            this.b.a(pn00.k(new Pair("action", "NE_".concat(str)), new Pair("stacktrace", rte0.w(th))));
        }
    }
}

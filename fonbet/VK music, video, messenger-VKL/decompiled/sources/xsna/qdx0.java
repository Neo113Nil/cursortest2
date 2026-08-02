package xsna;

import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* compiled from: WebAjaxBodyHolder.kt */
/* loaded from: classes6.dex */
public final class qdx0 implements b6y {
    public final HashMap<String, Condition> a = new HashMap<>();
    public final HashMap<String, Pair<String, String>> b = new HashMap<>();
    public final ReentrantLock c = new ReentrantLock();
    public String d = "";

    @Override // xsna.b6y
    public final void a(String str, String str2, String str3) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.b.put(str, new Pair<>(str2, str3));
            Condition condition = this.a.get(str);
            if (condition != null) {
                condition.signal();
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.b6y
    public final void b(String str) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.a.put(str, reentrantLock.newCondition());
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.b6y
    public final void c(String str) {
        this.d = str;
    }

    @Override // xsna.b6y
    public final String getDeviceInfo() {
        return this.d;
    }
}

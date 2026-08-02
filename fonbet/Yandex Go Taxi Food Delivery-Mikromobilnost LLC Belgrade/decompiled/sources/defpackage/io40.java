package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes10.dex */
public final class io40 implements e9e, Consumer2 {
    public final Context a;
    public v751 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet w = new LinkedHashSet();

    public io40(Context context) {
        this.a = context;
    }

    public final void a(e9e e9eVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            v751 v751Var = this.c;
            if (v751Var != null) {
                e9eVar.accept(v751Var);
            }
            this.w.add(e9eVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            v751 c = vzo.c(this.a, windowLayoutInfo);
            this.c = c;
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                ((e9e) it.next()).accept(c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}

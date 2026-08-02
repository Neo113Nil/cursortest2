package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.e9e;
import defpackage.v751;
import defpackage.vzo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Le9e;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lzy11;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MulticastConsumer implements e9e {
    public final Context a;
    public v751 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet w = new LinkedHashSet();

    public MulticastConsumer(Context context) {
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
    public void accept(WindowLayoutInfo value) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            v751 c = vzo.c(this.a, value);
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

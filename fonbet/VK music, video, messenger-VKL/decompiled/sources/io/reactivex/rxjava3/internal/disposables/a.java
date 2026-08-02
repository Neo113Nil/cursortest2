package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.schedulers.ScheduledRunnable;
import io.reactivex.rxjava3.internal.util.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ListCompositeDisposable.java */
/* loaded from: classes8.dex */
public final class a implements c, d {
    public LinkedList b;
    public volatile boolean c;

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean a(c cVar) {
        if (!c(cVar)) {
            return false;
        }
        ((ScheduledRunnable) cVar).dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean b(c cVar) {
        if (!this.c) {
            synchronized (this) {
                try {
                    if (!this.c) {
                        LinkedList linkedList = this.b;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.b = linkedList;
                        }
                        linkedList.add(cVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        cVar.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean c(c cVar) {
        if (this.c) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    return false;
                }
                LinkedList linkedList = this.b;
                if (linkedList != null && linkedList.remove(cVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                LinkedList linkedList = this.b;
                ArrayList arrayList = null;
                this.b = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((c) it.next()).dispose();
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw f.f((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.c;
    }
}

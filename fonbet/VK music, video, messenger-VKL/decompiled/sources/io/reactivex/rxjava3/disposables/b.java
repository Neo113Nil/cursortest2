package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.h;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: CompositeDisposable.java */
/* loaded from: classes11.dex */
public final class b implements c, d {
    public h<c> b;
    public volatile boolean c;

    public b() {
    }

    public static void f(h hVar) {
        if (hVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : hVar.d) {
            if (obj instanceof c) {
                try {
                    ((c) obj).dispose();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw io.reactivex.rxjava3.internal.util.f.f((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean a(c cVar) {
        if (!c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean b(c cVar) {
        Objects.requireNonNull(cVar, "disposable is null");
        if (!this.c) {
            synchronized (this) {
                try {
                    if (!this.c) {
                        h<c> hVar = this.b;
                        if (hVar == null) {
                            hVar = new h<>(16, 0);
                            this.b = hVar;
                        }
                        hVar.a(cVar);
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
        c cVar2;
        Objects.requireNonNull(cVar, "disposable is null");
        if (this.c) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    return false;
                }
                h<c> hVar = this.b;
                if (hVar != null) {
                    c[] cVarArr = hVar.d;
                    int i = hVar.a;
                    int hashCode = cVar.hashCode() * (-1640531527);
                    int i2 = (hashCode ^ (hashCode >>> 16)) & i;
                    c cVar3 = cVarArr[i2];
                    if (cVar3 != null) {
                        if (cVar3.equals(cVar)) {
                            hVar.b(i2, i, cVarArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                cVar2 = cVarArr[i2];
                                if (cVar2 == null) {
                                }
                            } while (!cVar2.equals(cVar));
                            hVar.b(i2, i, cVarArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final void d(c... cVarArr) {
        int i = 0;
        if (!this.c) {
            synchronized (this) {
                try {
                    if (!this.c) {
                        h<c> hVar = this.b;
                        if (hVar == null) {
                            hVar = new h<>(cVarArr.length + 1, 0);
                            this.b = hVar;
                        }
                        int length = cVarArr.length;
                        while (i < length) {
                            c cVar = cVarArr[i];
                            Objects.requireNonNull(cVar, "A Disposable in the disposables array is null");
                            hVar.a(cVar);
                            i++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        int length2 = cVarArr.length;
        while (i < length2) {
            cVarArr[i].dispose();
            i++;
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
                h<c> hVar = this.b;
                this.b = null;
                f(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                h<c> hVar = this.b;
                this.b = null;
                f(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int g() {
        if (this.c) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    return 0;
                }
                h<c> hVar = this.b;
                return hVar != null ? hVar.b : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.c;
    }

    public b(c... cVarArr) {
        this.b = new h<>(cVarArr.length + 1, 0);
        for (c cVar : cVarArr) {
            Objects.requireNonNull(cVar, "A Disposable in the disposables array is null");
            this.b.a(cVar);
        }
    }
}

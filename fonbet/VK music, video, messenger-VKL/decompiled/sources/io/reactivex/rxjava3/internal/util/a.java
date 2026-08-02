package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.functions.m;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import xsna.axm0;

/* compiled from: AppendOnlyLinkedArrayList.java */
/* loaded from: classes8.dex */
public final class a<T> {
    public final Object[] a;
    public Object[] b;
    public int c;

    /* compiled from: AppendOnlyLinkedArrayList.java */
    /* renamed from: io.reactivex.rxjava3.internal.util.a$a, reason: collision with other inner class name */
    /* loaded from: classes11.dex */
    public interface InterfaceC2159a<T> extends m<T> {
    }

    public a() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    public final <U> boolean a(v<? super U> vVar) {
        Object[] objArr;
        Object[] objArr2 = this.a;
        while (true) {
            if (objArr2 == null) {
                return false;
            }
            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                if (NotificationLite.b(vVar, objArr)) {
                    return true;
                }
            }
            objArr2 = objArr2[4];
        }
    }

    public final <U> boolean b(axm0<? super U> axm0Var) {
        Object obj;
        Object[] objArr = this.a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == NotificationLite.COMPLETE) {
                    axm0Var.onComplete();
                    return true;
                }
                if (obj instanceof NotificationLite.b) {
                    axm0Var.onError(((NotificationLite.b) obj).e);
                    return true;
                }
                if (obj instanceof NotificationLite.c) {
                    axm0Var.onSubscribe(((NotificationLite.c) obj).upstream);
                } else {
                    axm0Var.onNext(obj);
                }
            }
            objArr = (Object[]) objArr[4];
        }
    }

    public final void c(T t) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = t;
        this.c = i + 1;
    }

    public final void d(InterfaceC2159a<? super T> interfaceC2159a) {
        Object obj;
        for (Object[] objArr = this.a; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (interfaceC2159a.test(obj)) {
                    return;
                }
            }
        }
    }

    public final void e(NotificationLite.b bVar) {
        this.a[0] = bVar;
    }
}

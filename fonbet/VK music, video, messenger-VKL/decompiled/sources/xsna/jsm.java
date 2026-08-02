package xsna;

import android.content.Context;

/* compiled from: DialogsListDependencies.kt */
/* loaded from: classes18.dex */
public interface jsm {

    /* compiled from: DialogsListDependencies.kt */
    public interface a {
        boolean a();

        io.reactivex.rxjava3.internal.operators.single.f0 b(Context context);

        boolean c();

        void d(Context context);

        io.reactivex.rxjava3.internal.operators.single.y e();
    }

    /* compiled from: DialogsListDependencies.kt */
    public interface b {
        io.reactivex.rxjava3.internal.operators.observable.j1 a();
    }

    /* compiled from: DialogsListDependencies.kt */
    public interface d {
        io.reactivex.rxjava3.internal.operators.completable.y a(String str, String str2);

        void b(String str);

        void c(String str);
    }

    c a();

    b b();

    d c();

    a d();

    /* compiled from: DialogsListDependencies.kt */
    public interface c {
        default void a(com.vk.im.engine.models.dialogs.c cVar) {
        }
    }
}

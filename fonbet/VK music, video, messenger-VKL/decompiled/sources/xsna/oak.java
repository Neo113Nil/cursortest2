package xsna;

import android.content.Context;

/* compiled from: CreateTransferContract.kt */
/* loaded from: classes3.dex */
public interface oak {
    void a(String str);

    void b(String str);

    void c(int i);

    void d();

    void e();

    void k();

    void l();

    void n();

    io.reactivex.rxjava3.disposables.b o();

    default void onDestroyView() {
        o().e();
    }

    void x(Context context);
}

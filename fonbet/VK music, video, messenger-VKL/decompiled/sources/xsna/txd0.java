package xsna;

import android.content.Intent;
import android.content.res.Configuration;

/* compiled from: ProfileInfoModel.kt */
/* loaded from: classes2.dex */
public interface txd0 {
    io.reactivex.rxjava3.subjects.f b();

    void d();

    void e();

    io.reactivex.rxjava3.core.v<zxd0> f();

    io.reactivex.rxjava3.subjects.d<xxd0> getState();

    void onConfigurationChanged(Configuration configuration);

    void t();

    default void onActivityResult(int i, int i2, Intent intent) {
    }
}

package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.VideoStatistic;
import java.util.ArrayList;

/* compiled from: PaginationDelegate.kt */
/* loaded from: classes4.dex */
public interface sd90 {
    void E(String str);

    io.reactivex.rxjava3.core.q<vqt> Q1(String str);

    io.reactivex.rxjava3.core.q<vqt> a(boolean z, boolean z2);

    int b();

    void c(UserId userId);

    io.reactivex.rxjava3.core.q<vqt> d();

    io.reactivex.rxjava3.core.q<vqt> e();

    void f(boolean z);

    void g();

    io.reactivex.rxjava3.internal.operators.observable.b0 h(int i);

    void i();

    void j(int i);

    void k(int i);

    io.reactivex.rxjava3.core.q<vqt> l();

    void m(VideoStatistic videoStatistic);

    io.reactivex.rxjava3.core.q n(io.reactivex.rxjava3.core.q qVar);

    void o(int i);

    default boolean p() {
        return false;
    }

    io.reactivex.rxjava3.core.q<vqt> p0();

    io.reactivex.rxjava3.core.q r(int i, ArrayList arrayList);

    void setTrackCode(String str);
}

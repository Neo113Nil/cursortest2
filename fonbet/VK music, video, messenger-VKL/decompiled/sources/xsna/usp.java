package xsna;

import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EpisodeDao.kt */
/* loaded from: classes.dex */
public interface usp {
    String a(String str, String str2);

    void b(rjb0 rjb0Var);

    void c(ArrayList arrayList);

    MusicOfflineCacheStorage d(String str);

    default int e(String str, String str2) {
        n(str, str2);
        return j(str, str2);
    }

    List<xsp> f(String str);

    List<xsp> g(String str, List<String> list);

    void h(String str, String str2, String str3);

    void i(ArrayList arrayList);

    int j(String str, String str2);

    void k(int i, String str);

    List<xsp> l(String str, String str2);

    xsp m(String str, String str2);

    int n(String str, String str2);

    void o(xsp xspVar);

    io.reactivex.rxjava3.internal.operators.observable.q p(String str, String str2);
}

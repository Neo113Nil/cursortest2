package xsna;

import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.List;

/* compiled from: ChapterDao.kt */
/* loaded from: classes.dex */
public interface ukb {
    io.reactivex.rxjava3.internal.operators.observable.q a(int i, String str);

    void b(String str, String str2, String str3);

    void c(yj4 yj4Var);

    Integer d(String str, String str2);

    List<flb> e(String str, List<String> list);

    void f(int i, String str);

    void g(int i, String str, String str2, String str3);

    MusicOfflineCacheStorage h(String str);

    int i(String str, String str2);

    String j(String str, String str2);

    flb k(String str, String str2);

    List l(int i, String str);

    void m(flb flbVar);

    default int n(String str, String str2) {
        i(str, str2);
        return o(str, str2);
    }

    int o(String str, String str2);
}

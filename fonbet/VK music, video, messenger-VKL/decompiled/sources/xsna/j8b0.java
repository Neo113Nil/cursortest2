package xsna;

import com.vk.dto.common.DownloadingState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlaylistDao.kt */
/* loaded from: classes.dex */
public interface j8b0 {
    default void a(String str) {
        n(DownloadingState.Downloaded.b.g5(), str);
    }

    void b();

    int c(String str);

    int d(String str, String str2);

    int e(String str);

    uab0 f(String str, String str2);

    int g(String str, String str2);

    List<uab0> h(String str, String str2);

    List<uab0> i(String str);

    List<uab0> j(String str);

    void k(ArrayList arrayList);

    List<uab0> l(String str);

    void m(String str, String str2);

    void n(int i, String str);

    void o(w8b0 w8b0Var);
}

package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: MusicTrackDao.kt */
/* loaded from: classes.dex */
public interface cb50 {
    void A(String str, String str2, String str3);

    default int B(String str, String str2, String str3) {
        k(str, str2, str3);
        return b(str, str2);
    }

    hc50 C(String str, String str2);

    void D(kb50 kb50Var);

    void E(String str, String str2);

    void F(String str, String str2);

    int G(String str);

    void H(ArrayList arrayList);

    List<hc50> a();

    int b(String str, String str2);

    void c(String str, String str2, String str3);

    MusicOfflineCacheStorage d(String str);

    MusicOfflineCacheStorage e();

    io.reactivex.rxjava3.internal.operators.single.b f(ArrayList arrayList, DownloadingState downloadingState);

    void g();

    String h(String str, String str2);

    void i(String str, String str2);

    void j(ArrayList arrayList);

    int k(String str, String str2, String str3);

    hc50 l(String str, String str2);

    default int m(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(str, (String) it.next(), str2);
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += b(str, (String) it2.next());
        }
        return i;
    }

    void n(ufb0 ufb0Var);

    void o(String str, String str2);

    void p();

    void q(int i, String str);

    List r(String str, List list);

    default void s(kb50 kb50Var, String str) {
        D(kb50Var);
        n(new ufb0(String.valueOf(kb50Var.v().b), kb50Var.o(), str));
    }

    List<hc50> t(String str, List<String> list);

    default void u(ArrayList arrayList, ArrayList arrayList2, String str) {
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        H(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str2 = (String) pair.d();
            String str3 = (String) pair.g();
            if (str == null) {
                i(str2, str3);
            } else {
                A(str2, str3, str);
            }
        }
    }

    List<hc50> v(String str);

    List<hc50> w(String str, List<String> list);

    void x(int i, int i2, String str);

    List<ic50> y(String str, String str2);

    int z(int i, String str);
}

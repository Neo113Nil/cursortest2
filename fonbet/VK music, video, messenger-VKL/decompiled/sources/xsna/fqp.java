package xsna;

import android.view.View;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.lists.c;

/* compiled from: EntriesListContract.kt */
/* loaded from: classes3.dex */
public interface fqp extends s980, sjg, o2u0 {
    void Aa(gzs<s3q0> gzsVar);

    void Ak();

    void G5(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i);

    void Gl(Html5Entry html5Entry);

    void H3(u1c0 u1c0Var, int i);

    void J0();

    void Ke();

    s1c0 M0();

    void Nc();

    void Ok(UxPollsEntry uxPollsEntry);

    void Q9(boolean z);

    void R1();

    void S7(int i, int i2);

    default boolean Si() {
        return false;
    }

    void Xm(gzs gzsVar);

    void Y1(int i, int i2);

    default boolean Y7() {
        return false;
    }

    @Override // xsna.sjg
    void a(io.reactivex.rxjava3.disposables.c cVar);

    void cn();

    com.vk.lists.c fn(c.h hVar);

    void g6();

    String getRef();

    void ka();

    int me();

    void mk(NewsEntry newsEntry);

    void o1();

    boolean s1();

    default int s9() {
        return 0;
    }

    void u1(com.vk.lists.c cVar);

    void va();

    default int zh(int i) {
        return s9() + i;
    }

    default <T> bd70<T> F8(bd70<T> bd70Var) {
        return bd70Var;
    }
}

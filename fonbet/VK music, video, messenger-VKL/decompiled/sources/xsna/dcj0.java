package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.Set;

/* compiled from: SharingRepository.kt */
/* loaded from: classes5.dex */
public interface dcj0 {
    io.reactivex.rxjava3.internal.jdk8.a a();

    io.reactivex.rxjava3.internal.operators.observable.j1 b(int i, String str);

    io.reactivex.rxjava3.internal.operators.single.y c(gkx0 gkx0Var, int i, Object obj, List list, Integer num);

    Set<UserId> d();

    void e(long j);

    boolean f(String str, long j, String str2, String str3, Attachment attachment, String str4, String str5, String str6);
}

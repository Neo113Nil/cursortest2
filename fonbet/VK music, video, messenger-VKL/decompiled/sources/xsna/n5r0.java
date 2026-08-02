package xsna;

import com.vk.uxpolls.api.models.BaseRequestParam;
import com.vk.uxpolls.api.models.UxPollsGetResponse;
import com.vk.uxpolls.api.models.UxPollsInteractEvent;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: UxPollsRepository.kt */
/* loaded from: classes6.dex */
public interface n5r0 {
    List<BaseRequestParam> a();

    String b();

    Serializable c(List list, ContinuationImpl continuationImpl);

    UxPollsGetResponse d(List list, e4e0 e4e0Var);

    Serializable e(List list, ContinuationImpl continuationImpl);

    Boolean f(blq0 blq0Var, int i, String str, List list);

    Boolean g(UxPollsInteractEvent uxPollsInteractEvent, Integer num, String str, e4e0 e4e0Var);

    Object h(ContinuationImpl continuationImpl);

    void i(List<BaseRequestParam> list);

    void j(String str);

    UxPollsGetResponse k(List list, e4e0 e4e0Var);

    void l();

    Object m(List list, List list2, lf6 lf6Var);
}

package xsna;

import com.vk.uxpolls.api.models.UxPollsAnswer;
import com.vk.uxpolls.api.models.UxPollsGetResponse;
import com.vk.uxpolls.api.models.UxPollsInteractEvent;
import java.util.List;

/* compiled from: UxPollsApi.kt */
/* loaded from: classes6.dex */
public interface p4r0 {
    UxPollsGetResponse a(List<Long> list, e4e0 e4e0Var);

    UxPollsGetResponse b(List<String> list, e4e0 e4e0Var);

    boolean c(UxPollsInteractEvent uxPollsInteractEvent, Integer num, String str, e4e0 e4e0Var);

    boolean d(blq0 blq0Var, int i, String str, List<UxPollsAnswer> list);
}

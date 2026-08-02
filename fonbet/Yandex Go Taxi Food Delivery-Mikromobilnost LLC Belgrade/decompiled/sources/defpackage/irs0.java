package defpackage;

import com.yandex.go.slot.dto.k2;
import com.yandex.go.slot.mapper.a;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes13.dex */
public interface irs0 {
    static gss0 a(irs0 irs0Var, k2 k2Var, UiStateDrawableWrapper uiStateDrawableWrapper, int i) {
        if ((i & 4) != 0) {
            uiStateDrawableWrapper = ((a) irs0Var).f();
        }
        a aVar = (a) irs0Var;
        ess0 ess0Var = ess0.a;
        if (k2Var == null) {
            aVar.getClass();
            return ess0Var;
        }
        String a = aVar.b.a(k2Var.a());
        if (a == null || a.length() == 0) {
            return ess0Var;
        }
        Pair g = aVar.g(k2Var);
        return new dss0(a, ((Number) g.getFirst()).intValue(), ((Number) g.getSecond()).intValue(), uiStateDrawableWrapper);
    }

    static /* synthetic */ Object b(irs0 irs0Var, List list, sqs0 sqs0Var, boolean z, ContinuationImpl continuationImpl, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return ((a) irs0Var).p(list, sqs0Var, z, false, continuationImpl);
    }
}

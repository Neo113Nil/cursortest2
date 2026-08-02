package defpackage;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.payment.common.result.ResultType;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class kc9 extends wqt {
    public static final kc9 e = new kc9();

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("success", ChangeOrderState$Success.Companion.serializer(), qoi0.a(ChangeOrderState$Success.class)), new f9("pending", ChangeOrderState$Pending.Companion.serializer(), qoi0.a(ChangeOrderState$Pending.class)), new f9(ResultType.RESULT_TYPE_FAILURE, ChangeOrderState$Failure.Companion.serializer(), qoi0.a(ChangeOrderState$Failure.class)), new f9("unavailable", ChangeOrderState$Unavailable.Companion.serializer(), qoi0.a(ChangeOrderState$Unavailable.class)));
    }
}

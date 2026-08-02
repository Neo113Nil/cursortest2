package com.yandex.go.platform.payments.domain;

import defpackage.ex11;
import defpackage.fx11;
import defpackage.gx11;
import defpackage.kol0;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Lambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgx11;", ACSPConstants.STATUS, "Lzy11;", "invoke", "(Lgx11;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class UnbindCardInteractor$unbindCard$2$paymentCompletion$1 extends Lambda implements tls {
    final /* synthetic */ Continuation<Result<zy11>> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnbindCardInteractor$unbindCard$2$paymentCompletion$1(kol0 kol0Var) {
        super(1);
        this.$continuation = kol0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object failure;
        gx11 gx11Var = (gx11) obj;
        gx11Var.toString();
        boolean z = gx11Var instanceof fx11;
        zy11 zy11Var = zy11.a;
        if (z) {
            failure = zy11Var;
        } else {
            if (!(gx11Var instanceof ex11)) {
                w511.b();
                return null;
            }
            failure = new Result.Failure(((ex11) gx11Var).a);
        }
        this.$continuation.resumeWith(new Result(failure));
        return zy11Var;
    }
}

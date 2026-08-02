package com.yandex.passport.sloth.url;

import com.yandex.passport.sloth.data.c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/passport/common/url/b;", "<anonymous>", "()Lcom/yandex/passport/common/url/b;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.url.SlothInitialUrlProvider$transform$6", f = "SlothInitialUrlProvider.kt", l = {HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothInitialUrlProvider$transform$6 extends SuspendLambda implements tls {
    final /* synthetic */ c0 $variant;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothInitialUrlProvider$transform$6(c cVar, c0 c0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$variant = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SlothInitialUrlProvider$transform$6(this.this$0, this.$variant, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SlothInitialUrlProvider$transform$6) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.yandex.passport.sloth.data.n nVar = (com.yandex.passport.sloth.data.n) this.$variant;
            this.label = 1;
            c = c.c(cVar, nVar, this);
            if (c == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((com.yandex.passport.common.url.b) obj).a;
        }
        return new com.yandex.passport.common.url.b((String) c);
    }
}

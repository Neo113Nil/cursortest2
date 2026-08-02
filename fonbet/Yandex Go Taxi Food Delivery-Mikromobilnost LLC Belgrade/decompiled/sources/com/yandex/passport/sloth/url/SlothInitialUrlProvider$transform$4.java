package com.yandex.passport.sloth.url;

import android.net.Uri;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.sloth.data.b0;
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
@mvg(c = "com.yandex.passport.sloth.url.SlothInitialUrlProvider$transform$4", f = "SlothInitialUrlProvider.kt", l = {HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothInitialUrlProvider$transform$4 extends SuspendLambda implements tls {
    final /* synthetic */ Uri $this_transform;
    final /* synthetic */ c0 $variant;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothInitialUrlProvider$transform$4(Uri uri, c0 c0Var, c cVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$this_transform = uri;
        this.$variant = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SlothInitialUrlProvider$transform$4(this.$this_transform, this.$variant, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SlothInitialUrlProvider$transform$4) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            Uri uri = this.$this_transform;
            Uid uid = ((b0) this.$variant).b;
            this.label = 1;
            a = c.a(cVar, uri, uid, this);
            if (a == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj;
            a = bVar != null ? bVar.a : null;
        }
        String str = (String) a;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}

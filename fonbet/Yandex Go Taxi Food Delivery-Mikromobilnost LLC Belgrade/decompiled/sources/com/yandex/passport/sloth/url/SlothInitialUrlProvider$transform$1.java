package com.yandex.passport.sloth.url;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.sloth.url.SlothInitialUrlProvider", f = "SlothInitialUrlProvider.kt", l = {HProv.ALG_SID_KECCAK_224, HProv.PP_SIGNATUREOID, HProv.PP_BIO_STATISTICA_LEN, HProv.PP_DHOID, 103, 106, HProv.PP_CACHE_SIZE, 113, 120, HProv.PP_PASSWD_TERM, Constants.VPN_TRAFFIC, HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_FAST_CODE, PollMessageDraft.MAX_ANSWER_LENGTH, 147, 148, 150, 151}, m = "transform-tGOB_vo")
/* loaded from: classes2.dex */
final class SlothInitialUrlProvider$transform$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothInitialUrlProvider$transform$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object y = this.this$0.y(null, null, this);
        if (y == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return y;
        }
        String str = (String) y;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}

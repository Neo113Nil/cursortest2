package com.yandex.passport.internal.ui.bouncer.model.middleware;

import android.net.Uri;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/t;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "loginState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/t;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.SocialActionResultActor$act$1", f = "SocialActionResultActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SocialActionResultActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SocialActionResultActor$act$1 socialActionResultActor$act$1 = new SocialActionResultActor$act$1(3, (Continuation) obj3);
        socialActionResultActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.t) obj;
        socialActionResultActor$act$1.L$1 = (s1) obj2;
        return socialActionResultActor$act$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.ui.bouncer.model.t tVar = (com.yandex.passport.internal.ui.bouncer.model.t) this.L$0;
        try {
            LoginProperties loginProperties = ((s1) this.L$1).c;
            if (loginProperties == null) {
                throw new IllegalStateException("No login properties.");
            }
            Uri build = Uri.parse(tVar.b).buildUpon().appendQueryParameter("task_id", tVar.a).build();
            com.yandex.passport.common.url.b.Companion.getClass();
            return new com.yandex.passport.internal.ui.bouncer.model.d0(loginProperties, null, null, null, false, false, null, build.toString(), HProv.PP_DELETE_SAVED_PASSWD);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            a = Result.a(failure);
            if (a != null) {
                return failure;
            }
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error processing social action result", a);
            }
            return new com.yandex.passport.internal.ui.bouncer.model.o("SocialActionResultActor", "Error processing social interaction", a);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            a = Result.a(failure);
            if (a != null) {
            }
        }
    }
}

package com.yandex.passport.sloth;

import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.SlothFinishProcessor$finishAuthSdk$1", f = "SlothFinishProcessor.kt", l = {HProv.PP_LICENSE, 165}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothFinishProcessor$finishAuthSdk$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothFinishProcessor$finishAuthSdk$1(k0 k0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = k0Var;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlothFinishProcessor$finishAuthSdk$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlothFinishProcessor$finishAuthSdk$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r9.d(r0, r8) == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r9.b(r4, r8) == r3) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            z0 z0Var = this.this$0.d;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            z0Var.a(new n0(message, 3));
        }
        if (i == 0) {
            kotlin.b.b(obj);
            v vVar = this.this$0.e;
            n nVar = new n(true);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        LinkedHashMap f = com.yandex.passport.common.url.b.f(this.$url, j73.f0(new String[]{"access_token", "token_type", "expires_in"}));
        String str = (String) f.get("access_token");
        String str2 = (String) f.get("token_type");
        String str3 = (String) f.get("expires_in");
        Long l = str3 != null ? new Long(Long.parseLong(str3)) : null;
        v vVar2 = this.this$0.e;
        c cVar = new c(str, str2, l.longValue());
        this.label = 2;
    }
}

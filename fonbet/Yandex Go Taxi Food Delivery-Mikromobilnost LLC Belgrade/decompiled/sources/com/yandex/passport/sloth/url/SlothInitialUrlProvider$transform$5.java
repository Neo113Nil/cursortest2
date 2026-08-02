package com.yandex.passport.sloth.url;

import android.net.Uri;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.sloth.data.c0;
import com.yandex.passport.sloth.data.u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/passport/common/url/b;", "<anonymous>", "()Lcom/yandex/passport/common/url/b;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.url.SlothInitialUrlProvider$transform$5", f = "SlothInitialUrlProvider.kt", l = {HProv.PP_VERSION_TIMESTAMP, 128}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothInitialUrlProvider$transform$5 extends SuspendLambda implements tls {
    final /* synthetic */ Uri $this_transform;
    final /* synthetic */ c0 $variant;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothInitialUrlProvider$transform$5(Uri uri, c0 c0Var, c cVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$variant = c0Var;
        this.$this_transform = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        c cVar = this.this$0;
        return new SlothInitialUrlProvider$transform$5(this.$this_transform, this.$variant, cVar, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SlothInitialUrlProvider$transform$5) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r7 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Object e;
        Uri uri;
        Object u;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cVar = this.this$0;
            com.yandex.passport.sloth.dependencies.h hVar = cVar.b;
            u uVar = (u) this.$variant;
            this.L$0 = cVar;
            this.label = 1;
            e = ((com.yandex.passport.internal.sloth.o) hVar).e(uVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                u = ((com.yandex.passport.common.url.b) obj).a;
                return new com.yandex.passport.common.url.b((String) u);
            }
            cVar = (c) this.L$0;
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        if (e instanceof Result.Failure) {
            e = null;
        }
        com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) e;
        String str = bVar != null ? bVar.a : null;
        if (str == null || (uri = Uri.parse(str)) == null) {
            uri = this.$this_transform;
        }
        Uid uid = ((u) this.$variant).w;
        FrontendUrlType frontendUrlType = FrontendUrlType.PASSPORT;
        this.L$0 = null;
        this.label = 2;
        u = cVar.u(uri, uid, frontendUrlType, this);
    }
}

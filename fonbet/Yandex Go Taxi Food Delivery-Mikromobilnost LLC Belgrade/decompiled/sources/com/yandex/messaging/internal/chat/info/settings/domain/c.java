package com.yandex.messaging.internal.chat.info.settings.domain;

import com.yandex.messaging.core.net.entities.GetChatSettingsParams;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.authorized.i;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getChatSettings$$inlined$makeCall$1;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.el21;
import defpackage.fse;
import defpackage.kse;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tje;
import defpackage.to3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class c extends k {
    public final kse b;
    public final el21 c;
    public final com.yandex.messaging.internal.chat.domain.a d;

    public c(kse kseVar, el21 el21Var, com.yandex.messaging.internal.chat.domain.a aVar) {
        super(kseVar.e);
        this.b = kseVar;
        this.c = el21Var;
        this.d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        GetChatSettingsUseCase$run$1 getChatSettingsUseCase$run$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        c cVar;
        to3 to3Var;
        fse fseVar;
        if (continuationImpl instanceof GetChatSettingsUseCase$run$1) {
            getChatSettingsUseCase$run$1 = (GetChatSettingsUseCase$run$1) continuationImpl;
            int i2 = getChatSettingsUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatSettingsUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getChatSettingsUseCase$run$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatSettingsUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    getChatSettingsUseCase$run$1.L$0 = this;
                    getChatSettingsUseCase$run$1.L$1 = str;
                    getChatSettingsUseCase$run$1.label = 1;
                    obj = i.a(this.c, getChatSettingsUseCase$run$1);
                } else if (i == 1) {
                    str = (String) getChatSettingsUseCase$run$1.L$1;
                    this = (c) getChatSettingsUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return ((oyj0) obj).b();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    to3Var = (to3) getChatSettingsUseCase$run$1.L$2;
                    str = (String) getChatSettingsUseCase$run$1.L$1;
                    cVar = (c) getChatSettingsUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    GetChatSettingsParams getChatSettingsParams = new GetChatSettingsParams(str, (String) obj);
                    fseVar = cVar.b.e;
                    getChatSettingsUseCase$run$1.L$0 = null;
                    getChatSettingsUseCase$run$1.L$1 = null;
                    getChatSettingsUseCase$run$1.L$2 = null;
                    getChatSettingsUseCase$run$1.label = 3;
                    if (fseVar == null) {
                        fseVar = getChatSettingsUseCase$run$1.get_context();
                    }
                    obj = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$getChatSettings$$inlined$makeCall$1(null, to3Var, getChatSettingsParams), getChatSettingsUseCase$run$1);
                }
                to3 a2 = ((d9g) ((cl21) obj)).a();
                com.yandex.messaging.internal.chat.domain.a aVar = this.d;
                getChatSettingsUseCase$run$1.L$0 = this;
                getChatSettingsUseCase$run$1.L$1 = str;
                getChatSettingsUseCase$run$1.L$2 = a2;
                getChatSettingsUseCase$run$1.label = 2;
                a = aVar.a(str, getChatSettingsUseCase$run$1);
                if (a != coroutineSingletons) {
                    cVar = this;
                    to3Var = a2;
                    obj = a;
                    GetChatSettingsParams getChatSettingsParams2 = new GetChatSettingsParams(str, (String) obj);
                    fseVar = cVar.b.e;
                    getChatSettingsUseCase$run$1.L$0 = null;
                    getChatSettingsUseCase$run$1.L$1 = null;
                    getChatSettingsUseCase$run$1.L$2 = null;
                    getChatSettingsUseCase$run$1.label = 3;
                    if (fseVar == null) {
                    }
                    obj = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$getChatSettings$$inlined$makeCall$1(null, to3Var, getChatSettingsParams2), getChatSettingsUseCase$run$1);
                }
                return coroutineSingletons;
            }
        }
        getChatSettingsUseCase$run$1 = new GetChatSettingsUseCase$run$1(this, continuationImpl);
        Object obj2 = getChatSettingsUseCase$run$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatSettingsUseCase$run$1.label;
        if (i != 0) {
        }
        to3 a22 = ((d9g) ((cl21) obj2)).a();
        com.yandex.messaging.internal.chat.domain.a aVar2 = this.d;
        getChatSettingsUseCase$run$1.L$0 = this;
        getChatSettingsUseCase$run$1.L$1 = str;
        getChatSettingsUseCase$run$1.L$2 = a22;
        getChatSettingsUseCase$run$1.label = 2;
        a = aVar2.a(str, getChatSettingsUseCase$run$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}

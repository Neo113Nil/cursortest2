package com.yandex.messaging.domain.inviteLink;

import com.yandex.messaging.core.net.entities.CreateInviteLinkTokenResponse;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$createInviteLinkToken$$inlined$makeCall$1;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.fse;
import defpackage.gbb1;
import defpackage.iyj0;
import defpackage.kse;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tje;
import defpackage.to3;
import defpackage.w511;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a extends k {
    public final j b;

    public a(kse kseVar, j jVar) {
        super(kseVar.e);
        this.b = jVar;
    }

    @Override // com.yandex.messaging.domain.k
    public final /* bridge */ /* synthetic */ Object b(Object obj, Continuation continuation) {
        return c((ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0040, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        GetTemporaryInviteLinkTokenUseCase$run$1 getTemporaryInviteLinkTokenUseCase$run$1;
        int i;
        fse fseVar;
        if (continuationImpl instanceof GetTemporaryInviteLinkTokenUseCase$run$1) {
            getTemporaryInviteLinkTokenUseCase$run$1 = (GetTemporaryInviteLinkTokenUseCase$run$1) continuationImpl;
            int i2 = getTemporaryInviteLinkTokenUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getTemporaryInviteLinkTokenUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getTemporaryInviteLinkTokenUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getTemporaryInviteLinkTokenUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    getTemporaryInviteLinkTokenUseCase$run$1.label = 1;
                    obj = gbb1.c(this.b, getTemporaryInviteLinkTokenUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        oyj0 oyj0Var = (oyj0) obj;
                        if (oyj0Var instanceof myj0) {
                            return new myj0(((CreateInviteLinkTokenResponse) ((myj0) oyj0Var).a).getToken());
                        }
                        if (oyj0Var instanceof iyj0) {
                            return new iyj0(((iyj0) oyj0Var).a);
                        }
                        w511.b();
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                to3 a = ((d9g) ((cl21) obj)).a();
                getTemporaryInviteLinkTokenUseCase$run$1.label = 2;
                fseVar = getTemporaryInviteLinkTokenUseCase$run$1.get_context();
                if (fseVar == null) {
                    fseVar = getTemporaryInviteLinkTokenUseCase$run$1.get_context();
                }
                obj = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$createInviteLinkToken$$inlined$makeCall$1(null, a), getTemporaryInviteLinkTokenUseCase$run$1);
            }
        }
        getTemporaryInviteLinkTokenUseCase$run$1 = new GetTemporaryInviteLinkTokenUseCase$run$1(this, continuationImpl);
        Object obj2 = getTemporaryInviteLinkTokenUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getTemporaryInviteLinkTokenUseCase$run$1.label;
        if (i != 0) {
        }
        to3 a2 = ((d9g) ((cl21) obj2)).a();
        getTemporaryInviteLinkTokenUseCase$run$1.label = 2;
        fseVar = getTemporaryInviteLinkTokenUseCase$run$1.get_context();
        if (fseVar == null) {
        }
        obj2 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$createInviteLinkToken$$inlined$makeCall$1(null, a2), getTemporaryInviteLinkTokenUseCase$run$1);
    }
}

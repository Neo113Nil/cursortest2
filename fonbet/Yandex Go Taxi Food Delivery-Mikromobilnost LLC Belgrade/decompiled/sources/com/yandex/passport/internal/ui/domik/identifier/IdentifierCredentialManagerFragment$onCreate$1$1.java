package com.yandex.passport.internal.ui.domik.identifier;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.sloth.credentialmanager.GoogleCredentialManagerImpl$Companion$CredentialManagerPlace;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.util.l;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.identifier.IdentifierCredentialManagerFragment$onCreate$1$1", f = "IdentifierCredentialManagerFragment.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IdentifierCredentialManagerFragment$onCreate$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ IdentifierCredentialManagerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifierCredentialManagerFragment$onCreate$1$1(IdentifierCredentialManagerFragment identifierCredentialManagerFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = identifierCredentialManagerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IdentifierCredentialManagerFragment$onCreate$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IdentifierCredentialManagerFragment$onCreate$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.yandex.passport.internal.sloth.credentialmanager.d dVar;
        Object a;
        e eVar;
        CredentialManagerRequestResult credentialManagerRequestResult;
        e eVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.credentialManagerRequested = true;
            dVar = this.this$0.credentialManager;
            if (dVar == null) {
                dVar = null;
            }
            GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace = GoogleCredentialManagerImpl$Companion$CredentialManagerPlace.Native;
            this.label = 1;
            a = dVar.a(false, googleCredentialManagerImpl$Companion$CredentialManagerPlace, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        IdentifierCredentialManagerFragment identifierCredentialManagerFragment = this.this$0;
        if (!(a instanceof Result.Failure)) {
            com.yandex.passport.internal.sloth.credentialmanager.a aVar = (com.yandex.passport.internal.sloth.credentialmanager.a) a;
            identifierCredentialManagerFragment.credentialManagerRequested = false;
            if (aVar != null) {
                credentialManagerRequestResult = new CredentialManagerRequestResult(aVar.b, aVar.c, null, aVar.a);
            } else {
                CredentialManagerRequestResult.Companion.getClass();
                credentialManagerRequestResult = new CredentialManagerRequestResult(null, null, null, false);
            }
            eVar2 = ((BaseDomikFragment) identifierCredentialManagerFragment).commonViewModel;
            eVar2.C.m(credentialManagerRequestResult);
        }
        IdentifierCredentialManagerFragment identifierCredentialManagerFragment2 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            identifierCredentialManagerFragment2.credentialManagerRequested = false;
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Failed to get credentials from Credential Manager: " + a2.getMessage(), 8);
            }
            eVar = ((BaseDomikFragment) identifierCredentialManagerFragment2).commonViewModel;
            l lVar = eVar.C;
            CredentialManagerRequestResult.Companion.getClass();
            lVar.m(new CredentialManagerRequestResult(null, null, null, false));
        }
        return zy11.a;
    }
}

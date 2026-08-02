package com.yandex.passport.internal.ui.domik.identifier;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.k;
import com.yandex.passport.internal.sloth.credentialmanager.GoogleCredentialManagerImpl$Companion$CredentialManagerPlace;
import com.yandex.passport.internal.ui.domik.CredentialManagerDomikResult;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.util.l;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vuu0;
import defpackage.w53;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.identifier.IdentifierCredentialManagerFragment$saveToCredentialManager$1", f = "IdentifierCredentialManagerFragment.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IdentifierCredentialManagerFragment$saveToCredentialManager$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.sloth.credentialmanager.a $credentials;
    int label;
    final /* synthetic */ IdentifierCredentialManagerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifierCredentialManagerFragment$saveToCredentialManager$1(IdentifierCredentialManagerFragment identifierCredentialManagerFragment, com.yandex.passport.internal.sloth.credentialmanager.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = identifierCredentialManagerFragment;
        this.$credentials = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IdentifierCredentialManagerFragment$saveToCredentialManager$1(this.this$0, this.$credentials, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IdentifierCredentialManagerFragment$saveToCredentialManager$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.yandex.passport.internal.sloth.credentialmanager.d dVar;
        CredentialManagerDomikResult credentialManagerDomikResult;
        e eVar;
        CredentialManagerDomikResult credentialManagerDomikResult2;
        c0 c0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dVar = this.this$0.credentialManager;
            if (dVar == null) {
                dVar = null;
            }
            com.yandex.passport.internal.sloth.credentialmanager.a aVar = this.$credentials;
            GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace = GoogleCredentialManagerImpl$Companion$CredentialManagerPlace.Native;
            this.label = 1;
            obj = dVar.c(aVar, googleCredentialManagerImpl$Companion$CredentialManagerPlace, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, booleanValue ? "Credentials have been saved to Smart Lock" : "Failed to save credentials to Smart Lock", 8);
        }
        credentialManagerDomikResult = this.this$0.domikResult;
        IdentifierCredentialManagerFragment identifierCredentialManagerFragment = this.this$0;
        if (credentialManagerDomikResult == null) {
            c0Var = ((BaseDomikFragment) identifierCredentialManagerFragment).eventReporter;
            IdentifierCredentialManagerFragment identifierCredentialManagerFragment2 = this.this$0;
            String c = vuu0.c("\n        isAdded = " + identifierCredentialManagerFragment2.isAdded() + ",\n        isDetached = " + identifierCredentialManagerFragment2.isDetached() + ",\n        isHidden = " + identifierCredentialManagerFragment2.isHidden() + ",\n        isInLayout = " + identifierCredentialManagerFragment2.isInLayout() + ",\n        isRemoving = " + identifierCredentialManagerFragment2.isRemoving() + ",\n        isResumed = " + identifierCredentialManagerFragment2.isResumed() + ",\n        isStateSaved = " + identifierCredentialManagerFragment2.isStateSaved() + ",\n        isVisible = " + identifierCredentialManagerFragment2.isVisible() + ",\n    ");
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, c);
            w53Var.put("success", String.valueOf(booleanValue));
            c0Var.a.a(k.c, w53Var);
        } else {
            eVar = ((BaseDomikFragment) identifierCredentialManagerFragment).commonViewModel;
            l lVar = eVar.E;
            credentialManagerDomikResult2 = this.this$0.domikResult;
            lVar.m(credentialManagerDomikResult2);
        }
        return zy11.a;
    }
}

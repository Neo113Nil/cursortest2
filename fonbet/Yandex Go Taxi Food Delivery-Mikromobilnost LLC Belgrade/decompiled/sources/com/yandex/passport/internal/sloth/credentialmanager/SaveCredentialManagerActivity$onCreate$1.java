package com.yandex.passport.internal.sloth.credentialmanager;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.sloth.credentialmanager.SaveCredentialManagerActivity$onCreate$1", f = "SaveCredentialManagerActivity.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class SaveCredentialManagerActivity$onCreate$1 extends SuspendLambda implements wls {
    final /* synthetic */ d $credentialManager;
    final /* synthetic */ a $credentials;
    int label;
    final /* synthetic */ SaveCredentialManagerActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveCredentialManagerActivity$onCreate$1(a aVar, SaveCredentialManagerActivity saveCredentialManagerActivity, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$credentials = aVar;
        this.this$0 = saveCredentialManagerActivity;
        this.$credentialManager = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SaveCredentialManagerActivity$onCreate$1(this.$credentials, this.this$0, this.$credentialManager, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SaveCredentialManagerActivity$onCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.$credentials;
            if (aVar != null) {
                d dVar = this.$credentialManager;
                GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace = GoogleCredentialManagerImpl$Companion$CredentialManagerPlace.AutoLogin;
                this.label = 1;
                obj = dVar.c(aVar, googleCredentialManagerImpl$Companion$CredentialManagerPlace, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.this$0.finish();
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((Boolean) obj).getClass();
        this.this$0.finish();
        return zy11.a;
    }
}

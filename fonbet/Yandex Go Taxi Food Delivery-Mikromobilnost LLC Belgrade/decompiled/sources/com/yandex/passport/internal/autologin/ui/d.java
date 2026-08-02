package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import com.yandex.passport.api.a0;
import com.yandex.passport.api.exception.PassportAutoLoginImpossibleException;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ e a;
    public final /* synthetic */ eyc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ a0 w;

    public d(e eVar, eyc eycVar, Context context, a0 a0Var) {
        this.a = eVar;
        this.b = eycVar;
        this.c = context;
        this.w = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1 kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1;
        int i;
        d dVar;
        com.yandex.passport.internal.sloth.credentialmanager.a aVar;
        Object obj2;
        d dVar2;
        Throwable a;
        if (continuation instanceof KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1) {
            kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1 = (KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1) continuation;
            int i2 = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar2 = (com.yandex.passport.internal.sloth.credentialmanager.a) obj;
                    com.yandex.passport.internal.impl.i iVar = this.a.a;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.L$0 = this;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.L$1 = aVar2;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.label = 1;
                    if (iVar.B(true, kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1) != coroutineSingletons) {
                        dVar = this;
                        aVar = aVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar2 = (d) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.L$0;
                    kotlin.b.b(obj3);
                    obj2 = ((Result) obj3).getValue();
                    if (!(obj2 instanceof Result.Failure)) {
                        ((fyc) dVar2.b).T(new Result((com.yandex.passport.internal.entities.a) obj2));
                    }
                    a = Result.a(obj2);
                    if (a != null) {
                        ((fyc) dVar2.b).T(new Result(new Result.Failure(a)));
                    }
                    return zy11.a;
                }
                aVar = (com.yandex.passport.internal.sloth.credentialmanager.a) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.L$1;
                dVar = (d) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.L$0;
                kotlin.b.b(obj3);
                ((Result) obj3).getClass();
                if (aVar != null) {
                    ((fyc) dVar.b).T(new Result(new Result.Failure(new PassportAutoLoginImpossibleException("Can't request credentials from credential manager"))));
                    return zy11.a;
                }
                e eVar = dVar.a;
                Context context = dVar.c;
                a0 a0Var = dVar.w;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.L$0 = dVar;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.L$1 = null;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.label = 2;
                Object c = eVar.c(context, aVar, a0Var, kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1);
                if (c != coroutineSingletons) {
                    d dVar3 = dVar;
                    obj2 = c;
                    dVar2 = dVar3;
                    if (!(obj2 instanceof Result.Failure)) {
                    }
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1 = new KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1(this, continuation);
        Object obj32 = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1.label;
        if (i != 0) {
        }
        if (aVar != null) {
        }
    }
}

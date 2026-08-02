package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.yandex.passport.internal.sloth.credentialmanager.GoogleCredentialManagerImpl$Companion$CredentialManagerPlace;
import com.yandex.passport.internal.sloth.credentialmanager.SaveCredentialManagerActivity;
import com.yandex.passport.sloth.command.data.p0;
import com.yandex.passport.sloth.command.r;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.u;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.c0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.iqn;
import defpackage.kqn;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class n implements s {
    public final com.yandex.passport.internal.sloth.credentialmanager.d a;
    public final Context b;

    public n(com.yandex.passport.internal.sloth.credentialmanager.d dVar, Context context) {
        this.a = dVar;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.sloth.command.s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SlothParams slothParams, p0 p0Var, ContinuationImpl continuationImpl) {
        SaveLoginCredentialsCommandPerformer$performCommand$1 saveLoginCredentialsCommandPerformer$performCommand$1;
        int i;
        u uVar = u.c;
        if (continuationImpl instanceof SaveLoginCredentialsCommandPerformer$performCommand$1) {
            saveLoginCredentialsCommandPerformer$performCommand$1 = (SaveLoginCredentialsCommandPerformer$performCommand$1) continuationImpl;
            int i2 = saveLoginCredentialsCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveLoginCredentialsCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = saveLoginCredentialsCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveLoginCredentialsCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Context context = this.b;
                    if (!com.yandex.passport.common.util.a.c(context)) {
                        return new iqn(uVar);
                    }
                    String str = p0Var.a;
                    String str2 = p0Var.b;
                    if (evu0.J(str) || evu0.J(str2)) {
                        com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.b;
                        return dVar instanceof r ? new iqn(dVar) : new kqn(dVar);
                    }
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar = new com.yandex.passport.internal.sloth.credentialmanager.a(str, str2, false);
                    if (Build.VERSION.SDK_INT >= 34) {
                        c0 variant = slothParams.getVariant();
                        if ((variant instanceof com.yandex.passport.sloth.data.p) && ((com.yandex.passport.sloth.data.p) variant).b.isLoginFlow()) {
                            SaveCredentialManagerActivity.Companion.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("username_key", str);
                            bundle.putString("password_key", str2);
                            bundle.putBoolean("is_from_dialog_key", false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putAll(new Bundle[]{bundle}[0]);
                            Intent B = d6z.B(context, SaveCredentialManagerActivity.class, bundle2);
                            B.addFlags(SelfTester_JCP.IMITA);
                            context.startActivity(B);
                        }
                    } else {
                        GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace = GoogleCredentialManagerImpl$Companion$CredentialManagerPlace.Login;
                        saveLoginCredentialsCommandPerformer$performCommand$1.label = 1;
                        if (this.a.c(aVar, googleCredentialManagerImpl$Companion$CredentialManagerPlace, saveLoginCredentialsCommandPerformer$performCommand$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new iqn(uVar);
            }
        }
        saveLoginCredentialsCommandPerformer$performCommand$1 = new SaveLoginCredentialsCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = saveLoginCredentialsCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveLoginCredentialsCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(uVar);
    }
}

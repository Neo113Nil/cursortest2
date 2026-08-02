package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.internal.sloth.credentialmanager.GoogleCredentialManagerImpl$Companion$CredentialManagerPlace;
import com.yandex.passport.sloth.command.data.j0;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.u;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.c0;
import com.yandex.passport.sloth.data.v;
import defpackage.iqn;
import defpackage.ny61;
import defpackage.w511;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class k implements s {
    public final com.yandex.passport.internal.sloth.credentialmanager.d a;
    public final Context b;

    public k(com.yandex.passport.internal.sloth.credentialmanager.d dVar, Context context) {
        this.a = dVar;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.passport.sloth.command.s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SlothParams slothParams, j0 j0Var, ContinuationImpl continuationImpl) {
        RequestLoginCredentialsCommandPerformer$performCommand$1 requestLoginCredentialsCommandPerformer$performCommand$1;
        int i;
        Object b;
        Throwable a;
        t b2;
        Object obj = u.b;
        if (continuationImpl instanceof RequestLoginCredentialsCommandPerformer$performCommand$1) {
            requestLoginCredentialsCommandPerformer$performCommand$1 = (RequestLoginCredentialsCommandPerformer$performCommand$1) continuationImpl;
            int i2 = requestLoginCredentialsCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestLoginCredentialsCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requestLoginCredentialsCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestLoginCredentialsCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    c0 variant = slothParams.getVariant();
                    if (!com.yandex.passport.common.util.a.c(this.b) || (variant instanceof v)) {
                        return new iqn(obj);
                    }
                    GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace = GoogleCredentialManagerImpl$Companion$CredentialManagerPlace.Login;
                    String str = j0Var.a;
                    requestLoginCredentialsCommandPerformer$performCommand$1.label = 1;
                    b = this.a.b(googleCredentialManagerImpl$Companion$CredentialManagerPlace, str, requestLoginCredentialsCommandPerformer$performCommand$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    b = ((Result) obj2).getValue();
                }
                a = Result.a(b);
                if (a == null) {
                    Throwable cause = a.getCause();
                    if (cause instanceof GetPublicKeyCredentialException) {
                        obj = com.yandex.passport.internal.ui.sloth.e.b(new Pair("error", "webauthn." + ((GetPublicKeyCredentialException) cause).getType()));
                    }
                    return new iqn(obj);
                }
                com.yandex.passport.internal.sloth.credentialmanager.c cVar = (com.yandex.passport.internal.sloth.credentialmanager.c) b;
                if (cVar instanceof com.yandex.passport.internal.sloth.credentialmanager.b) {
                    b2 = com.yandex.passport.internal.ui.sloth.e.b(new Pair("webauthn", ((com.yandex.passport.internal.sloth.credentialmanager.b) cVar).b));
                } else {
                    if (!(cVar instanceof com.yandex.passport.internal.sloth.credentialmanager.a)) {
                        w511.b();
                        return null;
                    }
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar = (com.yandex.passport.internal.sloth.credentialmanager.a) cVar;
                    b2 = com.yandex.passport.internal.ui.sloth.e.b(new Pair(LegacyAccountType.STRING_LOGIN, aVar.b), new Pair(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, aVar.c), new Pair("isFromDialog", Boolean.valueOf(cVar.a)));
                }
                return new iqn(b2);
            }
        }
        requestLoginCredentialsCommandPerformer$performCommand$1 = new RequestLoginCredentialsCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj22 = requestLoginCredentialsCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestLoginCredentialsCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a == null) {
        }
    }
}

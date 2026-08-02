package com.yandex.passport.internal.push;

import android.content.Intent;
import androidx.core.app.PassportJobIntentService;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.ffx;
import defpackage.ij3;
import defpackage.jl40;
import defpackage.lse;
import defpackage.mse;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000  2\u00020\u0001:\u0006!\"#$%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u00020\u0010*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u00020\u001a*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001a*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006'"}, d2 = {"Lcom/yandex/passport/internal/push/PassportPushRegistrationService;", "Landroidx/core/app/PassportJobIntentService;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lzy11;", "onHandleWork", "(Landroid/content/Intent;)V", "onDestroy", "Lmse;", "exceptionHandler", "Lmse;", "Ltse;", "scope", "Ltse;", "Lcom/yandex/passport/common/core/Uid;", "getRequiredUid", "(Landroid/content/Intent;)Lcom/yandex/passport/common/core/Uid;", "requiredUid", "getUid", "uid", "", "getNewToken", "(Landroid/content/Intent;)Ljava/lang/String;", "newToken", "Lcom/yandex/passport/api/PushPlatform;", "getRequiredPushPlatform", "(Landroid/content/Intent;)Lcom/yandex/passport/api/PushPlatform;", "requiredPushPlatform", "getPushPlatform", "pushPlatform", "Companion", "com/yandex/passport/internal/push/r", "com/yandex/passport/internal/push/q", "com/yandex/passport/internal/push/t", "com/yandex/passport/internal/push/n0", "com/yandex/passport/internal/push/s", "com/yandex/passport/internal/push/p", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportPushRegistrationService extends PassportJobIntentService {
    public static final int $stable = 8;
    public static final p Companion = new p();
    private final mse exceptionHandler;
    private final tse scope;

    public PassportPushRegistrationService() {
        ij3 ij3Var = new ij3(lse.a, 15);
        this.exceptionHandler = ij3Var;
        this.scope = bvf0.a(cvw.U(jl40.a(), uyj.a).plus(com.yandex.passport.internal.util.p.o("PushRegistration")).plus(ij3Var));
    }

    private final String getNewToken(Intent intent) {
        return (String) ffx.P(intent, "new_token", String.class);
    }

    private final PushPlatform getPushPlatform(Intent intent) {
        return (PushPlatform) ffx.R(intent, "platform", PushPlatform.class);
    }

    private final PushPlatform getRequiredPushPlatform(Intent intent) {
        PushPlatform pushPlatform = getPushPlatform(intent);
        if (pushPlatform != null) {
            return pushPlatform;
        }
        ny61.r("missing required parameter pushPlatform");
        return null;
    }

    private final Uid getRequiredUid(Intent intent) {
        Uid uid = getUid(intent);
        if (uid != null) {
            return uid;
        }
        ny61.r("missing required parameter uid");
        return null;
    }

    private final Uid getUid(Intent intent) {
        return (Uid) ffx.P(intent, "uid", Uid.class);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        kotlinx.coroutines.a.e(this.scope.getCoroutineContext(), null);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        r n0Var;
        r rVar = s.a;
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        try {
            String stringExtra = intent.getStringExtra("intent_type");
            if (stringExtra != null) {
                int hashCode = stringExtra.hashCode();
                if (hashCode != -934610812) {
                    if (hashCode != 1085444827) {
                        if (hashCode == 1945680494 && stringExtra.equals("token_changed")) {
                            n0Var = new t(a.getPushSubscriptionManager(), a.getPreferenceStorage(), getRequiredPushPlatform(intent), getNewToken(intent));
                        }
                    } else if (stringExtra.equals("refresh")) {
                        n0Var = new q(a.getPushSubscriptionManager(), a.getPreferenceStorage(), getUid(intent));
                    }
                } else if (stringExtra.equals("remove")) {
                    n0Var = new n0(a.getPushSubscriptionManager(), getRequiredUid(intent));
                }
                rVar = n0Var;
            }
        } catch (Exception unused) {
        }
        tje.X(new PassportPushRegistrationService$onHandleWork$1(tje.N(this.scope, null, null, new PassportPushRegistrationService$onHandleWork$job$1(rVar, null), 3), null));
    }
}

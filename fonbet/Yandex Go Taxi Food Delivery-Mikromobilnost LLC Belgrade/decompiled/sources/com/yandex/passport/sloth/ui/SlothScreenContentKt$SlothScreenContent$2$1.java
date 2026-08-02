package com.yandex.passport.sloth.ui;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.whatsapp.otp.android.sdk.enums.WhatsAppClientType;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zw41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.SlothScreenContentKt$SlothScreenContent$2$1", f = "SlothScreenContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothScreenContentKt$SlothScreenContent$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ h $slothActivityInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothScreenContentKt$SlothScreenContent$2$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.$slothActivityInteractor = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlothScreenContentKt$SlothScreenContent$2$1(this.$slothActivityInteractor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SlothScreenContentKt$SlothScreenContent$2$1 slothScreenContentKt$SlothScreenContent$2$1 = (SlothScreenContentKt$SlothScreenContent$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        slothScreenContentKt$SlothScreenContent$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        h hVar = this.$slothActivityInteractor;
        l lVar = hVar.a;
        Activity activity = hVar.d;
        try {
            zw41 zw41Var = new zw41();
            boolean z = false;
            try {
                activity.getPackageManager().getPackageInfo(WhatsAppClientType.CONSUMER.a(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                try {
                    activity.getPackageManager().getPackageInfo(WhatsAppClientType.BUSINESS.a(), 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            z = true;
            if (z) {
                zw41Var.a(activity, WhatsAppClientType.CONSUMER);
                zw41Var.a(activity, WhatsAppClientType.BUSINESS);
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Success sendOtpIntentToWhatsApp", 8);
                }
            } else {
                ((com.yandex.passport.internal.ui.sloth.f) lVar).a(new com.yandex.passport.sloth.n0("send_otp_intent_to_whats_app", new Pair("error_message", "whatsapp_is_not_installed")));
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Failed sendOtpIntentToWhatsApp: WhatsApp is not installed", 8);
                }
            }
        } catch (Exception e) {
            ((com.yandex.passport.internal.ui.sloth.f) lVar).a(new com.yandex.passport.sloth.n0("send_otp_intent_to_whats_app", new Pair("error_message", String.valueOf(e.getMessage()))));
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "Failed sendOtpIntentToWhatsApp", e);
            }
        }
        return zy11.a;
    }
}

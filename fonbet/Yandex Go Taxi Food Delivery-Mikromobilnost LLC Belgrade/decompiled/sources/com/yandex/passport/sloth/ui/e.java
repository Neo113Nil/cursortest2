package com.yandex.passport.sloth.ui;

import android.app.PendingIntent;
import androidx.activity.result.IntentSenderRequest;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.m50;
import defpackage.oz40;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                try {
                    ((m50) obj2).a(new IntentSenderRequest(((PendingIntent) obj).getIntentSender(), null, 0, 0));
                    break;
                } catch (Throwable th) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Can't launch phone number hint intent launcher.", th);
                        break;
                    }
                }
                break;
            case 1:
                String str = (String) obj;
                if (((com.yandex.passport.sloth.b1) ((b1) obj2)).b.A.a.getCommonWebProperties().getUseBundleCache()) {
                    break;
                }
                break;
            case 2:
                try {
                    ((d0) obj2).V.a(new IntentSenderRequest(((PendingIntent) obj).getIntentSender(), null, 0, 0));
                    break;
                } catch (Throwable th2) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Can't launch phone number hint intent launcher.", th2);
                        break;
                    }
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((oz40) obj2).setValue(bool);
                break;
        }
        return zy11Var;
    }
}

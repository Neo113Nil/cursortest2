package com.yandex.go.settings.email;

import defpackage.avj0;
import defpackage.evu0;
import defpackage.ga0;
import defpackage.kyh0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class c {
    public final ru.yandex.taxi.settings.email.a a;
    public final zuj0 b;
    public volatile boolean c;
    public volatile String d;
    public volatile boolean e;

    public c(ru.yandex.taxi.settings.email.a aVar, zuj0 zuj0Var) {
        this.a = aVar;
        this.b = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        EmailSectionInteractor$awaitRefreshingEndListener$1 emailSectionInteractor$awaitRefreshingEndListener$1;
        int i;
        if (continuationImpl instanceof EmailSectionInteractor$awaitRefreshingEndListener$1) {
            emailSectionInteractor$awaitRefreshingEndListener$1 = (EmailSectionInteractor$awaitRefreshingEndListener$1) continuationImpl;
            int i2 = emailSectionInteractor$awaitRefreshingEndListener$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                emailSectionInteractor$awaitRefreshingEndListener$1.label = i2 - Integer.MIN_VALUE;
                Object obj = emailSectionInteractor$awaitRefreshingEndListener$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = emailSectionInteractor$awaitRefreshingEndListener$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = new mth(this.a.d, 6);
                    EmailSectionInteractor$awaitRefreshingEndListener$2 emailSectionInteractor$awaitRefreshingEndListener$2 = new EmailSectionInteractor$awaitRefreshingEndListener$2(2, null);
                    emailSectionInteractor$awaitRefreshingEndListener$1.label = 1;
                    if (e.x(mthVar, emailSectionInteractor$awaitRefreshingEndListener$2, emailSectionInteractor$awaitRefreshingEndListener$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        emailSectionInteractor$awaitRefreshingEndListener$1 = new EmailSectionInteractor$awaitRefreshingEndListener$1(this, continuationImpl);
        Object obj2 = emailSectionInteractor$awaitRefreshingEndListener$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = emailSectionInteractor$awaitRefreshingEndListener$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final ga0 b() {
        String str;
        ru.yandex.taxi.settings.email.a aVar = this.a;
        String c = aVar.c();
        int intValue = ((Number) aVar.f.getValue(aVar, ru.yandex.taxi.settings.email.a.i[0])).intValue();
        zuj0 zuj0Var = this.b;
        if (intValue != 1 && !evu0.J(c)) {
            str = ((avj0) zuj0Var).h(kyh0.email_change_status_not_confirmed);
        } else if (evu0.J(c)) {
            str = ((avj0) zuj0Var).h(kyh0.settings_mail_explain);
        } else {
            str = "";
        }
        return new ga0(c, str, false);
    }
}

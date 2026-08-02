package com.yandex.go.yb.lack_of_order.domain;

import android.net.Uri;
import com.yandex.go.yb.domain.model.LackOfMoneyPushNotificationInfo;
import com.yandex.go.yb.domain.p;
import defpackage.avu0;
import defpackage.h3y;
import defpackage.ky2;
import defpackage.nv51;
import defpackage.ny61;
import defpackage.qv51;
import defpackage.u2h;
import defpackage.xk60;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes15.dex */
public final class b {
    public final ky2 a;
    public final h3y b;
    public final p c;

    public b(ky2 ky2Var, h3y h3yVar, p pVar) {
        this.a = ky2Var;
        this.b = h3yVar;
        this.c = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LackOfMoneyPushNotificationInfo lackOfMoneyPushNotificationInfo, String str, ContinuationImpl continuationImpl) {
        LackOfMoneySystemNotificationInteractor$handle$1 lackOfMoneySystemNotificationInteractor$handle$1;
        Object obj;
        int i;
        String str2;
        long j;
        LackOfMoneyPushNotificationInfo lackOfMoneyPushNotificationInfo2 = lackOfMoneyPushNotificationInfo;
        if (continuationImpl instanceof LackOfMoneySystemNotificationInteractor$handle$1) {
            lackOfMoneySystemNotificationInteractor$handle$1 = (LackOfMoneySystemNotificationInteractor$handle$1) continuationImpl;
            int i2 = lackOfMoneySystemNotificationInteractor$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lackOfMoneySystemNotificationInteractor$handle$1.label = i2 - Integer.MIN_VALUE;
                obj = lackOfMoneySystemNotificationInteractor$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lackOfMoneySystemNotificationInteractor$handle$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = lackOfMoneyPushNotificationInfo2.c;
                    BigDecimal h = avu0.h(lackOfMoneyPushNotificationInfo2.d);
                    if (h != null) {
                        String str4 = lackOfMoneyPushNotificationInfo2.e;
                        lackOfMoneySystemNotificationInteractor$handle$1.L$0 = lackOfMoneyPushNotificationInfo2;
                        str2 = str;
                        lackOfMoneySystemNotificationInteractor$handle$1.L$1 = str2;
                        lackOfMoneySystemNotificationInteractor$handle$1.L$2 = null;
                        lackOfMoneySystemNotificationInteractor$handle$1.L$3 = null;
                        lackOfMoneySystemNotificationInteractor$handle$1.L$4 = null;
                        lackOfMoneySystemNotificationInteractor$handle$1.J$0 = 0L;
                        lackOfMoneySystemNotificationInteractor$handle$1.label = 1;
                        obj = this.c.a(str3, h, str4, lackOfMoneySystemNotificationInteractor$handle$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j = 0;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = lackOfMoneySystemNotificationInteractor$handle$1.J$0;
                String str5 = (String) lackOfMoneySystemNotificationInteractor$handle$1.L$1;
                LackOfMoneyPushNotificationInfo lackOfMoneyPushNotificationInfo3 = (LackOfMoneyPushNotificationInfo) lackOfMoneySystemNotificationInteractor$handle$1.L$0;
                kotlin.b.b(obj);
                str2 = str5;
                lackOfMoneyPushNotificationInfo2 = lackOfMoneyPushNotificationInfo3;
                j = j2;
                if (!(((qv51) obj) instanceof nv51) && !this.a.j()) {
                    NotificationShareData.a aVar = new NotificationShareData.a();
                    aVar.e = "topup_yandex_wallet";
                    aVar.b = str2;
                    Uri parse = Uri.parse(lackOfMoneyPushNotificationInfo2.b);
                    String str6 = lackOfMoneyPushNotificationInfo2.a;
                    xk60 xk60Var = (xk60) this.b.get();
                    xk60Var.l(aVar, xk60Var.e(new u2h(null, str6, parse, null, "order", j, 81), aVar));
                }
                return zy11Var;
            }
        }
        lackOfMoneySystemNotificationInteractor$handle$1 = new LackOfMoneySystemNotificationInteractor$handle$1(this, continuationImpl);
        obj = lackOfMoneySystemNotificationInteractor$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lackOfMoneySystemNotificationInteractor$handle$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (!(((qv51) obj) instanceof nv51)) {
            NotificationShareData.a aVar2 = new NotificationShareData.a();
            aVar2.e = "topup_yandex_wallet";
            aVar2.b = str2;
            Uri parse2 = Uri.parse(lackOfMoneyPushNotificationInfo2.b);
            String str62 = lackOfMoneyPushNotificationInfo2.a;
            xk60 xk60Var2 = (xk60) this.b.get();
            xk60Var2.l(aVar2, xk60Var2.e(new u2h(null, str62, parse2, null, "order", j, 81), aVar2));
        }
        return zy11Var2;
    }
}

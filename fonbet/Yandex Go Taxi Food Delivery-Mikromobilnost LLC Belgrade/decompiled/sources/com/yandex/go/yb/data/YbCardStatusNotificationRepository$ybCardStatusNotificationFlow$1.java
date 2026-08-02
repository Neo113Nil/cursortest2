package com.yandex.go.yb.data;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.yb.data.model.YbCardStatusNotification$YbCardStatus;
import com.yandex.go.yb.experiments.ChangeToYbWalletExperiment;
import defpackage.d6z;
import defpackage.dms;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qq51;
import defpackage.uy51;
import defpackage.vy51;
import defpackage.wy51;
import defpackage.yy51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lwy51;", "walletState", "", "isBankScreenOpen", "", "Llea0;", "paymentModels", "Lcom/yandex/go/payments/api/model/PaymentsScreen;", "paymentsScreen", "Lqq51;", "<anonymous>", "(Lwy51;ZLjava/util/List;Lcom/yandex/go/payments/api/model/PaymentsScreen;)Lqq51;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.data.YbCardStatusNotificationRepository$ybCardStatusNotificationFlow$1", f = "YbCardStatusNotificationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbCardStatusNotificationRepository$ybCardStatusNotificationFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbCardStatusNotificationRepository$ybCardStatusNotificationFlow$1(i iVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        YbCardStatusNotificationRepository$ybCardStatusNotificationFlow$1 ybCardStatusNotificationRepository$ybCardStatusNotificationFlow$1 = new YbCardStatusNotificationRepository$ybCardStatusNotificationFlow$1(this.this$0, (Continuation) obj5);
        ybCardStatusNotificationRepository$ybCardStatusNotificationFlow$1.L$0 = (wy51) obj;
        ybCardStatusNotificationRepository$ybCardStatusNotificationFlow$1.Z$0 = booleanValue;
        ybCardStatusNotificationRepository$ybCardStatusNotificationFlow$1.L$1 = (List) obj3;
        ybCardStatusNotificationRepository$ybCardStatusNotificationFlow$1.L$2 = (PaymentsScreen) obj4;
        return ybCardStatusNotificationRepository$ybCardStatusNotificationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        wy51 wy51Var = (wy51) this.L$0;
        boolean z = this.Z$0;
        List list = (List) this.L$1;
        PaymentsScreen paymentsScreen = (PaymentsScreen) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ChangeToYbWalletExperiment changeToYbWalletExperiment = (ChangeToYbWalletExperiment) this.this$0.b.b();
        if (changeToYbWalletExperiment.b()) {
            if (!(wy51Var instanceof vy51)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof yy51) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    yy51 yy51Var = (yy51) obj2;
                    if ((wy51Var instanceof uy51) && jl40.l(yy51Var.a, ((uy51) wy51Var).a)) {
                        break;
                    }
                }
                yy51 yy51Var2 = (yy51) obj2;
                if (yy51Var2 != null) {
                    String str = yy51Var2.a;
                    if (!jl40.l(this.this$0.a.b.a().b, str)) {
                        if (z) {
                            this.this$0.c.r("NOTIFICATION", str);
                        }
                        if (paymentsScreen == null) {
                            String Y = d6z.Y(changeToYbWalletExperiment, changeToYbWalletExperiment.h);
                            String Y2 = d6z.Y(changeToYbWalletExperiment, changeToYbWalletExperiment.i);
                            if (!evu0.J(Y) && !evu0.J(Y2)) {
                                return new qq51(str, Y, Y2, YbCardStatusNotification$YbCardStatus.OPENED);
                            }
                        }
                    }
                }
            } else if (paymentsScreen == null && !z) {
                String Y3 = d6z.Y(changeToYbWalletExperiment, changeToYbWalletExperiment.f);
                String Y4 = d6z.Y(changeToYbWalletExperiment, changeToYbWalletExperiment.g);
                if (!evu0.J(Y3) && !evu0.J(Y4)) {
                    return new qq51("processing", Y3, Y4, YbCardStatusNotification$YbCardStatus.PROCCESING);
                }
            }
        }
        return null;
    }
}

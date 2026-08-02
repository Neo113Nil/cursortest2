package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.r2;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t2;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/y;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "loginState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/y;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.RouteActor$act$1", f = "RouteActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RouteActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteActor$act$1(r0 r0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = r0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RouteActor$act$1 routeActor$act$1 = new RouteActor$act$1(this.this$0, (Continuation) obj3);
        routeActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.y) obj;
        routeActor$act$1.L$1 = (s1) obj2;
        return routeActor$act$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.ui.bouncer.model.y yVar = (com.yandex.passport.internal.ui.bouncer.model.y) this.L$0;
        s1 s1Var = (s1) this.L$1;
        com.yandex.passport.internal.account.a aVar = this.this$0.a;
        com.yandex.passport.internal.ui.bouncer.model.g1 g1Var = yVar.a;
        LoginProperties loginProperties = g1Var.a;
        LoginProperties loginProperties2 = g1Var.a;
        List<t2> list = g1Var.b;
        if (!list.isEmpty()) {
            int i = p0.a[s1Var.e.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if ((aVar.a() != null && !loginProperties.isFromAuthSdk()) || loginProperties.getAuthSdkChallengeUid() != null) {
                    if (loginProperties.getAuthSdkChallengeUid() != null) {
                        return new com.yandex.passport.internal.ui.bouncer.model.f(yVar.a, com.yandex.passport.internal.util.p.B(loginProperties.getAuthSdkChallengeUid()), loginProperties2.getTheme(), false);
                    }
                    ModernAccount a = aVar.a();
                    Uid uid = a != null ? a.getUid() : null;
                    return uid != null ? new com.yandex.passport.internal.ui.bouncer.model.f(g1Var, uid, loginProperties2.getTheme(), false) : new com.yandex.passport.internal.ui.bouncer.model.o("RouteActor", "Current account is missing", null);
                }
            } else if (i != 4 && i != 5) {
                w511.b();
                return null;
            }
        }
        if (!list.isEmpty()) {
            boolean z = (g1Var.d == null && loginProperties2.getSelectedUid() == null) ? false : true;
            boolean isAdditionOnlyRequired = loginProperties2.isAdditionOnlyRequired();
            boolean isRegistrationOnlyRequired = loginProperties2.isRegistrationOnlyRequired();
            BindPhoneProperties bindPhoneProperties = loginProperties2.getBindPhoneProperties();
            boolean z2 = (bindPhoneProperties != null ? bindPhoneProperties.getUid() : null) != null;
            boolean z3 = loginProperties2.getSocialRegistrationProperties().getUid() != null;
            boolean z4 = loginProperties2.getSocialConfiguration() != null;
            if (!z && !isAdditionOnlyRequired && !isRegistrationOnlyRequired && !z2 && !z3 && !z4) {
                return new com.yandex.passport.internal.ui.bouncer.model.e0(new y1(loginProperties, list));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (t2 t2Var : list) {
            if (t2Var instanceof r2) {
                arrayList.add(((r2) t2Var).a);
            }
        }
        return new com.yandex.passport.internal.ui.bouncer.model.d0(loginProperties, arrayList, g1Var.d, g1Var.e, g1Var.f, false, null, null, 192);
    }
}

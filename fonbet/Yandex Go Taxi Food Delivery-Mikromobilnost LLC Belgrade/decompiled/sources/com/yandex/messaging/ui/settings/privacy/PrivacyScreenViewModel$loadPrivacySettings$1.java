package com.yandex.messaging.ui.settings.privacy;

import com.yandex.messaging.core.net.entities.PrivacyBucket;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ds31;
import defpackage.e4f0;
import defpackage.iyj0;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w3f0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x3f0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loyj0;", "Lcom/yandex/messaging/core/net/entities/PrivacyBucket;", "Lzy11;", TarifficatorScenarioActivity.RESULT_KEY, "<anonymous>", "(Loyj0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.privacy.PrivacyScreenViewModel$loadPrivacySettings$1", f = "PrivacyScreenViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PrivacyScreenViewModel$loadPrivacySettings$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyScreenViewModel$loadPrivacySettings$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PrivacyScreenViewModel$loadPrivacySettings$1 privacyScreenViewModel$loadPrivacySettings$1 = new PrivacyScreenViewModel$loadPrivacySettings$1(this.this$0, continuation);
        privacyScreenViewModel$loadPrivacySettings$1.L$0 = obj;
        return privacyScreenViewModel$loadPrivacySettings$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PrivacyScreenViewModel$loadPrivacySettings$1 privacyScreenViewModel$loadPrivacySettings$1 = (PrivacyScreenViewModel$loadPrivacySettings$1) create((oyj0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        privacyScreenViewModel$loadPrivacySettings$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        e4f0 e4f0Var;
        ArrayList arrayList;
        Object value2;
        e4f0 e4f0Var2;
        ArrayList arrayList2;
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        oyj0 oyj0Var = (oyj0) this.L$0;
        a aVar = this.this$0;
        if (oyj0Var instanceof myj0) {
            PrivacyBucket privacyBucket = (PrivacyBucket) ((myj0) oyj0Var).a;
            r0 r0Var = aVar.y;
            do {
                value2 = r0Var.getValue();
                e4f0Var2 = (e4f0) value2;
                List<w3f0> list = e4f0Var2.a;
                arrayList2 = new ArrayList(tcc.n(list, 10));
                for (w3f0 w3f0Var : list) {
                    int i = x3f0.a[w3f0Var.a.ordinal()];
                    if (i == 1) {
                        num = privacyBucket.value.privateChats;
                    } else if (i == 2) {
                        num = privacyBucket.value.invites;
                    } else if (i == 3) {
                        num = privacyBucket.value.calls;
                    } else if (i == 4) {
                        num = privacyBucket.value.onlineStatus;
                    } else {
                        if (i != 5) {
                            w511.b();
                            return null;
                        }
                        num = privacyBucket.value.search;
                    }
                    arrayList2.add(w3f0.a(w3f0Var, num, false, 3));
                }
            } while (!r0Var.k(value2, e4f0.a(e4f0Var2, arrayList2, null, 2)));
        } else {
            if (!(oyj0Var instanceof iyj0)) {
                w511.b();
                return null;
            }
            aVar.getClass();
            tje.N(ds31.a(aVar), null, null, new PrivacyScreenViewModel$handlePrivacyLoadError$1(aVar, null), 3);
            r0 r0Var2 = aVar.y;
            do {
                value = r0Var2.getValue();
                e4f0Var = (e4f0) value;
                List list2 = e4f0Var.a;
                arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(w3f0.a((w3f0) it.next(), null, false, 7));
                }
            } while (!r0Var2.k(value, e4f0.a(e4f0Var, arrayList, null, 2)));
        }
        return zy11.a;
    }
}

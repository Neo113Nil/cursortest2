package com.ybsdk.feature.ui.stat.internal.domain;

import com.ybsdk.rconfig.configs.YbUiStatEventConfig;
import defpackage.cy51;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rrp0;
import defpackage.st11;
import defpackage.t2k0;
import defpackage.tse;
import defpackage.u1l;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.ui.stat.internal.domain.UiStatEventSender$flush$2", f = "UiStatEventSender.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class UiStatEventSender$flush$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStatEventSender$flush$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UiStatEventSender$flush$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UiStatEventSender$flush$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            synchronized (aVar.g) {
                if (aVar.e.isEmpty()) {
                    return zy11.a;
                }
                List J0 = kotlin.collections.a.J0(aVar.e);
                aVar.e.clear();
                com.ybsdk.feature.ui.stat.internal.data.a aVar2 = this.this$0.b;
                this.L$0 = J0;
                this.label = 1;
                a = aVar2.a(J0, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = J0;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$0;
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            aVar3.getClass();
            x4c.g("Sending ui stat events failed", null, kotlin.collections.b.i(new Pair("error", a2.getMessage()), new Pair("events", list)), Collections.singletonList(rrp0.b), 2);
            synchronized (aVar3.g) {
                try {
                    Iterator it = new u1l(2, list).iterator();
                    while (((t2k0) it).a.hasPrevious()) {
                        st11 st11Var = (st11) ((t2k0) it).a.previous();
                        if (aVar3.e.size() < ((YbUiStatEventConfig) aVar3.c.a.d(cy51.a).getData()).getMaxQueueSize()) {
                            aVar3.e.addFirst(st11Var);
                        } else {
                            x4c.g("Ui stat event queue overflow on retry, event dropped", null, gw00.e(new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, st11Var)), Collections.singletonList(rrp0.b), 2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zy11.a;
    }
}

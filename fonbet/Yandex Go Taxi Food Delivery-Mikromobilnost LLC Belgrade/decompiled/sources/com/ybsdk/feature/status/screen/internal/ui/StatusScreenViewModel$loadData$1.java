package com.ybsdk.feature.status.screen.internal.ui;

import com.ybsdk.feature.status.screen.internal.data.c;
import defpackage.ds31;
import defpackage.dsg;
import defpackage.h9u0;
import defpackage.jqp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.orp0;
import defpackage.pz40;
import defpackage.tje;
import defpackage.trp0;
import defpackage.tse;
import defpackage.v7l;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.status.screen.internal.ui.StatusScreenViewModel$loadData$1", f = "StatusScreenViewModel.kt", l = {42, 44}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StatusScreenViewModel$loadData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusScreenViewModel$loadData$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatusScreenViewModel$loadData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StatusScreenViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r14 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005d, code lost:
    
        if (r3 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        Object a;
        String X;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            this.label = 1;
            if (((h9u0) bVar.X()).d) {
                pz40 Y = bVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, h9u0.b((h9u0) value, null, null, null, 7)));
                tje.N(ds31.a(bVar), null, null, new StatusScreenViewModel$handleLoadingState$3(bVar, null), 3);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                b bVar2 = this.this$0;
                if (!(a instanceof Result.Failure)) {
                    v7l v7lVar = (v7l) a;
                    pz40 Y2 = bVar2.Y();
                    do {
                        r0Var4 = (r0) Y2;
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, h9u0.b((h9u0) value4, null, v7lVar, null, 13)));
                    bVar2.E.c();
                }
                b bVar3 = this.this$0;
                Throwable a2 = Result.a(a);
                if (a2 == null) {
                    return zy11Var;
                }
                List singletonList = Collections.singletonList(orp0.c);
                String target = bVar3.B.getTarget();
                boolean isEmpty = singletonList.isEmpty();
                if (isEmpty) {
                    X = null;
                } else {
                    if (isEmpty) {
                        w511.b();
                        return null;
                    }
                    X = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
                }
                trp0 trp0Var = trp0.a;
                trp0.e(new jqp0(a2, "Failed to load status screen for target", target, X));
                pz40 Y3 = bVar3.Y();
                do {
                    r0Var3 = (r0) Y3;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, h9u0.b((h9u0) value3, a2, null, null, 14)));
                bVar3.E.d();
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        pz40 Y4 = this.this$0.Y();
        do {
            r0Var2 = (r0) Y4;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, h9u0.b((h9u0) value2, null, null, null, 14)));
        b bVar4 = this.this$0;
        c cVar = bVar4.C;
        String target2 = bVar4.B.getTarget();
        Map<String, String> additionalParams = this.this$0.B.getAdditionalParams();
        this.label = 2;
        a = cVar.a(target2, additionalParams, this);
    }
}

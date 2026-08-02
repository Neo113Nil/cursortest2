package com.yandex.go.analytics.rythm.sender;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.analytics.rythm.sender.RythmSender$sendEvents$2", f = "RythmSender.kt", l = {36, 42, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RythmSender$sendEvents$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RythmSender$sendEvents$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RythmSender$sendEvents$2 rythmSender$sendEvents$2 = new RythmSender$sendEvents$2(this.this$0, continuation);
        rythmSender$sendEvents$2.L$0 = obj;
        return rythmSender$sendEvents$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RythmSender$sendEvents$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r10 != r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r8.f(r7, r2, r9) == r1) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0066 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:13:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                list = (List) obj;
                if (list.isEmpty()) {
                    return zy11.a;
                }
                a aVar = this.this$0;
                this.L$0 = tseVar;
                this.L$1 = list;
                this.label = 2;
                obj = a.a(aVar, list, this);
            } else if (i == 2) {
                list = (List) this.L$1;
                b.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    a aVar2 = this.this$0;
                    com.yandex.go.analytics.rythm.repository.a aVar3 = aVar2.d;
                    String str = aVar2.f;
                    int size = list.size();
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.Z$0 = booleanValue;
                    this.label = 3;
                }
                bvf0.t(tseVar);
                a aVar4 = this.this$0;
                com.yandex.go.analytics.rythm.repository.a aVar5 = aVar4.d;
                String str2 = aVar4.f;
                int i2 = aVar4.e.b;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.label = 1;
                obj = aVar5.d(str2, i2, this);
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        b.b(obj);
        bvf0.t(tseVar);
        a aVar42 = this.this$0;
        com.yandex.go.analytics.rythm.repository.a aVar52 = aVar42.d;
        String str22 = aVar42.f;
        int i22 = aVar42.e.b;
        this.L$0 = tseVar;
        this.L$1 = null;
        this.label = 1;
        obj = aVar52.d(str22, i22, this);
    }
}

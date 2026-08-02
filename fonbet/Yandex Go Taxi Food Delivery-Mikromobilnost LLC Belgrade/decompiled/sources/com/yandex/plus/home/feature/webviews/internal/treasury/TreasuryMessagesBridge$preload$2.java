package com.yandex.plus.home.feature.webviews.internal.treasury;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g050;
import defpackage.jqd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.treasury.TreasuryMessagesBridge$preload$2", f = "TreasuryMessagesBridge.kt", l = {166, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TreasuryMessagesBridge$preload$2 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreasuryMessagesBridge$preload$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TreasuryMessagesBridge$preload$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TreasuryMessagesBridge$preload$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        int i;
        ?? r7;
        c cVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.b.b(obj);
                cVar = this.this$0;
                aVar = cVar.g;
                this.L$0 = aVar;
                this.L$1 = cVar;
                this.I$0 = 0;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar2 = (c) this.L$1;
                r7 = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    r7 = r7;
                    cVar2.e = (jqd0) obj;
                    skd0.b(PlusLogTag.TREASURY, "preload() preloaded");
                    aVar = r7;
                    aVar.d(null);
                    return zy11.a;
                } catch (Throwable th) {
                    th = th;
                    r7.d(null);
                    throw th;
                }
            }
            int i3 = this.I$0;
            c cVar3 = (c) this.L$1;
            ?? r6 = (g050) this.L$0;
            kotlin.b.b(obj);
            cVar = cVar3;
            i = i3;
            aVar = r6;
            if (cVar.e == null) {
                this.L$0 = aVar;
                this.L$1 = cVar;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 2;
                Object a = c.a(cVar, this);
                if (a != coroutineSingletons) {
                    cVar2 = cVar;
                    obj = a;
                    r7 = aVar;
                    cVar2.e = (jqd0) obj;
                    skd0.b(PlusLogTag.TREASURY, "preload() preloaded");
                    aVar = r7;
                }
                return coroutineSingletons;
            }
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th2) {
            th = th2;
            r7 = aVar;
            r7.d(null);
            throw th;
        }
    }
}

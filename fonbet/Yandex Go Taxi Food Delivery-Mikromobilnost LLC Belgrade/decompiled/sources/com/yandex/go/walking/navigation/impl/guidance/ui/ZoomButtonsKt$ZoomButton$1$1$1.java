package com.yandex.go.walking.navigation.impl.guidance.ui;

import androidx.compose.foundation.gestures.s;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wu60;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/s;", "Lwu60;", "it", "Lzy11;", "<anonymous>", "(Landroidx/compose/foundation/gestures/s;Lwu60;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.ui.ZoomButtonsKt$ZoomButton$1$1$1", f = "ZoomButtons.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ZoomButtonsKt$ZoomButton$1$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ tse $coroutineScope;
    final /* synthetic */ sls $onClick;
    final /* synthetic */ sls $onHold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomButtonsKt$ZoomButton$1$1$1(tse tseVar, sls slsVar, sls slsVar2, Continuation continuation) {
        super(3, continuation);
        this.$coroutineScope = tseVar;
        this.$onClick = slsVar;
        this.$onHold = slsVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((wu60) obj2).a;
        ZoomButtonsKt$ZoomButton$1$1$1 zoomButtonsKt$ZoomButton$1$1$1 = new ZoomButtonsKt$ZoomButton$1$1$1(this.$coroutineScope, this.$onClick, this.$onHold, (Continuation) obj3);
        zoomButtonsKt$ZoomButton$1$1$1.L$0 = (s) obj;
        return zoomButtonsKt$ZoomButton$1$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        l8x l8xVar;
        s sVar = (s) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            pzt0 N = tje.N(this.$coroutineScope, null, null, new ZoomButtonsKt$ZoomButton$1$1$1$job$1(ref$BooleanRef2, this.$onHold, null), 3);
            this.L$0 = null;
            this.L$1 = ref$BooleanRef2;
            this.L$2 = N;
            this.label = 1;
            Object e = sVar.e(this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$BooleanRef = ref$BooleanRef2;
            obj = e;
            l8xVar = N;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l8xVar = (l8x) this.L$2;
            ref$BooleanRef = (Ref$BooleanRef) this.L$1;
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        l8xVar.a(null);
        if (!ref$BooleanRef.element && booleanValue) {
            this.$onClick.invoke();
        }
        return zy11.a;
    }
}

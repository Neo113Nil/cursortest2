package com.yandex.go.superapp.discovery.map.impl.ui.search;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.transport.masstransit.LineInfo;
import com.yandex.mapkit.transport.masstransit.ThreadInfo;
import defpackage.en30;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.SuperAppDiscoveryMapSearchPresenter$updateRouteBoundingBox$1", f = "SuperAppDiscoveryMapSearchPresenter.kt", l = {164}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppDiscoveryMapSearchPresenter$updateRouteBoundingBox$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $lineId;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchPresenter$updateRouteBoundingBox$1(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$lineId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapSearchPresenter$updateRouteBoundingBox$1(this.this$0, this.$lineId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapSearchPresenter$updateRouteBoundingBox$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<ThreadInfo> threads;
        ThreadInfo threadInfo;
        BoundingBox boundingBox;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            en30 en30Var = this.this$0.G;
            String str = this.$lineId;
            this.label = 1;
            obj = ((ru.yandex.taxi.masstransit.datasource.line.a) en30Var).b(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        LineInfo lineInfo = (LineInfo) obj;
        if (lineInfo != null && (threads = lineInfo.getThreads()) != null && (threadInfo = (ThreadInfo) kotlin.collections.a.R(threads)) != null && (boundingBox = threadInfo.getBoundingBox()) != null) {
            ((gh00) this.this$0.H).A(boundingBox, null);
        }
        return zy11.a;
    }
}

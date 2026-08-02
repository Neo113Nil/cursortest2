package androidx.compose.ui.platform;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pey;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {379}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<p> $motionDurationScaleImpl;
    final /* synthetic */ androidx.compose.runtime.j $recomposer;
    final /* synthetic */ u $self;
    final /* synthetic */ pey $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref$ObjectRef ref$ObjectRef, androidx.compose.runtime.j jVar, pey peyVar, u uVar, Continuation continuation) {
        super(2, continuation);
        this.$motionDurationScaleImpl = ref$ObjectRef;
        this.$recomposer = jVar;
        this.$source = peyVar;
        this.$self = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$motionDurationScaleImpl, this.$recomposer, this.$source, this.$self, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, zy11] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                p pVar = this.$motionDurationScaleImpl.element;
                if (pVar != null) {
                    pVar.b = bvf0.a(this.$recomposer.x);
                }
                androidx.compose.runtime.j jVar = this.$recomposer;
                this.label = 1;
                if (jVar.R(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.$source.getLifecycle().d(this.$self);
            this = zy11.a;
            return this;
        } catch (Throwable th) {
            this.$source.getLifecycle().d(this.$self);
            throw th;
        }
    }
}

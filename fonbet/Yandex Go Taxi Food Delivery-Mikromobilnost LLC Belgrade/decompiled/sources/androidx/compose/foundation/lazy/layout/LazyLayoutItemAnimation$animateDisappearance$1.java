package androidx.compose.foundation.lazy.layout;

import defpackage.i5y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qar;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.ui.graphics.layer.a $layer;
    final /* synthetic */ qar $spec;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(b bVar, qar qarVar, androidx.compose.ui.graphics.layer.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$spec = qarVar;
        this.$layer = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.this$0, this.$spec, this.$layer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LazyLayoutItemAnimation$animateDisappearance$1 lazyLayoutItemAnimation$animateDisappearance$1;
        androidx.compose.animation.core.a aVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            try {
                aVar = this.this$0.p;
            } catch (Throwable th2) {
                th = th2;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                th = th;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.j.setValue(Boolean.FALSE);
                throw th;
            }
            try {
                Float f = new Float(0.0f);
                qar qarVar = this.$spec;
                i5y i5yVar = new i5y(this.$layer, this.this$0, 1);
                this.label = 1;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                try {
                    if (androidx.compose.animation.core.a.d(aVar, f, qarVar, null, i5yVar, lazyLayoutItemAnimation$animateDisappearance$1, 4) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    lazyLayoutItemAnimation$animateDisappearance$1.this$0.j.setValue(Boolean.FALSE);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                th = th;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.j.setValue(Boolean.FALSE);
                throw th;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                kotlin.b.b(obj);
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
            } catch (Throwable th5) {
                th = th5;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.j.setValue(Boolean.FALSE);
                throw th;
            }
        }
        try {
            try {
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.k.setValue(Boolean.TRUE);
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.j.setValue(Boolean.FALSE);
                return zy11.a;
            } catch (Throwable th6) {
                th = th6;
                th = th;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.j.setValue(Boolean.FALSE);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}

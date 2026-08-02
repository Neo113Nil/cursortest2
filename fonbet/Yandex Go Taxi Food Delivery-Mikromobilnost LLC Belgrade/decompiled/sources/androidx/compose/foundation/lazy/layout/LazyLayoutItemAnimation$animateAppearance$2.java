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
@mvg(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.ui.graphics.layer.a $layer;
    final /* synthetic */ boolean $shouldResetValue;
    final /* synthetic */ qar $spec;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z, b bVar, qar qarVar, androidx.compose.ui.graphics.layer.a aVar, Continuation continuation) {
        super(2, continuation);
        this.$shouldResetValue = z;
        this.this$0 = bVar;
        this.$spec = qarVar;
        this.$layer = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:2)|(3:(1:(1:(5:6|7|8|9|10)(2:17|18))(1:19))(4:35|36|37|(1:39))|25|26)|20|21|22|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r8 = r10;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0037, code lost:
    
        if (r11.f(r1, r10) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        LazyLayoutItemAnimation$animateAppearance$2 lazyLayoutItemAnimation$animateAppearance$2;
        androidx.compose.animation.core.a aVar;
        Float f;
        qar qarVar;
        i5y i5yVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th2) {
            th = th2;
            lazyLayoutItemAnimation$animateAppearance$2 = this;
        }
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                try {
                    if (this.$shouldResetValue) {
                        androidx.compose.animation.core.a aVar2 = this.this$0.p;
                        Float f2 = new Float(0.0f);
                        this.label = 1;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    lazyLayoutItemAnimation$animateAppearance$2 = this;
                    th = th;
                    lazyLayoutItemAnimation$animateAppearance$2.this$0.i.setValue(Boolean.FALSE);
                    throw th;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    lazyLayoutItemAnimation$animateAppearance$2 = this;
                    lazyLayoutItemAnimation$animateAppearance$2.this$0.i.setValue(Boolean.FALSE);
                    return zy11.a;
                }
                kotlin.b.b(obj);
            }
            obj = androidx.compose.animation.core.a.d(aVar, f, qarVar, null, i5yVar, lazyLayoutItemAnimation$animateAppearance$2, 4);
        } catch (Throwable th4) {
            th = th4;
            th = th;
            lazyLayoutItemAnimation$animateAppearance$2.this$0.i.setValue(Boolean.FALSE);
            throw th;
        }
        aVar = this.this$0.p;
        f = new Float(1.0f);
        qarVar = this.$spec;
        i5yVar = new i5y(this.$layer, this.this$0, 0);
        this.label = 2;
        lazyLayoutItemAnimation$animateAppearance$2 = this;
    }
}

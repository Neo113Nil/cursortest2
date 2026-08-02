package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.fse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ fse $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(fse fseVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$currentContext = fseVar;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, continuation);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ForEachGestureKt$awaitEachGesture$2) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r8 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.f, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:8:0x0025). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0071 -> B:8:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        androidx.compose.ui.input.pointer.f fVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        androidx.compose.ui.input.pointer.f fVar3 = this.label;
        try {
        } catch (CancellationException e) {
            e = e;
            if (kotlinx.coroutines.a.p(this.$currentContext)) {
            }
        }
        if (fVar3 == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            if (kotlinx.coroutines.a.p(this.$currentContext)) {
            }
        } else {
            if (fVar3 != 1) {
                if (fVar3 == 2) {
                    androidx.compose.ui.input.pointer.f fVar4 = (androidx.compose.ui.input.pointer.f) this.L$0;
                    kotlin.b.b(obj);
                    fVar2 = fVar4;
                } else {
                    if (fVar3 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    androidx.compose.ui.input.pointer.f fVar5 = (androidx.compose.ui.input.pointer.f) this.L$0;
                    kotlin.b.b(obj);
                    fVar2 = fVar5;
                }
                fVar = fVar2;
                if (kotlinx.coroutines.a.p(this.$currentContext)) {
                    return zy11.a;
                }
                try {
                } catch (CancellationException e2) {
                    fVar3 = fVar;
                    e = e2;
                    if (kotlinx.coroutines.a.p(this.$currentContext)) {
                        throw e;
                    }
                    this.L$0 = fVar3;
                    this.label = 3;
                    Object k = c.k(fVar3, PointerEventPass.Final, this);
                    fVar2 = fVar3;
                }
                wls wlsVar = this.$block;
                this.L$0 = fVar;
                this.label = 1;
                if (wlsVar.invoke(fVar, this) != coroutineSingletons) {
                    fVar3 = fVar;
                    this.L$0 = fVar3;
                    this.label = 2;
                    Object k2 = c.k(fVar3, PointerEventPass.Final, this);
                    fVar2 = fVar3;
                }
                return coroutineSingletons;
            }
            androidx.compose.ui.input.pointer.f fVar6 = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
            fVar3 = fVar6;
            this.L$0 = fVar3;
            this.label = 2;
            Object k22 = c.k(fVar3, PointerEventPass.Final, this);
            fVar2 = fVar3;
        }
    }
}

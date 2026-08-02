package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zls;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class RightClickGesturesKt$onRightClickDown$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ tls $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightClickGesturesKt$onRightClickDown$2(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$onDown = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RightClickGesturesKt$onRightClickDown$2 rightClickGesturesKt$onRightClickDown$2 = new RightClickGesturesKt$onRightClickDown$2(this.$onDown, continuation);
        rightClickGesturesKt$onRightClickDown$2.L$0 = obj;
        return rightClickGesturesKt$onRightClickDown$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RightClickGesturesKt$onRightClickDown$2) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r8 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            fVar = (f) this.L$0;
            this.L$0 = fVar;
            this.label = 1;
            obj = a.a(fVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                zvd0 zvd0Var = (zvd0) obj;
                if (zvd0Var != null) {
                    zvd0Var.a();
                }
                return zy11.a;
            }
            fVar = (f) this.L$0;
            b.b(obj);
        }
        zvd0 zvd0Var2 = (zvd0) obj;
        zvd0Var2.a();
        this.$onDown.invoke(new wu60(zvd0Var2.c));
        this.L$0 = null;
        this.label = 2;
        zls zlsVar = z.a;
        obj = z.k(fVar, PointerEventPass.Main, this);
    }
}

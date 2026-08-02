package androidx.compose.foundation;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ey91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {788, 792}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 extends RestrictedSuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.this$0, continuation);
        androidEdgeEffectOverscrollEffect$pointerInputNode$1$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$pointerInputNode$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0033, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004a -> B:6:0x004d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            this.L$0 = fVar;
            this.label = 1;
            obj = z.b(fVar, null, this, 2);
        } else if (i == 1) {
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
            List list = ((tvd0) obj).a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj3 = list.get(i3);
                if (((zvd0) obj3).d) {
                    arrayList.add(obj3);
                }
            }
            c cVar = this.this$0;
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                if (ey91.e(((zvd0) obj2).a, cVar.h)) {
                    break;
                }
                i2++;
            }
            zvd0 zvd0Var = (zvd0) obj2;
            if (zvd0Var == null) {
                zvd0Var = (zvd0) kotlin.collections.a.R(arrayList);
            }
            if (zvd0Var != null) {
                c cVar2 = this.this$0;
                cVar2.h = zvd0Var.a;
                cVar2.b = zvd0Var.c;
            }
            if (arrayList.isEmpty()) {
                this.this$0.h = -1L;
                return zy11.a;
            }
            this.L$0 = fVar;
            this.label = 2;
            obj = fVar.a(PointerEventPass.Main, this);
        }
        zvd0 zvd0Var2 = (zvd0) obj;
        c cVar3 = this.this$0;
        cVar3.h = zvd0Var2.a;
        cVar3.b = zvd0Var2.c;
        this.L$0 = fVar;
        this.label = 2;
        obj = fVar.a(PointerEventPass.Main, this);
    }
}

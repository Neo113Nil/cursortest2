package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.bmz;
import defpackage.cmz;
import defpackage.emz;
import defpackage.kx91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {412, 435}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TapGestureDetectorKt$waitForLongPress$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ PointerEventPass $pass;
    final /* synthetic */ Ref$ObjectRef<emz> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.$pass = pointerEventPass;
        this.$result = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.$pass, this.$result, continuation);
        tapGestureDetectorKt$waitForLongPress$2.L$0 = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$waitForLongPress$2) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b8, code lost:
    
        r14.$result.element = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r15.c != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r14.$result.element = defpackage.dmz.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r15 = r6.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r7 >= r15) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r8 = (defpackage.zvd0) r6.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r8.j() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (defpackage.kx91.f(r8, r1.y.C, r1.e()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        r14.$result.element = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        r15 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r14.L$0 = r1;
        r14.label = 2;
        r15 = r1.a(r15, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        if (r15 != r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v12, types: [T, dmz] */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, cmz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, bmz] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009b -> B:6:0x009e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        androidx.compose.ui.input.pointer.f fVar2;
        int size;
        int i;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        ?? r2 = bmz.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            PointerEventPass pointerEventPass = this.$pass;
            this.L$0 = fVar;
            this.label = 1;
            a = fVar.a(pointerEventPass, this);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            fVar2 = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
            tvd0 tvd0Var = (tvd0) obj;
            List list = tvd0Var.a;
            size = list.size();
            i = 0;
            while (true) {
                if (i >= size) {
                }
                i++;
            }
            return zy11.a;
        }
        if (i2 != 2) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fVar2 = (androidx.compose.ui.input.pointer.f) this.L$0;
        kotlin.b.b(obj);
        List list2 = ((tvd0) obj).a;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((zvd0) list2.get(i3)).j()) {
                break;
            }
        }
        fVar = fVar2;
        PointerEventPass pointerEventPass2 = this.$pass;
        this.L$0 = fVar;
        this.label = 1;
        a = fVar.a(pointerEventPass2, this);
        if (a != coroutineSingletons) {
            fVar2 = fVar;
            obj = a;
            tvd0 tvd0Var2 = (tvd0) obj;
            List list3 = tvd0Var2.a;
            size = list3.size();
            i = 0;
            while (true) {
                if (i >= size) {
                    this.$result.element = new cmz((zvd0) list3.get(0));
                    break;
                }
                if (!kx91.c((zvd0) list3.get(i))) {
                    break;
                }
                i++;
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}

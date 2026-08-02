package androidx.compose.foundation.text.selection;

import defpackage.f2c;
import defpackage.fb30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.okq0;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.xp31;
import defpackage.yly0;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", l = {111, 119, 122, HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SelectionGesturesKt$awaitSelectionGestures$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ f2c $clicksCounter;
    final /* synthetic */ fb30 $mouseSelectionObserver;
    final /* synthetic */ yly0 $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$awaitSelectionGestures$2(f2c f2cVar, fb30 fb30Var, yly0 yly0Var, Continuation continuation) {
        super(2, continuation);
        this.$clicksCounter = f2cVar;
        this.$mouseSelectionObserver = fb30Var;
        this.$textDragObserver = yly0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionGesturesKt$awaitSelectionGestures$2 selectionGesturesKt$awaitSelectionGestures$2 = new SelectionGesturesKt$awaitSelectionGestures$2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, continuation);
        selectionGesturesKt$awaitSelectionGestures$2.L$0 = obj;
        return selectionGesturesKt$awaitSelectionGestures$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$awaitSelectionGestures$2) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (androidx.compose.foundation.text.selection.d.d(r2, r3, r4, r8, r18) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (androidx.compose.foundation.text.selection.d.e(r2, r4, r8, r18) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if (androidx.compose.foundation.text.selection.d.b(r2, r4, r8, r3, r18) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003a, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        Object a;
        boolean a2;
        int size;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            this.L$0 = fVar;
            this.label = 1;
            a = d.a(fVar, this);
        } else {
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
            a = obj;
        }
        tvd0 tvd0Var = (tvd0) a;
        f2c f2cVar = this.$clicksCounter;
        xp31 xp31Var = f2cVar.a;
        zvd0 zvd0Var = f2cVar.c;
        zvd0 zvd0Var2 = (zvd0) tvd0Var.a.get(0);
        if (zvd0Var != null && zvd0Var2.b - zvd0Var.b < xp31Var.e()) {
            if (wu60.d(wu60.e(zvd0Var.c, zvd0Var2.c)) < androidx.compose.foundation.gestures.i.n(xp31Var, zvd0Var.i)) {
                f2cVar.b++;
                f2cVar.c = zvd0Var2;
                a2 = okq0.a(tvd0Var);
                if (a2 && (tvd0Var.d & 33) != 0) {
                    List list = tvd0Var.a;
                    size = list.size();
                    for (i = 0; i < size; i++) {
                        if (!((zvd0) list.get(i)).j()) {
                        }
                    }
                    fb30 fb30Var = this.$mouseSelectionObserver;
                    f2c f2cVar2 = this.$clicksCounter;
                    this.L$0 = null;
                    this.label = 2;
                }
                if (!a2) {
                    int i3 = this.$clicksCounter.b;
                    yly0 yly0Var = this.$textDragObserver;
                    if (i3 == 1) {
                        this.L$0 = null;
                        this.label = 3;
                    } else {
                        this.L$0 = null;
                        this.label = 4;
                    }
                }
                return zy11.a;
            }
        }
        f2cVar.b = 1;
        f2cVar.c = zvd0Var2;
        a2 = okq0.a(tvd0Var);
        if (a2) {
            List list2 = tvd0Var.a;
            size = list2.size();
            while (i < size) {
            }
            fb30 fb30Var2 = this.$mouseSelectionObserver;
            f2c f2cVar22 = this.$clicksCounter;
            this.L$0 = null;
            this.label = 2;
        }
        if (!a2) {
        }
        return zy11.a;
    }
}

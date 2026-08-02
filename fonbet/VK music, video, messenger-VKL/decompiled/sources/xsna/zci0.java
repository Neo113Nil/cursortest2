package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SelectionGestures.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", l = {111, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class zci0 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ ykc $clicksCounter;
    final /* synthetic */ ub30 $mouseSelectionObserver;
    final /* synthetic */ zdo0 $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zci0(ykc ykcVar, ub30 ub30Var, zdo0 zdo0Var, spj<? super zci0> spjVar) {
        super(2, spjVar);
        this.$clicksCounter = ykcVar;
        this.$mouseSelectionObserver = ub30Var;
        this.$textDragObserver = zdo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zci0 zci0Var = new zci0(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, spjVar);
        zci0Var.L$0 = obj;
        return zci0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((zci0) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (xsna.fdi0.c(r2, r3, r4, r7, r17) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (xsna.fdi0.d(r2, r3, r7, r17) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if (xsna.fdi0.b(r2, r4, r7, r5, r17) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003b, code lost:
    
        if (r7 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        Object a;
        boolean a2;
        int size;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            eu5Var = (eu5) this.L$0;
            this.L$0 = eu5Var;
            this.label = 1;
            a = fdi0.a(eu5Var, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            eu5Var = (eu5) this.L$0;
            kotlin.a.a(obj);
            a = obj;
        }
        plb0 plb0Var = (plb0) a;
        ykc ykcVar = this.$clicksCounter;
        rut0 rut0Var = ykcVar.a;
        xlb0 xlb0Var = ykcVar.c;
        xlb0 xlb0Var2 = plb0Var.a.get(0);
        if (xlb0Var != null && xlb0Var2.b - xlb0Var.b < rut0Var.b()) {
            if (ov70.d(ov70.e(xlb0Var.c, xlb0Var2.c)) < lgo.k(rut0Var, xlb0Var.i)) {
                ykcVar.b++;
                ykcVar.c = xlb0Var2;
                a2 = gdi0.a(plb0Var);
                if (a2 && (plb0Var.d & 33) != 0) {
                    List<xlb0> list = plb0Var.a;
                    size = list.size();
                    for (i = 0; i < size; i++) {
                        if (!list.get(i).c()) {
                        }
                    }
                    ub30 ub30Var = this.$mouseSelectionObserver;
                    ykc ykcVar2 = this.$clicksCounter;
                    this.L$0 = null;
                    this.label = 2;
                }
                if (!a2) {
                    int i3 = this.$clicksCounter.b;
                    if (i3 == 1) {
                        zdo0 zdo0Var = this.$textDragObserver;
                        this.L$0 = null;
                        this.label = 3;
                    } else {
                        zdo0 zdo0Var2 = this.$textDragObserver;
                        this.L$0 = null;
                        this.label = 4;
                    }
                }
                return s3q0.a;
            }
        }
        ykcVar.b = 1;
        ykcVar.c = xlb0Var2;
        a2 = gdi0.a(plb0Var);
        if (a2) {
            List<xlb0> list2 = plb0Var.a;
            size = list2.size();
            while (i < size) {
            }
            ub30 ub30Var2 = this.$mouseSelectionObserver;
            ykc ykcVar22 = this.$clicksCounter;
            this.L$0 = null;
            this.label = 2;
        }
        if (!a2) {
        }
        return s3q0.a;
    }
}

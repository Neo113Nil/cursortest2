package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.k500;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {412, 435}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class s3o0 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ PointerEventPass $pass;
    final /* synthetic */ Ref$ObjectRef<k500> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3o0(PointerEventPass pointerEventPass, Ref$ObjectRef<k500> ref$ObjectRef, spj<? super s3o0> spjVar) {
        super(2, spjVar);
        this.$pass = pointerEventPass;
        this.$result = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        s3o0 s3o0Var = new s3o0(this.$pass, this.$result, spjVar);
        s3o0Var.L$0 = obj;
        return s3o0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((s3o0) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b9, code lost:
    
        r13.$result.element = xsna.k500.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r14.c != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r13.$result.element = xsna.k500.c.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r14 = r5.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r6 >= r14) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r7 = r5.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r7.c() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (xsna.fdi.z(r7, r1.a(), r1.A1()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        r13.$result.element = xsna.k500.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        r14 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r13.L$0 = r1;
        r13.label = 2;
        r14 = r1.I1(r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        if (r14 != r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, xsna.k500$b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, xsna.k500$a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, xsna.k500$c] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, xsna.k500$a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009c -> B:6:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        eu5 eu5Var2;
        int size;
        int i;
        Object I1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            eu5Var = (eu5) this.L$0;
            PointerEventPass pointerEventPass = this.$pass;
            this.L$0 = eu5Var;
            this.label = 1;
            I1 = eu5Var.I1(pointerEventPass, this);
            if (I1 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            eu5Var2 = (eu5) this.L$0;
            kotlin.a.a(obj);
            plb0 plb0Var = (plb0) obj;
            List<xlb0> list = plb0Var.a;
            size = list.size();
            i = 0;
            while (true) {
                if (i >= size) {
                }
                i++;
            }
            return s3q0.a;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eu5Var2 = (eu5) this.L$0;
        kotlin.a.a(obj);
        List<xlb0> list2 = ((plb0) obj).a;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (list2.get(i3).c()) {
                break;
            }
        }
        eu5Var = eu5Var2;
        PointerEventPass pointerEventPass2 = this.$pass;
        this.L$0 = eu5Var;
        this.label = 1;
        I1 = eu5Var.I1(pointerEventPass2, this);
        if (I1 != coroutineSingletons) {
            eu5Var2 = eu5Var;
            obj = I1;
            plb0 plb0Var2 = (plb0) obj;
            List<xlb0> list3 = plb0Var2.a;
            size = list3.size();
            i = 0;
            while (true) {
                if (i >= size) {
                    this.$result.element = new k500.b(list3.get(0));
                    break;
                }
                if (!fdi.n(list3.get(i))) {
                    break;
                }
                i++;
            }
            return s3q0.a;
        }
        return coroutineSingletons;
    }
}

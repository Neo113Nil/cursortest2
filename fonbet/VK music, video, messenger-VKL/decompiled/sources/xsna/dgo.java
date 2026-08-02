package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: DragGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {1079, 1101}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class dgo extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<xlb0> $currentDown;
    final /* synthetic */ Ref$BooleanRef $deepPress;
    final /* synthetic */ Ref$ObjectRef<xlb0> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgo(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<xlb0> ref$ObjectRef, Ref$ObjectRef<xlb0> ref$ObjectRef2, spj<? super dgo> spjVar) {
        super(2, spjVar);
        this.$deepPress = ref$BooleanRef;
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dgo dgoVar = new dgo(this.$deepPress, this.$currentDown, this.$longPress, spjVar);
        dgoVar.L$0 = obj;
        return dgoVar;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((dgo) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db A[EDGE_INSN: B:70:0x00db->B:13:0x00db BREAK  A[LOOP:0: B:7:0x00c8->B:10:0x00d8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca  */
    /* JADX WARN: Type inference failed for: r10v13, types: [T, xsna.xlb0] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b9 -> B:6:0x00bc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        int i;
        Object obj2;
        int i2;
        Object I1;
        eu5 eu5Var2;
        plb0 plb0Var;
        int size;
        int i3;
        boolean j;
        T t;
        xlb0 xlb0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        xlb0 xlb0Var2 = null;
        int i5 = 2;
        int i6 = 1;
        if (i4 == 0) {
            kotlin.a.a(obj);
            eu5Var = (eu5) this.L$0;
            i = 0;
            if (i == 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.I$0;
                eu5Var = (eu5) this.L$0;
                kotlin.a.a(obj);
                obj2 = obj;
                plb0 plb0Var2 = (plb0) obj2;
                List<xlb0> list = plb0Var2.a;
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        i = i6;
                        break;
                    }
                    if (!fdi.o(list.get(i7))) {
                        break;
                    }
                    i7++;
                }
                List<xlb0> list2 = plb0Var2.a;
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    xlb0 xlb0Var3 = list2.get(i8);
                    if (xlb0Var3.c() || fdi.z(xlb0Var3, eu5Var.a(), eu5Var.A1())) {
                        break;
                    }
                }
                if (plb0Var2.c == i5) {
                    i2 = 1;
                    this.$deepPress.element = true;
                    i = 1;
                } else {
                    i2 = 1;
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                this.L$0 = eu5Var;
                this.L$1 = plb0Var2;
                this.I$0 = i;
                this.label = i5;
                I1 = eu5Var.I1(pointerEventPass, this);
                if (I1 != coroutineSingletons) {
                    eu5Var2 = eu5Var;
                    plb0Var = plb0Var2;
                    List<xlb0> list3 = ((plb0) I1).a;
                    size = list3.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                        }
                        i3++;
                    }
                    j = lgo.j(plb0Var, this.$currentDown.element.a);
                    List<xlb0> list4 = plb0Var.a;
                    if (j) {
                    }
                    eu5Var = eu5Var2;
                    xlb0Var2 = null;
                    i5 = 2;
                    i6 = 1;
                    if (i == 0) {
                    }
                }
                return coroutineSingletons;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            plb0Var = (plb0) this.L$1;
            eu5Var2 = (eu5) this.L$0;
            kotlin.a.a(obj);
            i2 = 1;
            I1 = obj;
            List<xlb0> list32 = ((plb0) I1).a;
            size = list32.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (list32.get(i3).c()) {
                    i = i2;
                    break;
                }
                i3++;
            }
            j = lgo.j(plb0Var, this.$currentDown.element.a);
            List<xlb0> list42 = plb0Var.a;
            if (j) {
                Ref$ObjectRef<xlb0> ref$ObjectRef = this.$longPress;
                Ref$ObjectRef<xlb0> ref$ObjectRef2 = this.$currentDown;
                int size4 = list42.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        t = 0;
                        break;
                    }
                    t = list42.get(i9);
                    if (wlb0.g(((xlb0) t).a, ref$ObjectRef2.element.a)) {
                        break;
                    }
                    i9++;
                }
                ref$ObjectRef.element = t;
            } else {
                int size5 = list42.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        xlb0Var = xlb0Var2;
                        break;
                    }
                    xlb0Var = list42.get(i10);
                    if (xlb0Var.d) {
                        break;
                    }
                    i10++;
                }
                xlb0 xlb0Var4 = xlb0Var;
                if (xlb0Var4 != 0) {
                    this.$currentDown.element = xlb0Var4;
                    this.$longPress.element = xlb0Var4;
                } else {
                    i = i2;
                    i6 = i;
                    eu5Var = eu5Var2;
                    if (i == 0) {
                        return s3q0.a;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                    this.L$0 = eu5Var;
                    this.L$1 = xlb0Var2;
                    this.I$0 = i;
                    this.label = i6;
                    obj2 = eu5Var.I1(pointerEventPass2, this);
                }
            }
            eu5Var = eu5Var2;
            xlb0Var2 = null;
            i5 = 2;
            i6 = 1;
            if (i == 0) {
            }
        }
    }
}

package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: ForEachGesture.kt */
/* loaded from: classes11.dex */
public final class d7s {

    /* compiled from: ForEachGesture.kt */
    @b6l(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend", v = 1)
    public static final class a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
        final /* synthetic */ wzs<eu5, spj<? super s3q0>, Object> $block;
        final /* synthetic */ kotlin.coroutines.d $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.coroutines.d dVar, wzs<? super eu5, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$currentContext = dVar;
            this.$block = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$currentContext, this.$block, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
            return ((a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            if (r8 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
        
            if (r8 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xsna.eu5] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xsna.eu5] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:8:0x0026). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0072 -> B:8:0x0026). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            eu5 eu5Var;
            eu5 eu5Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
            } catch (CancellationException e) {
                e = e;
                if (iyx.h(this.$currentContext)) {
                }
            }
            if (r1 == 0) {
                kotlin.a.a(obj);
                eu5Var = (eu5) this.L$0;
                if (iyx.h(this.$currentContext)) {
                }
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        eu5 eu5Var3 = (eu5) this.L$0;
                        kotlin.a.a(obj);
                        eu5Var2 = eu5Var3;
                    } else {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eu5 eu5Var4 = (eu5) this.L$0;
                        kotlin.a.a(obj);
                        eu5Var2 = eu5Var4;
                    }
                    eu5Var = eu5Var2;
                    if (iyx.h(this.$currentContext)) {
                        return s3q0.a;
                    }
                    try {
                    } catch (CancellationException e2) {
                        r1 = eu5Var;
                        e = e2;
                        if (iyx.h(this.$currentContext)) {
                            throw e;
                        }
                        this.L$0 = r1;
                        this.label = 3;
                        Object b = d7s.b(r1, PointerEventPass.Final, this);
                        eu5Var2 = r1;
                    }
                    wzs<eu5, spj<? super s3q0>, Object> wzsVar = this.$block;
                    this.L$0 = eu5Var;
                    this.label = 1;
                    if (wzsVar.invoke(eu5Var, this) != coroutineSingletons) {
                        r1 = eu5Var;
                        this.L$0 = r1;
                        this.label = 2;
                        Object b2 = d7s.b(r1, PointerEventPass.Final, this);
                        eu5Var2 = r1;
                    }
                    return coroutineSingletons;
                }
                eu5 eu5Var5 = (eu5) this.L$0;
                kotlin.a.a(obj);
                r1 = eu5Var5;
                this.L$0 = r1;
                this.label = 2;
                Object b22 = d7s.b(r1, PointerEventPass.Final, this);
                eu5Var2 = r1;
            }
        }
    }

    /* compiled from: ForEachGesture.kt */
    @b6l(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {48, 51, 56}, m = "forEachGesture", v = 1)
    public static final class b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d7s.d(null, null, this);
        }
    }

    public static final boolean a(eu5 eu5Var) {
        List<xlb0> list = eu5Var.z0().a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (list.get(i).d) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (a(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:10:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(eu5 eu5Var, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        c7s c7sVar;
        int i;
        if (baseContinuationImpl instanceof c7s) {
            c7sVar = (c7s) baseContinuationImpl;
            int i2 = c7sVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7sVar.label = i2 - Integer.MIN_VALUE;
                Object obj = c7sVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c7sVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    PointerEventPass pointerEventPass2 = (PointerEventPass) c7sVar.L$1;
                    eu5 eu5Var2 = (eu5) c7sVar.L$0;
                    kotlin.a.a(obj);
                    pointerEventPass = pointerEventPass2;
                    eu5Var = eu5Var2;
                    List<xlb0> list = ((plb0) obj).a;
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        if (list.get(i3).d) {
                            c7sVar.L$0 = eu5Var;
                            c7sVar.L$1 = pointerEventPass;
                            c7sVar.label = 1;
                            obj = eu5Var.I1(pointerEventPass, c7sVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            List<xlb0> list2 = ((plb0) obj).a;
                            int size2 = list2.size();
                            int i32 = 0;
                            while (i32 < size2) {
                            }
                        } else {
                            i32++;
                        }
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
        }
        c7sVar = new c7s(baseContinuationImpl);
        Object obj2 = c7sVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c7sVar.label;
        if (i == 0) {
        }
    }

    public static final Object c(dmb0 dmb0Var, wzs<? super eu5, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        Object Z0 = dmb0Var.Z0(new a(spjVar.getContext(), wzsVar, null), spjVar);
        return Z0 == CoroutineSingletons.COROUTINE_SUSPENDED ? Z0 : s3q0.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:42|43))(2:44|45)|13|14|(4:19|20|(6:22|23|(1:27)(1:25)|13|14|(2:16|17)(0))|30)(0))(7:46|47|23|(0)(0)|13|14|(0)(0)))(3:48|14|(0)(0))))|50|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (xsna.s3q0.a == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (xsna.s3q0.a == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0051, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0054, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a A[Catch: CancellationException -> 0x0054, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0054, blocks: (B:23:0x0084, B:27:0x009a, B:45:0x004e, B:47:0x0062), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [xsna.dmb0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [xsna.dmb0] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xsna.dmb0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xsna.dmb0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [xsna.dmb0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r9v16, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(dmb0 dmb0Var, wzs<? super dmb0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        b bVar;
        ?? r2;
        Object Z0;
        kotlin.coroutines.d dVar;
        Object obj;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
                Object obj2 = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r2 = bVar.label;
                if (r2 != 0) {
                    kotlin.a.a(obj2);
                    dVar = bVar.getContext();
                    obj = dmb0Var;
                    if (!iyx.h(dVar)) {
                    }
                } else if (r2 != 1) {
                    if (r2 == 2) {
                        dmb0Var = (kotlin.coroutines.d) bVar.L$2;
                        wzsVar = (wzs) bVar.L$1;
                        r2 = (dmb0) bVar.L$0;
                        kotlin.a.a(obj2);
                    } else {
                        if (r2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dmb0Var = (kotlin.coroutines.d) bVar.L$2;
                        wzsVar = (wzs) bVar.L$1;
                        r2 = (dmb0) bVar.L$0;
                        kotlin.a.a(obj2);
                    }
                    dVar = dmb0Var;
                    obj = r2;
                    if (!iyx.h(dVar)) {
                        try {
                        } catch (CancellationException e) {
                            r2 = obj;
                            dmb0Var = dVar;
                            e = e;
                            if (iyx.h(dmb0Var)) {
                                throw e;
                            }
                            bVar.L$0 = r2;
                            bVar.L$1 = wzsVar;
                            bVar.L$2 = dmb0Var;
                            bVar.label = 3;
                            Object Z02 = r2.Z0(new b7s(2, null), bVar);
                            if (Z02 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        }
                        bVar.L$0 = obj;
                        bVar.L$1 = wzsVar;
                        bVar.L$2 = dVar;
                        bVar.label = 1;
                        if (wzsVar.invoke(obj, bVar) != coroutineSingletons) {
                            r2 = obj;
                            dmb0Var = dVar;
                            bVar.L$0 = r2;
                            bVar.L$1 = wzsVar;
                            bVar.L$2 = dmb0Var;
                            bVar.label = 2;
                            Z0 = r2.Z0(new b7s(2, null), bVar);
                            if (Z0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                            dVar = dmb0Var;
                            obj = r2;
                            if (!iyx.h(dVar)) {
                                return s3q0.a;
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    kotlin.coroutines.d dVar2 = (kotlin.coroutines.d) bVar.L$2;
                    wzsVar = (wzs) bVar.L$1;
                    dmb0 dmb0Var2 = (dmb0) bVar.L$0;
                    kotlin.a.a(obj2);
                    r2 = dmb0Var2;
                    dmb0Var = dVar2;
                    bVar.L$0 = r2;
                    bVar.L$1 = wzsVar;
                    bVar.L$2 = dmb0Var;
                    bVar.label = 2;
                    Z0 = r2.Z0(new b7s(2, null), bVar);
                    if (Z0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                    dVar = dmb0Var;
                    obj = r2;
                    if (!iyx.h(dVar)) {
                    }
                }
            }
        }
        bVar = new b(spjVar);
        Object obj22 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = bVar.label;
        if (r2 != 0) {
        }
    }
}

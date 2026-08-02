package xsna;

import androidx.car.app.hardware.common.CarZone;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: DragGesture.kt */
@b6l(c = "com.vk.core.compose.reorder.DragGestureKt$awaitLongPressOrCancellation$2", f = "DragGesture.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ngo extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<xlb0> $currentDown;
    final /* synthetic */ Ref$ObjectRef<xlb0> $longPress;
    final /* synthetic */ dmb0 $this_awaitLongPressOrCancellation;
    int label;

    /* compiled from: DragGesture.kt */
    @b6l(c = "com.vk.core.compose.reorder.DragGestureKt$awaitLongPressOrCancellation$2$1", f = "DragGesture.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER, 97}, m = "invokeSuspend")
    public static final class a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
        final /* synthetic */ Ref$ObjectRef<xlb0> $currentDown;
        final /* synthetic */ Ref$ObjectRef<xlb0> $longPress;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref$ObjectRef<xlb0> ref$ObjectRef, Ref$ObjectRef<xlb0> ref$ObjectRef2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$currentDown = ref$ObjectRef;
            this.$longPress = ref$ObjectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$currentDown, this.$longPress, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
            return ((a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0040, code lost:
        
            if (r7 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x009c, code lost:
        
            if (r4 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
        /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r7v10, types: [T, xsna.xlb0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009c -> B:6:0x009f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            Object obj2;
            plb0 plb0Var;
            Object I1;
            xlb0 xlb0Var;
            xlb0 xlb0Var2;
            T t;
            eu5 eu5Var = (eu5) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            Object obj3 = null;
            int i3 = 1;
            if (i2 == 0) {
                kotlin.a.a(obj);
                i = 0;
                if (i == 0) {
                }
            } else if (i2 == 1) {
                i = this.I$0;
                kotlin.a.a(obj);
                obj2 = obj;
                plb0Var = (plb0) obj2;
                List<xlb0> list = plb0Var.a;
                int size = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        i = i3;
                        break;
                    }
                    if (!fdi.o(list.get(i4))) {
                        break;
                    }
                    i4++;
                }
                List<xlb0> list2 = plb0Var.a;
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    xlb0 xlb0Var3 = list2.get(i5);
                    if (xlb0Var3.c() || fdi.z(xlb0Var3, eu5Var.a(), eu5Var.A1())) {
                        break;
                    }
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                this.L$0 = eu5Var;
                this.L$1 = plb0Var;
                this.I$0 = i;
                this.label = 2;
                I1 = eu5Var.I1(pointerEventPass, this);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                plb0Var = (plb0) this.L$1;
                kotlin.a.a(obj);
                I1 = obj;
                List<xlb0> list3 = ((plb0) I1).a;
                int size3 = list3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        break;
                    }
                    if (list3.get(i6).c()) {
                        i = i3;
                        break;
                    }
                    i6++;
                }
                long j = this.$currentDown.element.a;
                List<xlb0> list4 = plb0Var.a;
                int size4 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        xlb0Var = null;
                        break;
                    }
                    xlb0Var = list4.get(i7);
                    if (wlb0.g(xlb0Var.a, j)) {
                        break;
                    }
                    i7++;
                }
                xlb0 xlb0Var4 = xlb0Var;
                if (xlb0Var4 == null || xlb0Var4.d != i3) {
                    List<xlb0> list5 = list4;
                    int size5 = list5.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size5) {
                            xlb0Var2 = null;
                            break;
                        }
                        List<xlb0> list6 = list5;
                        xlb0Var2 = list6.get(i8);
                        if (xlb0Var2.d) {
                            break;
                        }
                        i8++;
                        list5 = list6;
                    }
                    xlb0 xlb0Var5 = xlb0Var2;
                    if (xlb0Var5 != 0) {
                        this.$currentDown.element = xlb0Var5;
                        this.$longPress.element = xlb0Var5;
                    } else {
                        i = 1;
                    }
                } else {
                    Ref$ObjectRef<xlb0> ref$ObjectRef = this.$longPress;
                    Ref$ObjectRef<xlb0> ref$ObjectRef2 = this.$currentDown;
                    int size6 = list4.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size6) {
                            t = 0;
                            break;
                        }
                        t = list4.get(i9);
                        List<xlb0> list7 = list4;
                        if (wlb0.g(((xlb0) t).a, ref$ObjectRef2.element.a)) {
                            break;
                        }
                        i9++;
                        list4 = list7;
                    }
                    ref$ObjectRef.element = t;
                }
                obj3 = null;
                i3 = 1;
                if (i == 0) {
                    return s3q0.a;
                }
                PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                this.L$0 = eu5Var;
                this.L$1 = obj3;
                this.I$0 = i;
                this.label = i3;
                obj2 = eu5Var.I1(pointerEventPass2, this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngo(dmb0 dmb0Var, Ref$ObjectRef<xlb0> ref$ObjectRef, Ref$ObjectRef<xlb0> ref$ObjectRef2, spj<? super ngo> spjVar) {
        super(2, spjVar);
        this.$this_awaitLongPressOrCancellation = dmb0Var;
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ngo(this.$this_awaitLongPressOrCancellation, this.$currentDown, this.$longPress, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ngo) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            dmb0 dmb0Var = this.$this_awaitLongPressOrCancellation;
            a aVar = new a(this.$currentDown, this.$longPress, null);
            this.label = 1;
            if (dmb0Var.Z0(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}

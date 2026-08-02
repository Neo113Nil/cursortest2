package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyLayoutPager.kt */
/* loaded from: classes11.dex */
public final class vty implements PointerInputEventHandler {
    public final /* synthetic */ mc90 a;

    /* compiled from: LazyLayoutPager.kt */
    @b6l(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {296}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $state;
        final /* synthetic */ dmb0 $this_pointerInput;
        int label;

        /* compiled from: LazyLayoutPager.kt */
        @b6l(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {298, 302}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.vty$a$a, reason: collision with other inner class name */
        public static final class C3903a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
            final /* synthetic */ mc90 $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3903a(mc90 mc90Var, spj<? super C3903a> spjVar) {
                super(2, spjVar);
                this.$state = mc90Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3903a c3903a = new C3903a(this.$state, spjVar);
                c3903a.L$0 = obj;
                return c3903a;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                return ((C3903a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
            
                if (r11 == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
            
                if (r11 == r0) goto L17;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0068 -> B:6:0x006b). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                eu5 eu5Var;
                eu5 eu5Var2;
                xlb0 xlb0Var;
                xlb0 xlb0Var2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    eu5Var = (eu5) this.L$0;
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    this.L$0 = eu5Var;
                    this.label = 1;
                    obj = z2o0.a(eu5Var, false, pointerEventPass, this);
                } else if (i == 1) {
                    eu5Var = (eu5) this.L$0;
                    kotlin.a.a(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xlb0Var = (xlb0) this.L$2;
                    xlb0Var2 = (xlb0) this.L$1;
                    eu5Var2 = (eu5) this.L$0;
                    kotlin.a.a(obj);
                    plb0 plb0Var = (plb0) obj;
                    List<xlb0> list = plb0Var.a;
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            xlb0Var = plb0Var.a.get(0);
                            break;
                        }
                        if (!fdi.n(list.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                    if (xlb0Var == null) {
                        ((zak0) this.$state.c).setValue(new ov70(ov70.e(xlb0Var.c, xlb0Var2.c)));
                        return s3q0.a;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = eu5Var2;
                    this.L$1 = xlb0Var2;
                    this.L$2 = xlb0Var;
                    this.label = 2;
                    obj = eu5Var2.I1(pointerEventPass2, this);
                }
                ((zak0) this.$state.c).setValue(new ov70(0L));
                eu5Var2 = eu5Var;
                xlb0Var = null;
                xlb0Var2 = (xlb0) obj;
                if (xlb0Var == null) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dmb0 dmb0Var, mc90 mc90Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_pointerInput = dmb0Var;
            this.$state = mc90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$this_pointerInput, this.$state, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                dmb0 dmb0Var = this.$this_pointerInput;
                C3903a c3903a = new C3903a(this.$state, null);
                this.label = 1;
                if (d7s.c(dmb0Var, c3903a, this) == coroutineSingletons) {
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

    public vty(mc90 mc90Var) {
        this.a = mc90Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object d = zvj.d(new a(dmb0Var, this.a, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}

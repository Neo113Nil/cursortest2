package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FragmentExtensions.kt */
/* loaded from: classes6.dex */
public final class bbs {

    /* compiled from: FragmentExtensions.kt */
    @b6l(c = "com.vk.superapp.vksteps.extensions.FragmentExtensionsKt$launchInScope$2", f = "FragmentExtensions.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<spj<? super s3q0>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$block = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$block, spjVar);
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
                izs<spj<? super s3q0>, Object> izsVar = this.$block;
                this.label = 1;
                if (izsVar.invoke(this) == coroutineSingletons) {
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

    public static final void a(FragmentActivity fragmentActivity, kotlin.coroutines.d dVar, izs<? super spj<? super s3q0>, ? extends Object> izsVar) {
        myc0.h(g5z.a(fragmentActivity), dVar, null, new a(izsVar, null), 2);
    }

    public static void b(Fragment fragment, izs izsVar) {
        myc0.h(g5z.a(fragment), EmptyCoroutineContext.b, null, new zas(izsVar, null), 2);
    }
}

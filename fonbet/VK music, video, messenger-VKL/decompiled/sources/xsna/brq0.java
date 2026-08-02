package xsna;

import com.vk.profile.user.impl.ui.UserProfileAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserProfileLegoHeaderViewHolder.kt */
@b6l(c = "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoHeaderViewHolder$Content$1$1$1", f = "UserProfileLegoHeaderViewHolder.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class brq0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ja5 $resolvedPagerState;
    int label;
    final /* synthetic */ arq0 this$0;

    /* compiled from: UserProfileLegoHeaderViewHolder.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ arq0 b;

        public a(arq0 arq0Var) {
            this.b = arq0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.n.a(new UserProfileAction.d.c.a(((Number) obj).intValue()));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brq0(ja5 ja5Var, arq0 arq0Var, spj<? super brq0> spjVar) {
        super(2, spjVar);
        this.$resolvedPagerState = ja5Var;
        this.this$0 = arq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new brq0(this.$resolvedPagerState, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((brq0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr l = rsr.l(nr2.M(new stg0(this.$resolvedPagerState, 16)));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
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

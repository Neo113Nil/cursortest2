package xsna;

import com.vk.reefton.protocol.ReefProtocol$Event;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FriendsList.kt */
@b6l(c = "com.vk.friends.groupinvite.impl.ui.FriendsListKt$lazyRememberState$1$1$1$1", f = "FriendsList.kt", l = {ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class tqs extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<gzs<s3q0>> $callback$delegate;
    final /* synthetic */ mtk0<Boolean> $state;
    final /* synthetic */ xvy $this_apply;
    int label;

    /* compiled from: FriendsList.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ xvy b;
        public final /* synthetic */ mtk0<gzs<s3q0>> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(xvy xvyVar, mtk0<? extends gzs<s3q0>> mtk0Var) {
            this.b = xvyVar;
            this.c = mtk0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (this.b.j().d() > 0 && booleanValue) {
                this.c.getValue().invoke();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tqs(mtk0<Boolean> mtk0Var, xvy xvyVar, mtk0<? extends gzs<s3q0>> mtk0Var2, spj<? super tqs> spjVar) {
        super(2, spjVar);
        this.$state = mtk0Var;
        this.$this_apply = xvyVar;
        this.$callback$delegate = mtk0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new tqs(this.$state, this.$this_apply, this.$callback$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tqs) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new wnh(this.$state, 12));
            a aVar = new a(this.$this_apply, this.$callback$delegate);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
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

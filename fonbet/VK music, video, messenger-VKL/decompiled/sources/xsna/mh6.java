package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.io40;
import xsna.lh6;

/* compiled from: BaseMusicMixAnimationGLView.kt */
@b6l(c = "com.vk.music.view.vkmix.view.BaseMusicMixAnimationGLView$setup$1", f = "BaseMusicMixAnimationGLView.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class mh6 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ttk0<lh6.a> $musicDataSource;
    final /* synthetic */ xh50<io40.a> $textureDatasource;
    int label;
    final /* synthetic */ lh6 this$0;

    /* compiled from: BaseMusicMixAnimationGLView.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ xh50<io40.a> b;
        public final /* synthetic */ lh6 c;

        public a(xh50<io40.a> xh50Var, lh6 lh6Var) {
            this.b = xh50Var;
            this.c = lh6Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            int i = lh6.m;
            lh6 lh6Var = this.c;
            lh6Var.getClass();
            this.b.e(lh6.d((lh6.a) obj));
            lh6Var.c();
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh6(ttk0<lh6.a> ttk0Var, xh50<io40.a> xh50Var, lh6 lh6Var, spj<? super mh6> spjVar) {
        super(2, spjVar);
        this.$musicDataSource = ttk0Var;
        this.$textureDatasource = xh50Var;
        this.this$0 = lh6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mh6(this.$musicDataSource, this.$textureDatasource, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mh6) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ttk0<lh6.a> ttk0Var = this.$musicDataSource;
            a aVar = new a(this.$textureDatasource, this.this$0);
            this.label = 1;
            if (ttk0Var.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}

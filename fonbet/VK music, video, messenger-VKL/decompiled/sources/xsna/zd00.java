package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;

/* compiled from: MainContent.kt */
@b6l(c = "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.MainContentKt$SearchItem$5$1", f = "MainContent.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class zd00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rwr $focusRequester;
    final /* synthetic */ sg50 $interactionSource;
    final /* synthetic */ gzs<s3q0> $onSearchClicked;
    int label;

    /* compiled from: MainContent.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ rwr c;

        public a(gzs<s3q0> gzsVar, rwr rwrVar) {
            this.b = gzsVar;
            this.c = rwrVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            if (((vax) obj) instanceof o2d0.b) {
                this.b.invoke();
                rwr.b(this.c);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(sg50 sg50Var, gzs<s3q0> gzsVar, rwr rwrVar, spj<? super zd00> spjVar) {
        super(2, spjVar);
        this.$interactionSource = sg50Var;
        this.$onSearchClicked = gzsVar;
        this.$focusRequester = rwrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zd00(this.$interactionSource, this.$onSearchClicked, this.$focusRequester, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zd00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 b = this.$interactionSource.b();
            a aVar = new a(this.$onSearchClicked, this.$focusRequester);
            this.label = 1;
            b.getClass();
            if (caj0.k(b, aVar, this) == coroutineSingletons) {
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

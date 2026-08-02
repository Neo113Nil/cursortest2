package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsMyDescriptionEditView.kt */
@b6l(c = "com.vk.clips.viewer.impl.grid.toolbar.profile.ClipsMyDescriptionEditView$EditDescriptionContent$2$1", f = "ClipsMyDescriptionEditView.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class eme extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rwr $focusRequester;
    final /* synthetic */ spx0 $windowInfo;
    int label;

    /* compiled from: ClipsMyDescriptionEditView.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ rwr b;

        public a(rwr rwrVar) {
            this.b = rwrVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            if (((Boolean) obj).booleanValue()) {
                rwr.b(this.b);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eme(spx0 spx0Var, rwr rwrVar, spj<? super eme> spjVar) {
        super(2, spjVar);
        this.$windowInfo = spx0Var;
        this.$focusRequester = rwrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new eme(this.$windowInfo, this.$focusRequester, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((eme) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new defpackage.e(this.$windowInfo, 23));
            a aVar = new a(this.$focusRequester);
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

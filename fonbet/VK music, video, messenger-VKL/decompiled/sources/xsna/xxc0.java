package xsna;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PreferenceDataStoreFactory.kt */
/* loaded from: classes.dex */
public final class xxc0 implements fvk<uyc0> {
    public final fvk<uyc0> a;

    /* compiled from: PreferenceDataStoreFactory.kt */
    @b6l(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {MBSupportMuteAdType.REWARD_VIDEO}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<uyc0, spj<? super uyc0>, Object> {
        final /* synthetic */ wzs<uyc0, spj<? super uyc0>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<? super uyc0, ? super spj<? super uyc0>, ? extends Object> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$transform = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$transform, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(uyc0 uyc0Var, spj<? super uyc0> spjVar) {
            return ((a) create(uyc0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                uyc0 uyc0Var = (uyc0) this.L$0;
                wzs<uyc0, spj<? super uyc0>, Object> wzsVar = this.$transform;
                this.label = 1;
                obj = wzsVar.invoke(uyc0Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            uyc0 uyc0Var2 = (uyc0) obj;
            ((AtomicBoolean) ((nh50) uyc0Var2).b.a).set(true);
            return uyc0Var2;
        }
    }

    public xxc0(fvk<uyc0> fvkVar) {
        this.a = fvkVar;
    }

    @Override // xsna.fvk
    public final Object a(wzs<? super uyc0, ? super spj<? super uyc0>, ? extends Object> wzsVar, spj<? super uyc0> spjVar) {
        return this.a.a(new a(wzsVar, null), spjVar);
    }

    @Override // xsna.fvk
    public final ksr<uyc0> getData() {
        return this.a.getData();
    }
}

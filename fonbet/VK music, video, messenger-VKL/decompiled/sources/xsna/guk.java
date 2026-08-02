package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.juk;

/* compiled from: DataMigrationInitializer.kt */
@b6l(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class guk extends SuspendLambda implements wzs<mzw<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ List<fuk<Object>> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public guk(List<? extends fuk<Object>> list, spj<? super guk> spjVar) {
        super(2, spjVar);
        this.$migrations = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        guk gukVar = new guk(this.$migrations, spjVar);
        gukVar.L$0 = obj;
        return gukVar;
    }

    @Override // xsna.wzs
    public final Object invoke(mzw<Object> mzwVar, spj<? super s3q0> spjVar) {
        return ((guk) create(mzwVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mzw mzwVar = (mzw) this.L$0;
            List<fuk<Object>> list = this.$migrations;
            this.label = 1;
            if (juk.a.a(juk.a, list, mzwVar, this) == coroutineSingletons) {
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

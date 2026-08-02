package xsna;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DataMigrationInitializer.kt */
@b6l(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class iuk extends SuspendLambda implements wzs<Object, spj<Object>, Object> {
    final /* synthetic */ List<izs<spj<? super s3q0>, Object>> $cleanUps;
    final /* synthetic */ List<fuk<Object>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* compiled from: DataMigrationInitializer.kt */
    @b6l(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes12.dex */
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ fuk<Object> $migration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fuk<Object> fukVar, spj<? super a> spjVar) {
            super(1, spjVar);
            this.$migration = fukVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(this.$migration, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                fuk<Object> fukVar = this.$migration;
                this.label = 1;
                if (fukVar.cleanUp(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iuk(List<? extends fuk<Object>> list, List<izs<spj<? super s3q0>, Object>> list2, spj<? super iuk> spjVar) {
        super(2, spjVar);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        iuk iukVar = new iuk(this.$migrations, this.$cleanUps, spjVar);
        iukVar.L$0 = obj;
        return iukVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, spj<Object> spjVar) {
        return ((iuk) create(obj, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<izs<spj<? super s3q0>, Object>> list;
        Iterator it;
        fuk fukVar;
        Iterator it2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            obj = this.L$0;
            List<fuk<Object>> list2 = this.$migrations;
            list = this.$cleanUps;
            it = list2.iterator();
        } else if (i == 1) {
            obj2 = this.L$3;
            fuk fukVar2 = (fuk) this.L$2;
            it2 = (Iterator) this.L$1;
            List<izs<spj<? super s3q0>, Object>> list3 = (List) this.L$0;
            kotlin.a.a(obj);
            fukVar = fukVar2;
            list = list3;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new a(fukVar, null));
                this.L$0 = list;
                this.L$1 = it2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = fukVar.migrate(obj2, this);
                if (obj != coroutineSingletons) {
                    it = it2;
                }
                return coroutineSingletons;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            list = (List) this.L$0;
            kotlin.a.a(obj);
        }
        if (!it.hasNext()) {
            fuk fukVar3 = (fuk) it.next();
            this.L$0 = list;
            this.L$1 = it;
            this.L$2 = fukVar3;
            this.L$3 = obj;
            this.label = 1;
            Object shouldMigrate = fukVar3.shouldMigrate(obj, this);
            if (shouldMigrate != coroutineSingletons) {
                Iterator it3 = it;
                obj2 = obj;
                obj = shouldMigrate;
                fukVar = fukVar3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return coroutineSingletons;
        }
    }
}

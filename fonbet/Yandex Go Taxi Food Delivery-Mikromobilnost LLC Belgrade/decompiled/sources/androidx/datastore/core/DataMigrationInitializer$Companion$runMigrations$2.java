package androidx.datastore.core;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oog;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {41, 43}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<tls> $cleanUps;
    final /* synthetic */ List<oog> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2(List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<tls> list;
        Iterator it;
        oog oogVar;
        Iterator it2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            obj = this.L$0;
            List<oog> list2 = this.$migrations;
            list = this.$cleanUps;
            it = list2.iterator();
        } else if (i == 1) {
            obj2 = this.L$3;
            oog oogVar2 = (oog) this.L$2;
            it2 = (Iterator) this.L$1;
            List<tls> list3 = (List) this.L$0;
            kotlin.b.b(obj);
            oogVar = oogVar2;
            list = list3;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new DataMigrationInitializer$Companion$runMigrations$2$1$1(oogVar, null));
                this.L$0 = list;
                this.L$1 = it2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = oogVar.c(obj2, this);
                if (obj != coroutineSingletons) {
                    it = it2;
                }
                return coroutineSingletons;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$1;
            list = (List) this.L$0;
            kotlin.b.b(obj);
        }
        if (!it.hasNext()) {
            oog oogVar3 = (oog) it.next();
            this.L$0 = list;
            this.L$1 = it;
            this.L$2 = oogVar3;
            this.L$3 = obj;
            this.label = 1;
            Object a = oogVar3.a(obj, this);
            if (a != coroutineSingletons) {
                Iterator it3 = it;
                obj2 = obj;
                obj = a;
                oogVar = oogVar3;
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

package xsna;

import android.content.Context;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;
import com.vk.push.core.filedatastore.migration.Migration;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
@b6l(c = "com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl$processMigration$1", f = "JsonSerializableFileDataStoreImpl.kt", l = {237, 152, 153, 157}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ray extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ JsonSerializableFileDataStoreImpl<JsonSerializer> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ray(JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl, Context context, spj<? super ray> spjVar) {
        super(2, spjVar);
        this.this$0 = jsonSerializableFileDataStoreImpl;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ray rayVar = new ray(this.this$0, this.$context, spjVar);
        rayVar.L$0 = obj;
        return rayVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ray) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:(1:(1:(9:7|8|9|10|11|12|13|14|15)(2:25|26))(11:27|28|29|30|31|(3:35|(2:38|10)|37)|11|12|13|14|15))(10:45|46|47|48|(2:50|(2:52|37)(3:53|31|(4:33|35|(0)|37)))|11|12|13|14|15))(1:54))(3:62|(1:64)|37)|55|56|(8:58|48|(0)|11|12|13|14|15)|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0103, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[Catch: all -> 0x0067, TryCatch #2 {all -> 0x0067, blocks: (B:31:0x00db, B:33:0x00e4, B:35:0x00e9, B:47:0x0063, B:48:0x00bd, B:50:0x00c5), top: B:46:0x0063 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ui50 ui50Var;
        Context context;
        JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl;
        JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl2;
        Migration migration;
        ui50 ui50Var2;
        JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl3;
        Context context2;
        Migration migration2;
        Object mo103migrategIAlus;
        JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl4;
        JsonSerializer jsonSerializer;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            ui50Var = this.this$0.i;
            JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl5 = this.this$0;
            context = this.$context;
            this.L$0 = yvjVar;
            this.L$1 = ui50Var;
            this.L$2 = jsonSerializableFileDataStoreImpl5;
            this.L$3 = context;
            this.label = 1;
            if (ui50Var.b(this) != coroutineSingletons) {
                jsonSerializableFileDataStoreImpl = jsonSerializableFileDataStoreImpl5;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                jsonSerializableFileDataStoreImpl3 = (JsonSerializableFileDataStoreImpl) this.L$3;
                context2 = (Context) this.L$2;
                jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) this.L$1;
                ui50Var2 = (ui50) this.L$0;
                try {
                    kotlin.a.a(obj);
                    if (((Boolean) obj).booleanValue()) {
                        migration2 = jsonSerializableFileDataStoreImpl.c;
                        this.L$0 = ui50Var2;
                        this.L$1 = jsonSerializableFileDataStoreImpl;
                        this.L$2 = jsonSerializableFileDataStoreImpl3;
                        this.L$3 = jsonSerializableFileDataStoreImpl;
                        this.label = 3;
                        mo103migrategIAlus = migration2.mo103migrategIAlus(context2, this);
                        if (mo103migrategIAlus == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        jsonSerializableFileDataStoreImpl4 = jsonSerializableFileDataStoreImpl;
                        JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl, mo103migrategIAlus, IssueKey.FILE_DATA_STORE_MIGRATION_ERROR);
                        if (!(mo103migrategIAlus instanceof Result.Failure)) {
                            this.L$0 = ui50Var2;
                            this.L$1 = jsonSerializableFileDataStoreImpl3;
                            this.L$2 = mo103migrategIAlus;
                            this.L$3 = null;
                            this.label = 4;
                            if (JsonSerializableFileDataStoreImpl.m102access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl4, jsonSerializer, this) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                    }
                    jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl3;
                    ui50Var = ui50Var2;
                    failure = s3q0.a;
                } catch (Throwable th) {
                    th = th;
                    jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl3;
                    ui50Var = ui50Var2;
                    failure = new Result.Failure(th);
                    JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl2, failure, IssueKey.FILE_MIGRATION_ERROR);
                    s3q0 s3q0Var = s3q0.a;
                    ui50Var.c(null);
                    return s3q0.a;
                }
                JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl2, failure, IssueKey.FILE_MIGRATION_ERROR);
                s3q0 s3q0Var2 = s3q0.a;
                ui50Var.c(null);
                return s3q0.a;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jsonSerializableFileDataStoreImpl2 = (JsonSerializableFileDataStoreImpl) this.L$1;
                ui50Var = (ui50) this.L$0;
                try {
                    kotlin.a.a(obj);
                    ((Result) obj).getClass();
                    ui50Var2 = ui50Var;
                    jsonSerializableFileDataStoreImpl3 = jsonSerializableFileDataStoreImpl2;
                    jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl3;
                    ui50Var = ui50Var2;
                    failure = s3q0.a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        failure = new Result.Failure(th);
                        JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl2, failure, IssueKey.FILE_MIGRATION_ERROR);
                        s3q0 s3q0Var22 = s3q0.a;
                        ui50Var.c(null);
                        return s3q0.a;
                    } catch (Throwable th3) {
                        ui50Var.c(null);
                        throw th3;
                    }
                }
                JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl2, failure, IssueKey.FILE_MIGRATION_ERROR);
                s3q0 s3q0Var222 = s3q0.a;
                ui50Var.c(null);
                return s3q0.a;
            }
            JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl6 = (JsonSerializableFileDataStoreImpl) this.L$3;
            JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl7 = (JsonSerializableFileDataStoreImpl) this.L$2;
            jsonSerializableFileDataStoreImpl4 = (JsonSerializableFileDataStoreImpl) this.L$1;
            ui50 ui50Var3 = (ui50) this.L$0;
            try {
                kotlin.a.a(obj);
                mo103migrategIAlus = ((Result) obj).d();
                ui50Var2 = ui50Var3;
                jsonSerializableFileDataStoreImpl = jsonSerializableFileDataStoreImpl6;
                jsonSerializableFileDataStoreImpl3 = jsonSerializableFileDataStoreImpl7;
                JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl, mo103migrategIAlus, IssueKey.FILE_DATA_STORE_MIGRATION_ERROR);
                if (!(mo103migrategIAlus instanceof Result.Failure) && (jsonSerializer = (JsonSerializer) mo103migrategIAlus) != null) {
                    this.L$0 = ui50Var2;
                    this.L$1 = jsonSerializableFileDataStoreImpl3;
                    this.L$2 = mo103migrategIAlus;
                    this.L$3 = null;
                    this.label = 4;
                    if (JsonSerializableFileDataStoreImpl.m102access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl4, jsonSerializer, this) != coroutineSingletons) {
                        jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl3;
                        ui50Var = ui50Var2;
                        ui50Var2 = ui50Var;
                        jsonSerializableFileDataStoreImpl3 = jsonSerializableFileDataStoreImpl2;
                    }
                    return coroutineSingletons;
                }
                jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl3;
                ui50Var = ui50Var2;
                failure = s3q0.a;
            } catch (Throwable th4) {
                th = th4;
                jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl7;
                ui50Var = ui50Var3;
                failure = new Result.Failure(th);
                JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl2, failure, IssueKey.FILE_MIGRATION_ERROR);
                s3q0 s3q0Var2222 = s3q0.a;
                ui50Var.c(null);
                return s3q0.a;
            }
            JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl2, failure, IssueKey.FILE_MIGRATION_ERROR);
            s3q0 s3q0Var22222 = s3q0.a;
            ui50Var.c(null);
            return s3q0.a;
        }
        Context context3 = (Context) this.L$3;
        jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) this.L$2;
        ui50 ui50Var4 = (ui50) this.L$1;
        kotlin.a.a(obj);
        context = context3;
        ui50Var = ui50Var4;
        migration = jsonSerializableFileDataStoreImpl.c;
        this.L$0 = ui50Var;
        this.L$1 = jsonSerializableFileDataStoreImpl;
        this.L$2 = context;
        this.L$3 = jsonSerializableFileDataStoreImpl;
        this.label = 2;
        obj = migration.shouldMigrate(context, this);
        if (obj != coroutineSingletons) {
            ui50Var2 = ui50Var;
            jsonSerializableFileDataStoreImpl3 = jsonSerializableFileDataStoreImpl;
            context2 = context;
            if (((Boolean) obj).booleanValue()) {
            }
            jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl3;
            ui50Var = ui50Var2;
            failure = s3q0.a;
            JsonSerializableFileDataStoreImpl.a(jsonSerializableFileDataStoreImpl2, failure, IssueKey.FILE_MIGRATION_ERROR);
            s3q0 s3q0Var222222 = s3q0.a;
            ui50Var.c(null);
            return s3q0.a;
        }
        return coroutineSingletons;
    }
}

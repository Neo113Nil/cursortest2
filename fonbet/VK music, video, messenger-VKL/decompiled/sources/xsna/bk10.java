package xsna;

import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import com.vk.push.core.filedatastore.flow.FlowableFileDataStore;
import com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImplKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: MasterInfoRepository.kt */
/* loaded from: classes.dex */
public final class bk10 {
    public final ContextDataSource a;
    public final FlowableFileDataStore<a> b;

    /* compiled from: MasterInfoRepository.kt */
    public static final class a implements JsonSerializer {
        public static final C2611a b = new C2611a();
        public final String a;

        /* compiled from: MasterInfoRepository.kt */
        /* renamed from: xsna.bk10$a$a, reason: collision with other inner class name */
        public static final class C2611a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.getString("master_host_package_name"));
            }
        }

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.vk.push.core.filedatastore.JsonSerializer
        public final JSONObject toJson() {
            return new JSONObject().put("master_host_package_name", this.a);
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MasterHostData(masterHostPackageName="), this.a, ')');
        }
    }

    public bk10(FileDataStore<a> fileDataStore, ContextDataSource contextDataSource) {
        this.a = contextDataSource;
        this.b = FlowableFileDataStoreImplKt.flowableFileDataStore$default(fileDataStore, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ck10 ck10Var;
        int i;
        a aVar;
        if (continuationImpl instanceof ck10) {
            ck10Var = (ck10) continuationImpl;
            int i2 = ck10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ck10Var.label = i2 - Integer.MIN_VALUE;
                Object obj = ck10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ck10Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ck10Var.label = 1;
                    obj = this.b.read(ck10Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                aVar = (a) obj;
                if (aVar == null) {
                    return aVar.a;
                }
                return null;
            }
        }
        ck10Var = new ck10(this, continuationImpl);
        Object obj2 = ck10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ck10Var.label;
        if (i != 0) {
        }
        aVar = (a) obj2;
        if (aVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        dk10 dk10Var;
        int i;
        bk10 bk10Var;
        if (continuationImpl instanceof dk10) {
            dk10Var = (dk10) continuationImpl;
            int i2 = dk10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dk10Var.label = i2 - Integer.MIN_VALUE;
                Object obj = dk10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dk10Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    dk10Var.L$0 = this;
                    dk10Var.label = 1;
                    obj = this.b.read(dk10Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bk10Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bk10Var = (bk10) dk10Var.L$0;
                    kotlin.a.a(obj);
                }
                a aVar = (a) obj;
                return Boolean.valueOf(epx.f(aVar == null ? aVar.a : null, bk10Var.a.getPackageName()));
            }
        }
        dk10Var = new dk10(this, continuationImpl);
        Object obj2 = dk10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dk10Var.label;
        if (i != 0) {
        }
        a aVar2 = (a) obj2;
        return Boolean.valueOf(epx.f(aVar2 == null ? aVar2.a : null, bk10Var.a.getPackageName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6.clear(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ek10 ek10Var;
        Object obj;
        int i;
        bk10 bk10Var;
        if (continuationImpl instanceof ek10) {
            ek10Var = (ek10) continuationImpl;
            int i2 = ek10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ek10Var.label = i2 - Integer.MIN_VALUE;
                obj = ek10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ek10Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ek10Var.L$0 = this;
                    ek10Var.label = 1;
                    obj = b(ek10Var);
                    if (obj != coroutineSingletons) {
                        bk10Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                bk10Var = (bk10) ek10Var.L$0;
                kotlin.a.a(obj);
                if (((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                FlowableFileDataStore<a> flowableFileDataStore = bk10Var.b;
                ek10Var.L$0 = null;
                ek10Var.label = 2;
            }
        }
        ek10Var = new ek10(this, continuationImpl);
        obj = ek10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ek10Var.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final Object d(String str, ContinuationImpl continuationImpl) {
        Object write = this.b.write(new a(str), continuationImpl);
        return write == CoroutineSingletons.COROUTINE_SUSPENDED ? write : s3q0.a;
    }
}

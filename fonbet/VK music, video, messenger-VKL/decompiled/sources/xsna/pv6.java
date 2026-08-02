package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: BatteryOptimizationDataSource.kt */
/* loaded from: classes5.dex */
public final class pv6 {
    public final FileDataStore<a> a;

    /* compiled from: BatteryOptimizationDataSource.kt */
    /* loaded from: classes.dex */
    public static final class a implements JsonSerializer {
        public static final C3532a b = new C3532a();
        public final boolean a;

        /* compiled from: BatteryOptimizationDataSource.kt */
        /* renamed from: xsna.pv6$a$a, reason: collision with other inner class name */
        public static final class C3532a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.getBoolean("is_ignoring_battery_optimization"));
            }
        }

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @Override // com.vk.push.core.filedatastore.JsonSerializer
        public final JSONObject toJson() {
            return new JSONObject().put("is_ignoring_battery_optimization", this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("BatteryOptimizationData(ignoringBatteryOptimization="), this.a, ')');
        }
    }

    public pv6(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        qv6 qv6Var;
        int i;
        if (continuationImpl instanceof qv6) {
            qv6Var = (qv6) continuationImpl;
            int i2 = qv6Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qv6Var.label = i2 - Integer.MIN_VALUE;
                Object obj = qv6Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qv6Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    qv6Var.label = 1;
                    obj = this.a.read(qv6Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                a aVar = (a) obj;
                return Boolean.valueOf(aVar == null && aVar.a);
            }
        }
        qv6Var = new qv6(this, continuationImpl);
        Object obj2 = qv6Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qv6Var.label;
        if (i != 0) {
        }
        a aVar2 = (a) obj2;
        return Boolean.valueOf(aVar2 == null && aVar2.a);
    }

    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        return this.a.write(new a(z), continuationImpl);
    }
}

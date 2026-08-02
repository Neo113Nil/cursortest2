package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: NetworkConnectionCheckDataSource.kt */
/* loaded from: classes5.dex */
public final class v260 {
    public final FileDataStore<a> a;

    /* compiled from: NetworkConnectionCheckDataSource.kt */
    /* loaded from: classes.dex */
    public static final class a implements JsonSerializer {
        public static final C3865a b = new C3865a();
        public final boolean a;

        /* compiled from: NetworkConnectionCheckDataSource.kt */
        /* renamed from: xsna.v260$a$a, reason: collision with other inner class name */
        public static final class C3865a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.getBoolean("use_network_connection_check_by_google"));
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
            return new JSONObject().put("use_network_connection_check_by_google", this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("NetworkConnectionData(useNetworkConnectionCheckByGoogle="), this.a, ')');
        }
    }

    public v260(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        w260 w260Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        v260 v260Var;
        Object write;
        boolean z2;
        int i2;
        if (continuationImpl instanceof w260) {
            w260Var = (w260) continuationImpl;
            int i3 = w260Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w260Var.label = i3 - Integer.MIN_VALUE;
                Object obj = w260Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = w260Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    w260Var.L$0 = this;
                    w260Var.Z$0 = z;
                    w260Var.label = 1;
                    obj = this.a.read(w260Var);
                    if (obj != coroutineSingletons) {
                        v260Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = w260Var.I$0;
                    z2 = w260Var.Z$0;
                    kotlin.a.a(obj);
                    return Boolean.valueOf(i2 == z2 && ((Boolean) obj).booleanValue());
                }
                z = w260Var.Z$0;
                v260Var = (v260) w260Var.L$0;
                kotlin.a.a(obj);
                a aVar = (a) obj;
                int i4 = aVar == null ? aVar.a : 1;
                FileDataStore<a> fileDataStore = v260Var.a;
                a aVar2 = new a(z);
                w260Var.L$0 = null;
                w260Var.Z$0 = z;
                w260Var.I$0 = i4;
                w260Var.label = 2;
                write = fileDataStore.write(aVar2, w260Var);
                if (write != coroutineSingletons) {
                    z2 = z;
                    i2 = i4;
                    obj = write;
                    return Boolean.valueOf(i2 == z2 && ((Boolean) obj).booleanValue());
                }
                return coroutineSingletons;
            }
        }
        w260Var = new w260(this, continuationImpl);
        Object obj2 = w260Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = w260Var.label;
        if (i != 0) {
        }
        a aVar3 = (a) obj2;
        if (aVar3 == null) {
        }
        FileDataStore<a> fileDataStore2 = v260Var.a;
        a aVar22 = new a(z);
        w260Var.L$0 = null;
        w260Var.Z$0 = z;
        w260Var.I$0 = i4;
        w260Var.label = 2;
        write = fileDataStore2.write(aVar22, w260Var);
        if (write != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}

package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: LaunchAppDataSource.kt */
/* loaded from: classes.dex */
public final class pmy {
    public final FileDataStore<a> a;

    /* compiled from: LaunchAppDataSource.kt */
    public static final class a implements JsonSerializer {
        public static final C3520a b = new C3520a();
        public final boolean a;

        /* compiled from: LaunchAppDataSource.kt */
        /* renamed from: xsna.pmy$a$a, reason: collision with other inner class name */
        public static final class C3520a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.getBoolean("is_first_launch"));
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
            return new JSONObject().put("is_first_launch", this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FirstLaunchData(isFirstLaunch="), this.a, ')');
        }
    }

    public pmy(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        qmy qmyVar;
        int i;
        boolean z;
        a aVar;
        if (continuationImpl instanceof qmy) {
            qmyVar = (qmy) continuationImpl;
            int i2 = qmyVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qmyVar.label = i2 - Integer.MIN_VALUE;
                Object obj = qmyVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qmyVar.label;
                z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    qmyVar.label = 1;
                    obj = this.a.read(qmyVar);
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
                if (aVar != null && !aVar.a) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        qmyVar = new qmy(this, continuationImpl);
        Object obj2 = qmyVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qmyVar.label;
        z = true;
        if (i != 0) {
        }
        aVar = (a) obj2;
        if (aVar != null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

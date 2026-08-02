package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import com.vk.push.pushsdk.data.source.PushServiceType;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: LastLaunchedPushServiceDataSource.kt */
/* loaded from: classes5.dex */
public final class yly {
    public final FileDataStore<a> a;

    /* compiled from: LastLaunchedPushServiceDataSource.kt */
    /* loaded from: classes.dex */
    public static final class a implements JsonSerializer {
        public static final C4112a b = new C4112a();
        public final PushServiceType a;

        /* compiled from: LastLaunchedPushServiceDataSource.kt */
        /* renamed from: xsna.yly$a$a, reason: collision with other inner class name */
        public static final class C4112a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                String string = jSONObject.getString("push_service_type");
                Enum r0 = PushServiceType.UNKNOWN;
                if (string != null) {
                    try {
                        r0 = Enum.valueOf(PushServiceType.class, string.toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return new a((PushServiceType) r0);
            }
        }

        public a(PushServiceType pushServiceType) {
            this.a = pushServiceType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.vk.push.core.filedatastore.JsonSerializer
        public final JSONObject toJson() {
            return new JSONObject().put("push_service_type", this.a);
        }

        public final String toString() {
            return "LastPushServiceData(pushServiceType=" + this.a + ')';
        }
    }

    public yly(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        zly zlyVar;
        int i;
        PushServiceType pushServiceType;
        if (continuationImpl instanceof zly) {
            zlyVar = (zly) continuationImpl;
            int i2 = zlyVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zlyVar.label = i2 - Integer.MIN_VALUE;
                Object obj = zlyVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zlyVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zlyVar.label = 1;
                    obj = this.a.read(zlyVar);
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
                return (aVar != null || (pushServiceType = aVar.a) == null) ? PushServiceType.UNKNOWN : pushServiceType;
            }
        }
        zlyVar = new zly(this, continuationImpl);
        Object obj2 = zlyVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zlyVar.label;
        if (i != 0) {
        }
        a aVar2 = (a) obj2;
        if (aVar2 != null) {
        }
    }
}

package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: ElectionInitializedDataSource.kt */
/* loaded from: classes.dex */
public final class sap {
    public final FileDataStore<a> a;

    /* compiled from: ElectionInitializedDataSource.kt */
    public static final class a implements JsonSerializer {
        public static final C3656a b = new C3656a();
        public final boolean a;

        /* compiled from: ElectionInitializedDataSource.kt */
        /* renamed from: xsna.sap$a$a, reason: collision with other inner class name */
        public static final class C3656a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.getBoolean("is_elections_not_finished"));
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
            return new JSONObject().put("is_elections_not_finished", this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ElectionsData(isElectionsNotFinished="), this.a, ')');
        }
    }

    public sap(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        tap tapVar;
        int i;
        if (continuationImpl instanceof tap) {
            tapVar = (tap) continuationImpl;
            int i2 = tapVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tapVar.label = i2 - Integer.MIN_VALUE;
                Object obj = tapVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    tapVar.label = 1;
                    obj = this.a.read(tapVar);
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
        tapVar = new tap(this, continuationImpl);
        Object obj2 = tapVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapVar.label;
        if (i != 0) {
        }
        a aVar2 = (a) obj2;
        return Boolean.valueOf(aVar2 == null && aVar2.a);
    }
}

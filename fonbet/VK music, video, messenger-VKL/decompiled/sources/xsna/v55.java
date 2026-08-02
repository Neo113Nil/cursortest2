package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: AuthPlainTokenDataSource.kt */
/* loaded from: classes5.dex */
public final class v55 {
    public final FileDataStore<a> a;

    /* compiled from: AuthPlainTokenDataSource.kt */
    public static final class a implements JsonSerializer {
        public static final C3867a b = new C3867a();
        public final Map<String, String> a;

        /* compiled from: AuthPlainTokenDataSource.kt */
        /* renamed from: xsna.v55$a$a, reason: collision with other inner class name */
        public static final class C3867a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                uki0 c = dli0.c(jSONObject.keys());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = ((t5j) c).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(next, jSONObject.getString((String) next));
                }
                return new a(linkedHashMap);
            }
        }

        public a(Map<String, String> map) {
            this.a = map;
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
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject;
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("AuthTokenData(appToToken="), this.a, ')');
        }
    }

    public v55(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    public static String b(String str) {
        return go9.b("plain_auth_token_key_", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        w55 w55Var;
        int i;
        v55 v55Var;
        a aVar;
        if (continuationImpl instanceof w55) {
            w55Var = (w55) continuationImpl;
            int i2 = w55Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w55Var.label = i2 - Integer.MIN_VALUE;
                Object obj = w55Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = w55Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    w55Var.L$0 = this;
                    w55Var.L$1 = str;
                    w55Var.label = 1;
                    obj = this.a.read(w55Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    v55Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) w55Var.L$1;
                    v55Var = (v55) w55Var.L$0;
                    kotlin.a.a(obj);
                }
                aVar = (a) obj;
                if (aVar != null) {
                    return null;
                }
                Map<String, String> map = aVar.a;
                v55Var.getClass();
                return map.get(b(str));
            }
        }
        w55Var = new w55(this, continuationImpl);
        Object obj2 = w55Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = w55Var.label;
        if (i != 0) {
        }
        aVar = (a) obj2;
        if (aVar != null) {
        }
    }
}

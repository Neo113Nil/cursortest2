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

/* compiled from: DataStoreSynStorage.kt */
/* loaded from: classes5.dex */
public final class rvk implements don0 {
    public final FileDataStore<a> a;

    /* compiled from: DataStoreSynStorage.kt */
    /* loaded from: classes.dex */
    public static final class a implements JsonSerializer {
        public static final C3636a b = new C3636a();
        public final Map<String, Long> a;

        /* compiled from: DataStoreSynStorage.kt */
        /* renamed from: xsna.rvk$a$a, reason: collision with other inner class name */
        public static final class C3636a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                uki0 c = dli0.c(jSONObject.keys());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = ((t5j) c).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(next, Long.valueOf(jSONObject.getLong((String) next)));
                }
                return new a(linkedHashMap);
            }
        }

        public a(Map<String, Long> map) {
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
            for (Map.Entry<String, Long> entry : this.a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue().longValue());
            }
            return jSONObject;
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("SynData(pushTokenToSyn="), this.a, ')');
        }
    }

    public rvk(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    public static String d(String str) {
        return go9.b("syn_for_", str);
    }

    @Override // xsna.don0
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object edit = this.a.edit(new tvk(this, str), continuationImpl);
        return edit == CoroutineSingletons.COROUTINE_SUSPENDED ? edit : s3q0.a;
    }

    @Override // xsna.don0
    public final Object b(String str, long j, ContinuationImpl continuationImpl) {
        Object edit = this.a.edit(new uvk(this, str, j), continuationImpl);
        return edit == CoroutineSingletons.COROUTINE_SUSPENDED ? edit : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.don0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        svk svkVar;
        int i;
        rvk rvkVar;
        a aVar;
        if (continuationImpl instanceof svk) {
            svkVar = (svk) continuationImpl;
            int i2 = svkVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                svkVar.label = i2 - Integer.MIN_VALUE;
                Object obj = svkVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = svkVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    svkVar.L$0 = this;
                    svkVar.L$1 = str;
                    svkVar.label = 1;
                    obj = this.a.read(svkVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rvkVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) svkVar.L$1;
                    rvkVar = (rvk) svkVar.L$0;
                    kotlin.a.a(obj);
                }
                aVar = (a) obj;
                if (aVar != null) {
                    return null;
                }
                Map<String, Long> map = aVar.a;
                rvkVar.getClass();
                return map.get(d(str));
            }
        }
        svkVar = new svk(this, continuationImpl);
        Object obj2 = svkVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = svkVar.label;
        if (i != 0) {
        }
        aVar = (a) obj2;
        if (aVar != null) {
        }
    }
}

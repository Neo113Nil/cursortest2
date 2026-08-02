package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.rustore.sdk.pushclient.l.c$c;
import ru.rustore.sdk.pushclient.l.c$d;
import ru.rustore.sdk.pushclient.l.c$e;

/* loaded from: classes9.dex */
public final class niy0 {
    public final FileDataStore<a> a;
    public final FileDataStore<b> b;

    public static final class a implements JsonSerializer {
        public static final C3400a c = new C3400a();
        public final String a;
        public final String b;

        /* renamed from: xsna.niy0$a$a, reason: collision with other inner class name */
        public static final class C3400a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.getString("master_host_package_name_key"), jSONObject.getString("master_host_public_key"));
            }
        }

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @Override // com.vk.push.core.filedatastore.JsonSerializer
        public final JSONObject toJson() {
            return new JSONObject().put("master_host_package_name_key", this.a).put("master_host_public_key", this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArbiterData(masterHostPackageName=");
            sb.append(this.a);
            sb.append(", masterHostPublicKey=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public static final class b implements JsonSerializer {
        public static final a b = new a();
        public final String a;

        public static final class a implements JsonDeserializer<b> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final b fromJson(JSONObject jSONObject) {
                return new b(jSONObject.getString("master_host_default_key"));
            }
        }

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.vk.push.core.filedatastore.JsonSerializer
        public final JSONObject toJson() {
            return new JSONObject().put("master_host_default_key", this.a);
        }

        public final String toString() {
            return ho8.a(new StringBuilder("DefaultMasterHostData(defaultMasterHostPackageName="), this.a, ')');
        }
    }

    public niy0(FileDataStore<a> fileDataStore, FileDataStore<b> fileDataStore2) {
        this.a = fileDataStore;
        this.b = fileDataStore2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AppInfo appInfo, ContinuationImpl continuationImpl) {
        c$e c_e;
        int i;
        niy0 niy0Var;
        String str;
        boolean z;
        AppInfo appInfo2;
        String str2;
        if (continuationImpl instanceof c$e) {
            c_e = (c$e) continuationImpl;
            int i2 = c_e.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c_e.e = i2 - Integer.MIN_VALUE;
                Object obj = c_e.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c_e.e;
                boolean z2 = false;
                if (i != 0) {
                    kotlin.a.a(obj);
                    c_e.a = this;
                    c_e.b = appInfo;
                    c_e.e = 1;
                    obj = this.b.read(c_e);
                    if (obj != coroutineSingletons) {
                        niy0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) c_e.b;
                    appInfo2 = (AppInfo) c_e.a;
                    kotlin.a.a(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    str = str2;
                    appInfo = appInfo2;
                    z = booleanValue;
                    if (!epx.f(str, appInfo != null ? appInfo.getPackageName() : null) && z) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
                appInfo = (AppInfo) c_e.b;
                niy0Var = (niy0) c_e.a;
                kotlin.a.a(obj);
                b bVar = (b) obj;
                str = bVar == null ? bVar.a : null;
                if (appInfo != null) {
                    z = false;
                    if (!epx.f(str, appInfo != null ? appInfo.getPackageName() : null)) {
                    }
                    return Boolean.valueOf(z2);
                }
                FileDataStore<b> fileDataStore = niy0Var.b;
                b bVar2 = new b(appInfo.getPackageName());
                c_e.a = appInfo;
                c_e.b = str;
                c_e.e = 2;
                Object write = fileDataStore.write(bVar2, c_e);
                if (write != coroutineSingletons) {
                    appInfo2 = appInfo;
                    str2 = str;
                    obj = write;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    str = str2;
                    appInfo = appInfo2;
                    z = booleanValue2;
                    if (!epx.f(str, appInfo != null ? appInfo.getPackageName() : null)) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
                return coroutineSingletons;
            }
        }
        c_e = new c$e(this, continuationImpl);
        Object obj2 = c_e.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c_e.e;
        boolean z22 = false;
        if (i != 0) {
        }
        b bVar3 = (b) obj2;
        if (bVar3 == null) {
        }
        if (appInfo != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.clear(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        c$c c_c;
        int i;
        niy0 niy0Var;
        if (continuationImpl instanceof c$c) {
            c_c = (c$c) continuationImpl;
            int i2 = c_c.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c_c.d = i2 - Integer.MIN_VALUE;
                Object obj = c_c.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c_c.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    c_c.a = this;
                    c_c.d = 1;
                    if (this.a.clear(c_c) != coroutineSingletons) {
                        niy0Var = this;
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
                niy0Var = c_c.a;
                kotlin.a.a(obj);
                FileDataStore<b> fileDataStore = niy0Var.b;
                c_c.a = null;
                c_c.d = 2;
            }
        }
        c_c = new c$c(this, continuationImpl);
        Object obj2 = c_c.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c_c.d;
        if (i != 0) {
        }
        FileDataStore<b> fileDataStore2 = niy0Var.b;
        c_c.a = null;
        c_c.d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        c$d c_d;
        int i;
        a aVar;
        if (continuationImpl instanceof c$d) {
            c_d = (c$d) continuationImpl;
            int i2 = c_d.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c_d.c = i2 - Integer.MIN_VALUE;
                Object obj = c_d.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c_d.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    c_d.c = 1;
                    obj = this.a.read(c_d);
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
                    return new AppInfo(aVar.a, aVar.b);
                }
                return null;
            }
        }
        c_d = new c$d(this, continuationImpl);
        Object obj2 = c_d.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c_d.c;
        if (i != 0) {
        }
        aVar = (a) obj2;
        if (aVar == null) {
        }
    }
}

package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.rustore.sdk.pushclient.A.b$c;
import ru.rustore.sdk.pushclient.A.b$d;
import ru.rustore.sdk.pushclient.A.b$e;
import ru.rustore.sdk.pushclient.A.b$f;
import ru.rustore.sdk.pushclient.A.b$g;
import ru.rustore.sdk.pushclient.A.b$h;
import ru.rustore.sdk.pushclient.A.b$i;

/* loaded from: classes9.dex */
public final class cfy0 implements s9y0 {
    public final FileDataStore<a> a;
    public final FileDataStore<b> b;

    public static final class a implements JsonSerializer {
        public static final C2664a b = new C2664a();
        public final String a;

        /* renamed from: xsna.cfy0$a$a, reason: collision with other inner class name */
        public static final class C2664a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.getString("push_token"));
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
            return new JSONObject().put("push_token", this.a);
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PushTokenData(pushToken="), this.a, ')');
        }
    }

    public static final class b implements JsonSerializer {
        public static final a c = new a();
        public final String a;
        public final boolean b;

        public static final class a implements JsonDeserializer<b> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final b fromJson(JSONObject jSONObject) {
                return new b(jSONObject.getString("last_delivered_push_token"), jSONObject.optBoolean("push_token_delivered"));
            }
        }

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        @Override // com.vk.push.core.filedatastore.JsonSerializer
        public final JSONObject toJson() {
            return new JSONObject().put("last_delivered_push_token", this.a).put("push_token_delivered", this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PushTokenDeliveryData(lastDeliveredPushToken=");
            sb.append(this.a);
            sb.append(", pushTokenDelivered=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public cfy0(FileDataStore<a> fileDataStore, FileDataStore<b> fileDataStore2) {
        this.a = fileDataStore;
        this.b = fileDataStore2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.s9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        b$f b_f;
        int i;
        a aVar;
        if (continuationImpl instanceof b$f) {
            b_f = (b$f) continuationImpl;
            int i2 = b_f.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_f.c = i2 - Integer.MIN_VALUE;
                Object obj = b_f.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_f.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b_f.c = 1;
                    obj = this.a.read(b_f);
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
        b_f = new b$f(this, continuationImpl);
        Object obj2 = b_f.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_f.c;
        if (i != 0) {
        }
        aVar = (a) obj2;
        if (aVar == null) {
        }
    }

    @Override // xsna.s9y0
    public final Object b(String str, ContinuationImpl continuationImpl) {
        return this.a.write(new a(str), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r2.write(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.s9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        b$i b_i;
        int i;
        cfy0 cfy0Var;
        b bVar;
        String str;
        if (continuationImpl instanceof b$i) {
            b_i = (b$i) continuationImpl;
            int i2 = b_i.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_i.d = i2 - Integer.MIN_VALUE;
                Object obj = b_i.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_i.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b_i.a = this;
                    b_i.d = 1;
                    obj = this.b.read(b_i);
                    if (obj != coroutineSingletons) {
                        cfy0Var = this;
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
                cfy0Var = b_i.a;
                kotlin.a.a(obj);
                bVar = (b) obj;
                if (bVar != null || (str = bVar.a) == null) {
                    return s3q0.a;
                }
                FileDataStore<b> fileDataStore = cfy0Var.b;
                b bVar2 = new b(str, true);
                b_i.a = null;
                b_i.d = 2;
            }
        }
        b_i = new b$i(this, continuationImpl);
        Object obj2 = b_i.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_i.d;
        if (i != 0) {
        }
        bVar = (b) obj2;
        if (bVar != null) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.s9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        b$e b_e;
        int i;
        if (continuationImpl instanceof b$e) {
            b_e = (b$e) continuationImpl;
            int i2 = b_e.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_e.c = i2 - Integer.MIN_VALUE;
                Object obj = b_e.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_e.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b_e.c = 1;
                    obj = this.a.read(b_e);
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
                String str = aVar == null ? aVar.a : null;
                return str != null ? "" : str;
            }
        }
        b_e = new b$e(this, continuationImpl);
        Object obj2 = b_e.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_e.c;
        if (i != 0) {
        }
        a aVar2 = (a) obj2;
        if (aVar2 == null) {
        }
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.s9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        b$g b_g;
        int i;
        if (continuationImpl instanceof b$g) {
            b_g = (b$g) continuationImpl;
            int i2 = b_g.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_g.c = i2 - Integer.MIN_VALUE;
                Object obj = b_g.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_g.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b_g.c = 1;
                    obj = this.b.read(b_g);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                b bVar = (b) obj;
                return Boolean.valueOf(bVar == null && bVar.b);
            }
        }
        b_g = new b$g(this, continuationImpl);
        Object obj2 = b_g.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_g.c;
        if (i != 0) {
        }
        b bVar2 = (b) obj2;
        return Boolean.valueOf(bVar2 == null && bVar2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.s9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        b$d b_d;
        int i;
        b bVar;
        if (continuationImpl instanceof b$d) {
            b_d = (b$d) continuationImpl;
            int i2 = b_d.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_d.c = i2 - Integer.MIN_VALUE;
                Object obj = b_d.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_d.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b_d.c = 1;
                    obj = this.b.read(b_d);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                bVar = (b) obj;
                if (bVar == null) {
                    return bVar.a;
                }
                return null;
            }
        }
        b_d = new b$d(this, continuationImpl);
        Object obj2 = b_d.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_d.c;
        if (i != 0) {
        }
        bVar = (b) obj2;
        if (bVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.clear(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.s9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        b$c b_c;
        int i;
        cfy0 cfy0Var;
        if (continuationImpl instanceof b$c) {
            b_c = (b$c) continuationImpl;
            int i2 = b_c.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_c.d = i2 - Integer.MIN_VALUE;
                Object obj = b_c.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_c.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b_c.a = this;
                    b_c.d = 1;
                    if (this.a.clear(b_c) != coroutineSingletons) {
                        cfy0Var = this;
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
                cfy0Var = b_c.a;
                kotlin.a.a(obj);
                FileDataStore<b> fileDataStore = cfy0Var.b;
                b_c.a = null;
                b_c.d = 2;
            }
        }
        b_c = new b$c(this, continuationImpl);
        Object obj2 = b_c.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_c.d;
        if (i != 0) {
        }
        FileDataStore<b> fileDataStore2 = cfy0Var.b;
        b_c.a = null;
        b_c.d = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r2.write(r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.s9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, ContinuationImpl continuationImpl) {
        b$h b_h;
        int i;
        cfy0 cfy0Var;
        if (continuationImpl instanceof b$h) {
            b_h = (b$h) continuationImpl;
            int i2 = b_h.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_h.e = i2 - Integer.MIN_VALUE;
                Object obj = b_h.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_h.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b_h.a = this;
                    b_h.b = str;
                    b_h.e = 1;
                    obj = this.b.read(b_h);
                    if (obj != coroutineSingletons) {
                        cfy0Var = this;
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
                str = b_h.b;
                cfy0Var = b_h.a;
                kotlin.a.a(obj);
                b bVar = (b) obj;
                boolean z = bVar == null ? bVar.b : false;
                FileDataStore<b> fileDataStore = cfy0Var.b;
                b bVar2 = new b(str, z);
                b_h.a = null;
                b_h.b = null;
                b_h.e = 2;
            }
        }
        b_h = new b$h(this, continuationImpl);
        Object obj2 = b_h.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_h.e;
        if (i != 0) {
        }
        b bVar3 = (b) obj2;
        if (bVar3 == null) {
        }
        FileDataStore<b> fileDataStore2 = cfy0Var.b;
        b bVar22 = new b(str, z);
        b_h.a = null;
        b_h.b = null;
        b_h.e = 2;
    }
}

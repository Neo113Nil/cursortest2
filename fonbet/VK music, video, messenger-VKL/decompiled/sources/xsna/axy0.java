package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.rustore.sdk.pushclient.l.g$b;

/* loaded from: classes9.dex */
public final class axy0 {
    public final FileDataStore<a> a;

    public static final class a implements JsonSerializer {
        public static final C2579a b = new C2579a();
        public final boolean a;

        /* renamed from: xsna.axy0$a$a, reason: collision with other inner class name */
        public static final class C2579a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.optBoolean("test_mode_enabled"));
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
            return new JSONObject().put("test_mode_enabled", this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SdkModeData(testModeEnabled="), this.a, ')');
        }
    }

    public axy0(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        g$b g_b;
        CoroutineSingletons coroutineSingletons;
        int i;
        axy0 axy0Var;
        boolean z;
        Object write;
        int i2;
        boolean z2;
        if (continuationImpl instanceof g$b) {
            g_b = (g$b) continuationImpl;
            int i3 = g_b.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g_b.f = i3 - Integer.MIN_VALUE;
                Object obj = g_b.d;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = g_b.f;
                boolean z3 = false;
                if (i != 0) {
                    kotlin.a.a(obj);
                    g_b.a = this;
                    g_b.b = false;
                    g_b.f = 1;
                    obj = this.a.read(g_b);
                    if (obj != coroutineSingletons) {
                        axy0Var = this;
                        z = false;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = g_b.c;
                    z2 = g_b.b;
                    kotlin.a.a(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (i2 != z2 && booleanValue) {
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
                z = g_b.b;
                axy0Var = g_b.a;
                kotlin.a.a(obj);
                a aVar = (a) obj;
                int i4 = aVar == null ? aVar.a : 0;
                FileDataStore<a> fileDataStore = axy0Var.a;
                a aVar2 = new a(z);
                g_b.a = null;
                g_b.b = z;
                g_b.c = i4;
                g_b.f = 2;
                write = fileDataStore.write(aVar2, g_b);
                if (write != coroutineSingletons) {
                    i2 = i4;
                    obj = write;
                    z2 = z;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    if (i2 != z2) {
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
                return coroutineSingletons;
            }
        }
        g_b = new g$b(this, continuationImpl);
        Object obj2 = g_b.d;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = g_b.f;
        boolean z32 = false;
        if (i != 0) {
        }
        a aVar3 = (a) obj2;
        if (aVar3 == null) {
        }
        FileDataStore<a> fileDataStore2 = axy0Var.a;
        a aVar22 = new a(z);
        g_b.a = null;
        g_b.b = z;
        g_b.c = i4;
        g_b.f = 2;
        write = fileDataStore2.write(aVar22, g_b);
        if (write != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}

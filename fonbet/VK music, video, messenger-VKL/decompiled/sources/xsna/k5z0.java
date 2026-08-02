package xsna;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.rustore.sdk.pushclient.l.m$b;

/* loaded from: classes9.dex */
public final class k5z0 {
    public final FileDataStore<a> a;

    public static final class a implements JsonSerializer {
        public static final C3165a b = new C3165a();
        public final int a;

        /* renamed from: xsna.k5z0$a$a, reason: collision with other inner class name */
        public static final class C3165a implements JsonDeserializer<a> {
            @Override // com.vk.push.core.filedatastore.JsonDeserializer
            public final a fromJson(JSONObject jSONObject) {
                return new a(jSONObject.optInt("notification_id_key"));
            }
        }

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        @Override // com.vk.push.core.filedatastore.JsonSerializer
        public final JSONObject toJson() {
            return new JSONObject().put("notification_id_key", this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("NotificationIdData(notificationIdKey="), this.a, ')');
        }
    }

    public k5z0(FileDataStore<a> fileDataStore) {
        this.a = fileDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, ContinuationImpl continuationImpl) {
        m$b m_b;
        CoroutineSingletons coroutineSingletons;
        int i2;
        k5z0 k5z0Var;
        FileDataStore<a> fileDataStore;
        a aVar;
        a aVar2;
        if (continuationImpl instanceof m$b) {
            m_b = (m$b) continuationImpl;
            int i3 = m_b.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m_b.e = i3 - Integer.MIN_VALUE;
                Object obj = m_b.c;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = m_b.e;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    m_b.a = this;
                    m_b.b = i;
                    m_b.e = 1;
                    obj = this.a.read(m_b);
                    if (obj != coroutineSingletons) {
                        k5z0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = m_b.b;
                    aVar2 = (a) m_b.a;
                    kotlin.a.a(obj);
                    return Boolean.valueOf(!(aVar2 == null && aVar2.a == i));
                }
                i = m_b.b;
                k5z0Var = (k5z0) m_b.a;
                kotlin.a.a(obj);
                a aVar3 = (a) obj;
                fileDataStore = k5z0Var.a;
                aVar = new a(i);
                m_b.a = aVar3;
                m_b.b = i;
                m_b.e = 2;
                if (fileDataStore.write(aVar, m_b) != coroutineSingletons) {
                    aVar2 = aVar3;
                    return Boolean.valueOf(!(aVar2 == null && aVar2.a == i));
                }
                return coroutineSingletons;
            }
        }
        m_b = new m$b(this, continuationImpl);
        Object obj2 = m_b.c;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = m_b.e;
        if (i2 != 0) {
        }
        a aVar32 = (a) obj2;
        fileDataStore = k5z0Var.a;
        aVar = new a(i);
        m_b.a = aVar32;
        m_b.b = i;
        m_b.e = 2;
        if (fileDataStore.write(aVar, m_b) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}

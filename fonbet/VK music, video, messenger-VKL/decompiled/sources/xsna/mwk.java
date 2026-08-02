package xsna;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.push.pushsdk.data.VkpnsPushDatabase;
import kotlin.jvm.internal.Lambda;

/* compiled from: DatabaseModule.kt */
/* loaded from: classes5.dex */
public final class mwk {
    public static final bpn0 a = new bpn0(b.i);
    public static final bpn0 b = new bpn0(a.i);
    public static final bpn0 c = new bpn0(c.i);

    /* compiled from: DatabaseModule.kt */
    public static final class a extends Lambda implements gzs<VkpnsPushDatabase> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final VkpnsPushDatabase invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            RoomDatabase.a aVar = ((ail0) mwk.a.getValue()).a() ? new RoomDatabase.a(applicationContext, null, VkpnsPushDatabase.class) : androidx.room.i.a(applicationContext, "vkpns_push_database", VkpnsPushDatabase.class);
            aVar.a(new lm20(3, 4, w4w0.i), new lm20(4, 5, x4w0.i), new lm20(7, 8, y4w0.i));
            aVar.m.add(Integer.valueOf(new int[]{1}[0]));
            aVar.p = true;
            aVar.q = true;
            aVar.c();
            return (VkpnsPushDatabase) aVar.b();
        }
    }

    /* compiled from: DatabaseModule.kt */
    public static final class b extends Lambda implements gzs<bil0> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final bil0 invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new bil0(vkpnsPushConfig.a.getApplicationContext());
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: DatabaseModule.kt */
    public static final class c extends Lambda implements gzs<yip0> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final yip0 invoke() {
            return new yip0((VkpnsPushDatabase) mwk.b.getValue());
        }
    }

    public static g790 a() {
        return ((VkpnsPushDatabase) b.getValue()).y();
    }

    public static fje0 b() {
        return ((VkpnsPushDatabase) b.getValue()).z();
    }

    public static ske0 c() {
        return ((VkpnsPushDatabase) b.getValue()).A();
    }

    public static xip0 d() {
        return (xip0) c.getValue();
    }
}

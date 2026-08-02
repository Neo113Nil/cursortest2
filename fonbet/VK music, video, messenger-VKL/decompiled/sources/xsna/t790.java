package xsna;

import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.vk.push.pushsdk.data.VkpnsPushDatabase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class t790 implements g790 {
    public final RoomDatabase a;
    public final k790 b;
    public final l790 c;
    public final m790 d;
    public final n790 e;

    public t790(VkpnsPushDatabase vkpnsPushDatabase) {
        this.a = vkpnsPushDatabase;
        this.b = new k790(vkpnsPushDatabase);
        this.c = new l790(vkpnsPushDatabase);
        this.d = new m790(vkpnsPushDatabase);
        this.e = new n790(vkpnsPushDatabase);
        new o790(vkpnsPushDatabase);
    }

    @Override // xsna.g790
    public final Object a(ric ricVar) {
        return fwj.a.b(this.a, true, new s790(this), ricVar);
    }

    @Override // xsna.g790
    public final Object d(String str, ilc ilcVar) {
        return fwj.a.b(this.a, true, new r790(this, str), ilcVar);
    }

    @Override // xsna.g790
    public final Object e(String str, ContinuationImpl continuationImpl) {
        dmg0 c = dmg0.c(1, "SELECT * FROM package_info WHERE package_name = ?");
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        return fwj.a.a(this.a, new CancellationSignal(), new j790(this, c), continuationImpl);
    }

    @Override // xsna.g790
    public final Object f(e790 e790Var, ContinuationImpl continuationImpl) {
        return fwj.a.b(this.a, true, new q790(this, e790Var), continuationImpl);
    }

    @Override // xsna.g790
    public final Object g(com.vk.push.pushsdk.work.i iVar) {
        dmg0 c = dmg0.c(0, "SELECT package_name FROM package_info");
        return fwj.a.a(this.a, new CancellationSignal(), new i790(0, this, c), iVar);
    }

    @Override // xsna.g790
    public final FlowUtil$createFlow$$inlined$map$1 getAll() {
        h790 h790Var = new h790(0, this, dmg0.c(0, "SELECT * FROM package_info"));
        return fwj.a(this.a, new String[]{"package_info"}, h790Var);
    }

    @Override // xsna.g790
    public final Object h(e790 e790Var, p3x p3xVar) {
        return fwj.a.b(this.a, true, new p790(this, e790Var), p3xVar);
    }
}

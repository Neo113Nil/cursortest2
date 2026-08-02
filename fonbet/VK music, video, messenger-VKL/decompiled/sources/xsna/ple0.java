package xsna;

import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.vk.push.pushsdk.data.VkpnsPushDatabase;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.ihe0;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class ple0 implements ske0 {
    public final RoomDatabase a;
    public final cle0 b;
    public final hle0 c;
    public final ile0 d;
    public final jle0 e;
    public final kle0 f;
    public final lle0 g;

    public ple0(VkpnsPushDatabase vkpnsPushDatabase) {
        this.a = vkpnsPushDatabase;
        this.b = new cle0(vkpnsPushDatabase);
        this.c = new hle0(vkpnsPushDatabase);
        this.d = new ile0(vkpnsPushDatabase);
        this.e = new jle0(vkpnsPushDatabase);
        this.f = new kle0(vkpnsPushDatabase);
        this.g = new lle0(vkpnsPushDatabase);
    }

    @Override // xsna.ske0
    public final Object a(ric ricVar) {
        return fwj.a.b(this.a, true, new uke0(this), ricVar);
    }

    @Override // xsna.ske0
    public final Object b(String str, lji0 lji0Var) {
        dmg0 c = dmg0.c(1, "SELECT `token`, `project_id`, `invalidate_time` FROM (SELECT * FROM push_token WHERE token = ?)");
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        return fwj.a.a(this.a, new CancellationSignal(), new ale0(this, c), lji0Var);
    }

    @Override // xsna.ske0
    public final Object c(pke0 pke0Var, ContinuationImpl continuationImpl) {
        return fwj.a.b(this.a, true, new ole0(this, pke0Var), continuationImpl);
    }

    @Override // xsna.ske0
    public final Object d(String str, ilc ilcVar) {
        return fwj.a.b(this.a, true, new tke0(this, str), ilcVar);
    }

    @Override // xsna.ske0
    public final Object e(pke0 pke0Var, ContinuationImpl continuationImpl) {
        return fwj.a.b(this.a, true, new mle0(this, pke0Var), continuationImpl);
    }

    @Override // xsna.ske0
    public final Object f(ArrayList arrayList, com.vk.push.pushsdk.work.j jVar) {
        return fwj.a.b(this.a, true, new gle0(this, arrayList), jVar);
    }

    @Override // xsna.ske0
    public final Object g(String str, ilc ilcVar) {
        dmg0 c = dmg0.c(1, "SELECT token FROM push_token INNER JOIN package_info on package_info.package_id = push_token.package_info_id WHERE package_info.package_name = ?");
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        return fwj.a.a(this.a, new CancellationSignal(), new dle0(this, c), ilcVar);
    }

    @Override // xsna.ske0
    public final Object h(String str, ContinuationImpl continuationImpl) {
        dmg0 c = dmg0.c(1, "SELECT `package_id`, `package_name`, `sha_hash`, `package_invalidate_time` FROM (SELECT * FROM package_info INNER JOIN push_token on package_info.package_id = push_token.package_info_id WHERE push_token.token = ?)");
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        return fwj.a.a(this.a, new CancellationSignal(), new fle0(this, c), continuationImpl);
    }

    @Override // xsna.ske0
    public final Object i(pke0 pke0Var, ihe0.a aVar) {
        return fwj.a.b(this.a, true, new nle0(this, pke0Var), aVar);
    }

    @Override // xsna.ske0
    public final FlowUtil$createFlow$$inlined$map$1 j() {
        xke0 xke0Var = new xke0(this, dmg0.c(0, "SELECT `token`, `project_id`, `invalidate_time` FROM (SELECT * FROM push_token WHERE test_token IS 0)"));
        return fwj.a(this.a, new String[]{"push_token"}, xke0Var);
    }

    @Override // xsna.ske0
    public final FlowUtil$createFlow$$inlined$map$1 k() {
        yke0 yke0Var = new yke0(this, dmg0.c(0, "SELECT COUNT(*) FROM push_token"));
        return fwj.a(this.a, new String[]{"push_token"}, yke0Var);
    }

    @Override // xsna.ske0
    public final FlowUtil$createFlow$$inlined$map$1 l(String str) {
        dmg0 c = dmg0.c(1, "SELECT `package_info_id`, `token`, `project_id`, `created_time`, `invalidate_time`, `test_token` FROM (SELECT * FROM push_token INNER JOIN package_info on package_info.package_id = push_token.package_info_id WHERE invalidate_time IS NOT NULL AND package_info.package_name = ?)");
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        ele0 ele0Var = new ele0(this, c);
        return fwj.a(this.a, new String[]{"push_token", "package_info"}, ele0Var);
    }

    @Override // xsna.ske0
    public final Object m(String str, ContinuationImpl continuationImpl) {
        dmg0 c = dmg0.c(1, "SELECT EXISTS(SELECT 1 FROM push_token WHERE token = ?)");
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        return fwj.a.a(this.a, new CancellationSignal(), new ble0(this, c), continuationImpl);
    }

    @Override // xsna.ske0
    public final Object n(ContinuationImpl continuationImpl) {
        dmg0 c = dmg0.c(0, "SELECT `token`, `project_id`, `invalidate_time` FROM (SELECT * FROM push_token WHERE test_token IS 0)");
        return fwj.a.a(this.a, new CancellationSignal(), new wke0(this, c), continuationImpl);
    }

    @Override // xsna.ske0
    public final Object o(long j, ContinuationImpl continuationImpl) {
        dmg0 c = dmg0.c(1, "SELECT token FROM push_token WHERE package_info_id = ?");
        c.bindLong(1, j);
        return fwj.a.a(this.a, new CancellationSignal(), new zke0(this, c), continuationImpl);
    }

    @Override // xsna.ske0
    public final Object p(String str, long j, t5w0 t5w0Var) {
        return fwj.a.b(this.a, true, new vke0(this, j, str), t5w0Var);
    }
}

package xsna;

import android.content.SharedPreferences;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.preference.Preference;
import com.vk.libdelayedjobs.WorkPolicy;
import com.vk.log.L;
import java.util.concurrent.TimeUnit;
import xsna.gx8;
import xsna.tjd;

/* compiled from: ClipsBlacklistsRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class vjd implements tjd, gx8.a {
    public static final vjd b = new vjd();
    public static final bpn0 c;
    public static final String d;
    public static final CacheTarget e;

    static {
        bpn0 bpn0Var = new bpn0(new w94(2));
        c = bpn0Var;
        d = "clips media blacklist cache";
        e = CacheTarget.OTHER;
        boolean contains = ((SharedPreferences) bpn0Var.getValue()).contains("pref_morphing_blacklist");
        boolean z = !contains;
        ((xsl) uh.b.b()).e("SyncClipsBlacklistsJob", new fon0(new fyx()), new lx90(2L, TimeUnit.DAYS, usl.a(usl.h, !contains ? WorkPolicy.REPLACE : WorkPolicy.KEEP, 250)));
        L.p("ClipsBlacklistsRepositoryImpl", "Created, need resync: " + z);
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return e;
    }

    @Override // xsna.tjd
    public final boolean b() {
        return ((SharedPreferences) c.getValue()).getBoolean("pref_morphing_blacklist", tjd.a.a.getSTUB().b());
    }

    @Override // xsna.tjd
    public final boolean c() {
        return ((SharedPreferences) c.getValue()).getBoolean("pref_codec_blacklist", tjd.a.a.getSTUB().c());
    }

    @Override // xsna.tjd
    public final boolean d() {
        return ((SharedPreferences) c.getValue()).getBoolean("pref_tensorflow_blacklist", tjd.a.a.getSTUB().d());
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        Preference.B("prefs_blacklists");
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return d;
    }

    @Override // xsna.gx8.a
    public final long u() {
        return 0L;
    }
}

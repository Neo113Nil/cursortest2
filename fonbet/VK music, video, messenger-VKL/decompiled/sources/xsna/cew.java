package xsna;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.dialogs.c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.gx8;

/* compiled from: ImUiPrefs.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class cew implements yzp0, gx8.a {
    public static final cew b;
    public static final /* synthetic */ qcy<Object>[] c;
    public static final g9e0 d;
    public static final g9e0 e;
    public static final io.reactivex.rxjava3.subjects.f<Boolean> f;
    public static final io.reactivex.rxjava3.subjects.f<Integer> g;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(cew.class, "prefs", "getPrefs()Landroid/content/SharedPreferences;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
        b = new cew();
        g9e0 g9e0Var = new g9e0(new xb3(4));
        d = g9e0Var;
        e = g9e0Var;
        f = new io.reactivex.rxjava3.subjects.f<>();
        new bpn0(new xh6(5));
        TimeUnit.HOURS.toMillis(6L);
        new io.reactivex.rxjava3.subjects.f();
        new io.reactivex.rxjava3.subjects.f();
        new io.reactivex.rxjava3.subjects.f();
        new io.reactivex.rxjava3.subjects.f();
        g = new io.reactivex.rxjava3.subjects.f<>();
    }

    public static void c(SharedPreferences sharedPreferences) {
        boolean z = sharedPreferences.getBoolean("pref_cfg_auth_libverify", true);
        String string = sharedPreferences.getString("pref_cfg_chat_overriden_theme", c.g.c.a);
        boolean z2 = sharedPreferences.getBoolean("pref_cfg_chat_should_override_theme", false);
        sharedPreferences.edit().clear().apply();
        sharedPreferences.edit().putBoolean("pref_cfg_auth_libverify", z).apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("pref_cfg_chat_overriden_theme", string);
        edit.apply();
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putBoolean("pref_cfg_chat_should_override_theme", z2);
        edit2.apply();
        f.onNext(Boolean.valueOf(z2));
    }

    public static boolean d() {
        return h().getBoolean("pref_cfg_chat_should_override_theme", false);
    }

    public static qvw e(String str) {
        String string = h().getString("pref_banner_show_count_with_limit_".concat(str), null);
        if (string != null) {
            List b0 = drm0.b0(string, new char[]{'_'}, 0, 6);
            String str2 = (String) j5g.b0(0, b0);
            Integer m = str2 != null ? arm0.m(10, str2) : null;
            String str3 = (String) j5g.b0(1, b0);
            Integer m2 = str3 != null ? arm0.m(10, str3) : null;
            if (m != null && m2 != null) {
                return new qvw(m.intValue(), m2.intValue());
            }
        }
        return null;
    }

    public static MsgReadAsLastData f(long j) {
        return g(h(), j);
    }

    public static MsgReadAsLastData g(SharedPreferences sharedPreferences, long j) {
        String string = sharedPreferences.getString("pref_msg_read_as_last_count_" + j, null);
        if (string != null) {
            List b0 = drm0.b0(string, new char[]{'~'}, 0, 6);
            String str = (String) j5g.b0(0, b0);
            Integer m = str != null ? arm0.m(10, str) : null;
            String str2 = (String) j5g.b0(1, b0);
            Integer m2 = str2 != null ? arm0.m(10, str2) : null;
            String str3 = (String) j5g.b0(2, b0);
            Boolean valueOf = str3 != null ? Boolean.valueOf(Boolean.parseBoolean(str3)) : null;
            String str4 = (String) j5g.b0(3, b0);
            Integer m3 = str4 != null ? arm0.m(10, str4) : null;
            MsgReadAsLastData.MsgType.a aVar = MsgReadAsLastData.MsgType.Companion;
            String str5 = (String) j5g.b0(4, b0);
            aVar.getClass();
            MsgReadAsLastData.MsgType a = MsgReadAsLastData.MsgType.a.a(str5);
            if (m != null && m2 != null && valueOf != null && a != null) {
                return new MsgReadAsLastData(m.intValue(), m2.intValue(), valueOf.booleanValue(), m3, a);
            }
        }
        return null;
    }

    public static SharedPreferences h() {
        qcy<Object> qcyVar = c[0];
        return (SharedPreferences) e.b();
    }

    public static boolean i() {
        return h().getBoolean("pref_channel_post_story_autorepost_enabled", true);
    }

    public static void j(String str, qvw qvwVar) {
        SharedPreferences h = h();
        StringBuilder sb = new StringBuilder();
        sb.append(qvwVar.c());
        sb.append('_');
        sb.append(qvwVar.b());
        h.edit().putString("pref_banner_show_count_with_limit_".concat(str), sb.toString()).apply();
    }

    public static void k(SharedPreferences sharedPreferences, long j, MsgReadAsLastData msgReadAsLastData) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(msgReadAsLastData.b());
        sb2.append('~');
        sb2.append(msgReadAsLastData.e());
        sb2.append('~');
        sb2.append(msgReadAsLastData.f());
        if (msgReadAsLastData.c() != null) {
            sb = new StringBuilder("~");
            sb.append(msgReadAsLastData.c());
        } else {
            sb = new StringBuilder("~~");
            sb.append(msgReadAsLastData.d().i());
        }
        sb2.append(sb.toString());
        String sb3 = sb2.toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("pref_msg_read_as_last_count_" + j, sb3);
        edit.apply();
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.SYSTEM;
    }

    @Override // xsna.yzp0
    public final boolean b() {
        return h().getBoolean("cfg_history_span_debug_toast_enabled", false);
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        c(h());
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "ImUiPrefs";
    }

    @Override // xsna.gx8.a
    public final long u() {
        return 0L;
    }
}

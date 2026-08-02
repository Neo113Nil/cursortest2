package com.vkontakte.android;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.core.preference.Preference;
import com.vk.core.utils.newtork.b;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.log.L;
import com.vk.tabbar.core.api.di.TabbarCoreComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.bxp0;
import xsna.bxx;
import xsna.cfr0;
import xsna.dst0;
import xsna.dy2;
import xsna.e43;
import xsna.ext;
import xsna.gun0;
import xsna.hf8;
import xsna.hp;
import xsna.i9r0;
import xsna.j6i;
import xsna.jx2;
import xsna.k840;
import xsna.l6x;
import xsna.l7r;
import xsna.m6r0;
import xsna.m6x;
import xsna.m7m;
import xsna.mp;
import xsna.mui0;
import xsna.o25;
import xsna.og0;
import xsna.pvo0;
import xsna.q6r0;
import xsna.r55;
import xsna.r560;
import xsna.rhp0;
import xsna.rsg0;
import xsna.s560;
import xsna.sr10;
import xsna.t560;
import xsna.t6g0;
import xsna.tga0;
import xsna.txz;
import xsna.ukg;
import xsna.usi0;
import xsna.wtn0;

/* loaded from: classes11.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    public static NetworkStateReceiver d;
    public static final long e = TimeUnit.HOURS.toSeconds(2);
    public static final int[] f = {1500, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, RtpSenderHelper.AUDIO_BITRATE_MIN, 12000, 24000};
    public static final ConnectivityManager g = (ConnectivityManager) e43.a.getSystemService("connectivity");

    @NonNull
    public static c h = new f(io.reactivex.rxjava3.internal.functions.a.b);
    public volatile boolean a = false;
    public volatile boolean b = false;
    public int c = 5;

    private NetworkStateReceiver() {
    }

    public static NetworkStateReceiver a() {
        NetworkStateReceiver networkStateReceiver = d;
        if (networkStateReceiver != null) {
            return networkStateReceiver;
        }
        synchronized (NetworkStateReceiver.class) {
            try {
                if (d == null) {
                    d = new NetworkStateReceiver();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public static boolean b() {
        b.a.getClass();
        if (b.e()) {
            return b.d();
        }
        try {
            NetworkInfo activeNetworkInfo = g.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void c(ext.b bVar, boolean z) {
        int i;
        k840.a.i.k(bVar.a.d(m6r0.y), bVar.a.e(m6r0.x));
        a().b = true;
        ArrayList arrayList = ukg.b.e;
        m6r0 m6r0Var = bVar.a;
        l7r l7rVar = m6r0.q0;
        com.vk.dto.hints.a aVar = (com.vk.dto.hints.a) ((bxx) m6r0Var.a(l7rVar));
        if (aVar != null) {
            bVar.a.f(l7rVar, aVar.b(arrayList));
        }
        if (!o25.a().a(bVar.a.y()) || o25.a().a(q6r0.f().y())) {
            m6r0 m6r0Var2 = q6r0.a;
            m6r0 m6r0Var3 = new m6r0(q6r0.f());
            String r = m6r0Var3.r();
            i9r0.a aVar2 = i9r0.a;
            m6r0Var3.i(bVar.a);
            if (q6r0.k(m6r0Var3, false)) {
                if (!TextUtils.equals(r, bVar.a.r())) {
                    mp mpVar = (mp) q6r0.h.getValue();
                    r55 r55Var = r55.a;
                    og0 og0Var = new og0(mpVar, r55.d());
                    String str = bVar.d;
                    if (str == null || str.isEmpty()) {
                        str = og0Var.b(m6r0Var3.y());
                    }
                    String str2 = str;
                    UserId y = m6r0Var3.y();
                    String valueOf = String.valueOf(m6r0Var3.y().b);
                    String k = m6r0Var3.k();
                    String v = m6r0Var3.v();
                    int l = m6r0Var3.l();
                    long x = m6r0Var3.x();
                    UserId y2 = m6r0Var3.y();
                    ArrayList e2 = ((mui0) q6r0.d.getValue()).e();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= e2.size()) {
                            i2 = 0;
                            break;
                        } else if (((usi0.a) e2.get(i2)).c().b().equals(y2)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    hp hpVar = new hp(y, valueOf, k, v, l, x, i2, str2, AccountProfileType.NORMAL, null);
                    synchronized (i9r0.class) {
                        i9r0.a.b(hpVar);
                    }
                }
                if (!z) {
                    cfr0.a(bVar, false);
                }
            }
            hf8.a(new Intent("com.vkontakte.android.ACTION_PROFILE_UPDATED").putExtra("uid", m6r0Var3.y()));
        } else {
            bVar.a.G(o25.a().c());
            bVar.a.C(o25.a().h());
            bVar.a.D(o25.a().I());
            bVar.a.F(o25.a().r());
            q6r0.i(bVar.a, bVar);
        }
        if (bVar.b != null) {
            TabbarCoreComponent tabbarCoreComponent = (TabbarCoreComponent) j6i.b(m7m.f(new t560()), TabbarCoreComponent.class);
            wtn0 y8 = tabbarCoreComponent.y8();
            tabbarCoreComponent.m8();
            y8.d(gun0.a(bVar.b), true);
        }
        m6r0 f2 = q6r0.f();
        long e3 = UserProfile.e(f2.H());
        com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
        rhp0 rhp0Var = new rhp0();
        rhp0Var.a.putLong(CommonConstant.RETKEY.USERID, f2.y().b);
        UserSex w = bVar.a.w();
        w.getClass();
        int i3 = UserSex.b.$EnumSwitchMapping$0[w.ordinal()];
        if (i3 != 1) {
            i = 2;
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
        } else {
            i = 0;
        }
        rhp0Var.a.putInt(CommonConstant.RETKEY.GENDER, i);
        rhp0Var.a.putBoolean("LOCATION_TRACKING_ENABLED", txz.b());
        rhp0Var.a.putInt("AGE", (int) e3);
        bVar2.f(rhp0Var.a);
        if (o25.a().b()) {
            if (((int) (System.currentTimeMillis() / 1000)) - Preference.l().getInt("last_friends_update", 0) >= e) {
                Preference.l().edit().putInt("last_friends_update", (int) (System.currentTimeMillis() / 1000)).apply();
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
            }
        }
        SharedPreferences l2 = Preference.l();
        int i4 = l2.getInt("stats_daily_last_updated", 0);
        int a = pvo0.a();
        String str3 = null;
        if (a - i4 > TimeUtils.SECONDS_PER_DAY) {
            b.d dVar = new b.d("autoplay_state");
            dVar.j();
            dVar.b("gif", "type");
            sr10 sr10Var = dy2.a;
            dVar.b(sr10Var != null ? sr10Var.i() : null, "value");
            dVar.e();
            b.d dVar2 = new b.d("autoplay_state");
            dVar2.j();
            dVar2.b("video", "type");
            sr10 sr10Var2 = dy2.a;
            dVar2.b(sr10Var2 != null ? sr10Var2.i() : null, "value");
            dVar2.e();
            l2.edit().putInt("stats_daily_last_updated", a).apply();
        }
        List<String> list = m6x.a;
        if (System.currentTimeMillis() - Preference.m(0L, "InstalledAppsTracker", "last_sent_apps") > TimeUnit.DAYS.toMillis(1L) && q6r0.f().e(m6r0.v) && Preference.j().getBoolean("trackInstalledApps", true)) {
            try {
                JSONArray jSONArray = new JSONArray();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                for (PackageInfo packageInfo : context.getApplicationContext().getPackageManager().getInstalledPackages(0)) {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null) {
                        if (applicationInfo.enabled) {
                            if ((applicationInfo.flags & 1) != 0 && !m6x.a.contains(packageInfo.packageName)) {
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("package", packageInfo.packageName);
                            long j = 1000;
                            jSONObject.put("installed", (int) (packageInfo.firstInstallTime / j));
                            jSONObject.put("updated", (int) (packageInfo.lastUpdateTime / j));
                            ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                            if (((applicationInfo2 != null ? applicationInfo2.flags : 0) & 1) > 0) {
                                jSONObject.put("system", 1);
                            }
                            jSONObject.put("version", packageInfo.versionName);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                str3 = jSONArray.toString();
            } catch (Exception e4) {
                L.i(e4);
            }
        }
        if (str3 != null) {
            tga0 tga0Var = new tga0();
            tga0Var.K("apps", str3);
            tga0Var.K(O6.X0, com.vkontakte.android.data.b.h().r);
            new jx2(tga0Var, new l6x()).a();
        }
        dst0.b.c();
    }

    @SuppressLint({"CheckResult"})
    public static void d(boolean z) {
        if (o25.a().b()) {
            e43.a.getApplicationContext();
            ext extVar = new ext(false);
            extVar.o = "network_changed";
            h = ((!SakFeatures.Type.GET_USER_INFO_CUT_OFF_FROM_AUTH.h() || a().b || z) ? rsg0.T(extVar) : bxp0.c(rsg0.T(extVar), null, false)).subscribe(new r560(), new s560());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.TIME_SET".equals(intent.getAction()) || "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
            d(false);
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            boolean z = !intent.getBooleanExtra("noConnectivity", false) && b();
            if (this.a == z) {
                return;
            }
            this.a = z;
            if (this.a && !a().b) {
                d(false);
            }
        }
    }
}

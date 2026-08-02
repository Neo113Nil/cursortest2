package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import com.vk.dto.music.SuggestMusicNotificationInfo;
import com.vk.libvideo.live.impl.activity.LivePlayerActivity;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vk.voip.VoipCallActivity;
import com.vkontakte.android.ConfirmActionActivity;
import com.vkontakte.android.SDKAuthActivity;
import com.vkontakte.android.ValidationActivity;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import xsna.k840;
import xsna.zsu0;

/* compiled from: HeadsetNotificationManager.kt */
/* loaded from: classes.dex */
public final class bzu implements xyu, w8i {
    public static boolean c = true;
    public static long d;
    public static io.reactivex.rxjava3.disposables.c j;
    public static dau0 k;
    public static mn8 l;
    public static final bzu b = new bzu();
    public static final long e = System.currentTimeMillis();
    public static final bpn0 f = new bpn0(new mb3(6));
    public static final bpn0 g = new bpn0(new xh6(4));
    public static final long h = TimeUnit.HOURS.toMillis(1);
    public static final long i = TimeUnit.MINUTES.toMillis(10);
    public static final bpn0 m = new bpn0(new y56(2));
    public static final bpn0 n = new bpn0(new kb0(2));
    public static final bpn0 o = new bpn0(new ihg(1));

    public static void b() {
        ((SharedPreferences) f.getValue()).edit().putLong("__KEY_LAST_INSERTED_TIME__", 0L).apply();
    }

    public static final void c() {
        bn40.f("HSNMan", "hide headset notification");
        io.reactivex.rxjava3.disposables.c cVar = j;
        if (cVar != null) {
            cVar.dispose();
        }
        j = null;
        com.vk.music.notifications.inapp.b.a();
    }

    public static boolean d() {
        if (!((u2b0) n.getValue()).m0().i()) {
            return true;
        }
        r6m.a.getClass();
        Context context = r6m.e;
        if (context == null) {
            context = null;
        }
        return ((AudioManager) context.getSystemService("audio")).isMusicActive();
    }

    public static final void e() {
        if (((com.vk.music.pref.a) o.getValue()).c0() + (k840.b.a.a ? i : h) < qni0.a()) {
            bn40.f("HSNMan", "show headset notification");
            if (j != null) {
                return;
            }
            com.vk.core.utils.newtork.b.a.getClass();
            boolean d2 = com.vk.core.utils.newtork.b.d();
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            j = ((!d2 || System.currentTimeMillis() - d <= 60000) ? wmi0.a.e("__KEY_SUGGEST_NOTIFICATIONS_CACHE__").E(new hms(new leq(10), 2), lVar, kVar, kVar).F(new pf1(new oqu(1), 20)) : rsg0.y0(new jp4(), null, null, 3).E(new kl6(new tb4(27), 22), lVar, kVar, kVar).F(new zyu(new x50(21), 0))).subscribe(new c3h(), new bn3(new sm0(27), 28), new io.reactivex.rxjava3.functions.a() { // from class: xsna.azu
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    bzu.j = null;
                }
            });
        }
    }

    public static void f(SuggestMusicNotificationInfo suggestMusicNotificationInfo) {
        Uri uri;
        mn8 mn8Var;
        Intent intent;
        bn40.f("HSNMan", "try to show notification = ", suggestMusicNotificationInfo);
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        Regex regex = zsu0.g;
        if (b2 == null || (intent = b2.getIntent()) == null || (uri = intent.getData()) == null) {
            uri = Uri.EMPTY;
        }
        boolean a = zsu0.a.a(uri);
        dau0 dau0Var = k;
        if (dau0Var == null || (mn8Var = l) == null || a) {
            return;
        }
        com.vk.music.notifications.inapp.b.f(new j3n0(suggestMusicNotificationInfo, (u750) g.getValue(), dau0Var, mn8Var), null, null, 14);
        ((com.vk.music.pref.a) o.getValue()).p(qni0.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (xsna.epx.f(r2, com.vk.libvideo.screen.VideoActivity.class) == false) goto L27;
     */
    @Override // xsna.xyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        boolean d2 = d();
        boolean b2 = o25.a().b();
        if (c) {
            if (k != null) {
                Handler handler = x93.a;
                c63 c63Var = c63.a;
                Activity b3 = c63.b();
                Class<?> cls = b3 != null ? b3.getClass() : null;
                if (!epx.f(cls, LivePlayerActivity.class)) {
                    if (!epx.f(cls, StoryCameraActivity.class)) {
                        if (!epx.f(cls, SDKAuthActivity.class)) {
                            if (!epx.f(cls, VoipCallActivity.class)) {
                                if (!epx.f(cls, ValidationActivity.class)) {
                                    if (!epx.f(cls, ConfirmActionActivity.class)) {
                                        if (!epx.f(cls, PostingAttachActivity.class)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z2 = false;
            bpn0 bpn0Var = f;
            boolean z3 = ((SharedPreferences) bpn0Var.getValue()).getBoolean("showMusicSuggestNotification", true);
            bn40.f("HSNMan", "onHeadsetStateChanged", "isLoggedIn:", Boolean.valueOf(b2), "isBlocked:", Boolean.valueOf(z2), "isEnabled:", Boolean.valueOf(z3), "isPlaying: ", Boolean.valueOf(d2), "isConnected: ", Boolean.valueOf(z));
            if (b2 || !z3 || z2 || d2) {
                return;
            }
            if (z) {
                c63 c63Var2 = c63.a;
                if (!c63.f) {
                    ((SharedPreferences) bpn0Var.getValue()).edit().putLong("__KEY_LAST_INSERTED_TIME__", System.currentTimeMillis()).apply();
                    return;
                }
            }
            if (!z) {
                b();
                c();
                return;
            } else {
                if (System.currentTimeMillis() - e > 3000) {
                    b();
                    e();
                    return;
                }
                return;
            }
        }
        z2 = true;
        bpn0 bpn0Var2 = f;
        boolean z32 = ((SharedPreferences) bpn0Var2.getValue()).getBoolean("showMusicSuggestNotification", true);
        bn40.f("HSNMan", "onHeadsetStateChanged", "isLoggedIn:", Boolean.valueOf(b2), "isBlocked:", Boolean.valueOf(z2), "isEnabled:", Boolean.valueOf(z32), "isPlaying: ", Boolean.valueOf(d2), "isConnected: ", Boolean.valueOf(z));
        if (b2) {
        }
    }
}

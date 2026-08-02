package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.videotracker.FullscreenTransition;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.RewindType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.media.player.PlayerError;
import com.vk.metrics.eventtracking.Event;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;

/* compiled from: VideoTracker.java */
/* loaded from: classes17.dex */
public final class rlt0 {

    @Nullable
    public final gzs<String> A;

    @Nullable
    public final gzs<rzr0> B;
    public int C;
    public PlayerType D;
    public ScreenType E;
    public final VideoFile a;
    public DeprecatedStatisticInterface b;

    @Nullable
    public List<PixelStats> c;
    public String d;
    public String e;

    @Nullable
    public String f;
    public boolean g;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;

    @Nullable
    public final gzs<Boolean> x;

    @Nullable
    public final gzs<Boolean> y;

    @Nullable
    public final gzs<Boolean> z;
    public int h = -1;
    public int i = -1;
    public int j = 0;
    public int k = 0;
    public long l = 0;
    public long m = 0;
    public long n = -1;
    public long o = -1;
    public final int u = iah0.f().densityDpi;
    public final int w = iah0.v();
    public final int v = iah0.u();

    public rlt0(VideoFile videoFile, String str, @Nullable String str2, boolean z, @Nullable ikk0 ikk0Var, @Nullable tbe0 tbe0Var, @Nullable irc0 irc0Var, @Nullable p1d0 p1d0Var, @Nullable afl0 afl0Var) {
        this.a = videoFile;
        this.f = videoFile.r();
        this.p = (int) (videoFile.getDuration() * 0.25f);
        this.q = (int) (videoFile.getDuration() * 0.5f);
        this.r = (int) (videoFile.getDuration() * 0.75f);
        this.s = (int) (videoFile.getDuration() * 0.95f);
        this.t = videoFile.getDuration() - 1;
        this.d = str;
        this.g = z;
        this.e = str2;
        this.x = tbe0Var;
        this.y = irc0Var;
        this.z = p1d0Var;
        this.A = afl0Var;
        this.B = ikk0Var;
    }

    public static boolean a(int i, int i2, int i3) {
        return i3 > i && i3 <= i2;
    }

    public static String c(float f) {
        if (f == 1.0f) {
            return "normal";
        }
        int i = (int) f;
        if (f != i) {
            return String.format(Locale.US, "%.2f", Float.valueOf(f));
        }
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb.toString();
    }

    public final Bundle b(String str, String str2) {
        Bundle a = q9k.a(NotificationCompat.CATEGORY_EVENT, str);
        if (str2 != null) {
            a.putString("value", str2);
        }
        a.putInt(X3.i.L, this.h);
        return a;
    }

    public final void d() {
        this.n = -1L;
        this.o = -1L;
        this.k = 0;
        this.l = 0L;
        this.m = 0L;
        this.h = -1;
    }

    public final void e(String str, int i, float f, float f2, boolean z, @Nullable String str2, int i2, int i3) {
        int i4;
        Bundle bundle = new Bundle();
        bundle.putString("autoplay", this.g ? "1" : "0");
        bundle.putString(X3.i.L, str);
        bundle.putInt("position_sec", i);
        bundle.putString("speed", c(f));
        boolean z2 = false;
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i4 = 0;
        } else {
            e1j0.a.getClass();
            i4 = e1j0.d;
        }
        bundle.putInt("volume", i4);
        bundle.putString("screen_crop", z ? "widen" : "narrow");
        bundle.putString("quality", d5b0.c(i2));
        bundle.putString("cur_quality", String.valueOf(i3));
        if (str2 != null) {
            bundle.putInt("is_sub_enabled", 1);
            bundle.putString("sub_lang", str2);
        } else {
            bundle.putInt("is_sub_enabled", 0);
        }
        Context context = r6m.e;
        if (context == null) {
            context = null;
        }
        boolean s = iah0.s(context);
        Context context2 = r6m.e;
        if (context2 == null) {
            context2 = null;
        }
        boolean z3 = Settings.System.getInt(context2.getContentResolver(), "accelerometer_rotation", 1) == 0;
        bundle.putString("screen_orientation", s ? X3.i.D : X3.i.C);
        bundle.putInt("is_portrait_only", (z3 && s) ? 1 : 0);
        bundle.putInt(CommonUrlParts.SCREEN_DPI, this.u);
        bundle.putInt("screen_pixels_h", this.v);
        bundle.putInt("screen_pixels_w", this.w);
        bundle.putString(StatCustomFieldKey.NETWORK_TYPE, com.vk.core.utils.newtork.b.c().c());
        sr10 sr10Var = dy2.a;
        Boolean g = sr10Var != null ? sr10Var.g() : null;
        if (g != null && g.booleanValue()) {
            z2 = true;
        }
        bundle.putBoolean("is_traffic_economy", z2);
        int i5 = this.i;
        if (i5 != -1) {
            bundle.putInt("item_position", i5);
        }
        int i6 = this.j;
        if (i6 != 0) {
            bundle.putInt("session_id", i6);
        }
        PlayerType playerType = this.D;
        if (playerType != null) {
            bundle.putString("player_type", playerType.toString().toLowerCase());
        }
        g("video_play", bundle);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(String str) {
        if (this.b != null) {
            qyk0.a().b(this.b, str);
            return;
        }
        List<PixelStats> list = this.c;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (PixelStats pixelStats : list) {
            AdsItemBlockAdStatPixelDto.TypeDto typeDto = pixelStats.c;
            if (typeDto != null && str.equals(typeDto.i())) {
                arrayList.add(pixelStats);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PixelStats pixelStats2 = (PixelStats) it.next();
            if (pixelStats2 != null) {
                String str2 = pixelStats2.b;
                AdsItemBlockAdStatPixelDto.TypeDto typeDto2 = pixelStats2.c;
                com.vkontakte.android.data.b.p(new DeprecatedStatisticUrl(str2, typeDto2 != null ? typeDto2.i() : null, pixelStats2.d, (UUID) pixelStats2.e.getValue()));
            }
        }
    }

    public final void g(String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        VideoFile videoFile = this.a;
        sb.append(videoFile.I0());
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(videoFile.o0());
        bundle.putString("video_id", sb.toString());
        bundle.putString("source", this.d);
        bundle.putString("ref", this.d);
        if (!TextUtils.isEmpty(this.e)) {
            bundle.putString("context", this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
            bundle.putString("track_code", this.f);
        }
        if (!TextUtils.isEmpty(videoFile.Y6())) {
            bundle.putString("ov_id", videoFile.Y6());
        }
        gzs<Boolean> gzsVar = this.x;
        if (gzsVar != null && gzsVar.invoke().booleanValue()) {
            bundle.putBoolean("is_in_pip", true);
        }
        gzs<Boolean> gzsVar2 = this.y;
        if (gzsVar2 != null && gzsVar2.invoke().booleanValue()) {
            bundle.putBoolean("is_in_background", true);
        }
        gzs<Boolean> gzsVar3 = this.z;
        if (gzsVar3 != null && gzsVar3.invoke().booleanValue()) {
            bundle.putBoolean("downloaded", true);
        }
        long j = this.n;
        if (j >= 0) {
            bundle.putLong(BadConnectionSignaling.KEY_BAD_NET_BITRATE, j);
        }
        long j2 = this.o;
        if (j2 >= 0) {
            bundle.putLong("bandwidth", j2);
        }
        gzs<String> gzsVar4 = this.A;
        String invoke = gzsVar4 != null ? gzsVar4.invoke() : "";
        if (!TextUtils.isEmpty(invoke)) {
            bundle.putString("vsid", invoke);
        }
        bundle.putInt("stall_count", this.k);
        bundle.putLong("stall_duration", this.l + (this.m > 0 ? SystemClock.elapsedRealtime() - this.m : 0L));
        bundle.putLong("ts", System.currentTimeMillis() / 1000);
        qyk0.a().e(str, bundle);
    }

    public final void h(Bundle bundle) {
        g("video_event", bundle);
    }

    public final void i(String str, String str2) {
        h(b(str, str2));
    }

    public final void j(int i, float f, float f2, boolean z, @Nullable String str, int i2, int i3) {
        int i4 = this.h;
        if (i == i4) {
            return;
        }
        boolean a = a(i4, i, 0);
        VideoFile videoFile = this.a;
        if (a) {
            e("start", i, f, f2, z, str, i2, i3);
            if (videoFile.C5()) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b = h5s.b("view_sport_broadcast");
                b.c("autoplay", this.g ? "1" : "0");
                b.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
                bVar.k(b.e());
            }
        }
        if (videoFile.getDuration() > 0) {
            if (a(this.h, i, 3)) {
                e("3s", i, f, f2, z, str, i2, i3);
                f("video_play_3s");
            }
            if (a(this.h, i, 10)) {
                e("10s", i, f, f2, z, str, i2, i3);
            }
            if (a(this.h, i, this.p)) {
                e("25", i, f, f2, z, str, i2, i3);
            }
            if (a(this.h, i, this.q)) {
                e("50", i, f, f2, z, str, i2, i3);
            }
            if (a(this.h, i, this.r)) {
                e("75", i, f, f2, z, str, i2, i3);
            }
            if (a(this.h, i, this.s)) {
                e("95", i, f, f2, z, str, i2, i3);
                f("video_play_95");
            }
            if (a(this.h, i, this.t)) {
                e("100", i, f, f2, z, str, i2, i3);
                String Y6 = videoFile.Y6();
                String a1 = videoFile.a1();
                if (g620.f().d(videoFile) && Y6 != null) {
                    com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var2 = Event.b;
                    Event.a aVar = new Event.a();
                    aVar.g("clips_view");
                    aVar.c("vkid", a1);
                    aVar.c("ovid", Y6);
                    aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
                    bVar2.k(aVar.e());
                }
            }
        }
        this.h = i;
    }

    public final void k(PlayerError playerError, @Nullable m7q m7qVar, int i, int i2, @Nullable Throwable th, boolean z) {
        if (th != null && m7qVar != null) {
            int h = playerError.h();
            int i3 = this.h;
            PlayerType playerType = this.D;
            if (playerType == null) {
                playerType = PlayerType.INLINE;
            }
            new njt0(h, m7qVar, th, i3, playerType, i2, d5b0.c(i), this.d, z, qu5.c().k()).q();
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", m7qVar != null ? m7qVar.e.b.toString() : "");
        bundle.putInt("code", playerError.h());
        bundle.putBoolean("is_autoplay", this.g);
        bundle.putInt("quality", i2);
        bundle.putInt(X3.i.L, this.h);
        bundle.putBoolean("is_auto_quality", i == -4 || i == -2);
        bundle.putString("file_type", i == -4 ? "dash" : i == -2 ? "hls" : "mp4");
        bundle.putString("description", playerError.getDescription());
        g("video_error", bundle);
    }

    public final void l(int i, int i2, @NonNull RewindType rewindType) {
        Bundle b = b("rewind", i <= i2 ? ToolBar.FORWARD : "backward");
        b.putString("rewind_type", rewindType.toString().toLowerCase());
        b.putInt("rewind_start", i);
        b.putInt("rewind_end", i2);
        h(b);
    }

    public final void m(@NonNull FullscreenTransition fullscreenTransition) {
        i("full_screen_transition", fullscreenTransition.toString().toLowerCase());
    }
}

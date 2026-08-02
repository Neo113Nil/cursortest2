package xsna;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.util.TrafficSaverInfo;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.log.L;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.data.ImageQualitySuppressionLevel;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: MediaLoadingDelegateDefault.kt */
/* loaded from: classes11.dex */
public final class sr10 implements NetworkPerformanceMeasurer.a {
    public final bpn0 a;
    public final bpn0 b = new bpn0(new w0f(1));
    public volatile boolean c = b().getBoolean("isRoamingState", false);
    public volatile boolean d;
    public final bpn0 e;
    public a f;

    /* compiled from: MediaLoadingDelegateDefault.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final ImageQualitySuppressionLevel a;
        public final boolean b;

        public a(ImageQualitySuppressionLevel imageQualitySuppressionLevel, boolean z) {
            this.a = imageQualitySuppressionLevel;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final ImageQualitySuppressionLevel b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeedMediaMode(imageQualitySuppressionLevel=");
            sb.append(this.a);
            sb.append(", autoplayEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MediaLoadingDelegateDefault.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrafficSaverInfo.values().length];
            try {
                iArr[TrafficSaverInfo.SWITCH_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrafficSaverInfo.SWITCH_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MediaLoadingDelegateDefault.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public c(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public sr10(bpn0 bpn0Var) {
        this.a = bpn0Var;
        boolean z = false;
        if (com.vk.toggle.d.D() && com.vk.toggle.d.X.b() != null && !this.c) {
            z = b().getBoolean("adaptive_feed_media", true);
        }
        this.d = z;
        this.e = new bpn0(new via(5));
        this.f = null;
    }

    public static boolean e() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        String name;
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        String lowerCase = (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null || (name = mobileOfficialAppsCoreNavStat$EventScreen.name()) == null) ? "" : name.toLowerCase(Locale.ROOT);
        return lowerCase.equals("feed") || brm0.B(lowerCase, "feed_", false);
    }

    @Override // com.vk.core.performance.network.NetworkPerformanceMeasurer.a
    public final void a(NetworkPerformanceMeasurer.NetworkClass networkClass, boolean z) {
        this.f = (a) ((Map) this.e.getValue()).get(networkClass);
        L.e("MediaLoadingDelegateDefault", "onNetworkClassChanged: " + networkClass.name() + ", currentMode = " + this.f);
    }

    public final SharedPreferences b() {
        return (SharedPreferences) this.b.getValue();
    }

    public final boolean c() {
        return !this.c && d() == ImageQualitySuppressionLevel.NONE;
    }

    public final ImageQualitySuppressionLevel d() {
        ImageQualitySuppressionLevel b2;
        if (this.c || !e() || !this.d) {
            return ImageQualitySuppressionLevel.NONE;
        }
        a aVar = this.f;
        return (aVar == null || (b2 = aVar.b()) == null) ? ImageQualitySuppressionLevel.NONE : b2;
    }

    public final boolean f(TrafficSaverInfo trafficSaverInfo) {
        String str;
        int i = b.$EnumSwitchMapping$0[trafficSaverInfo.ordinal()];
        if (i == 1) {
            str = "last_shown_disable_traffic_saver_pref";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "last_shown_enable_traffic_saver_pref";
        }
        long j = b().getLong(str, -1L);
        return j >= 0 && System.currentTimeMillis() - j < TimeUnit.DAYS.toMillis(7L);
    }

    public final Boolean g() {
        return Boolean.valueOf(b().getBoolean("isVideoTrafficSavingEnable", false));
    }

    public final boolean h() {
        a aVar;
        y1s0 y1s0Var = (y1s0) this.a.getValue();
        if ((y1s0Var == null || !y1s0Var.a()) && o25.a().d0().zb() && (!e() || !this.d || (aVar = this.f) == null || aVar.a())) {
            String string = b().getString("video_autoplay", "always");
            if (!com.vk.core.utils.newtork.b.c().e.a && !this.c) {
                if (TextUtils.equals("always", string)) {
                    return true;
                }
                if ("wifi".equals(string)) {
                    NetworkType d = com.vk.core.utils.newtork.b.c().d();
                    d.getClass();
                    return d == NetworkType.WIFI;
                }
            }
        }
        return false;
    }

    public final String i() {
        a aVar;
        y1s0 y1s0Var = (y1s0) this.a.getValue();
        return ((y1s0Var == null || !y1s0Var.a()) && o25.a().d0().zb()) ? (!e() || !this.d || (aVar = this.f) == null || aVar.a()) ? b().getString("video_autoplay", "always") : "unavailable" : "unavailable";
    }

    public final void j(boolean z) {
        if (this.d != z) {
            this.d = z;
            AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.FEED_MODE_SETTING_CHANGED);
            aggregateEventBuilder.v(0, this.d ? 1 : 0);
            aggregateEventBuilder.q();
        }
    }

    public final void k(final boolean z) {
        itg0.k(sa30.c(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.qr10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sr10.this.b().edit().putBoolean("isVideoTrafficSavingEnable", z).apply();
                return s3q0.a;
            }
        })), null, new c(L.a), 1);
    }
}

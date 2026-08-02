package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionTimelineTracker$Session$State;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.domain.statuses.StatusIconType;
import com.yandex.messaging.internal.authorized.j;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.collections.EmptyList;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;

/* loaded from: classes10.dex */
public final class jzz implements jb10, dxb0, vo0, rfg0, pyy, myt0, asa1 {
    public /* synthetic */ jzz() {
    }

    public static final int e(StatusAvailability statusAvailability, boolean z) {
        int i = cu21.a[statusAvailability.ordinal()];
        if (i == 1) {
            return z ? wwg0.msg_ic_online_status : wwg0.msg_ic_online_status_borderless;
        }
        if (i == 2) {
            return z ? wwg0.msg_ic_dnd_status : wwg0.msg_ic_dnd_status_borderless;
        }
        if (i == 3) {
            return z ? wwg0.msg_ic_busy_status : wwg0.msg_ic_busy_status_borderless;
        }
        if (i == 4) {
            return z ? wwg0.msg_ic_away_status : wwg0.msg_ic_away_status_borderless;
        }
        w511.b();
        return 0;
    }

    public static final String f(Config$CameraLens config$CameraLens) {
        int i = phb0.a[config$CameraLens.ordinal()];
        if (i == 1) {
            return "frontcam";
        }
        if (i == 2) {
            return "backcam";
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r2 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gu21 g(StatusAvailability statusAvailability, long j, long j2, clf clfVar, boolean z) {
        String str;
        if (clfVar == null) {
            int i = cu21.a[statusAvailability.ordinal()];
            if (i == 1) {
                return new eu21(j, j2, z);
            }
            if (i == 2) {
                return new bu21(2, j, j2, z);
            }
            if (i == 3) {
                return new bu21(1, j, j2, z);
            }
            if (i == 4) {
                return new bu21(0, j, j2, z);
            }
            w511.b();
            return null;
        }
        String language = Locale.getDefault().getLanguage();
        Map map = clfVar.d;
        if (map != null && (str = (String) map.get(language)) != null) {
            if (str.length() <= 0) {
                str = null;
            }
        }
        if (map == null || (str = (String) map.get("en")) == null || str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            str = clfVar.b;
        }
        String str2 = str;
        String str3 = clfVar.a;
        p8u0 p8u0Var = StatusIconType.Companion;
        String str4 = clfVar.c;
        p8u0Var.getClass();
        return new du21(statusAvailability, j, j2, str3, str2, z, jl40.l(str4, "telemost") ? StatusIconType.TELEMOST : null);
    }

    public static h6y0 i(zxx0 zxx0Var, long j, TaxiOrderSessionTimelineTracker$Session$State taxiOrderSessionTimelineTracker$Session$State, int i) {
        if ((i & 1) != 0) {
            zxx0Var = null;
        }
        if ((i & 2) != 0) {
            j = SystemClock.elapsedRealtime();
        }
        long j2 = j;
        return new h6y0(zxx0Var != null ? new f6y0(j2, zxx0Var) : null, gwk0.p().a(), j2, EmptyList.a, taxiOrderSessionTimelineTracker$Session$State);
    }

    public static final CharSequence k(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // defpackage.jb10
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.dxb0
    public z910 b(float f) {
        return new kv60(f);
    }

    @Override // defpackage.jb10
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.pyy
    public void d() {
    }

    @Override // defpackage.myt0
    public long h(long j) {
        return j;
    }

    public w411 j(Uri uri) {
        Uri uri2 = uri == null ? Uri.EMPTY : uri;
        return new w411(m7z.a(uri2, "start-lat", "start-lon"), m7z.a(uri2, "end-lat", "end-lon"), jl40.l(uri != null ? uri.getQueryParameter("source") : null, "superapp_suggest"));
    }

    @Override // defpackage.pyy
    public void load() {
        synchronized (u0a1.a) {
            Object obj = u0a1.b;
            synchronized (obj) {
                if (u0a1.c) {
                    return;
                }
                long b = u0a1.b();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    u0a1.d = b;
                    u0a1.c = true;
                }
            }
        }
    }

    @Override // defpackage.jb10
    public boolean next() {
        return false;
    }

    public /* synthetic */ jzz(Object obj) {
    }

    public jzz(j jVar, zbf zbfVar, kse kseVar) {
    }
}

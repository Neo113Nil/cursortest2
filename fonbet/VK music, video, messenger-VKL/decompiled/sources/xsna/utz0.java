package xsna;

import android.os.Bundle;
import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class utz0 {

    @Nullable
    public lvf0 a;

    public static final String m(long j) {
        return j >= 0 ? DateUtils.formatElapsedTime(j / 1000) : "-".concat(String.valueOf(DateUtils.formatElapsedTime((-j) / 1000)));
    }

    public final int a() {
        MediaInfo mediaInfo;
        lvf0 lvf0Var = this.a;
        long j = 1;
        if (lvf0Var != null && lvf0Var.k()) {
            lvf0 lvf0Var2 = this.a;
            if (lvf0Var2.m()) {
                Long h = h();
                if (h != null) {
                    j = h.longValue();
                } else {
                    Long j2 = j();
                    j = j2 != null ? j2.longValue() : Math.max(lvf0Var2.d(), 1L);
                }
            } else if (lvf0Var2.n()) {
                MediaQueueItem f = lvf0Var2.f();
                if (f != null && (mediaInfo = f.b) != null) {
                    j = Math.max(mediaInfo.f, 1L);
                }
            } else {
                j = Math.max(lvf0Var2.j(), 1L);
            }
        }
        return Math.max((int) (j - f()), 1);
    }

    public final int b() {
        lvf0 lvf0Var = this.a;
        if (lvf0Var != null && lvf0Var.k()) {
            lvf0 lvf0Var2 = this.a;
            if (lvf0Var2.m() || !lvf0Var2.n()) {
                int d = (int) (lvf0Var2.d() - f());
                if (lvf0Var2.C()) {
                    int d2 = d();
                    int e = e();
                    Pattern pattern = o0a.a;
                    d = Math.min(Math.max(d, d2), e);
                }
                int a = a();
                Pattern pattern2 = o0a.a;
                return Math.min(Math.max(d, 0), a);
            }
        }
        return 0;
    }

    public final boolean c(long j) {
        lvf0 lvf0Var = this.a;
        if (lvf0Var != null && lvf0Var.k() && this.a.C()) {
            return (f() + ((long) e())) - j < 10000;
        }
        return false;
    }

    public final int d() {
        lvf0 lvf0Var = this.a;
        if (lvf0Var == null || !lvf0Var.k() || !this.a.m() || !this.a.C()) {
            return 0;
        }
        Long i = i();
        exc0.i(i);
        long longValue = i.longValue() - f();
        int a = a();
        Pattern pattern = o0a.a;
        return Math.min(Math.max((int) longValue, 0), a);
    }

    public final int e() {
        lvf0 lvf0Var = this.a;
        if (lvf0Var == null || !lvf0Var.k() || !this.a.m()) {
            return a();
        }
        if (!this.a.C()) {
            return 0;
        }
        Long j = j();
        exc0.i(j);
        long longValue = j.longValue() - f();
        int a = a();
        Pattern pattern = o0a.a;
        return Math.min(Math.max((int) longValue, 0), a);
    }

    public final long f() {
        lvf0 lvf0Var = this.a;
        if (lvf0Var == null || !lvf0Var.k() || !this.a.m()) {
            return 0L;
        }
        lvf0 lvf0Var2 = this.a;
        Long g = g();
        if (g != null) {
            return g.longValue();
        }
        Long i = i();
        return i != null ? i.longValue() : lvf0Var2.d();
    }

    @Nullable
    public final Long g() {
        MediaInfo g;
        lvf0 lvf0Var = this.a;
        if (lvf0Var != null && lvf0Var.k() && this.a.m()) {
            lvf0 lvf0Var2 = this.a;
            MediaInfo g2 = lvf0Var2.g();
            lvf0 lvf0Var3 = this.a;
            MediaMetadata mediaMetadata = (lvf0Var3 == null || !lvf0Var3.k() || (g = this.a.g()) == null) ? null : g.e;
            if (g2 != null && mediaMetadata != null) {
                Bundle bundle = mediaMetadata.c;
                if (bundle.containsKey("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (bundle.containsKey("com.google.android.gms.cast.metadata.SECTION_DURATION") || lvf0Var2.C())) {
                    MediaMetadata.i(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA");
                    return Long.valueOf(bundle.getLong("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
                }
            }
        }
        return null;
    }

    @Nullable
    public final Long h() {
        Long g;
        MediaInfo g2;
        lvf0 lvf0Var = this.a;
        if (lvf0Var != null && lvf0Var.k() && this.a.m()) {
            lvf0 lvf0Var2 = this.a;
            MediaMetadata mediaMetadata = (lvf0Var2 == null || !lvf0Var2.k() || (g2 = this.a.g()) == null) ? null : g2.e;
            if (mediaMetadata != null) {
                Bundle bundle = mediaMetadata.c;
                if (bundle.containsKey("com.google.android.gms.cast.metadata.SECTION_DURATION") && (g = g()) != null) {
                    long longValue = g.longValue();
                    MediaMetadata.i(5, "com.google.android.gms.cast.metadata.SECTION_DURATION");
                    return Long.valueOf(bundle.getLong("com.google.android.gms.cast.metadata.SECTION_DURATION") + longValue);
                }
            }
        }
        return null;
    }

    @Nullable
    public final Long i() {
        lvf0 lvf0Var;
        MediaStatus h;
        long j;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        lvf0 lvf0Var2 = this.a;
        if (lvf0Var2 == null || !lvf0Var2.k() || !this.a.m() || !this.a.C() || (h = (lvf0Var = this.a).h()) == null || h.v == null) {
            return null;
        }
        synchronized (lvf0Var.a) {
            exc0.e("Must be called from the main thread.");
            zyz0 zyz0Var = lvf0Var.c;
            MediaStatus mediaStatus = zyz0Var.f;
            j = 0;
            if (mediaStatus != null && (mediaLiveSeekableRange = mediaStatus.v) != null) {
                long j2 = mediaLiveSeekableRange.b;
                j = mediaLiveSeekableRange.d ? zyz0Var.f(1.0d, j2, -1L) : j2;
                if (mediaLiveSeekableRange.e) {
                    j = Math.min(j, mediaLiveSeekableRange.c);
                }
            }
        }
        return Long.valueOf(j);
    }

    @Nullable
    public final Long j() {
        lvf0 lvf0Var;
        MediaStatus h;
        long j;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        lvf0 lvf0Var2 = this.a;
        if (lvf0Var2 == null || !lvf0Var2.k() || !this.a.m() || !this.a.C() || (h = (lvf0Var = this.a).h()) == null || h.v == null) {
            return null;
        }
        synchronized (lvf0Var.a) {
            exc0.e("Must be called from the main thread.");
            zyz0 zyz0Var = lvf0Var.c;
            MediaStatus mediaStatus = zyz0Var.f;
            j = 0;
            if (mediaStatus != null && (mediaLiveSeekableRange = mediaStatus.v) != null) {
                long j2 = mediaLiveSeekableRange.c;
                j = !mediaLiveSeekableRange.e ? zyz0Var.f(1.0d, j2, -1L) : j2;
            }
        }
        return Long.valueOf(j);
    }

    @Nullable
    public final String k(long j) {
        lvf0 lvf0Var = this.a;
        if (lvf0Var == null || !lvf0Var.k()) {
            return null;
        }
        lvf0 lvf0Var2 = this.a;
        int i = 1;
        if (lvf0Var2 != null && lvf0Var2.k() && this.a.m() && l() != null) {
            i = 2;
        }
        if (i - 1 == 0) {
            return (lvf0Var2.m() && g() == null) ? m(j) : m(j - f());
        }
        Long l = l();
        exc0.i(l);
        return DateFormat.getTimeInstance().format(new Date(l.longValue() + j));
    }

    @Nullable
    public final Long l() {
        MediaInfo g;
        lvf0 lvf0Var = this.a;
        if (lvf0Var == null || !lvf0Var.k() || !this.a.m() || (g = this.a.g()) == null) {
            return null;
        }
        long j = g.n;
        if (j != -1) {
            return Long.valueOf(j);
        }
        return null;
    }
}

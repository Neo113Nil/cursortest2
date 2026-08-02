package xsna;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.session.MediaButtonReceiver;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.UUID;

/* compiled from: VideoMediaSessionManager.kt */
/* loaded from: classes3.dex */
public final class cts0 {
    public static final bpn0 f = new bpn0(new s7c0(15));
    public volatile boolean b;
    public volatile MediaSessionCompat c;
    public volatile ats0 d;
    public final Object a = new Object();
    public final LinkedHashSet e = new LinkedHashSet();

    public static MediaSessionCompat c(Context context) {
        ComponentName a = MediaButtonReceiver.a(context);
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(a);
        PendingIntent b = t2i0.b(context, 0, intent, 33554432);
        if (b == null) {
            return null;
        }
        return new MediaSessionCompat(context, "video_media_session_tag", a, b);
    }

    public final dts0 a(Context context) {
        h();
        if (this.c == null) {
            MediaSessionCompat c = c(context);
            if (c == null) {
                return null;
            }
            ats0 ats0Var = new ats0();
            c.setCallback(ats0Var);
            c.setActive(true);
            this.c = c;
            this.d = ats0Var;
            this.e.clear();
        }
        MediaSessionCompat mediaSessionCompat = this.c;
        if (mediaSessionCompat != null) {
            return d(mediaSessionCompat);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean b(dts0 dts0Var) {
        h();
        h();
        MediaSessionCompat mediaSessionCompat = this.c;
        if (epx.f(mediaSessionCompat != null ? mediaSessionCompat.getSessionToken() : null, dts0Var.b) && this.e.contains(dts0Var)) {
            return true;
        }
        com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Attempt to interact with media session using wrong token: " + dts0Var + ".\nProbably, you are retaining reference on already released token\nor you have created this token manually."));
        return false;
    }

    public final dts0 d(MediaSessionCompat mediaSessionCompat) {
        dts0 dts0Var = new dts0(UUID.randomUUID().toString(), mediaSessionCompat.getSessionToken());
        this.e.add(dts0Var);
        return dts0Var;
    }

    public final void e(dts0 dts0Var) {
        if (b(dts0Var)) {
            this.e.remove(dts0Var);
            if (this.e.isEmpty()) {
                MediaSessionCompat mediaSessionCompat = this.c;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.setActive(false);
                }
                MediaSessionCompat mediaSessionCompat2 = this.c;
                if (mediaSessionCompat2 != null) {
                    mediaSessionCompat2.release();
                }
                this.c = null;
                this.d = null;
            }
        }
    }

    public final void f(dts0 dts0Var, uss0 uss0Var) {
        if (b(dts0Var)) {
            MediaMetadataCompat.Builder builder = new MediaMetadataCompat.Builder();
            for (Map.Entry<String, String> entry : uss0Var.a.entrySet()) {
                builder.putString(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<String, Long> entry2 : uss0Var.b.entrySet()) {
                builder.putLong(entry2.getKey(), entry2.getValue().longValue());
            }
            for (Map.Entry<String, Bitmap> entry3 : uss0Var.c.entrySet()) {
                builder.putBitmap(entry3.getKey(), entry3.getValue());
            }
            MediaSessionCompat mediaSessionCompat = this.c;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setMetadata(builder.build());
            }
        }
    }

    public final void g(dts0 dts0Var, xss0 xss0Var) {
        if (b(dts0Var)) {
            PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
            builder.setActions(xss0Var.a);
            builder.setState(xss0Var.b, xss0Var.d, xss0Var.e);
            MediaSessionCompat mediaSessionCompat = this.c;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setPlaybackState(builder.build());
            }
        }
    }

    public final void h() {
        if (this.b) {
            synchronized (this.a) {
                try {
                    if (this.b) {
                        this.a.wait(4000L);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

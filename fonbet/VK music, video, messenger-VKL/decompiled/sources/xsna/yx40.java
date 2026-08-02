package xsna;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: MusicPlayerNotificationBuilder.kt */
/* loaded from: classes3.dex */
public final class yx40 {
    public final Context a;
    public final MusicTrack b;
    public final boolean c;
    public final z46 d;

    /* compiled from: MusicPlayerNotificationBuilder.kt */
    public static final class a {
        public final Notification a;
        public final Throwable b;

        public a(Notification notification, Throwable th) {
            this.a = notification;
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Throwable th = this.b;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerNotification(notification=");
            sb.append(this.a);
            sb.append(", consumedThrowable=");
            return oq.c(sb, this.b, ')');
        }
    }

    public yx40(tib tibVar, i2p0 i2p0Var, MediaSessionCompat mediaSessionCompat, com.vk.music.track.a aVar, Context context, MusicTrack musicTrack, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = musicTrack;
        this.c = z;
        this.d = ((Boolean) t5m.a.getValue()).booleanValue() ? new dvr(tibVar) : new pjl(tibVar, mediaSessionCompat, !z, aVar, i2p0Var);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.l2 a(boolean z) {
        io.reactivex.rxjava3.core.q g;
        Context context = this.a;
        Resources resources = context.getResources();
        MusicTrack musicTrack = this.b;
        int i = musicTrack.Vb() ? R.drawable.placeholder_podcast_96 : R.drawable.placeholder_song_96;
        if (z) {
            g = mcr0.g(resources, i);
        } else {
            String Kb = musicTrack.Kb(iah0.c(context));
            g = (Kb == null || Kb.length() == 0 || !this.c) ? mcr0.g(resources, i) : mcr0.h(Uri.parse(Kb)).y0(3L, TimeUnit.SECONDS);
        }
        io.reactivex.rxjava3.core.q L = g.L(new d810(new zx40(this, i, resources), 5), false);
        wx40 wx40Var = new wx40(new vx40(this, i, resources), 0);
        L.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.o1(L, wx40Var).r0(asu0.a.c());
    }
}

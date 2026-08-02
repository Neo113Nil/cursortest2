package xsna;

import android.net.Uri;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.Locale;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.error.OneVideoUnexpectedException;
import one.video.player.error.ResponseInfo;

/* compiled from: OneVideoTechErrorEventBuilder.kt */
/* loaded from: classes2.dex */
public final class un80 extends l5m {
    public final OneVideoPlaybackException h;
    public final sht0 i;
    public final boolean j;

    public un80(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, boolean z) {
        super(null, null, 3);
        this.h = oneVideoPlaybackException;
        this.i = sht0Var;
        this.j = z;
    }

    public static String v(Throwable th) {
        return erm0.D0(256, j5g.g0(drm0.Q(mnh0.A(th)), "\n", null, null, 0, new pqz(11), 30));
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        Object obj;
        Uri uri;
        OneVideoPlaybackException.StuckType stuckType;
        String name;
        ResponseInfo responseInfo;
        sht0 sht0Var = this.i;
        if (sht0Var == null || (obj = sht0Var.a) == null) {
            obj = "unknown";
        }
        OneVideoPlaybackException oneVideoPlaybackException = this.h;
        OneVideoSourceException i = oneVideoPlaybackException.i();
        OneVideoPlayer.DataType d = i != null ? i.d() : null;
        OneVideoSourceException i2 = oneVideoPlaybackException.i();
        OneVideoSourceException.a g = i2 != null ? i2.g() : null;
        Integer valueOf = g != null ? Integer.valueOf(g.a) : null;
        String str = g != null ? g.b : null;
        String str2 = g != null ? g.c : null;
        String description = (g == null || (responseInfo = g.d) == null) ? null : responseInfo.getDescription();
        OneVideoUnexpectedException k = oneVideoPlaybackException.k();
        OneVideoUnexpectedException.a d2 = k != null ? k.d() : null;
        String lowerCase = (d2 == null || (stuckType = d2.a) == null || (name = stuckType.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
        Integer valueOf2 = d2 != null ? Integer.valueOf(d2.b) : null;
        String h = DevNullEventKey.ONE_VIDEO_PLAYER_ERROR.h();
        String uri2 = (sht0Var == null || (uri = sht0Var.b) == null) ? null : uri.toString();
        String obj2 = oneVideoPlaybackException.j().toString();
        String obj3 = oneVideoPlaybackException.d().toString();
        String obj4 = obj.toString();
        String obj5 = d != null ? d.toString() : null;
        String D0 = str2 != null ? erm0.D0(256, str2) : null;
        String v = v(oneVideoPlaybackException);
        Throwable cause = oneVideoPlaybackException.getCause();
        String v2 = cause != null ? v(cause) : null;
        String message = oneVideoPlaybackException.getMessage();
        Throwable cause2 = oneVideoPlaybackException.getCause();
        this.g = new SchemeStat$TypeDevNullItem(h, null, uri2, null, obj2, valueOf, obj3, Integer.valueOf(this.j ? 1 : 0), obj4, valueOf2, obj5, null, str, null, D0, null, description, null, lowerCase, null, null, null, null, null, null, null, v, null, v2, null, message, null, cause2 != null ? cause2.getMessage() : null, null, -1409636342, 2, null);
        return super.p();
    }
}

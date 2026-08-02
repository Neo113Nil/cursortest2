package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import defpackage.jd10;
import defpackage.ny61;
import defpackage.oyr;
import java.util.Collections;
import java.util.HashSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class b {
    public final jd10 a;
    public final MediaSessionCompat$Token b;

    public b(final Context context, final MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token == null) {
            ny61.g("sessionToken must not be null");
            throw null;
        }
        Collections.synchronizedSet(new HashSet());
        this.b = mediaSessionCompat$Token;
        this.a = new MediaControllerCompat$MediaControllerImplApi21(context, mediaSessionCompat$Token) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi29
            @Override // android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21
            public Bundle getSessionInfo() {
                if (this.mSessionInfo != null) {
                    return new Bundle(this.mSessionInfo);
                }
                Bundle sessionInfo = this.mControllerFwk.getSessionInfo();
                this.mSessionInfo = sessionInfo;
                Bundle c = c.c(sessionInfo);
                this.mSessionInfo = c;
                return c == null ? Bundle.EMPTY : new Bundle(this.mSessionInfo);
            }
        };
    }

    public static void a(Bundle bundle, String str) {
        if (str == null) {
            return;
        }
        if (str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
            if (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
                ny61.g(oyr.p("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, Extension.DOT_CHAR));
            }
        }
    }
}

package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import defpackage.ma31;

/* loaded from: classes10.dex */
class MediaSessionCompat$MediaSessionImplApi29 extends MediaSessionCompat$MediaSessionImplApi28 {
    public MediaSessionCompat$MediaSessionImplApi29(Object obj) {
        super(obj);
        this.mSessionInfo = ((MediaSession) obj).getController().getSessionInfo();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21
    public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public MediaSessionCompat$MediaSessionImplApi29(Context context, String str, ma31 ma31Var, Bundle bundle) {
        super(context, str, ma31Var, bundle);
    }
}

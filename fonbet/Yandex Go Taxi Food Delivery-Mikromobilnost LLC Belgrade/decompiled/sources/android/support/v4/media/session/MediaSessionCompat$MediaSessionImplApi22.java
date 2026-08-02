package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import defpackage.ma31;

/* loaded from: classes10.dex */
class MediaSessionCompat$MediaSessionImplApi22 extends MediaSessionCompat$MediaSessionImplApi21 {
    public MediaSessionCompat$MediaSessionImplApi22(Context context, String str, ma31 ma31Var, Bundle bundle) {
        super(context, str, ma31Var, bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21
    public void setRatingType(int i) {
        this.mSessionFwk.setRatingType(i);
    }

    public MediaSessionCompat$MediaSessionImplApi22(Object obj) {
        super(obj);
    }
}

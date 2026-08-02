package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import defpackage.hf10;
import defpackage.ma31;

/* loaded from: classes10.dex */
class MediaSessionCompat$MediaSessionImplApi28 extends MediaSessionCompat$MediaSessionImplApi22 {
    public MediaSessionCompat$MediaSessionImplApi28(Context context, String str, ma31 ma31Var, Bundle bundle) {
        super(context, str, ma31Var, bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21
    public final hf10 getCurrentControllerInfo() {
        return new hf10(this.mSessionFwk.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21, defpackage.cf10
    public void setCurrentControllerInfo(hf10 hf10Var) {
    }

    public MediaSessionCompat$MediaSessionImplApi28(Object obj) {
        super(obj);
    }
}

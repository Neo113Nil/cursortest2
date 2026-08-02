package ru.ok.android.webrtc;

import ru.ok.android.webrtc.animoji.stats.AnimojiStat;
import ru.ok.android.webrtc.animoji.util.AnimojiControl;

/* loaded from: classes9.dex */
public final class a implements AnimojiControl {
    public final /* synthetic */ Call a;

    public a(Call call) {
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.animoji.util.AnimojiControl
    public final AnimojiStat getStat() {
        return this.a.q0.getStat();
    }

    @Override // ru.ok.android.webrtc.animoji.util.AnimojiControl
    public final void setEnabled(boolean z, boolean z2) {
        Call call = this.a;
        if (call.X == null) {
            return;
        }
        if (z && call.m0.isVideoEnabled()) {
            this.a.setVideoEnabled(false);
        }
        this.a.q0.setEnabled(z, z2);
        this.a.q();
        this.a.b(CallEvents.LOCAL_MEDIA_SETTINGS_CHANGED, (Object) null);
    }
}

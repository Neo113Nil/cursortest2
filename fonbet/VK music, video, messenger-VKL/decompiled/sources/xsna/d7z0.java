package xsna;

import android.content.Context;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.h8z0;
import xsna.izy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class d7z0 extends gbz0 {
    public final h8z0.b f;
    public e5z0 g;

    public d7z0(ziy0 ziy0Var, b6z0 b6z0Var, long j, e5z0 e5z0Var, h8z0.b bVar) {
        super(ziy0Var, b6z0Var, j);
        this.g = e5z0Var;
        this.f = bVar;
    }

    @Override // xsna.rgz0
    public final void c(boolean z, float f, Context context) {
        izy0.a a;
        if (f(z)) {
            b6z0 b6z0Var = this.a;
            b6z0Var.d.d(1, RtpSenderHelper.AUDIO_BITRATE_MIN);
            String t = c1z0.t(context);
            if (t != null) {
                h8z0.d(this.g, t);
            }
            h8z0.g(b6z0Var, 1, this.f);
            if (e5z0.n(b6z0Var.c) && (a = a()) != null) {
                a.a();
            }
            izy0.a a2 = a();
            if (a2 != null) {
                a2.c();
            }
            gu8.c("ViewabilityTracker: ShowStatTracker", "Show tracked, kill self");
            d();
        }
    }

    @Override // xsna.rgz0
    public final void d() {
        super.d();
        this.g = null;
    }

    @Override // xsna.rgz0
    public final void e() {
        this.e = 0L;
    }

    @Override // xsna.rgz0
    public final void b() {
    }
}

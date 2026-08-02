package xsna;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: NewPostHandler.kt */
/* loaded from: classes7.dex */
public final class h860 implements fhd0, lao0 {
    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        Long k;
        String a = fgxVar.a("text");
        if (a == null) {
            a = "";
        }
        boolean f = epx.f(fgxVar.a("attach"), SignalingProtocol.KEY_CAMERA);
        String a2 = fgxVar.a("postponed_time");
        long longValue = (a2 == null || (k = cqm0.k(a2)) == null) ? 0L : k.longValue();
        int i = rfc0.a;
        q860 q860Var = new q860();
        q860Var.m(longValue, a, f);
        q860Var.p(-1, fgxVar.e);
        blk.P(fgxVar).onSuccess();
    }
}

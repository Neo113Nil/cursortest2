package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import xsna.vrm;

/* compiled from: EventConsumerImpl.kt */
/* loaded from: classes2.dex */
public final class oyp implements io.reactivex.rxjava3.functions.f<sxp> {
    public final xyb b;

    public oyp(xyb xybVar) {
        this.b = xybVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        String str;
        sxp sxpVar2 = sxpVar;
        boolean z = sxpVar2 instanceof p680;
        final xyb xybVar = this.b;
        if (z) {
            if (xybVar.q.e) {
                xybVar.d1();
                xybVar.c1(DialogExt.zb(xybVar.q.a));
                return;
            }
            return;
        }
        if (sxpVar2 instanceof OnCacheInvalidateEvent) {
            xybVar.e1();
            return;
        }
        if (sxpVar2 instanceof ka80) {
            ProfilesInfo profilesInfo = ((ka80) sxpVar2).c;
            zyb zybVar = xybVar.q;
            if (!zybVar.f && zybVar.a.b.Ib(profilesInfo).g()) {
                xybVar.X0();
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    xybVar.a1(azbVar);
                    return;
                }
                return;
            }
            return;
        }
        if (!(sxpVar2 instanceof r480)) {
            if (sxpVar2 instanceof h480) {
                h480 h480Var = (h480) sxpVar2;
                final long j = h480Var.b;
                final Peer peer = h480Var.c;
                ProfilesInfo profilesInfo2 = h480Var.d;
                if (j != xybVar.q.a.e) {
                    return;
                }
                qtd0 Bb = profilesInfo2.Bb(peer);
                if (Bb == null || (str = Bb.name()) == null) {
                    str = "";
                }
                edw edwVar = edw.a;
                edw.e(xybVar.i, str, new gzs() { // from class: xsna.syb
                    @Override // xsna.gzs
                    public final Object invoke() {
                        xyb xybVar2 = xyb.this;
                        a1w a1wVar = xybVar2.j;
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        a1wVar.D(xybVar2, new vrm(Peer.a.b(j), new vrm.a.b(peer)));
                        return s3q0.a;
                    }
                });
                return;
            }
            return;
        }
        r480 r480Var = (r480) sxpVar2;
        if (epx.f(r480Var.b, xyb.D)) {
            return;
        }
        wpp<Long, Dialog> wppVar = r480Var.c;
        zyb zybVar2 = xybVar.q;
        if (zybVar2.d || zybVar2.g || !wppVar.b(Long.valueOf(zybVar2.a.e))) {
            return;
        }
        Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(xybVar.q.a.e));
        ChatSettings Hb = dialog != null ? dialog.Hb() : null;
        Dialog Cb = xybVar.q.a.Cb();
        ChatSettings Hb2 = Cb != null ? Cb.Hb() : null;
        xybVar.e1();
        if (Hb2 != null && Hb.i == Hb2.i && Hb.j == Hb2.j) {
            xybVar.q = zyb.a(xybVar.q, xyb.Z0(new DialogExt(dialog, xybVar.q.a.b)), false, false, null, false, null, 2046);
            xybVar.X0();
            azb azbVar2 = xybVar.A;
            if (azbVar2 != null) {
                xybVar.a1(azbVar2);
            }
        }
    }
}

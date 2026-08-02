package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import java.util.Collections;
import xsna.g1e0;

/* compiled from: MsgPushInfoLoader.kt */
/* loaded from: classes.dex */
public final class fv30 {
    public final Source a;
    public final String b;

    public fv30() {
        this(Source.ACTUAL);
    }

    public static boolean a(long j, ipm ipmVar, t140 t140Var) {
        wpp<Long, Dialog> b = ipmVar.b();
        Dialog dialog = (Dialog) b.c.get(Long.valueOf(j));
        Msg msg = (Msg) j5g.Z(t140Var.a().c.values());
        if (dialog == null || msg == null) {
            return false;
        }
        return dialog.Fc(msg);
    }

    public final dv30 b(a1w a1wVar, long j, long j2, int i, boolean z) {
        ipm c = c(j2, a1wVar);
        t140 d = d(a1wVar, i, MsgIdType.LOCAL_ID, j2);
        wpp<Long, Dialog> b = c.b();
        Dialog dialog = (Dialog) b.c.get(Long.valueOf(j2));
        wpp<Integer, Msg> a = d.a();
        Msg msg = (Msg) a.c.get(Integer.valueOf(i));
        ProfilesInfo c2 = c.c();
        c2.Hb(d.b());
        Serializer.c<Peer> cVar = Peer.CREATOR;
        c2.Hb(e(a1wVar, new f1e0(Collections.singletonList(Peer.a.b(j)))));
        ProfilesSimpleInfo Ob = c2.Ob();
        if (dialog == null || msg == null) {
            return null;
        }
        if (z) {
            cau0 cau0Var = a1wVar.r().h;
        }
        return f(a1wVar, j, dialog, msg, Ob, false);
    }

    public final ipm c(long j, a1w a1wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (ipm) vdg0.a(a1wVar.n(this, new uqm(new sqm(Peer.a.b(j), this.a, true, (Object) this.b, 16))), new y8m(16));
    }

    public final t140 d(a1w a1wVar, int i, MsgIdType msgIdType, long j) {
        return (t140) vdg0.a(a1wVar.n(this, new ej30(msgIdType, Collections.singletonList(Integer.valueOf(i)), com.vk.dto.common.b.e(j), this.a, true, this.b)), new pqz(5));
    }

    public final ProfilesInfo e(a1w a1wVar, f1e0 f1e0Var) {
        g1e0.a aVar = new g1e0.a();
        aVar.g(f1e0Var);
        aVar.j(this.a);
        aVar.a();
        aVar.c(this.b);
        return (ProfilesInfo) vdg0.a(a1wVar.n(this, new d1e0(aVar.b())), new vsq(13));
    }

    public final dv30 f(a1w a1wVar, long j, Dialog dialog, Msg msg, ProfilesSimpleInfo profilesSimpleInfo, boolean z) {
        Dialog dialog2;
        Peer Ab;
        BusinessNotifyInfo businessNotifyInfo = null;
        if (dialog.kc() == 1) {
            ChatSettings Hb = dialog.Hb();
            Long valueOf = (Hb == null || (Ab = Hb.Ab()) == null) ? null : Long.valueOf(Ab.b);
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                wpp wppVar = (wpp) vdg0.a(a1wVar.n(this, new tqm(new sqm(Peer.a.b(longValue), this.a, true, (Object) this.b, 16))), new rvq(10));
                if (wppVar != null && (dialog2 = (Dialog) wppVar.c.get(valueOf)) != null) {
                    businessNotifyInfo = dialog2.Ab();
                }
            }
        }
        BusinessNotifyInfo businessNotifyInfo2 = businessNotifyInfo;
        Peer from = msg.getFrom();
        boolean z2 = false;
        if (z) {
            from.getClass();
            if (from.Ab(Peer.Type.USER)) {
                EduCommonComponent eduCommonComponent = (EduCommonComponent) ((k7m) m7m.f(new ev30())).mo408a(fpf0.a(EduCommonComponent.class));
                e7p g2 = eduCommonComponent.g2();
                u6p ue = eduCommonComponent.ue();
                Peer q = a1wVar.q();
                try {
                    z2 = ((Boolean) itg0.f(new io.reactivex.rxjava3.internal.operators.single.r(e7p.b(g2, Collections.singletonList(q), this.a), new h8(new b810(q, this, ue, from), 25)), 3000L)).booleanValue();
                } catch (Throwable th) {
                    L.i(th);
                }
            }
        }
        return new dv30(j, dialog, msg, businessNotifyInfo2, profilesSimpleInfo, z2);
    }

    public fv30(Source source) {
        this.a = source;
        this.b = fv30.class.getSimpleName();
    }
}

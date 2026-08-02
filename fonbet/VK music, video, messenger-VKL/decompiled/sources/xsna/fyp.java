package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.user.InvisibleStatus;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.components.viewcontrollers.dialog_header.info.RefreshInfo;
import java.util.concurrent.TimeUnit;

/* compiled from: EventConsumer.kt */
/* loaded from: classes2.dex */
public final class fyp implements io.reactivex.rxjava3.functions.f<sxp> {
    public final afm b;

    public fyp(afm afmVar) {
        this.b = afmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        Peer Zb;
        qtd0 Ab;
        dfm dfmVar;
        int indexOf;
        RefreshInfo refreshInfo;
        sxp sxpVar2 = sxpVar;
        afm afmVar = this.b;
        zsk0 zsk0Var = afmVar.D;
        if (sxpVar2 instanceof p680) {
            if (zsk0Var.a) {
                long j = zsk0Var.c;
                afmVar.g1();
                afmVar.f1(j, null);
            }
        } else if (sxpVar2 instanceof OnCacheInvalidateEvent) {
            io.reactivex.rxjava3.internal.operators.single.b0 F = afmVar.i.F(afmVar, new poz(zsk0Var.c, afm.G));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            afmVar.t.b(F.g(500L).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new i22(new zem(1, afmVar, afm.class, "onUpdateAllByCacheSuccess", "onUpdateAllByCacheSuccess(Lcom/vk/im/ui/components/dialog_header/info/tasks/LoadAllByCacheCmd$Result;)V", 0), 17), new j22(new l3f(afmVar, 6), 23)));
        } else if (sxpVar2 instanceof u180) {
            ImBgSyncState a = ((u180) sxpVar2).b.a(LongPollType.MESSAGES);
            if (zsk0Var.b != a) {
                zsk0Var.b = a;
                afmVar.C.a(com.vk.im.engine.reporters.syncstate.b.a(a));
                dfm dfmVar2 = afmVar.z;
                if (dfmVar2 != null) {
                    int i = tkr0.$EnumSwitchMapping$0[zsk0Var.b.ordinal()];
                    if (i != 1) {
                        refreshInfo = i != 2 ? (i == 3 || i == 4) ? zsk0Var.m ? RefreshInfo.REFRESHING : RefreshInfo.CONNECTED : RefreshInfo.DISCONNECTED : RefreshInfo.REFRESHING;
                    } else {
                        r6m.a.getClass();
                        refreshInfo = r6m.j() ? RefreshInfo.CONNECTING : RefreshInfo.WAIT_FOR_NETWORK;
                    }
                    dfmVar2.q(refreshInfo);
                }
            }
        } else if (sxpVar2 instanceof nc80) {
            nc80 nc80Var = (nc80) sxpVar2;
            long j2 = nc80Var.c;
            vh30 vh30Var = nc80Var.d;
            if (!zsk0Var.h && zsk0Var.c == j2 && ((indexOf = zsk0Var.g.indexOf(vh30Var)) < 0 || ((vh30) zsk0Var.g.get(indexOf)).b != vh30Var.b)) {
                if (indexOf >= 0) {
                    zsk0Var.g.remove(indexOf);
                }
                zsk0Var.g.add(vh30Var);
                afmVar.Y0();
                dfm dfmVar3 = afmVar.z;
                if (dfmVar3 != null) {
                    dfmVar3.u(zsk0Var.g);
                }
            }
        } else if (sxpVar2 instanceof oc80) {
            oc80 oc80Var = (oc80) sxpVar2;
            long j3 = oc80Var.c;
            vh30 vh30Var2 = oc80Var.d;
            if (!zsk0Var.h && zsk0Var.c == j3 && zsk0Var.g.remove(vh30Var2)) {
                dfm dfmVar4 = afmVar.z;
                if (dfmVar4 != null) {
                    dfmVar4.u(zsk0Var.g);
                }
                Dialog a2 = zsk0Var.a();
                if (zsk0Var.g.isEmpty() && a2 != null && (Zb = a2.Zb()) != null && Zb.Ab(Peer.Type.USER) && (Ab = zsk0Var.e.Ob().Ab(a2.Sb())) != null && (Ab.mb() instanceof InvisibleStatus) && (dfmVar = afmVar.z) != null) {
                    dfmVar.m();
                }
            }
        }
        if (afm.G == sxpVar2.a()) {
            return;
        }
        if (!(sxpVar2 instanceof r480)) {
            if (sxpVar2 instanceof ka80) {
                ProfilesInfo profilesInfo = ((ka80) sxpVar2).c;
                if (!zsk0Var.h && zsk0Var.e.Ib(profilesInfo).g()) {
                    afmVar.Y0();
                    dfm dfmVar5 = afmVar.z;
                    if (dfmVar5 != null) {
                        lfm lfmVar = new lfm();
                        lfmVar.b = new ProfilesSimpleInfo();
                        lfmVar.a = zsk0Var.a();
                        lfmVar.b = zsk0Var.e.Ob();
                        lfmVar.c = zsk0Var.f;
                        dfmVar5.f(lfmVar);
                    }
                    afmVar.c1();
                    afmVar.a1();
                    return;
                }
                return;
            }
            return;
        }
        wpp<Long, Dialog> wppVar = ((r480) sxpVar2).c;
        if (!zsk0Var.h && wppVar.c.containsKey(Long.valueOf(zsk0Var.c))) {
            xpp<Dialog> xppVar = zsk0Var.d;
            xpp e = wppVar.e(Long.valueOf(zsk0Var.c));
            xppVar.getClass();
            xppVar.a = e.a;
            xppVar.e(e.b);
            afmVar.Y0();
            dfm dfmVar6 = afmVar.z;
            if (dfmVar6 != null) {
                lfm lfmVar2 = new lfm();
                lfmVar2.b = new ProfilesSimpleInfo();
                lfmVar2.a = zsk0Var.a();
                lfmVar2.b = zsk0Var.e.Ob();
                lfmVar2.c = zsk0Var.f;
                dfmVar6.f(lfmVar2);
            }
            afmVar.c1();
            afmVar.a1();
        }
    }
}

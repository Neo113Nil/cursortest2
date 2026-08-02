package xsna;

import android.os.Trace;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ehs implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ehs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((fhs) obj).a.getContext();
                return new flo(null);
            case 1:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) obj;
                ewy ewyVar = gamesCatalogComponentImpl.c;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                qcy<Object> qcyVar = qcyVarArr[2];
                bdt bdtVar = (bdt) ewyVar.c();
                nwy nwyVar = gamesCatalogComponentImpl.d;
                qcy<Object> qcyVar2 = qcyVarArr[3];
                cct cctVar = (cct) nwyVar.c();
                ewy ewyVar2 = gamesCatalogComponentImpl.o;
                qcy<Object> qcyVar3 = qcyVarArr[14];
                fdt fdtVar = (fdt) ewyVar2.c();
                ewy ewyVar3 = gamesCatalogComponentImpl.e;
                qcy<Object> qcyVar4 = qcyVarArr[4];
                ykg ykgVar = (ykg) ewyVar3.c();
                ewy ewyVar4 = gamesCatalogComponentImpl.f;
                qcy<Object> qcyVar5 = qcyVarArr[5];
                return new ldt(bdtVar, cctVar, fdtVar, ykgVar, (q73) ewyVar4.c());
            case 2:
                return ((NotificationsSettingsComponent) ((ImBridgeComponentImpl) obj).b.getValue()).a();
            case 3:
                return ((OfflineAudioComponent) ((k7m) m7m.f((com.vk.music.offline.impl.sync.d) obj)).a(fpf0.a(OfflineAudioComponent.class))).Ib();
            case 4:
                return ((OfflineAudioComponent) ((kc50) obj).b.getValue()).O2();
            case 5:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                fk80 I = offlineAudioComponentImpl.I();
                com.vk.music.player.cache.a v0 = offlineAudioComponentImpl.v0();
                nwy nwyVar2 = offlineAudioComponentImpl.z;
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                qcy<Object> qcyVar6 = qcyVarArr3[12];
                bf5 bf5Var = (bf5) nwyVar2.c();
                df5 u3 = offlineAudioComponentImpl.u3();
                kgp0 n7 = offlineAudioComponentImpl.n7();
                com.vk.music.offline.api.domain.download.a aVar = (com.vk.music.offline.api.domain.download.a) offlineAudioComponentImpl.v.getValue();
                nwy nwyVar3 = offlineAudioComponentImpl.B;
                qcy<Object> qcyVar7 = qcyVarArr3[13];
                wa40 wa40Var = (wa40) nwyVar3.c();
                r5v0 r5v0Var = k840.a.h;
                return new dn80(I, v0, bf5Var, u3, n7, aVar, wa40Var, r5v0Var != null ? r5v0Var : null);
            default:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.eduScheduleStorage"));
                try {
                    return new g7p(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
        }
    }
}

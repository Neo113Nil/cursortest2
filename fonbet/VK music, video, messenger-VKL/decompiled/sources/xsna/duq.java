package xsna;

import android.os.Trace;
import com.vk.core.apps.BuildInfo;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.internal.storage.database.FeatureDatabase_Impl;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import xsna.dd9;
import xsna.o260;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class duq implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ duq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new f0r0((FeatureDatabase_Impl) obj);
            case 1:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) obj;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                nwy nwyVar = gamesCatalogComponentImpl.d;
                qcy<Object> qcyVar = GamesCatalogComponentImpl.s[3];
                return new dat((cct) nwyVar.c(), gamesCatalogComponentImpl.Df(), gamesCatalogComponentImpl.Ef());
            case 2:
                return ((DialogsScreenFeatureComponent) ((ImBridgeComponentImpl) obj).f.getValue()).g7();
            case 3:
                return ((MultiAccountComponent) ((axw) obj).c().a(fpf0.a(MultiAccountComponent.class))).c();
            case 4:
                return new k3b(((MusicSubscriptionComponent) ((syw) obj).c.invoke().a(fpf0.a(MusicSubscriptionComponent.class))).q1());
            case 5:
                return ((PlayerUIComponent) m7m.a(((nx50) obj).b).a(fpf0.a(PlayerUIComponent.class))).O6();
            case 6:
                BuildInfo.Client client = BuildInfo.a;
                return new hql("VKAndroidApp", (String) BuildInfo.i.getValue(), String.valueOf(BuildInfo.e), iah0.j(((o260.c) obj).a));
            case 7:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.storiesInfoManager"));
                try {
                    wsl0 wsl0Var = new wsl0(bhl0Var.B());
                    bhl0Var.z(wsl0Var);
                    return wsl0Var;
                } finally {
                    Trace.endSection();
                }
            case 8:
                VKApplication.a aVar = VKApplication.c;
                ((ph20) ((bpn0) obj).getValue()).a();
                ftw0 ftw0Var = new ftw0();
                cd9 e = a201.b().e();
                io.reactivex.rxjava3.subjects.d<dd9.a> dVar = new hd9(o25.a(), e, ((SessionManagementComponent) ((k7m) m7m.f(ftw0Var)).a(fpf0.a(SessionManagementComponent.class))).J2()).e;
                dVar.getClass();
                io.reactivex.rxjava3.internal.operators.observable.j1 b0 = new io.reactivex.rxjava3.internal.operators.observable.z0(dVar).b0(dd9.a.e.class);
                final dtw0 dtw0Var = new dtw0();
                ftw0Var.b.b(b0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.etw0
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj2) {
                        dtw0.this.invoke(obj2);
                    }
                }, kwg0.b()));
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr2 = VoipAnalyticsInternalComponent.b;
                return new ymw0((und0) obj);
        }
    }
}

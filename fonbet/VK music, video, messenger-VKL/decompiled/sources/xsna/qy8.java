package xsna;

import android.content.Context;
import android.os.Trace;
import com.vk.donut.video.subscription.impl.data.db.CachedSubscriptionsDb_Impl;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.log.L;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.network.di.NetworkComponentImpl;
import com.vk.protect.di.ProtectAppComponent;
import com.vk.resetcounters.api.di.ResetCountersComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.vksteps.di.VkStepsComponentImpl;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.prodstat.analytics.share.click.VoipShareLinkClickAnalytics;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import xsna.ndw;
import xsna.p180.a;
import xsna.qdw;
import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qy8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qy8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new zxm0((CachedSubscriptionsDb_Impl) obj);
            case 1:
                return (rkc) ((rb8) obj).invoke();
            case 2:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) obj;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                return new l8t(gamesCatalogComponentImpl.Df(), gamesCatalogComponentImpl.Ef());
            case 3:
                return new cig(((VoipCallComponent) ((ImBridgeComponentImpl) obj).g.getValue()).X6());
            case 4:
                return new msl(((s2w) obj).a, s2w.o);
            case 5:
                qdw qdwVar = (qdw) obj;
                return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(qdwVar.d.F(new ew(new qdw.b(L.a), 25)), new defpackage.i0(new g1j(qdwVar, 17), 26), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new sd6(qdwVar, 5)).o0(io.reactivex.rxjava3.core.x.k(new ndw.a(jgp.b))).g0().O0();
            case 6:
                return ((ProtectAppComponent) ((axw) obj).c().a(fpf0.a(ProtectAppComponent.class))).I9();
            case 7:
                Boolean bool = (Boolean) ((wjy.a) obj).F.getValue();
                bool.getClass();
                return bool;
            case 8:
                return new faw(new sim((bpn0) obj, 19));
            case 9:
                return ((MusicPrefsComponent) ((k7m) m7m.f((com.vk.music.offline.impl.sync.d) obj)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 10:
                return (OfflineAudioComponent) ((k7m) m7m.f((kc50) obj)).a(fpf0.a(OfflineAudioComponent.class));
            case 11:
                return ((ResetCountersComponent) m7m.a(((nx50) obj).b).a(fpf0.a(ResetCountersComponent.class))).b();
            case 12:
                return new com.vk.toggle.e(((NetworkComponentImpl) obj).a.H9());
            case 13:
                return ((p180) obj).new a();
            case 14:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.eduRoles"));
                try {
                    return new w6p(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
            case 15:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new rpl0(storiesComponentImpl.w(), storiesComponentImpl.R5());
            case 16:
                return Boolean.valueOf(!((qks0) obj).a);
            case 17:
                return fz5.d.j((Context) obj);
            case 18:
                VkStepsComponentImpl vkStepsComponentImpl = (VkStepsComponentImpl) obj;
                qcy<Object>[] qcyVarArr3 = VkStepsComponentImpl.e;
                return new com.vk.superapp.vksteps.b(vkStepsComponentImpl.a.Wb(), vkStepsComponentImpl.l3());
            default:
                qcy<Object>[] qcyVarArr4 = VoipAnalyticsInternalComponent.b;
                return new VoipShareLinkClickAnalytics((und0) obj);
        }
    }
}

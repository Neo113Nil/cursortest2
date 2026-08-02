package xsna;

import android.os.Trace;
import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.restriction.di.VideoRestrictionManagerComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vksteps.di.VkStepsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.prodstat.analytics.call.click.VoipStartCallClickAnalytics;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import kotlin.LazyThreadSafetyMode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fat implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fat(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) obj;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                return new bct(gamesCatalogComponentImpl.Df(), gamesCatalogComponentImpl.Ef());
            case 1:
                qcy<Object>[] qcyVarArr2 = ImBridgeComponentImpl.n;
                return new kjv0(msy.a(LazyThreadSafetyMode.NONE, new ehs((ImBridgeComponentImpl) obj, 2)));
            case 2:
                return ((AccountManagerComponent) ((axw) obj).c().a(fpf0.a(AccountManagerComponent.class))).c();
            case 3:
                return ((PlayerUIComponent) obj).Ra().a();
            case 4:
                return ((QueueSyncComponent) ((nmg0) ((ph20) obj).c.invoke()).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 5:
                return ((DialogsScreenFeatureComponent) m7m.a(((nx50) obj).b).a(fpf0.a(DialogsScreenFeatureComponent.class))).g7();
            case 6:
                return ((MusicPrefsComponent) ((k7m) m7m.f((ubb0) obj)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 7:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.accountStorageManager"));
                try {
                    ws wsVar = new ws(bhl0Var.B());
                    bhl0Var.z(wsVar);
                    return wsVar;
                } finally {
                    Trace.endSection();
                }
            case 8:
                Object a = ofx.a(((StoriesComponentImpl) obj).f.a);
                if (a != null) {
                    return (zix) a;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 9:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 10:
                qcy<Object>[] qcyVarArr3 = VideoRestrictionManagerComponentImpl.c;
                return new idt0(new y0f(13), new VideoRestrictionManagerComponentImpl.b(0, xuo0.a, xuo0.class, "timeSeconds", "timeSeconds()J", 0), ((VideoRestrictionManagerComponentImpl) obj).a.J());
            case 11:
                VkHealthPermissionsComponent vkHealthPermissionsComponent = ((VkStepsComponentImpl) obj).a;
                j9u j9uVar = new j9u(vkHealthPermissionsComponent.Wb());
                v0l0 v0l0Var = new v0l0();
                c0v c0vVar = new c0v();
                nr4 nr4Var = new nr4();
                glv glvVar = new glv();
                dm10 dm10Var = new dm10();
                xmv0 xmv0Var = new xmv0();
                env0 env0Var = new env0();
                umv0 umv0Var = new umv0(j9uVar, c0vVar, glvVar, v0l0Var, nr4Var, dm10Var);
                tji0 tji0Var = new tji0(umv0Var, xmv0Var);
                qwt qwtVar = new qwt(xmv0Var);
                ywt ywtVar = new ywt(xmv0Var);
                d9q0 d9q0Var = new d9q0(umv0Var, tji0Var, qwtVar, env0Var);
                rwt rwtVar = new rwt(umv0Var, qwtVar);
                twt twtVar = new twt(umv0Var);
                return new imv0(env0Var, tji0Var, qwtVar, ywtVar, d9q0Var, vkHealthPermissionsComponent.Wb(), rwtVar, new vwt(new gmv0(), vkHealthPermissionsComponent.Wb()), twtVar);
            default:
                qcy<Object>[] qcyVarArr4 = VoipAnalyticsInternalComponent.b;
                return new VoipStartCallClickAnalytics((und0) obj);
        }
    }
}

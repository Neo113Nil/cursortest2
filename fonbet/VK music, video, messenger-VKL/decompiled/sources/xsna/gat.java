package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.os.Trace;
import android.provider.Settings;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.pushes.PushComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.vksteps.di.VkStepsComponentImpl;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import kotlin.LazyThreadSafetyMode;
import okhttp3.d;
import xsna.s2w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class gat implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gat(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                return new wet(gamesCatalogComponentImpl.Df(), gamesCatalogComponentImpl.Ef());
            case 1:
                ImBridgeComponentImpl imBridgeComponentImpl = (ImBridgeComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = ImBridgeComponentImpl.n;
                return new dqu0(msy.a(LazyThreadSafetyMode.NONE, new duq(imBridgeComponentImpl, 2)));
            case 2:
                s2w s2wVar = (s2w) this.c;
                return new p1w(s2wVar.f, new s2w.a(1, s2wVar, s2w.class, "onCredentialsUpdate", "onCredentialsUpdate(Z)V", 0));
            case 3:
                return ((QueueSyncComponent) ((axw) this.c).c().a(fpf0.a(QueueSyncComponent.class))).i0();
            case 4:
                return ((MusicPrefsComponent) ((syw) this.c).c().a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 5:
                uev0 sc = ((PushComponent) ((nmg0) ((ph20) this.c).c.invoke()).a(fpf0.a(PushComponent.class))).sc();
                sc.getClass();
                return Boolean.valueOf(((ebl) sc.m.getValue()).a().e);
            case 6:
                return ((MusicPrefsComponent) ((k7m) m7m.f((mm20) this.c)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 7:
                return ((CommunityComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(CommunityComponent.class))).G0();
            case 8:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                fz5 fz5Var = fz5.d;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return offlineAudioComponentImpl.Df(new v9v((d.a) offlineAudioComponentImpl.i.getValue(), fz5Var.t(context)), true);
            case 9:
                z1h0 z1h0Var = (z1h0) this.c;
                z1h0Var.getLifecycle().addObserver(new xhf0(z1h0Var));
                return s3q0.a;
            case 10:
                bhl0 bhl0Var = (bhl0) this.c;
                Trace.beginSection(ndp0.f("lazy StorageManager.imItemsStorageManager"));
                try {
                    u7w u7wVar = new u7w(bhl0Var.B());
                    bhl0Var.z(u7wVar);
                    return u7wVar;
                } finally {
                    Trace.endSection();
                }
            case 11:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) this.c;
                qcy<Object>[] qcyVarArr4 = StoriesComponentImpl.N;
                return new vtl0(storiesComponentImpl.od());
            case 12:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                e1j0 e1j0Var = e1j0.a;
                e1j0Var.getClass();
                vKApplication.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, e1j0Var);
                e1j0.c = (AudioManager) vKApplication.getSystemService("audio");
                e1j0.d = e1j0.a();
                return s3q0.a;
            case 13:
                VkStepsComponentImpl vkStepsComponentImpl = (VkStepsComponentImpl) this.c;
                return new dmv0(vkStepsComponentImpl.a.Wb(), vkStepsComponentImpl.l3());
            default:
                und0 und0Var = (und0) this.c;
                qcy<Object>[] qcyVarArr5 = VoipAnalyticsInternalComponent.b;
                return new itw0(und0Var);
        }
    }
}

package xsna;

import androidx.room.RoomDatabase;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.popupmanager.api.di.PopupManagerComponent;
import com.vk.queue.di.QueueSyncComponentImpl;
import com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase;
import com.vk.story.viewer.stat.di.StoryStatisticsComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class iw00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iw00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = MarketComponentImpl.l;
                return new sw9(((MarketComponentImpl) obj).U1());
            case 1:
                return ((BridgeComponent) ((nmg0) ((ph20) obj).c.invoke()).a(fpf0.a(BridgeComponent.class))).x();
            case 2:
                return ((PopupManagerComponent) m7m.a(((nx50) obj).b).a(fpf0.a(PopupManagerComponent.class))).Dc();
            case 3:
                return new lgp0(((OfflineAudioComponentImpl) obj).b);
            case 4:
                qcy<Object>[] qcyVarArr2 = QueueSyncComponentImpl.f;
                return new os(((QueueSyncComponentImpl) obj).i0());
            case 5:
                return ((fsk0) obj).k.invoke("VKStatsSendThread");
            default:
                StoryStatisticsComponentImpl storyStatisticsComponentImpl = (StoryStatisticsComponentImpl) obj;
                AppContextDiComponent appContextDiComponent = storyStatisticsComponentImpl.a;
                RoomDatabase.a a = bhv0.a(appContextDiComponent.a, "story_statistics_db", StoryStatisticsDatabase.class);
                a.c();
                asu0.a.getClass();
                a.f = asu0.n();
                StoryStatisticsDatabase storyStatisticsDatabase = (StoryStatisticsDatabase) a.b();
                kem0 kem0Var = new kem0(storyStatisticsDatabase.z(), storyStatisticsDatabase.C(), storyStatisticsDatabase.D(), storyStatisticsDatabase.y(), storyStatisticsDatabase.A(), storyStatisticsDatabase.B(), appContextDiComponent.a.getDatabasePath(storyStatisticsDatabase.i().getDatabaseName()));
                kem0Var.b(BuildInfo.e);
                storyStatisticsComponentImpl.b.yc().c(kem0Var);
                return new zgm0(new jzi0(4), kem0Var);
        }
    }
}

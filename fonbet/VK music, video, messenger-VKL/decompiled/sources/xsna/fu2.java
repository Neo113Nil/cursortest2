package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.dialogs.di.VideoDialogsComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.b;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fu2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fu2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                throw new IllegalStateException("Access to Anonymous toggles when user is logged in. " + ((b.a) r1).getKey());
            case 1:
                return ((StoryViewerComponent) ((ImBridgeComponentImpl) r1).c.getValue()).tb();
            case 2:
                return ((OfflineAudioComponent) ((kc50) r1).b.getValue()).W8();
            case 3:
                return ((com.vk.toggle.e) r1).a.c();
            case 4:
                return (ConnectivityManager) ((n560) r1).a.getSystemService("connectivity");
            case 5:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                return (AdPixelStatsComponent) r1.getValue();
            case 6:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) r1;
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                df5 u3 = offlineAudioComponentImpl.u3();
                kgp0 n7 = offlineAudioComponentImpl.n7();
                fk80 I = offlineAudioComponentImpl.I();
                com.vk.music.player.cache.a v0 = offlineAudioComponentImpl.v0();
                nwy nwyVar = offlineAudioComponentImpl.z;
                qcy<Object> qcyVar = OfflineAudioComponentImpl.M[12];
                bf5 bf5Var = (bf5) nwyVar.c();
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                return new ab40(u3, n7, I, v0, bf5Var, r5v0Var, k840.a.i);
            case 7:
                bhl0 bhl0Var = (bhl0) r1;
                Trace.beginSection(ndp0.f("lazy StorageManager.eduMaxTransitionStorage"));
                try {
                    return new nt8(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
            case 8:
                return Boolean.valueOf(((qks0) r1).a);
            case 9:
                Context context = (Context) r1;
                return new v7s0(context, new p7s0(context));
            case 10:
                return ((VideoDialogsComponent) ((k7m) m7m.f((idt0) r1)).mo408a(fpf0.a(VideoDialogsComponent.class))).O8();
            default:
                return (c8m) ((jau0) r1).g.getValue();
        }
    }
}

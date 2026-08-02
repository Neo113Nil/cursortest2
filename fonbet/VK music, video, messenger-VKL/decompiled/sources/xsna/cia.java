package xsna;

import android.os.Looper;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.utils.log.Logger;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.di.SuperAppBridgeComponent;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.io.File;
import okhttp3.o;
import xsna.aql0;
import xsna.o260;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cia(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                ?? r0 = this.c;
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((CameraClipsComponent) r0.getValue()).sf();
            case 1:
                return new suo((xuo) ((ruo) this.c).c.getValue());
            case 2:
                return ((SuperAppBridgeComponent) ((gxw) this.c).c().a(fpf0.a(SuperAppBridgeComponent.class))).E4();
            case 3:
                return ((VoipCallsJoinRouterComponent) ((LinksBridgeComponentImpl) this.c).i.getValue()).a();
            case 4:
                MainActivity mainActivity = (MainActivity) this.c;
                String str = MainActivity.P;
                mainActivity.getClass();
                return (crw) upj.c.invoke(mainActivity);
            case 5:
                return ((MusicPrefsComponent) ((k7m) m7m.f((s750) this.c)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 6:
                return new m8b0((OfflineAudioDatabase_Impl) this.c);
            case 7:
                vx70 vx70Var = (vx70) this.c;
                if (epx.f(Looper.getMainLooper(), Looper.myLooper())) {
                    throw new IllegalStateException("UI thread");
                }
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                NetworkClient.ClientType clientType = NetworkClient.ClientType.CLIENT_API;
                o.a f = o260Var.f(clientType);
                if (BuildInfo.s()) {
                    f.a(new q460());
                }
                o260 o260Var2 = d260.a;
                o260 o260Var3 = o260Var2 != null ? o260Var2 : null;
                Logger.LogLevel logLevel = Logger.LogLevel.NONE;
                u8y u8yVar = vx70Var.a;
                if (logLevel != ((bpn0) ((VKApiConfig) u8yVar.b).i.getLogLevel()).getValue()) {
                    VKApiConfig vKApiConfig = (VKApiConfig) u8yVar.b;
                    f.a(vx70Var.c(vKApiConfig.m, vKApiConfig.i, vKApiConfig.j));
                }
                o260.a aVar = (o260.a) o260Var3.q.get(clientType.ordinal());
                synchronized (aVar.b) {
                    aVar.c = f;
                    aVar.d = new okhttp3.o(f);
                    s3q0 s3q0Var = s3q0.a;
                }
                return ((VKApiConfig) vx70Var.a.b).h;
            case 8:
                PhotosComponentImpl photosComponentImpl = (PhotosComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = PhotosComponentImpl.u;
                nwy nwyVar = photosComponentImpl.n;
                qcy<Object> qcyVar = PhotosComponentImpl.u[13];
                return new zh1((aga0) nwyVar.c());
            case 9:
                aid0 aid0Var = (aid0) this.c;
                xhd0 xhd0Var = aid0Var.b;
                return aid0Var.h(new uoe0(xhd0Var.i.b(), xhd0Var.j, xhd0Var.a), new uso0[]{new LocalExifThumbnailProducer(xhd0Var.i.e(), xhd0Var.j, xhd0Var.a)});
            case 10:
                return new File(((VKApplication) this.c).getFilesDir(), "push-analytics");
            case 11:
                StoryViewerComponentImpl storyViewerComponentImpl = (StoryViewerComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = StoryViewerComponentImpl.s;
                StoriesFeatures storiesFeatures = StoriesFeatures.NEW_PRELOADER;
                storiesFeatures.getClass();
                if (!com.vk.toggle.b.A.a(storiesFeatures)) {
                    return aql0.a.a.getSTUB();
                }
                e1m0 e1m0Var = new e1m0(i);
                v5m0 u5 = storyViewerComponentImpl.a.u5();
                nwy nwyVar2 = storyViewerComponentImpl.m;
                qcy<Object> qcyVar2 = StoryViewerComponentImpl.s[10];
                return new fql0(e1m0Var, u5, (hnm0) nwyVar2.c());
            case 12:
                return ((ClipsBlacklistsComponent) ((k7m) m7m.f((z9o0) this.c)).a(fpf0.a(ClipsBlacklistsComponent.class))).f4();
            case 13:
                if (((qks0) this.c).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_DESIGN_REFACTORING;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                return (CameraClipsComponent) ((k7m) m7m.f((kzv0) this.c)).a(fpf0.a(CameraClipsComponent.class));
            default:
                return new mgr0((bpn0) this.c);
        }
    }
}

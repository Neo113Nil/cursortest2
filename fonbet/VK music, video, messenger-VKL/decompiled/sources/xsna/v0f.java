package xsna;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.vk.clips.download.impl.di.ClipsDownloadComponentImpl;
import com.vk.core.files.c;
import com.vk.foldertypeobserver.impl.FolderTypeObserverComponentImpl;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.movika.impl.di.MovikaComponentImpl;
import com.vk.music.di.StickyPlayerComponent;
import com.vk.music.podcast.impl.di.PodcastComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.VKApplication;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.b0g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class v0f implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ v0f(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        Set set = null;
        int i = 0;
        switch (this.b) {
            case 0:
                return new ClipsDownloadComponentImpl.a();
            case 1:
                return new bpx0();
            case 2:
                return new StringBuilder();
            case 3:
                return ((GamesCatalogComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(GamesCatalogComponent.class))).E();
            case 4:
                return new StickyPlayerComponent.a();
            case 5:
                return Boolean.valueOf(fxc0.B().J().q0());
            case 6:
                c63.j.getClass();
                ReentrantReadWriteLock reentrantReadWriteLock = b0g.c;
                Lock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    if (!b0g.f) {
                        b0g.f = true;
                        b0g.d.countDown();
                        Lock writeLock2 = reentrantReadWriteLock.writeLock();
                        writeLock2.lock();
                        LinkedHashSet linkedHashSet = b0g.e;
                        set = j5g.S0(linkedHashSet);
                        linkedHashSet.clear();
                        writeLock2.unlock();
                    }
                    if (set != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((izs) b0g.b.getValue()).invoke(new a0g((b0g.a) it.next(), i));
                        }
                    }
                    return s3q0.a;
                } catch (Throwable th) {
                    throw th;
                } finally {
                    writeLock.unlock();
                }
            case 7:
                qcy<Object>[] qcyVarArr = PodcastComponentImpl.g;
                return new thb0();
            case 8:
                return e43.l(c.d.c, c.C0768c.c, c.b.c, c.a.c, c.f.c, c.e.c);
            case 9:
                return l370.j();
            case 10:
                VKApplication.a aVar = VKApplication.c;
                return ((VideoNotificationsPermissionComponent) m7m.e().a(fpf0.a(VideoNotificationsPermissionComponent.class))).V();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.UPLOADER_WATCH_PRIVACY_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                VideoFeatures videoFeatures2 = VideoFeatures.ONBOARDING_PROMO_ANON;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 13:
                return new FolderTypeObserverComponentImpl.a();
            case 14:
                return new MovikaComponentImpl.a();
            case 15:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                if (vKApplication == null) {
                    vKApplication = null;
                }
                PackageManager packageManager = vKApplication.getPackageManager();
                if (packageManager != null) {
                    VKApplication vKApplication2 = com.vk.core.apps.a.a;
                    PackageInfo packageInfo = packageManager.getPackageInfo((vKApplication2 != null ? vKApplication2 : null).getPackageName(), 0);
                    if (packageInfo != null && (str = packageInfo.versionName) != null) {
                        return str;
                    }
                }
                throw new IllegalStateException("Please specify version name!");
            case 16:
                qcy<Object>[] qcyVarArr2 = VoipAnalyticsInternalComponent.b;
                return new btw0(new d3x0());
            case 17:
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
                cVar.getClass();
                return new o4x0(cVar, oKVoipEngine, com.vk.voip.ui.c.j0(), com.vk.voip.ui.c.p, new d2c0(18));
            default:
                return new uit();
        }
    }
}

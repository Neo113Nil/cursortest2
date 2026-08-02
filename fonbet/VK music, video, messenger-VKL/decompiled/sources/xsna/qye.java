package xsna;

import android.net.wifi.WifiManager;
import android.os.Process;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.ironsource.Ya;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.dto.music.Thumb;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.protocol.impl.notifications.RtcNotificationReceiverImpl;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.util.AsyncEffectResourceProvider;
import xsna.jpx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qye implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qye(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        File parentFile;
        File parentFile2;
        WifiManager.WifiLock wifiLock;
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                rye ryeVar = (rye) this.d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                try {
                    ryeVar.cancel();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 1:
                ((x9j) this.c).b.a((PromoSessionInfo) this.d);
                return;
            case 2:
                pel pelVar = (pel) this.c;
                lzi0 lzi0Var = (lzi0) this.d;
                synchronized (pelVar.a) {
                    pelVar.a.remove(lzi0Var);
                }
                return;
            case 3:
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.c;
                b.g gVar = (b.g) this.d;
                if (FragmentManager.P(2)) {
                    operation.toString();
                }
                operation.c(gVar);
                return;
            case 4:
                ((fhs) this.c).k.add((String) this.d);
                return;
            case 5:
                iy30 iy30Var = (iy30) this.c;
                hy30 hy30Var = (hy30) this.d;
                ViewPager viewPager = iy30Var.n;
                if (viewPager == null) {
                    viewPager = null;
                }
                viewPager.setVisibility(0);
                ViewPager viewPager2 = iy30Var.n;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                viewPager2.setAlpha(1.0f);
                ViewPager viewPager3 = iy30Var.n;
                if (viewPager3 == null) {
                    viewPager3 = null;
                }
                if (viewPager3.getAdapter() == null) {
                    ViewPager viewPager4 = iy30Var.n;
                    (viewPager4 != null ? viewPager4 : null).setAdapter(iy30Var.a());
                }
                iy30Var.a().c(hy30Var);
                return;
            case 6:
                ThumbsImageView thumbsImageView = (ThumbsImageView) this.c;
                Thumb thumb = (Thumb) this.d;
                MusicClipsSelectorCatalogRootVh.a aVar = MusicClipsSelectorCatalogRootVh.J;
                thumbsImageView.setThumb(thumb);
                thumbsImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                return;
            case 7:
                xj60 xj60Var = (xj60) this.d;
                gzs gzsVar2 = (gzs) this.c;
                xj60Var.b.m("Task completed");
                gzsVar2.invoke();
                xj60Var.b();
                return;
            case 8:
                kno knoVar = (kno) this.c;
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.d;
                if (knoVar == null || (file = knoVar.a) == null || (parentFile = file.getParentFile()) == null || (parentFile2 = parentFile.getParentFile()) == null) {
                    return;
                }
                bVar.u = true;
                boolean z = knoVar.b;
                bVar.w = z;
                bVar.z = knoVar.e;
                bVar.G.allowAudio(true ^ z);
                bVar.s(parentFile2);
                bVar.I.setVideoSize(knoVar.c, knoVar.d);
                bVar.I.setEffectListener(bVar.J);
                bVar.I.selectEffect(EffectRegistry.EffectId.DUETS, new AsyncEffectResourceProvider(parentFile2));
                com.vk.media.ok.a aVar2 = bVar.h;
                if (aVar2 != null) {
                    aVar2.f(bVar.H0);
                }
                com.vk.media.ok.a aVar3 = bVar.h;
                if (aVar3 != null) {
                    aVar3.l();
                    return;
                }
                return;
            case 9:
                ((PeerConnectionClient) this.c).d((SessionDescription) this.d);
                return;
            case 10:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                String[] strArr = PostViewFragment.T0;
                PostViewFragmentTimeSpentTracker Do = postViewFragment.Do();
                if (Do != null) {
                    Do.a(recyclerView);
                    return;
                }
                return;
            case 11:
                jcd0 jcd0Var = (jcd0) this.c;
                Runnable runnable = (Runnable) this.d;
                try {
                    jcd0Var.getClass();
                    Process.setThreadPriority(10);
                } catch (Throwable unused2) {
                }
                runnable.run();
                return;
            case 12:
                ((RtcNotificationReceiverImpl) this.c).b((Throwable) this.d);
                return;
            case 13:
                SessionRoomListenerManagerImpl.sendActualState$lambda$0((SessionRoomListenerManagerImpl) this.c, (SessionRoomsManager.OwnRoomsListener) this.d);
                return;
            case 14:
                jpx0.a aVar4 = (jpx0.a) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                synchronized (aVar4) {
                    if (atomicBoolean.get() && (wifiLock = aVar4.b) != null) {
                        wifiLock.release();
                    }
                }
                return;
            case 15:
                Ya.c((Ya) this.c, (LevelPlayAdInfo) this.d);
                return;
            default:
                yads.wl2.a((yads.wl2) this.c, (yads.qr2) this.d);
                return;
        }
    }

    public /* synthetic */ qye(xj60 xj60Var, gzs gzsVar) {
        this.b = 7;
        this.d = xj60Var;
        this.c = gzsVar;
    }
}

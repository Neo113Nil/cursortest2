package xsna;

import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.catalog.mvi.section.impl.di.CatalogComponentImpl;
import com.vk.headset.internal.HeadsetWiredConnectedReceiver;
import com.vk.music.notifications.headset.listeners.HeadsetBluetoothConnectionChangedReceiver;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.network.di.NetworkComponent;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.SuperAppPip2Component;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t3a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t3a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((CatalogInteractorComponent) ((CatalogComponentImpl) obj).a.getValue()).z0();
            case 1:
                return ((NetworkComponent) ((r360) obj).c().a(fpf0.a(NetworkComponent.class))).vd();
            case 2:
                NewsFeedComponentImpl newsFeedComponentImpl = (NewsFeedComponentImpl) obj;
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                nwy nwyVar = newsFeedComponentImpl.h;
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                qcy<Object> qcyVar = qcyVarArr2[5];
                eax0 eax0Var = (eax0) nwyVar.c();
                nwy nwyVar2 = newsFeedComponentImpl.j;
                qcy<Object> qcyVar2 = qcyVarArr2[7];
                v30 v30Var = (v30) nwyVar2.c();
                w50 xb = newsFeedComponentImpl.xb();
                qcy<Object> qcyVar3 = qcyVarArr2[5];
                return new h4c0(eax0Var, v30Var, xb, new f4c0((eax0) nwyVar.c(), newsFeedComponentImpl.l0()));
            case 3:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                lq40 Ja = offlineAudioComponentImpl.Ja();
                df5 u3 = offlineAudioComponentImpl.u3();
                nwy nwyVar3 = offlineAudioComponentImpl.B;
                qcy<Object> qcyVar4 = OfflineAudioComponentImpl.M[13];
                return new if40(Ja, u3, (wa40) nwyVar3.c(), offlineAudioComponentImpl.f);
            case 4:
                return new SuperAppPip2Component.c(((SuperAppPip2Component) obj).a);
            case 5:
                VKApplication vKApplication = (VKApplication) obj;
                VKApplication.a aVar = VKApplication.c;
                dau0 dau0Var = new dau0();
                mn8 mn8Var = new mn8(12);
                bzu bzuVar = bzu.b;
                bzu bzuVar2 = bzu.b;
                HeadsetWiredConnectedReceiver headsetWiredConnectedReceiver = new HeadsetWiredConnectedReceiver(bzuVar2);
                vKApplication.registerReceiver(headsetWiredConnectedReceiver, new IntentFilter(headsetWiredConnectedReceiver.a()));
                if (Build.VERSION.SDK_INT >= 31) {
                    ((AudioManager) vKApplication.getSystemService("audio")).registerAudioDeviceCallback(new wyu(bzuVar2), null);
                } else {
                    HeadsetBluetoothConnectionChangedReceiver headsetBluetoothConnectionChangedReceiver = new HeadsetBluetoothConnectionChangedReceiver();
                    vKApplication.registerReceiver(headsetBluetoothConnectionChangedReceiver, new IntentFilter(headsetBluetoothConnectionChangedReceiver.a()));
                }
                vKApplication.registerActivityLifecycleCallbacks(new uyu());
                c63 c63Var = c63.a;
                c63.a(new vyu());
                bzu.k = dau0Var;
                bzu.l = mn8Var;
                return s3q0.a;
            default:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.PROFILE_CREATOR_ONBOARDING;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}

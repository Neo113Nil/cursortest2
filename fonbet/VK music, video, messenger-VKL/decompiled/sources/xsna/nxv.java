package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class nxv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nxv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                nwy nwyVar = ((ImBridgeComponentImpl) obj).m;
                qcy<Object> qcyVar = ImBridgeComponentImpl.n[4];
                return (fib) nwyVar.c();
            case 1:
                return Integer.valueOf(((NavigationDelegateActivity) obj).getResources().getDimensionPixelSize(R.dimen.informer_height));
            case 2:
                return ((com.vk.toggle.e) obj).a.d();
            case 3:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                ((NewsFeedComponentImpl) obj).Df().getClass();
                return p870.f();
            case 4:
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                return new i5q((androidx.media3.exoplayer.offline.c) ((OfflineAudioComponentImpl) obj).C.getValue());
            case 5:
                if (!((Boolean) ((qks0) obj).K0.getValue()).booleanValue()) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SPORT_ONBOARDING;
                    videoFeatures.getClass();
                    if (!com.vk.toggle.b.A.a(videoFeatures)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                return (ik80) ((bpn0) obj).getValue();
            case 7:
                return ((BridgeComponent) ((k7m) m7m.f((idt0) obj)).a(fpf0.a(BridgeComponent.class))).s();
            default:
                q3a q3aVar = (q3a) obj;
                return e43.l(new dks0(q3aVar), new nog(q3aVar), new cal0(q3aVar), new nk40(q3aVar), new c2e(q3aVar), new los(q3aVar), new pb60(q3aVar), new yu00(q3aVar));
        }
    }
}

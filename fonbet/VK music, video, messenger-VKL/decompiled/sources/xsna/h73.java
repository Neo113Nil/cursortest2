package xsna;

import com.vk.api.request.core.persistent.PersistentRequest;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import ru.mail.libverify.n.g;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.stat.audio.AudioErrorEvent;
import ru.ok.gleffects.EffectHolder;
import xsna.g73;
import xsna.pk9;
import xsna.skm0;
import xsna.vcn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class h73 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h73(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((z63) obj2).invoke(new g73.a.C2917a((RuntimeException) obj));
                break;
            case 1:
                ArrayList<rne0> arrayList = (ArrayList) obj;
                pk9.b bVar = ((ok9) obj2).e;
                if (bVar != null) {
                    bVar.a(arrayList);
                    break;
                }
                break;
            case 2:
                ((vcn.a) obj2).e.f((izs) obj);
                break;
            case 3:
                ((EffectHolder) obj2).lambda$receiveDeviceRotationMatrix$13((float[]) obj);
                break;
            case 4:
                xz2 xz2Var = (xz2) obj;
                Object obj3 = null;
                PersistentRequest persistentRequest = new PersistentRequest(xz2Var.b, xz2Var.j, null);
                ((y0a0) obj2).getClass();
                try {
                    obj3 = wmi0.a.e("persistent_request_queue").a();
                } catch (Throwable unused) {
                }
                List list = (List) obj3;
                LinkedHashSet linkedHashSet = list != null ? new LinkedHashSet(list) : new LinkedHashSet();
                linkedHashSet.add(persistentRequest);
                wmi0.a.m("persistent_request_queue", j5g.O0(linkedHashSet));
                Objects.toString(persistentRequest);
                break;
            case 5:
                com.vk.profile.questions.impl.d dVar = (com.vk.profile.questions.impl.d) obj;
                int i2 = QuestionsListFragment.f0;
                kqe0 kqe0Var = (kqe0) ((QuestionsListFragment) obj2).S;
                if (kqe0Var != null) {
                    kqe0Var.o3(dVar);
                    break;
                }
                break;
            case 6:
                ((SharedPeerConnectionFactory) obj2).b((AudioErrorEvent) obj);
                break;
            case 7:
                ((skm0.a) obj2).c0(o25.a().a(((StoryEntry) obj).d), !r1.o0);
                break;
            case 8:
                ((InterstitialAdLoader) obj2).loadAd((AdRequestConfiguration) obj);
                break;
            default:
                ru.mail.libverify.n.h.a((ru.mail.libverify.n.h) obj2, (g.b) obj);
                break;
        }
    }
}

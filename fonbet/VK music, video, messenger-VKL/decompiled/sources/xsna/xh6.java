package xsna;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.log.L;
import com.vk.managed_groups.impl.ManagedGroupsComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.protect.di.ProtectAppComponent;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import okhttp3.o;
import org.json.JSONObject;
import xsna.k840;
import xsna.thn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xh6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xh6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        boolean z = true;
        String str = null;
        hep hepVar = null;
        str = null;
        switch (this.b) {
            case 0:
                Context context = e43.a;
                return ((PurchasesManagerComponent) m7m.e().a(fpf0.a(PurchasesManagerComponent.class))).J7();
            case 1:
                zrk b = com.vk.toggle.d.p0.b();
                if (b == null) {
                    zrk.b.getClass();
                    b = zrk.c;
                }
                o.a aVar = new o.a();
                aVar.c(b.a, TimeUnit.MILLISECONDS);
                return ovn.b(new okhttp3.o(aVar));
            case 2:
                try {
                    Context context2 = ucp.p;
                    if (context2 == null) {
                        context2 = null;
                    }
                    hepVar = new hep(context2.getResources());
                } catch (Exception unused) {
                }
                return new udp(hepVar);
            case 3:
                return new i1c0();
            case 4:
                s750 s750Var = k840.a.e;
                if (s750Var != null) {
                    return s750Var;
                }
                return null;
            case 5:
                return new io.reactivex.rxjava3.subjects.f();
            case 6:
                return puu0.a;
            case 7:
                return s3q0.a;
            case 8:
                CoreFeatures coreFeatures = CoreFeatures.SWITCH_VK_RU_DOMAIN;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 9:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                return new ew0(new imj0());
            case 10:
                try {
                    Context context3 = e43.a;
                    if (context3 == null) {
                        context3 = null;
                    }
                    String simCountryIso = ((TelephonyManager) context3.getSystemService("phone")).getSimCountryIso();
                    if (!drm0.N(simCountryIso) && simCountryIso.length() == 2) {
                        str = simCountryIso;
                    }
                    if (str == null) {
                        str = Locale.getDefault().getCountry();
                    }
                    failure = str.toUpperCase(Locale.ROOT);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    L.i(a);
                }
                boolean z2 = failure instanceof Result.Failure;
                Object obj = failure;
                if (z2) {
                    obj = "";
                }
                return (String) obj;
            case 11:
                return new m4n();
            case 12:
                return new thn0.g(new thn0.f(new thn0.h(48, 48, 24.0f), new thn0.h(56, 56, 28.0f), new thn0.h(88, 88, 44.0f), new thn0.h(88, 88, 44.0f)), new thn0.f(new thn0.h(48, 48, 4.0f), new thn0.h(56, 56, 4.0f), new thn0.h(88, 88, 6.0f), new thn0.h(88, 88, 6.0f)), new thn0.f(new thn0.h(48, 48, 10.0f), new thn0.h(56, 56, 12.0f), new thn0.h(88, 88, 18.0f), new thn0.h(88, 88, 18.0f)), new thn0.f(new thn0.h(48, 36, 4.0f), new thn0.h(56, 42, 4.0f), new thn0.h(88, 66, 6.0f), new thn0.h(128, 80, 8.0f)), new thn0.f(new thn0.h(48, 65, 4.0f), new thn0.h(56, 76, 4.0f), new thn0.h(88, 120, 6.0f), new thn0.h(88, 120, 6.0f)));
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_TOPSHELF_SOUND;
                videoFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(videoFeatures)) {
                    b.d j = bVar.j(videoFeatures.getKey(), false);
                    JSONObject g = j != null ? j.g() : null;
                    if ((g != null ? g.getInt("isSoundAvailable") : 0) != 0) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                VKApplication.a aVar2 = VKApplication.c;
                return ((ProtectAppComponent) m7m.e().a(fpf0.a(ProtectAppComponent.class))).N6();
            case 15:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_DISCOVERY_ENTER_TRANSITION_RDSGN;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 16:
                return new VideoGrowthComponentImpl.a();
            case 17:
                return new t73();
            case 18:
                return new ManagedGroupsComponentImpl.a();
            case 19:
                return asu0.a.z(1, "push-registration-thread");
            default:
                return new mfv0(g460.o);
        }
    }

    public /* synthetic */ xh6(Object obj, int i) {
        this.b = i;
    }
}

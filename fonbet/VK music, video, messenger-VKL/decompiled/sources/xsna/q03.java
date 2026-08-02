package xsna;

import android.os.Build;
import com.facebook.soloader.MinElf;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.catalog.mvi.section.impl.di.CatalogInteractorComponentImpl;
import com.vk.catalog.mvi.section.impl.domain.CatalogInteractorImpl;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.ecomm.market.di.MarketProductFilterComponentImpl;
import com.vk.emailactualization.api.di.EmailActualizationComponent;
import com.vk.im.messageviews.impl.dependencies.MessageViewsFeatureComponentImpl;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.resetcounters.impl.di.ResetCountersComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.video.recast.di.RecastDiComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.Regex;
import xsna.h7y0;
import xsna.l55;
import xsna.pzv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class q03 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ q03(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                String string = Preference.j().getString("oauthHost", "api.".concat(a0a.d) + "/oauth");
                return string == null ? fo8.a("api.".concat(a0a.d), "/oauth") : string;
            case 1:
                return ((EmailActualizationComponent) ((k7m) m7m.f(new l55.b())).a(fpf0.a(EmailActualizationComponent.class))).getEntryPoint();
            case 2:
                qcy<Object>[] qcyVarArr = CatalogInteractorComponentImpl.b;
                return new CatalogInteractorImpl();
            case 3:
                a1w a1wVar = q1w.a;
                if (a1wVar != null) {
                    return a1wVar;
                }
                return null;
            case 4:
                return new UserProfileComponentImpl.a();
            case 5:
                String[] strArr = Build.SUPPORTED_ABIS;
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str : strArr) {
                    arrayList.add(cqm0.m(str));
                }
                return Boolean.valueOf(arrayList.contains(MinElf.ISA.AARCH64) || Build.SUPPORTED_64_BIT_ABIS.length != 0);
            case 6:
                t260 t260Var = hjv.g;
                if (t260Var == null) {
                    return null;
                }
                t7y0 t7y0Var = t260Var.h;
                if (!t7y0Var.a) {
                    return null;
                }
                boolean z = t7y0Var.b;
                asu0.a.getClass();
                ExecutorService q = asu0.q();
                ExecutorService n = asu0.n();
                ScheduledExecutorService u = asu0.u();
                Regex regex = com.vk.core.files.a.a;
                return new h7y0(new h7y0.b(z, q, n, u, e43.a.getFilesDir(), t7y0Var.d, new p7y0())).a();
            case 7:
                pzv.a aVar = pzv.x0;
                String str2 = "https://internal." + "api.".concat(a0a.d);
                aVar.getClass();
                String b = pzv.a.b(str2, "getEvents");
                return b == null ? pzv.a.a() : b;
            case 8:
                return new MessageViewsFeatureComponentImpl.a();
            case 9:
                return new l9r(y970.c, ServiceProvider.HTTP_CACHE_DISK_SIZE);
            case 10:
                return new MarketProductFilterComponentImpl.a();
            case 11:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new ysg0();
            case 12:
                VKApplication.a aVar2 = VKApplication.c;
                return m7m.e();
            case 13:
                return new RecastDiComponent.a();
            case 14:
                return new ResetCountersComponentImpl.a();
            case 15:
                return new ClipsCoauthorsComponentImpl.a();
            case 16:
                return asu0.d;
            case 17:
                return m1u.a("vk-network-dns");
            case 18:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.J().f();
            case 19:
                return ((VoipCallComponent) ((k7m) m7m.f(com.vk.voip.ui.c.b)).a(fpf0.a(VoipCallComponent.class))).L1();
            default:
                return new hit();
        }
    }

    public /* synthetic */ q03(VKApplication vKApplication) {
        this.b = 12;
    }
}

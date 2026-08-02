package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.fullscreen.promo.core.FullscreenPromoComponentImpl;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.im.engine.di.executor.ImCmdRxExecutorComponentImpl;
import com.vk.im.engine.di.executor.ImCmdRxExecutorScopedComponentImpl;
import com.vk.im.itemlist.impl.di.ImItemListComponentImpl;
import com.vk.onboardingpromo.impl.di.OnboardingPromoComponentImpl;
import com.vk.profile.community.details.impl.di.CommunityDetailsComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKApplication;
import org.json.JSONObject;
import xsna.oz50;
import xsna.zch0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class m03 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ m03(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        zch0 zch0Var;
        JSONObject g;
        switch (this.b) {
            case 0:
                rsr rsrVar = oz50.k;
                oz50.b.d();
                return MainActivity.class;
            case 1:
                qcy<Object>[] qcyVarArr = CommunityDetailsComponentImpl.b;
                return new x1h();
            case 2:
                qcy<Object>[] qcyVarArr2 = ImCmdRxExecutorComponentImpl.b;
                a1w a1wVar = q1w.a;
                return new mzv(a1wVar != null ? a1wVar : null);
            case 3:
                return new ImCmdRxExecutorScopedComponentImpl.a();
            case 4:
                return ylv0.a;
            case 5:
                return Float.valueOf(Resources.getSystem().getDisplayMetrics().scaledDensity);
            case 6:
                wmi0 wmi0Var = wmi0.a;
                Context context = wmi0.c;
                return Long.valueOf(com.vk.core.files.a.I((context != null ? context : null).getDatabasePath("SerializerDatabaseCache")));
            case 7:
                return new y3c0();
            case 8:
                return new MarketComponentImpl.a();
            case 9:
                VKApplication.a aVar = VKApplication.c;
                nb3 nb3Var = nb3.a;
                b.d i = com.vk.toggle.b.A.i(CoreFeatures.SCREEN_THERMAL_STATUS);
                if (i != null) {
                    if (!i.a) {
                        i = null;
                    }
                    if (i != null && (g = i.g()) != null) {
                        Gson gson = zch0.f;
                        zch0Var = zch0.a.a(g);
                        if (zch0Var != null) {
                            io.reactivex.rxjava3.disposables.b bVar = nb3.c;
                            Context context2 = e43.a;
                            bVar.b(new tfc(context2 != null ? context2 : null, zch0Var).f().subscribe());
                        }
                        return s3q0.a;
                    }
                }
                zch0Var = null;
                if (zch0Var != null) {
                }
                return s3q0.a;
            case 10:
                return new ImItemListComponentImpl.a();
            case 11:
                return new OnboardingPromoComponentImpl.a();
            case 12:
                return new FullscreenPromoComponentImpl.a();
            case 13:
                return asu0.f;
            case 14:
                return m1u.a("vk-network-okhttp");
            case 15:
                return new mnh0();
            default:
                return ((GamesCatalogComponent) ((k7m) m7m.f(qfx0.d)).a(fpf0.a(GamesCatalogComponent.class))).E();
        }
    }
}

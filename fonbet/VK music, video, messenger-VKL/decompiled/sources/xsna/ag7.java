package xsna;

import android.os.SystemClock;
import com.vk.billing.PurchasesManagerComponentImpl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.superapp.advertisement.di.fullscreen_ad.FullscreenAdFactoryComponentImpl;
import com.vk.superapp.catalog.impl.di.AppsCatalogComponentImpl;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import com.vk.toggle.Features;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ConcurrentHashMap;
import xsna.bg7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ag7 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ag7(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new bg7.c();
            case 1:
                return new z050();
            case 2:
                r55 r55Var = r55.a;
                to10 to10Var = r55.f().b;
                return new ConcurrentHashMap(3);
            case 3:
                String str = MainActivity.P;
                return new u090(com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_OOM_SCORE));
            case 4:
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                return new rfa0();
            case 5:
                return new na0();
            case 6:
                return s3q0.a;
            case 7:
                return (StatInteractorComponent) m7m.e().a(fpf0.a(StatInteractorComponent.class));
            case 8:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 9:
                VKApplication.a aVar = VKApplication.c;
                gex0 gex0Var = gex0.b;
                if (o25.a().b()) {
                    gnl gnlVar = e370.m;
                    if (gnlVar == null) {
                        gnlVar = null;
                    }
                    gnlVar.a().l();
                } else {
                    o25.a().b0(new mex0());
                }
                return s3q0.a;
            case 10:
                return new w2u();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SETTINGS_BOTTOM_SHEET_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                return new PurchasesManagerComponentImpl.a(new bpn0(new a68(16)), new bpn0(new ug9(15)));
            case 13:
                return new AppsCatalogComponentImpl.a();
            case 14:
                return new FullscreenAdFactoryComponentImpl.a();
            case 15:
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                return asu0.y() ? asu0.h() : asu0Var.b(5, 0L, "vk-fast-tasks-queue-thread");
            default:
                String str2 = (String) com.vk.core.apps.a.n.getValue();
                if (str2 != null) {
                    return str2;
                }
                throw new IllegalArgumentException("Calls API Key not provided");
        }
    }

    public /* synthetic */ ag7(xxg0 xxg0Var) {
        this.b = 7;
    }
}

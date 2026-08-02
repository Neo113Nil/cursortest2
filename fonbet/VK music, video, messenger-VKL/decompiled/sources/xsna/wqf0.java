package xsna;

import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.core.view.components.cell.VkCell;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.di.SuperAppServicesComponentImpl;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.StoriesFeatures;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wqf0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wqf0(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        CreateFile initialize$lambda$220$lambda$51;
        switch (this.b) {
            case 0:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.g(SchemeStatSak$EventScreen.VERIFICATION_BUSY_NUMBER, SchemeStatSak$EventScreen.NOWHERE_DIALOG, null, null, 12);
                return s3q0.a;
            case 1:
                initialize$lambda$220$lambda$51 = ServiceProvider.initialize$lambda$220$lambda$51();
                return initialize$lambda$220$lambda$51;
            case 2:
                return new p2m();
            case 3:
                return Boolean.valueOf(yse0.c.a());
            case 4:
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_NEW_TEMPLATE_BADGE;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 5:
                qcy<Object>[] qcyVarArr = SuperAppServicesComponentImpl.f;
                return MenuApiApplicationsCache.b;
            case 6:
                return "collectFileBatch: maxUploadFileSize has been reached";
            case 7:
                qcy<Object>[] qcyVarArr2 = UserProfileComponentImpl.m;
                xrq0 xrq0Var = new xrq0();
                xrq0Var.a = new ConcurrentHashMap<>(1);
                return xrq0Var;
            case 8:
                return Integer.valueOf((int) ((Number) x5r0.a.getValue()).floatValue());
            case 9:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 10:
                o260 o260Var = null;
                o260 o260Var2 = d260.a;
                if (o260Var2 != null) {
                    o260Var = o260Var2;
                }
                o260Var.getClass();
                return new hau0(10, q5m.a().a(), NetworkClient.b.class, "logFlipper", "logFlipper(JLokhttp3/Request;Lokhttp3/Response;Ljava/lang/String;Lokio/ByteString;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)V", 0);
            case 11:
                return VkCell.Middle.e.b.Companion.serializer();
            case 12:
                return new y4f();
            case 13:
                return s3q0.a;
            case 14:
                pqo pqoVar = opv0.a;
                return Boolean.TRUE;
            default:
                com.vk.voip.ui.c.b.r1();
                return s3q0.a;
        }
    }
}

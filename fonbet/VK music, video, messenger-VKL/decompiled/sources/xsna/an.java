package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.vendor.pushes.FirebasePushService;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.LinkedHashMap;
import ru.mail.libverify.api.VerificationFactory;
import xsna.sp40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class an implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ an(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        androidx.media3.datasource.cache.c cVar;
        switch (this.b) {
            case 0:
                String str = ((cn) this.c).b;
                return drm0.L(str, ' ', 0, 6) > -1 ? str.substring(0, drm0.L(str, ' ', 0, 6)) : str;
            case 1:
                b25 s = ((BridgeComponent) ((m25) this.c).c().a(fpf0.a(BridgeComponent.class))).s();
                s.b0(new l25());
                return s;
            case 2:
                dpf dpfVar = (dpf) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"ClipsViewersExperiments", "Init ClipsViewerExperimentsPlayer"});
                }
                return new tof(dpfVar.d);
            case 3:
                return new ewz(((s6i) this.c).b);
            case 4:
                if (((cau0) this.c).d().b) {
                    return new eox();
                }
                return null;
            case 5:
                sp40 sp40Var = (sp40) this.c;
                sp40.a aVar = sp40.k;
                File file = (File) sp40Var.e.getValue();
                synchronized (sp40.k) {
                    LinkedHashMap linkedHashMap = sp40.l;
                    cVar = (androidx.media3.datasource.cache.c) linkedHashMap.get(file.getAbsolutePath());
                    if (cVar == null) {
                        cVar = new androidx.media3.datasource.cache.c((File) sp40Var.e.getValue(), sp40Var.j, (swk) sp40Var.h.getValue(), false);
                        linkedHashMap.put(file.getAbsolutePath(), cVar);
                    }
                }
                return cVar;
            case 6:
                return ((jq40) this.c).a.v7();
            case 7:
                return new tcd(((StoriesComponentImpl) this.c).b.s());
            case 8:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar2 = VKApplication.c;
                asu0.a.getClass();
                asu0.h().submit(new y9i(2, vKApplication, vKApplication));
                nb3.a.getClass();
                FirebasePushService.d = new v801();
                try {
                    VerificationFactory.initialize(vKApplication);
                    VerificationFactory.setLogReceiver(new pb3());
                    VerificationFactory.setUncaughtExceptionListener(new eb3());
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
                asu0.a.getClass();
                asu0.o().execute(new efl0(vKApplication, 1));
                return s3q0.a;
            default:
                return new qj70(((k6v0) this.c).e);
        }
    }
}

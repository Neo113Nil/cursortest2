package xsna;

import com.vk.asset.manager.impl.di.VkAssetManagerComponentImpl;
import com.vk.libvideo.impl.di.VideoPlaylistReversionComponentImpl;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.di.SuperAppServicesComponentImpl;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import xsna.cru0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xqf0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xqf0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.VERIFICATION_BUSY_NUMBER, null, null, null, 28);
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return new ScreenModeVideoStatMapper(rts0.b.a());
            case 3:
                Object obj = cru0.j;
                return Boolean.valueOf(cru0.a.c());
            case 4:
                return s3q0.a;
            case 5:
                qcy<Object>[] qcyVarArr = SuperAppServicesComponentImpl.f;
                return bmf0.a;
            case 6:
                return new yk3(new rpj(fpf0.a(Object.class), null, new KSerializer[0]));
            case 7:
                return Integer.valueOf((int) x5r0.a(8, 1));
            case 8:
                return new s290();
            case 9:
                ysg0.b.a(VideoPipStateHolder.State.DRAWN);
                return s3q0.a;
            case 10:
                qcy<Object>[] qcyVarArr2 = VideoPlaylistReversionComponentImpl.b;
                return new VideoPlaylistReversionComponentImpl.b();
            case 11:
                qcy<Object>[] qcyVarArr3 = VkAssetManagerComponentImpl.b;
                return new ibu0();
            default:
                return new tub0(fpf0.a(dko.class), new Annotation[0]);
        }
    }
}

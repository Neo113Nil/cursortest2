package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.miniapps.impl.di.SuperAppMiniAppsComponentImpl;
import com.vk.voip.stereo.stub.create.di.VoipStereoCreateRoomRouterComponentStub;
import java.lang.annotation.Annotation;
import xsna.b9s0;
import xsna.edt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2a0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ o2a0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                par0.a.getClass();
                par0.b("[PhoneActualizationRouterImpl] phone didn't changed]");
                return s3q0.a;
            case 1:
                return Boolean.valueOf(fxc0.B().i().g());
            case 2:
                return Integer.valueOf(cn70.b(36));
            case 3:
                int i = PostingFragment.s0;
                return new oko0();
            case 4:
                return ((NewsFeedComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(NewsFeedComponent.class))).B4();
            case 5:
                return new Handler();
            case 6:
                return "Failed to collect logs. Logger is not initialized.";
            case 7:
                return androidx.compose.runtime.k.b(Boolean.FALSE);
            case 8:
                return new a390();
            case 9:
                return new dxj0();
            case 10:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMS_INBOX_INCORRECT_PHONE_ERROR, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr = SuperAppMiniAppsComponentImpl.b;
                return new dan0();
            case 12:
                return new Handler(Looper.getMainLooper());
            case 13:
                hhd0 hhd0Var = znk0.o;
                if (hhd0Var == null) {
                    hhd0Var = null;
                }
                return new fqt(((u6g0) hhd0Var.b).a());
            case 14:
                return new Handler(Looper.getMainLooper());
            case 15:
                return new b9s0.g();
            case 16:
                return Boolean.valueOf(fxc0.B().J().x0());
            case 17:
                return new edt0.a();
            case 18:
                return new i1t0(true, bo.h());
            case 19:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
            case 20:
                return new azv0();
            default:
                qcy<Object>[] qcyVarArr2 = VoipStereoCreateRoomRouterComponentStub.a;
                return new VoipStereoCreateRoomRouterComponentStub.b();
        }
    }
}

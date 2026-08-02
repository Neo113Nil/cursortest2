package xsna;

import android.content.Context;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.messagetemplates.impl.di.TemplatesComponentImpl;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.toggle.features.SaFeatures;
import com.vk.voip.stereo.stub.join.di.VoipStereoJoinComponentStub;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.b9s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jkg0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jkg0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        z = false;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return new s290();
            case 2:
                return new j3q((ExecutorService) ytj0.e.getValue());
            case 3:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMS_INBOX_TIMEOUT_ERROR, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 4:
                Context context = e43.a;
                return ((GamesCatalogComponent) m7m.e().a(fpf0.a(GamesCatalogComponent.class))).V9();
            case 5:
                qcy<Object>[] qcyVarArr = TemplatesComponentImpl.b;
                return new com.vk.messagetemplates.impl.keyboard.b();
            case 6:
                hhd0 hhd0Var = znk0.o;
                return new eic(((u6g0) (hhd0Var != null ? hhd0Var : null).b).a());
            case 7:
                return Executors.newFixedThreadPool(32, new wer0(z ? 1 : 0));
            case 8:
                return new b9s0.f();
            case 9:
                return new ozr0(fxc0.B().J().a());
            case 10:
                return new vwu0();
            case 11:
                if (e370.s != null && com.vk.toggle.b.A.a(SaFeatures.SA_FIX_KEEP_SCREEN_BRIDGE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                qcy<Object>[] qcyVarArr2 = VoipStereoJoinComponentStub.a;
                return new VoipStereoJoinComponentStub.b();
        }
    }
}

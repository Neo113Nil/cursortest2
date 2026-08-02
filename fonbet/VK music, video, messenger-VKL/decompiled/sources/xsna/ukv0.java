package xsna;

import android.view.ViewGroup;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.im.ui.components.common.BanDuration;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOption;
import xsna.plw0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ukv0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ukv0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((tdu) obj).b(((Number) ((if2) obj2).d()).floatValue());
                return s3q0.a;
            case 1:
                fbw0 fbw0Var = (fbw0) obj2;
                if (((gmq) obj).equals(fbw0Var.C)) {
                    fbw0Var.X6();
                }
                return s3q0.a;
            case 2:
                gvw0 gvw0Var = ((VoipCallActivity) obj2).A;
                gvw0 gvw0Var2 = gvw0Var != null ? gvw0Var : null;
                qbe0 qbe0Var = new qbe0(14);
                w9l0 w9l0Var = new w9l0(16);
                gvw0Var2.g = true;
                gvw0Var2.f(new fog0(10), new q66(gvw0Var2, qbe0Var, w9l0Var, 9), new biw0(gvw0Var2, 7));
                return s3q0.a;
            case 3:
                VoipCallServiceBannerHandler voipCallServiceBannerHandler = (VoipCallServiceBannerHandler) obj2;
                int i2 = VoipCallServiceBannerHandler.c.$EnumSwitchMapping$0[((VoipCallServiceBannerHandler.Restrict) obj).ordinal()];
                if (i2 == 1 || i2 == 2) {
                    zqn0.a.i();
                } else if (i2 == 3) {
                    zqn0.a.g(voipCallServiceBannerHandler.a.r().f.d(ImMsgPushSettingsProvider.Type.CALLS_INCOMING));
                } else if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 4:
                yh8 yh8Var = (yh8) obj2;
                ai8 ai8Var = (ai8) ((it80) obj).a;
                if (ai8Var != null) {
                    yh8Var.a();
                    if (!epx.f(yh8Var.q, ai8Var)) {
                        yh8Var.q = ai8Var;
                        yh8Var.c(ai8Var);
                        yh8Var.t = false;
                    }
                }
                return s3q0.a;
            case 5:
                jlw0 jlw0Var = (jlw0) obj2;
                tj50.a aVar = (tj50.a) obj;
                glw0 glw0Var = new glw0(1, jlw0Var, jlw0.class, "composeLink", "composeLink(Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/feature/VoipCallsJoinToCallByPasswordState;)Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/ui/state/VoipCallsJoinToCallByPasswordViewState$Link;", 0);
                ao8 ao8Var = ao8.d;
                return new plw0.b(aVar.a(glw0Var, ao8Var), aVar.a(new hlw0(1, jlw0Var, jlw0.class, "composePassword", "composePassword(Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/feature/VoipCallsJoinToCallByPasswordState;)Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/ui/state/VoipCallsJoinToCallByPasswordViewState$Password;", 0), ao8Var), aVar.a(new ilw0(1, jlw0Var, jlw0.class, "composeButton", "composeButton(Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/feature/VoipCallsJoinToCallByPasswordState;)Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/ui/state/VoipCallsJoinToCallByPasswordViewState$Button;", 0), ao8Var));
            case 6:
                return new opw0((ViewGroup) obj, ((ipw0) obj2).i);
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i3 = otw0.i1;
                ((otw0) obj2).Zn(booleanValue, MediaOption.MOVIE_SHARING);
                return s3q0.a;
            default:
                o2y0 o2y0Var = (o2y0) obj2;
                myc0.h(o2y0Var.g, null, null, new q2y0(o2y0Var, ((BanDuration) obj).h(), null), 3);
                return s3q0.a;
        }
    }
}

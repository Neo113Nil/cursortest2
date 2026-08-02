package xsna;

import android.content.Context;
import com.vk.music.model.di.AudioModelsComponentImpl;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.sessionmanagment.impl.di.SessionManagementComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.task.di.components.AuthBridgeComponentImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import xsna.dwy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dr4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dr4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = AudioModelsComponentImpl.f;
                return new w2b0(new bpn0(new fr4((AudioModelsComponentImpl) obj, objArr == true ? 1 : 0)));
            case 1:
                AuthBridgeComponentImpl authBridgeComponentImpl = (AuthBridgeComponentImpl) obj;
                SessionManagementComponent sessionManagementComponent = authBridgeComponentImpl.b;
                return new tbu0(sessionManagementComponent.J2(), sessionManagementComponent.B2(), authBridgeComponentImpl.a.ie(), new bpn0(new f53(authBridgeComponentImpl, 2)), new bpn0(new er4(authBridgeComponentImpl, i2)), new bpn0(new fr4(authBridgeComponentImpl, i2)), new bpn0(new r30(authBridgeComponentImpl, i2)), new bpn0(new f25((Object) authBridgeComponentImpl, (int) (objArr2 == true ? 1 : 0))), new bpn0(new q12(authBridgeComponentImpl, i2)));
            case 2:
                return ((SilentAuthByLoginComponent) ((p66) obj).k0().a(fpf0.a(SilentAuthByLoginComponent.class))).d();
            case 3:
                return new com.vk.voip.ui.push.b(((png) obj).d);
            case 4:
                return ((VideoRestrictionManagerComponent) ((gxw) obj).c().a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 5:
                return new dwy.a(((dwy) obj).b.entrySet());
            case 6:
                ((okhttp3.u) obj).close();
                return s3q0.a;
            case 7:
                SessionManagementComponentImpl sessionManagementComponentImpl = (SessionManagementComponentImpl) obj;
                Context context = sessionManagementComponentImpl.a;
                gzs<Executor> gzsVar = sessionManagementComponentImpl.c;
                gzs<Executor> gzsVar2 = sessionManagementComponentImpl.d;
                gzs<ExecutorService> gzsVar3 = sessionManagementComponentImpl.e;
                gzs<Boolean> gzsVar4 = sessionManagementComponentImpl.f;
                gzs<Boolean> gzsVar5 = sessionManagementComponentImpl.g;
                mxi0 ie = sessionManagementComponentImpl.b.ie();
                if (!gzsVar4.invoke().booleanValue()) {
                    ahp ahpVar = new ahp();
                    return new fui0(ahpVar, ahpVar);
                }
                lxi0 lxi0Var = new lxi0(context, "Sessions.db", null, 1);
                b61 b61Var = new b61(context, gzsVar3.invoke(), new qs3(ie, i2), new kwk(new cey(context, "keystorage.vk.db", null, 1), ie), new jnf(7));
                tjp tjpVar = new tjp(new hzg0(context, "session_management"), ie);
                x570 x570Var = new x570(new f25(context, 4), ie);
                uui0 uui0Var = new uui0(new cti0(gzsVar, gzsVar2, new zxi0(lxi0Var, b61Var, ie), new lvl(context), ie, x570Var, new ujp(tjpVar), gzsVar5));
                return new fui0(uui0Var, uui0Var);
            case 8:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new ctl0(storiesComponentImpl.f2(), storiesComponentImpl.w(), storiesComponentImpl.Df(), storiesComponentImpl.bf(), storiesComponentImpl.w3(), storiesComponentImpl.r2());
            case 9:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_ADD_GO_TO_AUTHOR;
                    videoFeatures.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures);
                }
                return Boolean.valueOf(z);
            case 10:
                tbu0 tbu0Var = (tbu0) obj;
                return new u200(tbu0Var.a, tbu0Var.b, tbu0Var.c, tbu0Var.d, tbu0Var.e, tbu0Var.f, tbu0Var.g, tbu0Var.h);
            default:
                return new jo80(((VoipCallComponentImpl) obj).a.a);
        }
    }
}

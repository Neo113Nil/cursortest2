package com.yandex.passport.internal.flags.experiments;

import android.content.Context;
import com.yandex.passport.R;
import com.yandex.passport.internal.links.LinksHandlingActivity;
import com.yandex.passport.internal.report.od;
import com.yandex.passport.internal.report.reporters.g1;
import com.yandex.passport.internal.social.esia.z;
import com.yandex.passport.internal.ui.ResultAwareActivity;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.bouncer.RendererKeyData;
import com.yandex.passport.internal.ui.bouncer.chooser.v;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.internal.ui.challenge.ChallengeActivity;
import com.yandex.passport.internal.ui.challenge.delete.z0;
import com.yandex.passport.internal.ui.challenge.logout.y;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.domik.samlsso.SamlSsoAuthFragment;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.a0;
import com.yandex.passport.internal.ui.sloth.authsdk.c0;
import com.yandex.passport.internal.ui.sloth.authsdk.u;
import com.yandex.passport.internal.ui.sloth.authsdk.x;
import com.yandex.passport.internal.ui.sloth.ebs.e0;
import com.yandex.passport.internal.ui.sloth.f0;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.sloth.b1;
import defpackage.hs31;
import defpackage.ins0;
import defpackage.m50;
import defpackage.sls;
import defpackage.zy11;
import java.util.UUID;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        m50 webCardResultLauncher_delegate$lambda$0;
        com.yandex.passport.internal.ui.common.c ui_delegate$lambda$0;
        Object lambda$new$0;
        com.yandex.passport.internal.ui.challenge.p ui_delegate$lambda$02;
        zy11 lambda$onCreate$3;
        String authUrl_delegate$lambda$0;
        hs31 viewModel_delegate$lambda$0;
        zy11 onCreate$lambda$1;
        com.yandex.passport.internal.ui.sloth.plusdevices.m viewModel_delegate$lambda$3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ExperimentsInternalTestActivity) obj).finish();
                return zy11Var;
            case 1:
                webCardResultLauncher_delegate$lambda$0 = LinksHandlingActivity.webCardResultLauncher_delegate$lambda$0((LinksHandlingActivity) obj);
                return webCardResultLauncher_delegate$lambda$0;
            case 2:
                return od.b((Context) obj);
            case 3:
                return androidx.localbroadcastmanager.content.a.a(((com.yandex.passport.internal.sloth.performers.g) obj).a);
            case 4:
                z zVar = (z) obj;
                return new com.yandex.passport.internal.social.esia.q(zVar.b, zVar.c, zVar.d, zVar.e, zVar.f);
            case 5:
                ui_delegate$lambda$0 = ResultAwareActivity.ui_delegate$lambda$0((ResultAwareActivity) obj);
                return ui_delegate$lambda$0;
            case 6:
                lambda$new$0 = ((AutoLoginRetryActivity) obj).lambda$new$0();
                return lambda$new$0;
            case 7:
                com.yandex.passport.internal.ui.bouncer.i iVar = (com.yandex.passport.internal.ui.bouncer.i) obj;
                return (ins0) (((Boolean) iVar.H.b(com.yandex.passport.internal.flags.q.U)).booleanValue() ? new com.yandex.passport.internal.ui.bouncer.challenge.g(iVar.a, iVar.I) : iVar.C.get());
            case 8:
                return androidx.compose.runtime.f.j(new RendererKeyData(((b1) ((z1) obj).b).a.getMode().getValue(), UUID.randomUUID().toString()));
            case 9:
                return new com.yandex.passport.internal.ui.bouncer.challenge.i(((com.yandex.passport.internal.ui.bouncer.challenge.n) obj).a);
            case 10:
                ((com.yandex.passport.internal.ui.bouncer.chooser.l) obj).D.a(f2.a);
                return zy11Var;
            case 11:
                v vVar = (v) obj;
                return new com.yandex.passport.internal.ui.bouncer.chooser.o(vVar.b, vVar.d, vVar.c);
            case 12:
                com.yandex.passport.internal.ui.bouncer.sloth.g gVar = (com.yandex.passport.internal.ui.bouncer.sloth.g) obj;
                com.yandex.passport.biometric.ui.verification.a aVar = new com.yandex.passport.biometric.ui.verification.a();
                com.yandex.passport.internal.ui.sloth.l lVar = gVar.a;
                com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = gVar.c;
                com.yandex.passport.internal.ui.bouncer.sloth.a aVar2 = gVar.b;
                aVar2.e = gVar.e;
                aVar2.d.c = Integer.valueOf(R.color.passport_roundabout_background);
                aVar.b = lVar.a(iVar2, aVar2, gVar.d);
                return aVar.f().a();
            case 13:
                ui_delegate$lambda$02 = ChallengeActivity.ui_delegate$lambda$0((ChallengeActivity) obj);
                return ui_delegate$lambda$02;
            case 14:
                com.yandex.passport.internal.ui.challenge.delete.o oVar = (com.yandex.passport.internal.ui.challenge.delete.o) obj;
                return new com.yandex.passport.internal.ui.challenge.delete.j(oVar.b, oVar.c, oVar.d, oVar.e, oVar.f, oVar.g, oVar.h);
            case 15:
                z0 z0Var = (z0) obj;
                com.yandex.passport.biometric.ui.verification.a aVar3 = new com.yandex.passport.biometric.ui.verification.a();
                com.yandex.passport.internal.ui.sloth.l lVar2 = z0Var.a;
                f0 f0Var = z0Var.c;
                com.yandex.passport.internal.ui.bouncer.sloth.a aVar4 = z0Var.b;
                aVar4.d.c = Integer.valueOf(R.color.passport_roundabout_background);
                aVar3.b = lVar2.a(f0Var, aVar4, z0Var.d);
                return aVar3.f().a();
            case 16:
                com.yandex.passport.internal.ui.challenge.logout.f0 f0Var2 = (com.yandex.passport.internal.ui.challenge.logout.f0) obj;
                return new y(f0Var2.a, f0Var2.b, f0Var2.c, f0Var2.d);
            case 17:
                com.yandex.passport.internal.ui.challenge.vpn.o oVar2 = (com.yandex.passport.internal.ui.challenge.vpn.o) obj;
                return new com.yandex.passport.internal.ui.challenge.vpn.h((com.yandex.passport.internal.usecase.vpn.b) oVar2.a, (com.yandex.passport.internal.config.p) oVar2.b, (g1) oVar2.c);
            case 18:
                lambda$onCreate$3 = ((DomikActivity) obj).lambda$onCreate$3();
                return lambda$onCreate$3;
            case 19:
                authUrl_delegate$lambda$0 = SamlSsoAuthFragment.authUrl_delegate$lambda$0((SamlSsoAuthFragment) obj);
                return authUrl_delegate$lambda$0;
            case 20:
                viewModel_delegate$lambda$0 = StandaloneSlothComposeActivity.viewModel_delegate$lambda$0((StandaloneSlothComposeActivity) obj);
                return viewModel_delegate$lambda$0;
            case 21:
                a0 a0Var = (a0) obj;
                com.yandex.passport.biometric.ui.verification.a aVar5 = new com.yandex.passport.biometric.ui.verification.a();
                com.yandex.passport.internal.ui.sloth.l lVar3 = a0Var.a;
                f0 f0Var3 = a0Var.b;
                com.yandex.passport.sloth.ui.dependencies.o oVar3 = a0Var.c;
                oVar3.f().c = Integer.valueOf(R.color.passport_roundabout_background);
                aVar5.b = com.yandex.passport.internal.ui.sloth.l.b(lVar3, f0Var3, oVar3, 4);
                return aVar5.f().a();
            case 22:
                ((c0) obj).W(x.a);
                return zy11Var;
            case 23:
                u uVar = (u) obj;
                return new com.yandex.passport.internal.ui.sloth.authsdk.q(uVar.b, uVar.c);
            case 24:
                com.yandex.passport.internal.ui.sloth.authsdk.f0 f0Var4 = (com.yandex.passport.internal.ui.sloth.authsdk.f0) obj;
                com.yandex.passport.biometric.ui.verification.a aVar6 = new com.yandex.passport.biometric.ui.verification.a();
                aVar6.b = com.yandex.passport.internal.ui.sloth.l.b(f0Var4.a, f0Var4.b, null, 6);
                return aVar6.f().a();
            case 25:
                e0 e0Var = (e0) obj;
                return new com.yandex.passport.internal.ui.sloth.ebs.v(e0Var.a, e0Var.c, e0Var.d, e0Var.e, e0Var.f, e0Var.g, e0Var.i, e0Var.h, e0Var.j);
            case 26:
                onCreate$lambda$1 = UserMenuActivity.onCreate$lambda$1((UserMenuActivity) obj);
                return onCreate$lambda$1;
            case 27:
                com.yandex.passport.internal.ui.sloth.menu.p pVar = (com.yandex.passport.internal.ui.sloth.menu.p) obj;
                com.yandex.passport.biometric.ui.verification.a aVar7 = new com.yandex.passport.biometric.ui.verification.a();
                com.yandex.passport.internal.ui.sloth.menu.m mVar = pVar.a;
                com.yandex.passport.internal.ui.sloth.menu.u uVar2 = pVar.c;
                com.yandex.passport.internal.ui.bouncer.sloth.a aVar8 = pVar.b;
                aVar8.d.c = Integer.valueOf(R.color.passport_roundabout_background);
                aVar7.b = new com.yandex.passport.sloth.ui.dependencies.m(mVar.a, mVar.b, uVar2, mVar.c, mVar.d, aVar8, mVar.e, new com.yandex.passport.internal.ui.sloth.n(0), mVar.f, mVar.g);
                return aVar7.f().a();
            case 28:
                ((ManagingPlusDevicesActivity) obj).finish();
                return zy11Var;
            default:
                viewModel_delegate$lambda$3 = ManagingPlusDevicesHelperActivity.viewModel_delegate$lambda$3((ManagingPlusDevicesHelperActivity) obj);
                return viewModel_delegate$lambda$3;
        }
    }
}

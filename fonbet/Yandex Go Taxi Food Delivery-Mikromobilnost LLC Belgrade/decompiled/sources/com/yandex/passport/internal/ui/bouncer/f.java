package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.report.reporters.q0;
import com.yandex.passport.internal.ui.challenge.delete.j0;
import com.yandex.passport.internal.ui.sloth.webcard.e1;
import com.yandex.passport.internal.ui.sloth.webcard.k0;
import com.yandex.passport.internal.ui.sloth.webcard.t0;
import com.yandex.passport.internal.ui.sloth.webcard.u0;
import com.yandex.passport.internal.ui.sloth.x;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.g2;
import defpackage.n3w;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class f implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final Object c;

    public /* synthetic */ f(yvf0 yvf0Var, v7p v7pVar, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                LoginProperties loginProperties = (LoginProperties) yvf0Var.get();
                ((d) obj).getClass();
                AppTheme t = com.yandex.passport.internal.util.p.t(loginProperties.getTheme());
                q5z.i(t);
                return t;
            case 1:
                com.yandex.passport.internal.ui.sloth.i iVar = (com.yandex.passport.internal.ui.sloth.i) yvf0Var.get();
                ((com.yandex.passport.internal.ui.challenge.delete.c) obj).getClass();
                return iVar.a();
            case 2:
                PassportDeleteAccountPropertiesImpl passportDeleteAccountPropertiesImpl = (PassportDeleteAccountPropertiesImpl) ((xvf0) yvf0Var).get();
                ((j0) obj).getClass();
                return new com.yandex.passport.internal.ui.sloth.n(passportDeleteAccountPropertiesImpl.getHeaders());
            case 3:
                com.yandex.passport.internal.sloth.h hVar = (com.yandex.passport.internal.sloth.h) yvf0Var.get();
                ((com.yandex.passport.internal.ui.sloth.u) obj).getClass();
                return hVar.a();
            case 4:
                com.yandex.passport.internal.properties.p pVar = (com.yandex.passport.internal.properties.p) yvf0Var.get();
                ((x) obj).getClass();
                return pVar.w ? new e1() : new com.yandex.passport.internal.ui.sloth.d();
            case 5:
                com.yandex.passport.internal.ui.sloth.i iVar2 = (com.yandex.passport.internal.ui.sloth.i) yvf0Var.get();
                ((com.yandex.passport.internal.ui.sloth.authsdk.l) obj).getClass();
                return iVar2.a();
            case 6:
                com.yandex.passport.internal.ui.sloth.i iVar3 = (com.yandex.passport.internal.ui.sloth.i) yvf0Var.get();
                ((com.yandex.passport.internal.ui.sloth.ebs.e) obj).getClass();
                return iVar3.a();
            case 7:
                com.yandex.passport.internal.ui.sloth.k kVar = (com.yandex.passport.internal.ui.sloth.k) yvf0Var.get();
                ((com.yandex.passport.internal.ui.sloth.menu.f) obj).getClass();
                return kVar;
            case 8:
                return new com.yandex.passport.internal.ui.sloth.menu.l(((com.yandex.passport.internal.ui.sloth.menu.f) obj).a, (com.yandex.passport.internal.ui.sloth.menu.i) ((xvf0) yvf0Var).get());
            case 9:
                com.yandex.passport.internal.ui.sloth.i iVar4 = (com.yandex.passport.internal.ui.sloth.i) yvf0Var.get();
                ((com.yandex.passport.internal.ui.sloth.plusdevices.n) obj).getClass();
                return iVar4.a();
            case 10:
                com.yandex.passport.internal.ui.sloth.g gVar = (com.yandex.passport.internal.ui.sloth.g) ((com.yandex.passport.internal.ui.bouncer.error.e) yvf0Var).get();
                ((com.yandex.passport.internal.ui.sloth.screen.b) obj).getClass();
                return gVar;
            case 11:
                com.yandex.passport.internal.ui.sloth.f fVar = (com.yandex.passport.internal.ui.sloth.f) ((com.yandex.passport.internal.ui.bouncer.error.e) yvf0Var).get();
                ((com.yandex.passport.internal.ui.sloth.screen.b) obj).getClass();
                return fVar;
            case 12:
                com.yandex.passport.internal.sloth.l lVar = (com.yandex.passport.internal.sloth.l) ((q0) yvf0Var).get();
                ((com.yandex.passport.internal.ui.sloth.screen.b) obj).getClass();
                return lVar;
            case 13:
                c1 c1Var = (c1) ((xvf0) yvf0Var).get();
                ((com.yandex.passport.internal.ui.sloth.screen.b) obj).getClass();
                b1 b1Var = c1Var.C;
                q5z.i(b1Var);
                return b1Var;
            case 14:
                com.yandex.passport.internal.ui.sloth.k kVar2 = (com.yandex.passport.internal.ui.sloth.k) ((com.yandex.passport.internal.ui.bouncer.error.e) yvf0Var).get();
                ((com.yandex.passport.internal.ui.sloth.screen.b) obj).getClass();
                return kVar2;
            case 15:
                com.yandex.passport.internal.ui.sloth.i iVar5 = (com.yandex.passport.internal.ui.sloth.i) yvf0Var.get();
                ((com.yandex.passport.internal.ui.sloth.webauthn.d) obj).getClass();
                return iVar5.a();
            case 16:
                com.yandex.passport.internal.ui.sloth.webcard.b bVar = (com.yandex.passport.internal.ui.sloth.webcard.b) yvf0Var.get();
                ((com.yandex.passport.internal.ui.sloth.webcard.f) obj).getClass();
                return new com.yandex.passport.sloth.dependencies.f(Collections.singletonList(bVar.a));
            case 17:
                k0 k0Var = (k0) ((u0) yvf0Var).get();
                ((t0) obj).getClass();
                com.yandex.passport.internal.ui.sloth.webcard.j0 j0Var = k0Var instanceof com.yandex.passport.internal.ui.sloth.webcard.j0 ? (com.yandex.passport.internal.ui.sloth.webcard.j0) k0Var : null;
                return (j0Var != null ? j0Var.a.getVariant() : null) instanceof com.yandex.passport.sloth.data.r ? new e1() : new com.yandex.passport.internal.ui.sloth.d();
            case 18:
                return new com.yandex.passport.sloth.command.performers.d((com.yandex.passport.sloth.v) yvf0Var.get(), (SlothParams) ((n3w) obj).a);
            case 19:
                return new g2((com.yandex.passport.sloth.ui.dependencies.q) ((com.yandex.passport.sloth.ui.dependencies.n) obj).get(), (com.yandex.passport.sloth.ui.c1) yvf0Var.get());
            case 20:
                return new com.yandex.passport.sloth.url.d((SlothParams) ((n3w) obj).a, (com.yandex.passport.internal.sloth.p) ((com.yandex.passport.sloth.dependencies.c) yvf0Var).get());
            default:
                return new com.yandex.passport.sloth.url.h((com.yandex.passport.sloth.url.e) yvf0Var.get(), (com.yandex.passport.internal.sloth.n) ((com.yandex.passport.sloth.dependencies.c) obj).get());
        }
    }

    public /* synthetic */ f(Object obj, yvf0 yvf0Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = yvf0Var;
    }
}

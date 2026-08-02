package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.widget.ImageView;
import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.internal.properties.AccountListProperties;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import defpackage.ins0;
import defpackage.li91;
import defpackage.rs11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r extends com.lightside.slab.a {
    public final s E;
    public final com.yandex.passport.internal.ui.bouncer.t F;
    public final d0 G;
    public final e0 H;
    public final b I;
    public final com.yandex.passport.internal.properties.p J;

    public r(s sVar, com.yandex.passport.internal.ui.bouncer.t tVar, d0 d0Var, e0 e0Var, b bVar, com.yandex.passport.internal.properties.p pVar) {
        this.E = sVar;
        this.F = tVar;
        this.G = d0Var;
        this.H = e0Var;
        this.I = bVar;
        this.J = pVar;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        ins0 ins0Var;
        AccountListProperties accountListProperties = ((y1) obj).a.getVisualProperties().getAccountListProperties();
        if (accountListProperties.getBranding() instanceof AccountListBranding.Custom) {
            AccountListBranding branding = accountListProperties.getBranding();
            b bVar = this.I;
            bVar.c(branding);
            ins0Var = bVar;
        } else {
            ins0Var = this.J.w ? this.G : this.H;
        }
        s sVar = this.E;
        sVar.y.b(ins0Var);
        ImageView imageView = sVar.x;
        imageView.setVisibility(accountListProperties.getShowCloseButton() ? 0 : 8);
        li91.e(new RoundaboutInnerSlab$performBind$2$1$1(this, null), imageView);
        return zy11.a;
    }
}

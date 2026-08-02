package com.ybsdk.feature.card.internal.presentation.cardrename;

import android.net.Uri;
import com.ybsdk.feature.card.api.CardRenameScreenParams;
import com.ybsdk.feature.card.internal.interactors.k;
import com.ybsdk.widgets.common.shimmer.b;
import defpackage.ds31;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jf8;
import defpackage.p05;
import defpackage.pzt0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.v0h;
import defpackage.vo6;
import defpackage.xm8;

/* loaded from: classes3.dex */
public final class a extends p05 {
    public final CardRenameScreenParams B;
    public final k C;
    public final xm8 D;
    public final b E;
    public final tfl0 F;
    public pzt0 G;

    public a(CardRenameScreenParams cardRenameScreenParams, k kVar, xm8 xm8Var, b bVar, tfl0 tfl0Var) {
        super(new vo6(bVar, 1));
        this.B = cardRenameScreenParams;
        this.C = kVar;
        this.D = xm8Var;
        this.E = bVar;
        this.F = tfl0Var;
    }

    @Override // defpackage.p05
    public final void b0() {
        this.F.e();
    }

    @Override // defpackage.p05
    public final boolean c0(Uri uri) {
        return h791.e((j3h) ((jf8) this.D).a.get(), uri.toString(), false, null, 14) instanceof v0h;
    }

    @Override // defpackage.p05
    public final void d0() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(ds31.a(this), null, null, new CardRenameViewModel$loadCardRenameScreen$1(this, null), 3);
    }

    @Override // defpackage.p05
    public final void e0(String str) {
        jf8 jf8Var = (jf8) this.D;
        h791.f((j3h) jf8Var.a.get(), str, com.ybsdk.feature.webview.api.a.b(jf8Var.b, str, null, null, 6));
    }

    public final void f0() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(ds31.a(this), null, null, new CardRenameViewModel$loadCardRenameScreen$1(this, null), 3);
    }
}

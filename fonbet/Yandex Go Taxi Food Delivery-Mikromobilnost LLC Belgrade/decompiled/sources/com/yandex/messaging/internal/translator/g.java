package com.yandex.messaging.internal.translator;

import com.yandex.messaging.ChatRequest;
import defpackage.aq80;
import defpackage.at2;
import defpackage.g92;
import defpackage.ibt;
import defpackage.jqr;
import defpackage.k020;
import defpackage.kse;
import defpackage.nz01;
import defpackage.o1b0;
import defpackage.p1b0;
import defpackage.pvn;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.z4t;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class g extends vds0 {
    public final kse b;
    public final sb7 c;
    public final ibt d;
    public final k020 e;
    public final nz01 f;
    public final at2 g;
    public final p1b0 h;
    public final LinkedHashMap i;

    public g(kse kseVar, sb7 sb7Var, ibt ibtVar, k020 k020Var, nz01 nz01Var, at2 at2Var, p1b0 p1b0Var) {
        super(kseVar.b);
        this.b = kseVar;
        this.c = sb7Var;
        this.d = ibtVar;
        this.e = k020Var;
        this.f = nz01Var;
        this.g = at2Var;
        this.h = p1b0Var;
        this.i = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    @Override // defpackage.vds0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tpr b(Object obj) {
        o1b0 o1b0Var;
        ChatRequest chatRequest = (ChatRequest) obj;
        String uniqueRequestId = chatRequest.uniqueRequestId();
        LinkedHashMap linkedHashMap = this.i;
        int i = 2;
        tpr g92Var = linkedHashMap.containsKey(uniqueRequestId) ? new g92(i, linkedHashMap.get(uniqueRequestId)) : null;
        kse kseVar = this.b;
        if (g92Var == null) {
            at2 at2Var = this.g;
            if (at2Var.T()) {
                p1b0 p1b0Var = this.h;
                if (p1b0Var.a.T() && (o1b0Var = (o1b0) chatRequest.handle(new aq80(p1b0Var))) != null) {
                    g92Var = kotlinx.coroutines.flow.e.F(new g92(i, at2Var.z().a(o1b0Var.a)), kseVar.b);
                    if (g92Var == null) {
                        g92Var = pvn.a;
                    }
                }
            }
            g92Var = null;
            if (g92Var == null) {
            }
        }
        ibt ibtVar = this.d;
        return kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(new jqr(kotlinx.coroutines.flow.e.K(g92Var, kotlinx.coroutines.flow.e.F(new z4t(ibtVar.a(chatRequest), this, 0), kseVar.e), kotlinx.coroutines.flow.e.D(new z4t(ibtVar.a(chatRequest), this, 1))), new GetChatTranslationUseCase$run$1(this, chatRequest, null), 3)), kseVar.b);
    }
}

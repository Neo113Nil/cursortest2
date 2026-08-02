package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit;

import defpackage.b3k;
import defpackage.exy0;
import defpackage.l1o;
import defpackage.mjm0;
import defpackage.n530;
import defpackage.o530;
import defpackage.pjm0;
import defpackage.rzl;
import defpackage.ujm0;
import defpackage.zul;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/DivkitScaffoldControllerFactory;", "Lujm0;", "Lb3k;", "div2ContextProvider", "Lexy0;", "colorResolver", "<init>", "(Lb3k;Lexy0;)V", "Ll1o;", "context", "Lmjm0;", "scaffold", "Lpjm0;", "get", "(Ll1o;Lmjm0;)Lpjm0;", "Lb3k;", "Lexy0;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivkitScaffoldControllerFactory implements ujm0 {
    private final exy0 colorResolver;
    private final b3k div2ContextProvider;

    public DivkitScaffoldControllerFactory(b3k b3kVar, exy0 exy0Var) {
        this.div2ContextProvider = b3kVar;
        this.colorResolver = exy0Var;
    }

    @Override // defpackage.ujm0
    public pjm0 get(l1o context, mjm0 scaffold) {
        n530 n530Var = context.a;
        o530 o530Var = context.e;
        exy0 exy0Var = this.colorResolver;
        return new zul(context.d, this.div2ContextProvider, exy0Var, context.c, n530Var, o530Var, null, 192);
    }

    @Override // defpackage.ujm0
    public pjm0 get(l1o l1oVar, mjm0 mjm0Var, rzl rzlVar) {
        return get(l1oVar, mjm0Var);
    }
}

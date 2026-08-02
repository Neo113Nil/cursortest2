package com.yandex.passport.internal.methods;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.data.network.GetTrackFromMagicRequest$State;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class y extends x2 {
    public final b b;
    public final h3 c;
    public final h3 d;
    public final List e;
    public final o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PassportEnvironmentImpl passportEnvironmentImpl, String str, GetTrackFromMagicRequest$State getTrackFromMagicRequest$State) {
        super(MethodRef.AuthByQrLink);
        b bVar = new b(passportEnvironmentImpl);
        h3 h3Var = new h3(str, 7);
        h3 h3Var2 = new h3(getTrackFromMagicRequest$State);
        this.b = bVar;
        this.c = h3Var;
        this.d = h3Var2;
        this.e = scc.g(bVar, h3Var, h3Var2);
        this.f = o.y;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.f;
    }
}

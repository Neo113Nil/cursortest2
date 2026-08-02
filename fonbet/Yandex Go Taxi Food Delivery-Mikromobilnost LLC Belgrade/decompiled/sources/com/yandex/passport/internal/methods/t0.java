package com.yandex.passport.internal.methods;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.internal.upgrader.UpgradeStatusRequestType;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class t0 extends x2 {
    public final f3 b;
    public final i3 c;
    public final List d;
    public final o3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(PassportUidImpl passportUidImpl, UpgradeStatusRequestType upgradeStatusRequestType) {
        super(MethodRef.GetAccountUpgradeStatus);
        f3 f3Var = new f3(passportUidImpl);
        i3 i3Var = new i3(j3.w, upgradeStatusRequestType);
        this.b = f3Var;
        this.c = i3Var;
        this.d = scc.g(f3Var, i3Var);
        this.e = o3.w;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.e;
    }
}

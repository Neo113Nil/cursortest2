package com.yandex.passport.internal.sloth.performers.webcard;

import com.yandex.passport.common.web.BridgeMethod;
import com.yandex.passport.internal.sloth.performers.m;
import com.yandex.passport.internal.sloth.performers.p;
import com.yandex.passport.sloth.command.s;

/* loaded from: classes15.dex */
public final class k implements com.yandex.passport.sloth.dependencies.e {
    public final a a;
    public final b b;
    public final com.yandex.passport.internal.sloth.performers.d c;
    public final m d;
    public final com.yandex.passport.internal.sloth.performers.b e;
    public final com.yandex.passport.internal.sloth.performers.k f;
    public final p g;

    public k(a aVar, b bVar, com.yandex.passport.internal.sloth.performers.d dVar, m mVar, com.yandex.passport.internal.sloth.performers.b bVar2, com.yandex.passport.internal.sloth.performers.k kVar, p pVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = dVar;
        this.d = mVar;
        this.e = bVar2;
        this.f = kVar;
        this.g = pVar;
    }

    @Override // com.yandex.passport.sloth.dependencies.e
    public final s a(BridgeMethod bridgeMethod) {
        s sVar;
        switch (j.a[bridgeMethod.ordinal()]) {
            case 1:
                sVar = this.a;
                break;
            case 2:
                sVar = this.b;
                break;
            case 3:
                sVar = this.c;
                break;
            case 4:
                sVar = this.d;
                break;
            case 5:
                sVar = this.e;
                break;
            case 6:
                sVar = this.f;
                break;
            case 7:
                sVar = this.g;
                break;
            default:
                sVar = null;
                break;
        }
        if (sVar != null) {
            return sVar;
        }
        return null;
    }
}

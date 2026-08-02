package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.common.web.BridgeMethod;
import com.yandex.passport.sloth.command.s;

/* loaded from: classes15.dex */
public final class j implements com.yandex.passport.sloth.dependencies.e {
    public final b a;
    public final c b;
    public final d c;
    public final g d;
    public final a e;
    public final h f;
    public final k g;
    public final l h;
    public final m i;
    public final n j;
    public final o k;
    public final q l;
    public final p m;

    public j(b bVar, c cVar, d dVar, g gVar, a aVar, h hVar, k kVar, l lVar, m mVar, n nVar, o oVar, q qVar, p pVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = dVar;
        this.d = gVar;
        this.e = aVar;
        this.f = hVar;
        this.g = kVar;
        this.h = lVar;
        this.i = mVar;
        this.j = nVar;
        this.k = oVar;
        this.l = qVar;
        this.m = pVar;
    }

    @Override // com.yandex.passport.sloth.dependencies.e
    public final s a(BridgeMethod bridgeMethod) {
        s sVar;
        switch (i.a[bridgeMethod.ordinal()]) {
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
            case 8:
                sVar = this.h;
                break;
            case 9:
                sVar = this.i;
                break;
            case 10:
                sVar = this.j;
                break;
            case 11:
                sVar = this.k;
                break;
            case 12:
                sVar = this.l;
                break;
            case 13:
                sVar = this.m;
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

package defpackage;

import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes11.dex */
public final class po0 implements wsd0 {
    public final zzs a;
    public final String b;
    public final z c;
    public final RoutePointType d;

    public po0(zzs zzsVar, String str, z zVar, RoutePointType routePointType) {
        this.a = zzsVar;
        this.b = str;
        this.c = zVar;
        this.d = routePointType;
    }

    @Override // defpackage.wsd0
    public final z getAction() {
        return this.c;
    }

    @Override // defpackage.wsd0
    public final zzs getPosition() {
        return this.a;
    }

    @Override // defpackage.wsd0
    public final String o() {
        return this.b;
    }

    @Override // defpackage.wsd0
    public final String p() {
        return null;
    }

    @Override // defpackage.wsd0
    public final Boolean q() {
        return null;
    }

    @Override // defpackage.wsd0
    public final String r() {
        return null;
    }

    @Override // defpackage.wsd0
    public final String s() {
        return null;
    }
}

package com.yandex.go.sdk.source_providers;

import android.location.Location;
import defpackage.c7z;
import defpackage.f8y;
import defpackage.h3y;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.udq0;
import defpackage.zbz;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.location.dto.LbsResponse;

/* loaded from: classes8.dex */
public final class f implements zbz {
    public final h3y a;
    public final c7z b;
    public final String c;

    public f(h3y h3yVar, c7z c7zVar, String str) {
        this.a = h3yVar;
        this.b = c7zVar;
        this.c = str;
    }

    @Override // defpackage.zbz
    public final Object a(Continuation continuation) {
        Location location = (Location) ((ru.yandex.taxi.location.g) ((f8y) this.a.get())).p.get(LbsResponse.Type.GSM);
        if (location != null) {
            return udq0.S(location, this.b, this.c);
        }
        return null;
    }

    @Override // defpackage.zbz
    public final tpr b(Object obj) {
        return new rol0(new LbsGsmLocationProvider$requestLocationUpdates$1(this, null));
    }
}

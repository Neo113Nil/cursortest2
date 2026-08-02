package com.yandex.go.sdk.source_providers;

import com.yandex.go.sdk.SourceType;
import defpackage.alf;
import defpackage.c7z;
import defpackage.dyv;
import defpackage.h3y;
import defpackage.yci0;

/* loaded from: classes8.dex */
public final class a {
    public final dyv a;
    public final h3y b;
    public final h3y c;
    public final c7z d;

    public a(dyv dyvVar, h3y h3yVar, h3y h3yVar2, c7z c7zVar) {
        this.a = dyvVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = c7zVar;
    }

    public final ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b a(SourceType sourceType) {
        int i = alf.a[sourceType.ordinal()];
        h3y h3yVar = this.b;
        c7z c7zVar = this.d;
        dyv dyvVar = this.a;
        if (i == 1) {
            SourceType sourceType2 = SourceType.LBS_GSM;
            return new ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b(sourceType2.getSource(), new com.yandex.go.config.d(new com.yandex.go.config.f(((com.yandex.go.config.i) dyvVar).d), CustomSourceProviderFactory$getSourceProvider$1.b), new f(h3yVar, c7zVar, sourceType2.getSource()));
        }
        if (i == 2) {
            SourceType sourceType3 = SourceType.LBS_WIFI;
            return new ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b(sourceType3.getSource(), new com.yandex.go.config.d(new com.yandex.go.config.f(((com.yandex.go.config.i) dyvVar).d), CustomSourceProviderFactory$getSourceProvider$2.b), new k(h3yVar, c7zVar, sourceType3.getSource()));
        }
        if (i != 3) {
            yci0.k(sourceType, "There's no external provider for type: ");
            return null;
        }
        SourceType sourceType4 = SourceType.MAPKIT;
        return new ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b(sourceType4.getSource(), new com.yandex.go.config.d(new com.yandex.go.config.f(((com.yandex.go.config.i) dyvVar).d), CustomSourceProviderFactory$getSourceProvider$3.b), new n(this.c, c7zVar, sourceType4.getSource()));
    }
}

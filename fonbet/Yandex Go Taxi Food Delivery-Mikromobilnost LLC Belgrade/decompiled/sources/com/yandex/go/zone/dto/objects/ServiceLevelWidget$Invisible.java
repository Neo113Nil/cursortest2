package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/objects/ServiceLevelWidget$Invisible", "Lcom/yandex/go/zone/dto/objects/f5;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/b5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ServiceLevelWidget$Invisible extends f5 {
    public static final b5 Companion = new b5();
    public final kotlinx.serialization.json.b a;

    public ServiceLevelWidget$Invisible(int i, kotlinx.serialization.json.b bVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceLevelWidget$Invisible) && jl40.l(this.a, ((ServiceLevelWidget$Invisible) obj).a);
    }

    public final int hashCode() {
        kotlinx.serialization.json.b bVar = this.a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Invisible(payload=" + this.a + Extension.C_BRAKE;
    }

    public ServiceLevelWidget$Invisible() {
        this.a = null;
    }
}

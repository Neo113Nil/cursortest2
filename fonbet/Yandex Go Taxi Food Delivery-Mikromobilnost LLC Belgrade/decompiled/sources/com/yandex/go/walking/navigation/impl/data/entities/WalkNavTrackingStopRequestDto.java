package com.yandex.go.walking.navigation.impl.data.entities;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStopRequestDto;", "", "Companion", "$serializer", "com/yandex/go/walking/navigation/impl/data/entities/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class WalkNavTrackingStopRequestDto {
    public static final e Companion = new e();
    public final String a;

    public /* synthetic */ WalkNavTrackingStopRequestDto(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, WalkNavTrackingStopRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalkNavTrackingStopRequestDto) && jl40.l(this.a, ((WalkNavTrackingStopRequestDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("WalkNavTrackingStopRequestDto(routeUri=", this.a, Extension.C_BRAKE);
    }
}

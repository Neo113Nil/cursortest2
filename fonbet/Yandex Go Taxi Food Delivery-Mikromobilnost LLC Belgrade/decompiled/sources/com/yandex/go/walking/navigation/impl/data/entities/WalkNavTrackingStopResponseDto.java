package com.yandex.go.walking.navigation.impl.data.entities;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStopResponseDto;", "", "Companion", "$serializer", "com/yandex/go/walking/navigation/impl/data/entities/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class WalkNavTrackingStopResponseDto {
    public static final f Companion = new f();
    public final Boolean a;

    public /* synthetic */ WalkNavTrackingStopResponseDto(Boolean bool, int i) {
        if ((i & 1) == 0) {
            this.a = Boolean.FALSE;
        } else {
            this.a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalkNavTrackingStopResponseDto) && jl40.l(this.a, ((WalkNavTrackingStopResponseDto) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "WalkNavTrackingStopResponseDto(success=" + this.a + Extension.C_BRAKE;
    }

    public WalkNavTrackingStopResponseDto() {
        this.a = Boolean.FALSE;
    }
}

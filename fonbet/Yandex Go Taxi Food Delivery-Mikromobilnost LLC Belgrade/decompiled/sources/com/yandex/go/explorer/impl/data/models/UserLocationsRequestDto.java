package com.yandex.go.explorer.impl.data.models;

import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/data/models/UserLocationsRequestDto;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/data/models/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserLocationsRequestDto {
    public static final i Companion = new i();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(1))};
    public final List a;

    public /* synthetic */ UserLocationsRequestDto(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, UserLocationsRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserLocationsRequestDto) && jl40.l(this.a, ((UserLocationsRequestDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("UserLocationsRequestDto(positions=", Extension.C_BRAKE, this.a);
    }

    public UserLocationsRequestDto(List list) {
        this.a = list;
    }
}

package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/ScreenConfigDto;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ScreenConfigDto {
    public static final h Companion = new h();
    public final String a;
    public final String b;

    public /* synthetic */ ScreenConfigDto(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenConfigDto)) {
            return false;
        }
        ScreenConfigDto screenConfigDto = (ScreenConfigDto) obj;
        return jl40.l(this.a, screenConfigDto.a) && jl40.l(this.b, screenConfigDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ScreenConfigDto(trustedContactsTitle=", this.a, ", trustingContactsTitle=", this.b, Extension.C_BRAKE);
    }

    public ScreenConfigDto(int i) {
        this.a = "";
        this.b = "";
    }

    public ScreenConfigDto() {
        this(0);
    }
}

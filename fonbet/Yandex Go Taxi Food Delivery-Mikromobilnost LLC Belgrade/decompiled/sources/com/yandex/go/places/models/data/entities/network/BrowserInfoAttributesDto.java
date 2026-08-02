package com.yandex.go.places.models.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/BrowserInfoAttributesDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/u", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BrowserInfoAttributesDto {
    public static final u Companion = new u();
    public final String a;
    public final String b;

    public /* synthetic */ BrowserInfoAttributesDto(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserInfoAttributesDto)) {
            return false;
        }
        BrowserInfoAttributesDto browserInfoAttributesDto = (BrowserInfoAttributesDto) obj;
        return jl40.l(this.a, browserInfoAttributesDto.a) && jl40.l(this.b, browserInfoAttributesDto.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("BrowserInfoAttributesDto(icookie=", this.a, ", title=", this.b, Extension.C_BRAKE);
    }

    public BrowserInfoAttributesDto() {
        this.a = null;
        this.b = null;
    }
}

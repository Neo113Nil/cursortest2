package com.yandex.go.places.models.data.entities.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$ShareActionDto", "Lcom/yandex/go/places/models/data/entities/network/s;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/p", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionDto$ShareActionDto extends s {
    public static final p Companion = new p();
    public final String a;
    public final String b;
    public final String c;
    public final ImageDto d;

    public ActionDto$ShareActionDto(int i, ImageDto imageDto, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = imageDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDto$ShareActionDto)) {
            return false;
        }
        ActionDto$ShareActionDto actionDto$ShareActionDto = (ActionDto$ShareActionDto) obj;
        return jl40.l(this.a, actionDto$ShareActionDto.a) && jl40.l(this.b, actionDto$ShareActionDto.b) && jl40.l(this.c, actionDto$ShareActionDto.c) && jl40.l(this.d, actionDto$ShareActionDto.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        ImageDto imageDto = this.d;
        return b + (imageDto != null ? imageDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ShareActionDto(title=", this.a, ", subtitle=", this.b, ", content=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ActionDto$ShareActionDto() {
        this.a = "";
        this.b = null;
        this.c = "";
        this.d = null;
    }
}

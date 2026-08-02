package com.yandex.go.loyalty.api.data.model.common;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.uw51;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/api/data/model/common/ColorDto;", "", "Companion", "$serializer", "com/yandex/go/loyalty/api/data/model/common/a", "go-client-android.features.loyalty:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ColorDto {
    public static final a Companion = new a();
    public final String a;
    public final float b;
    public final float c;

    public /* synthetic */ ColorDto(float f, float f2, int i, String str) {
        this.a = (i & 1) == 0 ? "" : str;
        this.b = (i & 2) == 0 ? 0.0f : f;
        if ((i & 4) == 0) {
            this.c = 1.0f;
        } else {
            this.c = f2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final float getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final float getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorDto)) {
            return false;
        }
        ColorDto colorDto = (ColorDto) obj;
        return jl40.l(this.a, colorDto.a) && Float.compare(this.b, colorDto.b) == 0 && Float.compare(this.c, colorDto.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorDto(color=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", opacity=");
        return uw51.i(sb, this.c, Extension.C_BRAKE);
    }

    public ColorDto() {
        this.a = "";
        this.b = 0.0f;
        this.c = 1.0f;
    }
}

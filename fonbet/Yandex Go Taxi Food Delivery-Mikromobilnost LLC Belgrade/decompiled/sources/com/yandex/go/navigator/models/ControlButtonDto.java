package com.yandex.go.navigator.models;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/models/ControlButtonDto;", "", "Companion", "$serializer", "com/yandex/go/navigator/models/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ControlButtonDto {
    public static final a Companion = new a();
    public final String a;
    public final DeeplinkActionDto b;
    public final String c;
    public final String d;

    public /* synthetic */ ControlButtonDto(int i, String str, DeeplinkActionDto deeplinkActionDto, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = deeplinkActionDto;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlButtonDto)) {
            return false;
        }
        ControlButtonDto controlButtonDto = (ControlButtonDto) obj;
        return jl40.l(this.a, controlButtonDto.a) && jl40.l(this.b, controlButtonDto.b) && jl40.l(this.c, controlButtonDto.c) && jl40.l(this.d, controlButtonDto.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DeeplinkActionDto deeplinkActionDto = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (deeplinkActionDto == null ? 0 : deeplinkActionDto.a.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlButtonDto(id=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", imageTag=");
        return g8e.r(sb, this.c, ", titleKey=", this.d, Extension.C_BRAKE);
    }

    public ControlButtonDto() {
        this.a = "";
        this.b = null;
        this.c = "";
        this.d = "";
    }
}

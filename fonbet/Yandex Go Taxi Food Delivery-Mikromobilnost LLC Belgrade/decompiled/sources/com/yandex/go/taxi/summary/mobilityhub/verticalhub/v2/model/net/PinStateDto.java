package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/PinStateDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/p1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PinStateDto {
    public static final p1 Companion = new p1();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final o1 g;
    public final float h;
    public final PointDto i;
    public final Integer j;

    public /* synthetic */ PinStateDto(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, o1 o1Var, float f, PointDto pointDto, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = o1Var;
        }
        if ((i & 128) == 0) {
            this.h = 1.0f;
        } else {
            this.h = f;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = pointDto;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinStateDto)) {
            return false;
        }
        PinStateDto pinStateDto = (PinStateDto) obj;
        return jl40.l(this.a, pinStateDto.a) && this.b == pinStateDto.b && this.c == pinStateDto.c && this.d == pinStateDto.d && this.e == pinStateDto.e && jl40.l(this.f, pinStateDto.f) && jl40.l(this.g, pinStateDto.g) && Float.compare(this.h, pinStateDto.h) == 0 && jl40.l(this.i, pinStateDto.i) && jl40.l(this.j, pinStateDto.j);
    }

    public final int hashCode() {
        String str = this.a;
        int e = unr0.e(unr0.e(unr0.e(unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        o1 o1Var = this.g;
        int c = g8e.c(this.h, (hashCode + (o1Var == null ? 0 : o1Var.hashCode())) * 31, 31);
        PointDto pointDto = this.i;
        int hashCode2 = (c + (pointDto == null ? 0 : pointDto.hashCode())) * 31;
        Integer num = this.j;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("PinStateDto(title=", this.a, ", textWithChevron=", ", shouldSwapTexts=", this.b);
        nnm.v(", anchored=", ", drawBullet=", l, this.c, this.d);
        unr0.A(", hint=", this.f, ", iconState=", l, this.e);
        l.append(this.g);
        l.append(", scale=");
        l.append(this.h);
        l.append(", point=");
        l.append(this.i);
        l.append(", amount=");
        l.append(this.j);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public PinStateDto() {
        this.a = null;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = 1.0f;
        this.i = null;
        this.j = null;
    }
}

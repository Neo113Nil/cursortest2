package com.yandex.go.tariffcard.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mvt;
import defpackage.unr0;
import defpackage.yjd;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/HeaderGradientConfigDto;", "", "Companion", "$serializer", "com/yandex/go/tariffcard/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class HeaderGradientConfigDto {
    public static final d Companion = new d();
    public static final i3y[] e;
    public final GradientTypeDto a;
    public final Map b;
    public final GradientDto c;
    public final GradientDto d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new mvt(17)), kotlin.a.b(lazyThreadSafetyMode, new mvt(18)), null, null};
    }

    public /* synthetic */ HeaderGradientConfigDto(int i, GradientTypeDto gradientTypeDto, Map map, GradientDto gradientDto, GradientDto gradientDto2) {
        this.a = (i & 1) == 0 ? GradientTypeDto.CLEAR : gradientTypeDto;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = gradientDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = gradientDto2;
        }
    }

    public static final /* synthetic */ void b(HeaderGradientConfigDto headerGradientConfigDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = e;
        if (F || headerGradientConfigDto.a != GradientTypeDto.CLEAR) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), headerGradientConfigDto.a);
        }
        if (yjdVar.F() || !jl40.l(headerGradientConfigDto.b, kotlin.collections.b.f())) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), headerGradientConfigDto.b);
        }
        if (yjdVar.F() || headerGradientConfigDto.c != null) {
            yjdVar.g(serialDescriptor, 2, GradientDto$$serializer.INSTANCE, headerGradientConfigDto.c);
        }
        if (!yjdVar.F() && headerGradientConfigDto.d == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 3, GradientDto$$serializer.INSTANCE, headerGradientConfigDto.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderGradientConfigDto)) {
            return false;
        }
        HeaderGradientConfigDto headerGradientConfigDto = (HeaderGradientConfigDto) obj;
        return this.a == headerGradientConfigDto.a && jl40.l(this.b, headerGradientConfigDto.b) && jl40.l(this.c, headerGradientConfigDto.c) && jl40.l(this.d, headerGradientConfigDto.d);
    }

    public final int hashCode() {
        int d = unr0.d(this.a.hashCode() * 31, 31, this.b);
        GradientDto gradientDto = this.c;
        int hashCode = (d + (gradientDto == null ? 0 : gradientDto.hashCode())) * 31;
        GradientDto gradientDto2 = this.d;
        return hashCode + (gradientDto2 != null ? gradientDto2.hashCode() : 0);
    }

    public final String toString() {
        return "HeaderGradientConfigDto(type=" + this.a + ", segments=" + this.b + ", topGradientDto=" + this.c + ", bottomGradientDto=" + this.d + Extension.C_BRAKE;
    }

    public HeaderGradientConfigDto() {
        GradientTypeDto gradientTypeDto = GradientTypeDto.CLEAR;
        Map f = kotlin.collections.b.f();
        this.a = gradientTypeDto;
        this.b = f;
        this.c = null;
        this.d = null;
    }
}

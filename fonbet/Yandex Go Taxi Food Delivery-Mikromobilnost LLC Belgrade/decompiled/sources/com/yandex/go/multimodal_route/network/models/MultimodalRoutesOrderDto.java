package com.yandex.go.multimodal_route.network.models;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/MultimodalRoutesOrderDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MultimodalRoutesOrderDto {
    public static final k Companion = new k();
    public final String a;
    public final MultimodalRoutesOrderPartDto b;

    public /* synthetic */ MultimodalRoutesOrderDto(int i, String str, MultimodalRoutesOrderPartDto multimodalRoutesOrderPartDto) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, MultimodalRoutesOrderDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = multimodalRoutesOrderPartDto;
    }

    public static MultimodalRoutesOrderDto a(MultimodalRoutesOrderDto multimodalRoutesOrderDto, MultimodalRoutesOrderPartDto multimodalRoutesOrderPartDto) {
        return new MultimodalRoutesOrderDto(multimodalRoutesOrderPartDto, multimodalRoutesOrderDto.a);
    }

    /* renamed from: b, reason: from getter */
    public final MultimodalRoutesOrderPartDto getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultimodalRoutesOrderDto)) {
            return false;
        }
        MultimodalRoutesOrderDto multimodalRoutesOrderDto = (MultimodalRoutesOrderDto) obj;
        return jl40.l(this.a, multimodalRoutesOrderDto.a) && jl40.l(this.b, multimodalRoutesOrderDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MultimodalRoutesOrderDto(id=" + this.a + ", firstMile=" + this.b + Extension.C_BRAKE;
    }

    public MultimodalRoutesOrderDto(MultimodalRoutesOrderPartDto multimodalRoutesOrderPartDto, String str) {
        this.a = str;
        this.b = multimodalRoutesOrderPartDto;
    }
}

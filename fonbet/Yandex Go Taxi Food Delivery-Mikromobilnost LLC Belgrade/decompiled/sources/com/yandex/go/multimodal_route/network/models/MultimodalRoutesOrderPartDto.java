package com.yandex.go.multimodal_route.network.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/MultimodalRoutesOrderPartDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MultimodalRoutesOrderPartDto {
    public static final l Companion = new l();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ MultimodalRoutesOrderPartDto(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, MultimodalRoutesOrderPartDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static MultimodalRoutesOrderPartDto a(MultimodalRoutesOrderPartDto multimodalRoutesOrderPartDto, String str) {
        String str2 = multimodalRoutesOrderPartDto.a;
        String str3 = multimodalRoutesOrderPartDto.c;
        multimodalRoutesOrderPartDto.getClass();
        return new MultimodalRoutesOrderPartDto(str2, str, str3);
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultimodalRoutesOrderPartDto)) {
            return false;
        }
        MultimodalRoutesOrderPartDto multimodalRoutesOrderPartDto = (MultimodalRoutesOrderPartDto) obj;
        return jl40.l(this.a, multimodalRoutesOrderPartDto.a) && jl40.l(this.b, multimodalRoutesOrderPartDto.b) && jl40.l(this.c, multimodalRoutesOrderPartDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("MultimodalRoutesOrderPartDto(type=", this.a, ", orderId=", this.b, ", preorderOfferId="), this.c, Extension.C_BRAKE);
    }

    public MultimodalRoutesOrderPartDto(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}

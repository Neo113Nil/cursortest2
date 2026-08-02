package com.yandex.go.multimodal_route.network.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/SupportButtonDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SupportButtonDto {
    public static final p Companion = new p();
    public final String a;
    public final String b;
    public final FormattedText c;
    public final String d;
    public final String e;

    public /* synthetic */ SupportButtonDto(int i, String str, String str2, String str3, String str4, FormattedText formattedText) {
        if (5 != (i & 5)) {
            qje.Z(i, 5, SupportButtonDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = formattedText;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportButtonDto)) {
            return false;
        }
        SupportButtonDto supportButtonDto = (SupportButtonDto) obj;
        return jl40.l(this.a, supportButtonDto.a) && jl40.l(this.b, supportButtonDto.b) && jl40.l(this.c, supportButtonDto.c) && jl40.l(this.d, supportButtonDto.d) && jl40.l(this.e, supportButtonDto.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
        String str2 = this.d;
        int hashCode2 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SupportButtonDto(id=", this.a, ", analyticsId=", this.b, ", title=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(", supportChatUrl=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}

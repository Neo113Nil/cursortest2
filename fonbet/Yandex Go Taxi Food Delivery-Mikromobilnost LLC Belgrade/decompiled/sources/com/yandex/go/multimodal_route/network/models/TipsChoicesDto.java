package com.yandex.go.multimodal_route.network.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.x1z0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/TipsChoicesDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TipsChoicesDto {
    public static final x Companion = new x();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(28))};
    public final String a;
    public final String b;
    public final int c;
    public final List d;

    public /* synthetic */ TipsChoicesDto(int i, int i2, String str, String str2, List list) {
        if (13 != (i & 13)) {
            qje.Z(i, 13, TipsChoicesDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = i2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TipsChoicesDto)) {
            return false;
        }
        TipsChoicesDto tipsChoicesDto = (TipsChoicesDto) obj;
        return jl40.l(this.a, tipsChoicesDto.a) && jl40.l(this.b, tipsChoicesDto.b) && this.c == tipsChoicesDto.c && jl40.l(this.d, tipsChoicesDto.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TipsChoicesDto(id=", this.a, ", analyticsId=", this.b, ", selectedChoiceIndex=");
        v.append(this.c);
        v.append(", choices=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

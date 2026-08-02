package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/PriceStackItem;", "Lcom/yandex/go/shortcuts/dto/response/r2;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceStackItem extends r2 {
    public static final k0 Companion = new k0();
    public final Title a;

    public PriceStackItem(int i, Title title) {
        if ((i & 1) == 0) {
            this.a = new Title(0);
        } else {
            this.a = title;
        }
    }

    public static final /* synthetic */ void v(PriceStackItem priceStackItem, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && jl40.l(priceStackItem.a, new Title(0))) {
            return;
        }
        yjdVar.e(serialDescriptor, 0, Title$$serializer.INSTANCE, priceStackItem.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PriceStackItem) && jl40.l(this.a, ((PriceStackItem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PriceStackItem(title=" + this.a + Extension.C_BRAKE;
    }

    public PriceStackItem() {
        this.a = new Title(0);
    }
}

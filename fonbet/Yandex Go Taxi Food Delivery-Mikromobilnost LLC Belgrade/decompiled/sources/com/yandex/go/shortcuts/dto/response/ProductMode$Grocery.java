package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.s8f0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/shortcuts/dto/response/ProductMode$Grocery", "Lcom/yandex/go/shortcuts/dto/response/t1;", "Ls8f0;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/r0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductMode$Grocery extends t1 implements s8f0 {
    public static final r0 Companion = new r0();
    public final Parameters a;

    public ProductMode$Grocery(int i, Parameters parameters) {
        if ((i & 1) == 0) {
            this.a = new Parameters(0);
        } else {
            this.a = parameters;
        }
    }

    public static final void b(ProductMode$Grocery productMode$Grocery, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && jl40.l(productMode$Grocery.a, new Parameters(0))) {
            return;
        }
        yjdVar.e(serialDescriptor, 0, Parameters$$serializer.INSTANCE, productMode$Grocery.a);
    }

    @Override // com.yandex.go.shortcuts.dto.response.t1
    public final Mode a() {
        return Mode.GROCERY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductMode$Grocery) && jl40.l(this.a, ((ProductMode$Grocery) obj).a);
    }

    @Override // defpackage.s8f0
    /* renamed from: getParameters, reason: from getter */
    public final Parameters getA() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Grocery(parameters=" + this.a + Extension.C_BRAKE;
    }

    public ProductMode$Grocery() {
        this.a = new Parameters(0);
    }
}

package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.s8f0;
import defpackage.unr0;
import defpackage.vye0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/shortcuts/dto/response/ProductMode$Scooters", "Lcom/yandex/go/shortcuts/dto/response/t1;", "Ls8f0;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/w0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductMode$Scooters extends t1 implements s8f0 {
    public static final w0 Companion = new w0();
    public static final i3y[] d;
    public final Parameters a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new vye0(21)), kotlin.a.b(lazyThreadSafetyMode, new vye0(22))};
    }

    public ProductMode$Scooters(int i, Parameters parameters, List list, List list2) {
        this.a = (i & 1) == 0 ? new Parameters(0) : parameters;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
    }

    public static final void c(ProductMode$Scooters productMode$Scooters, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(productMode$Scooters.a, new Parameters(0))) {
            yjdVar.e(serialDescriptor, 0, Parameters$$serializer.INSTANCE, productMode$Scooters.a);
        }
        boolean F = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        i3y[] i3yVarArr = d;
        if (F || !jl40.l(productMode$Scooters.b, emptyList)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), productMode$Scooters.b);
        }
        if (!yjdVar.F() && jl40.l(productMode$Scooters.c, emptyList)) {
            return;
        }
        yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), productMode$Scooters.c);
    }

    @Override // com.yandex.go.shortcuts.dto.response.t1
    public final Mode a() {
        return Mode.SCOOTERS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductMode$Scooters)) {
            return false;
        }
        ProductMode$Scooters productMode$Scooters = (ProductMode$Scooters) obj;
        return jl40.l(this.a, productMode$Scooters.a) && jl40.l(this.b, productMode$Scooters.b) && jl40.l(this.c, productMode$Scooters.c);
    }

    @Override // defpackage.s8f0
    /* renamed from: getParameters, reason: from getter */
    public final Parameters getA() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Scooters(parameters=");
        sb.append(this.a);
        sb.append(", objectsOverMap=");
        sb.append(this.b);
        sb.append(", aboveCardObjects=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public ProductMode$Scooters() {
        this.a = new Parameters(0);
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
    }
}

package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/shortcuts/dto/response/ProductMode$Chargers", "Lcom/yandex/go/shortcuts/dto/response/t1;", "Ls8f0;", "Companion", "ChargersDiscount", "$serializer", "com/yandex/go/shortcuts/dto/response/m0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductMode$Chargers extends t1 implements s8f0 {
    public static final m0 Companion = new m0();
    public static final i3y[] e;
    public final Parameters a;
    public final List b;
    public final List c;
    public final ChargersDiscount d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new vye0(15)), kotlin.a.b(lazyThreadSafetyMode, new vye0(16)), null};
    }

    public ProductMode$Chargers(int i, Parameters parameters, List list, List list2, ChargersDiscount chargersDiscount) {
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = chargersDiscount;
        }
    }

    public static final void c(ProductMode$Chargers productMode$Chargers, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(productMode$Chargers.a, new Parameters(0))) {
            yjdVar.e(serialDescriptor, 0, Parameters$$serializer.INSTANCE, productMode$Chargers.a);
        }
        boolean F = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        i3y[] i3yVarArr = e;
        if (F || !jl40.l(productMode$Chargers.b, emptyList)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), productMode$Chargers.b);
        }
        if (yjdVar.F() || !jl40.l(productMode$Chargers.c, emptyList)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), productMode$Chargers.c);
        }
        if (!yjdVar.F() && productMode$Chargers.d == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 3, ProductMode$Chargers$ChargersDiscount$$serializer.INSTANCE, productMode$Chargers.d);
    }

    @Override // com.yandex.go.shortcuts.dto.response.t1
    public final Mode a() {
        return Mode.CHARGERS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductMode$Chargers)) {
            return false;
        }
        ProductMode$Chargers productMode$Chargers = (ProductMode$Chargers) obj;
        return jl40.l(this.a, productMode$Chargers.a) && jl40.l(this.b, productMode$Chargers.b) && jl40.l(this.c, productMode$Chargers.c) && jl40.l(this.d, productMode$Chargers.d);
    }

    @Override // defpackage.s8f0
    /* renamed from: getParameters, reason: from getter */
    public final Parameters getA() {
        return this.a;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ChargersDiscount chargersDiscount = this.d;
        return c + (chargersDiscount == null ? 0 : chargersDiscount.hashCode());
    }

    public final String toString() {
        return "Chargers(parameters=" + this.a + ", objectsOverMap=" + this.b + ", aboveCardObjects=" + this.c + ", discount=" + this.d + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Chargers$ChargersDiscount;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/l0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ChargersDiscount {
        public static final l0 Companion = new l0();
        public final String a;
        public final String b;

        public /* synthetic */ ChargersDiscount(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public static final /* synthetic */ void a(ChargersDiscount chargersDiscount, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(chargersDiscount.a, "")) {
                yjdVar.o(serialDescriptor, 0, chargersDiscount.a);
            }
            if (!yjdVar.F() && jl40.l(chargersDiscount.b, "")) {
                return;
            }
            yjdVar.o(serialDescriptor, 1, chargersDiscount.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChargersDiscount)) {
                return false;
            }
            ChargersDiscount chargersDiscount = (ChargersDiscount) obj;
            return jl40.l(this.a, chargersDiscount.a) && jl40.l(this.b, chargersDiscount.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("ChargersDiscount(type=", this.a, ", id=", this.b, Extension.C_BRAKE);
        }

        public ChargersDiscount() {
            this.a = "";
            this.b = "";
        }
    }

    public ProductMode$Chargers() {
        this.a = new Parameters(0);
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = null;
    }
}

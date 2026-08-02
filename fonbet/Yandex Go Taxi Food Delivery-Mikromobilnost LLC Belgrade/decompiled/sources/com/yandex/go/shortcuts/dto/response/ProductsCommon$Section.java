package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.v8f0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/shortcuts/dto/response/ProductsCommon$Section", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/v1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductsCommon$Section {
    public static final v1 Companion = new v1();
    public static final i3y[] h;
    public final ProductMode$Taxi.SectionType a;
    public final List b;
    public final List c;
    public final List d;
    public final ProductMode$Taxi.SectionHeader e;
    public final SectionTypedHeader f;
    public final jsq0 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new v8f0(13)), kotlin.a.b(lazyThreadSafetyMode, new v8f0(14)), kotlin.a.b(lazyThreadSafetyMode, new v8f0(15)), kotlin.a.b(lazyThreadSafetyMode, new v8f0(16)), null, null, kotlin.a.b(lazyThreadSafetyMode, new v8f0(17))};
    }

    public /* synthetic */ ProductsCommon$Section(int i, ProductMode$Taxi.SectionType sectionType, List list, List list2, List list3, ProductMode$Taxi.SectionHeader sectionHeader, SectionTypedHeader sectionTypedHeader, jsq0 jsq0Var) {
        this.a = (i & 1) == 0 ? ProductMode$Taxi.SectionType.UNSUPPORTED : sectionType;
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
            this.d = emptyList;
        } else {
            this.d = list3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = sectionHeader;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = sectionTypedHeader;
        }
        if ((i & 64) == 0) {
            this.g = ksq0.a;
        } else {
            this.g = jsq0Var;
        }
    }

    public static final /* synthetic */ void c(ProductsCommon$Section productsCommon$Section, yjd yjdVar, SerialDescriptor serialDescriptor) {
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = h;
        if (F || productsCommon$Section.a != ProductMode$Taxi.SectionType.UNSUPPORTED) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), productsCommon$Section.a);
        }
        boolean F2 = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        if (F2 || !jl40.l(productsCommon$Section.b, emptyList)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), productsCommon$Section.b);
        }
        if (yjdVar.F() || !jl40.l(productsCommon$Section.c, emptyList)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), productsCommon$Section.c);
        }
        if (yjdVar.F() || !jl40.l(productsCommon$Section.d, emptyList)) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), productsCommon$Section.d);
        }
        if (yjdVar.F() || productsCommon$Section.e != null) {
            yjdVar.g(serialDescriptor, 4, ProductMode$Taxi$SectionHeader$$serializer.INSTANCE, productsCommon$Section.e);
        }
        if (yjdVar.F() || productsCommon$Section.f != null) {
            yjdVar.g(serialDescriptor, 5, SectionTypedHeader$$serializer.INSTANCE, productsCommon$Section.f);
        }
        if (!yjdVar.F() && jl40.l(productsCommon$Section.g, ksq0.a)) {
            return;
        }
        yjdVar.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), productsCommon$Section.g);
    }

    public final String b() {
        int i = w1.a[this.a.ordinal()];
        String str = (i == 1 || i == 2 || i == 3) ? (String) kotlin.collections.a.R(this.b) : i != 4 ? i != 5 ? null : (String) kotlin.collections.a.R(this.c) : (String) kotlin.collections.a.R(this.d);
        return str == null ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsCommon$Section)) {
            return false;
        }
        ProductsCommon$Section productsCommon$Section = (ProductsCommon$Section) obj;
        return this.a == productsCommon$Section.a && jl40.l(this.b, productsCommon$Section.b) && jl40.l(this.c, productsCommon$Section.c) && jl40.l(this.d, productsCommon$Section.d) && jl40.l(this.e, productsCommon$Section.e) && jl40.l(this.f, productsCommon$Section.f) && jl40.l(this.g, productsCommon$Section.g);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ProductMode$Taxi.SectionHeader sectionHeader = this.e;
        int hashCode = (c + (sectionHeader == null ? 0 : sectionHeader.hashCode())) * 31;
        SectionTypedHeader sectionTypedHeader = this.f;
        return this.g.a.hashCode() + ((hashCode + (sectionTypedHeader != null ? sectionTypedHeader.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Section(type=");
        sb.append(this.a);
        sb.append(", shortcutIds=");
        sb.append(this.b);
        sb.append(", buttonIds=");
        nnm.w(sb, this.c, ", stackItemsIds=", this.d, ", header=");
        sb.append(this.e);
        sb.append(", typedHeader=");
        sb.append(this.f);
        sb.append(", tags=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public ProductsCommon$Section() {
        ProductMode$Taxi.SectionType sectionType = ProductMode$Taxi.SectionType.UNSUPPORTED;
        jsq0 jsq0Var = ksq0.a;
        this.a = sectionType;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = emptyList;
        this.e = null;
        this.f = null;
        this.g = jsq0Var;
    }
}

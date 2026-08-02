package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.v8f0;
import defpackage.vfc;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/shortcuts/dto/response/ProductsCommon$OfferItem", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/u1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductsCommon$OfferItem {
    public static final u1 Companion = new u1();
    public static final i3y[] e;
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new v8f0(9)), kotlin.a.b(lazyThreadSafetyMode, new v8f0(10)), kotlin.a.b(lazyThreadSafetyMode, new v8f0(11)), kotlin.a.b(lazyThreadSafetyMode, new v8f0(12))};
    }

    public /* synthetic */ ProductsCommon$OfferItem(int i, List list, List list2, List list3, List list4) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list4;
        }
    }

    public static final /* synthetic */ void b(ProductsCommon$OfferItem productsCommon$OfferItem, yjd yjdVar, SerialDescriptor serialDescriptor) {
        boolean F = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        i3y[] i3yVarArr = e;
        if (F || !jl40.l(productsCommon$OfferItem.a, emptyList)) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), productsCommon$OfferItem.a);
        }
        if (yjdVar.F() || !jl40.l(productsCommon$OfferItem.b, emptyList)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), productsCommon$OfferItem.b);
        }
        if (yjdVar.F() || !jl40.l(productsCommon$OfferItem.c, emptyList)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), productsCommon$OfferItem.c);
        }
        if (!yjdVar.F() && jl40.l(productsCommon$OfferItem.d, emptyList)) {
            return;
        }
        yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), productsCommon$OfferItem.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsCommon$OfferItem)) {
            return false;
        }
        ProductsCommon$OfferItem productsCommon$OfferItem = (ProductsCommon$OfferItem) obj;
        return jl40.l(this.a, productsCommon$OfferItem.a) && jl40.l(this.b, productsCommon$OfferItem.b) && jl40.l(this.c, productsCommon$OfferItem.c) && jl40.l(this.d, productsCommon$OfferItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return vfc.p(qv10.v("OfferItem(items=", this.a, ", headers=", this.b, ", buttons="), this.c, ", stackItems=", this.d, Extension.C_BRAKE);
    }

    public ProductsCommon$OfferItem(int i) {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = emptyList;
        this.d = emptyList;
    }

    public ProductsCommon$OfferItem() {
        this(0);
    }
}

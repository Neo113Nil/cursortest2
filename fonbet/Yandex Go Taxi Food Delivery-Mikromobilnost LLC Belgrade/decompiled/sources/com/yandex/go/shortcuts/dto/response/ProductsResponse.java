package com.yandex.go.shortcuts.dto.response;

import defpackage.gef;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.lwj0;
import defpackage.nor;
import defpackage.r9f0;
import defpackage.unr0;
import defpackage.v8f0;
import defpackage.wa7;
import defpackage.xa7;
import defpackage.yjd;
import defpackage.zn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductsResponse;", "Llwj0;", "Lr9f0;", "Companion", "com/yandex/go/shortcuts/dto/response/x1", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsResponse extends lwj0 implements r9f0 {
    public static final x1 Companion = new x1();
    public static final i3y[] g;
    public static final ProductsResponse h;
    public final Float a;
    public final List b;
    public final BackgroundFraming c;
    public final PromoMode d;
    public final ief e;
    public final xa7 f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new v8f0(18)), null, kotlin.a.b(lazyThreadSafetyMode, new v8f0(19)), null, null};
        h = new ProductsResponse(0);
    }

    public /* synthetic */ ProductsResponse(int i, Float f, List list, BackgroundFraming backgroundFraming, PromoMode promoMode, ief iefVar, xa7 xa7Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = new BackgroundFraming(0);
        } else {
            this.c = backgroundFraming;
        }
        if ((i & 8) == 0) {
            this.d = PromoMode.UNKNOWN;
        } else {
            this.d = promoMode;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = iefVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = xa7Var;
        }
    }

    public static final void i(ProductsResponse productsResponse, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || productsResponse.a != null) {
            yjdVar.g(serialDescriptor, 0, nor.a, productsResponse.a);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = g;
        if (F || !jl40.l(productsResponse.b, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), productsResponse.b);
        }
        if (yjdVar.F() || !jl40.l(productsResponse.c, new BackgroundFraming(0))) {
            yjdVar.e(serialDescriptor, 2, BackgroundFraming$$serializer.INSTANCE, productsResponse.c);
        }
        if (yjdVar.F() || productsResponse.d != PromoMode.UNKNOWN) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), productsResponse.d);
        }
        if (yjdVar.F() || productsResponse.e != null) {
            yjdVar.g(serialDescriptor, 4, gef.a, productsResponse.e);
        }
        if (!yjdVar.F() && productsResponse.f == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 5, wa7.a, productsResponse.f);
    }

    @Override // defpackage.r9f0
    /* renamed from: a, reason: from getter */
    public final List getB() {
        return this.b;
    }

    @Override // defpackage.lwj0
    /* renamed from: e */
    public final zn11 getA() {
        xa7 xa7Var = this.f;
        if (xa7Var != null) {
            return xa7Var.c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ProductsResponse.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ProductsResponse productsResponse = (ProductsResponse) obj;
        return jl40.l(this.e, productsResponse.e) && jl40.k(this.a, productsResponse.a) && jl40.l(this.b, productsResponse.b) && jl40.l(this.c, productsResponse.c) && this.d == productsResponse.d;
    }

    /* renamed from: h, reason: from getter */
    public final PromoMode getD() {
        return this.d;
    }

    public final int hashCode() {
        ief iefVar = this.e;
        int hashCode = (iefVar != null ? iefVar.hashCode() : 0) * 31;
        Float f = this.a;
        return this.d.hashCode() + unr0.c(unr0.c((hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 31, 31, this.b), 31, this.c.a);
    }

    public ProductsResponse() {
        this(0);
    }

    public ProductsResponse(int i) {
        BackgroundFraming backgroundFraming = new BackgroundFraming(0);
        PromoMode promoMode = PromoMode.UNKNOWN;
        this.a = null;
        this.b = EmptyList.a;
        this.c = backgroundFraming;
        this.d = promoMode;
        this.e = null;
        this.f = null;
    }
}

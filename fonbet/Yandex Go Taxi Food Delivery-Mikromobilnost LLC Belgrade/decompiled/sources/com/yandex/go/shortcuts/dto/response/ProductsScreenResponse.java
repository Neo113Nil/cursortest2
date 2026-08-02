package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lwj0;
import defpackage.nor;
import defpackage.r9f0;
import defpackage.uc4;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductsScreenResponse;", "Lr9f0;", "Llwj0;", "Companion", "com/yandex/go/shortcuts/dto/response/y1", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsScreenResponse extends lwj0 implements r9f0 {
    public static final y1 Companion = new y1();
    public static final i3y[] h;
    public static final ProductsScreenResponse i;
    public final Float a;
    public final List b;
    public final BackgroundFraming c;
    public final PromoMode d;
    public final Screen e;
    public final uc4 f;
    public final xa7 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new v8f0(20)), null, kotlin.a.b(lazyThreadSafetyMode, new v8f0(21)), null, null, null};
        i = new ProductsScreenResponse(0);
    }

    public /* synthetic */ ProductsScreenResponse(int i2, Float f, List list, BackgroundFraming backgroundFraming, PromoMode promoMode, Screen screen, uc4 uc4Var, xa7 xa7Var) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
        if ((i2 & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            this.c = new BackgroundFraming(0);
        } else {
            this.c = backgroundFraming;
        }
        if ((i2 & 8) == 0) {
            this.d = PromoMode.UNKNOWN;
        } else {
            this.d = promoMode;
        }
        if ((i2 & 16) == 0) {
            this.e = new Screen(0);
        } else {
            this.e = screen;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = uc4Var;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = xa7Var;
        }
    }

    public static final void i(ProductsScreenResponse productsScreenResponse, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || productsScreenResponse.a != null) {
            yjdVar.g(serialDescriptor, 0, nor.a, productsScreenResponse.a);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = h;
        if (F || !jl40.l(productsScreenResponse.b, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), productsScreenResponse.b);
        }
        if (yjdVar.F() || !jl40.l(productsScreenResponse.c, new BackgroundFraming(0))) {
            yjdVar.e(serialDescriptor, 2, BackgroundFraming$$serializer.INSTANCE, productsScreenResponse.c);
        }
        if (yjdVar.F() || productsScreenResponse.d != PromoMode.UNKNOWN) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), productsScreenResponse.d);
        }
        if (yjdVar.F() || !jl40.l(productsScreenResponse.e, new Screen(0))) {
            yjdVar.e(serialDescriptor, 4, Screen$$serializer.INSTANCE, productsScreenResponse.e);
        }
        if (yjdVar.F() || productsScreenResponse.f != null) {
            yjdVar.g(serialDescriptor, 5, uc4.Companion.serializer(), productsScreenResponse.f);
        }
        if (!yjdVar.F() && productsScreenResponse.g == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 6, wa7.a, productsScreenResponse.g);
    }

    @Override // defpackage.r9f0
    /* renamed from: a, reason: from getter */
    public final List getB() {
        return this.b;
    }

    @Override // defpackage.lwj0
    /* renamed from: e */
    public final zn11 getW0() {
        xa7 xa7Var = this.g;
        if (xa7Var != null) {
            return xa7Var.c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ProductsScreenResponse.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ProductsScreenResponse productsScreenResponse = (ProductsScreenResponse) obj;
        return jl40.l(this.e, productsScreenResponse.e) && jl40.k(this.a, productsScreenResponse.a) && jl40.l(this.b, productsScreenResponse.b) && jl40.l(this.c, productsScreenResponse.c) && this.d == productsScreenResponse.d;
    }

    /* renamed from: h, reason: from getter */
    public final Screen getE() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        Float f = this.a;
        return this.d.hashCode() + unr0.c(unr0.c((hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 31, 31, this.b), 31, this.c.a);
    }

    public ProductsScreenResponse() {
        this(0);
    }

    public ProductsScreenResponse(int i2) {
        BackgroundFraming backgroundFraming = new BackgroundFraming(0);
        PromoMode promoMode = PromoMode.UNKNOWN;
        Screen screen = new Screen(0);
        this.a = null;
        this.b = EmptyList.a;
        this.c = backgroundFraming;
        this.d = promoMode;
        this.e = screen;
        this.f = null;
        this.g = null;
    }
}

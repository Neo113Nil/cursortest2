package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.shortcuts.dto.request.ProductsParam;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.kd7;
import defpackage.pf10;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/ProductsScreenParam;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/m", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProductsScreenParam {
    public static final m Companion = new m();
    public final zzs a;
    public final ProductsParamsState b;
    public final ProductsParam.Shortcuts c;
    public final pf10 d;
    public final ProductsScreenPayload e;
    public final kd7 f;

    public /* synthetic */ ProductsScreenParam(int i, zzs zzsVar, ProductsParamsState productsParamsState, ProductsParam.Shortcuts shortcuts, pf10 pf10Var, ProductsScreenPayload productsScreenPayload, kd7 kd7Var) {
        if ((i & 1) == 0) {
            this.a = new zzs(0.0d, 0.0d, 0, null, null, 24);
        } else {
            this.a = zzsVar;
        }
        if ((i & 2) == 0) {
            this.b = new ProductsParamsState(0);
        } else {
            this.b = productsParamsState;
        }
        if ((i & 4) == 0) {
            this.c = new ProductsParam.Shortcuts(null, 511);
        } else {
            this.c = shortcuts;
        }
        if ((i & 8) == 0) {
            this.d = new pf10(0);
        } else {
            this.d = pf10Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = productsScreenPayload;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = kd7Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsScreenParam)) {
            return false;
        }
        ProductsScreenParam productsScreenParam = (ProductsScreenParam) obj;
        return jl40.l(this.a, productsScreenParam.a) && jl40.l(this.b, productsScreenParam.b) && jl40.l(this.c, productsScreenParam.c) && jl40.l(this.d, productsScreenParam.d) && jl40.l(this.e, productsScreenParam.e) && jl40.l(this.f, productsScreenParam.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        ProductsScreenPayload productsScreenPayload = this.e;
        int hashCode2 = (hashCode + (productsScreenPayload == null ? 0 : productsScreenPayload.hashCode())) * 31;
        kd7 kd7Var = this.f;
        return hashCode2 + (kd7Var != null ? kd7Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "ProductsScreenParam(position=" + this.a + ", state=" + this.b + ", shortcuts=" + this.c + ", mediaSizeInfo=" + this.d + ", payload=" + this.e + ", typedExperiments=" + this.f + Extension.C_BRAKE;
    }

    public ProductsScreenParam() {
        this((zzs) null, (ProductsParamsState) null, (ProductsParam.Shortcuts) null, (pf10) null, (ProductsScreenPayload) null, 63);
    }

    public ProductsScreenParam(zzs zzsVar, ProductsParamsState productsParamsState, ProductsParam.Shortcuts shortcuts, pf10 pf10Var, ProductsScreenPayload productsScreenPayload, kd7 kd7Var) {
        this.a = zzsVar;
        this.b = productsParamsState;
        this.c = shortcuts;
        this.d = pf10Var;
        this.e = productsScreenPayload;
        this.f = kd7Var;
    }

    public /* synthetic */ ProductsScreenParam(zzs zzsVar, ProductsParamsState productsParamsState, ProductsParam.Shortcuts shortcuts, pf10 pf10Var, ProductsScreenPayload productsScreenPayload, int i) {
        this((i & 1) != 0 ? new zzs(0.0d, 0.0d, 0, null, null, 24) : zzsVar, (i & 2) != 0 ? new ProductsParamsState(0) : productsParamsState, (i & 4) != 0 ? new ProductsParam.Shortcuts(null, 511) : shortcuts, (i & 8) != 0 ? new pf10(0) : pf10Var, (i & 16) != 0 ? null : productsScreenPayload, (kd7) null);
    }
}

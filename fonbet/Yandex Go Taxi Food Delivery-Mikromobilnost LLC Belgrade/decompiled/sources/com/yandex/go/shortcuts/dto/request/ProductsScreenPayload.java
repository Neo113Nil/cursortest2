package com.yandex.go.shortcuts.dto.request;

import defpackage.gsq0;
import defpackage.h6w;
import defpackage.rcx;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/ProductsScreenPayload;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/n", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsScreenPayload {
    public static final n Companion = new n();
    public final Integer a;
    public final kotlinx.serialization.json.b b;
    public final kotlinx.serialization.json.b c;

    public /* synthetic */ ProductsScreenPayload(int i, Integer num, kotlinx.serialization.json.b bVar, kotlinx.serialization.json.b bVar2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar2;
        }
    }

    public static final /* synthetic */ void a(ProductsScreenPayload productsScreenPayload, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || productsScreenPayload.a != null) {
            yjdVar.g(serialDescriptor, 0, h6w.a, productsScreenPayload.a);
        }
        if (yjdVar.F() || productsScreenPayload.b != null) {
            yjdVar.g(serialDescriptor, 1, rcx.a, productsScreenPayload.b);
        }
        if (!yjdVar.F() && productsScreenPayload.c == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 2, rcx.a, productsScreenPayload.c);
    }

    public ProductsScreenPayload(Integer num, kotlinx.serialization.json.b bVar, kotlinx.serialization.json.b bVar2) {
        this.a = num;
        this.b = bVar;
        this.c = bVar2;
    }

    public ProductsScreenPayload() {
        this(null, null, null);
    }
}

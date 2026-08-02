package com.yandex.go.shortcuts.dto.response;

import defpackage.c6p0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Screen;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/f2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Screen {
    public static final f2 Companion = new f2();
    public static final i3y[] g;
    public final Layout a;
    public final ProductsCommon$OfferItem b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new c6p0(11)), kotlin.a.b(lazyThreadSafetyMode, new c6p0(12)), null, null};
    }

    public /* synthetic */ Screen(int i, Layout layout, ProductsCommon$OfferItem productsCommon$OfferItem, List list, List list2, String str, String str2) {
        this.a = (i & 1) == 0 ? new Layout(0) : layout;
        if ((i & 2) == 0) {
            this.b = new ProductsCommon$OfferItem(0);
        } else {
            this.b = productsCommon$OfferItem;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
    }

    public static final /* synthetic */ void c(Screen screen, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(screen.a, new Layout(0))) {
            yjdVar.e(serialDescriptor, 0, Layout$$serializer.INSTANCE, screen.a);
        }
        if (yjdVar.F() || !jl40.l(screen.b, new ProductsCommon$OfferItem(0))) {
            yjdVar.e(serialDescriptor, 1, ProductsCommon$OfferItem$$serializer.INSTANCE, screen.b);
        }
        boolean F = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        i3y[] i3yVarArr = g;
        if (F || !jl40.l(screen.c, emptyList)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), screen.c);
        }
        if (yjdVar.F() || !jl40.l(screen.d, emptyList)) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), screen.d);
        }
        if (yjdVar.F() || !jl40.l(screen.e, "")) {
            yjdVar.o(serialDescriptor, 4, screen.e);
        }
        if (!yjdVar.F() && jl40.l(screen.f, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 5, screen.f);
    }

    /* renamed from: b, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public Screen() {
        this(0);
    }

    public Screen(int i) {
        Layout layout = new Layout(0);
        ProductsCommon$OfferItem productsCommon$OfferItem = new ProductsCommon$OfferItem(0);
        this.a = layout;
        this.b = productsCommon$OfferItem;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = "";
        this.f = "";
    }
}

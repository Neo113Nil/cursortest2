package com.yandex.go.chargers.order.data.model;

import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto$$serializer;
import defpackage.ak9;
import defpackage.auu0;
import defpackage.gef;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.w7s;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderDto;", "", "Companion", "ActiveCardModes", "$serializer", "com/yandex/go/chargers/order/data/model/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderDto {
    public static final y Companion = new y();
    public static final i3y[] u;
    public final String a;
    public final ChargersActiveOrderStatusDto b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final FormattedText f;
    public final String g;
    public final FormattedText h;
    public final FormattedText i;
    public final FormattedText j;
    public final ief k;
    public final List l;
    public final List m;
    public final ChargersErrorDetailsDto n;
    public final ChargersActiveOrderMultiOrderDto o;
    public final ActiveCardModes p;
    public final Integer q;
    public final Integer r;
    public final List s;
    public final List t;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ak9(5)), null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ak9(6)), kotlin.a.b(lazyThreadSafetyMode, new ak9(7)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ak9(8)), kotlin.a.b(lazyThreadSafetyMode, new ak9(9))};
    }

    public ChargersActiveOrderDto(int i, String str, ChargersActiveOrderStatusDto chargersActiveOrderStatusDto, FormattedText formattedText, FormattedText formattedText2, String str2, FormattedText formattedText3, String str3, FormattedText formattedText4, FormattedText formattedText5, FormattedText formattedText6, ief iefVar, List list, List list2, ChargersErrorDetailsDto chargersErrorDetailsDto, ChargersActiveOrderMultiOrderDto chargersActiveOrderMultiOrderDto, ActiveCardModes activeCardModes, Integer num, Integer num2, List list3, List list4) {
        ChargersErrorDetailsDto chargersErrorDetailsDto2;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = chargersActiveOrderStatusDto;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText3;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = FormattedText.c;
        } else {
            this.h = formattedText4;
        }
        if ((i & 256) == 0) {
            this.i = FormattedText.c;
        } else {
            this.i = formattedText5;
        }
        if ((i & 512) == 0) {
            this.j = FormattedText.c;
        } else {
            this.j = formattedText6;
        }
        if ((i & 1024) == 0) {
            this.k = ief.e;
        } else {
            this.k = iefVar;
        }
        int i2 = i & 2048;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.l = emptyList;
        } else {
            this.l = list;
        }
        if ((i & 4096) == 0) {
            this.m = emptyList;
        } else {
            this.m = list2;
        }
        if ((i & 8192) == 0) {
            ChargersErrorDetailsDto.Companion.getClass();
            chargersErrorDetailsDto2 = ChargersErrorDetailsDto.d;
        } else {
            chargersErrorDetailsDto2 = chargersErrorDetailsDto;
        }
        this.n = chargersErrorDetailsDto2;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = chargersActiveOrderMultiOrderDto;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = activeCardModes;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = num;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num2;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = list3;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = list4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x015e, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.chargers.error.api.ChargersErrorDetailsDto.d) == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(ChargersActiveOrderDto chargersActiveOrderDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || chargersActiveOrderDto.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, chargersActiveOrderDto.a);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = u;
        if (F || chargersActiveOrderDto.b != null) {
            yjdVar.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), chargersActiveOrderDto.b);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.c, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 2, w7s.a, chargersActiveOrderDto.c);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.d, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 3, w7s.a, chargersActiveOrderDto.d);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.e, "")) {
            yjdVar.o(serialDescriptor, 4, chargersActiveOrderDto.e);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.f, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 5, w7s.a, chargersActiveOrderDto.f);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.g, "")) {
            yjdVar.o(serialDescriptor, 6, chargersActiveOrderDto.g);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.h, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 7, w7s.a, chargersActiveOrderDto.h);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.i, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 8, w7s.a, chargersActiveOrderDto.i);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.j, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 9, w7s.a, chargersActiveOrderDto.j);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.k, ief.e)) {
            yjdVar.e(serialDescriptor, 10, gef.a, chargersActiveOrderDto.k);
        }
        boolean F2 = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        if (F2 || !jl40.l(chargersActiveOrderDto.l, emptyList)) {
            yjdVar.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), chargersActiveOrderDto.l);
        }
        if (yjdVar.F() || !jl40.l(chargersActiveOrderDto.m, emptyList)) {
            yjdVar.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), chargersActiveOrderDto.m);
        }
        if (!yjdVar.F()) {
            ChargersErrorDetailsDto chargersErrorDetailsDto = chargersActiveOrderDto.n;
            ChargersErrorDetailsDto.Companion.getClass();
        }
        yjdVar.e(serialDescriptor, 13, ChargersErrorDetailsDto$$serializer.INSTANCE, chargersActiveOrderDto.n);
        if (yjdVar.F() || chargersActiveOrderDto.o != null) {
            yjdVar.g(serialDescriptor, 14, ChargersActiveOrderMultiOrderDto$$serializer.INSTANCE, chargersActiveOrderDto.o);
        }
        if (yjdVar.F() || chargersActiveOrderDto.p != null) {
            yjdVar.g(serialDescriptor, 15, ChargersActiveOrderDto$ActiveCardModes$$serializer.INSTANCE, chargersActiveOrderDto.p);
        }
        if (yjdVar.F() || chargersActiveOrderDto.q != null) {
            yjdVar.g(serialDescriptor, 16, h6w.a, chargersActiveOrderDto.q);
        }
        if (yjdVar.F() || chargersActiveOrderDto.r != null) {
            yjdVar.g(serialDescriptor, 17, h6w.a, chargersActiveOrderDto.r);
        }
        if (yjdVar.F() || chargersActiveOrderDto.s != null) {
            yjdVar.g(serialDescriptor, 18, (KSerializer) i3yVarArr[18].getValue(), chargersActiveOrderDto.s);
        }
        if (!yjdVar.F() && chargersActiveOrderDto.t == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 19, (KSerializer) i3yVarArr[19].getValue(), chargersActiveOrderDto.t);
    }

    /* renamed from: b, reason: from getter */
    public final ActiveCardModes getP() {
        return this.p;
    }

    /* renamed from: c, reason: from getter */
    public final ief getK() {
        return this.k;
    }

    /* renamed from: d, reason: from getter */
    public final List getM() {
        return this.m;
    }

    /* renamed from: e, reason: from getter */
    public final FormattedText getJ() {
        return this.j;
    }

    /* renamed from: f, reason: from getter */
    public final ChargersErrorDetailsDto getN() {
        return this.n;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getR() {
        return this.r;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getQ() {
        return this.q;
    }

    /* renamed from: i, reason: from getter */
    public final List getL() {
        return this.l;
    }

    /* renamed from: j, reason: from getter */
    public final ChargersActiveOrderMultiOrderDto getO() {
        return this.o;
    }

    /* renamed from: k, reason: from getter */
    public final List getT() {
        return this.t;
    }

    /* renamed from: l, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: m, reason: from getter */
    public final ChargersActiveOrderStatusDto getB() {
        return this.b;
    }

    /* renamed from: n, reason: from getter */
    public final List getS() {
        return this.s;
    }

    /* renamed from: o, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: p, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: q, reason: from getter */
    public final FormattedText getF() {
        return this.f;
    }

    /* renamed from: r, reason: from getter */
    public final FormattedText getI() {
        return this.i;
    }

    /* renamed from: s, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    /* renamed from: t, reason: from getter */
    public final FormattedText getD() {
        return this.d;
    }

    /* renamed from: u, reason: from getter */
    public final FormattedText getH() {
        return this.h;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderDto$ActiveCardModes;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ActiveCardModes {
        public static final x Companion = new x();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(10))};
        public final String a;
        public final List b;

        public /* synthetic */ ActiveCardModes(int i, String str, List list) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final List getB() {
            return this.b;
        }

        public ActiveCardModes() {
            this.a = null;
            this.b = EmptyList.a;
        }
    }

    public ChargersActiveOrderDto() {
        FormattedText formattedText = FormattedText.c;
        ChargersErrorDetailsDto.Companion.getClass();
        ChargersErrorDetailsDto chargersErrorDetailsDto = ChargersErrorDetailsDto.d;
        this.a = null;
        this.b = null;
        this.c = formattedText;
        this.d = formattedText;
        this.e = "";
        this.f = formattedText;
        this.g = "";
        this.h = formattedText;
        this.i = formattedText;
        this.j = formattedText;
        this.k = ief.e;
        EmptyList emptyList = EmptyList.a;
        this.l = emptyList;
        this.m = emptyList;
        this.n = chargersErrorDetailsDto;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
    }
}

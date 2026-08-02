package com.yandex.go.shortcuts.dto.response;

import defpackage.b64;
import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xx;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/VerticalStack;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/h3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VerticalStack {
    public static final h3 Companion = new h3();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final com.yandex.go.dto.response.q1 c;
    public final List d;
    public final List e;
    public final String f;
    public final String g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new b931(6)), kotlin.a.b(lazyThreadSafetyMode, new b931(7)), null, null};
    }

    public /* synthetic */ VerticalStack(int i, String str, String str2, com.yandex.go.dto.response.q1 q1Var, List list, List list2, String str3, String str4) {
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
        if ((i & 4) == 0) {
            this.c = com.yandex.go.dto.response.e0.INSTANCE;
        } else {
            this.c = q1Var;
        }
        int i2 = i & 8;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
    }

    public static final /* synthetic */ void b(VerticalStack verticalStack, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(verticalStack.a, "")) {
            yjdVar.o(serialDescriptor, 0, verticalStack.a);
        }
        if (yjdVar.F() || !jl40.l(verticalStack.b, "")) {
            yjdVar.o(serialDescriptor, 1, verticalStack.b);
        }
        if (yjdVar.F() || !jl40.l(verticalStack.c, com.yandex.go.dto.response.e0.INSTANCE)) {
            yjdVar.e(serialDescriptor, 2, xx.f, verticalStack.c);
        }
        boolean F = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        i3y[] i3yVarArr = h;
        if (F || !jl40.l(verticalStack.d, emptyList)) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), verticalStack.d);
        }
        if (yjdVar.F() || !jl40.l(verticalStack.e, emptyList)) {
            yjdVar.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), verticalStack.e);
        }
        if (yjdVar.F() || !jl40.l(verticalStack.f, "")) {
            yjdVar.o(serialDescriptor, 5, verticalStack.f);
        }
        if (!yjdVar.F() && jl40.l(verticalStack.g, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 6, verticalStack.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalStack)) {
            return false;
        }
        VerticalStack verticalStack = (VerticalStack) obj;
        return jl40.l(this.a, verticalStack.a) && jl40.l(this.b, verticalStack.b) && jl40.l(this.c, verticalStack.c) && jl40.l(this.d, verticalStack.d) && jl40.l(this.e, verticalStack.e) && jl40.l(this.f, verticalStack.f) && jl40.l(this.g, verticalStack.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.c(unr0.c((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("VerticalStack(id=", this.a, ", backgroundColor=", this.b, ", action=");
        v.append(this.c);
        v.append(", alignmentTopItems=");
        v.append(this.d);
        v.append(", alignmentBottomItems=");
        oyr.D(", eventPayload=", this.f, ", service=", v, this.e);
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }

    public VerticalStack() {
        com.yandex.go.dto.response.e0 e0Var = com.yandex.go.dto.response.e0.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = e0Var;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = emptyList;
        this.f = "";
        this.g = "";
    }
}

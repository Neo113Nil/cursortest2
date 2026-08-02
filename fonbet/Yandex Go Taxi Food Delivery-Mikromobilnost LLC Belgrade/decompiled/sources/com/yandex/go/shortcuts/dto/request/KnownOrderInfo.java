package com.yandex.go.shortcuts.dto.request;

import defpackage.auu0;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vix;
import defpackage.yjd;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/KnownOrderInfo;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class KnownOrderInfo {
    public static final b Companion = new b();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final Map f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new vix(2)), null, null, kotlin.a.b(lazyThreadSafetyMode, new vix(3))};
    }

    public /* synthetic */ KnownOrderInfo(String str, String str2, List list, String str3, String str4, Map map, int i) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = "unknown";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map;
        }
    }

    public static final /* synthetic */ void b(KnownOrderInfo knownOrderInfo, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(knownOrderInfo.a, "")) {
            yjdVar.o(serialDescriptor, 0, knownOrderInfo.a);
        }
        if (yjdVar.F() || !jl40.l(knownOrderInfo.b, "unknown")) {
            yjdVar.o(serialDescriptor, 1, knownOrderInfo.b);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = g;
        if (F || !jl40.l(knownOrderInfo.c, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), knownOrderInfo.c);
        }
        if (yjdVar.F() || knownOrderInfo.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, knownOrderInfo.d);
        }
        if (yjdVar.F() || knownOrderInfo.e != null) {
            yjdVar.g(serialDescriptor, 4, auu0.a, knownOrderInfo.e);
        }
        if (!yjdVar.F() && knownOrderInfo.f == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), knownOrderInfo.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KnownOrderInfo)) {
            return false;
        }
        KnownOrderInfo knownOrderInfo = (KnownOrderInfo) obj;
        return jl40.l(this.a, knownOrderInfo.a) && jl40.l(this.b, knownOrderInfo.b) && jl40.l(this.c, knownOrderInfo.c) && jl40.l(this.d, knownOrderInfo.d) && jl40.l(this.e, knownOrderInfo.e) && jl40.l(this.f, knownOrderInfo.f);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("KnownOrderInfo(orderId=", this.a, ", service=", this.b, ", wayPoints=");
        oyr.D(", status=", this.d, ", completionDatetime=", v, this.c);
        v.append(this.e);
        v.append(", orderMeta=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public KnownOrderInfo(String str, String str2, List list, String str3, String str4, Map map) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = map;
    }

    public KnownOrderInfo() {
        this("", "unknown", EmptyList.a, null, null, null);
    }
}

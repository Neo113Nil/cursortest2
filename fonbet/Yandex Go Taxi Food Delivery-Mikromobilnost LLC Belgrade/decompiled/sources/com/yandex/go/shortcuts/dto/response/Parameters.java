package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.xvz;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Parameters;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/h0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Parameters {
    public static final h0 Companion = new h0();
    public final boolean a;
    public final String b;

    public /* synthetic */ Parameters(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public static final /* synthetic */ void a(Parameters parameters, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || parameters.a) {
            yjdVar.n(serialDescriptor, 0, parameters.a);
        }
        if (!yjdVar.F() && jl40.l(parameters.b, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 1, parameters.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Parameters)) {
            return false;
        }
        Parameters parameters = (Parameters) obj;
        return this.a == parameters.a && jl40.l(this.b, parameters.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("Parameters(available=", this.a, ", productTag=", this.b, Extension.C_BRAKE);
    }

    public Parameters(int i) {
        this.a = false;
        this.b = "";
    }

    public Parameters() {
        this(0);
    }
}

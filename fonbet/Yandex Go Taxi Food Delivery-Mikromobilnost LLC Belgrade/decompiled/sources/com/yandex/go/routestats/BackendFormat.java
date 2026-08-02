package com.yandex.go.routestats;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.p73;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.w7s;
import defpackage.xvz;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/routestats/BackendFormat;", "", "Companion", "$serializer", "com/yandex/go/routestats/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BackendFormat {
    public static final a Companion = new a();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(21)), null, null};
    public final List a;
    public final String b;
    public final FormattedText c;

    public /* synthetic */ BackendFormat(int i, List list, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
    }

    public static final /* synthetic */ void e(BackendFormat backendFormat, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(backendFormat.a, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) d[0].getValue(), backendFormat.a);
        }
        if (yjdVar.F() || !jl40.l(backendFormat.b, "")) {
            yjdVar.o(serialDescriptor, 1, backendFormat.b);
        }
        if (!yjdVar.F() && jl40.l(backendFormat.c, FormattedText.c)) {
            return;
        }
        yjdVar.e(serialDescriptor, 2, w7s.a, backendFormat.c);
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final List getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackendFormat)) {
            return false;
        }
        BackendFormat backendFormat = (BackendFormat) obj;
        return jl40.l(this.a, backendFormat.a) && jl40.l(this.b, backendFormat.b) && jl40.l(this.c, backendFormat.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return tse0.m(xvz.s("BackendFormat(args=", this.a, ", accessibilityText=", this.b, ", text="), this.c, Extension.C_BRAKE);
    }

    public BackendFormat() {
        FormattedText formattedText = FormattedText.c;
        this.a = EmptyList.a;
        this.b = "";
        this.c = formattedText;
    }
}

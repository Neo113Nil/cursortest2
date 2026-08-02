package com.yandex.go.shortcuts.dto.response;

import defpackage.auu0;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nor;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Background;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Background {
    public static final f Companion = new f();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Float e;
    public final String f;
    public final l g;

    public /* synthetic */ Background(int i, String str, String str2, String str3, String str4, Float f, String str5, l lVar) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = lVar;
        }
    }

    public static final /* synthetic */ void a(Background background, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(background.a, "")) {
            yjdVar.o(serialDescriptor, 0, background.a);
        }
        if (yjdVar.F() || !jl40.l(background.b, "")) {
            yjdVar.o(serialDescriptor, 1, background.b);
        }
        if (yjdVar.F() || !jl40.l(background.c, "")) {
            yjdVar.o(serialDescriptor, 2, background.c);
        }
        if (yjdVar.F() || !jl40.l(background.d, "")) {
            yjdVar.o(serialDescriptor, 3, background.d);
        }
        if (yjdVar.F() || background.e != null) {
            yjdVar.g(serialDescriptor, 4, nor.a, background.e);
        }
        if (yjdVar.F() || background.f != null) {
            yjdVar.g(serialDescriptor, 5, auu0.a, background.f);
        }
        if (!yjdVar.F() && background.g == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 6, l.Companion.serializer(), background.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Background)) {
            return false;
        }
        Background background = (Background) obj;
        return jl40.l(this.a, background.a) && jl40.l(this.b, background.b) && jl40.l(this.c, background.c) && jl40.l(this.d, background.d) && jl40.l(this.e, background.e) && jl40.l(this.f, background.f) && jl40.l(this.g, background.g);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Float f = this.e;
        int hashCode = (b + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l lVar = this.g;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Background(imageTag=", this.a, ", imageUrl=", this.b, ", color=");
        g8e.D(v, this.c, ", altText=", this.d, ", alpha=");
        v.append(this.e);
        v.append(", metaColor=");
        v.append(this.f);
        v.append(", animation=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public Background(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public Background() {
        this(0);
    }
}

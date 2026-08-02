package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/StaticImage;", "Lcom/yandex/go/shortcuts/dto/response/d;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/s2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StaticImage extends d {
    public static final s2 Companion = new s2();
    public final String a;
    public final String b;

    public /* synthetic */ StaticImage(int i, String str, String str2) {
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
    }

    public static final /* synthetic */ void d(StaticImage staticImage, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(staticImage.a, "")) {
            yjdVar.o(serialDescriptor, 0, staticImage.a);
        }
        if (!yjdVar.F() && jl40.l(staticImage.b, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 1, staticImage.b);
    }

    @Override // com.yandex.go.shortcuts.dto.response.d
    public final AnimationSourceType a() {
        return AnimationSourceType.STATIC_IMAGE;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticImage)) {
            return false;
        }
        StaticImage staticImage = (StaticImage) obj;
        return jl40.l(this.a, staticImage.a) && jl40.l(this.b, staticImage.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("StaticImage(imageUrl=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }

    public StaticImage(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public StaticImage() {
        this("", "");
    }
}

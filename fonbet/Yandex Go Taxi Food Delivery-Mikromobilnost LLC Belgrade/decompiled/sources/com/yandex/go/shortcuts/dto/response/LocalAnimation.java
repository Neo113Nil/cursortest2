package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/LocalAnimation;", "Lcom/yandex/go/shortcuts/dto/response/c;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/u", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LocalAnimation extends c {
    public static final u Companion = new u();
    public final String a;

    public /* synthetic */ LocalAnimation(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public static final /* synthetic */ void b(LocalAnimation localAnimation, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && jl40.l(localAnimation.a, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 0, localAnimation.a);
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalAnimation) && jl40.l(this.a, ((LocalAnimation) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("LocalAnimation(name=", this.a, Extension.C_BRAKE);
    }

    public LocalAnimation(String str) {
        this.a = str;
    }

    public LocalAnimation() {
        this("");
    }
}

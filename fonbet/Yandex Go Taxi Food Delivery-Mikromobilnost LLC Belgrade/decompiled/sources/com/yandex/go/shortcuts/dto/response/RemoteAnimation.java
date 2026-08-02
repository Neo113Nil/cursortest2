package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/RemoteAnimation;", "Lcom/yandex/go/shortcuts/dto/response/c;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/a2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RemoteAnimation extends c {
    public static final a2 Companion = new a2();
    public final String a;

    public /* synthetic */ RemoteAnimation(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public static final /* synthetic */ void b(RemoteAnimation remoteAnimation, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && jl40.l(remoteAnimation.a, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 0, remoteAnimation.a);
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemoteAnimation) && jl40.l(this.a, ((RemoteAnimation) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RemoteAnimation(url=", this.a, Extension.C_BRAKE);
    }

    public RemoteAnimation(String str) {
        this.a = str;
    }

    public RemoteAnimation() {
        this("");
    }
}

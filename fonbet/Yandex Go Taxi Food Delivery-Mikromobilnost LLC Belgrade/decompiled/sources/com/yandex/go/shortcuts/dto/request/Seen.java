package com.yandex.go.shortcuts.dto.request;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.w0q0;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/Seen;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/s", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Seen {
    public static final s Companion = new s();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(15))};
    public final String a;
    public final Status b;

    public /* synthetic */ Seen(int i, String str, Status status) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = Status.UNKNOWN;
        } else {
            this.b = status;
        }
    }

    public static final /* synthetic */ void b(Seen seen, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(seen.a, "")) {
            yjdVar.o(serialDescriptor, 0, seen.a);
        }
        if (!yjdVar.F() && seen.b == Status.UNKNOWN) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), seen.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Seen)) {
            return false;
        }
        Seen seen = (Seen) obj;
        return jl40.l(this.a, seen.a) && this.b == seen.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Seen(id=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }

    public Seen(String str, Status status) {
        this.a = str;
        this.b = status;
    }

    public Seen() {
        this("", Status.UNKNOWN);
    }
}

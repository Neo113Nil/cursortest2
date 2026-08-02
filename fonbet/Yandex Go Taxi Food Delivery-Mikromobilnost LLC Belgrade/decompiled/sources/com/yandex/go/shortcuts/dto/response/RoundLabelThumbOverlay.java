package com.yandex.go.shortcuts.dto.response;

import defpackage.cee0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/RoundLabelThumbOverlay;", "Lcom/yandex/go/shortcuts/dto/response/w2;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/b2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RoundLabelThumbOverlay extends w2 {
    public static final b2 Companion = new b2();
    public final int a;
    public final j0 b;
    public final String c;
    public final Title d;

    public RoundLabelThumbOverlay(int i, int i2, j0 j0Var, String str, Title title) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = c3.INSTANCE;
        } else {
            this.b = j0Var;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = new Title(0);
        } else {
            this.d = title;
        }
    }

    public static final void c(RoundLabelThumbOverlay roundLabelThumbOverlay, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || roundLabelThumbOverlay.a != 0) {
            yjdVar.A(0, roundLabelThumbOverlay.a, serialDescriptor);
        }
        if (yjdVar.F() || !jl40.l(roundLabelThumbOverlay.b, c3.INSTANCE)) {
            yjdVar.e(serialDescriptor, 1, cee0.e, roundLabelThumbOverlay.b);
        }
        if (yjdVar.F() || !jl40.l(roundLabelThumbOverlay.c, "")) {
            yjdVar.o(serialDescriptor, 2, roundLabelThumbOverlay.c);
        }
        if (!yjdVar.F() && jl40.l(roundLabelThumbOverlay.d, new Title(0))) {
            return;
        }
        yjdVar.e(serialDescriptor, 3, Title$$serializer.INSTANCE, roundLabelThumbOverlay.d);
    }

    @Override // com.yandex.go.shortcuts.dto.response.w2
    /* renamed from: a, reason: from getter */
    public final j0 getB() {
        return this.b;
    }

    @Override // com.yandex.go.shortcuts.dto.response.w2
    /* renamed from: b, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundLabelThumbOverlay)) {
            return false;
        }
        RoundLabelThumbOverlay roundLabelThumbOverlay = (RoundLabelThumbOverlay) obj;
        return this.a == roundLabelThumbOverlay.a && jl40.l(this.b, roundLabelThumbOverlay.b) && jl40.l(this.c, roundLabelThumbOverlay.c) && jl40.l(this.d, roundLabelThumbOverlay.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "RoundLabelThumbOverlay(tiltAngle=" + this.a + ", position=" + this.b + ", backgroundColor=" + this.c + ", title=" + this.d + Extension.C_BRAKE;
    }

    public RoundLabelThumbOverlay() {
        c3 c3Var = c3.INSTANCE;
        Title title = new Title(0);
        this.a = 0;
        this.b = c3Var;
        this.c = "";
        this.d = title;
    }
}

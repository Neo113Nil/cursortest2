package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/AnchoredPosition;", "Lcom/yandex/go/shortcuts/dto/response/j0;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AnchoredPosition extends j0 {
    public static final b Companion = new b();
    public final PointOnParent a;
    public final Anchor b;

    public AnchoredPosition(int i, PointOnParent pointOnParent, Anchor anchor) {
        this.a = (i & 1) == 0 ? new PointOnParent(0) : pointOnParent;
        if ((i & 2) == 0) {
            this.b = new Anchor(0);
        } else {
            this.b = anchor;
        }
    }

    public static final /* synthetic */ void a(AnchoredPosition anchoredPosition, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(anchoredPosition.a, new PointOnParent(0))) {
            yjdVar.e(serialDescriptor, 0, PointOnParent$$serializer.INSTANCE, anchoredPosition.a);
        }
        if (!yjdVar.F() && jl40.l(anchoredPosition.b, new Anchor(0))) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, Anchor$$serializer.INSTANCE, anchoredPosition.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredPosition)) {
            return false;
        }
        AnchoredPosition anchoredPosition = (AnchoredPosition) obj;
        return jl40.l(this.a, anchoredPosition.a) && jl40.l(this.b, anchoredPosition.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnchoredPosition(pointOnParent=" + this.a + ", anchor=" + this.b + Extension.C_BRAKE;
    }

    public AnchoredPosition() {
        PointOnParent pointOnParent = new PointOnParent(0);
        Anchor anchor = new Anchor(0);
        this.a = pointOnParent;
        this.b = anchor;
    }
}

package com.yandex.go.shortcuts.dto.request;

import defpackage.b0t;
import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.yjd;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/WayPoint;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/v", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WayPoint {
    public static final v Companion = new v();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(21)), null};
    public final WayType a;
    public final zzs b;

    public /* synthetic */ WayPoint(int i, WayType wayType, zzs zzsVar) {
        this.a = (i & 1) == 0 ? WayType.A : wayType;
        if ((i & 2) == 0) {
            this.b = new zzs(0.0d, 0.0d, 0, null, null, 24);
        } else {
            this.b = zzsVar;
        }
    }

    public static final /* synthetic */ void b(WayPoint wayPoint, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || wayPoint.a != WayType.A) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) c[0].getValue(), wayPoint.a);
        }
        if (!yjdVar.F() && jl40.l(wayPoint.b, new zzs(0.0d, 0.0d, 0, null, null, 24))) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, b0t.a, wayPoint.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WayPoint)) {
            return false;
        }
        WayPoint wayPoint = (WayPoint) obj;
        return this.a == wayPoint.a && jl40.l(this.b, wayPoint.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WayPoint(type=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }

    public WayPoint(WayType wayType, zzs zzsVar) {
        this.a = wayType;
        this.b = zzsVar;
    }

    public WayPoint() {
        this(WayType.A, new zzs(0.0d, 0.0d, 0, null, null, 24));
    }
}

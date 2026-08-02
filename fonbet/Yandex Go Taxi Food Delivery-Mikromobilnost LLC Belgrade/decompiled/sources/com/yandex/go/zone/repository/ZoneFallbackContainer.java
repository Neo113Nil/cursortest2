package com.yandex.go.zone.repository;

import defpackage.bd61;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.xvz;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/repository/ZoneFallbackContainer;", "", "Companion", "$serializer", "com/yandex/go/zone/repository/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ZoneFallbackContainer {
    public static final i Companion = new i();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bd61(3))};
    public final String a;
    public Map b;

    public /* synthetic */ ZoneFallbackContainer(int i, String str, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneFallbackContainer)) {
            return false;
        }
        ZoneFallbackContainer zoneFallbackContainer = (ZoneFallbackContainer) obj;
        return jl40.l(this.a, zoneFallbackContainer.a) && jl40.l(this.b, zoneFallbackContainer.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("ZoneFallbackContainer(userId=", this.a, ", zones=", Extension.C_BRAKE, this.b);
    }

    public ZoneFallbackContainer() {
        this(null, 3);
    }

    public ZoneFallbackContainer(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        Map f = kotlin.collections.b.f();
        this.a = str;
        this.b = f;
    }
}

package defpackage;

import com.yandex.go.superapp.discovery.map.api.SuperAppDiscoveryMapLayer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jtv0 implements ktv0 {
    public final String a;
    public final String b;
    public final float c;
    public final String d;
    public final String e;
    public final boolean f;
    public final SuperAppDiscoveryMapLayer g;
    public final rbh h;
    public final uh00 i;

    public jtv0(String str, String str2, float f, String str3, String str4, boolean z, SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer, rbh rbhVar, uh00 uh00Var) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = superAppDiscoveryMapLayer;
        this.h = rbhVar;
        this.i = uh00Var;
    }

    @Override // defpackage.ktv0
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ktv0
    public final float b() {
        return this.c;
    }

    @Override // defpackage.ktv0
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ktv0
    public final String d() {
        return this.d;
    }

    @Override // defpackage.ktv0
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtv0)) {
            return false;
        }
        jtv0 jtv0Var = (jtv0) obj;
        return jl40.l(this.a, jtv0Var.a) && jl40.l(this.b, jtv0Var.b) && Float.compare(this.c, jtv0Var.c) == 0 && jl40.l(this.d, jtv0Var.d) && jl40.l(this.e, jtv0Var.e) && this.f == jtv0Var.f && this.g == jtv0Var.g && jl40.l(this.h, jtv0Var.h) && jl40.l(this.i, jtv0Var.i);
    }

    @Override // defpackage.ktv0
    public final SuperAppDiscoveryMapLayer f() {
        return this.g;
    }

    @Override // defpackage.ktv0
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + unr0.e(unr0.b(unr0.b(g8e.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("V2(commonMapStyle=", this.a, ", mapStyle=", this.b, ", defaultMapZoom=");
        v.append(this.c);
        v.append(", locationPermissionRequestTitle=");
        v.append(this.d);
        v.append(", locationPermissionRequestBackButtonTitle=");
        tse0.y(this.e, ", explorerEnabled=", ", defaultLayer=", v, this.f);
        v.append(this.g);
        v.append(", flexContainerConfig=");
        v.append(this.h);
        v.append(", explorationConfig=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

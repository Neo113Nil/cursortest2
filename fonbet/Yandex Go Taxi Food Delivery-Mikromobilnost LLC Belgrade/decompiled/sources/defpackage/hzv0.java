package defpackage;

import com.yandex.go.superapp.discovery.map.impl.ui.model.v2.SuperAppDiscoveryMapFlexContainerState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hzv0 {
    public final SuperAppDiscoveryMapFlexContainerState a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final fto i;
    public final qto j;

    public hzv0(SuperAppDiscoveryMapFlexContainerState superAppDiscoveryMapFlexContainerState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, fto ftoVar, qto qtoVar) {
        this.a = superAppDiscoveryMapFlexContainerState;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = ftoVar;
        this.j = qtoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzv0)) {
            return false;
        }
        hzv0 hzv0Var = (hzv0) obj;
        return this.a == hzv0Var.a && this.b == hzv0Var.b && this.c == hzv0Var.c && this.d == hzv0Var.d && this.e == hzv0Var.e && this.f == hzv0Var.f && this.g == hzv0Var.g && this.h == hzv0Var.h && jl40.l(this.i, hzv0Var.i) && jl40.l(this.j, hzv0Var.j);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        fto ftoVar = this.i;
        int hashCode = (e + (ftoVar == null ? 0 : ftoVar.hashCode())) * 31;
        qto qtoVar = this.j;
        return hashCode + (qtoVar != null ? qtoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppDiscoveryMapV2UiState(flexContainerState=");
        sb.append(this.a);
        sb.append(", innerFlexVisible=");
        sb.append(this.b);
        sb.append(", floatingHeaderVisible=");
        nnm.v(", closeFilterVisible=", ", filterButtonVisible=", sb, this.c, this.d);
        nnm.v(", searchbarVisible=", ", statusBarBlurEnabled=", sb, this.e, this.f);
        nnm.v(", stateBarVisible=", ", gamificationButtonState=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", gamificationHeaderState=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}

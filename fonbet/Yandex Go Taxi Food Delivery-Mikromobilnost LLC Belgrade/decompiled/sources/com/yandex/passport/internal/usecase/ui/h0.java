package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ui.domik.BaseTrack;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;

/* loaded from: classes2.dex */
public final class h0 {
    public final BaseTrack a;
    public final String b;
    public final boolean c;
    public final wls d;
    public final tls e;
    public final tls f;
    public final tls g;

    public h0(BaseTrack baseTrack, String str, boolean z, wls wlsVar, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        this.a = baseTrack;
        this.b = str;
        this.c = z;
        this.d = wlsVar;
        this.e = tlsVar;
        this.f = tlsVar2;
        this.g = tlsVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return jl40.l(this.a, h0Var.a) && jl40.l(this.b, h0Var.b) && this.c == h0Var.c && this.d.equals(h0Var.d) && this.e.equals(h0Var.e) && this.f.equals(h0Var.f) && this.g.equals(h0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.g.hashCode() + ly3.a(ly3.a((this.d.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "Params(track=" + this.a + ", country=" + this.b + ", authBySms=" + this.c + ", onSmsRequested=" + this.d + ", onPhoneConfirmed=" + this.e + ", onError=" + this.f + ", onProgress=" + this.g + ')';
    }
}

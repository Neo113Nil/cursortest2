package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ui.domik.AuthTrack;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tls;
import defpackage.wls;

/* loaded from: classes2.dex */
public final class s0 {
    public final AuthTrack a;
    public final com.yandex.passport.internal.ui.domik.relogin.b b;
    public final tls c;
    public final tls d;
    public final wls e;

    public s0(AuthTrack authTrack, com.yandex.passport.internal.ui.domik.relogin.b bVar, tls tlsVar, tls tlsVar2, wls wlsVar) {
        this.a = authTrack;
        this.b = bVar;
        this.c = tlsVar;
        this.d = tlsVar2;
        this.e = wlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (jl40.l(this.a, s0Var.a) && this.b == s0Var.b && this.c.equals(s0Var.c) && this.d.equals(s0Var.d) && this.e.equals(s0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ly3.a(ly3.a((this.b.hashCode() + (this.a.hashCode() * 961)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "Params(authTrack=" + this.a + ", previewsTrackId=null, onCanAuthorizeBySms=" + this.b + ", onCanRegister=" + this.c + ", onSocialAuth=" + this.d + ", onError=" + this.e + ')';
    }
}

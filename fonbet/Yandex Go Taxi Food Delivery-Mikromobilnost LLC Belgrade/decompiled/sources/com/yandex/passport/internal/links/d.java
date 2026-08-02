package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.reporters.LinkHandlingReporter$UidFrom;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class d extends e {
    public final Uri e;
    public final ModernAccount f;
    public final String g;
    public final LinkHandlingReporter$UidFrom h;

    public d(Uri uri, ModernAccount modernAccount, String str, LinkHandlingReporter$UidFrom linkHandlingReporter$UidFrom) {
        super(uri, modernAccount, LinkMode.AUTH_QR_WITHOUT_QR, str);
        this.e = uri;
        this.f = modernAccount;
        this.g = str;
        this.h = linkHandlingReporter$UidFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.e, dVar.e) && jl40.l(this.f, dVar.f) && jl40.l(this.g, dVar.g) && this.h == dVar.h;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        ModernAccount modernAccount = this.f;
        int hashCode2 = (hashCode + (modernAccount == null ? 0 : modernAccount.hashCode())) * 31;
        String str = this.g;
        return this.h.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "QrWithoutQrSlider(uri=" + this.e + ", account=" + this.f + ", browserName=" + this.g + ", from=" + this.h + ')';
    }
}

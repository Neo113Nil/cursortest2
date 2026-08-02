package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;
import defpackage.u0p;

/* loaded from: classes10.dex */
public final class f extends ComplianceData.a {
    public u0p a;
    public ComplianceData.ProductIdOrigin b;

    public final g a() {
        return new g(this.a, this.b);
    }

    public final f b(u0p u0pVar) {
        this.a = u0pVar;
        return this;
    }

    public final f c(ComplianceData.ProductIdOrigin productIdOrigin) {
        this.b = productIdOrigin;
        return this;
    }
}

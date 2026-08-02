package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;
import defpackage.u0p;

/* loaded from: classes.dex */
public final class g extends ComplianceData {
    public final u0p a;
    public final ComplianceData.ProductIdOrigin b;

    public g(u0p u0pVar, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.a = u0pVar;
        this.b = productIdOrigin;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final u0p a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final ComplianceData.ProductIdOrigin b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        ComplianceData complianceData = (ComplianceData) obj;
        u0p u0pVar = this.a;
        if (u0pVar == null) {
            if (complianceData.a() != null) {
                return false;
            }
        } else if (!u0pVar.equals(complianceData.a())) {
            return false;
        }
        ComplianceData.ProductIdOrigin productIdOrigin = this.b;
        return productIdOrigin == null ? complianceData.b() == null : productIdOrigin.equals(complianceData.b());
    }

    public final int hashCode() {
        u0p u0pVar = this.a;
        int hashCode = ((u0pVar == null ? 0 : u0pVar.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.b;
        return hashCode ^ (productIdOrigin != null ? productIdOrigin.hashCode() : 0);
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}

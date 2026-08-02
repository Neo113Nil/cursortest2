package com.google.android.gms.maps.model;

import defpackage.a06;
import defpackage.cvw;
import defpackage.ny61;

/* loaded from: classes11.dex */
public final class CustomCap extends Cap {
    public final a06 bitmapDescriptor;
    public final float refWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(a06 a06Var, float f) {
        super(a06Var, f);
        cvw.m(a06Var, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            ny61.g("refWidth must be positive");
            throw null;
        }
        this.bitmapDescriptor = a06Var;
        this.refWidth = f;
    }

    @Override // com.google.android.gms.maps.model.Cap
    public String toString() {
        String valueOf = String.valueOf(this.bitmapDescriptor);
        float f = this.refWidth;
        StringBuilder sb = new StringBuilder(valueOf.length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }

    public CustomCap(a06 a06Var) {
        this(a06Var, 10.0f);
    }
}

package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import xsna.epx;
import xsna.ho8;

/* renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4881ha implements Parcelable {
    public static final C4855ga CREATOR = new C4855ga();
    public final Boolean a;
    public final IdentifierStatus b;
    public final String c;

    public C4881ha(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.a = bool;
        this.b = identifierStatus;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4881ha)) {
            return false;
        }
        C4881ha c4881ha = (C4881ha) obj;
        return epx.f(this.a, c4881ha.a) && this.b == c4881ha.b && epx.f(this.c, c4881ha.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeaturesInternal(sslPinning=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", errorExplanation=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeString(this.b.getValue());
        parcel.writeString(this.c);
    }

    public C4881ha() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}

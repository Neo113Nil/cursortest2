package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();
    public final C5380z a;
    public final H b;
    public final B c;

    public F(C5380z c5380z, H h, B b) {
        this.a = c5380z;
        this.b = h;
        this.c = b;
    }

    public final C5380z a() {
        return this.a;
    }

    public final B b() {
        return this.c;
    }

    public final H c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(k0 k0Var) {
        this(r2, r3, r5 != null ? new B(r5) : null);
        h0 a = k0Var.a();
        C5380z c5380z = a != null ? new C5380z(a) : null;
        l0 c = k0Var.c();
        H h = c != null ? new H(c) : null;
        i0 b = k0Var.b();
    }
}

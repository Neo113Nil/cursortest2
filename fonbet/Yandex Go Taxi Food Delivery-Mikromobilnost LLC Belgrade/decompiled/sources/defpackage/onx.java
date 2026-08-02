package defpackage;

import android.net.Uri;
import com.ybsdk.feature.kyc.internal.screens.photo.KycStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class onx {
    public final jnx a;
    public final KycStatus b;
    public final Uri c;
    public final boolean d;
    public final spx e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public onx(jnx jnxVar, KycStatus kycStatus, Uri uri, boolean z, spx spxVar, boolean z2, int i, boolean z3) {
        this.a = jnxVar;
        this.b = kycStatus;
        this.c = uri;
        this.d = z;
        this.e = spxVar;
        this.f = z2;
        this.g = i;
        this.h = z3;
    }

    public static onx a(onx onxVar, jnx jnxVar, KycStatus kycStatus, Uri uri, spx spxVar, boolean z, int i, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            jnxVar = onxVar.a;
        }
        jnx jnxVar2 = jnxVar;
        if ((i2 & 2) != 0) {
            kycStatus = onxVar.b;
        }
        KycStatus kycStatus2 = kycStatus;
        if ((i2 & 4) != 0) {
            uri = onxVar.c;
        }
        Uri uri2 = uri;
        boolean z3 = (i2 & 8) != 0 ? onxVar.d : true;
        if ((i2 & 16) != 0) {
            spxVar = onxVar.e;
        }
        spx spxVar2 = spxVar;
        if ((i2 & 32) != 0) {
            z = onxVar.f;
        }
        boolean z4 = z;
        if ((i2 & 64) != 0) {
            i = onxVar.g;
        }
        int i3 = i;
        boolean z5 = (i2 & 128) != 0 ? onxVar.h : z2;
        onxVar.getClass();
        return new onx(jnxVar2, kycStatus2, uri2, z3, spxVar2, z4, i3, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onx)) {
            return false;
        }
        onx onxVar = (onx) obj;
        return jl40.l(this.a, onxVar.a) && this.b == onxVar.b && jl40.l(this.c, onxVar.c) && this.d == onxVar.d && jl40.l(this.e, onxVar.e) && this.f == onxVar.f && this.g == onxVar.g && this.h == onxVar.h;
    }

    public final int hashCode() {
        jnx jnxVar = this.a;
        int hashCode = (jnxVar == null ? 0 : jnxVar.hashCode()) * 31;
        KycStatus kycStatus = this.b;
        int hashCode2 = (hashCode + (kycStatus == null ? 0 : kycStatus.hashCode())) * 31;
        Uri uri = this.c;
        int e = unr0.e((hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.d);
        spx spxVar = this.e;
        return Boolean.hashCode(this.h) + oyr.b(this.g, unr0.e((e + (spxVar != null ? spxVar.hashCode() : 0)) * 31, 31, this.f), 31);
    }

    public final String toString() {
        return "KycPhotoState(error=" + this.a + ", status=" + this.b + ", photoUri=" + this.c + ", cameraReady=" + this.d + ", currentStep=" + this.e + ", flashEnabled=" + this.f + ", rotationAngle=" + this.g + ", permissionGranted=" + this.h + Extension.C_BRAKE;
    }

    public /* synthetic */ onx(int i) {
        this(null, null, null, false, null, false, 0, true);
    }

    public onx() {
        this(0);
    }
}

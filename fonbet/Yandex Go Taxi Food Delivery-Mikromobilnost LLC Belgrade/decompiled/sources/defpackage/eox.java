package defpackage;

import android.net.Uri;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2State$Stage$Upload$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eox implements fox {
    public final KycPhotoV2State$Stage$Upload$Status a;
    public final Uri b;

    public eox(KycPhotoV2State$Stage$Upload$Status kycPhotoV2State$Stage$Upload$Status, Uri uri) {
        this.a = kycPhotoV2State$Stage$Upload$Status;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eox)) {
            return false;
        }
        eox eoxVar = (eox) obj;
        return this.a == eoxVar.a && jl40.l(this.b, eoxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Upload(status=" + this.a + ", photoUri=" + this.b + Extension.C_BRAKE;
    }
}

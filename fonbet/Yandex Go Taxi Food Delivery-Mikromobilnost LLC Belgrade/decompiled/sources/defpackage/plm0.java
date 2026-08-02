package defpackage;

import com.yandex.mobile.drive.scan.ScanMode$DriverLicense$LicenseSide;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class plm0 extends slm0 {
    public final ScanMode$DriverLicense$LicenseSide a;
    public final boolean b;

    public plm0(ScanMode$DriverLicense$LicenseSide scanMode$DriverLicense$LicenseSide, boolean z) {
        this.a = scanMode$DriverLicense$LicenseSide;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plm0)) {
            return false;
        }
        plm0 plm0Var = (plm0) obj;
        return this.a == plm0Var.a && this.b == plm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DriverLicense(side=" + this.a + ", preCheckPhoto=" + this.b + Extension.C_BRAKE;
    }
}

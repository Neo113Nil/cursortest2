package defpackage;

import com.yandex.mobile.drive.sdk.full.internal.DriveException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lzj0 extends pyj0 {
    public final DriveException a;

    public lzj0(DriveException driveException) {
        this.a = driveException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lzj0) && this.a == ((lzj0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResultError(e=" + this.a + Extension.C_BRAKE;
    }
}

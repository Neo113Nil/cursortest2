package defpackage;

import com.yandex.go.navigator.repository.ReportStatus$Error$ErrorType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dvq implements gvq {
    public final ReportStatus$Error$ErrorType a;
    public final String b;

    public dvq(ReportStatus$Error$ErrorType reportStatus$Error$ErrorType, String str) {
        this.a = reportStatus$Error$ErrorType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvq)) {
            return false;
        }
        dvq dvqVar = (dvq) obj;
        return this.a == dvqVar.a && jl40.l(this.b, dvqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackError(type=" + this.a + ", msg=" + this.b + Extension.C_BRAKE;
    }
}

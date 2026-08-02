package com.yandex.go.diagnostic_qr.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/diagnostic_qr/network/QrDiagnosticDataParam;", "", "Companion", "com/yandex/go/diagnostic_qr/network/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class QrDiagnosticDataParam {
    public static final a Companion = new a();
    public final String a;
    public final long b;
    public final String c;

    public /* synthetic */ QrDiagnosticDataParam(String str, String str2, int i, long j) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, QrDiagnosticDataParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrDiagnosticDataParam)) {
            return false;
        }
        QrDiagnosticDataParam qrDiagnosticDataParam = (QrDiagnosticDataParam) obj;
        return jl40.l(this.a, qrDiagnosticDataParam.a) && this.b == qrDiagnosticDataParam.b && jl40.l(this.c, qrDiagnosticDataParam.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return unr0.r(x4e.l("QrDiagnosticDataParam(localTime=", this.a, ", timestamp=", this.b), ", type=", this.c, Extension.C_BRAKE);
    }

    public QrDiagnosticDataParam(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }
}

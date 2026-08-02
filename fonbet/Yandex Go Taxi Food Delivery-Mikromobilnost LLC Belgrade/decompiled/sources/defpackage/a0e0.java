package defpackage;

import com.ybsdk.core.utils.poller.PollerEndpoint;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a0e0 extends q1e0 {
    public final String b;

    public a0e0(String str) {
        super(PollerEndpoint.DIV_DOWNLOADER);
        this.b = str;
    }

    @Override // defpackage.q1e0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0e0) && jl40.l(this.b, ((a0e0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("DivDownloader(urlPath=", this.b, Extension.C_BRAKE);
    }
}

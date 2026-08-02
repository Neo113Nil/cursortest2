package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.Locale;

/* compiled from: InstrumentDescriptor.java */
/* loaded from: classes8.dex */
public abstract class m8x {
    public final ngk0 a;
    public int b;

    public m8x() {
        this.a = !p2l.a ? f470.INSTANCE : new ook0(Thread.currentThread().getStackTrace());
    }

    public abstract String a();

    public abstract String b();

    public abstract InstrumentType c();

    public abstract String d();

    public abstract InstrumentValueType e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m8x)) {
            return false;
        }
        m8x m8xVar = (m8x) obj;
        return b().equalsIgnoreCase(m8xVar.b()) && a().equals(m8xVar.a()) && d().equals(m8xVar.d()) && c().equals(m8xVar.c()) && e().equals(m8xVar.e());
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((b().toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ a().hashCode()) * 1000003) ^ d().hashCode()) * 1000003) ^ c().hashCode()) * 1000003) ^ e().hashCode();
        this.b = hashCode;
        return hashCode;
    }
}

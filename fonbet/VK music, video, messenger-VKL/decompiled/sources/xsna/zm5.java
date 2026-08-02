package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;

/* compiled from: AutoValue_InstrumentSelector.java */
/* loaded from: classes8.dex */
public final class zm5 extends o8x {
    public final String a = "*";

    @Override // xsna.o8x
    public final String a() {
        return this.a;
    }

    @Override // xsna.o8x
    public final InstrumentType b() {
        return null;
    }

    @Override // xsna.o8x
    public final String c() {
        return null;
    }

    @Override // xsna.o8x
    public final String d() {
        return null;
    }

    @Override // xsna.o8x
    public final String e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o8x)) {
            return false;
        }
        o8x o8xVar = (o8x) obj;
        if (o8xVar.b() != null) {
            return false;
        }
        String str = this.a;
        if (str == null) {
            if (o8xVar.a() != null) {
                return false;
            }
        } else if (!str.equals(o8xVar.a())) {
            return false;
        }
        return o8xVar.c() == null && o8xVar.d() == null && o8xVar.f() == null && o8xVar.e() == null;
    }

    @Override // xsna.o8x
    public final String f() {
        return null;
    }

    public final int hashCode() {
        int i = 1000003 * 1000003;
        String str = this.a;
        return (i ^ (str == null ? 0 : str.hashCode())) * 1525764945;
    }
}

package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;

/* compiled from: AutoValue_InstrumentDescriptor.java */
/* loaded from: classes8.dex */
public final class ym5 extends m8x {
    public final String c;
    public final String d;
    public final String e;
    public final InstrumentType f;
    public final InstrumentValueType g;
    public final x41 h;

    public ym5(String str, String str2, String str3, InstrumentType instrumentType, InstrumentValueType instrumentValueType, x41 x41Var) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.d = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.e = str3;
        if (instrumentType == null) {
            throw new NullPointerException("Null type");
        }
        this.f = instrumentType;
        if (instrumentValueType == null) {
            throw new NullPointerException("Null valueType");
        }
        this.g = instrumentValueType;
        if (x41Var == null) {
            throw new NullPointerException("Null advice");
        }
        this.h = x41Var;
    }

    @Override // xsna.m8x
    public final String a() {
        return this.d;
    }

    @Override // xsna.m8x
    public final String b() {
        return this.c;
    }

    @Override // xsna.m8x
    public final InstrumentType c() {
        return this.f;
    }

    @Override // xsna.m8x
    public final String d() {
        return this.e;
    }

    @Override // xsna.m8x
    public final InstrumentValueType e() {
        return this.g;
    }

    public final String toString() {
        return "InstrumentDescriptor{name=" + this.c + ", description=" + this.d + ", unit=" + this.e + ", type=" + this.f + ", valueType=" + this.g + ", advice=" + this.h + "}";
    }
}

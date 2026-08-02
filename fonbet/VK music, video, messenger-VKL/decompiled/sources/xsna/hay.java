package xsna;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes.dex */
public final class hay extends b9y {
    public final Serializable b;

    public hay(Boolean bool) {
        bool.getClass();
        this.b = bool;
    }

    public static boolean m(hay hayVar) {
        Serializable serializable = hayVar.b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // xsna.b9y
    public final boolean d() {
        Serializable serializable = this.b;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(k());
    }

    @Override // xsna.b9y
    public final float e() {
        return this.b instanceof Number ? l().floatValue() : Float.parseFloat(k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hay.class != obj.getClass()) {
            return false;
        }
        hay hayVar = (hay) obj;
        Serializable serializable = hayVar.b;
        Serializable serializable2 = this.b;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m(this) && m(hayVar)) {
            return l().longValue() == hayVar.l().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        double doubleValue = l().doubleValue();
        double doubleValue2 = hayVar.l().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    @Override // xsna.b9y
    public final int f() {
        return this.b instanceof Number ? l().intValue() : Integer.parseInt(k());
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.b;
        if (serializable == null) {
            return 31;
        }
        if (m(this)) {
            doubleToLongBits = l().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(l().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // xsna.b9y
    public final long j() {
        return this.b instanceof Number ? l().longValue() : Long.parseLong(k());
    }

    @Override // xsna.b9y
    public final String k() {
        Serializable serializable = this.b;
        return serializable instanceof Number ? l().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final Number l() {
        Serializable serializable = this.b;
        return serializable instanceof String ? new LazilyParsedNumber((String) serializable) : (Number) serializable;
    }

    public hay(Number number) {
        number.getClass();
        this.b = number;
    }

    public hay(String str) {
        str.getClass();
        this.b = str;
    }

    @Override // xsna.b9y
    public final b9y c() {
        return this;
    }
}

package defpackage;

import androidx.datastore.preferences.PreferencesProto$Value$ValueCase;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.l;

/* loaded from: classes.dex */
public final class ane0 extends GeneratedMessageLite implements au10 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final ane0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile qf90 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ane0 ane0Var = new ane0();
        DEFAULT_INSTANCE = ane0Var;
        GeneratedMessageLite.m(ane0.class, ane0Var);
    }

    public static zme0 H() {
        return (zme0) ((l) DEFAULT_INSTANCE.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    public static void o(ane0 ane0Var, long j) {
        ane0Var.valueCase_ = 4;
        ane0Var.value_ = Long.valueOf(j);
    }

    public static void p(ane0 ane0Var, String str) {
        ane0Var.getClass();
        ane0Var.valueCase_ = 5;
        ane0Var.value_ = str;
    }

    public static void q(ane0 ane0Var, yme0 yme0Var) {
        ane0Var.getClass();
        ane0Var.value_ = yme0Var;
        ane0Var.valueCase_ = 6;
    }

    public static void r(ane0 ane0Var, double d) {
        ane0Var.valueCase_ = 7;
        ane0Var.value_ = Double.valueOf(d);
    }

    public static void s(ane0 ane0Var, ByteString byteString) {
        ane0Var.getClass();
        ane0Var.valueCase_ = 8;
        ane0Var.value_ = byteString;
    }

    public static void u(ane0 ane0Var, boolean z) {
        ane0Var.valueCase_ = 1;
        ane0Var.value_ = Boolean.valueOf(z);
    }

    public static void v(ane0 ane0Var, float f) {
        ane0Var.valueCase_ = 2;
        ane0Var.value_ = Float.valueOf(f);
    }

    public static void w(ane0 ane0Var, int i) {
        ane0Var.valueCase_ = 3;
        ane0Var.value_ = Integer.valueOf(i);
    }

    public static ane0 z() {
        return DEFAULT_INSTANCE;
    }

    public final double A() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float B() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int C() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long D() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String E() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final yme0 F() {
        return this.valueCase_ == 6 ? (yme0) this.value_ : yme0.q();
    }

    public final PreferencesProto$Value$ValueCase G() {
        switch (this.valueCase_) {
            case 0:
                return PreferencesProto$Value$ValueCase.VALUE_NOT_SET;
            case 1:
                return PreferencesProto$Value$ValueCase.BOOLEAN;
            case 2:
                return PreferencesProto$Value$ValueCase.FLOAT;
            case 3:
                return PreferencesProto$Value$ValueCase.INTEGER;
            case 4:
                return PreferencesProto$Value$ValueCase.LONG;
            case 5:
                return PreferencesProto$Value$ValueCase.STRING;
            case 6:
                return PreferencesProto$Value$ValueCase.STRING_SET;
            case 7:
                return PreferencesProto$Value$ValueCase.DOUBLE;
            case 8:
                return PreferencesProto$Value$ValueCase.BYTES;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        qf90 qf90Var;
        switch (tme0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ane0();
            case 2:
                return new zme0(DEFAULT_INSTANCE);
            case 3:
                return new v9i0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", yme0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                qf90 qf90Var2 = PARSER;
                if (qf90Var2 != null) {
                    return qf90Var2;
                }
                synchronized (ane0.class) {
                    try {
                        qf90Var = PARSER;
                        if (qf90Var == null) {
                            qf90Var = new pxs(DEFAULT_INSTANCE);
                            PARSER = qf90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return qf90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    public final boolean x() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final ByteString y() {
        return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.a;
    }
}

package xsna;

import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import kotlin.NotImplementedError;
import org.json.JSONObject;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessageNeverUsedFormatException;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.b;
import org.msgpack.core.buffer.InputStreamBufferInput;
import org.msgpack.value.ValueType;

/* compiled from: MsgPackToJSONObjectConverter.kt */
/* loaded from: classes3.dex */
public final class pn30 {
    public final boolean a;

    /* compiled from: MsgPackToJSONObjectConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ValueType.values().length];
            try {
                iArr[ValueType.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValueType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValueType.ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ValueType.MAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MessageFormat.values().length];
            try {
                iArr2[MessageFormat.INT8.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MessageFormat.UINT8.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MessageFormat.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MessageFormat.UINT16.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MessageFormat.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MessageFormat.POSFIXINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MessageFormat.NEGFIXINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public pn30(boolean z) {
        this.a = (!z || in30.b == null || jn30.c == null) ? false : true;
    }

    public static Object b(org.msgpack.core.d dVar) {
        double d;
        MessageFormat n = dVar.n();
        if (n != null) {
            ValueType h = n.h();
            int i = 0;
            switch (h == null ? -1 : a.$EnumSwitchMapping$0[h.ordinal()]) {
                case 1:
                    byte readByte = dVar.readByte();
                    if (readByte != -64) {
                        throw org.msgpack.core.d.w("Nil", readByte);
                    }
                    break;
                case 2:
                    return Boolean.valueOf(dVar.y());
                case 3:
                    switch (a.$EnumSwitchMapping$1[n.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            try {
                                return Integer.valueOf(dVar.z());
                            } catch (MessageIntegerOverflowException e) {
                                BigInteger d2 = e.d();
                                if (d2.bitLength() <= 63) {
                                    return Long.valueOf(d2.longValue());
                                }
                                throw new ArithmeticException("BigInteger out of long range");
                            }
                        default:
                            long A = dVar.A();
                            return (-2147483648L > A || A > 2147483647L) ? Long.valueOf(A) : Integer.valueOf((int) A);
                    }
                case 4:
                    byte readByte2 = dVar.readByte();
                    if (readByte2 == -54) {
                        d = dVar.q(4).getFloat(dVar.l);
                    } else {
                        if (readByte2 != -53) {
                            throw org.msgpack.core.d.w("Float", readByte2);
                        }
                        d = dVar.q(8).getDouble(dVar.l);
                    }
                    return Double.valueOf(d);
                case 5:
                    byte[] t = dVar.t(dVar.H());
                    try {
                        try {
                            return kn30.c(t);
                        } catch (MessageStringCodingException unused) {
                            return org.msgpack.core.b.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(ByteBuffer.wrap(t).asReadOnlyBuffer()).toString();
                        }
                    } catch (CharacterCodingException e2) {
                        throw new MessageStringCodingException(e2);
                    }
                case 6:
                    int x = dVar.x();
                    in30 in30Var = new in30(x);
                    while (i < x) {
                        in30Var.b(b(dVar));
                        i++;
                    }
                    return in30Var;
                case 7:
                    int E = dVar.E();
                    jn30 jn30Var = new jn30(E);
                    while (i < E * 2) {
                        Object b = b(dVar);
                        Object b2 = b(dVar);
                        i += 2;
                        if (!(b instanceof String) && !(b instanceof Number) && !(b instanceof Boolean)) {
                            StringBuilder sb = new StringBuilder("Unknown key type ");
                            sb.append(b != null ? b.getClass() : null);
                            sb.append(" for value '");
                            sb.append(b);
                            sb.append('\'');
                            throw new MessageNeverUsedFormatException(sb.toString());
                        }
                        jn30Var.b(b2, b.toString());
                    }
                    return jn30Var;
                default:
                    throw new MessageNeverUsedFormatException("Unknown value type");
            }
        }
        return null;
    }

    public final JSONObject a(InputStream inputStream) {
        org.msgpack.core.d dVar;
        jn30 jn30Var;
        if (this.a) {
            b.c cVar = org.msgpack.core.b.c;
            dVar = new org.msgpack.core.d(new InputStreamBufferInput(inputStream, cVar.g), cVar);
            try {
                if (dVar.m()) {
                    Object b = b(dVar);
                    jn30Var = b instanceof jn30 ? (jn30) b : null;
                    if (jn30Var == null) {
                        StringBuilder sb = new StringBuilder("Unsupported value type:");
                        sb.append(b != null ? b.getClass() : null);
                        sb.append(" value:");
                        sb.append(b);
                        throw new NotImplementedError(sb.toString());
                    }
                } else {
                    jn30Var = new jn30((Object) null);
                }
                dVar.close();
                return jn30Var;
            } finally {
            }
        } else {
            b.c cVar2 = org.msgpack.core.b.c;
            dVar = new org.msgpack.core.d(new InputStreamBufferInput(inputStream, cVar2.g), cVar2);
            try {
                re J = dVar.J();
                if (J.h() == ValueType.MAP) {
                    JSONObject a2 = kn30.a(J.d());
                    dVar.close();
                    return a2;
                }
                throw new NotImplementedError("Unsupported value type:" + J.h().name() + " value:" + J.toJson());
            } finally {
            }
        }
    }
}

package ru.ok.proto.rtmp.amf;

import java.nio.ByteBuffer;
import java.util.Map;
import ru.ok.proto.rtmp.ProtocolException;
import ru.ok.proto.rtmp.amf.entries.AmfBool;
import ru.ok.proto.rtmp.amf.entries.AmfEcmaArray;
import ru.ok.proto.rtmp.amf.entries.AmfNull;
import ru.ok.proto.rtmp.amf.entries.AmfNumber;
import ru.ok.proto.rtmp.amf.entries.AmfObject;
import ru.ok.proto.rtmp.amf.entries.AmfString;
import xsna.lhg;
import xsna.wr;

/* loaded from: classes9.dex */
public class AmfUtil {
    public static AmfEntry createByType(byte b) {
        if (b == 0) {
            return new AmfNumber();
        }
        if (b == 1) {
            return new AmfBool();
        }
        if (b == 2) {
            return new AmfString();
        }
        if (b == 3) {
            return new AmfObject();
        }
        if (b != 5) {
            return null;
        }
        return new AmfNull();
    }

    public static AmfEcmaArray readECMAArray(ByteBuffer byteBuffer) throws ProtocolException {
        byte b = byteBuffer.get();
        if (5 == b || b != 8) {
            return null;
        }
        AmfEcmaArray amfEcmaArray = new AmfEcmaArray();
        amfEcmaArray.deserialize(byteBuffer);
        return amfEcmaArray;
    }

    public static Double readNumber(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        if (5 != b && b == 0) {
            return Double.valueOf(AmfNumber.deserializeStatic(byteBuffer));
        }
        return null;
    }

    public static AmfObject readObject(ByteBuffer byteBuffer) throws ProtocolException {
        byte b = byteBuffer.get();
        if (5 == b || b != 3) {
            return null;
        }
        AmfObject amfObject = new AmfObject();
        amfObject.deserialize(byteBuffer);
        return amfObject;
    }

    public static String readString(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        if (5 != b && b == 2) {
            return AmfString.deserializeStatic(byteBuffer);
        }
        return null;
    }

    private static void skipBytes(ByteBuffer byteBuffer, int i) {
        wr.c(i, byteBuffer);
    }

    public static void skipEntry(ByteBuffer byteBuffer) throws ProtocolException {
        if (byteBuffer.remaining() < 1) {
            return;
        }
        skipEntry(byteBuffer.get(), byteBuffer);
    }

    private static void skipN(ByteBuffer byteBuffer, int i) throws ProtocolException {
        for (int i2 = 0; i2 < i && byteBuffer.remaining() > 0; i2++) {
            skipEntry(byteBuffer.get(), byteBuffer);
        }
    }

    private static void skipTillObjectEnd(ByteBuffer byteBuffer, int i) throws ProtocolException {
        while (byteBuffer.remaining() > 0) {
            skipEntry((byte) 2, byteBuffer);
            if (byteBuffer.remaining() <= 0) {
                return;
            }
            byte b = byteBuffer.get();
            if (9 == b && i == 0) {
                return;
            } else {
                skipEntry(b, byteBuffer);
            }
        }
    }

    public static AmfEntry toAmf(Object obj) {
        if (obj instanceof AmfEntry) {
            return (AmfEntry) obj;
        }
        if (obj instanceof String) {
            return new AmfString((String) obj);
        }
        if (obj instanceof Integer) {
            return new AmfNumber(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return new AmfNumber(((Long) obj).longValue());
        }
        if (obj instanceof Float) {
            return new AmfNumber(((Float) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new AmfNumber(((Double) obj).doubleValue());
        }
        if (obj instanceof Map) {
            return new AmfEcmaArray((Map) obj);
        }
        if (obj instanceof Boolean) {
            return new AmfBool(((Boolean) obj).booleanValue());
        }
        return null;
    }

    public static void skipEntry(byte b, ByteBuffer byteBuffer) throws ProtocolException {
        if (b == 0) {
            skipBytes(byteBuffer, 8);
            return;
        }
        if (b == 1) {
            skipBytes(byteBuffer, 1);
            return;
        }
        if (b == 2) {
            skipBytes(byteBuffer, 65535 & byteBuffer.getShort());
            return;
        }
        if (b == 3) {
            skipTillObjectEnd(byteBuffer, 0);
            return;
        }
        if (b != 5) {
            switch (b) {
                case 8:
                    if (byteBuffer.remaining() >= 4) {
                        int i = byteBuffer.getInt();
                        if (i > 0) {
                            skipTillObjectEnd(byteBuffer, i);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Incomplete ECMA array");
                case 9:
                    return;
                case 10:
                    if (byteBuffer.remaining() >= 4) {
                        int i2 = byteBuffer.getInt();
                        if (i2 > 0) {
                            skipN(byteBuffer, i2);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Incomplete AMF array");
                default:
                    throw new ProtocolException(lhg.a(b, "AMF: Unexpected type:"));
            }
        }
    }
}

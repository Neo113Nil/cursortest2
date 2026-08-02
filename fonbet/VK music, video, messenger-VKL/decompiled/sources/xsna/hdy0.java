package xsna;

import java.util.regex.Pattern;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: ByteUtils.java */
/* loaded from: classes8.dex */
public final class hdy0 {
    static {
        Pattern.compile("\\p{XDigit}+");
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != length; i++) {
            byte b = bArr[i];
            stringBuffer.append("0123456789abcdef".charAt((b & 255) >> 4));
            stringBuffer.append("0123456789abcdef".charAt(b & AmfConstants.TYPE_XML_DOCUMENT_MARKER));
        }
        return stringBuffer.toString();
    }
}

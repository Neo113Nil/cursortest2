package xsna;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.ImageSizeKey;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: MD5.kt */
/* loaded from: classes17.dex */
public final class tb00 {
    public static final tb00 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final char[] c;
    public static final wqo0 d;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(tb00.class, "tmpBuilder", "getTmpBuilder()Ljava/lang/StringBuilder;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new tb00();
        c = new char[]{ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        d = new wqo0(new c6(15));
    }

    public static final String a(String str) {
        tb00 tb00Var = a;
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(Charset.forName(C.UTF8_NAME)));
            tb00Var.getClass();
            b().setLength(0);
            for (byte b2 : digest) {
                StringBuilder b3 = b();
                char[] cArr = c;
                b3.append(cArr[(b2 & 240) >> 4]);
                b().append(cArr[b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER]);
            }
            return b().toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static StringBuilder b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = d;
        wqo0Var.getClass();
        return (StringBuilder) wqo0Var.get();
    }
}

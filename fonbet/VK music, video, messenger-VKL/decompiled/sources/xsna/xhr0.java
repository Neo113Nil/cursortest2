package xsna;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.ImageSizeKey;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: VKUtils.kt */
/* loaded from: classes.dex */
public final class xhr0 {

    /* compiled from: VKUtils.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ qcy<Object>[] b;
        public static final char[] c;
        public static final zqo0 d;

        static {
            PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "tmpBuilder", "getTmpBuilder()Ljava/lang/StringBuilder;", 0);
            fpf0.a.getClass();
            b = new qcy[]{propertyReference1Impl};
            a = new a();
            c = new char[]{ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            d = new zqo0(new g9l0(2));
        }

        public static final String a(String str) {
            a aVar = a;
            try {
                byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(Charset.forName(C.UTF8_NAME)));
                aVar.getClass();
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

        /* JADX WARN: Multi-variable type inference failed */
        public static StringBuilder b() {
            qcy<Object> qcyVar = b[0];
            return (StringBuilder) d.b.get();
        }
    }

    public static final HashMap a(String str) {
        if (str == null) {
            return null;
        }
        List c0 = drm0.c0(str, new String[]{"&"}, 0, 6);
        HashMap hashMap = new HashMap(c0.size());
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            List c02 = drm0.c0((String) it.next(), new String[]{"="}, 0, 6);
            if (c02.size() > 1) {
                hashMap.put(c02.get(0), c02.get(1));
            }
        }
        return hashMap;
    }

    public static final boolean b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final String c(String str) {
        if (str == null) {
            return "";
        }
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (32 > codePointAt || codePointAt >= 127) {
                vl8 vl8Var = new vl8();
                vl8Var.Q(0, i, str);
                while (i < str.length()) {
                    int codePointAt2 = str.codePointAt(i);
                    vl8Var.T((32 > codePointAt2 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i += Character.charCount(codePointAt2);
                }
                return vl8Var.x();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }
}

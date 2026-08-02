package defpackage;

import io.flutter.plugins.webviewflutter.ConsoleMessageLevel;
import io.flutter.plugins.webviewflutter.FileChooserMode;
import io.flutter.plugins.webviewflutter.MixedContentMode;
import io.flutter.plugins.webviewflutter.OverScrollMode;
import io.flutter.plugins.webviewflutter.SslErrorType;
import java.nio.ByteBuffer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class ld2 extends vzt0 {
    @Override // defpackage.vzt0
    public Object f(byte b, ByteBuffer byteBuffer) {
        int i = 0;
        if (b == -127) {
            Long l = (Long) e(byteBuffer);
            if (l == null) {
                return null;
            }
            int longValue = (int) l.longValue();
            FileChooserMode.Companion.getClass();
            FileChooserMode[] values = FileChooserMode.values();
            int length = values.length;
            while (i < length) {
                FileChooserMode fileChooserMode = values[i];
                if (fileChooserMode.getRaw() == longValue) {
                    return fileChooserMode;
                }
                i++;
            }
            return null;
        }
        if (b == -126) {
            Long l2 = (Long) e(byteBuffer);
            if (l2 == null) {
                return null;
            }
            int longValue2 = (int) l2.longValue();
            ConsoleMessageLevel.Companion.getClass();
            ConsoleMessageLevel[] values2 = ConsoleMessageLevel.values();
            int length2 = values2.length;
            while (i < length2) {
                ConsoleMessageLevel consoleMessageLevel = values2[i];
                if (consoleMessageLevel.getRaw() == longValue2) {
                    return consoleMessageLevel;
                }
                i++;
            }
            return null;
        }
        if (b == -125) {
            Long l3 = (Long) e(byteBuffer);
            if (l3 == null) {
                return null;
            }
            int longValue3 = (int) l3.longValue();
            OverScrollMode.Companion.getClass();
            OverScrollMode[] values3 = OverScrollMode.values();
            int length3 = values3.length;
            while (i < length3) {
                OverScrollMode overScrollMode = values3[i];
                if (overScrollMode.getRaw() == longValue3) {
                    return overScrollMode;
                }
                i++;
            }
            return null;
        }
        if (b == -124) {
            Long l4 = (Long) e(byteBuffer);
            if (l4 == null) {
                return null;
            }
            int longValue4 = (int) l4.longValue();
            SslErrorType.Companion.getClass();
            SslErrorType[] values4 = SslErrorType.values();
            int length4 = values4.length;
            while (i < length4) {
                SslErrorType sslErrorType = values4[i];
                if (sslErrorType.getRaw() == longValue4) {
                    return sslErrorType;
                }
                i++;
            }
            return null;
        }
        if (b != -123) {
            return super.f(b, byteBuffer);
        }
        Long l5 = (Long) e(byteBuffer);
        if (l5 == null) {
            return null;
        }
        int longValue5 = (int) l5.longValue();
        MixedContentMode.Companion.getClass();
        MixedContentMode[] values5 = MixedContentMode.values();
        int length5 = values5.length;
        while (i < length5) {
            MixedContentMode mixedContentMode = values5[i];
            if (mixedContentMode.getRaw() == longValue5) {
                return mixedContentMode;
            }
            i++;
        }
        return null;
    }

    @Override // defpackage.vzt0
    public void k(ckn cknVar, Object obj) {
        if (obj instanceof FileChooserMode) {
            cknVar.write(HProv.PP_SECURITY_LEVEL);
            k(cknVar, Long.valueOf(((FileChooserMode) obj).getRaw()));
            return;
        }
        if (obj instanceof ConsoleMessageLevel) {
            cknVar.write(130);
            k(cknVar, Long.valueOf(((ConsoleMessageLevel) obj).getRaw()));
            return;
        }
        if (obj instanceof OverScrollMode) {
            cknVar.write(HProv.PP_FAST_CODE);
            k(cknVar, Long.valueOf(((OverScrollMode) obj).getRaw()));
        } else if (obj instanceof SslErrorType) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION);
            k(cknVar, Long.valueOf(((SslErrorType) obj).getRaw()));
        } else if (!(obj instanceof MixedContentMode)) {
            super.k(cknVar, obj);
        } else {
            cknVar.write(HProv.PP_ENUM_CONTAINER_EXTENSION);
            k(cknVar, Long.valueOf(((MixedContentMode) obj).getRaw()));
        }
    }
}

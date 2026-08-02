package xsna;

import com.vk.dto.common.ImageSizeKey;
import io.opentelemetry.api.common.ValueType;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: JsonEncoding.java */
/* loaded from: classes8.dex */
public final class h9y {
    public static final char[] a = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* compiled from: JsonEncoding.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ValueType.values().length];
            a = iArr;
            try {
                iArr[ValueType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ValueType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ValueType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ValueType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ValueType.ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ValueType.KEY_VALUE_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ValueType.BYTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ValueType.EMPTY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static void a(StringBuilder sb, ljr0<?> ljr0Var) {
        int i = 0;
        switch (a.a[ljr0Var.getType().ordinal()]) {
            case 1:
                b((String) ljr0Var.getValue(), sb);
                break;
            case 2:
                sb.append(ljr0Var.getValue());
                break;
            case 3:
                double doubleValue = ((Double) ljr0Var.getValue()).doubleValue();
                if (!Double.isNaN(doubleValue)) {
                    if (!Double.isInfinite(doubleValue)) {
                        sb.append(doubleValue);
                        break;
                    } else {
                        sb.append(doubleValue > ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? "\"Infinity\"" : "\"-Infinity\"");
                        break;
                    }
                } else {
                    sb.append("\"NaN\"");
                    break;
                }
            case 4:
                sb.append(ljr0Var.getValue());
                break;
            case 5:
                List list = (List) ljr0Var.getValue();
                sb.append('[');
                while (i < list.size()) {
                    if (i > 0) {
                        sb.append(',');
                    }
                    a(sb, (ljr0) list.get(i));
                    i++;
                }
                sb.append(']');
                break;
            case 6:
                List list2 = (List) ljr0Var.getValue();
                sb.append('{');
                while (i < list2.size()) {
                    if (i > 0) {
                        sb.append(',');
                    }
                    iey ieyVar = (iey) list2.get(i);
                    b(ieyVar.getKey(), sb);
                    sb.append(':');
                    a(sb, ieyVar.getValue());
                    i++;
                }
                sb.append('}');
                break;
            case 7:
                ByteBuffer byteBuffer = (ByteBuffer) ljr0Var.getValue();
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                sb.append('\"');
                sb.append(Base64.getEncoder().encodeToString(bArr));
                sb.append('\"');
                break;
            case 8:
                sb.append("null");
                break;
        }
    }

    public static void b(String str, StringBuilder sb) {
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                sb.append("\\f");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    default:
                        if (charAt < ' ') {
                            sb.append("\\u");
                            char[] cArr = a;
                            sb.append(cArr[(charAt >> '\f') & 15]);
                            sb.append(cArr[(charAt >> '\b') & 15]);
                            sb.append(cArr[(charAt >> 4) & 15]);
                            sb.append(cArr[charAt & 15]);
                            break;
                        } else {
                            sb.append(charAt);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        sb.append('\"');
    }
}

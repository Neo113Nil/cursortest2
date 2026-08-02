package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: RtspParser.java */
/* loaded from: classes3.dex */
public final class vqg0 {
    public static final Pattern f = Pattern.compile("RTSP\\/1.0\\s+(\\d\\d\\d)\\s+(.+)");
    public static final Pattern g = Pattern.compile("(\\S+):\\s+(.*)");
    public int a;
    public b b;
    public int c;
    public Boolean d;
    public HashMap<String, String> e;

    /* compiled from: RtspParser.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.INTERLEAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.STATUS_LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.HDR_LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RtspParser.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BODY;
        public static final b HDR_LINE;
        public static final b INTERLEAVED;
        public static final b STATUS_LINE;

        static {
            b bVar = new b("INTERLEAVED", 0);
            INTERLEAVED = bVar;
            b bVar2 = new b("STATUS_LINE", 1);
            STATUS_LINE = bVar2;
            b bVar3 = new b("HDR_LINE", 2);
            HDR_LINE = bVar3;
            b bVar4 = new b("BODY", 3);
            BODY = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static int a(int i, int i2, StringBuilder sb, byte[] bArr) {
        Boolean bool = Boolean.FALSE;
        while (i < i2) {
            if (bool.booleanValue() && bArr[i] == 10) {
                return sb.length() + 2;
            }
            bool = Boolean.FALSE;
            byte b2 = bArr[i];
            if (b2 == 13) {
                bool = Boolean.TRUE;
            } else {
                sb.append((char) b2);
            }
            i++;
        }
        return -1;
    }

    public final void b(String str, String str2) {
        for (String str3 : str2.split(StringUtils.COMMA)) {
            int indexOf = str3.indexOf("=");
            if (indexOf != -1) {
                String trim = str3.substring(0, indexOf).trim();
                if (trim.length() != 0) {
                    this.e.put((str + "-" + trim).toUpperCase().toUpperCase(), str3.substring(indexOf + 1).replace("\"", "").trim());
                }
            }
        }
    }
}

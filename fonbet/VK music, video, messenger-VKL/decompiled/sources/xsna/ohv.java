package xsna;

import org.chromium.base.version_info.VersionConstants;

/* compiled from: HtmlEscapeUtil.java */
/* loaded from: classes8.dex */
public final class ohv {
    public static final char[] a;
    public static final char[] b;

    static {
        "&#".toCharArray();
        "&#x".toCharArray();
        a = "0123456789ABCDEF".toCharArray();
        b = "0123456789abcdef".toCharArray();
    }

    public static int a(int i, int i2, int i3, String str) {
        int i4 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            int i5 = 0;
            while (true) {
                char[] cArr = a;
                if (i5 >= cArr.length) {
                    i5 = -1;
                    break;
                }
                if (charAt == cArr[i5] || charAt == b[i5]) {
                    break;
                }
                i5++;
            }
            int i6 = i4 * i3;
            if (i6 < 0 || (i4 = i6 + i5) < 0) {
                return 65533;
            }
            i++;
        }
        return i4;
    }

    public static int b(int i) {
        if (i == 0) {
            return 65533;
        }
        if (i == 128) {
            return 8364;
        }
        if (i == 142) {
            return 381;
        }
        if (i == 158) {
            return 382;
        }
        if (i == 159) {
            return 376;
        }
        switch (i) {
            case 130:
                break;
            case MRAID_JS_WRITE_FAILED_VALUE:
                break;
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                break;
            case OMSDK_JS_WRITE_FAILED_VALUE:
                break;
            case 134:
                break;
            case 135:
                break;
            case PRIVACY_URL_ERROR_VALUE:
                break;
            case TPAT_RETRY_FAILED_VALUE:
                break;
            case 138:
                break;
            case 139:
                break;
            case VersionConstants.PRODUCT_MAJOR_VERSION /* 140 */:
                break;
            default:
                switch (i) {
                    case 145:
                        break;
                    case 146:
                        break;
                    case 147:
                        break;
                    case 148:
                        break;
                    case 149:
                        break;
                    case 150:
                        break;
                    case 151:
                        break;
                    case 152:
                        break;
                    case 153:
                        break;
                    case 154:
                        break;
                    case 155:
                        break;
                    case 156:
                        break;
                    default:
                        if ((i < 55296 || i > 57343) && i <= 1114111) {
                        }
                        break;
                }
        }
        return 65533;
    }
}

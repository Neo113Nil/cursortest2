package xsna;

import com.vk.dto.common.ImageSizeKey;

/* compiled from: FastVideoTimeFormatter.kt */
/* loaded from: classes8.dex */
public final class emq {
    public static final bpn0 a = new bpn0(new wv0(14));
    public static final StringBuilder b = new StringBuilder(10);

    public static String a(int i) {
        boolean z = i < 0;
        int abs = Math.abs(i);
        int i2 = abs % 60;
        int i3 = abs / 60;
        int i4 = i3 % 60;
        int i5 = i3 / 60;
        StringBuilder sb = b;
        sb.setLength(0);
        if (z) {
            sb.append('-');
        }
        if (i5 > 0) {
            sb.append(i5);
            sb.append(':');
        }
        if (i4 < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(i4);
        sb.append(':');
        if (i2 < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(i2);
        return sb.toString();
    }
}

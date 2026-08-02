package yads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes10.dex */
public final class g43 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public g43(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static g43 a(String str) {
        char c;
        if (!str.startsWith("Format:")) {
            throw new IllegalArgumentException();
        }
        String[] split = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String a = ki.a(split[i5].trim());
            a.getClass();
            switch (a.hashCode()) {
                case 100571:
                    if (a.equals(TtmlNode.END)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (a.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (a.equals("start")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (a.equals(TtmlNode.TAG_STYLE)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = i5;
                    break;
                case 1:
                    i4 = i5;
                    break;
                case 2:
                    i = i5;
                    break;
                case 3:
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new g43(i, i2, i3, i4, split.length);
    }
}

package xsna;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.List;

/* compiled from: Pixel.java */
/* loaded from: classes8.dex */
public abstract class zpa0 {
    public final List<String> a;
    public final int b;

    @NonNull
    public final List<Object> c = Collections.EMPTY_LIST;

    public zpa0(List<String> list, int i) {
        this.a = list;
        this.b = i;
    }

    public final String a() {
        switch (this.b) {
            case 0:
                return "START";
            case 1:
                return "LOAD";
            case 2:
                return "FIRST_FRAME";
            case 3:
                return "COMPLETE";
            case 4:
                return "STOP";
            case 5:
                return "PAUSE";
            case 6:
                return "RESUME";
            case 7:
                return "HEARTBEAT";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (String str : this.a) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(']');
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContentPixel{urls=");
        sb.append(b());
        sb.append(", type=");
        sb.append(a());
        sb.append(", meta= ");
        return ms9.a('}', sb, this.c);
    }
}

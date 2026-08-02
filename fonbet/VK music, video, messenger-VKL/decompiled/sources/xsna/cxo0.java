package xsna;

import io.jsonwebtoken.JwtParser;
import java.util.HashMap;

/* compiled from: TimelineTimeFormatter.kt */
/* loaded from: classes18.dex */
public final class cxo0 {
    public static final StringBuilder a = new StringBuilder();
    public static final HashMap<Long, String> b = new HashMap<>();

    public static String a(long j, boolean z, boolean z2) {
        long j2 = j / 60000;
        long j3 = (j / 1000) % 60;
        StringBuilder sb = a;
        sb.setLength(0);
        if (z2) {
            sb.append(" / ");
        }
        sb.append(j2);
        sb.append(':');
        if (j3 <= 9) {
            sb.append(0);
        }
        sb.append(j3);
        if (z) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append((j % 1000) / 100);
        }
        return sb.toString();
    }

    public static String b(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap<Long, String> hashMap = b;
        String str = hashMap.get(valueOf);
        if (str != null) {
            return str;
        }
        long j2 = j / 60000;
        long j3 = (j / 1000) % 60;
        long j4 = (j % 1000) / 10;
        if (j == 0) {
            return "0с";
        }
        StringBuilder sb = a;
        sb.setLength(0);
        if (j2 > 0) {
            sb.append(j2);
            sb.append((char) 1084);
        }
        if (j3 > 0 || j4 > 0) {
            sb.append(j3);
        }
        if (j4 > 0) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(j4);
        }
        if (j3 > 0 || j4 > 0) {
            sb.append((char) 1089);
        }
        String sb2 = sb.toString();
        hashMap.put(Long.valueOf(j), sb2);
        return sb2;
    }
}

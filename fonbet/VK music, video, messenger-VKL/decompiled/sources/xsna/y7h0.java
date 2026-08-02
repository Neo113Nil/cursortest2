package xsna;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: ScheduledUtils.kt */
/* loaded from: classes7.dex */
public final class y7h0 {
    public static final SimpleDateFormat a = new SimpleDateFormat("HH:mm", Locale.ENGLISH);

    public static final String a(long j) {
        StringBuilder sb = new StringBuilder();
        String j2 = pvo0.j(j, false, false);
        if (j2.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = j2.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? ro.p(charAt, Locale.getDefault()) : String.valueOf(charAt)));
            sb2.append(j2.substring(1));
            j2 = sb2.toString();
        }
        sb.append(j2);
        sb.append(", ");
        sb.append(a.format(Long.valueOf(j)));
        return sb.toString();
    }
}

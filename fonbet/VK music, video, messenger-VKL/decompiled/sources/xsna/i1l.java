package xsna;

import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* loaded from: classes13.dex */
public final class i1l {
    public static String a(long j) {
        return l2r0.b("yMMMd", Locale.getDefault()).format(new Date(j));
    }
}

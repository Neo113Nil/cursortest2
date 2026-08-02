package xsna;

import java.util.List;

/* compiled from: UxpollsService.kt */
/* loaded from: classes6.dex */
public interface z5r0 {

    /* compiled from: UxpollsService.kt */
    public static final class a {
        public static /* synthetic */ xy2 a(z5r0 z5r0Var, long j, List list, String str, String str2, String str3, String str4, int i) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 16) != 0) {
                str3 = null;
            }
            if ((i & 32) != 0) {
                str4 = null;
            }
            return z5r0Var.a(j, list, str, str2, str3, str4);
        }
    }

    ufx a(long j, List list, String str, String str2, String str3, String str4);

    ufx b(long j, String str, String str2, String str3, List list);

    ufx c(long j, int i, String str, List list, String str2);

    ufx d(long j, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Integer num3, Integer num4, String str6, String str7, List list);
}

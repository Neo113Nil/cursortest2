package defpackage;

import java.util.List;

/* loaded from: classes15.dex */
public abstract class dc1 {
    public abstract int a(long j);

    public abstract List b(long j);

    public abstract long c(cc1 cc1Var);

    public void d(long j, String[] strArr) {
        a(j);
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            z83.e(Long.valueOf(c(new cc1(j, str))));
        }
    }
}

package xsna;

import java.util.Date;

/* compiled from: PostingPostponeDelegate.kt */
@ozl
/* loaded from: classes17.dex */
public interface ckc0 {
    static /* synthetic */ void c(ckc0 ckc0Var, Date date, Date date2, Date date3, int i) {
        if ((i & 2) != 0) {
            date2 = null;
        }
        if ((i & 4) != 0) {
            date3 = null;
        }
        ckc0Var.b(date, date2, date3);
    }

    void a(izs<? super Date, s3q0> izsVar);

    void b(Date date, Date date2, Date date3);
}

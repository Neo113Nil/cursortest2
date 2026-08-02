package xsna;

import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;

/* compiled from: PastCallDetailsDialogStateMapper.kt */
/* loaded from: classes7.dex */
public final class wo90 {
    public final jp90 a;
    public final com.vk.voip.b b;
    public final Calendar c = Calendar.getInstance();

    public wo90(jp90 jp90Var, gp90 gp90Var, lp90 lp90Var, ip90 ip90Var, uo90 uo90Var, com.vk.voip.b bVar) {
        this.a = jp90Var;
        this.b = bVar;
    }

    public final long a(a59 a59Var) {
        long j;
        a59.f b = a59Var.b();
        if (b instanceof a59.f.c) {
            j = ((a59.f.c) b).b;
        } else if (b instanceof a59.f.b) {
            j = ((a59.f.b) b).b;
        } else if (b instanceof a59.f.d) {
            j = ((a59.f.d) b).b;
        } else if (b instanceof a59.f.e) {
            j = ((a59.f.e) b).a;
        } else {
            if (!(b instanceof a59.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            j = ((a59.f.a) b).a;
        }
        Calendar calendar = this.c;
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.clear();
        return timeInMillis;
    }
}

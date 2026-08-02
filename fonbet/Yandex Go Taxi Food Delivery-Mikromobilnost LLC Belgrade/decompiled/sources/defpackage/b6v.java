package defpackage;

import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class b6v implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b6v(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        euz lambda$fromRawRes$1;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((cot) obj).b;
                Long a = workDatabase.T0().a("next_job_scheduler_id");
                int i3 = 0;
                int longValue = a != null ? (int) a.longValue() : 0;
                workDatabase.T0().b(new nle0("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                if (longValue < 0 || longValue > i2) {
                    workDatabase.T0().b(new nle0("next_job_scheduler_id", 1L));
                } else {
                    i3 = longValue;
                }
                return Integer.valueOf(i3);
            default:
                lambda$fromRawRes$1 = ((LottieAnimationView) obj).lambda$fromRawRes$1(i2);
                return lambda$fromRawRes$1;
        }
    }
}

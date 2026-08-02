package xsna;

import android.os.CountDownTimer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.yj20;

/* compiled from: MethodSelectorTimer.kt */
/* loaded from: classes3.dex */
public final class vk20 extends CountDownTimer {
    public List<? extends yj20> a;
    public final izs<List<? extends yj20>, s3q0> b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vk20(int i, List<? extends yj20> list, izs<? super List<? extends yj20>, s3q0> izsVar) {
        super(r0.toMillis(i), r0.toMillis(1L));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = list;
        this.b = izsVar;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        List<? extends yj20> list = this.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (Object obj : list) {
            if (obj instanceof yj20.c) {
                yj20.c cVar = (yj20.c) obj;
                if (cVar.h() > 0) {
                    obj = cVar.c(cVar.h() - 1);
                }
            }
            arrayList.add(obj);
        }
        this.a = arrayList;
        this.b.invoke(arrayList);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
    }
}

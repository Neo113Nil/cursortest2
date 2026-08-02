package xsna;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.uje0;
import xsna.vje0;

/* compiled from: PushMessageMapper.kt */
/* loaded from: classes5.dex */
public final class rje0 {
    public static final long a = TimeUnit.DAYS.toSeconds(28);
    public static final /* synthetic */ int b = 0;

    public static uje0 a(vje0 vje0Var, long j) {
        if (!(vje0Var instanceof vje0.b)) {
            if (!(vje0Var instanceof vje0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            vje0.a aVar = (vje0.a) vje0Var;
            return new uje0.a(aVar.a, aVar.b, aVar.c);
        }
        vje0.b bVar = (vje0.b) vje0Var;
        String str = bVar.a;
        String str2 = bVar.b;
        List<pje0> list = bVar.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (pje0 pje0Var : list) {
            Integer num = pje0Var.e;
            int intValue = (num == null && (num = pje0Var.d) == null) ? (int) a : num.intValue();
            arrayList.add(new eje0(pje0Var.a, pje0Var.b, pje0Var.c, pje0Var.d, intValue, (TimeUnit.SECONDS.toMillis(intValue) + System.currentTimeMillis()) - j, pje0Var.f, pje0Var.g, pje0Var.h, pje0Var.i));
        }
        return new uje0.b(str, str2, bVar.d, arrayList);
    }
}

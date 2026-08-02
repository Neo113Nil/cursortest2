package xsna;

import android.content.Context;
import java.util.Collections;

/* compiled from: StoryTemplatesHandler.kt */
/* loaded from: classes7.dex */
public final class tjm0 implements fhd0, lao0 {
    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        int i;
        Context context = fgxVar.e;
        String c = fgxVar.c("id");
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(c);
        } catch (Throwable unused) {
            i = 0;
        }
        b(i, context);
        blk.P(fgxVar).onSuccess();
    }

    public final void b(int i, Context context) {
        itg0.h(rsg0.W(yfb.x(new dxj0().b(Collections.singletonList(Integer.valueOf(i)))), 7).l(new a840(new hwi0(this, 10), 11)).m(asu0.a.d()), new ybv(context, 1), new oi40(24));
    }
}

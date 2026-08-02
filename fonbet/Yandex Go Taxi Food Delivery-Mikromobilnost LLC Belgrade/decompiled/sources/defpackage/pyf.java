package defpackage;

import android.content.Context;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class pyf implements xvf0 {
    public final /* synthetic */ int a;
    public final wwf b;

    public /* synthetic */ pyf(wwf wwfVar, int i) {
        this.a = i;
        this.b = wwfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        wwf wwfVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) wwfVar.a;
                q5z.h(context);
                return context;
            case 1:
                c cVar = (c) wwfVar.b;
                q5z.h(cVar);
                return cVar;
            default:
                uze0 uze0Var = (uze0) wwfVar.c;
                q5z.h(uze0Var);
                return uze0Var;
        }
    }
}

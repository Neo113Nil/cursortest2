package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.progressbar.SearchProgressBar;

/* loaded from: classes5.dex */
public final /* synthetic */ class m8p implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;

    public /* synthetic */ m8p(float f, long j, aif0 aif0Var) {
        this.b = f;
        this.c = j;
        this.w = aif0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.w;
        float f = this.b;
        switch (i) {
            case 0:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                k28 k28Var = c1yVar.a;
                if (((wf11) obj2).a) {
                    ldc ldcVar = new ldc(ldc.l);
                    long j = this.c;
                    qam.t(c1yVar, zoy0.A(scc.g(ldcVar, new ldc(ldc.b(j, 0.33f, 0.0f, 0.0f, 0.0f, 14)), new ldc(ldc.b(j, 0.66f, 0.0f, 0.0f, 0.0f, 14)), new ldc(j)), Float.intBitsToFloat((int) (k28Var.c() >> 32)) - f, Float.intBitsToFloat((int) (k28Var.c() >> 32)), 8), 0L, 0L, 0.0f, null, 0, HProv.PP_DELETE_SAVED_PASSWD);
                }
                return zy11.a;
            default:
                aif0 aif0Var = (aif0) obj2;
                SearchProgressBar searchProgressBar = new SearchProgressBar((Context) obj, null, 0, 6, null);
                searchProgressBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                searchProgressBar.setCornerRadius(f);
                searchProgressBar.setColor(rzo.X(this.c));
                searchProgressBar.setDuration(aif0Var.d, aif0Var.c);
                searchProgressBar.start(true);
                return searchProgressBar;
        }
    }

    public /* synthetic */ m8p(wf11 wf11Var, long j, float f) {
        this.w = wf11Var;
        this.c = j;
        this.b = f;
    }
}

package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import xsna.h120;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rv implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rv(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                fw fwVar = (fw) this.c;
                com.vk.core.view.components.spinner.c cVar = (com.vk.core.view.components.spinner.c) this.d;
                Context context = fwVar.a.i0.getContext();
                cmf0.d(context, cVar.getWindow(), j03.g(context, (Throwable) obj, R.string.error), false, iah0.a(88), true);
                qv20.b(cVar);
                break;
            case 1:
                ((wck) this.c).c((tck) this.d);
                break;
            default:
                h120 h120Var = (h120) this.c;
                String str = (String) this.d;
                h120.a aVar = (h120.a) obj;
                String str2 = aVar.b;
                if (str2 != null && str2.length() != 0) {
                    h120Var.a(aVar, str);
                    break;
                }
                break;
        }
    }
}

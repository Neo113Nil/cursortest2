package xsna;

import com.vkontakte.android.MainActivity;
import xsna.h2i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xfl implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xfl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((kal) obj2).invoke(obj);
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj2;
                h2i0 h2i0Var = (h2i0) obj;
                String str = MainActivity.P;
                if (!(h2i0Var instanceof h2i0.a)) {
                    if (h2i0Var instanceof h2i0.b) {
                        edw edwVar = edw.a;
                        edw.f(mainActivity);
                        break;
                    }
                } else {
                    edw edwVar2 = edw.a;
                    edw.a();
                    break;
                }
                break;
        }
    }
}

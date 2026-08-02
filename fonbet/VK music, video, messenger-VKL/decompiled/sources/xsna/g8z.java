package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.utils.recyclerview.LinearLayoutManagerScrollHelper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g8z implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g8z(LinearLayoutManagerScrollHelper linearLayoutManagerScrollHelper, int i, f8z f8zVar) {
        this.d = linearLayoutManagerScrollHelper;
        this.c = i;
        this.e = f8zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                LinearLayoutManagerScrollHelper linearLayoutManagerScrollHelper = (LinearLayoutManagerScrollHelper) this.d;
                f8z f8zVar = (f8z) this.e;
                int v = linearLayoutManagerScrollHelper.b().v();
                int x = linearLayoutManagerScrollHelper.b().x();
                int i = this.c;
                if (v <= i && i <= x) {
                    f8zVar.invoke();
                    break;
                } else {
                    linearLayoutManagerScrollHelper.a.post(new g8z(linearLayoutManagerScrollHelper, i, f8zVar));
                    break;
                }
            default:
                wc60 wc60Var = (wc60) this.d;
                int i2 = wc60.b((RecyclerView) this.e) == 0 ? -1 : this.c;
                if (i2 == -1) {
                    wc60Var.d();
                    break;
                } else {
                    wc60Var.h = i2;
                    vhs vhsVar = wc60Var.i;
                    if (vhsVar != null) {
                        vhsVar.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g8z(wc60 wc60Var, RecyclerView recyclerView, int i) {
        this.d = wc60Var;
        this.e = recyclerView;
        this.c = i;
    }
}

package xsna;

import android.view.View;
import xsna.m5u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b6u implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b6u(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                sop sopVar = (sop) this.c;
                p5u p5uVar = ((d6u) this.d).o;
                if (p5uVar == null) {
                    p5uVar = null;
                }
                sopVar.invoke(new m5u.m(p5uVar.b));
                break;
            default:
                av90 av90Var = (av90) this.c;
                View.OnClickListener onClickListener = (View.OnClickListener) this.d;
                av90Var.b(0, 0);
                onClickListener.onClick(view);
                break;
        }
    }
}

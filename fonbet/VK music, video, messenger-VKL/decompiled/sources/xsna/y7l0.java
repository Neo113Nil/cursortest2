package xsna;

import android.view.View;
import com.vk.common.links.LaunchContext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y7l0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7l0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                a8l0 a8l0Var = (a8l0) this.c;
                x1l0 x1l0Var = (x1l0) this.d;
                a8l0Var.itemView.performHapticFeedback(0);
                a8l0Var.l.b(x1l0Var);
                break;
            default:
                ezp0 ezp0Var = (ezp0) this.c;
                String str = (String) this.d;
                LaunchContext.a aVar = new LaunchContext.a();
                aVar.n = ezp0Var.c.c;
                maz.c(ezp0Var.a.a.b(), view.getContext(), str, aVar.a(), null, null, 24);
                break;
        }
    }
}

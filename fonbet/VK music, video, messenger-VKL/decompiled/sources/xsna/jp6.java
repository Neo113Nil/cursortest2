package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.log.L;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.ybp0;

/* compiled from: BaseTopshelfView.kt */
/* loaded from: classes16.dex */
public abstract class jp6 implements vcp0 {
    public final boolean a;
    public Object b = EmptyList.b;
    public ConstraintLayout c;

    public jp6(boolean z) {
        this.a = z;
    }

    public final void c(vbp0 vbp0Var, izs izsVar) {
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null) {
            L.i(new NullPointerException("container is null. Probably invocation before onCreateView"));
            return;
        }
        constraintLayout.addView(vbp0Var.getView());
        this.b = j5g.v0(vbp0Var, (Collection) this.b);
        if (izsVar != null) {
            izsVar.invoke(vbp0Var);
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public abstract void d(ConstraintLayout constraintLayout);

    @Override // xsna.vcp0
    public void onDestroyView() {
        this.c = null;
        Iterator it = ((Iterable) this.b).iterator();
        while (it.hasNext()) {
            ((vbp0) it.next()).destroy();
        }
        this.b = EmptyList.b;
    }

    @Override // xsna.vcp0
    public void a(boolean z) {
    }

    @Override // xsna.vcp0
    public void b(ybp0.c cVar) {
    }
}

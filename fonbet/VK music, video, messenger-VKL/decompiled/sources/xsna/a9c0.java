package xsna;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import xsna.d5c0;

/* compiled from: PostView.kt */
/* loaded from: classes4.dex */
public final class a9c0 implements bq60 {
    public final /* synthetic */ y8c0 a;

    public a9c0(y8c0 y8c0Var) {
        this.a = y8c0Var;
    }

    @Override // xsna.bq60
    public final void a(yo60 yo60Var) {
        s2c0 s2c0Var = (s2c0) this.a.x.getValue();
        d5c0.a aVar = new d5c0.a(yo60Var);
        r1c0 a = ((y8c0) s2c0Var.a.c).a();
        t2c0 t2c0Var = a.k;
        FragmentImpl fragmentImpl = ((y8c0) s2c0Var.b.c).c;
        Activity invoke = s2c0Var.c.invoke();
        RecyclerView invoke2 = s2c0Var.d.invoke();
        t2c0Var.getClass();
        t2c0.a(a, fragmentImpl, invoke, invoke2, aVar);
    }
}

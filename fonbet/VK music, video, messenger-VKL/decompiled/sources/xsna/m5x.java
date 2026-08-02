package xsna;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import xsna.b5x;
import xsna.c63;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class m5x extends c63.b {
    public final /* synthetic */ b5x.c b;
    public final /* synthetic */ q5x c;

    public m5x(b5x.c cVar, q5x q5xVar) {
        this.b = cVar;
        this.c = q5xVar;
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        FragmentManager supportFragmentManager;
        c63 c63Var = c63.a;
        c63.c(this);
        n5x n5xVar = new n5x(activity, this.b, this.c);
        if (j5x.y) {
            return;
        }
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
            return;
        }
        j5x j5xVar = new j5x(n5xVar);
        j5xVar.u = false;
        j5xVar.v = true;
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.r = true;
        aVar.f(0, j5xVar, "InspectorDialogFragment", 1);
        aVar.l();
    }
}

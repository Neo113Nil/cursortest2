package yads;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes10.dex */
public abstract class kx3 extends AsyncTask {
    public bx3 a;
    public final jx3 b;

    public kx3(jx3 jx3Var) {
        this.b = jx3Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        bx3 bx3Var = this.a;
        if (bx3Var != null) {
            qx3 qx3Var = (qx3) bx3Var;
            qx3Var.c = null;
            qx3Var.a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}

package defpackage;

import android.util.ArrayMap;
import androidx.concurrent.futures.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes10.dex */
public final class hm7 extends uo7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public hm7() {
        this.a = 0;
        this.b = new HashSet();
        this.c = new ArrayMap();
    }

    @Override // defpackage.uo7
    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    uo7 uo7Var = (uo7) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(uo7Var)).execute(new xm2(uo7Var, i, 2));
                    } catch (RejectedExecutionException e) {
                        sgb1.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                    }
                }
                break;
        }
    }

    @Override // defpackage.uo7
    public final void b(int i, ap7 ap7Var) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    uo7 uo7Var = (uo7) it.next();
                    try {
                        ((Executor) ((ArrayMap) obj).get(uo7Var)).execute(new z50(uo7Var, i, ap7Var, 2));
                    } catch (RejectedExecutionException e) {
                        sgb1.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                    }
                }
                break;
            default:
                ((b) obj2).b(null);
                ((ar7) obj).f(this);
                break;
        }
    }

    @Override // defpackage.uo7
    public void c(int i, xo7 xo7Var) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    uo7 uo7Var = (uo7) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(uo7Var)).execute(new z50(uo7Var, i, xo7Var, 1));
                    } catch (RejectedExecutionException e) {
                        sgb1.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                    }
                }
                break;
        }
    }

    public hm7(b bVar, ar7 ar7Var) {
        this.a = 1;
        this.b = bVar;
        this.c = ar7Var;
    }
}

package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class pk20 implements t7v {
    public static final Size f = new Size(480, 360);
    public final ArrayList a;
    public final int b;
    public final ot7 c;
    public final Executor d;
    public Matrix e;

    public pk20(List list, Executor executor, ot7 ot7Var) {
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                this.a = new ArrayList(list);
                this.b = 1;
                this.c = ot7Var;
                this.d = executor;
                new kdv().a = true;
                return;
            }
            if (((t9j) it.next()).Q2() == 7) {
                z = false;
            }
            cvw.d("Segmentation only works with COORDINATE_SYSTEM_ORIGINAL", z);
        }
    }

    @Override // defpackage.t7v
    public final void a(Matrix matrix) {
        if (matrix == null) {
            this.e = null;
        } else {
            this.e = new Matrix(matrix);
        }
    }

    @Override // defpackage.t7v
    public final Size b() {
        Iterator it = this.a.iterator();
        Size size = f;
        Size size2 = size;
        while (it.hasNext()) {
            int Q2 = ((t9j) it.next()).Q2();
            Size size3 = (Q2 == 1 || Q2 == 4) ? new Size(1280, 720) : size;
            if (size3.getWidth() * size3.getHeight() > size2.getHeight() * size2.getWidth()) {
                size2 = size3;
            }
        }
        return size2;
    }

    @Override // defpackage.t7v
    public final int c() {
        return this.b;
    }

    @Override // defpackage.t7v
    public final void d(x4r0 x4r0Var) {
        dav davVar = x4r0Var.x;
        Matrix matrix = new Matrix();
        int i = this.b;
        if (i != 0) {
            Matrix matrix2 = this.e;
            if (i != 2 && matrix2 == null) {
                sgb1.g(3, "MlKitAnalyzer");
                x4r0Var.close();
                return;
            }
            Matrix matrix3 = new Matrix(davVar.c());
            RectF rectF = new RectF(0.0f, 0.0f, x4r0Var.z, x4r0Var.A);
            int e = davVar.e();
            RectF rectF2 = lw01.a;
            d6z.m("Invalid rotation degrees: " + e, e % 90 == 0);
            matrix3.postConcat(lw01.a(rectF, lw01.d(lw01.k(e)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF, davVar.e(), false));
            matrix3.invert(matrix);
            if (i != 2) {
                matrix.postConcat(matrix2);
            }
        }
        e(x4r0Var, 0, matrix, new HashMap(), new HashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final x4r0 x4r0Var, final int i, final Matrix matrix, final HashMap hashMap, final HashMap hashMap2) {
        Image f2 = x4r0Var.b.f();
        if (f2 == null) {
            sgb1.d("MlKitAnalyzer", "Image is null.");
            x4r0Var.close();
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        Executor executor = this.d;
        if (i > size) {
            x4r0Var.close();
            executor.execute(new l9(this, hashMap, x4r0Var, hashMap2, 16));
            return;
        }
        final t9j t9jVar = (t9j) arrayList.get(i);
        int e = x4r0Var.x.e();
        try {
            hv20 hv20Var = (hv20) t9jVar;
            hv20Var.getClass();
            cvw.d("Only YUV_420_888 is supported now", f2.getFormat() == 35);
            hv20Var.c(xzv.c(f2, e, matrix)).c(executor, new wx60() { // from class: nk20
                @Override // defpackage.wx60
                public final void onComplete(Task task) {
                    boolean m = task.m();
                    HashMap hashMap3 = hashMap2;
                    t9j t9jVar2 = t9jVar;
                    HashMap hashMap4 = hashMap;
                    if (m) {
                        hashMap3.put(t9jVar2, new CancellationException("The task is canceled."));
                    } else if (task.o()) {
                        hashMap4.put(t9jVar2, task.k());
                    } else {
                        hashMap3.put(t9jVar2, task.j());
                    }
                    pk20.this.e(x4r0Var, i + 1, matrix, hashMap4, hashMap3);
                }
            });
        } catch (Exception e2) {
            hashMap2.put(t9jVar, new RuntimeException("Failed to process the image.", e2));
            e(x4r0Var, i + 1, matrix, hashMap, hashMap2);
        }
    }
}

package xsna;

import android.graphics.Bitmap;
import kotlin.NoWhenBranchMatchedException;
import xsna.fio;
import xsna.hio;
import xsna.yho;

/* compiled from: DrawEditStore.kt */
/* loaded from: classes4.dex */
public final class iio extends owx<hio, yho, fio, Object> {
    public final void a(yho yhoVar) {
        boolean z = yhoVar instanceof tho;
        z9 z9Var = this.a;
        if (z) {
            z9Var.d(new aio(((tho) yhoVar).b));
            return;
        }
        if (yhoVar instanceof uho) {
            uho uhoVar = (uho) yhoVar;
            z9Var.d(new bio(uhoVar.b, uhoVar.c));
            return;
        }
        if (yhoVar instanceof vho) {
            z9Var.d(new cio());
            return;
        }
        if (yhoVar instanceof who) {
            z9Var.d(new dio(((who) yhoVar).b));
            return;
        }
        if (yhoVar instanceof xho) {
            z9Var.d(new eio(((xho) yhoVar).b));
            return;
        }
        if (yhoVar.equals(d02.p)) {
            b(fio.a.C2876a.a);
            return;
        }
        if (yhoVar.equals(k9q0.c)) {
            b(fio.a.b.a);
            return;
        }
        if (yhoVar instanceof zho) {
            z9Var.d(new fio.a.c(((zho) yhoVar).b));
            return;
        }
        if (yhoVar.equals(yho.c.b)) {
            z9Var.d(fio.f.a);
        } else if (yhoVar.equals(yho.b.b)) {
            z9Var.d(fio.d.a);
        } else {
            if (!(yhoVar instanceof yho.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z9Var.d(new fio.b(((yho.a) yhoVar).b));
        }
    }

    public final void b(fio.a aVar) {
        Bitmap bitmap;
        hio.a aVar2 = ((hio) this.b.b.getValue()).i;
        if ((aVar2 instanceof hio.a.d) && (bitmap = ((hio.a.d) aVar2).a) != null) {
            bitmap.recycle();
        }
        this.a.d(aVar);
    }
}

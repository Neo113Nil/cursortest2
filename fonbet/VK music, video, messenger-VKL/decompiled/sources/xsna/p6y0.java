package xsna;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.NonNull;
import xsna.if9;
import xsna.re9;
import xsna.ub9;

/* compiled from: ZoomControl.java */
/* loaded from: classes11.dex */
public final class p6y0 {
    public final re9 a;
    public final tli0 b;
    public final f7y0 c;
    public final ug50<e7y0> d;

    @NonNull
    public final b e;
    public boolean f = false;

    /* compiled from: ZoomControl.java */
    public class a implements re9.c {
        public a() {
        }

        @Override // xsna.re9.c
        public final boolean a(@NonNull TotalCaptureResult totalCaptureResult) {
            p6y0.this.e.a(totalCaptureResult);
            return false;
        }
    }

    /* compiled from: ZoomControl.java */
    public interface b {
        void a(@NonNull TotalCaptureResult totalCaptureResult);

        float b();

        float c();

        void d();

        @NonNull
        Rect e();

        void f(@NonNull if9.a aVar);

        void g(float f, @NonNull ub9.a<Void> aVar);
    }

    public p6y0(@NonNull re9 re9Var, @NonNull tg9 tg9Var, @NonNull tli0 tli0Var) {
        b cikVar;
        CameraCharacteristics.Key key;
        a aVar = new a();
        this.a = re9Var;
        this.b = tli0Var;
        if (Build.VERSION.SDK_INT >= 30) {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            if (tg9Var.a(key) != null) {
                cikVar = new yb2(tg9Var);
                this.e = cikVar;
                f7y0 f7y0Var = new f7y0(cikVar.c(), cikVar.b());
                this.c = f7y0Var;
                f7y0Var.e(1.0f);
                this.d = new ug50<>(spw.e(f7y0Var));
                re9Var.b.a.add(aVar);
            }
        }
        cikVar = new cik(tg9Var);
        this.e = cikVar;
        f7y0 f7y0Var2 = new f7y0(cikVar.c(), cikVar.b());
        this.c = f7y0Var2;
        f7y0Var2.e(1.0f);
        this.d = new ug50<>(spw.e(f7y0Var2));
        re9Var.b.a.add(aVar);
    }

    public final void a(vm5 vm5Var) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        ug50<e7y0> ug50Var = this.d;
        if (myLooper == mainLooper) {
            ug50Var.k(vm5Var);
        } else {
            ug50Var.i(vm5Var);
        }
    }
}

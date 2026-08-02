package xsna;

import android.os.Build;
import xsna.p52;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class o52 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ o52(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fh50<p52> fh50Var = p52.R0;
                synchronized (fh50Var) {
                    try {
                        int i = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = fh50Var.a;
                            int i2 = fh50Var.b;
                            while (i < i2) {
                                p52 p52Var = (p52) objArr[i];
                                boolean showLayoutBounds = p52Var.getShowLayoutBounds();
                                Class<?> cls = p52.O0;
                                p52Var.setShowLayoutBounds(p52.a.a());
                                if (showLayoutBounds != p52Var.getShowLayoutBounds()) {
                                    p52Var.post(new xw1(p52Var, 1));
                                }
                                i++;
                            }
                        } else {
                            Object[] objArr2 = fh50Var.a;
                            int i3 = fh50Var.b;
                            while (i < i3) {
                                p52 p52Var2 = (p52) objArr2[i];
                                p52Var2.post(new sj1(p52Var2, 1));
                                i++;
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                com.vk.utils.log.a.b();
                wjy.a.getClass();
                wjy.b().c();
                return;
        }
    }
}

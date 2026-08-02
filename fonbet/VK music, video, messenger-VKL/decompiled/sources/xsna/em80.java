package xsna;

import android.util.Log;
import androidx.media3.exoplayer.offline.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class em80 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ em80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [xsna.fm80] */
    @Override // java.lang.Runnable
    public final void run() {
        o7o o7oVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                final gm80 gm80Var = (gm80) obj;
                gm80Var.e();
                if (gm80Var.d()) {
                    a.C0060a g = ((androidx.media3.exoplayer.offline.c) gm80Var.g.getValue()).b.g(new int[0]);
                    while (g.moveToNext()) {
                        try {
                            try {
                                o7oVar = g.m();
                            } catch (IllegalStateException e) {
                                Log.e("OneVideoMigration", mnh0.A(e));
                                o7oVar = null;
                            }
                            if (o7oVar != null) {
                                gm80Var.g(o7oVar, new izs() { // from class: xsna.fm80
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj2) {
                                        i0q0.j(new rm3(4, gm80.this, (o7o) obj2));
                                        return s3q0.a;
                                    }
                                });
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ro.e(g, th);
                                throw th2;
                            }
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    g.close();
                    return;
                }
                return;
            default:
                ((gzs) obj).invoke();
                return;
        }
    }
}

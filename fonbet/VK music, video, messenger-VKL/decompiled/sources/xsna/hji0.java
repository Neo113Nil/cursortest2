package xsna;

import android.os.Handler;
import android.util.Log;

/* compiled from: SendTask.kt */
/* loaded from: classes11.dex */
public abstract class hji0 implements Runnable {
    public final boolean b;
    public final long c;
    public final izs<Boolean, s3q0> d;
    public lcn e;

    /* JADX WARN: Multi-variable type inference failed */
    public hji0(boolean z, long j, izs<? super Boolean, s3q0> izsVar) {
        this.b = z;
        this.c = j;
        this.d = izsVar;
    }

    public final void a() {
        lcn lcnVar = this.e;
        if (lcnVar != null) {
            Handler handler = (Handler) lcnVar.a;
            long j = this.c;
            try {
                if (j <= 0) {
                    handler.post(this);
                } else {
                    handler.postDelayed(this, j);
                }
            } catch (Exception e) {
                Log.e("StatLog:", "post task failure", e);
            }
        }
    }
}

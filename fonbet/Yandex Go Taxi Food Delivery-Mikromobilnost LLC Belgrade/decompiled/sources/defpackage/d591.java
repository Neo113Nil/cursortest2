package defpackage;

import com.google.android.gms.tasks.zzw;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public final class d591 implements t070, iy60, sx60 {
    public boolean A;
    public final Object a = new Object();
    public final int b;
    public final zzw c;
    public int w;
    public int x;
    public int y;
    public Exception z;

    public d591(int i, zzw zzwVar) {
        this.b = i;
        this.c = zzwVar;
    }

    public final void a() {
        int i = this.w;
        int i2 = this.x;
        int i3 = i + i2 + this.y;
        int i4 = this.b;
        if (i3 == i4) {
            Exception exc = this.z;
            zzw zzwVar = this.c;
            if (exc == null) {
                if (this.A) {
                    zzwVar.t();
                    return;
                } else {
                    zzwVar.s(null);
                    return;
                }
            }
            zzwVar.r(new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.z));
        }
    }

    @Override // defpackage.sx60
    public final void onCanceled() {
        synchronized (this.a) {
            this.y++;
            this.A = true;
            a();
        }
    }

    @Override // defpackage.iy60
    public final void onFailure(Exception exc) {
        synchronized (this.a) {
            this.x++;
            this.z = exc;
            a();
        }
    }

    @Override // defpackage.t070
    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.w++;
            a();
        }
    }
}

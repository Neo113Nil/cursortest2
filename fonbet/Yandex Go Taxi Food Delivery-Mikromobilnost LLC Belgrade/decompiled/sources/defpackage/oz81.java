package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes11.dex */
public final class oz81 extends py81 {
    public final atx0 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oz81(luy luyVar, atx0 atx0Var) {
        this(4, atx0Var);
        this.c = 1;
        this.d = luyVar;
    }

    private final /* bridge */ /* synthetic */ void i(rx81 rx81Var, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(rx81 rx81Var, boolean z) {
    }

    @Override // defpackage.vz81
    public final void a(Status status) {
        this.b.b(new ApiException(status));
    }

    @Override // defpackage.vz81
    public final void b(Exception exc) {
        this.b.b(exc);
    }

    @Override // defpackage.vz81
    public final void c(jy81 jy81Var) {
        try {
            h(jy81Var);
        } catch (DeadObjectException e) {
            a(vz81.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(vz81.e(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    @Override // defpackage.vz81
    public final /* bridge */ /* synthetic */ void d(rx81 rx81Var, boolean z) {
        int i = this.c;
    }

    @Override // defpackage.py81
    public final boolean f(jy81 jy81Var) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((xy81) obj).a.c;
            default:
                xy81 xy81Var = (xy81) jy81Var.y.get((luy) obj);
                return xy81Var != null && xy81Var.a.c;
        }
    }

    @Override // defpackage.py81
    public final Feature[] g(jy81 jy81Var) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((xy81) obj).a.b;
            default:
                xy81 xy81Var = (xy81) jy81Var.y.get((luy) obj);
                if (xy81Var == null) {
                    return null;
                }
                return xy81Var.a.b;
        }
    }

    public final void h(jy81 jy81Var) {
        switch (this.c) {
            case 0:
                ((xy81) this.d).a.c(jy81Var.b, this.b);
                luy luyVar = ((xy81) this.d).a.a.c;
                if (luyVar != null) {
                    jy81Var.y.put(luyVar, (xy81) this.d);
                    break;
                }
                break;
            default:
                atx0 atx0Var = this.b;
                xy81 xy81Var = (xy81) jy81Var.y.remove((luy) this.d);
                if (xy81Var == null) {
                    atx0Var.c(Boolean.FALSE);
                    break;
                } else {
                    ((pui0) ((zy81) xy81Var.b).b.d).accept(jy81Var.b, atx0Var);
                    xy81Var.a.a.a();
                    break;
                }
        }
    }

    public oz81(int i, atx0 atx0Var) {
        super(i);
        this.b = atx0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oz81(xy81 xy81Var, atx0 atx0Var) {
        this(3, atx0Var);
        this.c = 0;
        this.d = xy81Var;
    }
}

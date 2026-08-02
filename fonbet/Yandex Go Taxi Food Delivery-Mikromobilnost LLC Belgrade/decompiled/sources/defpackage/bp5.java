package defpackage;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.messaging.core.net.NetworkException;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import java.io.IOException;
import kotlin.Result;
import kotlinx.coroutines.a;
import yads.jk3;

/* loaded from: classes15.dex */
public final class bp5 implements BidderTokenLoadListener, al7, zub0, at21, ho3, iy60, wx60, wu7, w1k0, fj81, wf81 {
    public final j18 a;

    public /* synthetic */ bp5(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        j18 j18Var = this.a;
        if (a.p(j18Var.x)) {
            j18Var.resumeWith(new myj0(obj));
        }
    }

    @Override // defpackage.fj81
    public void a(Object obj) {
        this.a.resumeWith((byte[]) obj);
    }

    public void b() {
        this.a.resumeWith(zy11.a);
    }

    @Override // defpackage.ho3
    /* renamed from: c, reason: collision with other method in class */
    public boolean mo103c(int i) {
        j18 j18Var = this.a;
        if (!a.p(j18Var.x)) {
            return true;
        }
        j18Var.resumeWith(new iyj0(new qn2(i)));
        return true;
    }

    @Override // defpackage.wu7
    public void d() {
        this.a.resumeWith(Boolean.FALSE);
    }

    @Override // defpackage.at21
    /* renamed from: e */
    public x08 mo25e(cl21 cl21Var) {
        j18 j18Var = this.a;
        if (j18Var.t() instanceof mf60) {
            yi3 yi3Var = (yi3) ((d9g) cl21Var).e.get();
            z83.g(null, yi3Var.c, Looper.myLooper());
            j18Var.resumeWith(yi3Var.B);
        }
        return wfz.z;
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        this.a.resumeWith(null);
    }

    @Override // defpackage.wu7
    public void k(TaxiOrder taxiOrder) {
        this.a.resumeWith(Boolean.TRUE);
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        Exception j = task.j();
        j18 j18Var = this.a;
        if (j != null) {
            j18Var.resumeWith(new Result.Failure(j));
        } else if (task.m()) {
            j18Var.b(null);
        } else {
            j18Var.resumeWith(task.k());
        }
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        j18 j18Var = this.a;
        if (j18Var.t() instanceof a28) {
            return;
        }
        j18Var.resumeWith(new Result.Failure(iOException));
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        j18 j18Var = this.a;
        try {
            rvj0 rvj0Var = kvj0Var.z;
            byte[] bytes = rvj0Var != null ? rvj0Var.bytes() : null;
            if (!kvj0Var.J) {
                j18Var.resumeWith(new Result.Failure(new IOException("Invalid response " + kvj0Var.w)));
            } else if (bytes == null) {
                j18Var.resumeWith(new Result.Failure(new IOException("No data")));
            } else {
                j18Var.resumeWith(bytes);
            }
        } catch (Exception e) {
            j18Var.resumeWith(new Result.Failure(e));
        }
    }

    @Override // defpackage.zub0
    public void success() {
        this.a.resumeWith(new Result(zy11.a));
    }

    @Override // defpackage.w1k0
    public void a() {
        this.a.resumeWith(zy11.a);
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        j18 j18Var = this.a;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(null);
        }
    }

    @Override // defpackage.zub0
    public void c(int i) {
        this.a.resumeWith(new Result(new Result.Failure(new NetworkException(i))));
    }
}

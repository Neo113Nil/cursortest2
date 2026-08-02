package defpackage;

import android.graphics.Bitmap;
import androidx.credentials.exceptions.GetCredentialException;
import com.yandex.messaging.core.net.entities.YaDiskErrorInfo;
import java.io.IOException;
import java.util.Map;
import kotlin.Result;
import kotlinx.coroutines.a;

/* loaded from: classes15.dex */
public final class kde implements c9f, iy60, at21, al7, lh51, lg51, wb71 {
    public final /* synthetic */ int a;
    public final j18 b;

    public /* synthetic */ kde(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // defpackage.wb71
    public void a(Map map) {
        this.b.resumeWith(new ff71(map));
    }

    @Override // defpackage.lh51
    public void b() {
        j18 j18Var = this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(zy11.a);
        }
    }

    @Override // defpackage.c9f
    public void c(Object obj) {
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        j18 j18Var = this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new Result.Failure(getCredentialException));
        }
    }

    @Override // defpackage.lg51
    public void d(Throwable th) {
        this.b.resumeWith(new Result.Failure(th));
    }

    @Override // defpackage.at21
    /* renamed from: e */
    public x08 mo25e(cl21 cl21Var) {
        j18 j18Var = this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(((d9g) cl21Var).a.a);
        }
        return wfz.z;
    }

    @Override // defpackage.lg51
    public void f() {
        this.b.resumeWith(zy11.a);
    }

    public void g(Object obj) {
        int i = this.a;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (a.p(j18Var.x)) {
                    j18Var.resumeWith(new myj0(obj));
                    break;
                }
                break;
        }
    }

    public void h(Object obj) {
        int i = this.a;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(Boolean.FALSE);
                    break;
                }
                break;
            default:
                YaDiskErrorInfo yaDiskErrorInfo = (YaDiskErrorInfo) obj;
                if (a.p(j18Var.x)) {
                    j18Var.resumeWith(new iyj0(yaDiskErrorInfo));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wb71
    public void l(Bitmap bitmap, String str) {
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        j18 j18Var = this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(null);
        }
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        try {
            this.b.resumeWith(zy11.a);
            kvj0Var.close();
        } finally {
        }
    }

    @Override // defpackage.c9f
    public void onResult(Object obj) {
        s5t s5tVar = (s5t) obj;
        j18 j18Var = this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(s5tVar);
        }
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        this.b.resumeWith(new Result.Failure(iOException));
    }
}

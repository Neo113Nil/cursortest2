package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Result;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.Response;

/* loaded from: classes15.dex */
public final class mc3 implements p2r, c9f, g3v0, iy60, yk7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ mc3(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // defpackage.p2r
    public void a(k2r k2rVar) {
        this.b.resumeWith(k2rVar.a);
    }

    @Override // defpackage.p2r
    public void b(i2r i2rVar) {
    }

    @Override // defpackage.c9f
    public void c(Object obj) {
        CreateCredentialException createCredentialException = (CreateCredentialException) obj;
        j18 j18Var = this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new Result.Failure(createCredentialException));
        }
    }

    @Override // defpackage.g3v0
    public void i() {
        this.b.resumeWith(Boolean.TRUE);
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        this.b.resumeWith(new Result.Failure(th));
    }

    @Override // defpackage.g3v0
    public void n() {
        this.b.resumeWith(Boolean.FALSE);
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        boolean z = response.a.J;
        j18 j18Var = this.b;
        if (z) {
            j18Var.resumeWith(response.b);
        } else {
            j18Var.resumeWith(new Result.Failure(new HttpException(response)));
        }
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        int i = this.a;
        j18 j18Var = this.b;
        switch (i) {
            case 3:
                j18Var.resumeWith(new Result.Failure(exc));
                break;
            default:
                j18Var.E(null, null);
                break;
        }
    }

    @Override // defpackage.c9f
    public void onResult(Object obj) {
        g4f g4fVar = (g4f) obj;
        j18 j18Var = this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(g4fVar);
        }
    }
}

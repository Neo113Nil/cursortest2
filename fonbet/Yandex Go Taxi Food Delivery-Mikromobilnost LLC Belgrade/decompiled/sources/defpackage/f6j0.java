package defpackage;

import com.yandex.fintechsdk.core.network.api.exception.NetworkException;
import java.io.IOException;
import kotlin.Result;

/* loaded from: classes12.dex */
public final class f6j0 implements al7 {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ v4j0 b;

    public f6j0(j18 j18Var, v4j0 v4j0Var) {
        this.a = j18Var;
        this.b = v4j0Var;
    }

    @Override // defpackage.al7
    public final void onFailure(yf7 yf7Var, IOException iOException) {
        this.a.resumeWith(new Result.Failure(new NetworkException.OkHttpCommonException(this.b.d(), iOException.getMessage())));
    }

    @Override // defpackage.al7
    public final void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        this.a.resumeWith(kvj0Var);
    }
}

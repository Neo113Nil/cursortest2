package coil3.network;

import defpackage.oyr;
import defpackage.oz50;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Loz50;", "response", "Loz50;", "a", "()Loz50;", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpException extends RuntimeException {
    private final oz50 response;

    public HttpException(oz50 oz50Var) {
        super(oyr.i(oz50Var.a, "HTTP "));
        this.response = oz50Var;
    }

    /* renamed from: a, reason: from getter */
    public final oz50 getResponse() {
        return this.response;
    }
}

package coil.network;

import defpackage.kvj0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lkvj0;", "response", "Lkvj0;", "getResponse", "()Lkvj0;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HttpException extends RuntimeException {
    private final kvj0 response;

    public HttpException(kvj0 kvj0Var) {
        super("HTTP " + kvj0Var.w + Extension.COLON_SPACE + kvj0Var.c);
        this.response = kvj0Var;
    }
}

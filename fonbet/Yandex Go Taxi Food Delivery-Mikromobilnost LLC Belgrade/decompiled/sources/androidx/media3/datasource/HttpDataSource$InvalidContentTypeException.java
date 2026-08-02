package androidx.media3.datasource;

import defpackage.g8e;
import defpackage.npg;

/* loaded from: classes10.dex */
public final class HttpDataSource$InvalidContentTypeException extends HttpDataSource$HttpDataSourceException {
    public final String contentType;

    public HttpDataSource$InvalidContentTypeException(String str, npg npgVar) {
        super(g8e.o("Invalid content type: ", str), npgVar, 2003);
        this.contentType = str;
    }
}

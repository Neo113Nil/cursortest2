package androidx.media3.datasource;

import defpackage.npg;
import defpackage.oyr;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, npg npgVar, byte[] bArr) {
        super(oyr.i(i, "Response code: "), dataSourceException, npgVar, 2004);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}

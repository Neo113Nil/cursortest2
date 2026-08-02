package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;

/* loaded from: classes4.dex */
public final class c70 extends x3 {
    public final URI c;
    public final boolean w;

    public c70(qwu qwuVar, URI uri, boolean z) {
        super(1, qwuVar);
        this.c = uri;
        this.w = z;
    }

    public final Object Ug(String str, String str2, ContinuationImpl continuationImpl) {
        HttpsMethod httpsMethod = HttpsMethod.GET;
        if (this.w) {
            URI uri = new URI(str);
            int port = uri.getPort();
            int port2 = this.c.getPort();
            if (port == -1 && port2 != -1 && port != port2) {
                uri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), port2, uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            str = uri.toString();
        }
        axu axuVar = new axu(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            linkedHashMap3.put("Cookie", Collections.singletonList(str2));
        }
        return ((qwu) this.b).d(new xwu(httpsMethod, axuVar, linkedHashMap, linkedHashMap2, linkedHashMap3, null, arrayList), continuationImpl);
    }
}

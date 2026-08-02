package com.yandex.passport.internal.network.client;

import defpackage.kvj0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$createTrackWithUid$1 extends FunctionReferenceImpl implements tls {
    public static final BackendClient$createTrackWithUid$1 b = new BackendClient$createTrackWithUid$1(1, 0, com.yandex.passport.internal.network.a.class, "parseTrackWithUidResponse", "parseTrackWithUidResponse(Lokhttp3/Response;)Ljava/lang/String;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        JSONObject b2 = com.yandex.passport.internal.network.a.b((kvj0) obj);
        com.yandex.passport.internal.network.a.h(b2);
        return b2.getString("track_id");
    }
}

package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4738bm implements NetworkResponseHandler {
    public final C4918im a;
    public final C4874h3 b;

    public C4738bm() {
        this(new C4918im(), new C4874h3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5048nm handle(@NonNull ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, Http.Header.CONTENT_ENCODING) : null;
            if (!vo.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C4918im c4918im = this.a;
                c4918im.getClass();
                C5048nm c5048nm = new C5048nm();
                try {
                    c4918im.h.getClass();
                    C5140rb c5140rb = new C5140rb(new String(responseData, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
                    JSONObject optJSONObject = c5140rb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c5048nm.h = str2;
                    c5048nm.i = str;
                    c4918im.a(c5048nm, c5140rb);
                    c5048nm.a = TextUtils.isEmpty(c5048nm.i) ? 1 : 2;
                } catch (Throwable unused) {
                    c5048nm = new C5048nm();
                    c5048nm.a = 1;
                }
                if (2 == c5048nm.a) {
                    return c5048nm;
                }
            }
        }
        return null;
    }

    public C4738bm(C4918im c4918im, C4874h3 c4874h3) {
        this.a = c4918im;
        this.b = c4874h3;
    }
}

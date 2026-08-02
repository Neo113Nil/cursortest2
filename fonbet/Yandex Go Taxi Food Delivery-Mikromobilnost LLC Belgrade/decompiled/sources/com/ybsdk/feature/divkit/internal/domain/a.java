package com.ybsdk.feature.divkit.internal.domain;

import android.net.Uri;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.EnumJsonAdapter;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.core.common.data.network.adapters.RawJsonStringAdapter;
import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;
import defpackage.c7l;
import defpackage.evu0;
import defpackage.g2b;
import defpackage.g8e;
import defpackage.j0g;
import defpackage.lhj;
import defpackage.qnh;
import defpackage.sd90;
import defpackage.snk;
import defpackage.tje;
import defpackage.tnk;
import defpackage.u4o;
import defpackage.ur51;
import defpackage.w4o;
import defpackage.z3k;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public static final DownloadPayloadJsonAdapter c = new DownloadPayloadJsonAdapter(new Moshi.Builder().add(RawJsonStringAdapter.a).add(HmacData.KeyType.class, EnumJsonAdapter.create(HmacData.KeyType.class).withUnknownFallback(HmacData.KeyType.UNKNOWN)).add(HmacData.Item.Type.class, EnumJsonAdapter.create(HmacData.Item.Type.class).withUnknownFallback(HmacData.Item.Type.UNKNOWN)).build());
    public final c7l a;
    public final b b;

    public a(c7l c7lVar, b bVar) {
        this.a = c7lVar;
        this.b = bVar;
    }

    public static DownloadPayload b(JSONObject jSONObject, Div2View div2View) {
        DownloadPayload fromJson;
        String valueOf = String.valueOf(jSONObject);
        if (evu0.y(valueOf, "@{", false)) {
            jSONObject = (JSONObject) new com.yandex.div.json.expressions.a("payload", valueOf, new lhj(13), new z3k(12), ur51.c, new qnh(23), null).a(div2View.getExpressionResolver());
        }
        return (jSONObject == null || (fromJson = c.fromJson(jSONObject.toString())) == null) ? new DownloadPayload(null, null, null, false, null, null, 63, null) : fromJson;
    }

    public final boolean a(Uri uri, tnk tnkVar, DownloadPayload downloadPayload, Div2View div2View) {
        String l = sd90.l(uri, "url");
        if (l == null) {
            return false;
        }
        w4o w4oVar = (w4o) ((j0g) this.a).a;
        u4o u4oVar = u4o.d;
        if (w4oVar.equals(u4oVar)) {
            w4oVar.equals(u4oVar);
            String S = evu0.S("/", "http://10.0.2.2:3001/");
            Uri parse = Uri.parse(l);
            String path = parse.getPath();
            String query = parse.getQuery();
            if (query == null) {
                query = "";
            }
            l = g8e.p(S, path, query);
        }
        String str = l;
        snk snkVar = new snk(tnkVar, div2View);
        Boolean isPollingRequest = downloadPayload.isPollingRequest();
        String logId = div2View.getLogId();
        b bVar = this.b;
        div2View.addLoadReference(new g2b(3, tje.N(bVar.x, null, null, new DivDownloader$download$job$1(isPollingRequest, bVar, str, downloadPayload, snkVar, logId, null), 3)), div2View);
        return true;
    }
}

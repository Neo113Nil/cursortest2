package defpackage;

import android.content.Context;
import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kycesia.api.EsiaInfoEntity;
import com.ybsdk.feature.kycesia.internal.domain.b;
import com.ybsdk.feature.kycesia.internal.screens.sdk.OpenEsiaSdkParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class f570 extends uc5 {
    public final OpenEsiaSdkParams B;
    public final Context C;
    public final tfl0 D;
    public final AppAnalyticsReporter E;
    public final b F;
    public boolean G;

    public f570(OpenEsiaSdkParams openEsiaSdkParams, Context context, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, b bVar, jbo jboVar, k570 k570Var) {
        super(new oi60(28), k570Var);
        this.B = openEsiaSdkParams;
        this.C = context;
        this.D = tfl0Var;
        this.E = appAnalyticsReporter;
        this.F = bVar;
        appAnalyticsReporter.s0.a.a("esia_app2app.open", null);
    }

    public final void b0() {
        if (this.G) {
            this.D.e();
        } else {
            this.G = true;
            c0();
        }
    }

    public final void c0() {
        Object failure;
        Uri parse;
        try {
            failure = Boolean.valueOf(this.C.getPackageManager().getPackageInfo("ru.rostel", 0) != null);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        rt1 rt1Var = this.E.s0;
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Boolean bool = (Boolean) failure;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("esia_app_installed", Boolean.valueOf(booleanValue));
        rt1Var.a.a("esia_app2app.go", linkedHashMap);
        EsiaInfoEntity info = this.B.getInfo();
        if (info instanceof EsiaInfoEntity.Link) {
            parse = Uri.parse(((EsiaInfoEntity.Link) info).getUrl());
        } else {
            if (!(info instanceof EsiaInfoEntity.LinkParts)) {
                w511.b();
                return;
            }
            EsiaInfoEntity.LinkParts linkParts = (EsiaInfoEntity.LinkParts) info;
            String apiUrlOverride = linkParts.getApiUrlOverride();
            if (apiUrlOverride == null) {
                apiUrlOverride = "https://esia.gosuslugi.ru/";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(apiUrlOverride.concat("aas/delegate?"));
            sb.append("client_id=" + linkParts.getClientId());
            sb.append("&client_secret=" + linkParts.getClientSecret());
            sb.append("&redirect_uri=" + Uri.encode(linkParts.getRedirectUri()));
            sb.append("&scope=".concat(cvu0.v(linkParts.getScope(), " ", "+", false)));
            sb.append("&response_type=code");
            sb.append("&state=" + linkParts.getState());
            sb.append("&timestamp=".concat(cvu0.v(cvu0.v(linkParts.getTimestamp(), "+", "%2B", false), " ", "+", false)));
            for (Map.Entry<String, String> entry : linkParts.getAdditionalParams().entrySet()) {
                sb.append("&" + entry.getKey() + "=" + entry.getValue());
            }
            parse = Uri.parse(sb.toString());
        }
        Z(new e570(new b0p(parse, false)));
    }

    public final void d0(Uri uri) {
        this.F.a(uri, new iu30(23, uri, this));
    }
}

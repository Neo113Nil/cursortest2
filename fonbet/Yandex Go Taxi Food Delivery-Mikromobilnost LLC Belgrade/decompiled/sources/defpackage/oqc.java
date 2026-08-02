package defpackage;

import android.content.Intent;
import android.net.Uri;
import defpackage.hvz;
import defpackage.iez;
import defpackage.jl40;
import defpackage.og21;
import defpackage.pqc;
import defpackage.vqb;
import java.util.List;
import java.util.Locale;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.web.view.clients.TaxiWebViewClient;

/* loaded from: classes12.dex */
public final /* synthetic */ class oqc implements em41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oqc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.em41
    public final TaxiWebViewClient a(final boolean z, final boolean z2, final f fVar, final List list) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final pqc pqcVar = (pqc) obj2;
                final sls slsVar = (sls) obj;
                return new TaxiWebViewClient(z, z2, fVar, list) { // from class: com.yandex.go.support.web.factory.CommonSupportWebViewClientFactory$create$1$1
                    @Override // ru.yandex.taxi.web.CommonWebViewClient, ru.yandex.taxi.fragment.common.BaseWebViewClient
                    public boolean shouldOverrideUrlLoading(String url) {
                        Uri parse = Uri.parse(url);
                        if (!pqcVar.b.a(parse)) {
                            String scheme = parse.getScheme();
                            return (scheme == null || !og21.a.contains(scheme.toLowerCase(Locale.US))) ? super.shouldOverrideUrlLoading(parse.buildUpon().appendQueryParameter("use_external_browser", "1").appendQueryParameter("dont_close_app", "1").build().toString()) : super.shouldOverrideUrlLoading(url);
                        }
                        slsVar.invoke();
                        pqc pqcVar2 = pqcVar;
                        pqcVar2.getClass();
                        pqcVar2.b.b(new Intent("android.intent.action.VIEW", parse), new vqb(11, pqcVar2));
                        return true;
                    }
                };
            default:
                final hvz hvzVar = (hvz) obj2;
                final gvz gvzVar = (gvz) obj;
                return new TaxiWebViewClient(z, z2, fVar, list) { // from class: com.yandex.go.loyalty.impl.loyalty.program.auth.LoyaltyProgramAuthRouter$createWebViewClient$1
                    @Override // ru.yandex.taxi.web.CommonWebViewClient, ru.yandex.taxi.fragment.common.BaseWebViewClient
                    public boolean shouldOverrideUrlLoading(String url) {
                        Uri parse = Uri.parse(url);
                        Uri parse2 = Uri.parse(gvzVar.b);
                        if (!jl40.l(parse.getHost(), parse2.getHost()) || !jl40.l(parse.getScheme(), parse2.getScheme())) {
                            return super.shouldOverrideUrlLoading(url);
                        }
                        hvz hvzVar2 = hvzVar;
                        hvzVar2.getClass();
                        if (jl40.l(Uri.parse(url).getQueryParameter(ACSPConstants.STATUS), "success")) {
                            hvzVar2.r(new iez(3));
                            return true;
                        }
                        hvzVar2.r(new iez(4));
                        return true;
                    }
                };
        }
    }
}

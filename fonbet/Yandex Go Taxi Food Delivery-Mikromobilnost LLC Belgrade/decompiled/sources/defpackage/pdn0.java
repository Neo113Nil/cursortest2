package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes.dex */
public final class pdn0 implements h0h {
    public static final pdn0 a = new pdn0();

    @Override // defpackage.h0h
    public final String a() {
        return "scooters";
    }

    @Override // defpackage.h0h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final odn0 d(Uri uri) {
        if (!b(uri)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("number");
        String queryParameter2 = uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR);
        String queryParameter3 = uri.getQueryParameter("end-lat");
        Double i = queryParameter3 != null ? avu0.i(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("end-lon");
        Double i2 = queryParameter4 != null ? avu0.i(queryParameter4) : null;
        List<String> queryParameters = uri.getQueryParameters("scooters_source");
        if (queryParameters == null) {
            queryParameters = EmptyList.a;
        }
        List<String> list = queryParameters;
        String queryParameter5 = uri.getQueryParameter("scooters_campaign");
        String queryParameter6 = uri.getQueryParameter("source");
        String queryParameter7 = uri.getQueryParameter("success_completion_radius_m");
        return new odn0(uri, queryParameter, queryParameter2, i, i2, list, queryParameter5, queryParameter6, queryParameter7 != null ? bvu0.l(10, queryParameter7) : null, uri.getQueryParameter("multimodal_offer_id"));
    }
}

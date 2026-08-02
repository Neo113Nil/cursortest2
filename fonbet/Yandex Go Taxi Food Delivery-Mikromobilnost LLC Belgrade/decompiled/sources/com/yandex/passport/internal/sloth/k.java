package com.yandex.passport.internal.sloth;

import android.content.Context;
import android.net.Uri;
import com.yandex.passport.R;
import defpackage.scc;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class k {
    public final Context a;
    public final boolean b;
    public final List c;
    public final Map d;

    public k(Context context, com.yandex.passport.internal.properties.p pVar) {
        this.a = context;
        this.b = TariffOrderFlow.ORDER_FLOW_TAXI_KEY.equalsIgnoreCase(context.getString(R.string.passport_use_eula_agreement));
        this.c = scc.g(com.yandex.passport.legacy.d.d(context, pVar, true), com.yandex.passport.legacy.d.e(context, pVar, true));
        this.d = kotlin.collections.b.i(new Pair(SlothEulaSupport$TextKey.UserAgreementUrl, com.yandex.passport.legacy.d.d(context, pVar, false)), new Pair(SlothEulaSupport$TextKey.PrivacyPolicyUrl, com.yandex.passport.legacy.d.e(context, pVar, false)), new Pair(SlothEulaSupport$TextKey.TaxiAgreementUrl, context.getString(R.string.passport_eula_taxi_agreement_url_override)));
    }

    public static Uri a(Uri uri) {
        Locale locale = Locale.US;
        Uri.Builder builder = new Uri.Builder();
        String scheme = uri.getScheme();
        Uri.Builder scheme2 = builder.scheme(scheme != null ? scheme.toLowerCase(locale) : null);
        String authority = uri.getAuthority();
        Uri.Builder authority2 = scheme2.authority(authority != null ? authority.toLowerCase(locale) : null);
        String path = uri.getPath();
        Uri.Builder path2 = authority2.path(path != null ? path.toLowerCase(locale) : null);
        String query = uri.getQuery();
        Uri.Builder query2 = path2.query(query != null ? query.toLowerCase(locale) : null);
        String encodedQuery = uri.getEncodedQuery();
        Uri.Builder encodedQuery2 = query2.encodedQuery(encodedQuery != null ? encodedQuery.toLowerCase(locale) : null);
        String fragment = uri.getFragment();
        return encodedQuery2.fragment(fragment != null ? fragment.toLowerCase(locale) : null).build();
    }
}

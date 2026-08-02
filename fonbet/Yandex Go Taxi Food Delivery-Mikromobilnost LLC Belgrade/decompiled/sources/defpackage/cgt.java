package defpackage;

import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class cgt extends v4j0 {
    public final Map b;
    public final String c;
    public final RestMethod d;
    public final String e;
    public final String f;

    public cgt(String str, String str2, Map map) {
        super(new iws(4));
        this.b = map;
        this.c = str;
        this.d = RestMethod.POST;
        this.e = "get_widget";
        this.f = "v2/widget/".concat(str2);
    }

    @Override // defpackage.v4j0
    public final c a() {
        kdx kdxVar = new kdx();
        for (Map.Entry entry : this.b.entrySet()) {
            abb1.d(kdxVar, (String) entry.getKey(), (String) entry.getValue());
        }
        return kdxVar.a();
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.d;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.e;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.f;
    }

    @Override // defpackage.v4j0
    public final Map f() {
        return b.i(new Pair(Header.AcceptLanguage.getKey(), Locale.getDefault().getLanguage()), new Pair(Header.DivkitVersion.getKey(), this.c));
    }
}

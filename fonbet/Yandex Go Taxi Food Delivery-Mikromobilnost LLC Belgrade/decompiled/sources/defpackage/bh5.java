package defpackage;

import com.yandex.fintechsdk.core.network.api.model.Header;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class bh5 implements ah5 {
    public final hk3 a;
    public final g25 b;
    public final abe c;

    public bh5(hk3 hk3Var, g25 g25Var, abe abeVar) {
        this.a = hk3Var;
        this.b = g25Var;
        this.c = abeVar;
    }

    @Override // defpackage.ah5
    public final MapBuilder getHeaders() {
        ek ekVar;
        String language = Locale.getDefault().getLanguage();
        Object value = this.a.c.a.getValue();
        String str = null;
        qk3 qk3Var = value instanceof qk3 ? (qk3) value : null;
        if (qk3Var != null && (ekVar = qk3Var.a) != null) {
            str = ekVar.a;
        }
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(this.b.getHeaders());
        mapBuilder.put(Header.AcceptLanguage.getKey(), language);
        mapBuilder.put(Header.Accept.getKey(), "application/json");
        mapBuilder.put(Header.ContentType.getKey(), "application/json");
        mapBuilder.put(Header.UserAgent.getKey(), this.c.d());
        if (str != null) {
            mapBuilder.put(Header.Authorization.getKey(), String.format("OAuth %s", Arrays.copyOf(new Object[]{str}, 1)));
        }
        return mapBuilder.j();
    }
}

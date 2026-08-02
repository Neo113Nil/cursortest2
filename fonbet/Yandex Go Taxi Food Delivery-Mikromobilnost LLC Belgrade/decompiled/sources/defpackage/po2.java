package defpackage;

import com.apollographql.apollo3.api.http.b;
import com.apollographql.apollo3.network.http.c;
import com.apollographql.apollo3.network.ws.a;
import com.apollographql.apollo3.network.ws.d;
import com.apollographql.apollo3.network.ws.e;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class po2 {
    public final vkf a = new vkf();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ovn d = ovn.a;
    public String e;
    public tch f;
    public Boolean g;

    public po2() {
        mdh mdhVar = vyj.a;
    }

    public final qo2 a() {
        x160 eVar;
        if (this.e == null) {
            ny61.r("Apollo: 'serverUrl' is required");
            return null;
        }
        rvu rvuVar = new rvu();
        rvuVar.a = this.e;
        tch tchVar = this.f;
        if (tchVar != null) {
            rvuVar.b = tchVar;
        }
        Boolean bool = this.g;
        if (bool != null) {
            rvuVar.d = bool.booleanValue();
        }
        ArrayList arrayList = rvuVar.c;
        arrayList.clear();
        arrayList.addAll(this.c);
        String str = rvuVar.a;
        b bVar = str != null ? new b(str) : null;
        if (bVar == null) {
            ny61.r("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
            return null;
        }
        tch tchVar2 = rvuVar.b;
        if (tchVar2 == null) {
            OkHttpClient.a aVar = new OkHttpClient.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.b(60000L, timeUnit);
            aVar.g(60000L, timeUnit);
            tchVar2 = new tch(new OkHttpClient(aVar));
        }
        c cVar = new c(bVar, tchVar2, arrayList, rvuVar.d);
        String str2 = this.e;
        if (str2 == null) {
            eVar = cVar;
        } else {
            d dVar = new d();
            dVar.a(str2);
            tls tlsVar = dVar.a;
            if (tlsVar == null) {
                ny61.r("No serverUrl specified");
                return null;
            }
            eVar = new e(tlsVar, dVar.b, new a(), 60000L, new com.apollographql.apollo3.network.ws.b(0));
        }
        return new qo2(cVar, this.a.a(), eVar, kotlin.collections.a.m0(EmptyList.a, this.b), this.d);
    }
}

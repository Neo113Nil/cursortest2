package xsna;

import android.util.LruCache;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: RecommendedPacksRepository.kt */
/* loaded from: classes6.dex */
public final class rdf0 {
    public final LruCache<String, cbf0> a = new LruCache<>(20);

    public final cbf0 a(String str) {
        return this.a.get(str);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 b(String str, String str2) {
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        return str2 == null ? rsg0.y0(new mil0(str), null, null, 3).E(new y730(new ij8(27, this, str), 10), lVar, kVar, kVar) : rsg0.y0(new mil0(str2), null, null, 3).E(new jsv(new j20(23, this, str), 21), lVar, kVar, kVar);
    }
}

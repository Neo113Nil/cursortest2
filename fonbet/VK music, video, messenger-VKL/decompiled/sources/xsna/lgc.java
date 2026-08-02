package xsna;

import android.os.Bundle;

/* compiled from: ClassifiedsCatalogSearchRequestFactory.kt */
/* loaded from: classes18.dex */
public abstract class lgc extends com.vk.catalog2.common.dto.api.a {
    public String s;

    /* compiled from: ClassifiedsCatalogSearchRequestFactory.kt */
    public static final class a {
        public final kca a;

        public a(kca kcaVar) {
            this.a = kcaVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lgc(wba wbaVar, a aVar, Bundle bundle) {
        super(wbaVar, r5, r12 == null ? "" : r12, null, bundle, 8);
        gzs g13Var = aVar == null ? new g13(7) : new kgc(0, aVar.a, kca.class, "loadRecentQueries", "loadRecentQueries()Lio/reactivex/rxjava3/core/Single;", 0);
        String str = aVar != null ? "local_block_id" : null;
    }

    @Override // com.vk.catalog2.common.dto.api.a
    public final io.reactivex.rxjava3.core.x<hda> p(String str) {
        r(str);
        Bundle bundle = (Bundle) this.b;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.s = str;
        return s(bundle, str);
    }

    public void r(String str) {
        Bundle bundle;
        String str2 = this.s;
        if (str2 == null || epx.f(str, str2)) {
            return;
        }
        Bundle bundle2 = (Bundle) this.b;
        if (bundle2 == null) {
            bundle = null;
        } else {
            bundle2.remove("key_category_ids");
            bundle = new Bundle(bundle2);
        }
        this.b = bundle;
    }

    public abstract io.reactivex.rxjava3.core.x s(Bundle bundle, String str);
}

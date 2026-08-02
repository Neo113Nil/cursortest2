package xsna;

import android.content.Context;
import android.os.Trace;
import com.vk.search.params.api.City;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CityListItemProvider.kt */
/* loaded from: classes5.dex */
public final class oec implements jph0, d1u {
    public boolean b;
    public final Object c;
    public final Serializable d;

    public oec(Context context, boolean z, Integer num) {
        this.c = context;
        this.b = z;
        this.d = num;
    }

    @Override // xsna.d1u
    public Object get() {
        if (this.b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(ndp0.f("Glide registry"));
        this.b = true;
        try {
            return orf0.a((com.bumptech.glide.a) this.c, (ArrayList) this.d);
        } finally {
            this.b = false;
            Trace.endSection();
        }
    }

    @Override // xsna.jph0
    public hfz h(boolean z, cph0 cph0Var, int i) {
        return null;
    }

    @Override // xsna.jph0
    public hfz n(int i, Object obj, boolean z) {
        City city = (City) obj;
        int i2 = city.b;
        String str = city.c;
        String str2 = city.e;
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        String str3 = city.d;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        List I = rl3.I(new String[]{str2, str3});
        return new iph0(i2, str, ((ArrayList) I).isEmpty() ? null : j5g.g0(I, ", ", null, null, 0, null, 62), z, i);
    }

    @Override // xsna.jph0
    public hfz o(boolean z) {
        if (!this.b) {
            return null;
        }
        Integer num = (Integer) this.d;
        return new iph0(Integer.MIN_VALUE, ((Context) this.c).getString(num != null ? num.intValue() : R.string.search_params_any_city_title), null, z, -1);
    }

    public oec(com.bumptech.glide.a aVar, ArrayList arrayList, k43 k43Var) {
        this.c = aVar;
        this.d = arrayList;
    }
}

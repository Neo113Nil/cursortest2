package xsna;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: utils.kt */
/* loaded from: classes17.dex */
public final class x3r0 {
    public static final fxj0 a(List<? extends fxj0> list) {
        if (list == null) {
            return null;
        }
        List<? extends fxj0> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (mcr0.p(((fxj0) obj).getUrl())) {
                arrayList.add(obj);
            }
        }
        fxj0 b = ixj0.b(arrayList);
        return b == null ? ixj0.m(list2) : b;
    }

    public static final fxj0 b(List<? extends fxj0> list, int i, int i2, gzs<Boolean> gzsVar, boolean z) {
        List<? extends fxj0> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        sr10 sr10Var = dy2.a;
        if (!(sr10Var != null ? sr10Var.c() : true) && !gzsVar.invoke().booleanValue()) {
            return a(list);
        }
        if (!z) {
            return ixj0.b(list);
        }
        List<? extends fxj0> list3 = list;
        fxj0 c = ixj0.c(list3, i, i2);
        return c == null ? ixj0.b(list3) : c;
    }

    public static final ImageRequestBuilder c(fxj0 fxj0Var, int i, int i2, boolean z) {
        x9g0 x9g0Var = null;
        if (fxj0Var == null) {
            return null;
        }
        Uri parse = Uri.parse(fxj0Var.getUrl());
        ImageRequestBuilder h = ImageRequestBuilder.h(parse);
        h.f = new q0v0(liw.a(), null, parse);
        if (z) {
            if (fxj0Var.e6() / (i * i2) >= 1.3f && i > 0 && i2 > 0) {
                x9g0Var = new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, 12);
            }
            h.d = x9g0Var;
        }
        return h;
    }
}

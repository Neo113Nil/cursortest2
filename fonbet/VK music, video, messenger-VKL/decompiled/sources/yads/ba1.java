package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import xsna.drm0;
import xsna.gzs;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class ba1 extends Lambda implements gzs {
    public static final ba1 b = new ba1();

    public ba1() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Lazy lazy = ca1.a;
        List c0 = drm0.c0("adsdk.yandex.ru,yandex.ru", new String[]{StringUtils.COMMA}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c0) {
            if (!drm0.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        Lazy lazy2 = ca1.a;
        return j5g.v0("yandex.com/ads", arrayList);
    }
}
